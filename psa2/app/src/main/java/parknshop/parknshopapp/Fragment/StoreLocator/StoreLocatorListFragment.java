package parknshop.parknshopapp.Fragment.StoreLocator;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.StoreLocator.View.StoreLocatorListViewItem;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.StoreListResponse;
import parknshop.parknshopapp.Model.StoreLocatorResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.LocationEvent;
import parknshop.parknshopapp.Rest.event.OnMarkerPressedEvent;
import parknshop.parknshopapp.Utils.ToastUtils;

/**
 * Created by chrisyu on 27/4/16.
 */
public class StoreLocatorListFragment extends BaseFragment implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener {
    public List<StoreListResponse.Store> stores;
    public ArrayList<StoreLocatorResponse.StoreLcoatorItem> storeLcoatorItems;
    public Location mLocation;
    public boolean gpsRequired;
    public String titleString;
    public boolean isSearch;

    @Bind(R.id.not_found) TextView noFound;
    @Bind(R.id.listview) ListView listview;
    StoreLocatorListAdapter storeLocatorListAdapter;

    View view;
    public void onCreate(Bundle onSaved) {
        super.onCreate(onSaved);
        view = getLayoutInflater(onSaved).inflate(R.layout.store_locator_list_layout, null);
        ButterKnife.bind(this, view);

        storeLocatorListAdapter = new StoreLocatorListAdapter();
        storeLocatorListAdapter.context = getBaseActivity();


        //This is for product detail page's store locator
        if(storeLcoatorItems == null) {
            storeLocatorListAdapter.stores = stores;
        } else {
            List<StoreListResponse.Store> tempStoreList = new ArrayList<>();

            for(int i = 0; i < storeLcoatorItems.size(); i++) {
                for(int y = 0; y < stores.size(); y++) {
                    if(storeLcoatorItems.get(i).getStoreId().equals(stores.get(y).getId()))
                        tempStoreList.add(stores.get(y));
                }
            }

            storeLocatorListAdapter.stores = tempStoreList;

            Log.i("mCurrentLocation", "mCurrentLocation" + mCurrentLocation);
            if(mCurrentLocation != null)
                Collections.sort(storeLocatorListAdapter.stores, new StoreLocatorComparator(mCurrentLocation));

            for(int i = 0; i < storeLocatorListAdapter.stores.size(); i ++) {
                //Log.i("yoyo", "yoyo" + storeLocatorListAdapter.stores.get(i).getName());
            }
        }

        if(storeLocatorListAdapter.stores == null || storeLocatorListAdapter.stores.size() == 0)
            noFound.setVisibility(View.VISIBLE);
        else
            noFound.setVisibility(View.GONE);

        listview.setAdapter(storeLocatorListAdapter);
        listview.setOnItemClickListener(storeLocatorListAdapter);
    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        if(titleString != null)
            setToolbarTitle(titleString);

        if(stores == null || stores.size() == 0) {
            ToastUtils.show(getBaseActivity(), "no result found");
            return view;
        }

        Log.i("gpsRequired", "gpsRequired" + gpsRequired);

        if(!gpsRequired && Hawk.get("lastLocation") != null) {
            mCurrentLocation = Hawk.get("lastLocation");
            storeLocatorListAdapter = new StoreLocatorListAdapter();
            storeLocatorListAdapter.context = getBaseActivity();

            if(storeLcoatorItems == null) {
                storeLocatorListAdapter.stores = stores;
            } else {
                List<StoreListResponse.Store> tempStoreList = new ArrayList<>();

                for(int i = 0; i < storeLcoatorItems.size(); i++) {
                    for(int y = 0; y < stores.size(); y++) {
                        if(storeLcoatorItems.get(i).getStoreId().equals(stores.get(y).getId()))
                            tempStoreList.add(stores.get(y));
                    }
                }
                storeLocatorListAdapter.stores = tempStoreList;

                if(mCurrentLocation != null)
                    Collections.sort(storeLocatorListAdapter.stores, new StoreLocatorComparator(mCurrentLocation));
            }


            if(mCurrentLocation != null)
                Collections.sort(storeLocatorListAdapter.stores, new StoreLocatorComparator(mCurrentLocation));

            storeLocatorListAdapter.notifyDataSetChanged();
            redrawListView();
        } else if(gpsRequired){
            if(gpsRequired) {
                LocationManager lm = (LocationManager) getBaseActivity().getSystemService(Context.LOCATION_SERVICE);
                boolean gps_enabled = false;
                boolean network_enabled = false;

                try {
                    gps_enabled = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);
                } catch (Exception ex) {
                }

                try {
                    network_enabled = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
                } catch (Exception ex) {
                }

                if (!gps_enabled && !network_enabled) {
                    // notify user
                    AlertDialog.Builder dialog = new AlertDialog.Builder(getBaseActivity());
                    dialog.setMessage(getBaseActivity().getResources().getString(R.string.gps_not_enabled));
                    dialog.setPositiveButton(getBaseActivity().getResources().getString(R.string.open_location_setting), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                            // TODO Auto-generated method stub
                            Intent myIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                            getBaseActivity().startActivity(myIntent);
                            //get gps
                        }
                    });
                    dialog.setNegativeButton(getBaseActivity().getResources().getString(R.string.btn_cancel), new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                            // TODO Auto-generated method stub

                        }
                    });
                    dialog.show();
                }
            }
            startLocationManager();
        }

        //Log.i("mLocation", "mLocationkk " + mLocation);
        return view;
    }
    
    public void onResume() {
        super.onResume();
    }


    private LocationRequest mLocationRequest;
    private GoogleApiClient mGoogleApiClient;
    private boolean mRequestingLocationUpdates = true;

    private Location mLastLocation;

    protected void startLocationUpdates() {
        if(mGoogleApiClient == null)
            initGoogleApiClient();
        createLocationRequest();
        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    }


    public void initGoogleApiClient() {
        // Create an instance of GoogleAPIClient.
        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder(getActivity())
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
        }
    }

    protected void createLocationRequest() {
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(60 * 1000);
        mLocationRequest.setFastestInterval(0);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_LOW_POWER);
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);

        //Log.i("mLastLocation", "mLastLocation " + mRequestingLocationUpdates);

        if (mRequestingLocationUpdates) {
            startLocationUpdates();
            mRequestingLocationUpdates = false;
        }
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onLocationChanged(Location location) {
        mCurrentLocation = location;

        Log.i("mCurrentLocation1", "mCurrentLocationkk" + mCurrentLocation + " " + mCurrentLocation.getLatitude() + " " + mCurrentLocation.getLongitude());

        //storeLocatorListAdapter = new StoreLocatorListAdapter();
        //storeLocatorListAdapter.context = getBaseActivity();

        if(storeLcoatorItems == null) {
            storeLocatorListAdapter.stores = stores;
        } else {
            List<StoreListResponse.Store> tempStoreList = new ArrayList<>();

            for(int i = 0; i < storeLcoatorItems.size(); i++) {
                for(int y = 0; y < stores.size(); y++) {
                    if(storeLcoatorItems.get(i).getStoreId().equals(stores.get(y).getId()))
                        tempStoreList.add(stores.get(y));
                }
            }

            if(mCurrentLocation != null)
                Collections.sort(tempStoreList, new StoreLocatorComparator(mCurrentLocation));

            storeLocatorListAdapter.stores = tempStoreList;
        }


        Collections.sort(storeLocatorListAdapter.stores, new StoreLocatorComparator(mCurrentLocation));
        storeLocatorListAdapter.notifyDataSetChanged();
        redrawListView();
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }


    public void onStart() {
        mRequestingLocationUpdates = true;
        if(mGoogleApiClient == null)
            initGoogleApiClient();
        mGoogleApiClient.connect();
        super.onStart();
    }

    public void onStop() {
        mGoogleApiClient.disconnect();
        super.onStop();
    }

    @Override
    public void onPause() {
        super.onPause();
        stopLocationUpdates();
    }


    protected void stopLocationUpdates() {
        if(mGoogleApiClient == null)
            initGoogleApiClient();
        if(mGoogleApiClient.isConnected())
            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stopLocationManager();
    }

    public class StoreLocatorListAdapter extends BaseAdapter implements AdapterView.OnItemClickListener{
        public List<StoreListResponse.Store> stores;
        public Context context;

        @Override
        public int getCount() {
            return stores.size();
        }

        @Override
        public StoreListResponse.Store getItem(int position) {
            return stores.get(position);
        }

        @Override
        public long getItemId(int position) {
            return stores.get(position).hashCode();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            StoreLocatorListViewItem view = (StoreLocatorListViewItem) convertView;
            if(view == null) {
                view = new StoreLocatorListViewItem(context);
                view.setTag(view);
            } else {
                view = (StoreLocatorListViewItem)convertView.getTag();
            }

            view.setStoreLocatorTitle(getItem(position).getBrandLogo());
            view.setAddressLine1(getItem(position).getName());
            view.setAddressLine2(getItem(position).getAddress().getLine1());

            //if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)) {
            view.setAddressLine4("");//store.getAddress().getCountry().getName());
            view.setAddressLine3("");//store.getAddress().getRegion());
            //} else {
                //view.setAddressLine4(getItem(position).getAddress().getCountry().getName());
                //view.setAddressLine3(getItem(position).getAddress().getRegion());
           // }

            view.getArrow().setVisibility(View.GONE);
            view.wrapper.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            try {
                if (getItem(position).getFeatures() != null) {
                    if (getItem(position).getFeatures().get(0).get(0).equals("K")) {
                        view.setParkingIconVisible(true);
                    }

                    if (getItem(position).getFeatures().get(0).get(1).equals("With Parking")) {
                        view.setParkingIconVisible(true);
                    }
                } else {
                    view.setParkingIconVisible(false);
                }

            } catch(Exception e) {
                view.setParkingIconVisible(false);
                //Log.i("exception e", "exception e" );
            }

            BaseActivity baseActivity = (BaseActivity) context;

            //Log.i("mLocation", "mLocationkk " + mLocation);

            if(mCurrentLocation == null && mLocation != null)
                mCurrentLocation = mLocation;


            if(mCurrentLocation != null) {
                double distance = StoreLocatorFragment.distance(getItem(position).getLatitude(), getItem(position).getLongitude(), mCurrentLocation.getLatitude(), mCurrentLocation.getLongitude(), null) * 1000;
                String m = String.format("%.1f",( distance / 1000 ));
                view.setKmInDistance(m + "KM");
            } else {
                view.setKmInDistance("");
            }
            return view;
        }

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            StoreLocatorGoogleMapFragment storeLocatorGoogleMapFragment = new StoreLocatorGoogleMapFragment();
            storeLocatorGoogleMapFragment.stores = stores;

           // placeFragmentWithBackStack(storeLocatorGoogleMapFragment);

            if(isSearch) {
                GATrackerHelper.getInstance(getActivity()).setGATracker("store-locator/search-results/" + stores.get(position).getName());
            } else {
                GATrackerHelper.getInstance(getActivity()).setGATracker("store-locator/list-view/" + stores.get(position).getName());
            }
            OnMarkerPressedEvent event = new OnMarkerPressedEvent();
            event.setStore(getItem(position));
            MyApplication.getInstance().mBus.post(event);
        }
    }

    Location mCurrentLocation;
    public void onEvent(LocationEvent locationEvent) {
        mCurrentLocation = locationEvent.getLocation();

        if(mCurrentLocation == null)
            return;

        Log.i("mCurrentLocation1", "mCurrentLocationkk" + mCurrentLocation);
        storeLocatorListAdapter = new StoreLocatorListAdapter();
        storeLocatorListAdapter.context = getBaseActivity();

        if(storeLcoatorItems == null) {
            storeLocatorListAdapter.stores = stores;
        } else {
            List<StoreListResponse.Store> tempStoreList = new ArrayList<>();

            for(int i = 0; i < storeLcoatorItems.size(); i++) {
                for(int y = 0; y < stores.size(); y++) {
                    if(storeLcoatorItems.get(i).getStoreId().equals(stores.get(y).getId()))
                        tempStoreList.add(stores.get(y));
                }
            }
            storeLocatorListAdapter.stores = tempStoreList;

            if(mCurrentLocation != null)
                Collections.sort(storeLocatorListAdapter.stores, new StoreLocatorComparator(mCurrentLocation));

            for(int i = 0; i < storeLocatorListAdapter.stores.size(); i ++) {
                //Log.i("yoyo", "yoyo" + storeLocatorListAdapter.stores.get(i).getName());
            }
        }


        Collections.sort(storeLocatorListAdapter.stores, new StoreLocatorComparator(mCurrentLocation));
        //listview.setAdapter(storeLocatorListAdapter);
        storeLocatorListAdapter.stores = stores;

        storeLocatorListAdapter.notifyDataSetChanged();
    }

    public class StoreLocatorComparator implements Comparator<StoreListResponse.Store> {
        Location mCurrentLocation;

        public StoreLocatorComparator(Location mCurrentLocation) {
            this.mCurrentLocation = mCurrentLocation;
        }

        @Override
        public int compare(StoreListResponse.Store lhs, StoreListResponse.Store rhs) {
            double lhsDistance = StoreLocatorFragment.distance(mCurrentLocation.getLatitude(), mCurrentLocation.getLongitude(), lhs.getLatitude(), lhs.getLongitude(), null);
            double rhsDistance = StoreLocatorFragment.distance(mCurrentLocation.getLatitude(), mCurrentLocation.getLongitude(), rhs.getLatitude(), rhs.getLongitude(), null);

            Log.i("lhsDistance", "lhsDistance" + lhsDistance);

            if(lhsDistance == rhsDistance) {
                return 0;
            } else if(lhsDistance > rhsDistance) {
                return 1;
            } else {
                return -1;
            }
        }
    }


    public void redrawListView() {
        int firstItem = listview.getFirstVisiblePosition();
        int lastItem = listview.getLastVisiblePosition();
        for(int i = firstItem;i <= lastItem; i++) {
            View v = listview.getChildAt(i - firstItem);
            listview.getAdapter().getView(i, v, listview);
            listview.invalidateViews();
        }
    }
}
