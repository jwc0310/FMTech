package parknshop.parknshopapp;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import parknshop.parknshopapp.Adapter.GroceryChooseListAdapter;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.EventUpdate.GroceryChooseListAdapterOnItemClickEvent;
import parknshop.parknshopapp.EventUpdate.WishListUpdatedEvent;
import parknshop.parknshopapp.Fragment.Account.LoginFragment;
import parknshop.parknshopapp.Fragment.Home.ScanSearchActivity;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.Fragment.Splash.SplashFragment;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.Rest.event.AddNewWishListResponseEvent;
import parknshop.parknshopapp.Rest.event.AddProductToWishListResponseEvent;
import parknshop.parknshopapp.Rest.event.AddWishListResponseEvent;
import parknshop.parknshopapp.Rest.event.BarcodeScanResponseEvent;
import parknshop.parknshopapp.Rest.event.RemoveProductFromWishListResponseEvent;
import parknshop.parknshopapp.Rest.event.UpdateWishListResponseEvent;
import parknshop.parknshopapp.Rest.event.WishListResponseEvent;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.Utils.Utils;

/**
 * Created by chrisyu on 11/3/16.
 */

public class OneActivity extends BaseActivity {

    public ArrayList<WishListResponse> dialogGrocerySelectedCategories;
    int apiCall = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SplashFragment fragment = new SplashFragment();
        Bundle bundle = new Bundle();
        String gotoPage = getIntent().getStringExtra("goTo");
        String gotoPagePK = getIntent().getStringExtra("PK");
        if(!TextUtils.isEmpty(gotoPage) && !TextUtils.isEmpty(gotoPagePK)){
            bundle.putString("goTo", gotoPage);
            bundle.putString("PK", gotoPagePK);
            fragment.setArguments(bundle);
        }
        placeFragment(fragment);
    }
    
    public void addToWishList(Product product, int selectPos){
        if(GlobalConstant.isLogin){
            WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);
            if(wishListResponses != null && wishListResponses.length > 0){
                LogUtil.info("", "wishListResponseEvent1:"+wishListResponses.length);
                LogUtil.info("", "wishListResponseEvent2:"+wishListResponses[0].getName());
                ArrayList<WishListResponse> categoryProducts = new ArrayList<>();
                for(WishListResponse wishListResponse:wishListResponses){
                    categoryProducts.add(wishListResponse);
                }
                LogUtil.info("", "wishListResponseEvent3:"+categoryProducts.size());
                ChooseWishListDialog(OneActivity.this, categoryProducts, product, selectPos);
            } else {
                // popup to ask the user to create a new list
                addWishListDialog(OneActivity.this, product);
            }
        } else {
//            ToastUtils.show(this, getString(R.string.grocery_list_not_yet_login));
            LoginFragment loginFragment = new LoginFragment();
            Bundle bundle = new Bundle();
            bundle.putString("from", "backPreviousPage");
            loginFragment.setArguments(bundle);
            placeFragmentWithBackStack(loginFragment);
        }
    }

    // Click wishlist
    public void onEvent(WishListResponseEvent wishListResponseEvent) {
        hideLoadingView();
        hideProgressDialog();

        if(wishListResponseEvent.getSuccess()) {
            // save the grocery list
            Hawk.put(AppUtils.grocery_list, wishListResponseEvent.getWishListResponses() );

            ArrayList<String> simpleGroceryList = new ArrayList<String>();
            ArrayList<String> simpleGroceryListPk = new ArrayList();

            for(WishListResponse wishListResponse : wishListResponseEvent.getWishListResponses() ) {
                for(WishListResponse.Entry entry : wishListResponse.getEntries()) {
                    simpleGroceryList.add(entry.getProduct().code);
                    //simpleGroceryListPk.add()
                }
            }

            Hawk.put(AppUtils.simple_grocery_list, simpleGroceryList);

            if(wishListResponseEvent.getProduct() != null && wishListResponseEvent.getShowDialog()){  // for pop up grocery list dialog only
                addToWishList(wishListResponseEvent.getProduct(), 0); // default select the first list
            }

            // Post a Event to ask the current page the latest wish list has been updated, have to update UI/ refresh list
//            if(wishListResponseEvent.isUpdateUI()){
            MyApplication.getInstance().mBus.post(new WishListUpdatedEvent());
//            }
            //showProgressDialog();
            WebServiceModel.getInstance(this).requestGetCart(this);
        }
    }

    public void ChooseWishListDialog(final Context context, ArrayList<WishListResponse> categoryProducts, final Product product, int selectPos) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.dialog_choose_item, null);
        final Dialog mDialog = new Dialog(context);
        ListView lvChoose = (ListView) layout.findViewById(R.id.lvChoose);
        TextView btnCancel = (TextView) layout.findViewById(R.id.btnCancel);
        TextView btnOK = (TextView) layout.findViewById(R.id.btnOK);
        TextView btnAddNewList = (TextView) layout.findViewById(R.id.btnAddNewList);

        if(categoryProducts.size() > 5){
            ViewGroup.LayoutParams params = lvChoose.getLayoutParams();
            params.height = Utils.dpToPxHeight(350, this);
            lvChoose.setLayoutParams(params);
            lvChoose.requestLayout();
        }

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Map<Integer, Integer> localShoppingCart = new HashMap<>();
                localShoppingCart = Hawk.get(AppUtils.local_shopping_cart);
                int qty = 1; // default 1
                if(product != null && localShoppingCart != null){
                    if(localShoppingCart.get((product.getCode())) != null){
                        if(localShoppingCart.get((product.getCode())) > 0)
                            qty = localShoppingCart.get((product.getCode()));
                    }

                }
                // Should select one category first
                if(dialogGrocerySelectedCategories != null) {
                    mDialog.dismiss();

                    showProgressDialog();
                    for(int i = 0; i < dialogGrocerySelectedCategories.size(); i++){
                        WebServiceModel.getInstance(OneActivity.this).requestAddProductToWishList(OneActivity.this, qty, product, dialogGrocerySelectedCategories.get(i).getPrimaryKey());
                    }
                    dialogGrocerySelectedCategories = null;
                } else {
                    ToastUtils.show(OneActivity.this, "select category first");
                }
            }
        });

        btnAddNewList.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                mDialog.dismiss();
                addWishListDialog(OneActivity.this, product);
            }
        });

        final GroceryChooseListAdapter adapter = new GroceryChooseListAdapter(context, categoryProducts);
        lvChoose.setAdapter(adapter);
        if(selectPos > -1)
            adapter.setItemClick(selectPos);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(layout);
        mDialog.show();
    }

    public static void addWishListDialog(final Context context, final Product product) {
        oneActivity = ((BaseActivity)context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.dialog_create_new_list, null);
        final Dialog mDialog = new Dialog(context);
        TextView txtTitle = (TextView) layout.findViewById(R.id.txtTitle);
        final EditText edtName = (EditText) layout.findViewById(R.id.edtName);
        TextView btnCancel = (TextView) layout.findViewById(R.id.btnCancel);
        TextView btnCreate = (TextView) layout.findViewById(R.id.btnCreate);

        editTextGetFocus(txtTitle);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
            }
        });
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
                // Add new Wishlist
                ((BaseActivity)context).showLoadingView();
//                if(product == null){
                    // Create a new wish list
                    ((BaseActivity)context).showProgressDialog();
                    WebServiceModel.getInstance(context).requestAddNewWishList(context, edtName.getText().toString().trim(), product);
//                } else {
//                    // Add product and create new wish list
//                    ((BaseActivity)context).showProgressDialog();
//                    WebServiceModel.getInstance(context).requestAddProductWithNewWishList(context, product, edtName.getText().toString().trim());
//                }

            }
        });
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(layout);

        mDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                InputMethodManager imm = (InputMethodManager) getBaseActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(edtName, InputMethodManager.SHOW_IMPLICIT);
            }
        });

        mDialog.show();
    }

    public static BaseActivity oneActivity;
    public static BaseActivity getBaseActivity() {
        return oneActivity;
    }

    // Add new wishlist response
    public void onEvent(AddNewWishListResponseEvent addNewWishListResponseEvent) {
        hideLoadingView();
        hideProgressDialog();
        if(addNewWishListResponseEvent.getSuccess()) {
            // Added success
            if(addNewWishListResponseEvent.getProduct() != null)
                WebServiceModel.getInstance(OneActivity.this).requestGetWishList(OneActivity.this, "createList", addNewWishListResponseEvent.getProduct());
            else{
                WebServiceModel.getInstance(OneActivity.this).requestGetWishList(OneActivity.this, "createList", null);
            }
        } else {
            ToastUtils.show(OneActivity.this, addNewWishListResponseEvent.getMessage());
        }
    }

    // Add product with a new wishlist response
    public void onEvent(AddWishListResponseEvent addWishListResponseEvent) {
        hideLoadingView();
        apiCall++;

        if(addWishListResponseEvent.getSuccess()) {
            // Added success
            if(dialogGrocerySelectedCategories == null || dialogGrocerySelectedCategories.size() == 0 || apiCall == dialogGrocerySelectedCategories.size()) {
                WebServiceModel.getInstance(OneActivity.this).requestGetWishList(OneActivity.this, addWishListResponseEvent.getProduct(), "add", false);
                apiCall = 0;
            }
        }else{
            ToastUtils.show(OneActivity.this, addWishListResponseEvent.getMessage());
        }
    }

    // Dialog choose list on click event
    public void onEvent(GroceryChooseListAdapterOnItemClickEvent groceryChooseListAdapterOnItemClickEvent) {
        dialogGrocerySelectedCategories = groceryChooseListAdapterOnItemClickEvent.getWishListResponses();
    }

    public void onEvent(UpdateWishListResponseEvent updateWishListResponseEvent){
        if(updateWishListResponseEvent.getSuccess()){

        }else{
            ToastUtils.show(OneActivity.this, updateWishListResponseEvent.getMessage());
        }
    }

    public void onEvent(AddProductToWishListResponseEvent addProductToWishListResponseEvent){
        hideProgressDialog();
        if(addProductToWishListResponseEvent.getSuccess()){
            // Added success
            showProgressDialog();
            WebServiceModel.getInstance(OneActivity.this).requestGetWishList(OneActivity.this, "add", null);
        }else{
            ToastUtils.show(OneActivity.this, addProductToWishListResponseEvent.getMessage());
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case ScanSearchActivity.SCAN_REQUEST_CODE:
                    if (data != null) {
                        String scanCode = data.getExtras().getString(ScanSearchActivity.SCAN_CODE);
                        getScanBarcodeRequest(scanCode);
                        showProgressDialog();
                        LogUtil.info("", "brandnamr:"+scanCode);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public void getScanBarcodeRequest(String code) {
        WebServiceModel.getInstance(this).requestGetBarcodeScan(this, code);
    }

    public void onEvent(BarcodeScanResponseEvent barcodeScanResponseEvent){
        if(barcodeScanResponseEvent.getSuccess()){
            LogUtil.info("", "brandnamr:"+barcodeScanResponseEvent.getBarcodeScanResponse().getBrandName());


            ProductListFragment pf = ProductListFragment.newInstance((barcodeScanResponseEvent.getBarcodeScanResponse().getCode()), false);
            LogUtil.info("", "getGATagq1:"+barcodeScanResponseEvent.getBarcodeScanResponse().getName());
            pf.setGATag(barcodeScanResponseEvent.getBarcodeScanResponse().getName());
            placeFragmentWithBackStack(pf);

        }else{
            hideProgressDialog();
            ToastUtils.show(OneActivity.this, barcodeScanResponseEvent.getMessage());
        }
    }


    public void onEvent(RemoveProductFromWishListResponseEvent removeProductFromWishListResponseEvent){
        hideLoadingView();
        if(removeProductFromWishListResponseEvent.getSuccess()){
            WebServiceModel.getInstance(this).requestGetWishList(this, "remove", null);
        } else {
            ToastUtils.show(this, removeProductFromWishListResponseEvent.getMessage());
        }
    }
}
