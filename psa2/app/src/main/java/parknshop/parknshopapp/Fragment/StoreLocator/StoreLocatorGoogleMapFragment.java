package parknshop.parknshopapp.Fragment.StoreLocator;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AlertDialog;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.orhanobut.hawk.Hawk;

import java.util.Date;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.next.slidebottompanel.SlideBottomPanel;
import parknshop.parknshopapp.AnimationHelper;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.StoreLocator.View.StoreLocatorCallItem;
import parknshop.parknshopapp.Fragment.StoreLocator.View.StoreLocatorListViewItem;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.StoreListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.LocationEvent;
import parknshop.parknshopapp.Rest.event.OnMarkerPressedEvent;
import parknshop.parknshopapp.Rest.event.SwipeBasicEvent;
import parknshop.parknshopapp.Utils.PermissionCheckingUtil;

/**
 * Created by hp on 2/5/2016.
 */
public class StoreLocatorGoogleMapFragment extends BaseFragment implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener {

    //brandlogo
    //162 TOS PICKING
    //GREAT
    //SUPA DEPA
    //TASTE

    private LocationRequest mLocationRequest;
    private GoogleApiClient mGoogleApiClient;
    private boolean mRequestingLocationUpdates = true;

    private Location mLastLocation;
    private Location mCurrentLocation;

    private boolean showBackButton;

    public List<StoreListResponse.Store> stores;
    @Bind(R.id.mapView) MapView mapView;
    @Bind (R.id.tab_layout) TabLayout tabLayout;

    @Bind (R.id.map_bottom_panel) View mapBottomPanel;
    @Bind (R.id.store_itme_holder) StoreLocatorListViewItem storeItemHolder;
    @Bind (R.id.store_call_item_phone_1) StoreLocatorCallItem storeLocatorCallItemPhone1;
    @Bind (R.id.store_call_item_phone_2) StoreLocatorCallItem storeLocatorCallItemPhone2;
    @Bind (R.id.store_call_item_phone_3) StoreLocatorCallItem storeLocatorCallItemPhone3;
    //@Bind (R.id.store_call_item__share_to_friend) StoreLocatorCallItem storeLocatorShareToFriend;

    int swipePosition = -1;
    private GoogleMap googleMap;
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = getActivity().getLayoutInflater().inflate(R.layout.store_locator_google_map_fragment, container, false);
        ButterKnife.bind(this, rootView);

        storeItemHolder.setSlidingPanel(sbv);

        if(showBackButton)
            showBackButton();

        mapView.onCreate(savedInstanceState);

        initGoogleApiClient();
        setOnTouch();

        LocationManager lm = (LocationManager)getBaseActivity().getSystemService(Context.LOCATION_SERVICE);
        boolean gps_enabled = false;
        boolean network_enabled = false;

        try {
            gps_enabled = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);
        } catch(Exception ex) {}

        try {
            network_enabled = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        } catch(Exception ex) {}

        if(!gps_enabled && !network_enabled) {
            // notify user
            AlertDialog.Builder dialog = new AlertDialog.Builder(getBaseActivity());
            dialog.setMessage(getBaseActivity().getResources().getString(R.string.gps_not_enabled));
            dialog.setPositiveButton(getBaseActivity().getResources().getString(R.string.open_location_setting), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                    // TODO Auto-generated method stub
                    Intent myIntent = new Intent( Settings.ACTION_LOCATION_SOURCE_SETTINGS);
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

        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap map) {
                googleMap = map;
                if (googleMap != null) {
                    initMap();

                    PermissionCheckingUtil permissionCheckingUtil = new PermissionCheckingUtil(getActivity());
                    if (permissionCheckingUtil.checkFineLocationPermission(StoreLocatorGoogleMapFragment.this)) {
                        // locationManagerRequestUpdate();
                    }

                    for (int i = 0; i < stores.size(); i++) {
                        StoreListResponse.Store store = stores.get(i);

                        LatLng ll = new LatLng(store.getLatitude(), store.getLongitude());

                        googleMap.addMarker(
                                new MarkerOptions()
                                        .position(ll)
                                        //.title(store.getAddress().getLine1())
                                        /*.icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("available_store_icn_pin", Utils.dpToPx(25, getActivity()), Utils.dpToPx(30, getActivity()))))*/ );

                        googleMap.setOnMarkerClickListener(new OnMarkerClickListener(stores.get(i)));
                    }
                }
            }
        });

        return rootView;
    }

    boolean firstTime = true;
    public void setOnTouch() {
        mapBottomPanel.setOnTouchListener(new View.OnTouchListener() {

            public void onRightSwipe() {
                //Log.i(logTag, "RightToLeftSwipe!");
                //activity.doSomething();
            }

            public void onLeftSwipe() {
                //Log.i(logTag, "LeftToRightSwipe!");
                //activity.doSomething();
            }

            public void onDownSwipe() {
                //Log.i(logTag, "onTopToBottomSwipe!");
                //activity.doSomething();
                swipePosition = 1;
                SwipeBasicEvent swipeBasicEvent = new SwipeBasicEvent();
                swipeBasicEvent.setSwipeDirection(swipePosition);
                MyApplication.getInstance().mBus.post(swipeBasicEvent);
            }

            public void onUpSwipe() {
                //Log.i(logTag, "onBottomToTopSwipe!");
                //activity.doSomething();

                swipePosition = -1;
                SwipeBasicEvent swipeBasicEvent = new SwipeBasicEvent();
                swipeBasicEvent.setSwipeDirection(swipePosition);
                MyApplication.getInstance().mBus.post(swipeBasicEvent);
            }

            float downX, downY, upX, upY;
            int MIN_DISTANCE = 10;

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        downX = event.getX();
                        downY = event.getY();

                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        upX = event.getX();
                        upY = event.getY();

                        float deltaX = downX - upX;
                        float deltaY = downY - upY;

                        //Log.i("deltaY", "deltaY" + deltaY);

                        // swipe horizontal?
                        if (Math.abs(deltaX) > Math.abs(deltaY)) {
                            if (Math.abs(deltaX) > MIN_DISTANCE) {
                                // left or right
                                if (deltaX > 0) {
                                    this.onRightSwipe();
                                    return true;
                                }
                                if (deltaX < 0) {
                                    this.onLeftSwipe();
                                    return true;
                                }
                            } else {
                                //Log.i("brabra", "Horizontal Swipe was only " + Math.abs(deltaX) + " long, need at least " + MIN_DISTANCE);
                                return false; // We don't consume the event
                            }
                        }
                        // swipe vertical?
                        else {
                            if (Math.abs(deltaY) > MIN_DISTANCE) {
                                // top or down
                                if (deltaY < 0) {
                                    this.onDownSwipe();
                                    return true;
                                }
                                if (deltaY > 0) {
                                    this.onUpSwipe();
                                    return true;
                                }
                            } else {
                                //Log.i("brabra", "Vertical Swipe was only " + Math.abs(deltaX) + " long, need at least " + MIN_DISTANCE);
                                return false; // We don't consume the event
                            }
                        }

                        return true;
                    }
                }
                return false;
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
        //startLocationManager();
    }

    public void initMap(){

        LatLng hksar = mCurrentLocation != null ? new LatLng(mCurrentLocation.getLatitude(), mCurrentLocation.getLongitude()) : new LatLng((22.3964f), (114.1095f));

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hksar, 15));

        // Zoom in, animating the camera.
        googleMap.animateCamera(CameraUpdateFactory.zoomIn());

        // Zoom out to zoom level 10, animating with a duration of 2 seconds.
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

        // Construct a CameraPosition focusing on Mountain View and animate the camera to that position.
        moveCamera(hksar, 10);

        googleMap.getUiSettings().setZoomControlsEnabled(true);

        googleMap.setMyLocationEnabled(true);

    }


    public void onStart() {
        mRequestingLocationUpdates = true;
        mLastUpdateTime = null;
        closestStore = null;
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
        mapView.onPause();
        stopLocationUpdates();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
        stopLocationManager();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }


    public Bitmap resizeMapIcons(String iconName, int width, int height){
        Bitmap imageBitmap = BitmapFactory.decodeResource(getResources(), getResources().getIdentifier(iconName, "drawable", getActivity().getPackageName()));
        Bitmap resizedBitmap = Bitmap.createScaledBitmap(imageBitmap, width, height, false);
        return resizedBitmap;
    }

    StoreListResponse.Store closestStore;
    double closestDistance;
    Date mLastUpdateTime;
    @Override
    public void onLocationChanged(Location location) {
        if(location == null) return;

        mCurrentLocation = location;
        if(getActivity() != null)
            ((BaseActivity)getActivity()).mCurrentLocation = mCurrentLocation;

        mLastLocation = location;
        //Log.i("mCurrentLocation" , "mCurrentLocation" + location.getLongitude() + " " + location.getLatitude() + " " + mLastUpdateTime);

        LocationEvent le = new LocationEvent();
        le.setLocation(location);
        MyApplication.getInstance().mBus.post(le);
        Hawk.put("lastLocation", location);

        if(mCurrentLocation != null || mLastLocation != null) {
            for (int i = 0; i < stores.size(); i++) {
                if(mCurrentLocation != null) {
                    double distance = StoreLocatorGoogleMapFragment.distance(mCurrentLocation.getLatitude(), mCurrentLocation.getLongitude(), stores.get(i).getLatitude(), stores.get(i).getLongitude(), null);
                    distance = Math.abs(distance);
                    if(closestStore == null) {
                        closestStore = stores.get(i);
                        closestDistance = distance;
                    } else if(distance < closestDistance) {
                        closestStore = stores.get(i);
                        closestDistance = distance;
                    }
                }
            }
        }

        if(mLastUpdateTime == null && closestStore == null) {
            LatLng ll = new LatLng(mCurrentLocation.getLatitude(), mCurrentLocation.getLongitude());
            moveCamera(ll, 12);
            LocationEvent locationEvent = new LocationEvent();
            locationEvent.setLatLng(ll);
            MyApplication.getInstance().mBus.post(locationEvent);
        } else if(mLastUpdateTime == null && closestStore != null) {
            LatLng ll = new LatLng(closestStore.getLatitude(), closestStore.getLongitude());

            moveCamera(ll, 12);

            LocationEvent locationEvent = new LocationEvent();
            locationEvent.setLatLng(ll);
            MyApplication.getInstance().mBus.post(locationEvent);

            OnMarkerPressedEvent onMarkerPressedEvent = new OnMarkerPressedEvent();
            onMarkerPressedEvent.setStore(closestStore);
            MyApplication.getInstance().mBus.post(onMarkerPressedEvent);
        }
        mLastUpdateTime = new Date();//DateFormat.getTimeInstance().format(new Date());
    }

    @Override
    public void onConnected(Bundle bundle) {
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
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    protected void stopLocationUpdates() {
        if(mGoogleApiClient == null)
            initGoogleApiClient();
        if(mGoogleApiClient.isConnected())
            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
    }

    public class OnMarkerClickListener implements GoogleMap.OnMarkerClickListener {
        public StoreListResponse.Store store;
        public int position;

        public OnMarkerClickListener(StoreListResponse.Store store) {
            this.store = store;
        }

        @Override
        public boolean onMarkerClick(Marker marker) {
            for(int i = 0; i < stores.size(); i ++) {
                if(marker.getPosition().latitude == stores.get(i).getLatitude() && marker.getPosition().longitude == stores.get(i).getLongitude()) {
                    LatLng storeLatLng = new LatLng(stores.get(i).getLatitude(), stores.get(i).getLongitude());
                    moveCamera(storeLatLng, 13);


                    OnMarkerPressedEvent onMarkerPressedEvent = new OnMarkerPressedEvent();
                    onMarkerPressedEvent.setStore(stores.get(i));
                    MyApplication.getInstance().mBus.post(onMarkerPressedEvent);
                }
            }
            return false;
        }
    }

    public void moveCamera(LatLng location, int zoomLevel) {
        try {
            CameraPosition cameraPosition = new CameraPosition.Builder()
                    .target(location)      // Sets the center of the map to Mountain View
                    .zoom(zoomLevel)                   // Sets the zoom
                    .bearing(0)                // Sets the orientation of the camera to east
                    .tilt(30)                   // Sets the tilt of the camera to 30 degrees
                    .build();                   // Creates a CameraPosition from the builder
            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
        } catch (Exception e) {
            //Log.i("exception", "exception");
        }
    }


    int animatedHeight;

    @Bind(R.id.sbv) SlideBottomPanel sbv;
    public boolean isExpanded;
    public boolean isGone = true;
    public void onEvent(OnMarkerPressedEvent onMarkerPressedEvent) {
        if(onMarkerPressedEvent.getStore() != null) {
            if(sbv.getVisibility() == View.INVISIBLE)
                sbv.setVisibility(View.VISIBLE);
            //sbv.hidePanel();

            Log.i("sbv", "sbv " + isGone + " " + isExpanded);

            if(isGone) {
                sbv.setVisibility(View.VISIBLE);
                sbv.isGone = true;
                sbv.displayPanel();
                Runnable run = new Runnable() {
                    @Override
                    public void run() {
                        sbv.hidePanel();
                        sbv.isGone = false;
                    }
                };
                Handler mHandler = new Handler();
                mHandler.postDelayed(run, 10);
                isGone = false;
            } else if(!isExpanded) {
                sbv.displayPanel();
            }

            sbv.setExpandCallback(new Runnable() {
                @Override
                public void run() {
                    isExpanded = false;
                    //Glide.with(StoreLocatorGoogleMapFragment.this).load(R.drawable.buy_more_save_more_arrow_down).into(storeItemHolder.getArrow());
                    storeItemHolder.getArrow().setImageResource(R.drawable.buy_more_save_more_arrow_down);
                    storeItemHolder.getArrow().setTag(R.drawable.buy_more_save_more_arrow_down);
                }
            });

            sbv.setCollapseCallback(new Runnable() {
                @Override
                public void run() {
                    isExpanded = true;
                    //Glide.with(StoreLocatorGoogleMapFragment.this).load(R.drawable.buy_more_save_more_arrow_up).into(storeItemHolder.getArrow());
                    storeItemHolder.getArrow().setImageResource(R.drawable.buy_more_save_more_arrow_up);
                    storeItemHolder.getArrow().setTag(R.drawable.buy_more_save_more_arrow_up);
                }
            });

            moveCamera(new LatLng(onMarkerPressedEvent.getStore().getLatitude(), onMarkerPressedEvent.getStore().getLongitude()), 15);
            animatedHeight = mapBottomPanel.getHeight() - storeItemHolder.getHeight();
            AnimationHelper.slideFromBottom(mapBottomPanel, animatedHeight);
            //mapBottomPanel.animate().y(Utils.dpToPx(100, getBaseActivity())).setDuration(150).start();

            StoreListResponse.Store store = onMarkerPressedEvent.getStore();

            //Log.i("addressline1", "addressline1" + store.getName());

            storeItemHolder.setStoreLocatorTitle(store.getBrandLogo());
            storeItemHolder.setAddressLine1(store.getName());
            storeItemHolder.address_line_1.setTextSize(20);
            storeItemHolder.address_line_2.setTextSize(16);
            storeItemHolder.setAddressLine2( Html.fromHtml(store.getAddress().getLine1().toString()) );

            //if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)) {
                storeItemHolder.setAddressLine4("");//store.getAddress().getCountry().getName());
                storeItemHolder.setAddressLine3("");//store.getAddress().getRegion());
            //} else {
            //    storeItemHolder.setAddressLine4(store.getAddress().getCountry().getName());
            //    storeItemHolder.setAddressLine3(store.getAddress().getRegion());
           // }

            if(getBaseActivity().mCurrentLocation != null) {
                double distance = StoreLocatorGoogleMapFragment.distance(store.getLatitude(), store.getLongitude(), getBaseActivity().mCurrentLocation.getLatitude(), getBaseActivity().mCurrentLocation.getLongitude(), null);
                storeItemHolder.setKmInDistance(String.format("%.1f", (distance / 1000f))  + "KM");
            } else {
                storeItemHolder.setKmInDistance("--" + "" + "M");
            }
            try {
                if (store.getFeatures() != null) {
                    if (store.getFeatures().get(0).get(0).equals("K")) {
                        storeItemHolder.setParkingIconVisible(true);
                    }

                    if (store.getFeatures().get(0).get(1).equals("With Parking")) {
                        storeItemHolder.setParkingIconVisible(true);
                    }
                } else {
                    storeItemHolder.setParkingIconVisible(false);
                }

            } catch(Exception e) {
                storeItemHolder.setParkingIconVisible(false);
                //Log.i("exception e", "exception e" + e.getMessage() );
            }

            if(store.getTel() != null)
            if(store.getTel().trim().contains(" ") || store.getTel().trim().contains("&")) {
                if(store.getTel().contains("&")) {
                    storeLocatorCallItemPhone1.setMajorTitle(store.getTel().split("&")[0].trim());
                    storeLocatorCallItemPhone2.setMajorTitle(store.getTel().split("&")[1].trim());

                    storeLocatorCallItemPhone1.setButtonTitle(getString(R.string.contacts_details_page_btn_call));
                    storeLocatorCallItemPhone2.setButtonTitle(getString(R.string.contacts_details_page_btn_call));

                    storeLocatorCallItemPhone1.setImageDrawable(R.drawable.available_store_icn_phone);
                    storeLocatorCallItemPhone2.setImageDrawable(R.drawable.available_store_icn_phone);

                    Hawk.put("showPhone2Needed", true);
                } else {
                    storeLocatorCallItemPhone1.setMajorTitle(store.getTel().split(" ")[0].trim());
                    storeLocatorCallItemPhone2.setMajorTitle(store.getTel().split(" ")[1].trim());

                    //Log.i("yoyoyoy", "yoyoyoyoy" + store.getTel().split(" ")[0].trim() + " " + store.getTel().split(" ")[1].trim());

                    storeLocatorCallItemPhone1.setButtonTitle(getString(R.string.contacts_details_page_btn_call));
                    storeLocatorCallItemPhone2.setButtonTitle(getString(R.string.contacts_details_page_btn_call));

                    storeLocatorCallItemPhone1.setImageDrawable(R.drawable.available_store_icn_phone);
                    storeLocatorCallItemPhone2.setImageDrawable(R.drawable.available_store_icn_phone);

                    Hawk.put("showPhone2Needed", false);
                }
            } else {
                storeLocatorCallItemPhone1.titleTextView.setText(store.getTel());
                storeLocatorCallItemPhone1.setButtonTitle(getString(R.string.contacts_details_page_btn_call));
                storeLocatorCallItemPhone2.setGone();

                Hawk.put("showPhone2Needed", false);
                //Log.i("yoyoyoyo", "yoyoyoyoyoyoyyo gone gone" );
            }

/*
            storeLocatorShareToFriend.setMajorTitle(getString(R.string.store_locator_share_to_friend));
            storeLocatorShareToFriend.setMinorTitle("");
            storeLocatorShareToFriend.setImageDrawable(R.drawable.store_locator_share_icn);
            storeLocatorShareToFriend.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    StoreLocatorGoogleMapFragment.this.shareUrl();
                }
            });
            storeLocatorShareToFriend.setVisibility(View.GONE);
*/
            StoreListResponse.OpeningScheduleData openingScheduleData = store.getOpeningScheduleData();
            if(openingScheduleData != null) {
                String dataName = openingScheduleData.getName();

                int pos = 0;
                int lastPos = 0;

                //^en^9.30am - 10.00pm^zt^9.30am - 10.00pm
                if (GlobalConstant.language.equals(GlobalConstant.LANG_EN) && dataName != null && dataName.length() > 0) {
                    pos = dataName.indexOf("^en^") + 3;
                    lastPos = dataName.lastIndexOf("^zt") > 0 ? Math.min(dataName.lastIndexOf("^zt"),dataName.length()) : dataName.length(); //lMath.min(dataName.lastIndexOf("^zh"), dataName.length() );
                } else if (dataName != null && dataName.length() > 0) {
                    pos = dataName.indexOf("^zh^") + 4;
                    lastPos = dataName.length();//Math.min(dataName.lastIndexOf("^zt^"), dataName.length() );
                }

                /*
                for(store.getWeekDayOpeningList() != null) {
                    for(int i = 0; i < store.getWeekDayOpeningList().size(); i++ ){

                    }
                }*/

                dataName = dataName.substring(pos, lastPos);

                storeLocatorCallItemPhone3.titleTextView.setText(dataName.replace("^DAILY^", " ").replace("^", " ").replace("<BR>", " ").replace("<br>", " ") );
                storeLocatorCallItemPhone3.setMinorTitle( "");//dataName.replace("^DAILY^", " ").replace("^", " ") );
                storeLocatorCallItemPhone3.setImageDrawable(R.drawable.available_store_icn_time);
                storeLocatorCallItemPhone3.setVisibility(View.VISIBLE);
                sbv.mPanelHeight = sbv.dp2px(280);
                //sbv.hidePanel();
            } else {
                storeLocatorCallItemPhone1.setVisibility(View.GONE);
                storeLocatorCallItemPhone2.setVisibility(View.GONE);
                storeLocatorCallItemPhone3.setVisibility(View.GONE);
                sbv.mPanelHeight = sbv.dp2px(220);
                //sbv.hidePanel();
            }

            if(storeLocatorCallItemPhone1.titleTextView.getVisibility() == View.VISIBLE)
                storeLocatorCallItemPhone1.setImageDrawable(R.drawable.available_store_icn_phone);
            if(storeLocatorCallItemPhone2.titleTextView.getVisibility() == View.VISIBLE)
                storeLocatorCallItemPhone2.setImageDrawable(R.drawable.available_store_icn_phone);
            //storeLocatorShareToFriend.setImageDrawable(R.drawable.store_locator_share_icn);
        } else {
            //animatedHeight = mapBottomPanel.getHeight() - storeItemHolder.getHeight();
            //AnimationHelper.slideFromBottom(mapBottomPanel, animatedHeight);
        }
       sbv.hidePanel();
    }


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


    public static int SWIPING_DOWN = 1;
    public static int SWIPING_UP = -1;

    public boolean expanded = false;

    public void onEvent(SwipeBasicEvent swipeBasicEvent) {

        if(swipeBasicEvent.getSwipeDirection() == SWIPING_DOWN) {
            //Log.i("gesture:down", "gesture:down" + animatedHeight + " " + mapBottomPanel.getHeight() + " " + storeItemHolder.getHeight());
            if(expanded) {//animatedHeight == mapBottomPanel.getHeight()) {
                animatedHeight = mapBottomPanel.getHeight() - storeItemHolder.getHeight();
                AnimationHelper.slideToBottom(mapBottomPanel, animatedHeight);
                storeItemHolder.getArrow().setVisibility(View.VISIBLE);
                expanded = false;
            }
        }

        if(swipeBasicEvent.getSwipeDirection() == SWIPING_UP) {
            //Log.i("gesture:up", "gesture:up" + animatedHeight + " " + mapBottomPanel.getHeight() + " " + storeItemHolder.getHeight() + mapBottomPanel.getVisibility());
            if(!expanded){//(mapBottomPanel.getVisibility() == View.VISIBLE && animatedHeight == mapBottomPanel.getHeight() - storeItemHolder.getHeight()) {
                AnimationHelper.slideFromBottom(mapBottomPanel, animatedHeight, 0 );
                animatedHeight = mapBottomPanel.getHeight();
                storeItemHolder.getArrow().setVisibility(View.GONE);
                expanded = true;
            }
        }
    }


    public static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        //if (unit == "K") {
        dist = dist * 1.609344 * 1000;
        //} else if (unit == "N") {
        //    dist = dist * 0.8684;
        //}

        return (dist);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	/*::	This function converts decimal degrees to radians						 :*/
	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	/*::	This function converts radians to decimal degrees						 :*/
	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }
}
