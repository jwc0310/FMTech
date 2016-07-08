package parknshop.parknshopapp.Fragment.Account;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.RegisterForm;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.RegisterHelper;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;

/**
 * Created by chrisyu on 15/3/16.
 */
public class RegisterWithoutMoneyBackCardFragment extends BaseFragment {
    @Bind(R.id.edtEmail)
    EditText edtEmail;
    @Bind(R.id.edtPassword)
    EditText edtPassword;
    @Bind(R.id.edtConfirmPassword)
    EditText edtConfirmPassword;
    @Bind(R.id.btnContinue)
    Button btnContinue;
    @Bind(R.id.cbTNC)
    CheckBox cbTNC;
    @Bind(R.id.cbRecMsg) CheckBox cbRecMsg;

    RegisterForm registerForm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_register_without_moneyback_card, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();

        registerForm = RegisterHelper.getInfo();

//        new RegistrationDotViewHolder(dot1, 1, CURRENT, getBaseActivity(), 1);
//        new RegistrationDotViewHolder(dot2, 2, NOT_FINISH, getBaseActivity(), 1);
//        new RegistrationDotViewHolder(dot3, 3, NOT_FINISH, getBaseActivity(), 1);
//        new RegistrationDotViewHolder(dot4, 4, NOT_FINISH, getBaseActivity(), 1);

        return view;
    }

    @OnClick (R.id.btnContinue)
    public void btnContinue() {


        if(TextUtils.isEmpty(edtEmail.getText().toString())){
            ToastUtils.show(getActivity(), "Email cannot be empty");
            return;
        }

        if(!isEmail(edtEmail.getText().toString())){
            ToastUtils.show(getActivity(), "Email format invalid");
            return;
        }

        if(TextUtils.isEmpty(edtPassword.getText().toString())){
            ToastUtils.show(getActivity(), "Password cannot be empty");
            return;
        }

        if(!isPassWd(edtPassword.getText().toString())){
            ToastUtils.show(getActivity(), "Password format invalid");
            return;
        }

        if(TextUtils.isEmpty(edtConfirmPassword.getText().toString())){
            ToastUtils.show(getActivity(), "Confirm Password cannot be empty");
            return;
        }

        if(!edtPassword.getText().toString().equals(edtConfirmPassword.getText().toString())){
            ToastUtils.show(getActivity(), "Password not match");
            return;
        }

        if(!cbTNC.isChecked()){
            ToastUtils.show(getActivity(), "Please agree T&C");
            return;
        }

        LogUtil.info("", "edtEmail:"+edtEmail.getText().toString());

        registerForm.setEmail(edtEmail.getText().toString().trim());
        registerForm.setReEnterEmailAddr(edtEmail.getText().toString().trim());
        registerForm.setPwd(edtPassword.getText().toString().trim());
        registerForm.setCheckPwd(edtConfirmPassword.getText().toString().trim());

        registerForm.setSendEmailFlag(cbRecMsg.isChecked()+"");
        registerForm.setEmailFlag("true");
        registerForm.setLanguage("ENGLISH");
        registerForm.setRegisterType("1");
//        registerForm.setNationalType("CHINESE");

        RegisterHelper.saveInfo(registerForm);

        Bundle bundle = new Bundle();
        bundle.putInt("isMoneyBack", 0);
        RegisterPageBasicFragment fragment = new RegisterPageBasicFragment();
        fragment.setArguments(bundle);
        placeFragmentWithBackStack(fragment);
    }

}
