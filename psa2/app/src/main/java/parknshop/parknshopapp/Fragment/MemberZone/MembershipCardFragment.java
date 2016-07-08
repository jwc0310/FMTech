package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Coupon.CouponList.CouponListFragment;
import parknshop.parknshopapp.Fragment.Home.HomeFragment;
import parknshop.parknshopapp.Fragment.Redemption.RedemptionList.RedemptionListFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Utility;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.GetMoneyBackCardProfileEvent;
import parknshop.parknshopapp.WebServiceModel;
import parknshop.parknshopapp.common.MemberHelper;

/**
 * Created by Gigi Wong on 2016年04月20日.
 */
public class MembershipCardFragment extends BaseFragment {
    //@Bind(R.id.member_card_view)
    //MemberZoneCardView member_card_view;
    @Bind(R.id.rlMoneyBackCard)
    RelativeLayout rlMoneyBackCard;
    @Bind(R.id.rlLinkMoneyBack)
    RelativeLayout rlLinkMoneyBack;
    @Bind(R.id.txtPoint)
    TextView txtPoint;
    @Bind(R.id.txtPointExpiryDate)
    TextView txtPointExpiryDate;
    @Bind(R.id.txtCardNo)
    TextView txtCardNo;
    @Bind(R.id.llMoneyBackCardProfile)
    LinearLayout llMoneyBackCardProfile;
    @Bind(R.id.llMoneyBackPromotion)
    LinearLayout llMoneyBackPromotion;
    @Bind(R.id.llMCoupon)
    LinearLayout llMCoupon;
    @Bind(R.id.llRedemption)
    LinearLayout llRedemption;
    @Bind(R.id.btnLogout)
    Button btnLogout;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_card_layout, container, false);
        ButterKnife.bind(this, view);

        GATrackerHelper.getInstance(getActivity()).setGATracker("moneybackcard");

        showMenuButton();
        showToolbar();
        enableNavigationDrawer();
        setToolbarTitle(getString(R.string.moneyback_card));
        disableSecondRightButton();
        disableCartButton();

        if(GlobalConstant.isMoneybackCardLogin){
            btnLogout.setVisibility(View.VISIBLE);
        }else{
            btnLogout.setVisibility(View.GONE);
        }

        if(MemberHelper.getMemberProfile() != null){
            //member_card_view.setCardNo(MemberHelper.getMemberProfile().getMemberNumber());

            if(MemberHelper.getMemberProfile().isiMember()){
                rlMoneyBackCard.setVisibility(View.VISIBLE);
                rlLinkMoneyBack.setVisibility(View.GONE);
            }else{
                rlMoneyBackCard.setVisibility(View.GONE);
                rlLinkMoneyBack.setVisibility(View.VISIBLE);
            }
        }

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestGetMoneyBackProfile(getActivity());
    }

    public void onEvent(GetMoneyBackCardProfileEvent getMoneyBackCardProfileEvent) {
        hideProgressDialog();
        if(getMoneyBackCardProfileEvent.getSuccess()) {
            txtPoint.setText(getMoneyBackCardProfileEvent.getMemberProfile().getPoints());
            txtCardNo.setText(getMoneyBackCardProfileEvent.getMemberProfile().getCardNumber());
//            member_card_view.setPoints(getMoneyBackCardProfileEvent.getMemberProfile().getPoints());
            txtPointExpiryDate.setText(String.format(getString(R.string.myaccount_page_moneyback_point_expiry),
                    Utility.formatDate(Utility.WATSON_TIME_FORMAT, Utility.EN_MONTH_DATE_FORMAT, getMoneyBackCardProfileEvent.getMemberProfile().getPointsExpiryDate())));
        }
    }

    @OnClick(R.id.btnLinkMoneyBack)
    public void btnLinkMoneyBack(){
        placeFragmentWithBackStack(new MemberLinkMoneyBackCardFragment());
    }

    @OnClick(R.id.llMoneyBackCardProfile)
    public void llMoneyBackCardProfile(){
        MemberMoneyBackCardProfileFragment fragment = new MemberMoneyBackCardProfileFragment();
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.llMoneyBackPromotion)
    public void llMoneyBackPromotion(){

    }

    @OnClick(R.id.llMCoupon)
    public void llMCoupon(){
        CouponListFragment fragment = new CouponListFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isBack", true);
        fragment.setArguments(bundle);
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.llRedemption)
    public void llRedemption(){
        RedemptionListFragment fragment = new RedemptionListFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isBack", true);
        fragment.setArguments(bundle);
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.btnLogout)
    public void btnLogout(){
        GlobalConstant.isMoneybackCardLogin = false;
        GlobalConstant.moneybackCardToken = null;
        addFragmentToTop(new HomeFragment());
    }
}