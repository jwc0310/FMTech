package parknshop.parknshopapp.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.daimajia.swipe.adapters.BaseSwipeAdapter;

import java.util.ArrayList;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.EventUpdate.DeliveryAddressListAdapterDeleteBtnOnClickEvent;
import parknshop.parknshopapp.Fragment.MemberZone.MemberEditAddressFragment;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class DeliveryAddressListAdapter extends BaseSwipeAdapter {
    Context context;
    private LayoutInflater inflater;
    ArrayList<AddressData.AddressForm> mAddressList = new ArrayList<>();
    String dataId;

    public DeliveryAddressListAdapter(ArrayList<AddressData.AddressForm> addressList, Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        setList(addressList);
    }

    public void setList(ArrayList<AddressData.AddressForm> addressList){
        mAddressList.clear();
        if(addressList == null)
            return;

        mAddressList.addAll(addressList);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mAddressList.size();
    }

    @Override
    public Object getItem(int position) {
        return mAddressList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mAddressList.get(position).hashCode();
    }

    @Override
    public int getSwipeLayoutResourceId(int position) {
        return R.id.swipe_layout;
    }

    @Override
    public View generateView(int position, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item_delivery_address, null);
    }

    @Override
    public void fillValues(final int position, View convertView) {

        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        TextView txtAddress = (TextView) convertView.findViewById(R.id.txtAddress);
        ImageView cbSelect = (ImageView) convertView.findViewById(R.id.cbSelect);


//        if(dataId == null){
            if(mAddressList.get(position).isDefaultAddress()){
                cbSelect.setImageResource(R.drawable.filter_tick);
            }else{
                cbSelect.setImageResource(R.drawable.filter_without_tick);
            }

        cbSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((BaseActivity)context).showProgressDialog();
                WebServiceModel.getInstance(context).setDefaultDeliveryAddress(context, mAddressList.get(position).getId());
            }
        });

    /* [13/4/2016上午11:55:31] Martin So: Line3 == block
       [13/4/2016上午11:55:47] Martin So: Alley == building
       [13/4/2016上午11:56:04] Martin So: Lane == Estate Name */

        txtName.setText(mAddressList.get(position).getTitle()+". "+mAddressList.get(position).getFirstName() + " " + mAddressList.get(position).getLastName());
//        txtAddress.setText("19/F, Millennium City 3, 370 Kwun Tong Road, Kowloon, Hong Kong");

        txtAddress.setText(mAddressList.get(position).getRoom()+", "+
                mAddressList.get(position).getFloor()+", "+
                mAddressList.get(position).getLine3() + ", " +
                mAddressList.get(position).getAlley() + ", " +
                mAddressList.get(position).getLane() + ", " +
                mAddressList.get(position).getStreetNumber() + " "+mAddressList.get(position).getStreetName()+ ", " +
                mAddressList.get(position).getDistrict() + ", "+
                mAddressList.get(position).getRegion());

        RelativeLayout front_wrapper = (RelativeLayout) convertView.findViewById(R.id.front_wrapper);
        LinearLayout btnEdit = (LinearLayout) convertView.findViewById(R.id.btnEdit);
        LinearLayout btnDelete = (LinearLayout) convertView.findViewById(R.id.btnDelete);
        front_wrapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MemberEditAddressFragment fragment = new MemberEditAddressFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("address", mAddressList.get(position));
                fragment.setArguments(bundle);
                ((BaseActivity)context).placeFragmentWithBackStack(fragment);

            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeliveryAddressListAdapterDeleteBtnOnClickEvent deliveryAddressListAdapterDeleteBtnOnClickEvent = new DeliveryAddressListAdapterDeleteBtnOnClickEvent();
                deliveryAddressListAdapterDeleteBtnOnClickEvent.setId(mAddressList.get(position).getId());
                MyApplication.getInstance().mBus.post(deliveryAddressListAdapterDeleteBtnOnClickEvent);
            }
        });

    }

}