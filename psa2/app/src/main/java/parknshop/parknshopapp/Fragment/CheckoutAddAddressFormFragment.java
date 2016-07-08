package parknshop.parknshopapp.Fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Field;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.ErrorCodeList;
import parknshop.parknshopapp.Fragment.Dialog.SimpleConfirmDialogFragment;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CartEvent;
import parknshop.parknshopapp.Rest.event.CheckoutBoxEvent;
import parknshop.parknshopapp.Rest.event.RequestAddAddressEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutAddressForm;
import parknshop.parknshopapp.View.CheckoutButton;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 9/5/16.
 */
public class CheckoutAddAddressFormFragment extends BaseFragment {
    @Bind (R.id.checkout_address_form) CheckoutAddressForm checkoutAddressForm;
    @Bind (R.id.con) CheckoutButton checkoutButton;
    public String titleString;
    public boolean isBillingAddress;
    public boolean isDeliveryAddress;

    public void onCreate(Bundle savedBundle) {
        super.onCreate(savedBundle);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.checkout_address_form_layout, container, false);
        ButterKnife.bind(this, view);

        checkoutAddressForm.init();
        checkoutAddressForm.isBillingAddress = isBillingAddress;

        if(isBillingAddress) {
            setToolbarTitle(getString(R.string.add_billing_address));
            checkoutAddressForm.checkoutCheckBoxWithText.contentTextView.setText(getString(R.string.use_as_billing_address));
        } else {
            setToolbarTitle(getString(R.string.add_delivery_address));
        }

        getBaseActivity().editTextGetFocus(checkoutAddressForm.flat.title);

        return view;
    }

    @OnClick(R.id.con)
    public void add() {
        if(checkoutButton.isDisabled)
            return;

        if(!checkoutAddressForm.isValidAddress()){
            ToastUtils.show(getBaseActivity(), "Not valid Address");
            return;
        }

        /*if(checkoutAddressForm.checkoutCheckBoxWithText.isSelected)
            if(isBillingAddress) {
                checkoutAddressForm.isBillingAddress = true;
            } else {
                checkoutAddressForm.isDeliveryAddress = true;
            }
        */
        showProgressDialog();
        WebServiceModel.getInstance(getBaseActivity()).requestAddAddress(checkoutAddressForm.getAddressData(), getBaseActivity());
        //WebServiceModel.getInstance(getBaseActivity()).saveDeliveryAddress(checkoutAddressForm.getAddressData(), getBaseActivity());
    }

    public void onEvent(RequestAddAddressEvent event) {
        hideProgressDialog();
        if(event.getSuccess()) {
            if(checkoutAddressForm.checkoutCheckBoxWithText.isSelected) {
                if(isBillingAddress) {
                    AddressData.AddressForm addressForm = (AddressData.AddressForm) event.getDataObject();

                    AddressData addressData = getUpdateAddress(addressForm);
                    WebServiceModel.getInstance(getBaseActivity()).saveDeliveryAddress(addressData, getBaseActivity(), this.hashCode());
                    (getBaseActivity()).showProgressDialog();
                } else {
                    if (event.getDataObject() != null) {
                        AddressData.AddressForm addressForm = (AddressData.AddressForm) event.getDataObject();

                        showProgressDialog();
                        WebServiceModel.getInstance(getBaseActivity()).saveDeliveryAddress(addressForm.getId(), getBaseActivity());
                    }
                }
            } else {
                CartEvent cartEvent = new CartEvent();
                cartEvent.setSuccess(true);
                onEvent(cartEvent);
            }
        } else {
            //ToastUtils.show(getBaseActivity(), event.getMessage());

//            String errorCode = event.getErrorCode();
//            if(errorCode.contains(",")) {
//                String[] errorCodes = errorCode.split(",");
//                String errorMessage = "";
//
//                for(int i = 0; i < errorCodes.length; i ++) {
//                    errorMessage += ConfigHelper.getConfig(getBaseActivity(), "RC_" + errorCodes[i]).getValue() +"\n";//ErrorCodeList.getErrorMessage(errorCodes[i]) + "\n";
//                    Log.i("errorMessage", "errorMessage " + "RC_" + errorCodes[i] + " " + errorMessage);
//                }
//
                SimpleConfirmDialogFragment scdf = new SimpleConfirmDialogFragment();
                scdf.dial = false;
                scdf.showCancel = false;

                String title = getString(R.string.checkout_address_form_invalid_input);
                String message = "";

                if(event.getFieldErrorList() != null) {
                    for (int i = 0; i < event.getFieldErrorList().size(); i++) {
                        //Log.i("message", "message" + "error_" + event.getFieldErrorList().get(i).toString().toLowerCase() );

                        if(getId("error_" + event.getFieldErrorList().get(i).toString().toLowerCase(), R.string.class) != 0)
                            message += getString(getId("error_" + event.getFieldErrorList().get(i).toString().toLowerCase(), R.string.class)) + (i == event.getFieldErrorList().size() - 1 ? "" : ",");
                    }
                }

                scdf.title = title;
                scdf.message = message;//event.getMessage();
//
                scdf.show( getBaseActivity().getSupportFragmentManager(), "");
//            }
        }

        //WebServiceModel.getInstance(getBaseActivity()).saveDeliveryAddress();
        /*
        hideKeyboard();

        if(event.getSuccess()) {
            hideProgressDialog();
            getBaseActivity().onBackPressed();
        } else {
            hideProgressDialog();
            ToastUtils.show(getBaseActivity(), event.getMessage());

            String errorCode = event.getErrorCode();
            if(errorCode.contains(",")) {
                String[] errorCodes = errorCode.split(",");
                String errorMessage = "";

                for(int i = 0; i < errorCodes.length; i ++) {
                    errorMessage += ErrorCodeList.getErrorMessage(errorCodes[i]) + "\n";
                }
                Log.i("errorMessage", "errorMessage " + errorMessage);

                SimpleConfirmDialogFragment scdf = new SimpleConfirmDialogFragment();
                scdf.dial = false;
                scdf.message = errorMessage;

                scdf. show( getBaseActivity().getSupportFragmentManager(), "");
            }
        }*/
    }

    public int getId(String resourceName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(resourceName);
            return idField.getInt(idField);
        } catch (Exception e) {
            //Log.i("","No resource ID found for: ");
        }
        return 0;
    }

    public void onEvent(CartEvent event) {
        //Log.i("case", "case" + event.getSuccess() + " " + event.getMessage());
        hideKeyboard();

        if(event.getSuccess()) {
            hideProgressDialog();
            getBaseActivity().onBackPressed();
        } else {
            hideProgressDialog();
            ToastUtils.show(getBaseActivity(), event.getMessage());

           String errorCode = event.getErrorCode();
            if(errorCode.contains(",")) {
                String[] errorCodes = errorCode.split(",");
                String errorMessage = "";

                for(int i = 0; i < errorCodes.length; i ++) {
                    errorMessage += ErrorCodeList.getErrorMessage(errorCodes[i]) + "\n";
                }
                //Log.i("errorMessage", "errorMessage " + errorMessage);

                SimpleConfirmDialogFragment scdf = new SimpleConfirmDialogFragment();
                scdf.dial = false;
                scdf.message = errorMessage;

                scdf. show( getBaseActivity().getSupportFragmentManager(), "");
            }
        }
    }

    public void onEvent(CheckoutBoxEvent event) {
        checkoutButton.setDisabled(false);
    }

    public AddressData getUpdateAddress(AddressData.AddressForm addressForm){
        AddressData addressData = new AddressData();
        AddressData.AddressForm addressFormCon = addressData.getAddressForm();

        addressFormCon.setRoom(addressForm.getRoom().toString());
        addressFormCon.setLine1(addressForm.getLine1().toString());
        addressFormCon.setFloor(addressForm.getFloor().toString());
        addressFormCon.setBlock(addressForm.getBlock().toString());
        addressFormCon.setLine3(addressForm.getLine3().toString());
        addressFormCon.setAlley(addressForm.getAlley().toString());
        addressFormCon.setLane(addressForm.getLane().toString());
        addressFormCon.setStreetName(addressForm.getStreetName().toString());
        addressFormCon.setStreetNumber(addressForm.getStreetNumber().toString());
        addressFormCon.setTown(addressForm.getDistrict().toString());
        addressFormCon.setDistrict(addressForm.getDistrict().toString());


        String titleCode;
        if(!TextUtils.isEmpty(addressForm.getTitle())){
            titleCode = addressForm.getTitleCode().toLowerCase();
        }else{
            titleCode = addressForm.getTitleCode().toLowerCase();
        }

        addressFormCon.setTitleCode(titleCode);
        addressFormCon.setFirstName(addressForm.getFirstName().toString());
        addressFormCon.setLastName(addressForm.getLastName().toString());
        addressFormCon.setEmail(addressForm.getEmail().toString());
        addressFormCon.setPhone(addressForm.getPhone().toString());
        addressFormCon.setMobile(addressForm.getMobilePhone().toString());
        addressFormCon.setShippingAddress(addressForm.getShippingAddress());
        addressFormCon.setBillingAddress(true);
        addressFormCon.setAddressBookName(addressForm.getAddressBookName());
        addressFormCon.setCompanyName(addressForm.getCompanyName());
        addressFormCon.setLine2(addressForm.getLine2());

        addressData.setAddressForm(addressFormCon);

        return addressData;
    }

    /* fail case
05-09 13:01:27.866 20012-23337/parknshop.parknshopapp D/OkHttp: {
05-09 13:01:27.871 20012-23337/parknshop.parknshopapp D/OkHttp:   "field": "AddressForm",
05-09 13:01:27.872 20012-23337/parknshop.parknshopapp D/OkHttp:   "errorCode": "E400002",
05-09 13:01:27.872 20012-23337/parknshop.parknshopapp D/OkHttp:   "fieldErrors": [
05-09 13:01:27.872 20012-23337/parknshop.parknshopapp D/OkHttp:     {
05-09 13:01:27.872 20012-23337/parknshop.parknshopapp D/OkHttp:       "field": "mobile",
05-09 13:01:27.872 20012-23337/parknshop.parknshopapp D/OkHttp:       "message": "E400002"
05-09 13:01:27.872 20012-23337/parknshop.parknshopapp D/OkHttp:     }
05-09 13:01:27.872 20012-23337/parknshop.parknshopapp D/OkHttp:   ]
05-09 13:01:27.873 20012-23337/parknshop.parknshopapp D/OkHttp: }*/

    /*05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp: {
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "id": "8811263066135",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "title": "先生",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "titleCode": "mr",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "firstName": "sadas",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "lastName": "asdasdas",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "line1": "asd",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "region": "香港島",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "email": "hevutirradde-6079@yopmail.com",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "shippingAddress": true,
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "defaultAddress": false,
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "contactAddress": false,
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "streetName": "asd",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "streetNumber": "asdasdasd",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "floor": "asdasd",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "mobilePhone": "45654548",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "district": "西環",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "districtCode": "西環",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "districtText": "西環",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "alley": "asdasd",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "lane": "asdasd",
05-10 08:34:28.072 14904-25097/parknshop.parknshopapp D/OkHttp:   "room": "asd",
05-10 08:34:28.073 14904-25097/parknshop.parknshopapp D/OkHttp:   "isSpecialAddress": false,
05-10 08:34:28.073 14904-25097/parknshop.parknshopapp D/OkHttp:   "line3": "asdasd",
05-10 08:34:28.073 14904-25097/parknshop.parknshopapp D/OkHttp:   "addressBookName": "Tue May 10 08:34:27 GMT-04:00 2016-1700180387",
05-10 08:34:28.073 14904-25097/parknshop.parknshopapp D/OkHttp:   "b*/
}
