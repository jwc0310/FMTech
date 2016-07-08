package parknshop.parknshopapp.Fragment.Account;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import java.lang.reflect.Method;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Dialog.SimpleConfirmDialogFragment;
import parknshop.parknshopapp.Fragment.Home.HomeFragment;
import parknshop.parknshopapp.Fragment.MemberZone.View.MoneyBackCardProfileItem;
import parknshop.parknshopapp.Fragment.WebView.WebViewFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.RegisterData;
import parknshop.parknshopapp.Model.RegisterForm;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.RegisterHelper;
import parknshop.parknshopapp.Rest.event.RegisterEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.LoadingButton;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 15/3/16.
 */
public class RegisterPageBasicFragment extends BaseFragment {
    @Bind(R.id.llTitleField) LinearLayout llTitleField;
    @Bind(R.id.llNameField) LinearLayout llNameField;
    @Bind(R.id.llPwdField) LinearLayout llPwdField;
    @Bind(R.id.edtPassword) EditText edtPassword;
    @Bind(R.id.edtConfirmPassword) EditText edtConfirmPassword;
    @Bind(R.id.llContactField) LinearLayout llContactField;
    @Bind(R.id.btnMr) Button btnMr;
    @Bind(R.id.btnMrs) Button btnMrs;
    @Bind(R.id.btnMiss) Button btnMiss;
    @Bind(R.id.btnMs) Button btnMs;
    @Bind(R.id.edtFirstName) EditText edtFirstName;
    @Bind(R.id.edtLastName) EditText edtLastName;
    @Bind(R.id.edtEmail) EditText edtEmail;
    @Bind(R.id.edtPhoneNo) EditText edtPhoneNo;
    @Bind(R.id.btnContinue)
    LoadingButton btnContinue;
    @Bind(R.id.switchSMS) MoneyBackCardProfileItem switchSMS;
    @Bind(R.id.switchEmails) MoneyBackCardProfileItem switchEmails;
    @Bind(R.id.switchPost) MoneyBackCardProfileItem switchPost;
    @Bind(R.id.rlTNC) RelativeLayout rlTNC;
    @Bind(R.id.cbTNC) CheckBox cbTNC;
    @Bind(R.id.register_page_tnc) TextView register_page_tnc;

//    @Bind(R.id.cbRecMsg) CheckBox cbRecMsg;


    static final int NORMAL_USER = 1;

    String clickedMr = "";
    int moneyBack;

    RegisterForm registerForm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_register_basic, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();

        GATrackerHelper.getInstance(getActivity()).setGATracker("login/join-now");

        registerForm = RegisterHelper.getInfo();

        btnContinue.setClickable(false);

        switchSMS.setSwitch(true);
        switchEmails.setSwitch(true);
        switchPost.setSwitch(true);

        moneyBack = getArguments().getInt("isMoneyBack", NORMAL_USER);

        if(moneyBack == NORMAL_USER){
            //GATrackerHelper.getInstance(getActivity()).setGATracker("register-without-moneyback-card-account-info");
            showLogo();
        }else{
            //GATrackerHelper.getInstance(getActivity()).setGATracker("register-user-profile");
            showLogo(R.drawable.money_back_logo);
        }

        LogUtil.info("", "registermoneyBack:"+moneyBack);

        if(moneyBack == NORMAL_USER){ // is normal user
            llTitleField.setVisibility(View.GONE);
            llNameField.setVisibility(View.GONE);
            llPwdField.setVisibility(View.VISIBLE);
            llContactField.setVisibility(View.GONE);
            btnContinue.setText(getString(R.string.register_page_moneyback_card_card_next_personal_info));
        }else{ // isMoneyBackCard
            llTitleField.setVisibility(View.VISIBLE);
            llNameField.setVisibility(View.VISIBLE);
            llPwdField.setVisibility(View.GONE);
            llContactField.setVisibility(View.VISIBLE);
            btnContinue.setText(getString(R.string.register_page_moneyback_card_card_next_finish));
        }

        String tAndCString = getString(R.string.register_page_tnc);
        Spannable WordtoSpan = new SpannableString(tAndCString);
        WordtoSpan.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                String postfix = "?uiel=Mobile&lang=" + (GlobalConstant.language.equals(GlobalConstant.LANG_ZH) ? GlobalConstant.LANG_ZH : GlobalConstant.LANG_EN);
                WebViewFragment webViewFragment = WebViewFragment.newInstance("http://www.parknshop.com/termsAndConditions" + postfix);
                webViewFragment.title = getString(R.string.reg_terms_con);
                webViewFragment.showBackButton = true;
                RegisterPageBasicFragment.this.placeFragmentWithBackStack(webViewFragment);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                ds.setColor(getResources().getColor(R.color.txt_blue));

                try {
                    final Method method = TextPaint.class.getMethod("setUnderlineText",
                            Integer.TYPE,
                            Float.TYPE);
                    method.invoke(ds, R.color.txt_blue, 1.0f);
                } catch (final Exception e) {
                    ds.setUnderlineText(true);
                }
            }
        }, tAndCString.indexOf(getString(R.string.reg_terms)), tAndCString.indexOf(getString(R.string.reg_condition)) + getString(R.string.reg_condition).length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        WordtoSpan.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                String postfix = "?uiel=Mobile&lang=" + (GlobalConstant.language.equals(GlobalConstant.LANG_ZH) ? GlobalConstant.LANG_ZH : GlobalConstant.LANG_EN);
                WebViewFragment webViewFragment = WebViewFragment.newInstance("http://www.parknshop.com/privacyPolicy" + postfix);
                webViewFragment.title = getString(R.string.reg_terms_privacy_policy);
                webViewFragment.showBackButton = true;
                RegisterPageBasicFragment.this.placeFragmentWithBackStack(webViewFragment);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                ds.setColor(getResources().getColor(R.color.txt_blue));

                try {
                    final Method method = TextPaint.class.getMethod("setUnderlineText",
                            Integer.TYPE,
                            Float.TYPE);
                    method.invoke(ds, R.color.txt_blue, 1.0f);
                } catch (final Exception e) {
                    ds.setUnderlineText(true);
                }
            }
        }, tAndCString.indexOf(getString(R.string.reg_privacy)), tAndCString.indexOf(getString(R.string.reg_policy)) + getString(R.string.reg_policy).length() , Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        register_page_tnc.setMovementMethod(LinkMovementMethod.getInstance());

        register_page_tnc.setText(WordtoSpan);
//        setMrButton(0);

        return view;
    }

    @OnClick (R.id.btnMr)
    public void btnMr() {
        setMrButton(0);
    }

    @OnClick (R.id.btnMrs)
    public void btnMrs() {
        setMrButton(1);
    }

    @OnClick (R.id.btnMiss)
    public void btnMiss() {
        setMrButton(2);
    }

    @OnClick (R.id.btnMs)
    public void btnMs() {
        setMrButton(3);
    }

    @OnClick (R.id.btnContinue)
    public void btnContinue() {

        if(TextUtils.isEmpty(edtEmail.getText().toString())){
            ToastUtils.show(getActivity(), getString(R.string.email_cannot_be_empty));
            return;
        }

        if(!isEmail(edtEmail.getText().toString())){
            ToastUtils.show(getActivity(), getString(R.string.email_format_invalid));
            return;
        }

        registerForm.setEmailFlag("true");
        registerForm.setSendEmailFlag(switchEmails.getBtnSwitch() + "");
        registerForm.setSmsFlag(switchSMS.getBtnSwitch() + "");
        registerForm.setMailFlag(switchPost.getBtnSwitch() + "");
        registerForm.setLanguage("ENGLISH");

        if(moneyBack == NORMAL_USER){
            if(TextUtils.isEmpty(edtPassword.getText().toString())){
                ToastUtils.show(getActivity(), getString(R.string.update_password_current_pwd_empty));
                return;
            }

            if(!isPassWd(edtPassword.getText().toString())){
                ToastUtils.show(getActivity(), getString(R.string.password_format_invalid));
                return;
            }

            if(TextUtils.isEmpty(edtConfirmPassword.getText().toString())){
                ToastUtils.show(getActivity(), getString(R.string.update_password_confirm_pwd_empty));
                return;
            }

            if(!edtPassword.getText().toString().equals(edtConfirmPassword.getText().toString())){
                ToastUtils.show(getActivity(), getString(R.string.password_not_match));
                return;
            }

            if(!cbTNC.isChecked()){
                ToastUtils.show(getActivity(), getString(R.string.please_agree_t_and_c));
                return;
            }


            LogUtil.info("", "edtEmail:"+edtEmail.getText().toString());

            registerForm.setEmail(edtEmail.getText().toString().trim());
            registerForm.setReEnterEmailAddr(edtEmail.getText().toString().trim());
            registerForm.setPwd(edtPassword.getText().toString().trim());
            registerForm.setCheckPwd(edtConfirmPassword.getText().toString().trim());

//            registerForm.setSendEmailFlag(switchPost.isPressed() + "");
//            registerForm.setEmailFlag("true");
//            registerForm.setLanguage("ENGLISH");
            registerForm.setRegisterType("1");
//        registerForm.setNationalType("CHINESE");

            RegisterHelper.saveInfo(registerForm);

            placeFragmentWithBackStack(new RegisterWithoutMoneyBackCardPersonalInfoFragment());
        }else{

            if(!cbTNC.isChecked()){
                ToastUtils.show(getActivity(), getString(R.string.please_agree_t_and_c));
                return;
            }

            registerForm.setFirstName(edtFirstName.getText().toString().trim());
            registerForm.setLastName(edtLastName.getText().toString().trim());
            registerForm.setMobile(edtPhoneNo.getText().toString().trim());

            registerForm.setEmail(edtEmail.getText().toString());
            registerForm.setReEnterEmailAddr(edtEmail.getText().toString());
//            registerForm.setEmailFlag(cbRecMsg.isChecked()+"");
//            registerForm.setLanguage("ENGLISH");
//            registerForm.setNationalType("CHINESE");

            RegisterHelper.saveInfo(registerForm);

//            showProgressDialog();
            RegisterData registerData = new RegisterData(registerForm);
            showLoadingBtnLoading();
            WebServiceModel.getInstance(getBaseActivity()).requestRegister(getActivity(), registerData);
            LogUtil.info("", "register:"+new Gson().toJson(registerData));

        }

//        RegisterForm.PhoneForm phoneForm = registerForm.getPhoneForm();
//        phoneForm.setPhoneNumber(edtPhoneNo.getText().toString().trim());
//        registerForm.setPhoneForm(phoneForm);

//        if(moneyBack == 1){
//
//            if(TextUtils.isEmpty(edtEmail.getText().toString())){
//                ToastUtils.show(getActivity(), "Email cannot be empty.");
//                return;
//            }
//
//            if(!cbTNC.isChecked()){
//                ToastUtils.show(getActivity(), "Please agree T&C");
//                return;
//            }
//
//            registerForm.setEmail(edtEmail.getText().toString());
//            registerForm.setReEnterEmailAddr(edtEmail.getText().toString());
////            registerForm.setEmailFlag(cbRecMsg.isChecked()+"");
//            registerForm.setLanguage("ENGLISH");
////            registerForm.setNationalType("CHINESE");
//        }



//        Bundle bundle = new Bundle();
//        bundle.putInt("isMoneyBack", moneyBack);
////        RegisterPageContactFragment fragment = new RegisterPageContactFragment();
//        RegisterPageAccountDetailsFragment fragment = new RegisterPageAccountDetailsFragment();
//        fragment.setArguments(bundle);
//        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.cbTNC)
    public void onClickrlTNC(){
        LogUtil.info("", "cbTNC:"+cbTNC.isChecked());
        //cbTNC.toggle();
        //onClickcbTNC();
    }

    @OnClick(R.id.cbTNC)
    public void onClickcbTNC(){
        if(!cbTNC.isChecked()){
//            btnContinue.setBackgroundResource(R.drawable.checkout_next_dim_background);
            btnContinue.setTextColor(getResources().getColor(R.color.txt_grey));
            btnContinue.setClickable(false);
        }else{
//            btnContinue.setBackgroundResource(R.drawable.btn_sharp_blue);
            btnContinue.setTextColor(getResources().getColor(R.color.white));
            btnContinue.setClickable(true);
        }
    }



    public void onEvent(RegisterEvent registerEvent) {
        hideProgressDialog();
        hideLoadingBtnLoading();
        if(registerEvent.getSuccess()){
            RegisterHelper.clear();
            ToastUtils.show(getActivity(), getString(R.string.register_page_register_success));
            HomeFragment fragment = new HomeFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isGoToLoginPage", true);
            fragment.setArguments(bundle);
            addFragmentToTop(fragment);

        }else{
//            ToastUtils.show(getActivity(), registerEvent.getMessage());
            SimpleConfirmDialogFragment scdf = new SimpleConfirmDialogFragment();
            scdf.dial = false;
            scdf.showCancel = false;

            String title = getString(R.string.checkout_address_form_invalid_input);
            String message = "";

            if(registerEvent.getFieldErrorList() != null) {
                for (int i = 0; i < registerEvent.getFieldErrorList().size(); i++) {
                    //Log.i("message", "message" + "error_" + registerEvent.getFieldErrorList().get(i).toString().toLowerCase() );

                    if(getId("error_" + registerEvent.getFieldErrorList().get(i).toString().toLowerCase(), R.string.class) != 0)
                        message += getString(getId("error_" + registerEvent.getFieldErrorList().get(i).toString().toLowerCase(), R.string.class)) + (i == registerEvent.getFieldErrorList().size() - 1 ? "" : ",");
                }
            }

            scdf.title = title;
            scdf.message = message;//event.getMessage();
//
            scdf.show( getBaseActivity().getSupportFragmentManager(), "");
        }
    }


    public void setMrButton(int clicked){
        switch(clicked){
            case 0:
                clickedMr = "Mr";
                btnMr.setTextColor(getResources().getColor(R.color.white));
                btnMrs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMiss.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMr.setBackgroundResource(R.drawable.btn_sharp_blue);
                btnMrs.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMiss.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMs.setBackgroundResource(R.drawable.btn_sharp_white);
                break;
            case 1:
                clickedMr = "Mrs";
                btnMr.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMrs.setTextColor(getResources().getColor(R.color.white));
                btnMiss.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMr.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMrs.setBackgroundResource(R.drawable.btn_sharp_blue);
                btnMiss.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMs.setBackgroundResource(R.drawable.btn_sharp_white);
                break;
            case 2:
                clickedMr = "Miss";
                btnMr.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMrs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMiss.setTextColor(getResources().getColor(R.color.white));
                btnMs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMr.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMrs.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMiss.setBackgroundResource(R.drawable.btn_sharp_blue);
                btnMs.setBackgroundResource(R.drawable.btn_sharp_white);
                break;
            case 3:
                clickedMr = "Ms";
                btnMr.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMrs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMiss.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMs.setTextColor(getResources().getColor(R.color.white));
                btnMr.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMrs.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMiss.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMs.setBackgroundResource(R.drawable.btn_sharp_blue);
                break;
        }

        registerForm.setTitle(clickedMr.toLowerCase());

    }

}
