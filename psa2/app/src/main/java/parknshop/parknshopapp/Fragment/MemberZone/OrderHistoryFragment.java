package parknshop.parknshopapp.Fragment.MemberZone;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Adapter.OrderHistoryListAdapter;
import parknshop.parknshopapp.Adapter.StringPickerAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.OrderHistoryListAdapterReviewBtnClick;
import parknshop.parknshopapp.EventUpdate.StringPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.OnlineRecordDetail;
import parknshop.parknshopapp.Model.OnlineRecords;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.RequestOnlineRecordDetailEvent;
import parknshop.parknshopapp.Rest.event.RequestOnlineRecordsEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by Gigi Wong on 2016年04月20日.
 */
public class OrderHistoryFragment extends BaseFragment {

    @Bind(R.id.list)
    ListView list;
    @Bind(R.id.txtNoResult)
    TextView txtNoResult;
    OrderHistoryListAdapter orderHistoryListAdapter;
    OnlineRecords mOnlineRecords;
    String[] arrStatusStr;
    String[] arrStatusCode;

    RequestOnlineRecordsEvent mRequestOnlineRecordsEvent;
    StringPickerAdapterOnItemClickEvent mStringPickerAdapterOnItemClickEvent;
    StringPickerAdapter stringPickerAdapter;
    AlertDialog.Builder builder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_order_history, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/order-history");

        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.order_history));
        disableSecondRightButton();
        disableCartButton();

        arrStatusStr = getResources().getStringArray(R.array.delivery_status_filter);
        arrStatusCode = getResources().getStringArray(R.array.delivery_status_filter_code);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(mOnlineRecords != null){
                    if(mOnlineRecords.getOrders() != null){

                        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/order-history/" + mOnlineRecords.getOrders().get(position).getCode());

                        OrderDetailsFragment fragment = new OrderDetailsFragment();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("onlineRecord", mOnlineRecords.getOrders().get(position));
                        fragment.setArguments(bundle);
                        placeFragmentWithBackStack(fragment);
                    }
                }
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
//        if(mRequestOnlineRecordsEvent == null){
            showProgressDialog();
            WebServiceModel.getInstance(getActivity()).requestOnlineRecords(getActivity());
//        }else{
//            onEvent(mRequestOnlineRecordsEvent);
//        }
        if(mStringPickerAdapterOnItemClickEvent != null){
            onEvent(mStringPickerAdapterOnItemClickEvent);
        }
    }

    public void setAdapter(OnlineRecords onlineRecords){
        if(onlineRecords != null) {
            if(onlineRecords.getOrders().size() > 0){
                list.setVisibility(View.VISIBLE);
                txtNoResult.setVisibility(View.GONE);
                orderHistoryListAdapter = new OrderHistoryListAdapter(getActivity(),
                        onlineRecords, getActivity());
                list.setAdapter(orderHistoryListAdapter);
            }else{
                list.setVisibility(View.GONE);
                txtNoResult.setVisibility(View.VISIBLE);
            }
        }else{
            list.setVisibility(View.GONE);
            txtNoResult.setVisibility(View.VISIBLE);
        }
    }

    @OnClick(R.id.status)
    public void status() {
        stringPickerAdapter = new StringPickerAdapter(getActivity(), arrStatusStr, this.hashCode());
        builder = new AlertDialog.Builder(getActivity());
        builder.setAdapter(stringPickerAdapter, stringPickerAdapter);
        builder.show();
    }

    public void onEvent(RequestOnlineRecordsEvent requestOnlineRecordsEvent) {
        // Remember previous selected status
        mRequestOnlineRecordsEvent = requestOnlineRecordsEvent;
        hideProgressDialog();
        if(requestOnlineRecordsEvent.getSuccess()){
            mOnlineRecords = requestOnlineRecordsEvent.getOnlineRecords();

            ArrayList<String> statusCode = new ArrayList<>();
            ArrayList<String> statusStr = new ArrayList<>();
            ArrayList<String> statusConsignment = new ArrayList<>();
            for(int j = 0; j < arrStatusCode.length; j++){
                switch(j){
                    case 0:
                        statusCode.add(arrStatusCode[ALL]);
                        statusStr.add(arrStatusStr[0]);
                        break;
                    case 1:
                        statusCode.add(arrStatusCode[FRAUD_CHECK]);
                        statusCode.add(arrStatusCode[ON_HOLD]);
                        statusStr.add(arrStatusStr[1]);
                        statusStr.add(arrStatusStr[1]);
                        break;
                    case 2:
                        statusCode.add(arrStatusCode[CREATED]);
                        statusStr.add(arrStatusStr[2]);
                        break;
                    case 3:
                        statusCode.add(arrStatusCode[ORDER_PLACED_NOTIFICATION_SENT]);
                        statusStr.add(arrStatusStr[3]);
                        statusConsignment.add("WAITING");
                        statusConsignment.add("PICKPACK");
                        break;
                    case 4:
                        statusCode.add(arrStatusCode[WAITING_FOR_CAPTURE]);
                        statusCode.add(arrStatusCode[PAYMENT_CAPTURED]);
                        statusStr.add(arrStatusStr[4]);
                        statusStr.add(arrStatusStr[4]);
                        statusConsignment.add("shipped");
                        break;
                    case 5:
                        statusCode.add(arrStatusCode[PAYMENT_CAPTURED]);
                        statusCode.add(arrStatusCode[COMPLETED]);
                        statusStr.add(arrStatusStr[5]);
                        statusStr.add(arrStatusStr[5]);
                        statusConsignment.add("DELIVERY_CONFIRM");
                        statusConsignment.add("shipped");
                        break;
                    case 6:
                        statusCode.add(arrStatusCode[WAITING_FOR_CAPTURE]);
                        statusCode.add(arrStatusCode[PAYMENT_CAPTURED]);
                        statusCode.add(arrStatusCode[COMPLETED]);
                        statusStr.add(arrStatusStr[6]);
                        statusStr.add(arrStatusStr[6]);
                        statusStr.add(arrStatusStr[6]);
                        statusConsignment.add("DELIVERY_FAILURE");
                        break;
                    case 7:
                        statusCode.add(arrStatusCode[CANCELLED]);
                        statusStr.add(arrStatusStr[7]);
                        statusConsignment.add("WAITING");
                        break;
                }

            }

            for(int i = 0; i < mOnlineRecords.getOrders().size(); i++){
                    if (mOnlineRecords.getOrders().get(i).getConsignmentStatusCode() != null) {
                        for (String consignment : statusConsignment) {
                            if (mOnlineRecords.getOrders().get(i).getConsignmentStatusCode().toLowerCase().contains(consignment.toLowerCase())) {
                                for (int j = 0; j < statusCode.size(); j++) {
                                    if (mOnlineRecords.getOrders().get(i).getStatus().getCode().toLowerCase().contains(statusCode.get(j).toLowerCase())) {
                                        mOnlineRecords.getOrders().get(i).setStatusDisplay(statusStr.get(j));
                                    }
                                }
                            }
                        }
                    } else {
                        for (int j = 0; j < statusCode.size(); j++) {
                            if (mOnlineRecords.getOrders().get(i).getStatus().getCode().contains(statusCode.get(j))) {
                                mOnlineRecords.getOrders().get(i).setStatusDisplay(statusStr.get(j));
                            }
                        }
                    }
            }

            setAdapter(mOnlineRecords);
            ArrayList<String> tempStatus = new ArrayList<>();
            for(int i = 0; i < requestOnlineRecordsEvent.getOnlineRecords().getOrders().size(); i++){
                if(!tempStatus.contains(requestOnlineRecordsEvent.getOnlineRecords().getOrders().get(i).getStatusDisplay()))
                    tempStatus.add(requestOnlineRecordsEvent.getOnlineRecords().getOrders().get(i).getStatusDisplay());
            }

        }else{
            ToastUtils.show(getActivity(), requestOnlineRecordsEvent.getMessage());
        }

    }

    public void onEvent(StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent) {
        mStringPickerAdapterOnItemClickEvent = stringPickerAdapterOnItemClickEvent;
        if(stringPickerAdapterOnItemClickEvent.getSuccessCode() == this.hashCode()) {
            showFilterStatusItem(stringPickerAdapterOnItemClickEvent.getPosition());
//            placeFragmentWithBackStack(new OrderReviewFragment());
        }
    }

    // Click the list item review btn
    public void onEvent(OrderHistoryListAdapterReviewBtnClick orderHistoryListAdapterReviewBtnClick) {
        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestGetOnlineRecordsDetail(getActivity(), mOnlineRecords.getOrders().get(orderHistoryListAdapterReviewBtnClick.getPosition()).getCode());
    }

    // Get the product details and go to review page
    public void onEvent(RequestOnlineRecordDetailEvent requestOnlineRecordDetailEvent) {
        hideProgressDialog();
        if(requestOnlineRecordDetailEvent.getSuccess()){
            OrderReviewFragment fragment = new OrderReviewFragment();
            Bundle bundle = new Bundle();
            ArrayList<OnlineRecordDetail.Order> renewEntries = requestOnlineRecordDetailEvent.getOnlineRecordDetail().getEntries();
            bundle.putSerializable("products", renewEntries);
            bundle.putString("orderNo", requestOnlineRecordDetailEvent.getOnlineRecordDetail().getCode());
            fragment.setArguments(bundle);
            placeFragmentWithBackStack(fragment);
        }else{
            ToastUtils.show(getActivity(), requestOnlineRecordDetailEvent.getMessage());
        }
    }

    public final static int ALL = 0;
    public final static int FRAUD_CHECK = 1;
    public final static int ON_HOLD = 2;
    public final static int CREATED = 3;
    public final static int ORDER_PLACED_NOTIFICATION_SENT = 4;
    public final static int WAITING_FOR_CAPTURE = 5;
    public final static int PAYMENT_CAPTURED = 6;
    public final static int COMPLETED = 7;
    public final static int CANCELLED = 8;

//    <item>ALL</item>
//    <item>FRAUD_CHECK</item>
//    <item>ON_HOLD</item>
//    <item>CREATED</item>
//    <item>ORDER_PLACED_NOTIFICATION_SENT</item>
//    <item>WAITING_FOR_CAPTURE</item>
//    <item>PAYMENT_CAPTURED</item>
//    <item>COMPLETED</item>
//    <item>CANCELLED</item>

    public void showFilterStatusItem(int filterPos){

        ArrayList<String> statusCode = new ArrayList<>();
        ArrayList<String> statusConsignment = new ArrayList<>();
        switch(filterPos){
            case 0:

                break;
            case 1:
                statusCode.add(arrStatusCode[FRAUD_CHECK]);
                statusCode.add(arrStatusCode[ON_HOLD]);
                break;
            case 2:
                statusCode.add(arrStatusCode[CREATED]);
                break;
            case 3:
                statusCode.add(arrStatusCode[ORDER_PLACED_NOTIFICATION_SENT]);
                statusConsignment.add("WAITING");
                statusConsignment.add("PICKPACK");
                break;
            case 4:
                statusCode.add(arrStatusCode[WAITING_FOR_CAPTURE]);
                statusCode.add(arrStatusCode[PAYMENT_CAPTURED]);
                statusConsignment.add("shipped");
                break;
            case 5:
                statusCode.add(arrStatusCode[PAYMENT_CAPTURED]);
                statusCode.add(arrStatusCode[COMPLETED]);
                statusConsignment.add("DELIVERY_CONFIRM");
                statusConsignment.add("shipped");
                break;
            case 6:
                statusCode.add(arrStatusCode[WAITING_FOR_CAPTURE]);
                statusCode.add(arrStatusCode[PAYMENT_CAPTURED]);
                statusCode.add(arrStatusCode[COMPLETED]);
                statusConsignment.add("DELIVERY_FAILURE");
                break;
            case 7:
                statusCode.add(arrStatusCode[CANCELLED]);
                statusConsignment.add("WAITING");
                break;
        }

        LogUtil.info("", "statusCode:"+statusCode.toString()+", "+statusConsignment.toString());

        ArrayList<OnlineRecords.OnlineRecord> orders = new ArrayList<>();
        OnlineRecords tempOnlineRecords = new OnlineRecords();
        for(int i = 0; i < mOnlineRecords.getOrders().size(); i++){
            if(filterPos == 0){ // All status
                orders.add(mOnlineRecords.getOrders().get(i));
            }else{
                if (statusConsignment.size() > 0 && mOnlineRecords.getOrders().get(i).getConsignmentStatusCode() != null) {
                    for (String consignment : statusConsignment) {
                        if (mOnlineRecords.getOrders().get(i).getConsignmentStatusCode().toLowerCase().contains(consignment.toLowerCase())) {
                            for (String status : statusCode) {
                                if (mOnlineRecords.getOrders().get(i).getStatus().getCode().toLowerCase().contains(status.toLowerCase())) {
                                    orders.add(mOnlineRecords.getOrders().get(i));
                                }
                            }
                        }
                    }
                } else {
                    for (String status : statusCode) {
                        if (mOnlineRecords.getOrders().get(i).getStatus().getCode().contains(status)) {
                            orders.add(mOnlineRecords.getOrders().get(i));
                        }
                    }
                }
//            }
//                if(mOnlineRecords.getOrders().get(i).getStatus().getCode().equals(arrStatusCode[filterPos]))
//                    orders.add(mOnlineRecords.getOrders().get(i));
            }
        }
        tempOnlineRecords.setOrders(orders);
        setAdapter(tempOnlineRecords);
    }
}
