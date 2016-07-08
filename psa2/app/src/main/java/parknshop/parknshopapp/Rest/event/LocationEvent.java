package parknshop.parknshopapp.Rest.event;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by chrisyu on 30/4/16.
 */
public class LocationEvent extends BaseEvent{
    LatLng ll;
    Location location;

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLatLng(LatLng ll) {
        this.ll = ll;
    }
    public LatLng getLatLng() {
        return ll;
    }
}
