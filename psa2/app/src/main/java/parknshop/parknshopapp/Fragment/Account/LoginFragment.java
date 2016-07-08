package parknshop.parknshopapp.Fragment.Account;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.WishListUpdatedEvent;
import parknshop.parknshopapp.Fragment.Grocery.GroceryMainTabFragment;
import parknshop.parknshopapp.Fragment.Home.HomeFragment;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Fragment.MemberZone.MemberCardFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.Model.LoginResponse;
import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.RegisterHelper;
import parknshop.parknshopapp.Rest.event.CategoryTreeEvent;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import parknshop.parknshopapp.Rest.event.GroceryListEvent;
import parknshop.parknshopapp.Rest.event.LoginEvent;
import parknshop.parknshopapp.TokenHelper;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.FixedFontStyleEditText;
import parknshop.parknshopapp.WebServiceModel;
import parknshop.parknshopapp.common.MemberHelper;

/**
 * Created by chrisyu on 15/3/16.
 */
public class LoginFragment extends BaseFragment {
    public boolean goBackToCheckout;
    @Bind(R.id.userid)
    FixedFontStyleEditText userID;
    @Bind(R.id.password)
    FixedFontStyleEditText password;
    @Bind(R.id.remember_me_unselected) ImageView remember_me_unselected;
    @Bind(R.id.remember_me_selected) ImageView remember_me_selected;
    @Bind(R.id.background) ImageView background;

    String entryFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_login_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("login");

        ButterKnife.bind(this, view);
        Glide.with(this).load(R.drawable.sign_in_bg).into(background);
        disableNavigationDrawer();
        //userID.setText("qurresavaf-3853@yopmail.com");
        //password.setText("Ab1234");

        //userID.setText("jack_kwok@mtelnet.com");
        //password.setText("1234aA");

        //userID.setText("chi_ng@mtelnet.com");
        //password.setText("Mtel12");

        //ecoupon
        //userID.setText("hevutirradde-6079@yopmail.com");
        //password.setText("Q1234q");

        //userID.setText("ulyffebaw-6123@yopmail.com");
        //password.setText("Ab1234");

        //userID.setText("gggkjewrl@hrjk.com");
        //password.setText("Ab1234");

        if(getArguments() != null){
            entryFragment = getArguments().getString("from");
        }

        password.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE || actionId == 0) {

                    hideKeyboard();
                    login();
                }
                return false;
            }
        });

        getBaseActivity().editTextGetFocus(userID);

        return view;
    }

    public void onResume() {
        super.onResume();
        hideToolbar();
    }

    public void onPause(){
        super.onPause();
        showToolbar();
    }

    @OnClick(R.id.remember_me)
    public void rememberMe() {
        boolean isVisible = remember_me_unselected.getVisibility() == View.VISIBLE;
        if(isVisible) {
            remember_me_unselected.setVisibility(isVisible ? View.GONE : View.VISIBLE);
            remember_me_selected.setVisibility(isVisible ? View.VISIBLE : View.GONE);
        } else {
            remember_me_unselected.setVisibility(isVisible ? View.GONE : View.VISIBLE);
            remember_me_selected.setVisibility(isVisible ? View.VISIBLE : View.GONE);
        }
        MemberHelper.rmbLogin(isVisible);
    }

    @OnClick (R.id.txtForgetPwd)
    public void txtForgetPwd() {
        placeFragmentWithBackStack(new ForgetPasswordFragment());
    }

    @OnClick (R.id.registration_panel)
    public void registrationPanel() {
//        placeFragmentWithBackStack(new NewAccountFragment());
        RegisterHelper.clear();
        Bundle bundle = new Bundle();
        bundle.putInt("isMoneyBack", RegisterPageBasicFragment.NORMAL_USER);
        RegisterPageBasicFragment fragment = new RegisterPageBasicFragment();
        fragment.setArguments(bundle);
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.back)
    public void back() {
        getActivity().onBackPressed();
    }

    @OnClick(R.id.login_btn)
    public void login() {
        if(TextUtils.isEmpty(userID.getText().toString().trim())) {
            ToastUtils.show(getActivity(), getResources().getString(R.string.email_empty));
            return;
        }
        if(TextUtils.isEmpty(password.getText().toString().trim())) {
            ToastUtils.show(getActivity(), getResources().getString(R.string.password_empty));
            return;
        }

//        showLoadingView();
        showLoadingBtnLoading();
        WebServiceModel.getInstance(getActivity()).requestLoginUser(userID.getText().toString(), password.getText().toString());
    }

    public void onEvent(LoginEvent loginEvent){
        LoginResponse loginResponse = loginEvent.getLoginResponse();
        if(loginEvent.getSuccess()){
            MemberHelper.saveLoginResponse(loginResponse);
            MemberHelper.saveUserToken(getActivity(), loginEvent.getLoginResponse().token);
            MemberHelper.setLogin(getActivity(), loginResponse.customer.iMember ?
                    MemberHelper.IMEMBER : MemberHelper.MEMBER);

            MemberProfile memberProfile = loginResponse.customer;
            MemberHelper.saveUserInfo(getActivity(), memberProfile.name, memberProfile.getGender(), memberProfile.isMale());
            MemberHelper.saveSiebelCardNumber(getActivity(), loginResponse.customer.siebelCardNumber);

            if (loginResponse.customer.iMember) {
                MemberHelper.saveCardNumber(getActivity(), loginResponse.customer.cardNumber);
                MemberHelper.saveCardPwd(getActivity(), password.getText().toString());
//                performIMemberRequest(loginResponse.customer.cardNumber, password.getText().toString());
            } else {
//                performGetWishList();
//                WebServiceModel.getInstance(getActivity()).re(userID.getText().toString(), password.getText().toString());
            }

            GlobalConstant.isLogin = true;
            HomePresenter.prepareListData((CategoryTree) Hawk.get("categoryTree"), this);
            //BindUser
            WebServiceModel.getInstance(getActivity()).requestBindUser(loginResponse.getMemberProfile().getUid(), TokenHelper.getToken());

            if(loginResponse.getMemberProfile().isNeedCartMerge()){
                hideLoadingView();
                showMergeCardDialog();
            }else{
                goNextStep();
            }

        } else {
            hideLoadingBtnLoading();
            hideLoadingView();
            ToastUtils.show(getActivity(), loginEvent.getMessage());
        }

    }

    public void goNextStep(){
        if(goBackToCheckout) {
            hideProgressDialog();
            hideLoadingView();
            hideLoadingBtnLoading();
            getBaseActivity().onBackPressed();
        }else {
            // get the current wishlists, check if any wishlist created before
            showProgressDialog();
            WebServiceModel.getInstance(getActivity()).requestGetWishList(getActivity(), "", null);
        }

    }

    public void onEvent(EmptyJsonEvent event) {
        hideProgressDialog();
        if(event.getType().equals("mergeCart") /*&& event.getSuccess()*/) {
            goNextStep();
        }
    }

    public void onEvent(WishListUpdatedEvent wishListUpdatedEvent){
        // get the static wishlists
        WebServiceModel.getInstance(getActivity()).requestGetGroceryList(getActivity());
    }

    public void onEvent(GroceryListEvent groceryListEvent){
        if(groceryListEvent.getSuccess()){

            ArrayList<WishListResponse> wishListResponsesList = new ArrayList<>();
            for(int i = 0 ; i < groceryListEvent.getGroceryList().getData().size(); i++){
                WishListResponse wishListResponse = new WishListResponse();
                wishListResponse.setName(groceryListEvent.getGroceryList().getData().get(i).getTitle());
                wishListResponse.setPrimaryKey(groceryListEvent.getGroceryList().getData().get(i).getTitle().hashCode() + "");
                wishListResponse.setStaticList(true);
                for(int j = 0 ; j < groceryListEvent.getGroceryList().getData().get(i).getGroceryItem().size(); j++){
                    Product product = new Product();
                    product.setCode(groceryListEvent.getGroceryList().getData().get(i).getGroceryItem().get(j).getProductId());
                    wishListResponse.addProduct(product);
                }
                wishListResponsesList.add(wishListResponse);
            }

//            // Get the downloaded list
//            WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_static_list);
//            for(int i = 0; i < wishListResponses.length; i++){
//                wishListResponsesList.add(wishListResponses[i]);
//            }

            // Save the Grocery list
            WishListResponse[] tempWishListResponses = new WishListResponse[wishListResponsesList.size()];
            for(int i = 0; i < wishListResponsesList.size(); i++){
                tempWishListResponses[i] = wishListResponsesList.get(i);
            }
            Hawk.put(AppUtils.grocery_static_list, tempWishListResponses);

            goToNextPage();

            // Update left menu
            MyApplication.getInstance().mBus.post(new CategoryTreeEvent());

        }else{
            ToastUtils.show(getActivity(), groceryListEvent.getMessage());
        }
        hideLoadingView();

    }

    public void goToNextPage(){
        hideLoadingBtnLoading();
        if(entryFragment == null){
            addFragmentToTop(new HomeFragment());
        }else
        if(entryFragment.equals("GroceryList")){
            addFragmentToTop(new GroceryMainTabFragment());
        }else if (entryFragment.equals("MemberZone")) {
            addFragmentToTop(new MemberCardFragment());
        }else if(entryFragment.equals("backPreviousPage")){
            getActivity().onBackPressed();
        }
    }

    public void showMergeCardDialog(){
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.dialog_normal, null);
        final Dialog mDialog = new Dialog(getActivity());
        TextView txtMsg = (TextView) layout.findViewById(R.id.txtMsg);
        TextView btnCancel = (TextView) layout.findViewById(R.id.btnCancel);
        TextView btnCreate = (TextView) layout.findViewById(R.id.btnCreate);

        txtMsg.setText(getString(R.string.login_page_merge_cart));

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
                goNextStep();
            }
        });
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
                showProgressDialog();
                WebServiceModel.getInstance(getBaseActivity()).requestGetmergeCart(LoginFragment.this.getBaseActivity());
            }
        });
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(layout);
        mDialog.show();
    }

}
