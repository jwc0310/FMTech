package parknshop.parknshopapp.Base;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.diegocarloslima.fgelv.lib.FloatingGroupExpandableListView;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.AnimationHelper;
import parknshop.parknshopapp.ExpandableListAdapter;
import parknshop.parknshopapp.Fragment.Account.LoginFragment;
import parknshop.parknshopapp.Fragment.Checkout.CheckoutDeliveryMethodFragment;
import parknshop.parknshopapp.Fragment.Checkout.CheckoutThankYouFragment;
import parknshop.parknshopapp.Fragment.Dialog.AlcoholAdultOnlyDialogFragment;
import parknshop.parknshopapp.Fragment.Dialog.BasketLevelPromotionDialogFragment;
import parknshop.parknshopapp.Fragment.Dialog.HamperNoticeDialogFragment;
import parknshop.parknshopapp.Fragment.Dialog.OutOfStockDialogFragment;
import parknshop.parknshopapp.Fragment.Home.HomeFragment;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Fragment.Home.Search.SearchMainFragment;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.Fragment.Recipe.RecipeMainFragment;
import parknshop.parknshopapp.Fragment.StoreLocator.StoreLocatorAdvancedSearchFragment;
import parknshop.parknshopapp.Fragment.StoreLocator.StoreLocatorFragment;
import parknshop.parknshopapp.Fragment.StoreLocator.StoreLocatorListFragment;
import parknshop.parknshopapp.Fragment.StoreLocator.StoreLocatorSearchFragment;
import parknshop.parknshopapp.Fragment.WebView.WebViewFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Advertisement;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.Category.SubCategory;
import parknshop.parknshopapp.Model.Config;
import parknshop.parknshopapp.Model.DeleteCartPostBody;
import parknshop.parknshopapp.Model.ExpandedMenuModel;
import parknshop.parknshopapp.Model.MiniEntry;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.RegisterHelper;
import parknshop.parknshopapp.Rest.event.AddShoppingCartEvent;
import parknshop.parknshopapp.Rest.event.CartEvent;
import parknshop.parknshopapp.Rest.event.CategoryTreeEvent;
import parknshop.parknshopapp.Rest.event.CheckoutDialogFragmentOnConfirmClickedEvent;
import parknshop.parknshopapp.Rest.event.ConfigEvent;
import parknshop.parknshopapp.Rest.event.EditShoppingCartEvent;
import parknshop.parknshopapp.Rest.event.InboxResponseEvent;
import parknshop.parknshopapp.Rest.event.LogoutEvent;
import parknshop.parknshopapp.Rest.event.ShoppingCartSelectAllEvent;
import parknshop.parknshopapp.Rest.event.ToastEvent;
import parknshop.parknshopapp.TokenHelper;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutDiscountItem;
import parknshop.parknshopapp.WebServiceModel;
import parknshop.parknshopapp.common.MemberHelper;

import static parknshop.parknshopapp.Fragment.Home.HomePresenter.rightSlidingListViewAdapter;

/**
 * Created by chrisyu on 10/3/16.
 */
public class BaseActivity extends AppCompatActivity implements SlidingMenu.OnCloseListener, SlidingMenu.OnOpenedListener {
    public @Bind(R.id.back) ImageView back;
    public @Bind(R.id.menu) ImageView menu;
    public @Bind(R.id.left_root)
    RelativeLayout left_root;
    public @Bind(R.id.toolbar_title) TextView toolbarTitle;
    public @Bind(R.id.logo) ImageView logo;

    public @Bind(R.id.second_right_root) View second_right_root;
    public @Bind(R.id.second_right_btn) View second_right_btn;

    public @Bind(R.id.right_root) View shoppingCartButton;
    public @Bind(R.id.shopping_cart_dot) TextView shoppingCartDot;
    public @Bind(R.id.txt_second_right_btn) TextView txt_second_right_btn;
    public @Bind(R.id.image_second_right_btn) ImageView imageSecondRightButton;

    public @Bind(R.id.tool_bar) Toolbar toolbar;
    public @Bind(R.id.loading) View loadingView;
    public @Bind(R.id.dimmed) View dimmed;
    public @Bind(R.id.transparent_background) LinearLayout fullscreenBackground;
    public @Bind(R.id.full_screen_ad) View fullScreenAdView;
    public @Bind(R.id.ad_image) ImageView imageAd;

    public @Bind(R.id.float_wrapper) View floatingWrapper;
    public @Bind(R.id.floating_label_title) TextView floatingLableTitle;

    public @Bind(R.id.tab_dummy_layout) View tabDummyLayout;

    public SlidingMenu slidingMenu;
    public boolean reloadLinearLayoutManager;

    boolean addTopFragmentWhenClickBackBtn = false;
    BaseFragment mDestinationFragment;

    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

    List<ExpandedMenuModel> listDataHeader;
    HashMap<ExpandedMenuModel, List<String>> listDataChild;

    ExpandableListAdapter mMenuAdapter;
    public int swipePosition = -1; //-1 // 0
    public String swipedPositionProductCode = "";

    Tracker mTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_activity_layout);
        ButterKnife.bind(this);
        loadingView.setOnClickListener(null);
        enableMenuButton();
        slidingMenu = generatingSlidingMenu(this);

//        mTracker = MyApplication.getInstance().getDefaultTracker();
//        GATrackerHelper.getDefaultTracker(this);
    }

//    public void setGATracker(Fragment fragment){
//        LogUtil.info("", "GAAAAAAAAAA:"+fragment.getClass().getSimpleName());
//        mTracker.setScreenName(fragment.getClass().getSimpleName());
//        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
//
//    }

    public @Bind (R.id.small_progress) View smallProgress;
    public @Bind (R.id._item_added) TextView itemAddedTextView;
    public @Bind (R.id._money_needed_for_free_delivery) TextView moneyNeededForFreeDeliveryTextView;
    public @Bind (R.id.delivery_progress_bar) ProgressBar deliveryProgressBar;
    public @Bind (R.id.cart_panel) View cartPanel;
    public boolean isLoadingCart = false;

    //public void onEvent(CartEvent event) {
    //}

    @Override
    public void onResume() {
        super.onResume();
        MyApplication.getInstance().register(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        MyApplication.getInstance().unRegister(this);
    }

    public void setFloatingLableTitle(String title) {
        /*floatingLableTitle.setText(title);
        floatingWrapper.setVisibility(View.VISIBLE);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                floatingWrapper.setVisibility(View.GONE);
            }
        };

        Handler h = new Handler();
        h.postDelayed(runnable, 3000);*/
    }


    public void enableMenuButton() {
        menu.setVisibility(View.VISIBLE);
        back.setVisibility(View.GONE);
        addTopFragmentWhenClickBackBtn = false;
        mDestinationFragment = null;
    }

    public void showBackButton() {
        menu.setVisibility(View.GONE);
        back.setVisibility(View.VISIBLE);
        addTopFragmentWhenClickBackBtn = false;
        mDestinationFragment = null;
    }

    public void showBackButtonAndAddTopFragment(BaseFragment destinationFragment) {
        menu.setVisibility(View.GONE);
        back.setVisibility(View.VISIBLE);
        addTopFragmentWhenClickBackBtn = true;
        mDestinationFragment = destinationFragment;
    }


    public void enableSearchButton() {
        second_right_root.setVisibility(View.VISIBLE);
        second_right_btn.setVisibility(View.VISIBLE);
    }

    public void disableSearchBotton() {
        second_right_root.setVisibility(View.GONE);
        second_right_btn.setVisibility(View.GONE);
    }

    public void enableSecondRightButton() {
        //second_right_root.setVisibility(View.VISIBLE);
        txt_second_right_btn.setVisibility(View.GONE);
    }

    public void enableSecondRightTextButton(String txt, final BaseFragment fragment) {
        //second_right_root.setVisibility(View.GONE);
        txt_second_right_btn.setVisibility(View.VISIBLE);
        txt_second_right_btn.setText(txt);
        txt_second_right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                placeFragmentWithBackStack(fragment);
            }
        });
    }

    @Bind(R.id.second_right_root_txt) View second_right_root_txt;
    public void enableSecondRightTextButtonOnClickListener(String txt, View.OnClickListener cListener) {
        //second_right_root.setVisibility(View.GONE);
        txt_second_right_btn.setVisibility(View.VISIBLE);
        txt_second_right_btn.setText(txt);
        second_right_root_txt.setOnClickListener(cListener);
        txt_second_right_btn.setBackgroundDrawable(null);
    }

    public void enableSecondRightTextButtonOnClickListenerWithImage(String txt, int img, View.OnClickListener cListener) {
        //second_right_root.setVisibility(View.GONE);
        txt_second_right_btn.setVisibility(View.VISIBLE);
        //txt_second_right_btn.setBackgroundResource(img);
        //imageSecondRightButton.setImageResource(img);
        //imageSecondRightButton.setVisibility(View.VISIBLE);
        txt_second_right_btn.setText(txt);
        txt_second_right_btn.setOnClickListener(cListener);
    }

    public void setSecondRightTextButtonOnClickListenerText(String txt) {
        txt_second_right_btn.setText(txt);
    }

    public void setSecondRightTextButtonOnClickListenerImage(int img) {
        //Log.i("[image]", "[image]" + img);
        if(img == 0){
            imageSecondRightButton.setBackgroundDrawable(null);
            imageSecondRightButton.setVisibility(View.GONE);
        }else {
            imageSecondRightButton.setBackgroundResource(img);
            imageSecondRightButton.setVisibility(View.VISIBLE);
        }
    }

    public void disableSecondRightButton() {
        //second_right_root.setVisibility(View.GONE);
        txt_second_right_btn.setVisibility(View.GONE);
    }

    public void disableCartButton() {
        hideShoppingCartButton();
        //right_root.setVisibility(View.GONE);
    }

    public void setToolbarTitle(String title) {
        toolbarTitle.setText(title);
        logo.setVisibility(View.GONE);
        toolbarTitle.setVisibility(View.VISIBLE);
    }

    public BaseFragment getActiveFragment() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            return null;
        }
        String tag = getSupportFragmentManager().getBackStackEntryAt(getSupportFragmentManager().getBackStackEntryCount() - 1).getName();
        return (BaseFragment) getSupportFragmentManager().findFragmentByTag(tag);
    }

    @OnClick(R.id.second_right_root)
    public void goToSearchPage() {
        if(fragment != null) {
            if(fragment instanceof StoreLocatorFragment || fragment instanceof StoreLocatorSearchFragment || fragment instanceof StoreLocatorAdvancedSearchFragment || fragment instanceof StoreLocatorListFragment) {
                placeFragmentWithBackStack(new StoreLocatorAdvancedSearchFragment());
            }else {
                placeFragmentWithBackStack(new SearchMainFragment());
            }
        } else {
            placeFragmentWithBackStack(new SearchMainFragment());
        }
    }

//    @OnClick(R.id.txt_second_right_btn)
//    public void rightTopTxtBtnGoToClickedPage(BaseFragment fragment) {
//        placeFragmentWithBackStack(fragment);
//    }


    @OnClick(R.id.left_root)
    public void onLeftPressed(){
        if(menu.getVisibility() == View.VISIBLE) {
            GATrackerHelper.getInstance(this).setGATracker("menu");
            generatingSlidingMenu(this).toggle();
            showDimmedBackground();
        } else {
            if(addTopFragmentWhenClickBackBtn && mDestinationFragment != null) {
                addFragmentToTop(mDestinationFragment);
            }else {
                super.onBackPressed();
            }
        }
    }

    @OnClick(R.id.right_root)
    public void onRightPressed(){
        GATrackerHelper.getInstance(this).setGATracker("shopping-cart");
        //if(menu.getVisibility() == View.VISIBLE)
        generatingSlidingMenu(this).showSecondaryMenu();
        showDimmedBackground();

        //WebServiceModel.getInstance(this).requestGetCart(this, "cart");
        //showProgressDialog();
        //else
        //    super.onBackPressed();
    }

    public void hideKeyboard(){
        InputMethodManager imm = (InputMethodManager) this.getSystemService(
                Context.INPUT_METHOD_SERVICE);
        if (imm!=null) {
            Activity activity = this;
            if (activity == null)
                return;
            if (activity.getCurrentFocus() == null)
                return;
            if (activity.getCurrentFocus().getWindowToken() == null)
                return;
            imm.hideSoftInputFromWindow(this.getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_IMPLICIT_ONLY);
        }
//        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
//        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
//        View view = this.getCurrentFocus();
//        if (view != null) {
//            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
//        }
    }

    public void editTextGetFocusNonStatic(final TextView sampleTextView) {
        (new Handler()).postDelayed(new Runnable() {

            public void run() {
                sampleTextView.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_DOWN , 0, 0, 0));
                sampleTextView.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_UP , 0, 0, 0));

            }
        }, 200);
    }


    public static void editTextGetFocus(final TextView sampleTextView) {
        (new Handler()).postDelayed(new Runnable() {

            public void run() {
                sampleTextView.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_DOWN , 0, 0, 0));
                sampleTextView.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_UP , 0, 0, 0));

            }
        }, 200);
    }

    public void onBackPressed() {
        if(slidingMenu != null && slidingMenu.isMenuShowing()) {
            closeDrawer();
            return;
        }
        if (fragmentManager.getBackStackEntryCount() >= 1) {
            if (fullScreenAdView.getVisibility() == View.VISIBLE) {
                fullScreenAdView.setVisibility(View.GONE);
                enableNavigationDrawer();
            } else if (fragment instanceof ProductListFragment && ((ProductListFragment) fragment).dimmed.getVisibility() == View.VISIBLE) {
                ((ProductListFragment) fragment).setDimmed();
            } else if (fragment instanceof CheckoutThankYouFragment) {
                addFragmentToTop(new HomeFragment());
            } else {
                super.onBackPressed();
            }
        }else{
                quitAppDialog();
        }
    }

    public void quitAppDialog() {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.dialog_quit, null);
        final Dialog mDialog = new Dialog(this);

        TextView btnCancel = (TextView) layout.findViewById(R.id.btnCancel);
        TextView btnOK = (TextView) layout.findViewById(R.id.btnOK);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
                finish();
            }
        });

        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(layout);
        mDialog.show();
    }

    public BaseFragment fragment;
    public void placeFragmentWithBackStack(BaseFragment fragment) {
        this.fragment = fragment;
        fragmentManager.beginTransaction()
                //.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
                .replace(R.id.fragment, fragment)
                .addToBackStack(null)
                .commitAllowingStateLoss();
    }

    public void placeFragment(BaseFragment fragment) {
        this.fragment = fragment;
        fragmentManager.beginTransaction()
                //.setCustomAnimations(R.anim.fadeout, R.anim.fadein)
                //.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
                //.add(R.id.fragment, fragment)
                .replace(R.id.fragment, fragment)
                .commitAllowingStateLoss();
    }

    public void addFragmentToTop(BaseFragment mFragment){
        if (fragmentManager.getBackStackEntryCount() > 0) {
            for(int i = 0; i < fragmentManager.getBackStackEntryCount(); i++){
//                mFragmentManager.popBackStack();
                try {
                    fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    fragmentManager.executePendingTransactions();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        placeFragment(mFragment);
    }

    public void closeDrawer() {
        if (slidingMenu.isMenuShowing()) slidingMenu.toggle();
        if (slidingMenu.isMenuShowing()) slidingMenu.showSecondaryMenu();
    }

    public void disableNavigationDrawer() {
        generatingSlidingMenu(this).setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
    }

    public void enableNavigationDrawer() {
        generatingSlidingMenu(this).setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
    }

    public void showLoadingView() {
        loadingView.setVisibility(View.VISIBLE);
    }

    public void hideLoadingView() {
        loadingView.setVisibility(View.GONE);
    }

    public LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) generatingSlidingMenu(this).getMenu().findViewById(R.id.left_sliding_menu_recycler_view);

        if(reloadLinearLayoutManager) {
            reloadLinearLayoutManager = false;
            linearLayoutManager = new LinearLayoutManager(this);
        }

        recyclerView.setLayoutManager(linearLayoutManager);
        return recyclerView;
    }

    public View getHeaderRoot() {
        return generatingSlidingMenu(this).getMenu().findViewById(R.id.header_dummy);
        //header_dummy
    }

    public FloatingGroupExpandableListView getLeftExpanableListView() {
        FloatingGroupExpandableListView expView = (FloatingGroupExpandableListView)generatingSlidingMenu(this).getMenu().findViewById(R.id.left_sliding_menu);
        //Glide.with(this).load(R.drawable.menu_bg).dontAnimate().into((ImageView)generatingSlidingMenu(this).getMenu().findViewById(R.id.left_listview_background));
        expView.setGroupIndicator(null);
        expView.setChildIndicator(null);
        expView.setDividerHeight(0);
        return expView;
    }


    public ListView getRightListView() {
        return (ListView) getRightSlidingMenu().findViewById(R.id.right_sliding_menu_listview);
    }

    public View getRightSlidingMenu() {
        return generatingSlidingMenu(this).getSecondaryMenu();
    }

    public void setShoppingCartTitle(int count) {
        TextView tv = ((TextView)(generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.my_cart)));
        String cartText = (count > 0 ? "(" + count + ")" : "");
        tv.setText(cartText);
    }

    public void setSubTotal(String total) {
        TextView tv = ((TextView)(generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.subtotal_value)));
        String cartText = "" + total;
        tv.setText(cartText);
    }

    public void setDeliveryFee(String total) {
        TextView tv = ((TextView)(generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.delivery_fee_value)));
        String cartText = "" + total;
        tv.setText(cartText);
    }

    public void setCheckOutValue(String total) {
        TextView tv = ((TextView)(generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.check_out_value)));
        String cartText = "" + total;
        tv.setText(cartText);
    }

    public void showBasketLevelIfNeeded(CartResponse cartResponse) {
        if(cartResponse.getRecievedPromotion() != null && cartResponse.getRecievedPromotion().size() > 0) {
            undimBasketButton();
        } else {
            dimBasketButton();
        }
    }

    public void setDiscountPanel(CartResponse cartResponse) {
        LinearLayout discountPanel = (LinearLayout)generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.discountItem_panel);

        if(cartResponse.getRecievedPromotion() != null && cartResponse.getRecievedPromotion().size() > 0) {

            //todo
        }

        for(int i = 0; i < 3; i++) {
            CheckoutDiscountItem checkoutDiscountItem = new CheckoutDiscountItem(this);
            checkoutDiscountItem.setPlaceholder("dummmy Placeholder");
            checkoutDiscountItem.setValue("dummmy value");
            discountPanel.addView(checkoutDiscountItem);
        }
    }

    public void showShoppingCart(boolean show) {
        if(show) {
            (generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.empty_shopping_cart)).setVisibility(View.GONE);
            (generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.shopping_cart)).setVisibility(View.VISIBLE);
        } else {
            (generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.empty_shopping_cart)).setVisibility(View.VISIBLE);
            (generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.shopping_cart)).setVisibility(View.GONE);
        }
    }

    public void showLogo() {
        logo.setVisibility(View.VISIBLE);
        logo.setImageResource(R.drawable.home_pns_logo);
        toolbarTitle.setVisibility(View.GONE);
    }

    public void showLogo(int drawable) {
        logo.setVisibility(View.VISIBLE);
        logo.setImageResource(drawable);
        toolbarTitle.setVisibility(View.GONE);
    }

    public void dimBasketButton() {
        generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.dim_basket_level_icon).setVisibility(View.VISIBLE);
    }

    public void undimBasketButton() {
        generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.dim_basket_level_icon).setVisibility(View.GONE);
    }

    public void hideBasketIcon() {
        generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.basket_layout).setVisibility(View.INVISIBLE);
    }

    public void showBasketIcon() {
        generatingSlidingMenu(this).getSecondaryMenu().findViewById(R.id.basket_layout).setVisibility(View.VISIBLE);
    }

    public SlidingMenu generatingSlidingMenu(Context context) {
        if(slidingMenu != null)
            return slidingMenu;
        SlidingMenu menu = new SlidingMenu(context);
        menu.setMode(SlidingMenu.LEFT_RIGHT);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        menu.setFadeDegree(0.35f);
        menu.attachToActivity((Activity) context, SlidingMenu.SLIDING_CONTENT);

        menu.setMenu(R.layout.home_activity_sliding_menu_left);
        menu.setShadowDrawable(R.drawable.home_activity_shadow);

        menu.setSecondaryMenu(R.layout.home_activity_sliding_menu_right);
        menu.setSecondaryShadowDrawable(R.drawable.home_activity_shadow);

        menu.getSecondaryMenu().findViewById(R.id.checkout_now_btn).setOnClickListener(new CheckoutNowOnClickListener());
        menu.getSecondaryMenu().findViewById(R.id.basket_level_promotion_button).setOnClickListener(new ShowBasketLevelOnClickDialog());
        menu.getSecondaryMenu().findViewById(R.id.right_sliding_menu_edit_textview).setOnClickListener(new RightShoppingCartDoneEditListener());
        menu.setOnCloseListener(this);
        menu.setOnOpenedListener(this);

        slidingMenu = menu;

        HomePresenter.setUnreadMsgCount(HomePresenter.getUnreadMsgCount(), this);

        return menu;
    }

    public TextView getShoppingCartDot() {
        return shoppingCartDot;
    }

    public void setShoppingCartDot(int dot) {
        if(dot > 0) {
            getShoppingCartDot().setVisibility(View.VISIBLE);
            getShoppingCartDot().setText(dot + "");
        } else {
            getShoppingCartDot().setVisibility(View.GONE);
        }
    }

    ProgressDialog progressDialog;
    public void showProgressDialog() {
        if(progressDialog == null)
            progressDialog = new ProgressDialog(this);
        if(!progressDialog.isShowing())
            progressDialog = ProgressDialog.show(this, "", "", true, true);
    }

    public void hideProgressDialog() {
        if(progressDialog != null)
            progressDialog.dismiss();
    }

    public void showDialog(String title, String message) {
        showDialog(title, message, false, false);
    }

    public void showDialog(int title, int message) {
        showDialog(getResources().getString(title), getResources().getString(message));
    }

    public void showDialog(int title, int message, boolean backdismiss, boolean aliginLeft) {
        showDialog(getResources().getString(title), getResources().getString(message), backdismiss, aliginLeft);
    }

    public void showDialog(String title, String message, boolean backdismiss, boolean aliginLeft) {
        BaseDialogFragment customDialogFragment = new BaseDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        bundle.putString("message", message);
        customDialogFragment.setArguments(bundle);
        customDialogFragment.backPress = backdismiss;
        customDialogFragment.alignParentLeft = aliginLeft;
        customDialogFragment.show(getSupportFragmentManager(), "");
    }

    public void showDimmedBackground() {
        dimmed.setVisibility(View.VISIBLE);
    }

    public void hideDimmedBackground() {
        dimmed.setOnClickListener(null);
        dimmed.setVisibility(View.GONE);
    }

    ArrayList<DialogFragment> dialogFragmentNeededToShow = new ArrayList<DialogFragment>();

    @Override
    public void onClose() {
        hideDimmedBackground();
    }

    @Override
    public void onOpened() {
        showDimmedBackground();
        if(getRightSlidingMenu().isShown()) {
            WebServiceModel.getInstance(this).requestGetCart(this);
            showProgressDialog();
        }
    }



    class CheckoutNowOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            dialogFragmentNeededToShow.clear();
            CartResponse cartResponse = HomePresenter.getRemoteShoppingCart();
            boolean isOutOfStock = false;
            boolean allCantPurcharse = false;

            ArrayList<CartResponse.Entry> outOfStockList = getOutOfStockList(cartResponse);
            ArrayList<CartResponse.Entry> insufficientList = getInsufficientList(cartResponse);

            Hawk.put("selectedDate", new String());
            Hawk.put("selectedTime", new String());


            if(outOfStockList.size() > 0 || insufficientList.size() > 0)
                isOutOfStock = true;

            ArrayList<CartResponse.Entry> uniqueCantbuyProductList = new ArrayList<>();
            //if(outOfStockList.size() + insufficientList.size() >= cartResponse.getAllEntry().size()) {
            for(int i = 0; i < outOfStockList.size(); i++) {
                if(!uniqueCantbuyProductList.contains(outOfStockList.get(i)))
                    uniqueCantbuyProductList.add(outOfStockList.get(i));
            }

            for(int i = 0; i < insufficientList.size(); i++) {
                if(!uniqueCantbuyProductList.contains(insufficientList.get(i)))
                    uniqueCantbuyProductList.add(insufficientList.get(i));
            }


            if(uniqueCantbuyProductList.size() >= cartResponse.getAllEntry().size())
                allCantPurcharse = true;


            if (cartResponse != null && cartResponse.getHamper() && cartResponse.getReminderCartEntries().size() > 0) { //hamper -> reminder
                HamperNoticeDialogFragment dialogFragment = new HamperNoticeDialogFragment();
                dialogFragment.reminderCartList = cartResponse.getReminderCartEntries();
                dialogFragmentNeededToShow.add(dialogFragment);
            }

            if(isOutOfStock) {
                OutOfStockDialogFragment dialogFragment = new OutOfStockDialogFragment();
                dialogFragment.setOutOfStockList(outOfStockList);
                dialogFragment.setInsufficientList(insufficientList);
                dialogFragment.allCantPurcharse = allCantPurcharse;
                dialogFragmentNeededToShow.add(dialogFragment);
            }

            if (cartResponse != null && cartResponse.getAgeRestriction()) {
                AlcoholAdultOnlyDialogFragment alcoholAdultOnlyDialogFragment = new AlcoholAdultOnlyDialogFragment();
                dialogFragmentNeededToShow.add(alcoholAdultOnlyDialogFragment);
            }

            onEvent(new CheckoutDialogFragmentOnConfirmClickedEvent());
        }
    }

    public boolean showFullScreenAd;
    public void showFullScreenAd(String urlLink, final String colorCode) {
        GATrackerHelper.getInstance(this).setGATracker("full-page-ad");
        Glide.with(this).load(urlLink).into(new SimpleTarget<GlideDrawable>() {
            @Override
            public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                //fullscreenBackground.set

                try {
                    String code = (colorCode.substring(0, 1).equals("#") ? "" : "#") + colorCode;


                    if(code != null && code.length() > 0)
                        fullscreenBackground.setBackgroundColor(Color.parseColor(code));

                } catch (Exception e) {
                    //Log.i("failure", "failure @ color parsing" + e.getMessage());
                    //fullscreenBackground.setBackgroundColor(Color.parseColor("#ffffff"));
                }

                fullScreenAdView.setVisibility(View.VISIBLE);
                imageAd.setImageDrawable(resource);

                AnimationHelper.slideFromBottom(fullScreenAdView);

                if(generatingSlidingMenu(BaseActivity.this).isMenuShowing())
                    generatingSlidingMenu(BaseActivity.this).toggle();
                disableNavigationDrawer();
               // Glide.with(BaseActivity.this).load(resource).into(imageAd);
            }
        });
    }

    @OnClick (R.id.full_screen_ad)
    public void onAdClicked() {
        if(getAdvertisementData() != null) {
            AnimationHelper.slideToBottom(fullScreenAdView);
            fullScreenAdView.setVisibility(View.GONE);
            enableNavigationDrawer();
            WebViewFragment webViewFragment = WebViewFragment.newInstance(getAdvertisementData().getContent());
            webViewFragment.showBackButton = true;
            placeFragmentWithBackStack(webViewFragment);
        }
    }

    public Advertisement.Data getAdvertisementData() {
        if (Hawk.get("advertisement") != null && Hawk.get("advertisement", new Advertisement()).getData() != null) {
            ArrayList<Advertisement.Data> data = Hawk.get("advertisement", new Advertisement()).getData();
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getType().equals("fullscreen"))
                    return data.get(i);
            }
        }
        return null;
    }

    @OnClick (R.id.ad_close)
    public void closeAdOnClick() {
        enableNavigationDrawer();
        AnimationHelper.slideToBottom(fullScreenAdView);
        fullScreenAdView.setVisibility(View.GONE);
    }

    public void onEvent(ShoppingCartSelectAllEvent event) {
        if(event.isSelectAll()) {
            isSelectAll = true;
        } else {
            isSelectAll = false;
        }
    }

    public boolean shoppingCartEditMode;
    public boolean isSelectAll;
    public static boolean editMode;

    public int deleteCount = 0;//rightSlidingListViewAdapter != null ? rightSlidingListViewAdapter.removedData != null ? rightSlidingListViewAdapter.removedData.size() : 0;
    public int updateCount = 0;
    public int totalApiCount = 0;

    class RightShoppingCartDoneEditListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            final TextView editDoneTextView = (TextView) slidingMenu.getSecondaryMenu().findViewById(R.id.right_sliding_menu_edit_textview);
            final TextView editCancelTextView = (TextView) slidingMenu.getSecondaryMenu().findViewById(R.id.right_sliding_menu_cancel_textview);

            editCancelTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    slidingMenu.getSecondaryMenu().findViewById(R.id.checkout_btn_panel).setVisibility(View.VISIBLE);
                    slidingMenu.getSecondaryMenu().findViewById(R.id.my_cart).setVisibility(View.VISIBLE);
                    slidingMenu.setSlidingEnabled(true);

                    editMode = false;
                    shoppingCartEditMode = false;

                    HomePresenter.rightSlidingListViewAdapter.cloneData.clear();

                    EditShoppingCartEvent event = new EditShoppingCartEvent(false);
                    MyApplication.getInstance().mBus.post(event);

                    editCancelTextView.setVisibility(View.GONE);
                   // editDoneTextView.setVisibility(View.GONE);
                    editDoneTextView.setText(R.string.btn_edit);
                    BaseActivity.this.showBasketIcon();
                    HomePresenter.rightSlidingListViewAdapter.notifyDataSetChanged();
                }
            });

            if(editDoneTextView.getText().equals(getString(R.string.btn_edit))) {
                editDoneTextView.setText(R.string.btn_done);
                slidingMenu.getSecondaryMenu().findViewById(R.id.checkout_btn_panel).setVisibility(View.GONE);
                slidingMenu.getSecondaryMenu().findViewById(R.id.my_cart).setVisibility(View.GONE);

                slidingMenu.setSlidingEnabled(false);
                //slidingMenu.getSecondaryMenu().findViewById(R.id.remove_panel).setVisibility(View.VISIBLE);
                //HomePresenter.rightSlidingListViewAdapter.cloneData = HomePresenter.rightSlidingListViewAdapter.data;

                if(rightSlidingListViewAdapter.data != null) {
                    rightSlidingListViewAdapter.cloneData.clear();
                    rightSlidingListViewAdapter.removedData.clear();

                    for (int i = 0; i < rightSlidingListViewAdapter.data.size(); i++) {
                        // if(entry != null && entry.totalPrice != null && entry.totalPrice.getValue() == 0) {
                        if(rightSlidingListViewAdapter.data.get(i) != null && rightSlidingListViewAdapter.data.get(i).totalPrice != null && rightSlidingListViewAdapter.data.get(i).totalPrice.getValue() > 0)
                            rightSlidingListViewAdapter.cloneData.add( new CartResponse.Entry(rightSlidingListViewAdapter.data.get(i)) );
                    }
                }
                swipePosition = -1;
                swipedPositionProductCode = "";

                editMode = true;
                shoppingCartEditMode = true;
                EditShoppingCartEvent event = new EditShoppingCartEvent(true);
                MyApplication.getInstance().mBus.post(event);

                rightSlidingListViewAdapter.notifyDataSetChanged();

                editCancelTextView.setVisibility(View.VISIBLE);
                BaseActivity.this.hideBasketIcon();
            } else {
                slidingMenu.getSecondaryMenu().findViewById(R.id.checkout_btn_panel).setVisibility(View.VISIBLE);
                slidingMenu.getSecondaryMenu().findViewById(R.id.my_cart).setVisibility(View.VISIBLE);

                slidingMenu.setSlidingEnabled(true);

                //my_cart
                deleteCount = rightSlidingListViewAdapter.removedData.size();
                updateCount = 0;
                totalApiCount = 0;

                ArrayList<MiniEntry> miniEntries = new ArrayList<>();

                for(int i = 0; i < rightSlidingListViewAdapter.removedData.size(); i++) {
                    //WebServiceModel.getInstance(BaseActivity.this).deleteShoppingCartEntry(rightSlidingListViewAdapter.removedData.get(i).entryNumber, BaseActivity.this, false);
                    MiniEntry miniEntry = new MiniEntry(rightSlidingListViewAdapter.removedData.get(i).entryNumber, ""+0);
                    miniEntries.add(miniEntry);
                }

                for(int i = 0; i < rightSlidingListViewAdapter.cloneData.size(); i++) {
                    if(rightSlidingListViewAdapter.cloneData.get(i).quantity != (rightSlidingListViewAdapter.data.get(i).quantity)) {
                        updateCount++;
                        MiniEntry miniEntry = new MiniEntry(rightSlidingListViewAdapter.data.get(i).entryNumber, "" + rightSlidingListViewAdapter.cloneData.get(i).quantity);
                        miniEntries.add(miniEntry);

                        // WebServiceModel.getInstance(BaseActivity.this).editShoppingCart(rightSlidingListViewAdapter.data.get(i).entryNumber, rightSlidingListViewAdapter.cloneData.get(i).quantity, BaseActivity.this, false);
                    }
                }

                DeleteCartPostBody deleteCartPostBody = new DeleteCartPostBody();
                deleteCartPostBody.iwaWsCartUpdateForm.entries = miniEntries;
                //if(deleteCount + updateCount > 0)
                WebServiceModel.getInstance(BaseActivity.this).updateShoppingCart( deleteCartPostBody, BaseActivity.this);
                showProgressDialog();


                editDoneTextView.setText(R.string.btn_edit);
                rightSlidingListViewAdapter.data.clear();

                for(int i = 0; i < rightSlidingListViewAdapter.cloneData.size(); i++) {
                    rightSlidingListViewAdapter.data.add(new CartResponse.Entry(rightSlidingListViewAdapter.cloneData.get(i)));
                }

                rightSlidingListViewAdapter.cloneData.clear();
                rightSlidingListViewAdapter.removedData.clear();

                editMode = false;
                shoppingCartEditMode = false;
                EditShoppingCartEvent event = new EditShoppingCartEvent(false);
                MyApplication.getInstance().mBus.post(event);

                rightSlidingListViewAdapter.notifyDataSetChanged();

                editCancelTextView.setVisibility(View.GONE);
                BaseActivity.this.showBasketIcon();
            }
        }
    }

    public void onEvent(AddShoppingCartEvent event) {
        isLoadingCart = false;
        totalApiCount++;
        if(totalApiCount >= updateCount + deleteCount&& updateCount + deleteCount > 0){
            WebServiceModel.getInstance(this).requestGetCart(this);
        }

        if(event.quantity > 0) {
            if(event.quantity > 1) {
                itemAddedTextView.setText(getString(R.string.productlist_fragment_cart_panel_items_added).replace("%s", event.quantity + ""));
            } else {
                itemAddedTextView.setText(getString(R.string.productlist_fragment_cart_panel_item_added).replace("%s", event.quantity + ""));
            }

            moneyNeededForFreeDeliveryTextView.setVisibility(View.INVISIBLE);
            deliveryProgressBar.setVisibility(View.INVISIBLE);

            itemAddedTextView.setVisibility(View.VISIBLE);


            smallProgress.setVisibility(View.GONE);

            isLoadingCart = false;

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    if(!isLoadingCart)
                        AnimationHelper.slideToTop(cartPanel, 95);
                }
            };
            Handler h = new Handler();
            h.postDelayed(runnable, 3000);
        }

        if(event.getSuccess()) {

        } else {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    if(!isLoadingCart)
                        AnimationHelper.slideToTop(cartPanel, 95);
                }
            };
            Handler h = new Handler();
            h.postDelayed(runnable, 3000);
        }
    }

    //@Nullable
    //@OnClick(R.id.basket_level_promotion_button)
    class ShowBasketLevelOnClickDialog implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            CartResponse cartResponse = HomePresenter.getRemoteShoppingCart();
            if(cartResponse.getRecievedPromotion() != null && cartResponse.getRecievedPromotion().size() > 0) {
                BasketLevelPromotionDialogFragment basketLevelPromotionDialogFragment = new BasketLevelPromotionDialogFragment();
                basketLevelPromotionDialogFragment.setPromotionList(cartResponse.getRecievedPromotion());
                basketLevelPromotionDialogFragment.setCartResponse(cartResponse);
                basketLevelPromotionDialogFragment.show(getSupportFragmentManager(), "");
            }
        }
    }

    public void onEvent(CheckoutDialogFragmentOnConfirmClickedEvent checkoutDialogFragmentOnConfirmClickedEvent) {
        if(!GlobalConstant.isLogin){
            closeDrawer();
            LoginFragment lf = new LoginFragment();
            lf.goBackToCheckout = true;
            placeFragmentWithBackStack(lf);
        } else if(dialogFragmentNeededToShow.size() > 0) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    dialogFragmentNeededToShow.get(0).show(getSupportFragmentManager(), "");
                    dialogFragmentNeededToShow.remove(0);
                }
            };
            runnable.run();
        } else {
            closeDrawer();
            //if(MemberHelper.getLoginResponse().getMemberProfile().hasSufficientInformation()) {
            placeFragmentWithBackStack(new CheckoutDeliveryMethodFragment());
            //} else
            //    placeFragmentWithBackStack(new CheckoutYourDetailFragment());
        }
    }

    public void hideShoppingCartButton() {
        shoppingCartButton.setVisibility(View.GONE);
    }
    public void showShoppingCartButton() {
        shoppingCartButton.setVisibility(View.VISIBLE);
    }

    public ArrayList<CartResponse.Entry> getOutOfStockList(CartResponse cartResponse) {
        ArrayList<CartResponse.Entry> outOfStockList = new ArrayList<CartResponse.Entry>();
        for(int i = 0; i < cartResponse.getAllEntry().size(); i++) {
            if(!cartResponse.getEntry(i).product.hasStock())
                outOfStockList.add(cartResponse.getEntry(i));
        }
        return outOfStockList;
    }

    public ArrayList<CartResponse.Entry> getInsufficientList(CartResponse cartResponse) {
        ArrayList<CartResponse.Entry> insufficientList = new ArrayList<CartResponse.Entry>();

        for(int i = 0; i < cartResponse.getAllEntry().size(); i++) {
            if(cartResponse.getEntry(i).quantity > cartResponse.getEntry(i).product.getMaxAllowedBuyQty()) {
                insufficientList.add(cartResponse.getEntry(i));
            }
            //   insufficientList.add(cartResponse.getEntry(i).product);
        }

        return insufficientList;
    }

    public void goToContentTypeFragment(Advertisement.Data data) {
        String contentType = data.getContent_type();

        CategoryDrawerItem categoryDrawerItem = new CategoryDrawerItem("0", data.getTitle(), data.getTitle_en());
        categoryDrawerItem.setImgUrl(data.getImage());
        SubCategory subCategory = categoryDrawerItem.getSubCategory();
        subCategory.setContentType(contentType);
        subCategory.setValue(data.getContent());
        categoryDrawerItem.setSubCategory(subCategory);

        if(data.getType().equals(GlobalConstant.NEW_PROMOTION) || data.getType().equals(GlobalConstant.ONLINE_PROMOTION)) {
            categoryDrawerItem.setImgUrl(data.getImage());
        }

        handleCategoryFragmentSwitch(contentType, data.getContent(), categoryDrawerItem);
    }

    public void handleCategoryFragmentSwitch(String contentType, String content, CategoryDrawerItem categoryDrawerItem, List<CategoryDrawerItem> groupData, int position) {
        //if(contentType.equals(GlobalConstant.PROMTOION)) {
            /*SubCategory subCategory = new SubCategory();
            subCategory.setValue(categoryDrawerItem.getContent());
            subCategory.setContentType(contentType);

            CategoryHighLightFragment categoryHighLightFragment = CategoryHighLightFragment.newInstance(subCategory);
            categoryHighLightFragment.id = Integer.valueOf(categoryDrawerItem.getContent());
            categoryHighLightFragment.groupData = groupData;
            categoryHighLightFragment.childPosition = position;
            this.addFragmentToTop(categoryHighLightFragment);*/
        //} else {
        handleCategoryFragmentSwitch(contentType, content, categoryDrawerItem);
        //}
    }

    public void handleCategoryFragmentSwitch(String contentType, String content, CategoryDrawerItem categoryDrawerItem) {
        //Log.i("contentType" , "[contentType] switch " + contentType);
        //Log.i("contentType" , "[contentType] categoryDrawerItem " + categoryDrawerItem.getTagGA());

        if(contentType == null) return;

        if(contentType.equals(GlobalConstant.RECIPLE)) {
            RecipeMainFragment recipeMainFragment = new RecipeMainFragment();
            recipeMainFragment.categoryDrawerItem = categoryDrawerItem;
            placeFragmentWithBackStack(recipeMainFragment);
        }

        if(contentType.equals(GlobalConstant.NEW_PROMOTION) || contentType.equals(GlobalConstant.ONLINE_PROMOTION) ||contentType.equals(GlobalConstant.CATEGORY) || contentType.equals(GlobalConstant.PROMOTION_TAG) || contentType.equals(GlobalConstant.BRAND) || contentType.equals(GlobalConstant.CUSTOMIZE_PRODUCT)) {//1
            //ProductListFragment productListFragment = ProductListFragment.newInstance(data.getContent(), data.getTitle());
            ProductListFragment productListFragment = ProductListFragment.newInstance(0, categoryDrawerItem, false);
            productListFragment.showBackButton = true;
            productListFragment.showProgressDialog = true;
            if(contentType.equals(GlobalConstant.NEW_PROMOTION) || contentType.equals(GlobalConstant.ONLINE_PROMOTION))
                productListFragment.headerImage = categoryDrawerItem.getImgUrl();
            productListFragment.setGATag(categoryDrawerItem.getTagGA());
            placeFragmentWithBackStack(productListFragment);
        }

        if(contentType.equals(GlobalConstant.HAPPY_TIME)) {
            //showProgressDialog();
            ProductListFragment productListFragment = ProductListFragment.newInstance(0, categoryDrawerItem, false);
            //Product.PromotionData promotionData = new Product.PromotionData();
            productListFragment.showBackButton = true;

            productListFragment.showProgressDialog = true;
            productListFragment.setGATag(categoryDrawerItem.getTagGA());
            placeFragmentWithBackStack(productListFragment);

            //WebServiceModel.getInstance(this).requestGetPromotion(this, "2", "happytime", content, categoryDrawerItem, this.hashCode());
        }

        /*
        if(contentType.equals(GlobalConstant.PROMTOION)) {
            SubCategory subCategory = new SubCategory();
            subCategory.setValue(categoryDrawerItem.getContent());
            subCategory.setContentType(contentType);

            CategoryHighLightFragment categoryHighLightFragment = CategoryHighLightFragment.newInstance(subCategory);
            categoryHighLightFragment.id = Integer.valueOf(categoryDrawerItem.getContent());
            this.addFragmentToTop(categoryHighLightFragment);
        }
*/
        //ProductListFragment plf = (ProductListFragment.newInstance(null, promotionEvent.getPromotionResponse().getData().get(position), mSubCategory, CategoryHighLightFragment.this.id, title, false));
        //plf.isCrazySale = true;
        //CategoryHighLightFragment.this.placeFragmentWithBackStack(plf);

        if(contentType.equals("url")) {
            WebViewFragment webViewFragment = WebViewFragment.newInstance(content);
            webViewFragment.title = categoryDrawerItem.getName();
            webViewFragment.showBackButton = true;
            placeFragmentWithBackStack(webViewFragment);
        }


        if(contentType.equals("html")) {

            WebViewFragment webViewFragment = WebViewFragment.newInstance(content, false);
            webViewFragment.title = categoryDrawerItem.getName();
            Bundle bundle = new Bundle();
            bundle.putString("html_content", content);
            webViewFragment.setArguments(bundle);
            webViewFragment.showBackButton = true;
            placeFragmentWithBackStack(webViewFragment);
        }

        if(contentType.equals("hybrisproduct")) {
            ProductListFragment pf = ProductListFragment.newInstance((content), false);
            LogUtil.info("", "getGATagq13:"+categoryDrawerItem.getTagGA());
            pf.setGATag(categoryDrawerItem.getTagGA());
            pf.showBackButton = true;
            pf.showProgressDialog = true;
            pf.titleString = categoryDrawerItem.getName();
            placeFragmentWithBackStack(pf);
        }
    }


    /*
    public void onEvent(PromotionEvent promotionEvent) {
        hideProgressDialog();
        if(promotionEvent.getSuccessCode() == this.hashCode() && promotionEvent.getSuccess()) {
            PromotionResponse promotionResponse = promotionEvent.getPromotionResponse();
            ArrayList<PromotionResponse.Data> data = promotionResponse.getData();
            int requestedId = Integer.valueOf(promotionEvent.getCategoryDrawerItem().getSubCategory().getValue());

            for(int i = 0; i < data.size(); i++) {
                if(requestedId == data.get(i).id) {
                    Log.i("requestedId", "requestId" + requestedId + " " + data.get(i).id);
                    //ProductListFragment plf = (ProductListFragment.newInstance(promotionEvent.getPromotionResponse().getData().get(position), mSubCategory, CategoryHighLightFragment.this.id, title, false));

                    ProductListFragment productListFragment = ProductListFragment.newInstance( data.get(i), promotionEvent.getCategoryDrawerItem().getSubCategory(), Integer.valueOf(promotionEvent.getCategoryDrawerItem().getSubCategory().getValue()) , "", false);
                    placeFragmentWithBackStack(productListFragment);
                    break;
                }
            }
        }
    }*/

    public void onEvent(CartEvent event) {
        HomePresenter.cartResponseToGATrackerData(event.getCartResponse());

        TextView editDoneTextView = (TextView) slidingMenu.getSecondaryMenu().findViewById(R.id.right_sliding_menu_edit_textview);

        if(event.getCartResponse().getAllEntry().size() == 0) {
            shoppingCartEditMode = false;
            editDoneTextView.setVisibility(View.GONE);
            editDoneTextView.setText(getString(R.string.btn_edit));
        } else {
            editDoneTextView.setVisibility(View.VISIBLE);
        }

        hideProgressDialog();
        LogUtil.info("", "BaseActivitycartEvententry:"+event.getCartResponse().getAllEntry().size());

        GATrackerHelper.getInstance(this).initProductsList();
        for(int i = 0; i < event.getCartResponse().getAllEntry().size(); i++){
            CartResponse.Entry cartProduct= event.getCartResponse().getAllEntry().get(i);
            com.google.android.gms.analytics.ecommerce.Product product = new com.google.android.gms.analytics.ecommerce.Product();
            product.setId("bp_" + cartProduct.product.getCode());
            product.setBrand(cartProduct.product.getBrandName());
            product.setCategory(cartProduct.product.getUrl());
            product.setVariant(cartProduct.product.getVariantType());
            product.setPrice(cartProduct.product.getPriceValue());
            product.setQuantity(event.getCartResponse().getQuantity(i));
            product.setCustomDimension(1, GlobalConstant.language);
            if(event.getCartResponse().getAppliedCouponCode() != null && event.getCartResponse().getAppliedCouponCode()[0].length() > 0) {
                String couponCodes = "";
                for(String code : event.getCartResponse().getAppliedCouponCode()){
                    couponCodes += code;
                }
                product.setCouponCode(couponCodes);
            }
            GATrackerHelper.getInstance(this).addProducts(product);
        };

        // Log.i("yoyoyoyo", "yoyyooyyo" + event.getType());
        //super.onEvent(event);
        /*
        if(event.getSuccess()) {
            CartResponse cartResponse = event.getCartResponse();
            int totalItem = cartResponse.getAllEntry().size();
            if (event.getType().equals("add") || (event.getType().equals("edit")) ) {

                itemAddedTextView.setText(getString(R.string.productlist_fragment_cart_panel_item_added).replace("%s", totalItem + ""));

                //if(Float.parseFloat(cartResponse.getTotalPrice().replace(",", "").substring(3)) >= 500)
                //    moneyNeededForFreeDeliveryTextView.setText(getString(R.string.you_can_enjoy_free_delivery));
                //else
                //    moneyNeededForFreeDeliveryTextView.setText(getString(R.string.productlist_fragment_cart_panel_money_for_free_delivery).replace("%s", String.format("%.2f",500 - Float.parseFloat(cartResponse.getTotalPrice().substring(3))) + ""));

                moneyNeededForFreeDeliveryTextView.setVisibility(View.INVISIBLE);
                deliveryProgressBar.setVisibility(View.INVISIBLE);

                itemAddedTextView.setVisibility(View.VISIBLE);

                //AnimationHelper.slideFromTop(cartPanel, 95);

                //deliveryProgressBar.setProgress((int)(Float.parseFloat(cartResponse.getTotalPrice().replace(",", "").substring(3)) / 500 * 100));
                //Log.i("yoyoyoyo", "yoyyooyyo" + event.getType() + "add animation");

                smallProgress.setVisibility(View.GONE);

                isLoadingCart = false;

                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if(!isLoadingCart)
                            AnimationHelper.slideToTop(cartPanel, 95);
                    }
                };
                Handler h = new Handler();
                h.postDelayed(runnable, 3000);
            }
        } else*/ {
            //AnimationHelper.slideToTop(cartPanel, 95);
        }
    }

    public void onEvent(LogoutEvent logoutEvent){
        clearUserInfo();
        // Update left menu
        MyApplication.getInstance().mBus.post(new CategoryTreeEvent());

        addFragmentToTop(new HomeFragment());
    }

    public void clearUserInfo(){
        if(MemberHelper.getMemberProfile() != null && MemberHelper.getMemberProfile().getUid() != null)
            WebServiceModel.getInstance(this).requestBindUser(MemberHelper.getMemberProfile().getUid(), "");
        MemberHelper.saveLoginResponse(null);
        MemberHelper.saveUserToken(this, null);
        MemberHelper.setLogin(this, MemberHelper.LOGOUT);
        MemberHelper.saveUserInfo(this, null, null, false);
        MemberHelper.saveSiebelCardNumber(this, null);
        MemberHelper.saveCardNumber(this, null);
        MemberHelper.saveCardPwd(this, null);
        MemberHelper.setMemberProfile(null);
        MemberHelper.setLogout(this);
        RegisterHelper.clear();
        GlobalConstant.isLogin = false;
        GlobalConstant.isMoneybackCardLogin = false;
        GlobalConstant.moneybackCardToken = null;
        Hawk.put(AppUtils.grocery_list, null);
        WebServiceModel.getInstance(this).destroyServiceModel();
    }

    public Location mCurrentLocation;

    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

    public boolean checkPlayServices() {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(this);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (apiAvailability.isUserResolvableError(resultCode)) {
//                apiAvailability.getErrorDialog(getActivity(), resultCode, PLAY_SERVICES_RESOLUTION_REQUEST)
//                        .show();
            } else {
//                Log.i(TAG, "This device is not supported.");
//                finish();
            }
            return false;
        }
        return true;
    }

    public void getInboxMsg(String refId){
        if(GlobalConstant.isLogin && !TextUtils.isEmpty(TokenHelper.getToken())){
//            showProgressDialog();
            WebServiceModel.getInstance(this).requestGetInboxMsg(refId);
        }else{
            HomePresenter.setUnreadMsgCount(0, this);
        }
    }

    // Update left menu inbox badge
    public void onEvent(InboxResponseEvent inboxResponseEvent) {
        if(inboxResponseEvent.getSuccess()){
            int unreadMsg = 0;
            for(int i = 0; i < inboxResponseEvent.getInboxResponse().getData().size() ; i++){
                if(inboxResponseEvent.getInboxResponse().getData().get(i).getStatus().equals("UNREAD"))
                    unreadMsg++;
            }
            HomePresenter.setUnreadMsgCount(unreadMsg, this);
        }
    }

    public void onEvent(ToastEvent toastEvent) {
        ToastUtils.show(this, toastEvent.getMessage());
    }


    public static String MENU_KEYPROMOTION = "MENU_KEYPROMOTION";
    public static String MENU_INSTOREPROMOTION = "MENU_INSTOREPROMOTION";
    public static String MENU_MONEYBACK = "MENU_MONEYBACK";
    public static String MENU_RECIPE = "MENU_RECIPE";
    public static String MENU_MYACCOUNT = "MENU_MYACCOUNT";

    public void onEvent( ConfigEvent configEvent) {
        final ConfigEvent myConfigEvent = configEvent;

        Runnable run = new Runnable() {
            @Override
            public void run() {

                Config config =  myConfigEvent.getConfig();
                Hawk.put("config", config);

                if(config != null && config.data != null) {
                    for(int i = 0; i < config.data.size(); i++) {
                        if(config.data.get(i).key.equals(MENU_KEYPROMOTION)) {
                            Hawk.put(MENU_KEYPROMOTION, Boolean.parseBoolean(config.data.get(i).getValue()));
                            //Log.i("MENU_KEYPROMOTION", config.data.get(i).getValue());
                        }
                        if(config.data.get(i).key.equals(MENU_INSTOREPROMOTION)) {
                            Hawk.put(MENU_INSTOREPROMOTION, Boolean.parseBoolean(config.data.get(i).getValue()));
                            //Log.i("MENU_INSTOREPROMOTION", config.data.get(i).getValue());
                        }

                        if (config.data.get(i).key.equals(MENU_MONEYBACK)) {
                            Hawk.put(MENU_MONEYBACK, Boolean.parseBoolean(config.data.get(i).getValue()));
                            //Log.i("MENU_MONEYBACK", config.data.get(i).getValue());
                        }

                        if(config.data.get(i).key.equals(MENU_RECIPE)) {
                            Hawk.put(MENU_RECIPE, Boolean.parseBoolean(config.data.get(i).getValue()));
                            //Log.i("MENU_RECIPE", config.data.get(i).getValue());
                        }

                        if(config.data.get(i).key.equals(MENU_MYACCOUNT)) {
                            Hawk.put(MENU_MYACCOUNT, Boolean.parseBoolean(config.data.get(i).getValue()));
                            //Log.i("MENU_MYACCOUNT", config.data.get(i).getValue());
                        }

                    }
                }
            }
        };
        AsyncTask.execute(run);
    }
}
