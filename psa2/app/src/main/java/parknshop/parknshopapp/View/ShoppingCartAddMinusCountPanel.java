package parknshop.parknshopapp.View;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.AnimationHelper;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Dialog.NumpadFragment;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 22/3/16.
 */
public class ShoppingCartAddMinusCountPanel {
    public @Nullable @Bind(R.id.count) TextView countView;
    public @Nullable @Bind(R.id.add_plus_disable) View disableView;
    public @Nullable @Bind (R.id.add_to_cart_textview) TextView addToCartTextView;
    public @Nullable @Bind (R.id.disable) View disabledView;
    public @Nullable @Bind (R.id.edit_count) EditText editCount;

    CartResponse getCartResponse;
    View view;
    Product product;
    CartResponse.Entry entry;

    BaseActivity baseActivity;
    public boolean isProductDetailController = false;
    int successCode;

    public ShoppingCartAddMinusCountPanel(View view, Product product, BaseActivity baseActivity) {
        this.view = view;
        this.product = product;
        this.baseActivity = baseActivity;
        getCartResponse = Hawk.get(AppUtils.remote_shopping_cart);

        bind();
        setProduct(product);
    }

    public ShoppingCartAddMinusCountPanel(View view, Product product, BaseActivity baseActivity, boolean isProductDetailController) {
        this.view = view;
        this.product = product;
        this.baseActivity = baseActivity;
        this.isProductDetailController = isProductDetailController;
        getCartResponse = Hawk.get(AppUtils.remote_shopping_cart);

        bind();
        setProduct(product);
    }

    public ShoppingCartAddMinusCountPanel(View view, CartResponse.Entry entry, BaseActivity baseActivity) {
        this.view = view;
        this.entry = entry;
        this.product = entry.product;
        this.baseActivity = baseActivity;

        bind();
        setProduct(product);
    }

    List<CartResponse.Entry> cloneData;
    public ShoppingCartAddMinusCountPanel(View view, CartResponse.Entry entry, BaseActivity baseActivity, List<CartResponse.Entry> cloneData) {
        this.view = view;
        this.entry = entry;
        this.product = entry.product;
        this.baseActivity = baseActivity;
        this.cloneData = cloneData;

        bind();
        setProduct(product);
    }

    public ShoppingCartAddMinusCountPanel(View view, Product product, BaseActivity baseActivity, int successCode) {
        this.view = view;
        this.product = product;
        this.baseActivity = baseActivity;
        this.successCode = successCode;
        getCartResponse = Hawk.get(AppUtils.remote_shopping_cart);

        bind();
        setProduct(product);
    }

    View root;
    public void init(Context context) {
        root = LayoutInflater.from(context).inflate(R.layout.shopping_cart_add_minus_count_panel, null);
    }

    public void bind() {
        ButterKnife.bind(this, view);
    }

    public void setProduct(Product product) {
        this.product = product;

            if (getCartResponse != null && getCartResponse.getEntryById(product.getCode()) != null) {
                if(getCartResponse.getEntryById(product.getCode()).quantity > 0) {
                    if(!isProductDetailController) {
                        countView.setText(getCartResponse.getEntryById(product.getCode()).quantity + "");
                        editCount.setText(countView.getText());
                    }
                }
                updateCheckoutButton();
                //updateCheckoutButton(getCartResponse.getEntryById(product.getCode()).quantity > 0);
            }

            if (entry != null) {
                if(!isProductDetailController) {
                    countView.setText(entry.quantity + "");
                    editCount.setText(countView.getText());
                }
            }

            if(!product.hasStock() || product.getPrice() == null) {
                disableView.setVisibility(View.VISIBLE);
                disableView.setOnClickListener(null);
                disableCheckoutButton();
            } else {
                disableView.setVisibility(View.INVISIBLE);
            }
    }

    @Nullable @OnClick(R.id.plus)
    public void plus() {
        if(!product.hasStock()) {
            ToastUtils.show(baseActivity, baseActivity.getString(R.string.out_of_stock_insufficient_stock));
            return;
        }


        String countString = countView.getVisibility() == View.VISIBLE ? countView.getText().toString() : editCount.getText().toString();
        int countValue = Integer.valueOf(countString) + 1;

        if(product.getMaxAllowedBuyQty() < countValue) {
            ToastUtils.show(baseActivity, baseActivity.getString(R.string.max_allowed_buy_qty));
            return;
        }


        countView.setText("" + countValue);
        editCount.setText("" + countValue);
        ////handleCartPanel("plus");
        if(!isProductDetailController) {
            if(!product.hasStock())
                HomePresenter.handleLocalShoppingCartData((product.getCode()), countValue);
            baseActivity.showProgressDialog();
            WebServiceModel.getInstance(baseActivity).addShoppingCart(product.getCode(), 1, successCode, "add", baseActivity);
        } else {
            if(cloneData != null) {
                for (int i = 0; i < cloneData.size(); i++) {
                    if (cloneData.get(i).entryNumber.equals(entry.entryNumber)) {
                        cloneData.get(i).quantity = Integer.valueOf(countView.getText().toString());
                    }
                }
            }
            //updateCheckoutButton();
        }
    }

    @Nullable @OnClick (R.id.sub)
    public void sub() {
        if(!product.hasStock()) {
            ToastUtils.show(baseActivity, "No Stock");
            return;
        }

        String countString = countView.getVisibility() == View.VISIBLE ? countView.getText().toString() : editCount.getText().toString();
        int countValue =  Integer.valueOf(countString) > 0 ? Integer.valueOf(countString) - 1 : 0;
        if(countValue <= 0) {
            countView.setText(0 + "");
            editCount.setText(0 + "");
        } else {
            countView.setText("" + countValue);
            editCount.setText(countValue + "");
        }

        if(!isProductDetailController) {
            baseActivity.showProgressDialog();
            HomePresenter.handleLocalShoppingCartData((product.getCode()), countValue);

            if(entry != null ) {
                WebServiceModel.getInstance(baseActivity).editShoppingCart(entry.entryNumber, countValue, successCode, baseActivity);
            } else {
                WebServiceModel.getInstance(baseActivity).editShoppingCart(getEntryNumberByProductId(product.getCode()), countValue, successCode, baseActivity);
            }
        } else {
            if(cloneData != null) {
                for (int i = 0; i < cloneData.size(); i++) {
                    if (cloneData.get(i).entryNumber.equals(entry.entryNumber)) {
                        cloneData.get(i).quantity = Integer.valueOf(countView.getText().toString());
                    }
                }
            }
            //updateCheckoutButton();
        }
    }

    public void updateCheckoutButton() {
        //if(baseActivity.fragment instanceof ProductListFragment && baseActivity.fragment.isAdded() && ((ProductListFragment)baseActivity.fragment).productId > 0) {
        //    ProductListFragment pf = (ProductListFragment) baseActivity.fragment;
        CartResponse cartResponse = HomePresenter.getRemoteShoppingCart();
        for(int i = 0 ; i < cartResponse.getAllEntry().size(); i++) {
            Product product = cartResponse.getEntry(i).product;
            if (product != null) {
                if (product.getCode().equals(this.product.getCode())) {
                    addToCartTextView.setText(baseActivity.getString(R.string.product_detail_add_to_cart));
                }
            }
        }
        //}
    }
    public void updateCheckoutButton(boolean needed) {
        if(needed)
            updateCheckoutButton();
    }

    public void disableCheckoutButton() {
        //if(baseActivity.fragment instanceof ProductListFragment && baseActivity.fragment.isAdded() && ((ProductListFragment)baseActivity.fragment).productId > 0) {
        //    ProductListFragment pf = (ProductListFragment) baseActivity.fragment;
        // pf.checkoutDisableView.setVisibility(View.VISIBLE);
        //pf.checkoutDisableView.setOnClickListener(null);
        //}
        if(disabledView != null) {
            disabledView.setVisibility(View.VISIBLE);
            disabledView.setOnClickListener(null);
        }
    }

    public ProductListFragment productListFragment;
    @Nullable @OnClick(R.id.add_to_cart)
    public void addOnClick() {
        if(productListFragment.getBaseActivity().isLoadingCart)
            return;

        if(productListFragment != null)
            AnimationHelper.slideFromTop( (productListFragment.getBaseActivity()).cartPanel, 95);

        if(productListFragment.getBaseActivity() != null) {
            productListFragment.getBaseActivity().itemAddedTextView.setVisibility(View.INVISIBLE);
            productListFragment.getBaseActivity().moneyNeededForFreeDeliveryTextView.setVisibility(View.INVISIBLE);
            productListFragment.getBaseActivity().smallProgress.setVisibility(View.VISIBLE);
            productListFragment.getBaseActivity().isLoadingCart = true;
        }

        /*
        int count = 0;
        CartResponse cartResponse = HomePresenter.getRemoteShoppingCart();
        for(int i = 0 ; i < cartResponse.getAllEntry().size(); i++) {
            Product product = cartResponse.getEntry(i).product;
            if(product != null) {
                if(product.getCode().equals(this.product.getCode()) ){
                    int qty = Integer.valueOf(countView.getVisibility() == View.VISIBLE ? countView.getText().toString() : editCount.getText().toString());

                    if(qty > product.getMaxAllowedBuyQty()) {
                        ToastUtils.show(baseActivity, baseActivity.getString(R.string.max_allowed_buy_qty));
                        return;
                    }

                    count++;
                    //baseActivity.showProgressDialog();
                    WebServiceModel.getInstance(baseActivity).editShoppingCart(cartResponse.getAllEntry().get(i).entryNumber, qty, "edit", baseActivity, false);
                    return;
                }
            }
        }

        if(count == 0) {
            //baseActivity.showProgressDialog();
            WebServiceModel.getInstance(baseActivity).addShoppingCart(product.getCode(), Integer.valueOf(countView.getVisibility() == View.VISIBLE ? countView.getText().toString() : editCount.getText().toString()), successCode, "add", baseActivity, false);
        }*/
        WebServiceModel.getInstance(baseActivity).addShoppingCart(product.getCode(), Integer.valueOf(countView.getVisibility() == View.VISIBLE ? countView.getText().toString() : editCount.getText().toString()), successCode, "add", baseActivity, false);

        productListFragment.getBaseActivity().isLoadingCart = true;
    }

    @Nullable @OnClick(R.id.btnAddToWishList)
    public void addToWishList() {

    }

    public String getEntryNumberByProductId(String code) {
        if(getCartResponse == null)
            return "";

        //Log.i("entryNumber", "entryNumber 1" + code);
        for (CartResponse.Entry shoppingEntry : getCartResponse.getAllEntry()) {
            if(shoppingEntry.product.getCode().equals(code)){
                //Log.i("entryNumber", "entryNumber 2 " + shoppingEntry.entryNumber);
                return shoppingEntry.entryNumber;
            }
        }
        return  "";
    }

    @Nullable @OnClick(R.id.edit_count)
    public void editCount() {
        //editCount.requestFocus();
    }

    @Nullable @OnClick(R.id.count)
    public void count() {
        final NumpadFragment numpadFragment = new NumpadFragment();
        numpadFragment.productId = product.getCode();
        if(countView != null)
            numpadFragment.countValue = (countView.getText()).toString();


        numpadFragment.setCallListener(new NumpadFragment.OnCallListener() {

            @Override
            public void onCall(String number) {
                String productId = numpadFragment.productId;
                int qty = Integer.valueOf(number);

                if(qty > product.getMaxAllowedBuyQty()) {
                    ToastUtils.show(baseActivity, baseActivity.getString(R.string.max_allowed_buy_qty) );
                    return;
                }
                countView.setText(qty + "");

                /*
                if(entry != null) {
                    WebServiceModel.getInstance(baseActivity).editShoppingCart(entry.entryNumber, Integer.valueOf(number), baseActivity);
                    baseActivity.showProgressDialog();
                } else {
                    try {
                        WebServiceModel.getInstance(baseActivity).editShoppingCart(getEntryNumberByProductId(productId), Integer.valueOf(number), baseActivity);
                        baseActivity.showProgressDialog();
                    } catch (Exception e) {
                        ToastEvent toastEvent = new ToastEvent();
                        toastEvent.setMessage(baseActivity.getResources().getString(R.string.process_fail));
                        MyApplication.getInstance().mBus.post(toastEvent);
                    }
                }*/
                //Toast.makeText(baseActivity, "Call number: " + number, Toast.LENGTH_SHORT).show();
            }
        });

        numpadFragment.show(baseActivity.getSupportFragmentManager(), "");
       // ((BaseActivity)context).placeFragmentWithBackStack(numpadFragment);

    }
}
