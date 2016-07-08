package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.gson.Gson;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.ActivateCardRequest;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.ActivateCardEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by Gigi Wong on 2016年04月20日.
 */
public class MemberLinkMoneyBackCardFragment extends BaseFragment {
    @Bind (R.id.edtCardNo)
    EditText edtCardNo;
    @Bind (R.id.edtPassword)
    EditText edtPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_link_moneyback_card_layout, container, false);
        ButterKnife.bind(this, view);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/link-the-money-back");

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.myaccount_page_link_moneyback));
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @OnClick(R.id.btnLink)
    public void btnLink(){

        String cardNo = edtCardNo.getText().toString();
        String pwd = edtPassword.getText().toString();


        if(TextUtils.isEmpty(cardNo)){
            ToastUtils.show(getActivity(), getString(R.string.myaccount_page_moneyback_card_no_empty));
            return;
        }

        if(TextUtils.isEmpty(pwd)){
            ToastUtils.show(getActivity(), getString(R.string.update_password_current_pwd_empty));
            return;
        }

        ActivateCardRequest activateCardRequest = new ActivateCardRequest();
        ActivateCardRequest.MemberCardForm memberCardForm = new ActivateCardRequest.MemberCardForm();
        memberCardForm.setMemberCardCode(cardNo);
        memberCardForm.setPassword(pwd);
        activateCardRequest.setMemberCardForm(memberCardForm);

        LogUtil.info("", "activateCardRequest:"+new Gson().toJson(activateCardRequest));

        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestActivateCard(activateCardRequest);

    }

    public void onEvent(ActivateCardEvent activateCardEvent) {
        hideProgressDialog();
        if(activateCardEvent.getSuccess()){
            if(activateCardEvent.getMemberProfile().getCardNumber() != null){
                if(activateCardEvent.getMemberProfile().getCardNumber().equals(edtCardNo.getText().toString())){
                    GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/link-the-money-back/success");
                    getActivity().onBackPressed();
                }
            }else {
                GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/link-the-money-back/failed");
            }
            ToastUtils.show(getActivity(), activateCardEvent.getMessage());

        }else{
            ToastUtils.show(getActivity(), activateCardEvent.getMessage());
            GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/link-the-money-back/failed");
        }
    }
}