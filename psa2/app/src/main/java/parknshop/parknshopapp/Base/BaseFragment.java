package parknshop.parknshopapp.Base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.diegocarloslima.fgelv.lib.FloatingGroupExpandableListView;
import com.orhanobut.hawk.Hawk;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import parknshop.parknshopapp.AnimationHelper;
import parknshop.parknshopapp.EventUpdate.LoadingButtonProgressDialogDismissEvent;
import parknshop.parknshopapp.EventUpdate.LoadingButtonProgressDialogShowEvent;
import parknshop.parknshopapp.Fragment.Category.CategoryFragment;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CartEvent;
import parknshop.parknshopapp.Rest.event.CategoryTreeEvent;
import parknshop.parknshopapp.Rest.event.UpdateProductListViewHolderEvent;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.common.MemberHelper;

/**
 * Created by chrisyu on 4/3/16.
 */
public class BaseFragment extends Fragment {
    public ArrayList<Thread> threadList = new ArrayList<>();

    public StaggeredGridLayoutManager staggeredGridLayoutManager;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        try {
            final InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
        } catch (Exception e){

        }
    }

    public FragmentManager getSupportFragmentManager() {
        return getActivity().getSupportFragmentManager();
    }

    public void placeFragmentWithBackStack(BaseFragment fragment) {
        getBaseActivity().placeFragmentWithBackStack(fragment);
    }

    public void placeFragment(BaseFragment fragment) {
        getBaseActivity().placeFragment(fragment);
    }

    public void addFragmentToTop(BaseFragment fragment) {
        getBaseActivity().addFragmentToTop(fragment);
    }

    public boolean isChildFragment = false;
    @Override
    public void onResume() {
        super.onResume();
        //disableNavigationDrawer();

        hideKeyboard();

        if(this instanceof CategoryFragment) {

            getBaseActivity().tabDummyLayout.setVisibility(View.VISIBLE);
            final CategoryFragment categoryFragment = ((CategoryFragment)this);

            Log.i("yoyoyoyoy", "yoyoyoyoy" + (this instanceof CategoryFragment) + categoryFragment.tabLayout.getHeight());

            final ViewTreeObserver observer= getBaseActivity().tabDummyLayout.getViewTreeObserver();
            observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    Log.i("yoyoyoyoy", "yoyoyoyoy" + (BaseFragment.this instanceof CategoryFragment) + categoryFragment.tabLayout.getHeight());

                    if(categoryFragment.tabLayout != null)
                        getBaseActivity().tabDummyLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, categoryFragment.tabLayout.getHeight()));

                    observer.removeGlobalOnLayoutListener(this);
                }
            });


        } else if(!isChildFragment){
            Log.i("yoyoyoyoy", "yoyoyoyoy" + (this instanceof CategoryFragment));

            getBaseActivity().tabDummyLayout.setVisibility(View.GONE);
        }

        AnimationHelper.animationInProgress = false;
        MyApplication.getInstance().register(this);
//        GATrackerHelper.setGATracker(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        if(threadList != null && threadList.size() > 0) {
           for(int i = 0; i < threadList.size(); i++){
               threadList.get(i).interrupt();
           }
            threadList.clear();
        }

        AnimationHelper.animationInProgress = false;

        MyApplication.getInstance().unRegister(this);
    }

//    public void setGATracker(Fragment fragment) {
//        ((BaseActivity) getActivity()).setGATracker(fragment);
//    }

    public void onEvent(CategoryTreeEvent categoryTreeEvent) {
    }

    /*
            public void hideSlidingMenu() {
                SlidingMenu slidingMenu = ((OneActivity)getActivity()).slidingMenu;
                if(slidingMenu != null) {
                    if(slidingMenu.isMenuShowing())
                        slidingMenu.toggle();

                    if(slidingMenu.isSecondaryMenuShowing())
                        slidingMenu.showSecondaryMenu();

                    slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
                }
            }
        */
    public void hideToolbar() {
        getBaseActivity().toolbar.setVisibility(View.GONE);
    }

    public void showToolbar() {
        getBaseActivity().toolbar.setVisibility(View.VISIBLE);
    }

    public TextView getToolbarTitle() {
        return getBaseActivity().toolbarTitle;
    }

    public void showMenuButton() {
        getBaseActivity().enableMenuButton();
    }

    public void showBackButton() {
        getBaseActivity().showBackButton();
    }

    public void disableNavigationDrawer() {
        getBaseActivity().disableNavigationDrawer();
    }

    public void enableNavigationDrawer() {
        getBaseActivity().enableNavigationDrawer();
    }

    public FloatingGroupExpandableListView getLeftExpanableListView() {
        return getBaseActivity().getLeftExpanableListView();
    }

    public View getRightExpanableListView() {
        return getBaseActivity().getRightSlidingMenu();
    }

    public View getLoadingView() {
        return ((BaseActivity) getActivity()).loadingView;
    }

    public void showLoadingView() {
        getBaseActivity().loadingView.setVisibility(View.VISIBLE);
    }

    public void showLoadingBtnLoading() {
        MyApplication.getInstance().mBus.post(new LoadingButtonProgressDialogShowEvent());
    }

    public void hideLoadingBtnLoading() {
        MyApplication.getInstance().mBus.post(new LoadingButtonProgressDialogDismissEvent());
    }


    public void hideLoadingView() {
        getBaseActivity().loadingView.setVisibility(View.GONE);
    }

    public void showLogo() {
        getBaseActivity().showLogo();
    }

    public void showLogo(int drawable) {
        getBaseActivity().showLogo(drawable);
    }

    public void setToolbarTitle(String title) {
        getBaseActivity().setToolbarTitle(title);
    }

    public TextView getShoppingCartDot() {
        return getBaseActivity().getShoppingCartDot();
    }

    public void setShoppingCartDot(int dot) {
        getBaseActivity().setShoppingCartDot(dot);
    }

    public BaseActivity getBaseActivity() {
        return (BaseActivity) getActivity();
    }


    public void showProgressDialog() {
        getBaseActivity().showProgressDialog();
    }

    public void hideProgressDialog() {
        if(getBaseActivity() != null)
            getBaseActivity().hideProgressDialog();
    }

    public void onEvent(CartEvent cartEvent) {
        if(cartEvent != null && cartEvent.getType().equals("init")){
            //should not hide progress dialog @ the case of init shoppingcart @ checkout payment
            return;
        }

        hideLoadingView();
        hideProgressDialog();
        Log.i("cartEvent", "cartEvent" + cartEvent.getSuccess() + " " + cartEvent.getMessage() + " " + cartEvent.getCartResponse());
        Log.i("cartEvent", "cartEvent:::" + (cartEvent.getSuccess() && cartEvent.getCartResponse().getTotalUnitCount() > 0));
        Log.i("cartEvent", "cartEvent:count::" + cartEvent.getCartResponse().getTotalUnitCount());

        getBaseActivity().hideProgressDialog();


        if(cartEvent.getSuccess()) {
            //if((this instanceof ProductListFragment || getBaseActivity().getRightSlidingMenu().isShown()) && (cartEvent.getType().length() > 0 &&!cartEvent.getType().equals("cart")))
            //    if(Hawk.get("previous_shopping_cart", new CartResponse()).getTotalItems() != cartEvent.getCartResponse().getTotalItems()) {
            //        Hawk.put("previous_shopping_cart",cartEvent.getCartResponse());
            //        ToastUtils.show(getBaseActivity(), "Cart Updated");
            //    }

            if(cartEvent.getType().equals("add")) {
                getBaseActivity().setFloatingLableTitle(getString(R.string.added_to_shopping_cart));
            }

            if(cartEvent.getType().equals("edit")) {
                getBaseActivity().setFloatingLableTitle(getString(R.string.quantity_changed));
            }

            setShoppingCartDot(cartEvent.getCartResponse().getTotalItems());

            if ((cartEvent.getType() != null && cartEvent.getType().equals("delete")) || cartEvent.getCartResponse().getAllEntry().size() == 0)
                getBaseActivity().swipePosition = -1;

            //if(HomePresenter.rightSlidingListViewAdapter == null)
            HomePresenter.initShoppingCart(cartEvent.getCartResponse(), getBaseActivity());
            //else
            //    HomePresenter.updateShoppingCart(cartEvent.getCartResponse(), getBaseActivity());

            //Hawk.put(AppUtils.remote_shopping_cart, cartEvent.getCartResponse());

            handleUpdateShoppingCartCase(cartEvent.getCartResponse().getAllEntry(), cartEvent);

        } else {

            HomePresenter.initShoppingCart(cartEvent.getCartResponse(), getBaseActivity());
            getBaseActivity().swipePosition = -1;
            Hawk.put(AppUtils.local_shopping_cart, new HashMap<>());
            getShoppingCartDot().setVisibility(View.GONE);
            ToastUtils.show(getActivity(), cartEvent.getMessage());

        }
    }

    public void handleUpdateShoppingCartCase(List<CartResponse.Entry> entries, CartEvent cartEvent) {

        for(int i = 0; i < entries.size(); i++) {
            UpdateProductListViewHolderEvent event = new UpdateProductListViewHolderEvent();
            event.setProduct(entries.get(i).product);
            MyApplication.getInstance().mBus.post(event);
        }

        /*
        if(this instanceof ProductListFragment) {
            ProductListFragment productListFragmentReference = ((ProductListFragment)this);
            List<Product> products = productListFragmentReference.productListAdapter.productList;


            for(int i = 0 ; i < products.size(); i ++) { //loop every product in product list

                if(products.get(i) != null) {
                    Product product = products.get(i);
                    for(int y = 0; y < entries.size(); y++) { //compare it in remote response

                        if(product.getCode().equals(entries.get(y).product.getCode())) { //update local shoppingcart if needed
                            HomePresenter.handleLocalShoppingCartData(Integer.valueOf(product.getCode()), entries.get(y).quantity);
                            productListFragmentReference.productListAdapter.notifyItemRangeChanged(i, products.size());
                        }
                    }

                    //reset shopping cart case
                    //1)remote shopping cart == 0
                    //2) local shopping cart not null && remote shopping cart == null

                    if(entries.size() == 0 ||
                            (Hawk.get(AppUtils.local_shopping_cart, new HashMap<Integer, Integer>()).get(product) != null &&
                                    Hawk.get(AppUtils.local_shopping_cart, new HashMap<Integer, Integer>()).get(product) > 0 && cartEvent.getCartResponse().getEntryById(product.getCode()) == null )) {
                        HomePresenter.handleLocalShoppingCartData(Integer.valueOf(product.getCode()), 0);
                        productListFragmentReference.productListAdapter.notifyItemRangeChanged(i, products.size());
                    }
                }
            }
        }*/
    }

    public void showDimmedBackground(){
        getBaseActivity().showDimmedBackground();
    }

    public void hideDimmedBackground() {
        getBaseActivity().hideDimmedBackground();
    }

    public void enableSearchButton() {
        getBaseActivity().enableSearchButton();
    }

    public void disableSearchButton() {
        getBaseActivity().disableSearchBotton();
    }

    public void enableSecondRightButton() {
        getBaseActivity().enableSecondRightButton();
    }

    public void enableSecondRightTextButton(String txt, BaseFragment fragment) {
        getBaseActivity().enableSecondRightTextButton(txt, fragment);
    }

    public void enableSecondRightTextButtonOnClickListener(String txt, View.OnClickListener cListener) {
        getBaseActivity().enableSecondRightTextButtonOnClickListener(txt, cListener);
    }

    public void enableSecondRightTextButtonOnClickListenerWithImage(String txt, int img, View.OnClickListener cListener) {
        getBaseActivity().enableSecondRightTextButtonOnClickListenerWithImage(txt, img, cListener);
    }

    public void setSecondRightTextButtonOnClickListenerText(String txt) {
        getBaseActivity().setSecondRightTextButtonOnClickListenerText(txt);
    }

    public void setSecondRightTextButtonOnClickListenerImage(int img) {
        getBaseActivity().setSecondRightTextButtonOnClickListenerImage(img);
    }

    public void disableSecondRightButton() {
        getBaseActivity().disableSecondRightButton();
    }

    public void hideShoppingCartButton() {
        getBaseActivity().hideShoppingCartButton();
    }
    
    public void showShoppingCartButton() {
        getBaseActivity().showShoppingCartButton();
    }
    
    public void disableCartButton() {
        getBaseActivity().disableCartButton();
    }

    public void shareUrl(){
        Intent sendIntent = new Intent();
        sendIntent.setType("text/html");
        sendIntent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml("<p>PNS</p>"));
        startActivity(Intent.createChooser(sendIntent,"Share using"));
        startActivity(sendIntent);
    }

    public void shareUrl(String title, String url){
        Intent sendIntent = new Intent(android.content.Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

        sendIntent.putExtra(Intent.EXTRA_SUBJECT, title);
        sendIntent.putExtra(Intent.EXTRA_TEXT, url);

        startActivity(Intent.createChooser(sendIntent,""));
        startActivity(sendIntent);
    }

    public void hideKeyboard(){
        final InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(
                Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            Activity activity = getActivity();
            if (activity == null)
                return;
            if (activity.getCurrentFocus() == null)
                return;
            if (activity.getCurrentFocus().getWindowToken() == null)
                return;
            imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
        }
    }

    public void startLocationManager() {
        MyApplication.getInstance().startLocationManager(getActivity());
    }

    public void stopLocationManager() {
        MyApplication.getInstance().stopLocationManager(getActivity());
    }

    public void locationManagerRequestUpdate() {
        MyApplication.getInstance().locationMangerRequestUpdate(getActivity());
    }

    public static boolean isEmail(String emailString) {
        if (emailString
                .matches("[a-zA-Z0-9_.+]+@+[a-zA-Z0-9]+.+[a-zA-Z0-9]?+.+[a-zA-Z0-9]")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPassWd(String pw) {
        Pattern pattern;
        Matcher matcher;

        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{6,6}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(pw);
        return matcher.matches();
    }

    public boolean checkPlayServices() {
        return ((BaseActivity)getActivity()).checkPlayServices();
    }

    public void showBackButtonAndAddTopFragment(BaseFragment fragment){
        ((BaseActivity)getActivity()).showBackButtonAndAddTopFragment(fragment);
    }

    public void getInboxMsg(){
        if(MemberHelper.getLoginResponse() != null){
            ((BaseActivity)getActivity()).getInboxMsg(MemberHelper.getLoginResponse().getMemberProfile().getUid());
        }
    }

    // For error code use
    public int getId(String resourceName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(resourceName);
            return idField.getInt(idField);
        } catch (Exception e) {
            Log.i("","No resource ID found for: ");
        }
        return 0;
    }

//    public void onEvent(InboxMsgCountUpdateEvent inboxMsgCountUpdateEvent){
////        HomePresenter.setUnreadMsgCount(this, inboxMsgCountUpdateEvent.getCount());
//    }
}
