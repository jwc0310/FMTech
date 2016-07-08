package parknshop.parknshopapp.Fragment.Contacts;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.LocationManagerUpdateEvent;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.ContactResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.ContactResponseEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

public class ContactUsFragment extends BaseFragment {
    @Bind(R.id.mapView)
    MapView mapView;
    @Bind(R.id.txtTitle)
    TextView txtTitle;
    @Bind(R.id.imgIcon)
    ImageView imgIcon;
    @Bind(R.id.txtAddress)
    TextView txtAddress;
    @Bind(R.id.llAddView)
    LinearLayout llAddView;

    private GoogleMap googleMap;

    double lat;
    double lon;

    ContactResponseEvent mContactResponseEvent;

    View view;// = getActivity().getLayoutInflater().inflate(R.layout.contact_us_fragment_layout, container, false);
    public void onCreate(Bundle savedBundle) {
        super.onCreate(savedBundle);

        LinearLayout ll = new LinearLayout(getBaseActivity());
        ll.setLayoutParams (new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        ll.setOrientation(LinearLayout.VERTICAL);

        view = getActivity().getLayoutInflater().inflate(R.layout.contact_us_fragment_layout, null);
        ButterKnife.bind(this, view);


        if(mContactResponseEvent != null) {
            onEvent(mContactResponseEvent);
            return;
        }

        mapView.onCreate(savedBundle);

        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap map) {
                googleMap = map;
                if (googleMap == null) {
                    // Check if we were successful in obtaining the map.
                    if (googleMap != null) {
                        googleMap.getUiSettings().setMyLocationButtonEnabled(false);
                        googleMap.setMyLocationEnabled(true);
                    }else{
                        int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity().getApplicationContext());
                        GooglePlayServicesUtil.getErrorDialog(resultCode, getActivity(), 1).show();
                    }
                }
            }
        });

        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestGetContact();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        showBackButton();
        showToolbar();
        enableNavigationDrawer();
        setToolbarTitle(getString(R.string.contacts_page_head_title));
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    public void onEvent(ContactResponseEvent contactResponseEvent) {
        hideProgressDialog();
        if (contactResponseEvent.getSuccess()) {
            mContactResponseEvent = contactResponseEvent;
            for(int i = 0; i < contactResponseEvent.getContactResponse().getData().size(); i++){
                if(contactResponseEvent.getContactResponse().getData().get(i).getHeadOffice() == 1){
                    lat = contactResponseEvent.getContactResponse().getData().get(i).getLatitude();
                    lon = contactResponseEvent.getContactResponse().getData().get(i).getLongitude();
                    txtTitle.setText(contactResponseEvent.getContactResponse().getData().get(i).getName());
                    txtAddress.setText(contactResponseEvent.getContactResponse().getData().get(i).getAddress());
                }
            }
            updateLayout(contactResponseEvent.getContactResponse().getData());
        }else{
            ToastUtils.show(getActivity(), contactResponseEvent.getMessage());
        }
    }

    // Update Layout
    public void updateLayout(final ArrayList<ContactResponse.Data> contactDatas){

        for(int i = 0; i < contactDatas.size(); i++){
            LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.addview_contact, null);

            RelativeLayout rlView = (RelativeLayout) layout.findViewById(R.id.rlView);
            TextView txtName = (TextView) layout.findViewById(R.id.txtName);
            txtName.setText(contactDatas.get(i).getName());

            final int pos = i;
            rlView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(contactDatas.get(pos).getNameEn().toLowerCase().contains("moneyback")) {
                        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/contact-us/moneyback-rewards-program");
                    }

                    ContactUsDetailsFragment fragment = new ContactUsDetailsFragment();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("title", contactDatas.get(pos).getName());
                    bundle.putSerializable("contactData", contactDatas.get(pos));
                    fragment.setArguments(bundle);
                    placeFragmentWithBackStack(fragment);
                }
            });
            llAddView.addView(layout);
        }

        startLocationManager();
        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap map) {
                googleMap = map;
                if (googleMap != null) {

                    initMap();

//                    PermissionCheckingUtil permissionCheckingUtil = new PermissionCheckingUtil(getActivity());
//                    if(permissionCheckingUtil.checkFineLocationPermission(ContactUsFragment.this)){
////                        locationManagerRequestUpdate();
//                    }
                }
            }
        });
    }

    public void initMap(){
        LatLng myLocation = new LatLng(lat, lon);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation, 10));
        MarkerOptions options = new MarkerOptions();
        options.position(myLocation);
        Marker marker = googleMap.addMarker(options);
        marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.available_store_icn_pin));
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
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

    public void onEvent(LocationManagerUpdateEvent locationManagerUpdateEvent){

    }
}
