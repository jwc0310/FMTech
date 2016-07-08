package parknshop.parknshopapp.Fragment.Account;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.LoginResponse;
import parknshop.parknshopapp.Model.RegisterForm;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.RegisterHelper;
import parknshop.parknshopapp.Rest.event.LoginEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 15/3/16.
 */
public class RegisterMoneyBackCardFragment extends BaseFragment {
    @Bind(R.id.edtMoneyBackCardNo)
    EditText edtMoneyBackCardNo;
    @Bind(R.id.edtPassword)
    EditText edtPassword;
    @Bind(R.id.btnContinue)
    Button btnContinue;

    RegisterForm registerForm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_register_moneyback_card, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        showLogo(R.drawable.money_back_logo);
//        new RegistrationDotViewHolder(dot1, 1, CURRENT, getBaseActivity(), 0);
//        new RegistrationDotViewHolder(dot2, 2, NOT_FINISH, getBaseActivity(), 0);
//        new RegistrationDotViewHolder(dot3, 3, NOT_FINISH, getBaseActivity(), 0);
//        new RegistrationDotViewHolder(dot4, 4, NOT_FINISH, getBaseActivity(), 0);

        return view;
    }

    @OnClick (R.id.btnContinue)
    public void btnContinue() {

        if(TextUtils.isEmpty(edtMoneyBackCardNo.getText().toString().trim())) {
            ToastUtils.show(getActivity(), getString(R.string.check_out_credit_card_no_empty));
            return;
        }
        if(TextUtils.isEmpty(edtPassword.getText().toString().trim())) {
            ToastUtils.show(getActivity(), getString(R.string.password_empty));
            return;
        }

        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestLoginUser(edtMoneyBackCardNo.getText().toString(), edtPassword.getText().toString());

    }


    public void onEvent(LoginEvent loginEvent){
        hideProgressDialog();
        LoginResponse loginResponse = loginEvent.getLoginResponse();
        if(loginEvent.getSuccess()){
            loginResponse.getRegisterForm().getRegisterType();

            // This card can be register
            if(loginResponse.getRegisterForm() != null){ // this card not yet register
                if(loginResponse.getRegisterForm().getRegisterType() == null){// this card already register
                    ToastUtils.show(getActivity(), getString(R.string.register_page_moneyback_card_already_register));
                }
                RegisterForm registerForm = loginResponse.getRegisterForm();
                RegisterHelper.saveInfo(registerForm);
                Bundle bundle = new Bundle();
                bundle.putInt("isMoneyBack", Integer.parseInt(loginResponse.getRegisterForm().getRegisterType()));
                RegisterPageBasicFragment fragment = new RegisterPageBasicFragment();
                fragment.setArguments(bundle);
                placeFragmentWithBackStack(fragment);
//                if(loginResponse.getRegisterForm().getFirstName() != null || loginResponse.getRegisterForm().getLastName() != null){
//
//                    registerForm.setSendEmailFlag("true");
//
//                    // Call register API directly
//                    RegisterData registerData = new RegisterData(registerForm);
//
//                    showProgressDialog();
//                    WebServiceModel.getInstance(getBaseActivity()).requestRegister(getActivity(), registerData);
//                }else{
//
//                    Bundle bundle = new Bundle();
//                    bundle.putInt("isMoneyBack", 1);
//                    RegisterPageBasicFragment fragment = new RegisterPageBasicFragment();
//                    fragment.setArguments(bundle);
//                    placeFragmentWithBackStack(fragment);
//                }
            }else{
                ToastUtils.show(getActivity(), getString(R.string.register_page_moneyback_card_already_register));
            }


        }else{
            hideLoadingView();
            ToastUtils.show(getActivity(), loginEvent.getMessage());
        }

    }

//    public void onEvent(RegisterEvent registerEvent) {
//        hideProgressDialog();
//        if(registerEvent.getSuccess()){
//            RegisterHelper.clear();
//            ToastUtils.show(getActivity(), getString(R.string.register_page_register_success));
//            addFragmentToTop(new HomeFragment());
//        }else{
//            ToastUtils.show(getActivity(), registerEvent.getMessage());
//        }
//    }

}
