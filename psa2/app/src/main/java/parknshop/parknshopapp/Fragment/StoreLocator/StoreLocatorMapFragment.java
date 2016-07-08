package parknshop.parknshopapp.Fragment.StoreLocator;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Date;
import java.util.List;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Model.StoreListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.LocationEvent;
import parknshop.parknshopapp.Rest.event.OnMarkerPressedEvent;
import parknshop.parknshopapp.Utils.Utils;

/**
 * Created by chrisyu on 27/4/16.
 */
    public class StoreLocatorMapFragment extends SupportMapFragment implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener {
    public List<StoreListResponse.Store> stores;
    private GoogleMap mMap;
    private GoogleApiClient mGoogleApiClient;
    private LocationRequest mLocationRequest;
    private boolean mRequestingLocationUpdates = true;
    private Location mLastLocation;
    private Location mCurrentLocation;
    private Date mLastUpdateTime;
    private View rootView;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getMapAsync(this);
        initGoogleApiClient();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        rootView = view;
        return view;
    }

    public void onResume() {
        super.onResume();
        mRequestingLocationUpdates = true;
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

    public void checkPermission() {
        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
            //Log.i("location", "location");
        } else {
            // Show rationale and request permission.
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.READ_CONTACTS}, 0);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 0: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.
                    mMap.setMyLocationEnabled(true);

                } else {
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        ((BaseActivity)getActivity()).hideProgressDialog();
        mMap = googleMap;
        googleMapInit(mMap);
        checkPermission();

        for(int i = 0; i < stores.size(); i++) {
            StoreListResponse.Store store = stores.get(i);

            LatLng ll = new LatLng(store.getLatitude(), store.getLongitude());

            mMap.addMarker(
                    new MarkerOptions()
                            .position(ll)
                            .title(store.getAddress().getLine1())
                            .icon(BitmapDescriptorFactory.fromBitmap( resizeMapIcons("available_store_icn_pin", Utils.dpToPx(25, getActivity()), Utils.dpToPx(30, getActivity()))) ));

            mMap.setOnMarkerClickListener(new OnMarkerClickListener(stores.get(i)));
        }
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

    public void googleMapInit(GoogleMap mMap) {
        LatLng hksar = new LatLng((22.3964f), (114.1095f));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hksar, 15));

        // Zoom in, animating the camera.
        mMap.animateCamera(CameraUpdateFactory.zoomIn());

        // Zoom out to zoom level 10, animating with a duration of 2 seconds.
        mMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

        // Construct a CameraPosition focusing on Mountain View and animate the camera to that position.
        moveCamera(hksar,10);

        mMap.getUiSettings().setZoomControlsEnabled(true);

        mMap.setMyLocationEnabled(true);

        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                OnMarkerPressedEvent onMarkerPressedEvent = new OnMarkerPressedEvent();
                onMarkerPressedEvent.setStore(null);
                MyApplication.getInstance().mBus.post(onMarkerPressedEvent);
            }
        });
    }

    public void moveCamera(LatLng location, int zoomLevel) {
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(location)      // Sets the center of the map to Mountain View
                .zoom(zoomLevel)                   // Sets the zoom
                .bearing(0)                // Sets the orientation of the camera to east
                .tilt(30)                   // Sets the tilt of the camera to 30 degrees
                .build();                   // Creates a CameraPosition from the builder
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }

    public Bitmap resizeMapIcons(String iconName, int width, int height){
        Bitmap imageBitmap = BitmapFactory.decodeResource(getResources(),getResources().getIdentifier(iconName, "drawable", getActivity().getPackageName()));
        Bitmap resizedBitmap = Bitmap.createScaledBitmap(imageBitmap, width, height, false);
        return resizedBitmap;
    }


    public void onStart() {
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
        mRequestingLocationUpdates = true;
    }

    protected void stopLocationUpdates() {
        if(mGoogleApiClient == null)
            initGoogleApiClient();
        if(mGoogleApiClient.isConnected())
            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);

        if (mRequestingLocationUpdates) {
            startLocationUpdates();
            mRequestingLocationUpdates = false;
        }
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    protected void createLocationRequest() {
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(60 * 1000);
        mLocationRequest.setFastestInterval(0);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_LOW_POWER);
    }

    protected void startLocationUpdates() {
        if(mGoogleApiClient == null)
            initGoogleApiClient();
        createLocationRequest();
        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    }

    StoreListResponse.Store closestStore;
    double closestDistance;
    @Override
    public void onLocationChanged(Location location) {
        mCurrentLocation = location;
        ((BaseActivity)getActivity()).mCurrentLocation = mCurrentLocation;

        mLastLocation = location;
        //Log.i("mCurrentLocation", "mCurrentLocation" + location.getLongitude() + " " + location.getLatitude() + " " + mLastUpdateTime);


        if(mCurrentLocation != null || mLastLocation != null) {

            LocationEvent le = new LocationEvent();
            le.setLocation(mCurrentLocation);
            MyApplication.getInstance().mBus.post(le);

            for (int i = 0; i < stores.size(); i++) {
                if(mCurrentLocation != null) {
                    double distance = StoreLocatorFragment.distance(mCurrentLocation.getLatitude(), mCurrentLocation.getLongitude(), stores.get(i).getLatitude(), stores.get(i).getLongitude(), null);
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
            LatLng ll = new LatLng(mCurrentLocation.getLatitude() + 0.02, mCurrentLocation.getLongitude());

            moveCamera(ll, 12);
        } else if(mLastUpdateTime == null && closestStore != null) {
            LatLng ll = new LatLng(closestStore.getLatitude()  + 0.02, closestStore.getLongitude());
            moveCamera(ll, 12);

            OnMarkerPressedEvent onMarkerPressedEvent = new OnMarkerPressedEvent();
            onMarkerPressedEvent.setStore(closestStore);
            MyApplication.getInstance().mBus.post(onMarkerPressedEvent);
        }
        mLastUpdateTime = new Date();//DateFormat.getTimeInstance().format(new Date());
    }
}
