package parknshop.parknshopapp.Fragment.Checkout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.ECouponResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutButton;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 9/5/16.
 */
public class CheckoutCouponListFragment extends BaseFragment {
    public ArrayList<ECouponResponse.ECoupon> couponArrayList = new ArrayList<>();
    public List<CartResponse.VoucherInfo> selectedList = new ArrayList<>();

    @Bind(R.id.not_found) TextView notFound;
    @Bind(R.id.listview) ListView listView;
    @Bind(R.id.apply) CheckoutButton applyButton;

    CheckoutCouponListAdatper checkoutCouponListadatper;
    boolean ecoupon;
    boolean evoucher;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.checkout_coupon_list_layout, container, false);
        ButterKnife.bind(this, view);

        for(int i = 0; i < selectedList.size(); i++) {
            for(int y = 0; y < couponArrayList.size(); y++) {
                if(couponArrayList.get(y).getCode().equals(selectedList.get(i).voucherCode)) {
                    couponArrayList.get(y).setselected(true);
                }
            }
        }

        checkoutCouponListadatper = new CheckoutCouponListAdatper(listView, getBaseActivity());
        checkoutCouponListadatper.setData(couponArrayList);

        if(couponArrayList != null && couponArrayList.size() > 0) {
            listView.setAdapter(checkoutCouponListadatper);
            listView.setOnItemClickListener(checkoutCouponListadatper);
            notFound.setVisibility(View.GONE);
        } else {
            notFound.setVisibility(View.VISIBLE);
            applyButton.setVisibility(View.GONE);
        }

        if(ecoupon)
            setToolbarTitle(getString(R.string.check_out_select_ecoupon));

        if (evoucher)
            setToolbarTitle(getString(R.string.check_out_select_evoucher));

        return view;
    }

    public class CheckoutCouponListAdatper extends BaseAdapter implements AdapterView.OnItemClickListener{
        BaseActivity baseActivity;
        ArrayList<ECouponResponse.ECoupon> data;
        ListView listView;

        @Bind(R.id.label) TextView labelTextView;
        @Bind(R.id.description) TextView descriptionTextView;
        @Bind(R.id.checked) ImageView checkedImageView;
        @Bind(R.id.unchecked) ImageView uncheckedImageView;

        boolean allSelected = true;

        public CheckoutCouponListAdatper(ListView listView, BaseActivity baseActivity) {
            this.listView = listView;
            this.baseActivity = baseActivity;
        }

        public boolean isAllSelected() {
            return allSelected;
        }

        public ArrayList<ECouponResponse.ECoupon> getData() {
            return data;
        }

        public void setData(ArrayList<ECouponResponse.ECoupon> data) {
            this.data = data;
        }

        @Override
        public int getCount() {
            if(data == null)
                return 0;
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            if(data == null || position == 0)
                return null;
            if(data.get(position) != null)
                return data.get(position);
            return 0;
        }

        @Override
        public long getItemId(int position) {
            if(data == null || position == 0)
                return 0;
            if(data.get(position) != null)
                return data.get(position).hashCode();
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = LayoutInflater.from(baseActivity).inflate(R.layout.checkout_coupon_layout, null);
            ButterKnife.bind(this, view);

            labelTextView.setText(data.get(position).getType().equals("VOUCHER") ? data.get(position).getDescription() + " HK$" + data.get(position).getIgcValue() : data.get(position).getDescription() );//Html.fromHtml(data.get(position).getTerms()));
            descriptionTextView.setText("(" + baseActivity.getResources().getString(R.string.expiry_date_ecoupon) + data.get(position).getFormateStartDate() + " - " + data.get(position).getFormateEndDate() + ")");

            setSelectedView(position);

            return view;
        }

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //data.get(position).setselected(!data.get(position).getselected());
            //allSelected = !isAnyThingSelected();
            //redrawListView();
            couponArrayList.get(position).setselected(!couponArrayList.get(position).getselected());
            checkoutCouponListadatper.redrawListView();
            /*
            if(ecoupon)
                WebServiceModel.getInstance(getBaseActivity()).setECoupon(getBaseActivity(), couponArrayList.get(position).getCode());

            if(evoucher)
                WebServiceModel.getInstance(getBaseActivity()).setEVoucher(getBaseActivity(), couponArrayList.get(position).getCode());
            */
        }

        public boolean isAnyThingSelected() {
            boolean anyThingSelected = false;
            for(int i = 0 ; i < data.size(); i++) {
                if(data.get(i).getselected())
                    anyThingSelected = true;
            }
            return anyThingSelected;
        }

        public void setSelectedView(int position) {
            if (data.get(position).getselected()) {
                checkedImageView.setVisibility(View.VISIBLE);
                uncheckedImageView.setVisibility(View.GONE);
            } else {
                checkedImageView.setVisibility(View.GONE);
                uncheckedImageView.setVisibility(View.VISIBLE);
            }
        }

        public void redrawListView() {
            int firstItem = listView.getFirstVisiblePosition();
            int lastItem = listView.getLastVisiblePosition();
            for(int i = firstItem;i <= lastItem; i++) {
                View v = listView.getChildAt(i - firstItem);
                listView.getAdapter().getView(i, v, listView);
                listView.invalidateViews();
            }
        }
    }

    int count = 0;
    @OnClick(R.id.apply)
    public void applyEvoucherEcoupon() {
        count = 0;
        ArrayList<ECouponResponse.ECoupon> selectedECouponList = new ArrayList<ECouponResponse.ECoupon>();
        ArrayList<ECouponResponse.ECoupon> selectedEVoucherList = new ArrayList<ECouponResponse.ECoupon>();

        String couponTempList = "";
        String voucherTempList = "";

        showProgressDialog();
        if(ecoupon) {
            for(int i = 0; i < couponArrayList.size(); i++) {
                if(couponArrayList.get(i).getselected()) {
                    //WebServiceModel.getInstance(getBaseActivity()).setECoupon(getBaseActivity(), couponArrayList.get(i).getCode());
                    couponTempList += couponArrayList.get(i).getCode() + ",";
                    selectedECouponList.add(couponArrayList.get(i));
                    //count++;
                }
            }

            Hawk.put("selectedECouponList", selectedECouponList);
            WebServiceModel.getInstance(getBaseActivity()).setECoupon(getBaseActivity(), couponTempList);
        }


        if(evoucher) {
            for(int i = 0; i < couponArrayList.size(); i++) {
                if(couponArrayList.get(i).getselected()) {
                    //WebServiceModel.getInstance(getBaseActivity()).setEVoucher(getBaseActivity(), couponArrayList.get(i).getCode());
                    voucherTempList += couponArrayList.get(i).getCode() + ",";
                    selectedEVoucherList.add(couponArrayList.get(i));
                    //count++;
                }
            }

            Hawk.put("selectedEVoucherList", selectedEVoucherList);
            WebServiceModel.getInstance(getBaseActivity()).setEVoucher(getBaseActivity(), voucherTempList);
        }
    }

    public void onEvent(EmptyJsonEvent event) {

        hideProgressDialog();


        if(event.getSuccess()) {
            getBaseActivity().onBackPressed();
        } else {
            ToastUtils.show(getBaseActivity(), event.getMessage());
        }
        //int selectedCount = 0;
        //for(int i = 0; i < couponArrayList.size(); i++) {
        //if(couponArrayList.get(i).getselected())
        //        selectedCount++;
        //}


        //if(event.getSuccess()) {

        //} else {
        //   ToastUtils.show(getBaseActivity(), "");
        //}

        //if(count >= selectedCount) {
        //}
        /*
        if(event.getSuccess() && event.getType().equals("setEcoupon") && event.getDataObject() != null) {
            String code = (String) event.getDataObject();
            for(int i = 0; i < couponArrayList.size(); i++) {
                if(code.equals(couponArrayList.get(i).getCode())) {
                    couponArrayList.get(i).setselected(!couponArrayList.get(i).getselected());
                    checkoutCouponListadatper.redrawListView();
                }
            }
        }

        if(event.getSuccess() && event.getType().equals("setEvoucher") && event.getDataObject() != null) {
            String code = (String) event.getDataObject();
            for(int i = 0; i < couponArrayList.size(); i++) {
                if(code.equals(couponArrayList.get(i).getCode())) {
                    couponArrayList.get(i).setselected(!couponArrayList.get(i).getselected());
                    checkoutCouponListadatper.redrawListView();
                }
            }
        }*/
    }
}
