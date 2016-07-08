package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Checkout.callback.OnRegionSelectedRunnable;
import parknshop.parknshopapp.Fragment.Dialog.SimpleConfirmDialogFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.Model.RegionDistrictResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CheckoutButtonGroupEvent;
import parknshop.parknshopapp.Rest.event.RegionDistrictEvent;
import parknshop.parknshopapp.Rest.event.RequestAddAddressEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutButton;
import parknshop.parknshopapp.View.CheckoutButtonGroup;
import parknshop.parknshopapp.View.CheckoutCheckBoxWithText;
import parknshop.parknshopapp.View.CheckoutEditText;
import parknshop.parknshopapp.View.CheckoutPicker;
import parknshop.parknshopapp.View.LoadingButton;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class MemberAddAddressFragment extends BaseFragment {
    @Bind(R.id.title_group) LinearLayout title_group;
    @Bind(R.id.btnMr) CheckoutButton btnMr;
    @Bind(R.id.btnMs) CheckoutButton btnMs;
    @Bind(R.id.btnMrs) CheckoutButton btnMrs;
    @Bind(R.id.btnMiss) CheckoutButton btnMiss;
    @Bind(R.id.firstname) CheckoutEditText firstname;
    @Bind(R.id.lastname) CheckoutEditText lastname;
    @Bind(R.id.email) CheckoutEditText email;
    @Bind(R.id.contact_no) CheckoutEditText contact_no;
    @Bind(R.id.flat) CheckoutEditText flat;
    @Bind(R.id.floor) CheckoutEditText floor;
    @Bind(R.id.block) CheckoutEditText block;
    @Bind(R.id.building) CheckoutEditText building;
    @Bind(R.id.estate) CheckoutEditText estate;
    @Bind(R.id.street_no) CheckoutEditText street_no;
    @Bind(R.id.street_name) CheckoutEditText street_name;
    @Bind(R.id.area_picker) CheckoutPicker area_picker;
    @Bind(R.id.district_picker) CheckoutPicker district_picker;
    @Bind(R.id.checkbox) CheckoutCheckBoxWithText checkbox;
    @Bind(R.id.save)
    LoadingButton save;

    String title = "mr";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_zone_delivery_form, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/add-delivery-address");

        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.add_delivery_address));
        disableSecondRightButton();
        disableCartButton();

        save.setText(getString(R.string.add_address));

        CheckoutButtonGroup.handleGroup(title_group);


        getBaseActivity().editTextGetFocusNonStatic(flat.title);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestRegionsDistrictslist();
    }

    @OnClick(R.id.save)
    public void btnSave(){
        hideKeyboard();
//        showProgressDialog();
        showLoadingBtnLoading();
        WebServiceModel.getInstance(getActivity()).requestAddAddress(getUpdateAddress(),getActivity());
    }

    //Area
    //District

    //Network
    public void onEvent(RegionDistrictEvent regionDistrictEvent) {
        hideProgressDialog();
        hideLoadingBtnLoading();
        if(regionDistrictEvent.getSuccess()) {
            RegionDistrictResponse regionDistrictResponse = (RegionDistrictResponse) regionDistrictEvent.getDataObject();
            area_picker.setDataArray(regionDistrictResponse.getRegionListString().toArray(new String[regionDistrictResponse.getRegionListString().size()]));


            onAreaSelectedCallback = new OnRegionSelectedRunnable(regionDistrictResponse, district_picker);
            area_picker.setOnItemSelectedCallback(onAreaSelectedCallback);
        }
    }

    OnRegionSelectedRunnable onAreaSelectedCallback;

    public AddressData getUpdateAddress(){
        AddressData addressData = new AddressData();
        AddressData.AddressForm addressForm = addressData.getAddressForm();

        addressForm.setRoom(flat.getText().toString());
        addressForm.setLine1(flat.getText().toString());
        addressForm.setFloor(floor.getText().toString());
        addressForm.setBlock(block.getText().toString());
        addressForm.setLine3(block.getText().toString());
        addressForm.setAlley(building.getText().toString());
        addressForm.setLane(estate.getText().toString());
        addressForm.setStreetName(street_name.getText().toString());
        addressForm.setStreetNumber(street_no.getText().toString());
        addressForm.setTown(area_picker.getText().toString());
        addressForm.setDistrict(district_picker.getText().toString());

        addressForm.setTitleCode(title.toLowerCase());
        addressForm.setFirstName(firstname.getText().toString());
        addressForm.setLastName(lastname.getText().toString());
        addressForm.setEmail(email.getText().toString());
        addressForm.setPhone(contact_no.getText().toString());
        addressForm.setMobile(contact_no.getText().toString());
        addressForm.setShippingAddress(false);
        addressForm.setDefaultAddress(checkbox.isSelected);
        addressForm.setAddressBookName(System.currentTimeMillis() + "");
        addressForm.setCompanyName("");
        addressForm.setLine2("");

        addressData.setAddressForm(addressForm);

        return addressData;
    }

    public void onEvent(CheckoutButtonGroupEvent checkoutButtonGroupEvent) {
        if(checkoutButtonGroupEvent.getText().equals(getString(R.string.mr))){
            title = "mr";
        }else if(checkoutButtonGroupEvent.getText().equals(getString(R.string.ms))){
            title = "ms";
        }else if(checkoutButtonGroupEvent.getText().equals(getString(R.string.mrs))){
            title = "mrs";
        }else if(checkoutButtonGroupEvent.getText().equals(getString(R.string.miss))){
            title = "miss";
        }
    }

    public void onEvent(RequestAddAddressEvent event) {
        hideProgressDialog();
        hideLoadingBtnLoading();
        if(event.getSuccess()){
            ToastUtils.show(getActivity(), getString(R.string.update_success));
            getActivity().onBackPressed();

        } else {
           // ToastUtils.show(getActivity(), requestAddAddressEvent.getMessage());

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
        }
    }


}
