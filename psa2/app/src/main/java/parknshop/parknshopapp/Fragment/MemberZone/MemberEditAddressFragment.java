package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Checkout.callback.OnRegionSelectedRunnable;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.Model.RegionDistrictResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CheckoutButtonGroupEvent;
import parknshop.parknshopapp.Rest.event.RegionDistrictEvent;
import parknshop.parknshopapp.Rest.event.UpdateAddressEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutButton;
import parknshop.parknshopapp.View.CheckoutButtonGroup;
import parknshop.parknshopapp.View.CheckoutCheckBoxWithText;
import parknshop.parknshopapp.View.CheckoutEditText;
import parknshop.parknshopapp.View.CheckoutPicker;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class MemberEditAddressFragment extends BaseFragment {
    @Bind(R.id.title_group)
    LinearLayout title_group;
    @Bind(R.id.btnMr)
    CheckoutButton btnMr;
    @Bind(R.id.btnMs)
    CheckoutButton btnMs;
    @Bind(R.id.btnMrs)
    CheckoutButton btnMrs;
    @Bind(R.id.btnMiss)
    CheckoutButton btnMiss;
    @Bind(R.id.firstname)
    CheckoutEditText firstname;
    @Bind(R.id.lastname)
    CheckoutEditText lastname;
    @Bind(R.id.email)
    CheckoutEditText email;
    @Bind(R.id.contact_no)
    CheckoutEditText contact_no;
    @Bind(R.id.flat)
    CheckoutEditText flat;
    @Bind(R.id.floor)
    CheckoutEditText floor;
    @Bind(R.id.block)
    CheckoutEditText block;
    @Bind(R.id.building)
    CheckoutEditText building;
    @Bind(R.id.estate)
    CheckoutEditText estate;
    @Bind(R.id.street_no)
    CheckoutEditText street_no;
    @Bind(R.id.street_name)
    CheckoutEditText street_name;
    @Bind(R.id.area_picker)
    CheckoutPicker area_picker;
    @Bind(R.id.district_picker)
    CheckoutPicker district_picker;
    @Bind(R.id.checkbox)
    CheckoutCheckBoxWithText checkbox;
//    @Bind(R.id.save)
//    CheckoutButton save;
    AddressData.AddressForm address;

    String title;

    boolean isOnCreate = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_zone_delivery_form, container, false);
        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.edit_delivery_address));
        disableSecondRightButton();
        disableCartButton();

        address = (AddressData.AddressForm) getArguments().getSerializable("address");

    /* [13/4/2016上午11:55:31] Martin So: Line3 == block
       [13/4/2016上午11:55:47] Martin So: Alley == building
       [13/4/2016上午11:56:04] Martin So: Lane == Estate Name */
        CheckoutButtonGroup.handleGroup(title_group);

        if(address.getTitleCode().equals("mr")){
            CheckoutButtonGroup.manualOnClickButton(title_group, 0);
        }else if(address.getTitleCode().equals("ms")){
            CheckoutButtonGroup.manualOnClickButton(title_group, 1);
        }else if(address.getTitleCode().equals("mrs")){
            CheckoutButtonGroup.manualOnClickButton(title_group, 2);
        }else if(address.getTitleCode().equals("miss")){
            CheckoutButtonGroup.manualOnClickButton(title_group, 3);
        }


        LogUtil.info("", "getRegion2:"+address.getRegion()+", "+address.getDistrictText());
        LogUtil.info("", "getRegion3:"+address.getFloor()+", "+address.getLine3());
        firstname.setText(address.getFirstName());
        lastname.setText(address.getLastName());
        email.setText(address.getEmail());
        contact_no.setText(address.getMobilePhone());
        flat.setText(address.getRoom());
        floor.setText(address.getFloor());
        block.setText(address.getLine3());
        building.setText(address.getAlley());
        estate.setText(address.getLane());
        street_no.setText(address.getStreetNumber());
        street_name.setText(address.getStreetName());
        area_picker.setText(address.getRegion());
        district_picker.setText(address.getDistrictText());

        if(address.isDefaultAddress()){
            checkbox.setSelected(true);
        }

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
        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).setUpdateAddress(getActivity(), address.getId(), getUpdateAddress());
    }

    public void onEvent(RegionDistrictEvent regionDistrictEvent) {
        hideProgressDialog();
        if(regionDistrictEvent.getSuccess()) {
            RegionDistrictResponse regionDistrictResponse = (RegionDistrictResponse) regionDistrictEvent.getDataObject();
            area_picker.setDataArray(regionDistrictResponse.getRegionListString().toArray(new String[regionDistrictResponse.getRegionListString().size()]));


            onAreaSelectedCallback = new OnRegionSelectedRunnable(regionDistrictResponse, district_picker);
            area_picker.setOnItemSelectedCallback(onAreaSelectedCallback);
        }
    }

    OnRegionSelectedRunnable onAreaSelectedCallback;

    public void onEvent(UpdateAddressEvent updateAddressEvent) {
        hideProgressDialog();
        hideLoadingBtnLoading();
        if(updateAddressEvent.getSuccess()){
            ToastUtils.show(getActivity(), getString(R.string.update_success));
            getActivity().onBackPressed();
        }else{
            ToastUtils.show(getActivity(), updateAddressEvent.getMessage());
        }
    }

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

        String titleCode;
        if(!TextUtils.isEmpty(title)){
            titleCode = title.toLowerCase();
        }else{
            titleCode = address.getTitleCode();
        }

        addressForm.setTitleCode(titleCode);
        addressForm.setFirstName(firstname.getText().toString());
        addressForm.setLastName(lastname.getText().toString());
        addressForm.setEmail(email.getText().toString());
        addressForm.setPhone(contact_no.getText().toString());
        addressForm.setMobile(contact_no.getText().toString());
        addressForm.setShippingAddress(address.isShippingAddress());
        addressForm.setDefaultAddress(checkbox.isSelected);
        addressForm.setAddressBookName(address.getAddressBookName());
        addressForm.setCompanyName(address.getCompanyName());
        addressForm.setLine2(address.getLine2());

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
}
