package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Fragment.Checkout.callback.OnRegionSelectedRunnable;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.Model.RegionDistrictResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CheckoutButtonGroupEvent;
import parknshop.parknshopapp.Rest.event.RegionDistrictEvent;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by hp on 13/4/2016.
 */
public class CheckoutAddressForm extends LinearLayout {
    public @Bind(R.id.flat) CheckoutEditText flat;
    public @Bind(R.id.floor) CheckoutEditText floor;
    public @Bind(R.id.block) CheckoutEditText block;
    public @Bind(R.id.building) CheckoutEditText building;
    public @Bind(R.id.estate) CheckoutEditText estate;
    public @Bind(R.id.street_no) CheckoutEditText streetNo;
    public @Bind(R.id.street_name) CheckoutEditText streetName;

    public @Bind(R.id.title_group) LinearLayout titleGroup;

    public @Bind (R.id.area_picker) CheckoutPicker areaPicker;
    public @Bind (R.id.district_picker) CheckoutPicker districtPicker;

    public @Bind(R.id.firstname)CheckoutEditText firstName;
    public @Bind(R.id.lastname) CheckoutEditText lastname;
    public @Bind(R.id.email) CheckoutEditText email;
    public @Bind(R.id.contact_no) CheckoutEditText contact_no;

    public @Bind(R.id.checkbox) CheckoutCheckBoxWithText checkoutCheckBoxWithText;

    public boolean isBillingAddress;
    public boolean isDeliveryAddress;

    String titleSelected = "mr";

    boolean isSelected;
    Drawable selected;
    Drawable un_selected;
    int successCode;
    Context context;

    public CheckoutAddressForm(Context context) {
        this(context, null);
    }

    public CheckoutAddressForm(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutAddressForm(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;

        LayoutInflater.from(context).inflate(R.layout.checkout_home_delivery_address_form_module, this);
        ButterKnife.bind(this);

        CheckoutButtonGroup.handleGroup(titleGroup);
        handleCheckBox(context, attrs);

        try {
            MyApplication.getInstance().register(this);
        }catch (Exception e) {
            //Log.i("null", "null pointer exeception found @ My Application");
        }

        //((BaseActivity)context).editTextGetFocus(flat.title);
    }

    public void init() {
        //WebServiceModel.getInstance(context).requestDistricts();
       // WebServiceModel.getInstance(context).requestRegions();
        WebServiceModel.getInstance(context).requestRegionsDistrictslist();
    }

    //Area
    //District

    //Network
    public void onEvent(RegionDistrictEvent regionDistrictEvent) {
        //Log.i("regionDistrictEvent", "regionDistrictEvent");
        if(regionDistrictEvent.getSuccess()) {
            RegionDistrictResponse regionDistrictResponse = (RegionDistrictResponse) regionDistrictEvent.getDataObject();
            areaPicker.setDataArray(regionDistrictResponse.getRegionListString().toArray(new String[regionDistrictResponse.getRegionListString().size()]));


            onAreaSelectedCallback = new OnRegionSelectedRunnable(regionDistrictResponse, districtPicker);
            areaPicker.setOnItemSelectedCallback(onAreaSelectedCallback);
        }
    }

    OnRegionSelectedRunnable onAreaSelectedCallback;
//    public void onEvent(RegionListEvent regionListEvent) {
//        Log.i("regionListEvent", "regionListEvent");
//        if(regionListEvent.getSuccess()) {
//            String [] stringArray = regionListEvent.getRegionsResponse().getListOfRegionList();
//            areaPicker.setDataArray(stringArray);
//        }
//       //hideProgressDialogIfNeeded(START_REQUEST);
//    }

//    //Network Event
//    public void onEvent(final DistrictListEvent districtListEvent) {
//        Log.i("districtListEvent", "districtListEvent");
//        if(districtListEvent.getSuccess()) {
//            onAreaSelectedCallback = new OnRegionSelectedRunnable(districtListEvent, districtPicker);
//            areaPicker.setOnItemSelectedCallback(onAreaSelectedCallback);
//        }
//        //hideProgressDialogIfNeeded(START_REQUEST);
//    }

    public void handleCheckBox(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutAddressForm);
        CharSequence content = a.getString(R.styleable.CheckoutAddressForm_form_checkboxtitle);
        checkoutCheckBoxWithText.isSelected = a.getBoolean(R.styleable.CheckoutAddressForm_form_isSelected, false);
        checkoutCheckBoxWithText.selected = a.getDrawable(R.styleable.CheckoutAddressForm_form_selected_drawable);
        checkoutCheckBoxWithText.un_selected = a.getDrawable(R.styleable.CheckoutAddressForm_form_unselected_drawable);

        checkoutCheckBoxWithText.updateCheckbox();
        checkoutCheckBoxWithText.contentTextView.setText(content);
    }

    public boolean isValidAddress() {
        //if(checkoutCheckBoxWithText.isSelected == false)
        //   return false;
        return true;
        /*
        if(firstName.getText().toString().length() == 0)
            return false;

        if(lastname.getText().toString().length() == 0)
            return false;

        if(contact_no.getText().toString().length() == 0 && contact_no.getText().toString().length() > 8)
            return false;

        if(flat.getText().toString().length() == 0 && floor.getText().toString().length() == 0)
            return false;

        if(block.getText().toString().length() == 0 && building.getText().toString().length() == 0)
            return false;

        if(streetName.getText().toString().length() == 0 && streetNo.getText().toString().length() == 0)
            return false;

        return true;*/
    }

    public AddressData getAddressData() {
        AddressData addressData = new AddressData();

        addressData.getAddressForm().addressBookName = new java.util.Date().toString() + new java.util.Date().hashCode() + "";
        addressData.getAddressForm().setRoom(flat.getText().toString());
        addressData.getAddressForm().setFloor(floor.getText().toString());
        addressData.getAddressForm().setLine3(block.getText().toString());
        addressData.getAddressForm().setAlley(building.getText().toString());
        addressData.getAddressForm().setLane(estate.getText().toString());

        addressData.getAddressForm().setTown(areaPicker.title.getText().toString());
        addressData.getAddressForm().setDistrict(districtPicker.title.getText().toString());

        addressData.getAddressForm().setStreetName(streetName.getText().toString());
        addressData.getAddressForm().setStreetNumber(streetNo.getText().toString());

        addressData.getAddressForm().setTitleCode(titleSelected);
        addressData.getAddressForm().setFirstName(firstName.getText().toString());
        addressData.getAddressForm().setLastName(lastname.getText().toString());
        addressData.getAddressForm().setMobile(contact_no.getText().toString());

        addressData.getAddressForm().setBillingAddress(isBillingAddress);
        addressData.getAddressForm().setShippingAddress(isDeliveryAddress);
        return addressData;
    }

    public void clearEditTextFocus() {
        flat.title.clearFocus();
        floor.title.clearFocus();
        block.title.clearFocus();
        building.title.clearFocus();
        estate.title.clearFocus();
        streetNo.title.clearFocus();
        streetName.title.clearFocus();
        firstName.title.clearFocus();
        lastname.title.clearFocus();
        email.title.clearFocus();
        contact_no.clearFocus();
    }

    public void onEvent(CheckoutButtonGroupEvent checkoutButtonGroupEvent) {
        if(CheckoutButtonGroup.checkSource(checkoutButtonGroupEvent, titleGroup)) {
            if(checkoutButtonGroupEvent.getPosition() == 0)
                titleSelected = "mr";
            else if(checkoutButtonGroupEvent.getPosition() == 1)
                titleSelected = "ms";
            else if(checkoutButtonGroupEvent.getPosition() == 2)
                titleSelected = "mrs";
            else if(checkoutButtonGroupEvent.getPosition() == 3)
                titleSelected = "miss";
        }
    }


        /*
    public @Bind(R.id.flat) CheckoutEditText flat;
    public @Bind(R.id.floor) CheckoutEditText floor;
    public @Bind(R.id.block) CheckoutEditText block;
    public @Bind(R.id.building) CheckoutEditText building;
    public @Bind(R.id.estate) CheckoutEditText estate;
    public @Bind(R.id.street_no) CheckoutEditText streetNo;
    public @Bind(R.id.street_name) CheckoutEditText streetName;

    public @Bind(R.id.title_group) LinearLayout titleGroup;

    public @Bind (R.id.area_picker) CheckoutPicker areaPicker;
    public @Bind (R.id.district_picker) CheckoutPicker districtPicker;

    public @Bind(R.id.firstname)CheckoutEditText firstName;
    public @Bind(R.id.lastname) CheckoutEditText lastname;
    public @Bind(R.id.email) CheckoutEditText email;
    public @Bind(R.id.contact_no) CheckoutEditText contact_no;
    */
    /*"addressForm": {
						"addressBookName": "k0315", ignore
						"titleCode": "mr",          ok
						"firstName": "kKkK0315",    ok
						"lastName": "k0315",        ok
						"companyName": "k0315",     ignore
						"mobile": "98745636",       ok  > 8 needed
						"phone": "98745636",        ignore
						"room": "k0315",            ok
						"floor": "k0315",           ok
						"line3": "line30315",       ok
						"alley": "k0315",           ok
						"lane": "lane0315",         ok
						"streetNumber": "strno0315",ok
						"streetName": "strname0315",ok
						"town": "kowloon",          ok
						"district": "lamtin",       ok
						"shippingAddress": true     ok
	}*/

    /* [13/4/2016上午11:55:31] Martin So: Line3 == block
       [13/4/2016上午11:55:47] Martin So: Alley == building
       [13/4/2016上午11:56:04] Martin So: Lane == Estate Name */

}
