package parknshop.parknshopapp.Fragment.Checkout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.orhanobut.hawk.Hawk;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.CheckoutAddAddressFormFragment;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.Model.AddressesResponse;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.AddressesEvent;
import parknshop.parknshopapp.Rest.event.CartEvent;
import parknshop.parknshopapp.Rest.event.CheckoutBoxEvent;
import parknshop.parknshopapp.Rest.event.CheckoutButtonGroupEvent;
import parknshop.parknshopapp.Rest.event.DistrictListEvent;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import parknshop.parknshopapp.Rest.event.RegionListEvent;
import parknshop.parknshopapp.Rest.event.RequestAddAddressEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutAddress;
import parknshop.parknshopapp.View.CheckoutAddressForm;
import parknshop.parknshopapp.View.CheckoutButton;
import parknshop.parknshopapp.View.CheckoutButtonGroup;
import parknshop.parknshopapp.View.CheckoutReminder;
import parknshop.parknshopapp.WebServiceModel;
/**
 * Created by chrisyu on 5/4/16.
 */
public class CheckoutDeliveryMethodFragment extends BaseFragment {
    public boolean goBackToConfirmation;
    public static String CHEUNGCHAU = "cheungchau";
    public static String LANTAUISLAND = "lantauisland";

    //@Bind (R.id.stored_delivery_address) CheckoutAddress storedDeliveryAddress;
    @Bind (R.id.addresses_wrapper) LinearLayout addressesVerticalWrapper;

    //Button Group
    @Bind(R.id.checkout_group) LinearLayout deliveryGroup;
    @Bind (R.id.self_pick_up_group) LinearLayout selfPickupGroup;

    //Step 2a, 2b module
    @Bind (R.id.home_delivery_module) LinearLayout homeDeliveryModule;
    @Bind (R.id.self_pick_up_module) View selfPickUpModule;

    @Bind (R.id.address_form) CheckoutAddressForm checkoutAddressForm;

    @Bind (R.id.item_not_available_reminder_home) CheckoutReminder homeDeliveryItemNotAvailable;
    @Bind (R.id.item_not_available_reminder_self) CheckoutReminder selfPickUpNotAvailable;

    @Bind (R.id.con) CheckoutButton nextButton;

    public String deliveryMode = "HomeDelivery"; //defaultvalue
    private String selfPickUpStore = "cheungchau";
    private String selectedCheckoutAddressId;

    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        hideShoppingCartButton();
        disableSecondRightButton();
        disableSearchButton();
        setToolbarTitle(getString(R.string.checkout));

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step01-delivery-method/home-delivery");

        LinearLayout ll = new LinearLayout(getBaseActivity());
        ll.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));

        view = getActivity().getLayoutInflater().inflate(R.layout.checkout_delievery_method_layout, ll);
        apiCount = 0;

        ButterKnife.bind(this, view);

        CheckoutButtonGroup.handleGroup(deliveryGroup);
        CheckoutButtonGroup.handleGroup(selfPickupGroup);

        homeDeliveryItemNotAvailable.setVisibility(View.GONE);
        selfPickUpNotAvailable.setVisibility(View.GONE);

        WebServiceModel.getInstance(getBaseActivity()).requestGetCart(getBaseActivity(), "init");
        WebServiceModel.getInstance(getBaseActivity()).getAddressBook(getBaseActivity());

        showProgressDialog();

        Hawk.put("deliveryMode", deliveryMode);
        return view;
    }

    public static int START_REQUEST = 2;

    //Network Event - 1)requestGetCart + 2)Submit button - saveDeliveryAddress
    public void onEvent(CartEvent cartEvent) {
        if(cartEvent.getSuccess()) {
            CartResponse cartResponse = cartEvent.getCartResponse();

            if(cartEvent.getType().equals("init")) {
                if (cartResponse.getDeliveryAddress() != null) {
                    String selectedDistrict = cartResponse.getDeliveryAddress().getDistrict();
                    if (selectedDistrict.equals(CHEUNGCHAU) || selectedDistrict.equals(LANTAUISLAND)) {
                        CheckoutButtonGroup.manualOnClickButton(deliveryGroup, 1);
                        deliveryMode = "SelfPickUp";
                        Hawk.put("deliveryMode", deliveryMode);

                        if (selectedDistrict.equals(CHEUNGCHAU))
                            CheckoutButtonGroup.manualOnClickButton(selfPickupGroup, 0);
                        else
                            CheckoutButtonGroup.manualOnClickButton(selfPickupGroup, 1);
                    }
                }
            }
            if(cartResponse.getReminderCartEntries().size() > 0)
                showReminderIfNeeded(cartResponse);

            //if(cartResponse.getReminderCartEntries().size() == cartResponse.getAllEntry().size())
            //    nextButton.setDisabled(true);
        }

        //hideProgressDialog();
        hideProgressDialogIfNeeded(START_REQUEST);
    }

    //Network event - getAddressBook
    public void onEvent(AddressesEvent baseEvent) {
        if(baseEvent.getSuccess()) {
            AddressesResponse data = (AddressesResponse) baseEvent.getDataObject();
            addressesVerticalWrapper.removeAllViews();

            CartResponse cartResponse = HomePresenter.getRemoteShoppingCart();
            AddressData.AddressForm deliveryAddress = cartResponse.getDeliveryAddress();

            for(int i = 0; i < data.getAddresses().size(); i++) {
                AddressData.AddressForm addressForm = data.getAddresses().get(i);

                CheckoutAddress checkoutAddress = CheckoutAddress.build(getBaseActivity(), addressForm);
                checkoutAddress.checkboxView.addressForm = addressForm;


                if(deliveryAddress.getDistrict().equals(addressForm.getDistrict()) && deliveryAddress.getBlock().equals(addressForm.getBlock()) && deliveryAddress.getAlley().equals(addressForm.getAlley()) && deliveryAddress.getFirstName().equals(addressForm.getFirstName()) ) {
                    checkoutAddress.checkboxView.setSelected(true);
                    checkoutAddress.checkboxView.isHomeDeliveryCheckbox = true;
                    nextButton.setDisabled(false);
                    deliveryMode = "HomeDelivery";
                    Hawk.put("deliveryMode", deliveryMode);
                }

                addressesVerticalWrapper.addView(checkoutAddress);
            }

            if(data.getAddresses().size() == 0)
                checkoutAddressForm.checkoutCheckBoxWithText.reverseCheckbox();
        } else {
            checkoutAddressForm.checkoutCheckBoxWithText.reverseCheckbox();
        }

        hideProgressDialogIfNeeded(START_REQUEST);
    }

    //UI Event
    public void onEvent(CheckoutBoxEvent checkoutBoxEvent) {
        nextButton.setDisabled(false);
        if(checkoutBoxEvent.getDataId() != null) {
            selectedCheckoutAddressId = checkoutBoxEvent.getDataId();
            //Log.i("checkoutBoxEvent", "checkoutBoxEvent");
            deliveryMode = "HomeDelivery";
            Hawk.put("deliveryMode", deliveryMode);
        } else {
            selectedCheckoutAddressId = "new_delivery_address";//checkoutBoxEvent.getDataId();
        }
    }

    //UI Event
    public void onEvent(CheckoutButtonGroupEvent checkoutButtonGroupEvent) {
        if (CheckoutButtonGroup.checkSource(checkoutButtonGroupEvent, deliveryGroup)) {
            //checkoutAddressForm.clearFocus();
            if (checkoutButtonGroupEvent.getPosition() == 0) {

                //GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step01-delivery-method/home-delivery");

                homeDeliveryModule.setVisibility(View.VISIBLE);
                selfPickUpModule.setVisibility(View.GONE);
                homeDeliveryModule.setDescendantFocusability(ViewGroup.FOCUS_AFTER_DESCENDANTS);
                //deliveryMode = "HomeDelivery";
                //Hawk.put("deliveryMode", deliveryMode);
            } else {

                //GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step01-delivery-method/self-pick-up");

                homeDeliveryModule.setVisibility(View.GONE);
                selfPickUpModule.setVisibility(View.VISIBLE);
                homeDeliveryModule.setDescendantFocusability(ViewGroup.FOCUS_BLOCK_DESCENDANTS);
                //deliveryMode = "SelfPickUp";
                //Hawk.put("deliveryMode", deliveryMode);
            }
        } else if(CheckoutButtonGroup.checkSource(checkoutButtonGroupEvent, selfPickupGroup)) {

            deliveryMode = "SelfPickUp";
            Hawk.put("deliveryMode", deliveryMode);

            if(checkoutButtonGroupEvent.getPosition() == 0)
                selfPickUpStore = "cheungchau";
            else if(checkoutButtonGroupEvent.getPosition() == 1)
                selfPickUpStore = "lantauisland";

            nextButton.setDisabled(false);
           //if(checkoutButtonGroupEvent.callApi) {
            //Log.i("calling", "calling");
            showProgressDialog();
            WebServiceModel.getInstance(getBaseActivity()).setSelfPickUpStore(selfPickUpStore, getBaseActivity());
            WebServiceModel.getInstance(getBaseActivity()).requestGetCart(getBaseActivity());

            CheckoutBoxEvent checkoutBoxEvent = new CheckoutBoxEvent();
            checkoutBoxEvent.setSuccessCode(1234);
            MyApplication.getInstance().mBus.post(checkoutBoxEvent);
           // }
        }
    }

    @OnClick (R.id.add_new_delivery_address)
    public void addNewDeliveryAddress(){

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step01-delivery-method/add-delivery-address");

        CheckoutAddAddressFormFragment checkoutAddAddressFormFragment = new CheckoutAddAddressFormFragment();
        placeFragmentWithBackStack(checkoutAddAddressFormFragment);
    }

    @OnClick(R.id.con)
    public void next() {

        //set DeliveryMode
        isOk = true;
        if(nextButton.disabledView.getVisibility() == View.VISIBLE)
            return;

        //deliveryMode;
        Hawk.put("deliveryMode", deliveryMode);

        //Log.i("deliveryMode", "deliveryMode" + deliveryMode);

        if(deliveryMode.equals("HomeDelivery")) {
            GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step01-delivery-method/home-delivery");

            showProgressDialog();

            WebServiceModel.getInstance(getBaseActivity()).saveDeliveryMode(deliveryMode);

        } else if (deliveryMode.equals("SelfPickUp")) {
            GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step01-delivery-method/self-pick-up");

            DeliveryTimeslotFragment dtlf = new  DeliveryTimeslotFragment();
            if(goBackToConfirmation)
                dtlf.goBackToConfirmation = true;
            placeFragmentWithBackStack(dtlf);
        }
    }

    boolean isOk = true;
    public void onEvent(RequestAddAddressEvent event) {
        if(!event.getSuccess()) {
            isOk = false;
            ToastUtils.show(getBaseActivity(), event.getMessage());
        } else {
            hideProgressDialogIfNeededAndGoToNextPage(1);
        }
    }

    //Network event
    public void onEvent(EmptyJsonEvent emptyJsonEvent) {
        //Log.i("emptyJsonEvent", "emptyJsonEvent " + emptyJsonEvent.getType() + " " + deliveryMode + " " + checkoutAddressForm.checkoutCheckBoxWithText.isSelected);
        if(deliveryMode.equals("HomeDelivery")) {
            //if (checkoutAddressForm.isValidAddress()) {
            //    hideProgressDialogIfNeededAndGoToNextPage(3);
            //}
            //else
            if(emptyJsonEvent.getType().equals("saveDeliveryMode")) {
                if (checkoutAddressForm.checkoutCheckBoxWithText.isSelected)
                    hideProgressDialogIfNeededAndGoToNextPage(2);
                else
                    hideProgressDialogIfNeededAndGoToNextPage(1);
            }
        }
        if(deliveryMode.equals("SelfPickUp")){
            hideProgressDialogIfNeededAndGoToNextPage(1);
        }
    }

    //Network Event
    int apiCount = 0;
    public void onEvent(RegionListEvent regionListEvent) {
        hideProgressDialogIfNeeded(START_REQUEST);
    }

    //Network Event
    public void onEvent(final DistrictListEvent districtListEvent) {
        hideProgressDialogIfNeeded(START_REQUEST);
    }

    public void showReminderIfNeeded(CartResponse cartResponse) {
        if(cartResponse.getReminderCartEntries() != null && cartResponse.getReminderCartEntries().size() > 0) {
            if (deliveryMode.equals("HomeDelivery")) {
                homeDeliveryItemNotAvailable.setVisibility(View.VISIBLE);
                homeDeliveryItemNotAvailable.subTitle.setText( (getResources().getString(R.string.reminder_primary_desc).replace("%s", "" + cartResponse.getReminderCartEntries().size()) ));
                selfPickUpNotAvailable.setVisibility(View.GONE);
                homeDeliveryItemNotAvailable.addProductChildIfNeeded(cartResponse.getReminderCartEntries());
            }

            if (deliveryMode.equals("SelfPickUp")) {
                homeDeliveryItemNotAvailable.setVisibility(View.GONE);
                selfPickUpNotAvailable.setVisibility(View.VISIBLE);
                selfPickUpNotAvailable.subTitle.setText( (getResources().getString(R.string.reminder_primary_desc).replace("%s", "" + cartResponse.getReminderCartEntries().size()) ));
                selfPickUpNotAvailable.addProductChildIfNeeded(cartResponse.getReminderCartEntries());
            }
        } else {
            homeDeliveryItemNotAvailable.setVisibility(View.GONE);
            selfPickUpNotAvailable.setVisibility(View.GONE);
        }
    }

    public void hideProgressDialogIfNeededAndGoToNextPage(int count) {
        apiCount++;
        //Log.i("isOk", "isOk" + isOk + " " + apiCount + " " + count);
        if(apiCount >= count) {
            hideProgressDialog();
            apiCount = 0;
            if(isOk) {

                DeliveryTimeslotFragment dtlf = new  DeliveryTimeslotFragment();
                if(goBackToConfirmation)
                    dtlf.goBackToConfirmation = true;
                placeFragmentWithBackStack(dtlf);
            }
        }
    }

    public void hideProgressDialogIfNeeded(int count) {
        apiCount++;
        if(apiCount >= count) {
            //Log.i("hideProgressDialogIfNee", "hideProgressDialogIfNee");
            hideProgressDialog();
            apiCount = 0;
        }
    }

    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    //@Bind(R.id.checkout_dot_1) LinearLayout dot1;
    //@Bind(R.id.checkout_dot_2) LinearLayout dot2;
    //@Bind(R.id.checkout_dot_3) LinearLayout dot3;
    //@Bind(R.id.checkout_dot_4) LinearLayout dot4;
}
