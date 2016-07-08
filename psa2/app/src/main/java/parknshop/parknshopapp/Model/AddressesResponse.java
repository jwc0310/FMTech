package parknshop.parknshopapp.Model;

import java.util.ArrayList;

/**
 * Created by hp on 13/4/2016.
 */
public class AddressesResponse {
    public ArrayList<AddressData.AddressForm> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<AddressData.AddressForm> addresses) {
        this.addresses = addresses;
    }

    private ArrayList<AddressData.AddressForm> addresses = new ArrayList<AddressData.AddressForm>();
}
