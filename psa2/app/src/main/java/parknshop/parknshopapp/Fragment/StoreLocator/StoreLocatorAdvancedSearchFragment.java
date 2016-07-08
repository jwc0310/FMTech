package parknshop.parknshopapp.Fragment.StoreLocator;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Checkout.callback.OnRegionSelectedRunnable;
import parknshop.parknshopapp.Fragment.StoreLocator.View.StoreLocatorPicker;
import parknshop.parknshopapp.Model.BrandListResponse;
import parknshop.parknshopapp.Model.RegionDistrictResponse;
import parknshop.parknshopapp.Model.StoreListResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.View.CheckoutCheckBoxWithText;

/**
 * Created by chrisyu on 29/4/16.
 */
public class StoreLocatorAdvancedSearchFragment extends BaseFragment {
    BrandListResponse brandListResponse;
    RegionDistrictResponse regionDistrictResponse;

    List<StoreListResponse.Store> stores;
    ArrayList<String> districts = new ArrayList<String>();
    ArrayList<String> regions = new ArrayList<String>();
    ArrayList<String> brandlogos = new ArrayList<String>();
    OnRegionSelectedRunnable onAreaSelectedCallback;

    View view;
    @Bind(R.id.region) StoreLocatorPicker regionPicker;
    @Bind(R.id.district) StoreLocatorPicker districtPicker;
    @Bind(R.id.brand) StoreLocatorPicker brandPicker;
    @Bind(R.id.parking_checkbox)
    CheckoutCheckBoxWithText parkingCheckbox;

    LinearLayout linearLayout;
    public void onCreate(Bundle onSaved) {
        super.onCreate(onSaved);
        linearLayout = new LinearLayout(getBaseActivity());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        view = getLayoutInflater(onSaved).inflate(R.layout.store_locator_advanced_search_fragment_layout, linearLayout);
        ButterKnife.bind(this, view);

        stores = Hawk.get(AppUtils.store_locator_store_list, new ArrayList<StoreListResponse.Store>());

        //WebServiceModel.getInstance(getActivity()).requestGetBrandList(getActivity());
        // WebServiceModel.getInstance(getActivity()).requestRegionsDistrictslist();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        showBackButton();
        setToolbarTitle(getString(R.string.store_locator_advacned_search));

        if (stores != null) {
            districts.clear();
            regions.clear();
            for (int i = 0; i < stores.size(); i++) {
                StoreListResponse.Store store = stores.get(i);

                if (!districts.contains(store.getAddress().getDistrict()))
                    districts.add(store.getAddress().getDistrict());

                if (!regions.contains(store.getAddress().getRegion()))
                    regions.add(store.getAddress().getRegion());

                if (!brandlogos.contains(store.getBrandLogo()))
                    brandlogos.add(store.getBrandLogo());

                //Log.i("brandLogo", "brandLogo" + store.getBrandLogo());
            }

            //regionPicker
            regionPicker.setDataArray(regions.toArray(new String[regions.size()]));

            //districtPicker
            onAreaSelectedCallback = new OnRegionSelectedRunnable(districts.toArray(new String[districts.size()]), districtPicker);
            regionPicker.setOnItemSelectedCallback(onAreaSelectedCallback);

            //brandPicker
            brandPicker.setDataArray(brandlogos.toArray(new String[brandlogos.size()]));
        }
        return view;
    }


    public void hidePreogressDialogIfNeeded() {
        if (brandListResponse != null && regionDistrictResponse != null)
            hideProgressDialog();
    }

    @OnClick(R.id.search_now)
    public void searchNow() {
        StoreLocatorListFragment storeLocatorListFragment = new StoreLocatorListFragment();


        if (regionPicker.getText() != null && regionPicker.getText().length() > 0) {
            Hawk.put("selectedRegion", regionPicker.getText());
            //caseRequired++;
        }

        if (districtPicker.getText() != null && districtPicker.getText().length() > 0) {
            Hawk.put("selectedPicker", districtPicker.getText());
            //caseRequired++;
        }

        if (brandPicker.getText() != null && brandPicker.getText().length() > 0) {
            Hawk.put("selectedBrand", brandPicker.getText());
            //caseRequired++;
        }

        if (parkingCheckbox.isSelected) {
            Hawk.put("isParkingRequired", parkingCheckbox.isSelected);
            //caseRequired++;
        }

        ArrayList<StoreListResponse.Store> storeArrayList = getStoreListViaDistrictRegionAndBrand();
        storeLocatorListFragment.stores = storeArrayList;
        storeLocatorListFragment.isSearch = true;

        placeFragmentWithBackStack(storeLocatorListFragment);
    }

    public ArrayList<StoreListResponse.Store> getStoreListViaDistrictRegionAndBrand() {
        ArrayList<StoreListResponse.Store> searchResult = new ArrayList<StoreListResponse.Store>();

        ArrayList<StoreListResponse.Store> storeList = Hawk.get(AppUtils.store_locator_store_list, new ArrayList<StoreListResponse.Store>());

        if (storeList != null) {
            for (int i = 0; i < storeList.size(); i++) {
                StoreListResponse.Store store = storeList.get(i);

                int caseRequired = 0;
                int caseMatched = 0;

                if (regionPicker.getText() != null && regionPicker.getText().length() > 0) {
                    caseRequired++;
                }

                if (districtPicker.getText() != null && districtPicker.getText().length() > 0)
                    caseRequired++;


                if (brandPicker.getText() != null && brandPicker.getText().length() > 0)
                    caseRequired++;


                if (parkingCheckbox.isSelected)
                    caseRequired++;


                if (regionPicker.getText() != null && store.getAddress().getRegion().equals(regionPicker.getText()))
                    caseMatched++;
                //Log.i("caseMatched", "caseMatched" + store.getAddress().getRegion());

                if (districtPicker.getText() != null && store.getAddress().getDistrict().equals(districtPicker.getText()))
                    caseMatched++;
                //Log.i("caseMatched", "caseMatched" + store.getAddress().getDistrict());

                if (brandPicker.getText() != null && store.getBrandLogo().equals(brandPicker.getText()))
                    caseMatched++;
                Log.i("caseMatched", "caseMatched" + store.getBrandLogo());

                if (parkingCheckbox.isSelected && store.getFeatures().size() >= 1 && store.getFeatures().get(0).get(1).equals("With Parking"))
                    caseMatched++;

                if (store.getFeatures().size() >= 1)
                    Log.i("caseMatched", "caseMatched[" + store.getFeatures().get(0).get(1));

                //Log.i("caseMatched", "caseMatched" + caseRequired + " " + caseMatched);

                if (caseRequired == caseMatched)
                    searchResult.add(store);
            }
        }
        return searchResult;
    }
}

/*"features": [
04-30 18:29:35.236 31620-31662/parknshop.parknshopapp D/OkHttp:         [
04-30 18:29:35.236 31620-31662/parknshop.parknshopapp D/OkHttp:           "K",
04-30 18:29:35.236 31620-31662/parknshop.parknshopapp D/OkHttp:           "With Parking"
04-30 18:29:35.237 31620-31662/parknshop.parknshopapp D/OkHttp:         ]
04-30 18:29:35.237 31620-31662/parknshop.parknshopapp D/OkHttp:       ],*/