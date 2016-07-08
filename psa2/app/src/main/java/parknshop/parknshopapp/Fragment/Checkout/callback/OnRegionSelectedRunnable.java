package parknshop.parknshopapp.Fragment.Checkout.callback;

import parknshop.parknshopapp.Fragment.StoreLocator.View.StoreLocatorPicker;
import parknshop.parknshopapp.Model.DistrictsResponse;
import parknshop.parknshopapp.Model.RegionDistrictResponse;
import parknshop.parknshopapp.Rest.event.DistrictListEvent;
import parknshop.parknshopapp.View.CheckoutPicker;

/**
 * Created by chrisyu on 8/4/16.
 */
public class OnRegionSelectedRunnable implements Runnable {
    DistrictListEvent districtListEvent;
    RegionDistrictResponse regionDistrictResponse;
    String regionSelected;
    CheckoutPicker districtPicker;
    StoreLocatorPicker storeDistrictPicker;
    String[] stringArray = null;

    public OnRegionSelectedRunnable(DistrictListEvent districtListEvent, CheckoutPicker districtPicker) {
        this.districtListEvent = districtListEvent;
        this.districtPicker = districtPicker;
    }

    public OnRegionSelectedRunnable(RegionDistrictResponse regionDistrictResponse, CheckoutPicker districtPicker) {
        this.regionDistrictResponse = regionDistrictResponse;
        this.districtPicker = districtPicker;
    }

    public OnRegionSelectedRunnable(RegionDistrictResponse regionDistrictResponse, StoreLocatorPicker districtPicker) {
        this.regionDistrictResponse = regionDistrictResponse;
        this.storeDistrictPicker = districtPicker;
    }

    public OnRegionSelectedRunnable(String[] s, StoreLocatorPicker districtPicker) {
        this.stringArray = s;
        this.storeDistrictPicker = districtPicker;
    }

    //RegionDistrictResponse regionDistrictResponse
    public void onRegionSelected(String region) {
        this.regionSelected = region;
    }

    @Override
    public void run() {

        if(districtListEvent != null) {
            DistrictsResponse districtsResponse = districtListEvent.getDistrictsResponse();
            stringArray = districtsResponse.getListOfDistrict(regionSelected);
        }

        if(regionDistrictResponse != null) {
            stringArray = regionDistrictResponse.getDistrictsByNameSearch(regionSelected);//.toArray(new String[regionDistrictResponse.getDistrictsByNameSearch(regionSelected).size()]);
        }

        if(districtPicker != null) {
            districtPicker.setText("");
            districtPicker.setTitle("");
            districtPicker.resetDefaultText();
            districtPicker.setDataArray(stringArray);
        }

        if(storeDistrictPicker != null) {
            storeDistrictPicker.setText("");
            storeDistrictPicker.setTitle("");
            storeDistrictPicker.resetDefaultText();
            storeDistrictPicker.setDataArray(stringArray);
        }
    }
}