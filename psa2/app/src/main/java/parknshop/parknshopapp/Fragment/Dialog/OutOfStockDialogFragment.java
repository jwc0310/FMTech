package parknshop.parknshopapp.Fragment.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.AddShoppingCartEvent;
import parknshop.parknshopapp.Rest.event.CheckoutDialogFragmentOnConfirmClickedEvent;
import parknshop.parknshopapp.View.CheckoutButton;
import parknshop.parknshopapp.View.ShoppingCartProductItem;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 7/4/16.
 */
public class OutOfStockDialogFragment extends DialogFragment {
    private ArrayList<CartResponse.Entry> outOfStockList = new ArrayList<>();
    private ArrayList<CartResponse.Entry> insufficientList = new ArrayList<>();
    public boolean allCantPurcharse;

    @Bind(R.id.out_of_stock_list) LinearLayout outOfStockListView;
    @Bind(R.id.insufficient_stock_list) LinearLayout insufficientListView;
    @Bind(R.id.confirmation) CheckoutButton checkoutConfirmation;

    @Override
    public void onResume() {
        super.onResume();
        //disableNavigationDrawer();
        MyApplication.getInstance().register(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        MyApplication.getInstance().unRegister(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null) {
        }
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.out_of_stock_dialog_fragment_layout, null);
        ButterKnife.bind(this, view);

        if(outOfStockList.size() > 0) {
            outOfStockListView.setVisibility(View.VISIBLE);
            for(int i = 0; i < outOfStockList.size(); i++) {
                ShoppingCartProductItem shoppingCartProductItem = new ShoppingCartProductItem(getActivity());
                shoppingCartProductItem.setProduct(outOfStockList.get(i).product);
                outOfStockListView.addView(shoppingCartProductItem);
            }
        }

        if(insufficientList.size() > 0) {
            insufficientListView.setVisibility(View.VISIBLE);
            for(int i = 0; i < insufficientList.size(); i++) {
                ShoppingCartProductItem shoppingCartProductItem = new ShoppingCartProductItem(getActivity());
                shoppingCartProductItem.setProduct(insufficientList.get(i).product);
                insufficientListView.addView(shoppingCartProductItem);
            }
        }

        builder.setView(view);
        return builder.create();
    }

    @Override
    public void onDismiss(final DialogInterface dialog) {
        //Fragment dialog had been dismissed
        super.onDismiss(dialog);
    }

    @OnClick (R.id.dismiss)
    public void dismissClick() {
        dismiss();
    }

    int networkCall = 0;
    int netWorkCallGot = 0;
    @OnClick (R.id.confirmation)
    public void confirmation() {
        if(allCantPurcharse) {
            checkoutConfirmation.title.setText(getResources().getString(R.string.check_out_back));
            dismiss();
            return;
        }

        networkCall = outOfStockList.size() + insufficientList.size();
        netWorkCallGot = 0;

        ArrayList<String> uniqueEntryNumber = new ArrayList<>();

        for(int i = 0; i < outOfStockList.size(); i++) {
            if(!uniqueEntryNumber.contains(outOfStockList.get(i).entryNumber)){
                uniqueEntryNumber.add(outOfStockList.get(i).entryNumber);
            }
        }

        for(int i = 0; i < insufficientList.size(); i++) {
            if(!uniqueEntryNumber.contains(insufficientList.get(i).entryNumber)){
                uniqueEntryNumber.add(insufficientList.get(i).entryNumber);
            }
        }

        //Log.i("yoyooy", "yoyoyoy" + uniqueEntryNumber.size());

        for(int i = 0; i < uniqueEntryNumber.size(); i++)
            WebServiceModel.getInstance(getActivity()).deleteShoppingCartEntry(uniqueEntryNumber.get(i), getActivity());


        //String entryId, int quantity, Context context
        for(int i = 0; i < insufficientList.size(); i++)
            WebServiceModel.getInstance(getActivity()).editShoppingCart(insufficientList.get(i).entryNumber, insufficientList.get(i).product.maxOrderQuantity, getActivity());

        ((BaseActivity)getActivity()).showProgressDialog();

        //Log.i("networkCall", "networkCall "+ networkCall + " " + netWorkCallGot);
    }

    public void onEvent(AddShoppingCartEvent event) {
        //netWorkCallGot++;
        //if(netWorkCallGot >= networkCall) {
            MyApplication.getInstance().mBus.post(new CheckoutDialogFragmentOnConfirmClickedEvent());
            dismiss();
        //}
    }

    public void setOutOfStockList(ArrayList<CartResponse.Entry> outOfStockList) {
        this.outOfStockList = outOfStockList;
    }

    public void setInsufficientList(ArrayList<CartResponse.Entry> insufficientList) {
        this.insufficientList = insufficientList;
    }
}
