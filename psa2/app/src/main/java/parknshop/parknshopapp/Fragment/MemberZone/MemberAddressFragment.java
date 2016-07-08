package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Adapter.DeliveryAddressListAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.DeliveryAddressListAdapterDeleteBtnOnClickEvent;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.AddressesResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.AddressesEvent;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class MemberAddressFragment extends BaseFragment {

    @Bind(R.id.list) ListView list;
    @Bind(R.id.txtNoItems) TextView txtNoItems;

    DeliveryAddressListAdapter deliveryAddressListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_zone_delivery_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/delivery-address");

        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.delivery_address));
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).getAddressBook(getActivity());
//        uploadLayout();
    }


    public void onEvent(AddressesEvent addressesEvent) {
        hideProgressDialog();
        if(addressesEvent.getSuccess()){
            AddressesResponse addressesResponse = (AddressesResponse) addressesEvent.getDataObject();
            setAdapter(addressesResponse);
        }
    }

    public void setAdapter(AddressesResponse addressesResponse){

        if(addressesResponse.getAddresses() != null) {
            txtNoItems.setVisibility(View.GONE);
//            if(deliveryAddressListAdapter == null) {
                deliveryAddressListAdapter = new DeliveryAddressListAdapter(addressesResponse.getAddresses(), getActivity());
                list.setAdapter(deliveryAddressListAdapter);
//            }else{
//                deliveryAddressListAdapter.setList(addressesResponse.getAddresses());
//                deliveryAddressListAdapter.notifyDataSetChanged();
//            }
        }else{
            txtNoItems.setVisibility(View.VISIBLE);
        }
    }

    @OnClick(R.id.btnAdd)
    public void goToAddAddressPage(){
        MemberAddAddressFragment fragment = new MemberAddAddressFragment();
        placeFragmentWithBackStack(fragment);
    }

    public void onEvent(DeliveryAddressListAdapterDeleteBtnOnClickEvent deliveryAddressListAdapterDeleteBtnOnClickEvent) {
        WebServiceModel.getInstance(getActivity()).setDeleteAddress(getActivity(), deliveryAddressListAdapterDeleteBtnOnClickEvent.getId());
    }

    public void onEvent(EmptyJsonEvent emptyJsonEvent) {
        hideProgressDialog();
        if (emptyJsonEvent.getType().equals("setDeleteAddress")) {
            if(emptyJsonEvent.getSuccess()){
                showProgressDialog();
                WebServiceModel.getInstance(getActivity()).getAddressBook(getActivity());

            }else{
                ToastUtils.show(getActivity(), emptyJsonEvent.getMessage());
            }
        }else{
            if(emptyJsonEvent.getType().equals("setDefaultDeliveryAddress")) {
                showProgressDialog();
                WebServiceModel.getInstance(getActivity()).getAddressBook(getActivity());
            }
        }
    }


}
