package parknshop.parknshopapp.Fragment.Account;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Model.RegionsResponse;
import parknshop.parknshopapp.Model.RegisterData;
import parknshop.parknshopapp.Model.RegisterForm;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.RegisterHelper;
import parknshop.parknshopapp.Rest.event.RegionListEvent;
import parknshop.parknshopapp.Rest.event.RegisterEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutEditText;
import parknshop.parknshopapp.View.CheckoutPicker;
import parknshop.parknshopapp.View.RegistrationDotViewHolder;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 15/3/16.
 */
public class RegisterPageAccountDetailsFragment extends RegistrationWrapperFragment implements DatePickerDialog.OnDateSetListener {

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    @Bind(R.id.llBirthday) LinearLayout llBirthday;
    @Bind(R.id.txtBirthday) TextView txtBirthday;
    @Bind(R.id.pMartialStatus) CheckoutPicker pMartialStatus;
    @Bind(R.id.pRegion) CheckoutPicker pRegion;
    @Bind(R.id.pNoOfChildren) CheckoutPicker pNoOfChildren;
    @Bind(R.id.cbTNC) CheckBox cbTNC;
    @Bind(R.id.cbRecMsg) CheckBox cbRecMsg;
    @Bind(R.id.edtFirstName) CheckoutEditText edtFirstName;
    @Bind(R.id.edtLastName) CheckoutEditText edtLastName;
    @Bind(R.id.edtPhoneNo) CheckoutEditText edtPhoneNo;
    @Bind(R.id.edtFlat) CheckoutEditText edtFlat;
    @Bind(R.id.edtBlock) CheckoutEditText edtBlock;
    @Bind(R.id.pArea) CheckoutPicker pArea;


    Date date;

    int moneyBack;

    RegisterForm registerForm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_register_account_details, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        setToolbarTitle(getString(R.string.register_page_title));

        registerForm = RegisterHelper.getInfo();

        moneyBack = getArguments().getInt("isMoneyBack", 0);

        new RegistrationDotViewHolder(dot1, 1, FINISH, getBaseActivity(), moneyBack);
        new RegistrationDotViewHolder(dot2, 2, FINISH, getBaseActivity(), moneyBack);
        new RegistrationDotViewHolder(dot3, 3, FINISH, getBaseActivity(), moneyBack);
        new RegistrationDotViewHolder(dot4, 4, CURRENT, getBaseActivity(), moneyBack);

        pMartialStatus.setDataArray(getResources().getStringArray(R.array.register_status));
        pNoOfChildren.setDataArray(getResources().getStringArray(R.array.register_children));

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        showLoadingView();
        WebServiceModel.getInstance(getBaseActivity()).requestRegions();
    }

    public void onEvent(RegionListEvent regionListEvent) {
        hideLoadingView();
        if(regionListEvent.getSuccess()) {
            RegionsResponse regionsResponse = regionListEvent.getRegionsResponse();
            String [] stringArray = regionsResponse.getListOfRegionList();
            pRegion.setDataArray(stringArray);
        }else{
            ToastUtils.show(getActivity(), regionListEvent.getMessage());
        }
    }

    @OnClick (R.id.llBirthday)
    public void llBirthday() {
        showDatePicker();
    }

    @OnClick (R.id.btnContinue)
    public void btnContinue() {

        registerForm.setNumberOfChildren(getResources().getStringArray(R.array.register_children_count)[pNoOfChildren.getPosition()]);
        registerForm.setMaritalStatus(pMartialStatus.getText());
        registerForm.setEmailFlag(cbRecMsg.isChecked()+"");
        registerForm.setSendEmailFlag("true");
        registerForm.setLanguage("ENGLISH");
        registerForm.setNationalType("CHINESE");

        showLoadingView();
        RegisterData registerData = new RegisterData(registerForm);
//        WebServiceModel.getInstance(getBaseActivity()).requestRegister(getActivity(), registerData);
        LogUtil.info("", "register:"+new Gson().toJson(registerData));
    }

    public void onEvent(RegisterEvent registerEvent) {
        hideLoadingView();
        if(registerEvent.getSuccess()){

        }else{
            ToastUtils.show(getActivity(), registerEvent.getMessage());
        }
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
        date = new Date(year - 1900, monthOfYear, dayOfMonth);
        txtBirthday.setText(format.format(date));

        RegisterForm.DateOfBirth db = registerForm.getDateOfBirth();
        db.setDay(dayOfMonth+"");
        db.setMonth(monthOfYear+"");
        db.setYear(year+"");
        registerForm.setDateOfBirth(db);

    }

    public void showDatePicker(){
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog dialog = new DatePickerDialog(getActivity(), RegisterPageAccountDetailsFragment.this,
                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH));
        dialog.getDatePicker().setMinDate(calendar.getTimeInMillis());
        dialog.setButton(DialogInterface.BUTTON_NEGATIVE, getString(android.R.string.cancel), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.show();
    }
}
