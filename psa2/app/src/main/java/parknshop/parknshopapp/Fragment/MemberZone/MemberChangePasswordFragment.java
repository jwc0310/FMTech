package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.ChangePwdEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.FixedFontStyleEditText;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by Gigi Wong on 2016年04月20日.
 */
public class MemberChangePasswordFragment extends BaseFragment {
    @Bind (R.id.edtCurrentPassword)
    FixedFontStyleEditText edtCurrentPassword;
    @Bind (R.id.edtNewPassword)
    FixedFontStyleEditText edtNewPassword;
    @Bind (R.id.edtConfirmPassword)
    FixedFontStyleEditText edtConfirmPassword;
    @Bind (R.id.btnUpdate)
    Button btnUpdate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_change_password, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/account-details/change-password");

        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.change_password));
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @OnClick(R.id.btnUpdate)
    public void btnUpdate(){

        String currentPwd = edtCurrentPassword.getText().toString();
        String newPwd = edtNewPassword.getText().toString();
        String confirmPwd = edtConfirmPassword.getText().toString();

        if(TextUtils.isEmpty(edtCurrentPassword.getText().toString())){
            ToastUtils.show(getActivity(), getString(R.string.update_password_current_pwd_empty));
            return;
        }

        if(TextUtils.isEmpty(edtNewPassword.getText().toString())){
            ToastUtils.show(getActivity(), getString(R.string.update_password_new_pwd_empty));
            return;
        }

        if(TextUtils.isEmpty(edtConfirmPassword.getText().toString())){
            ToastUtils.show(getActivity(), getString(R.string.update_password_confirm_pwd_empty));
            return;
        }

        if(!edtNewPassword.getText().toString().equals(edtConfirmPassword.getText().toString())){
            ToastUtils.show(getActivity(), getString(R.string.update_password_pwd_not_match));
            return;
        }

        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestChangePwd(getActivity(), currentPwd, confirmPwd);

    }

    public void onEvent(ChangePwdEvent changePwdEvent) {
        hideProgressDialog();
        if(changePwdEvent.getSuccess()){
            ToastUtils.show(getActivity(), getString(R.string.update_success));
            getActivity().onBackPressed();
        }else{
            ToastUtils.show(getActivity(), changePwdEvent.getMessage());
        }
    }
}