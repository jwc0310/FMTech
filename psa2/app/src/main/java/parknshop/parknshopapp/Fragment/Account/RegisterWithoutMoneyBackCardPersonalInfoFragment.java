package parknshop.parknshopapp.Fragment.Account;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Dialog.SimpleConfirmDialogFragment;
import parknshop.parknshopapp.Fragment.Home.HomeFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.RegisterData;
import parknshop.parknshopapp.Model.RegisterForm;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.RegisterHelper;
import parknshop.parknshopapp.Rest.event.RegisterEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 15/3/16.
 */
public class RegisterWithoutMoneyBackCardPersonalInfoFragment extends BaseFragment {
    @Bind(R.id.edtFirstName)
    EditText edtFirstName;
    @Bind(R.id.edtLastName)
    EditText edtLastName;
    @Bind(R.id.edtPhoneNo)
    EditText edtPhoneNo;
    @Bind(R.id.btnMr) Button btnMr;
    @Bind(R.id.btnMrs) Button btnMrs;
    @Bind(R.id.btnMiss) Button btnMiss;
    @Bind(R.id.btnMs) Button btnMs;

    RegisterForm registerForm;
    String clickedMr = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_register_without_moneyback_card_personal_info, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("register-without-moneyback-card-personal-info");

        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();

        registerForm = RegisterHelper.getInfo();

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


        if(TextUtils.isEmpty(edtFirstName.getText().toString())){
            ToastUtils.show(getActivity(), "First name cannot be empty");
            return;
        }

        if(TextUtils.isEmpty(edtLastName.getText().toString())){
            ToastUtils.show(getActivity(), "Last name cannot be empty");
            return;
        }

        if(TextUtils.isEmpty(edtPhoneNo.getText().toString())){
            ToastUtils.show(getActivity(), "Phone number cannot be empty");
            return;
        }

        registerForm.setFirstName(edtFirstName.getText().toString().trim());
        registerForm.setLastName(edtLastName.getText().toString().trim());
        registerForm.setMobile(edtPhoneNo.getText().toString().trim());

        RegisterHelper.saveInfo(registerForm);

//        showProgressDialog();
        showLoadingBtnLoading();
        RegisterData registerData = new RegisterData(registerForm);
        WebServiceModel.getInstance(getBaseActivity()).requestRegister(getActivity(), registerData);
        LogUtil.info("", "register:"+new Gson().toJson(registerData));

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
            //Log.i("message", "message" + "error_::" + (registerEvent.getFieldErrorList() != null));
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
