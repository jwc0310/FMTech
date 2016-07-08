package parknshop.parknshopapp.Fragment.Account;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.ForgetPasswordEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by kwongyuenpan on 29/4/16.
 */
public class ForgetPasswordFragment extends BaseFragment {
    @Bind(R.id.edtEmail)
    EditText edtEmail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.forget_password_fragment_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("login/forget-password");

        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        enableNavigationDrawer();
        setToolbarTitle(getString(R.string.forget_password_page_title));
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @OnClick(R.id.btnSend)
    public void btnSend(){

        if(TextUtils.isEmpty(edtEmail.getText().toString())){
            popupDialog(getString(R.string.dismiss), getString(R.string.forget_password_page_error_invalid_required), getString(R.string.forget_password_page_error_invalid_required_desc), false);
            return;
        }

        if(!isEmail(edtEmail.getText().toString())){
            popupDialog(getString(R.string.dismiss), getString(R.string.forget_password_page_error_invalid_email), getString(R.string.forget_password_page_error_invalid_email_desc), false);
            return;
        }

        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestGetForgotPwd(edtEmail.getText().toString());

    }

    public void onEvent(ForgetPasswordEvent forgetPasswordEvent) {
        hideProgressDialog();
        if(forgetPasswordEvent.getSuccess()){
            GATrackerHelper.getInstance(getActivity()).setGATracker("login/forget-password/success");
            popupDialog(getString(R.string.btn_ok), getString(R.string.forget_password_page_check_your_email), getString(R.string.forget_password_page_success), true);
        }else{
            GATrackerHelper.getInstance(getActivity()).setGATracker("login/forget-password/failed");
            ToastUtils.show(getActivity(), forgetPasswordEvent.getMessage());
        }
    }

    public void popupDialog(String btnStr, String title, String msg, final boolean backHomePage){
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.dialog_call, null);
        final Dialog mDialog = new Dialog(getActivity());
        TextView txtTitle = (TextView) layout.findViewById(R.id.txtTitle);
        TextView txtDesc = (TextView) layout.findViewById(R.id.txtDesc);
        TextView btnCancel = (TextView) layout.findViewById(R.id.btnCancel);
        TextView btnOK = (TextView) layout.findViewById(R.id.btnOK);

        txtTitle.setText(title);
        txtDesc.setText(msg);
        btnOK.setText(btnStr);

        btnCancel.setVisibility(View.GONE);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
                if(backHomePage){
                    getActivity().onBackPressed();
                }
            }
        });
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(layout);
        mDialog.show();
    }


}
