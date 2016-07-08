package parknshop.parknshopapp.Fragment.MemberZone;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Contacts.ContactUsFragment;
import parknshop.parknshopapp.Fragment.MemberZone.View.MemberZoneCardView;
import parknshop.parknshopapp.Fragment.MemberZone.View.MemberZoneIconTitle;
import parknshop.parknshopapp.Fragment.Settings.SettingTNCFragment;
import parknshop.parknshopapp.Fragment.WebView.WebViewFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Utility;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.GetMoneyBackCardProfileEvent;
import parknshop.parknshopapp.Rest.event.GetProfileEvent;
import parknshop.parknshopapp.Rest.event.LogoutEvent;
import parknshop.parknshopapp.Rest.event.TNCResponseEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;
import parknshop.parknshopapp.common.MemberHelper;

/**
 * Created by chrisyu on 11/4/16.
 */
public class MemberCardFragment extends BaseFragment {
    @Bind(R.id.memberZoneCardView)
    MemberZoneCardView memberZoneCardView;
    @Bind(R.id.rlLinkMoneyBack) RelativeLayout rlLinkMoneyBack;
    @Bind(R.id.rlMoneyBackCard) RelativeLayout rlMoneyBackCard;
    @Bind(R.id.btnMemberNotice) MemberZoneIconTitle btnMemberNotice;
    @Bind(R.id.extra_padding) View extraPadding;

    String memberTitle = "";
    String memberNoticeContent = "";
    TNCResponseEvent mTNCResponseEvent;

    View view;
    public void onCreate(Bundle savedBundle) {
        super.onCreate(savedBundle);
        view = getActivity().getLayoutInflater().inflate(R.layout.member_card_fragment_layout, null);
        ButterKnife.bind(this, view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        showMenuButton();
        showToolbar();
        enableNavigationDrawer();
        setToolbarTitle(getString(R.string.home_activity_sliding_menu_my_account));
        disableSecondRightButton();
        disableSearchButton();
        disableCartButton();


        // Show the logout btn in left menu //lag
        //HomePresenter.prepareListData((CategoryTree) Hawk.get("categoryTree"), this);

        if(MemberHelper.getMemberProfile() != null){
            //updateTopView();
        }

        return view;
    }

    public int apiCalled = 0;
    public int apiRececieved = 0;

    @Override
    public void onResume() {
        super.onResume();
        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestGetProfile(getActivity());
//        WebServiceModel.getInstance(getBaseActivity()).getEcouponAndEVouchers(getBaseActivity());
        WebServiceModel.getInstance(getActivity()).requestGetMoneyBackProfile(getActivity());

        apiCalled = 2;

        if(mTNCResponseEvent == null) {
            apiCalled = 3;
            WebServiceModel.getInstance(getActivity()).requestGetTNC();
        } else {
            onEvent(mTNCResponseEvent);
        }
    }

    public void onEvent(GetProfileEvent getProfileEvent) {
        hideProgressDialogNeeded();
        if (getProfileEvent.getSuccess()) {
            if(GlobalConstant.isLogin && !GlobalConstant.isMoneybackCardLogin) // dont save if only login as moneyback card
                MemberHelper.setMemberProfile(getProfileEvent.getMemberProfile());
            updateTopView();
        }
    }

    @Nullable @Bind(R.id.txtPoint) TextView txtPoint;
    public void onEvent(GetMoneyBackCardProfileEvent getMoneyBackCardProfileEvent) {
        hideProgressDialogNeeded();
        if(getMoneyBackCardProfileEvent.getSuccess()) {
            memberZoneCardView.setPoints(getMoneyBackCardProfileEvent.getMemberProfile().getPoints());
            txtPoint.setText(getMoneyBackCardProfileEvent.getMemberProfile().getPoints());
            memberZoneCardView.setValidThru(Utility.formatDate(Utility.WATSON_TIME_FORMAT, Utility.DEFAULT_DATE_FORMAT, getMoneyBackCardProfileEvent.getMemberProfile().getPointsExpiryDate()));
        }
    }

    public void hideProgressDialogNeeded() {
        apiRececieved++;
        if(apiRececieved >= apiCalled) {
            hideProgressDialog();
            apiRececieved = 0;
            apiCalled = 0;
        }
    }


//    public void onEvent(ECouponEvent eCouponEvent) {
//
//        if(eCouponEvent.getSuccess()) {
//            ECouponResponse eCouponResponse = (ECouponResponse) eCouponEvent.getDataObject();
//            memberZoneCardView.setPoints(eCouponResponse.getLoyaltyPoint().getPointsToMoney() + "");
//        }
//    }

    public void updateTopView(){
        LogUtil.info("", "isiMember:"+MemberHelper.getMemberProfile().isiMember());
        if(MemberHelper.getMemberProfile().isiMember()) {

            if(Hawk.get(BaseActivity.MENU_MYACCOUNT, false)) {
                rlMoneyBackCard.setVisibility(View.VISIBLE);
            } else {
                rlMoneyBackCard.setVisibility(View.GONE);
            }

            //rlLinkMoneyBack.setVisibility(View.GONE);
            extraPadding.setVisibility(View.VISIBLE);
            memberZoneCardView.setCardNo(MemberHelper.getMemberProfile().getMemberNumber());
            //GATrackerHelper.getInstance(getActivity()).setGATracker("my-account-without-card");
        }else{
            rlMoneyBackCard.setVisibility(View.GONE);
            rlLinkMoneyBack.setVisibility(View.VISIBLE);
            extraPadding.setVisibility(View.GONE);
            //GATrackerHelper.getInstance(getActivity()).setGATracker("my-account-with-card");
        }

    }

    @OnClick(R.id.btnLinkMoneyBack)
    public void btnLinkMoneyBack(){
        placeFragmentWithBackStack(new MemberLinkMoneyBackCardFragment());
    }

    @OnClick(R.id.btnApplyMoneyBack)
    public void btnApplyMoneyBack(){
        String postfix = "";//"?uiel=Mobile&lang=" + (GlobalConstant.language.equals(GlobalConstant.LANG_ZH) ? "zt" : "en");
        WebViewFragment webViewFragment = WebViewFragment.newInstance("https://www.moneyback.com.hk/Web/PageFrame.do" + postfix);
        webViewFragment.showBackButton = true;
        placeFragmentWithBackStack(webViewFragment);
    }

    @OnClick(R.id.my_account)
    public void goToMemberAccountPage(){
        MemberAccountFragment fragment = new MemberAccountFragment();
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.membership_card)
    public void goToMembershipCardPage(){
        MembershipCardFragment fragment = new MembershipCardFragment();
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.order_history)
    public void goToOrderHistoryPage(){
        OrderHistoryFragment fragment = new OrderHistoryFragment();
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.payment_method)
    public void goToPaymentPage(){
        MemberPaymentFragment fragment = new MemberPaymentFragment();
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.delivery_address)
    public void goToAddressPage(){
        MemberAddressFragment fragment = new MemberAddressFragment();
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.btnContactsUs)
    public void btnContactUs(){
        ContactUsFragment fragment = new ContactUsFragment();
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.btnFAQ)
    public void btnFAQ(){
//        MemberFAQFragment fragment = new MemberFAQFragment();
//        placeFragmentWithBackStack(fragment);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/faq");

        String postfix = "?uiel=Mobile&lang=" + (GlobalConstant.language.equals(GlobalConstant.LANG_ZH) ? GlobalConstant.LANG_ZH : GlobalConstant.LANG_EN);

        WebViewFragment webViewFragment = WebViewFragment.newInstance("http://www.parknshop.com/FAQ" + postfix);
        webViewFragment.showBackButton = true;
        webViewFragment.title = getString(R.string.faq);
        placeFragmentWithBackStack(webViewFragment);
    }

    @OnClick(R.id.btnMemberNotice)
    public void btnMemberNotice(){

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/member-notice");

        SettingTNCFragment fragment = new SettingTNCFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", memberTitle);
        bundle.putString("tnc", memberNoticeContent);
        fragment.setArguments(bundle);
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.btneCouponeVoucher)
    public void btneCouponeVoucher(){
        MembereCouponeVoucherFragment fragment = new MembereCouponeVoucherFragment();
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.btnLogout)
    public void btnLogout(){
        logoutDialog();
    }

    public void logoutDialog() {
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.dialog_quit, null);
        final Dialog mDialog = new Dialog(getActivity());

        TextView txtTitle = (TextView) layout.findViewById(R.id.txtTitle);
        TextView txtMsg = (TextView) layout.findViewById(R.id.txtMsg);
        TextView btnCancel = (TextView) layout.findViewById(R.id.btnCancel);
        TextView btnOK = (TextView) layout.findViewById(R.id.btnOK);

        txtTitle.setText(getString(R.string.logout_dialog_title));
        txtMsg.setVisibility(View.VISIBLE);
        txtMsg.setText(getString(R.string.logout_dialog_msg));

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
                MyApplication.getInstance().mBus.post(new LogoutEvent());
            }
        });

        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(layout);
        mDialog.show();

    }

    public void onEvent(TNCResponseEvent mTNCResponseEvent) {
        hideProgressDialogNeeded();
        if(mTNCResponseEvent.getSuccess()){
            this.mTNCResponseEvent = mTNCResponseEvent;
            for(int i = 0; i < mTNCResponseEvent.getTNCResponse().getData().size(); i++){
                if(mTNCResponseEvent.getTNCResponse().getData().get(i).getNoticeType().equals("Member Notice")) {
                    memberTitle = mTNCResponseEvent.getTNCResponse().getData().get(i).getTitle();
                    memberNoticeContent = mTNCResponseEvent.getTNCResponse().getData().get(i).getContent();
                    btnMemberNotice.setTitle(memberTitle);
                }
            }
        }else{
            ToastUtils.show(getActivity(), mTNCResponseEvent.getMessage());
        }
    }

}
