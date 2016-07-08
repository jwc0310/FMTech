package parknshop.parknshopapp;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.maps.model.LatLng;
import com.orhanobut.hawk.Hawk;
import com.orhanobut.hawk.HawkBuilder;
import com.orhanobut.hawk.LogLevel;

import de.greenrobot.event.EventBus;
import io.fabric.sdk.android.Fabric;
import parknshop.parknshopapp.EventUpdate.LocationManagerUpdateEvent;
import parknshop.parknshopapp.Rest.event.LocationEvent;
import parknshop.parknshopapp.Utils.LanguageUtil;

/**
 * Created by chrisyu on 7/3/16.
 */
public class MyApplication extends Application implements LocationListener {

    private static final String TAG = "MyApplication";

    private static MyApplication mMyApplication;

    public EventBus mBus;

    private Tracker mTracker;

    private LocationManager locationManager;
    private static final long MIN_TIME_UPDATE = 0;
    private static final float MIN_DISTANCE = 5;
    private static final long LOCATION_UPDATE_TIMEOUT = 10000;
    private double latitude;
    private double longitude;

    public MyApplication() {

    }

    public static MyApplication getInstance() {
        if (mMyApplication == null) {
            synchronized (mMyApplication) {
                if (mMyApplication == null) {
                    mMyApplication = new MyApplication();
                }
            }
        }
        return mMyApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        mMyApplication = this;
        mBus = new EventBus();
//        register(WebServiceModel.getInstance(mMyApplication));

        Hawk.init(this)
                .setEncryptionMethod(HawkBuilder.EncryptionMethod.MEDIUM)
                .setStorage(HawkBuilder.newSqliteStorage(this))
                .setLogLevel(LogLevel.FULL)
                .build();

        LanguageUtil.initLanguage(getApplicationContext(), null);


    }


    public void post(String httpUrl, Object object) {
        mBus.post(object);
    }

    public void register(Object object) {
        if(mBus != null && !mBus.isRegistered(object))
            mBus.register(object);
    }

    public void unRegister(Object object) {
        mBus.unregister(object);
    }

    public void startLocationManager(Context context) {
        checkLocationPermission();
        if (locationManager == null)
            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
    }

    public void stopLocationManager(Context context) {
        checkLocationPermission();
        if (locationManager != null)
            locationManager.removeUpdates(this);
    }

    public void locationMangerRequestUpdate(Context context) {
        if (locationManager == null)
            return;
        // getting GPS status
        boolean isGPSEnabled = locationManager
                .isProviderEnabled(LocationManager.GPS_PROVIDER);

        // getting network status
        boolean isNetworkEnabled = locationManager
                .isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        if (!isNetworkEnabled) {
            // no network provider is enabled
//                NetUtil.Alert(this, "", "open GPS first");
            Toast.makeText(this, getString(R.string.gps_error), Toast.LENGTH_LONG).show();
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, MIN_TIME_UPDATE, MIN_DISTANCE, this);

//        mHandler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                checkLocationPermission();
//                locationManager.removeUpdates(MyApplication.this);
//                mBus.post(new DismissLoadingDialogEvent());
//            }
//        }, LOCATION_UPDATE_TIMEOUT);
    }

    @Override
    public void onLocationChanged(Location location) {
        latitude = location.getLatitude();
        longitude = location.getLongitude();
        mBus.post(new LocationManagerUpdateEvent());

        LocationEvent locationEvent = new LocationEvent();

        LatLng ll = new LatLng(location.getLatitude(), location.getLongitude());
        locationEvent.setLatLng(ll);
        MyApplication.getInstance().mBus.post(locationEvent);

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // Check the API permission on Android M
    public void checkLocationPermission(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    public void requestPermissions(@NonNull String[] permissions, int requestCode)
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for Activity#requestPermissions for more details.
                return;
            }
        }
    }

//    // GA Tracker
//    synchronized public Tracker getDefaultTracker() {
//        if (mTracker == null) {
//            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
//            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
//            mTracker = analytics.newTracker(R.xml.global_tracker);
////            analytics.setLocalDispatchPeriod(1800);
////            mTracker = analytics.newTracker(R.string.ga_tracking_id);
////            mTracker.enableExceptionReporting(true);
////            mTracker.enableAdvertisingIdCollection(true);
////            mTracker.enableAutoActivityTracking(true);
//        }
//        return mTracker;
//    }

}
