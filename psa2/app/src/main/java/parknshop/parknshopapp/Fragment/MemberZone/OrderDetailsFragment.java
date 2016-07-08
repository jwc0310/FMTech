package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.OrderProductReviewClickEvent;
import parknshop.parknshopapp.Fragment.MemberZone.View.OrderProductItem;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.Model.OnlineRecordDetail;
import parknshop.parknshopapp.Model.OnlineRecords;
import parknshop.parknshopapp.Model.Utility;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.RequestOnlineRecordDetailEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutAddress;
import parknshop.parknshopapp.View.CheckoutHeader;
import parknshop.parknshopapp.View.CheckoutItem;
import parknshop.parknshopapp.View.OrderDetailsDotViewHolder;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by Gigi Wong on 2016年04月20日.
 */
public class OrderDetailsFragment extends BaseFragment {

    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    public final static int FRAUD_CHECK = 1;
    public final static int ON_HOLD = 2;
    public final static int CREATED = 3;
    public final static int ORDER_PLACED_NOTIFICATION_SENT = 4;
    public final static int WAITING_FOR_CAPTURE = 5;
    public final static int PAYMENT_CAPTURED = 6;
    public final static int COMPLETED = 7;
    public final static int CANCELLED = 8;

    @Bind (R.id.txtOrderNo)
    TextView txtOrderNo;
    @Bind (R.id.txtOrderDate)
    CheckoutItem txtOrderDate;
    @Bind (R.id.txtOrderTotal)
    CheckoutItem txtOrderTotal;
    @Bind (R.id.delivery_details)
    CheckoutHeader delivery_details;
    @Bind (R.id.delivery_method)
    CheckoutItem delivery_method;
    @Bind (R.id.recipient)
    CheckoutItem recipient;
    @Bind (R.id.contact_no)
    CheckoutItem contact_no;
    @Bind (R.id.delivery_date)
    CheckoutItem delivery_date;
    @Bind (R.id.delivery_time)
    CheckoutItem delivery_time;
    @Bind (R.id.delivery_address)
    CheckoutAddress delivery_address;
    @Bind (R.id.payment_method)
    CheckoutHeader payment_method;
    @Bind (R.id.payment_type)
    CheckoutItem payment_type;
    @Bind (R.id.order_details)
    CheckoutHeader order_details;
    @Bind (R.id.total_items)
    CheckoutItem total_items;

    @Bind (R.id.subtotal)
    CheckoutItem subtotal;
    @Bind (R.id.delivery_fee)
    CheckoutItem delivery_fee;
    @Bind (R.id.order_total)
    CheckoutItem order_total;

    @Bind (R.id.products_lists_top_three_in_cart) LinearLayout productListTopThreeLinearLayout;
    @Bind (R.id.products_lists_view_all_itmes) View viewAllItemsViewBtn;
    @Bind (R.id.products_lists_exclude_three_in_cart) LinearLayout productListExcludeTopThreeLinearLayout;

    @Bind(R.id.llProcess) LinearLayout llProcess;
    @Bind(R.id.checkout_dot_1) LinearLayout dot1;
    @Bind(R.id.checkout_dot_2) LinearLayout dot2;
    @Bind(R.id.checkout_dot_3) LinearLayout dot3;
    @Bind(R.id.checkout_dot_4) LinearLayout dot4;
    @Bind(R.id.checkout_dot_5) LinearLayout dot5;
    @Bind(R.id.checkout_dot_6) LinearLayout dot6;

    //OrderProductItem view add to LinearLayout (R.id.products_lists_exclude_three_in_cart)

    OnlineRecords.OnlineRecord mOnlineRecord;

    ArrayList<OnlineRecordDetail.Order> entries = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_order_details, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("order-details");

        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle(getString(R.string.order_details_title));

        llProcess.setVisibility(View.INVISIBLE);

//        new CheckOutDotViewHolder(dot1, 1, FINISH, getBaseActivity());
//        new CheckOutDotViewHolder(dot2, 2, FINISH, getBaseActivity());
//        new CheckOutDotViewHolder(dot3, 3, FINISH, getBaseActivity());
//        new CheckOutDotViewHolder(dot4, 4, CURRENT, getBaseActivity());
//        new CheckOutDotViewHolder(dot4, 5, NOT_FINISH, getBaseActivity());
//        new CheckOutDotViewHolder(dot4, 6, NOT_FINISH, getBaseActivity());

        mOnlineRecord = (OnlineRecords.OnlineRecord) getArguments().getSerializable("onlineRecord");

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
//        if(mOnlineRecord != null){
            showProgressDialog();
            WebServiceModel.getInstance(getActivity()).requestGetOnlineRecordsDetail(getActivity(), mOnlineRecord.getCode());
//        }
    }

    public void uploadLayout(OnlineRecordDetail onlineRecordDetail){
        if(onlineRecordDetail == null)
            return;

        entries = onlineRecordDetail.getEntries();

        txtOrderNo.setText(getString(R.string.order_details_order_no) + " " + onlineRecordDetail.getCode());
        txtOrderDate.setItem(Utility.formatDate(Utility.WATSON_TIME_FORMAT, Utility.DEFAULT_DATE_FORMAT, Utility.formatDate(onlineRecordDetail.getTransactionDate(), Utility.TRANSACTION_DATE_FORMAT)));
        txtOrderTotal.setItem(onlineRecordDetail.getTotalPrice());
        delivery_method.setItem(onlineRecordDetail.getDeliveryMode());
        recipient.setItem(onlineRecordDetail.getPaymentAddress().getTitle() + " " + onlineRecordDetail.getPaymentAddress().getFirstName() + " " + onlineRecordDetail.getPaymentAddress().getLastName());
        contact_no.setItem(onlineRecordDetail.getPaymentAddress().getMobilePhone());
        delivery_date.setItem(Utility.formatDate(Utility.WATSON_TIME_FORMAT, Utility.DEFAULT_DATE_FORMAT, onlineRecordDetail.getDeliveryDate()));
        delivery_time.setItem(onlineRecordDetail.getDeliveryTimeSlot());
        AddressData addressData = new AddressData();
        AddressData.AddressForm addressForm = addressData.getAddressForm();

        addressForm.setRoom(getString(R.string.address_flat_room) + " " +onlineRecordDetail.getDeliveryAddress().getRoom());
        addressForm.setFloor(getString(R.string.address_floor) + " " +onlineRecordDetail.getDeliveryAddress().getFloor());
        addressForm.setLine3(getString(R.string.address_block) + " " +onlineRecordDetail.getDeliveryAddress().getBlock());
        addressForm.setAlley(getString(R.string.address_building) + " " +onlineRecordDetail.getDeliveryAddress().getAlley());
        addressForm.setLane(getString(R.string.address_estate_name) + " " +onlineRecordDetail.getDeliveryAddress().getLane());
        addressForm.setStreetNumber(getString(R.string.address_street_no) + " " +onlineRecordDetail.getDeliveryAddress().getStreetNumber());
        addressForm.setStreetName(getString(R.string.address_street_name) + " " +onlineRecordDetail.getDeliveryAddress().getStreetName());
        addressForm.setRegion(getString(R.string.region) + " " +onlineRecordDetail.getDeliveryAddress().getRegion());
        addressForm.setDistrict(getString(R.string.district) + " " +onlineRecordDetail.getDeliveryAddress().getDistrict());
        addressForm.setTitle(onlineRecordDetail.getDeliveryAddress().getTitle());
        addressForm.setFirstName(onlineRecordDetail.getDeliveryAddress().getFirstName());
        addressForm.setLastName(onlineRecordDetail.getDeliveryAddress().getLastName());

        delivery_address.setOrderAddress(addressForm);

//        payment_type.setItem(onlineRecordDetail.getPaymentMode().getDescription());
        if(onlineRecordDetail.getPaymentMode().getCode().equals("CreditCardFull")){
            //payment_type.setItem("Visa / Master");
            //payment_type.setItem(getString(R.string.credit_card_full_pay));
            payment_type.setItem(onlineRecordDetail.getPaymentMode().getDescription());
        } else {
            payment_type.setItem(onlineRecordDetail.getPaymentMode().getDescription());
        }


        if(onlineRecordDetail.getPaymentMode().getName().contains("American Express"))  {
            payment_type.setLeftDrawable(getCardDrawableId("amex"));
            payment_type.setItem(onlineRecordDetail.getPaymentMode().getName());
        } else if(onlineRecordDetail.getPaymentMode().getName().contains("Visa / Master")) {
            payment_type.setLeftDrawable(getCardDrawableId("visa"));
        } else /*if(onlineRecordDetail.getPaymentMode().getName().toLowerCase().contains("cash")) */{
            payment_type.setLeftDrawable(0);
        }

        total_items.setItem(onlineRecordDetail.getEntries().size() + "");
        subtotal.setItem(onlineRecordDetail.getSubTotal().getFormattedValue());

        if(onlineRecordDetail.freeShippingFlag){
            delivery_fee.setItem(getString(R.string.free));
        }else{
            delivery_fee.setItem(onlineRecordDetail.getDeliveryCost());
        }

        order_total.setItem(onlineRecordDetail.getTotalPrice());

        for(int i = 0; i < entries.size(); i ++) {

            OrderProductItem productView = new OrderProductItem(getBaseActivity());

            productView.setProduct(entries.get(i));

            if(i < 3) {
                productListTopThreeLinearLayout.addView(productView);
                viewAllItemsViewBtn.setVisibility(View.GONE);
                productListExcludeTopThreeLinearLayout.setVisibility(View.GONE);
            } else {
                productListExcludeTopThreeLinearLayout.addView(productView);
                viewAllItemsViewBtn.setVisibility(View.VISIBLE);
                productListExcludeTopThreeLinearLayout.setVisibility(View.GONE);

                viewAllItemsViewBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewAllItemsViewBtn.setVisibility(View.GONE);
                        productListExcludeTopThreeLinearLayout.setVisibility(View.VISIBLE);
                    }
                });
            }
        }
    }

    public void onEvent(OrderProductReviewClickEvent event) {
        OrderReviewFragment fragment = new OrderReviewFragment();
        Bundle bundle = new Bundle();

        // Put the clicked item to the fist in the list
        ArrayList<OnlineRecordDetail.Order> renewEntries = new ArrayList<>();
        for(int i = 0; i < entries.size(); i++){
            if(event.getOrder().getProduct().getCode().equals(entries.get(i).getProduct().getCode())){
                renewEntries.add(entries.get(i));
            }
        }
        for(int i = 0; i < entries.size(); i++){
            if(!event.getOrder().getProduct().getCode().equals(entries.get(i).getProduct().getCode())){
                renewEntries.add(entries.get(i));
            }
        }

        bundle.putSerializable("products", renewEntries);
        bundle.putString("orderNo", mOnlineRecord.getCode());
        fragment.setArguments(bundle);
        placeFragmentWithBackStack(fragment);
    }

    public void onEvent(RequestOnlineRecordDetailEvent requestOnlineRecordDetailEvent) {
        hideProgressDialog();
        if(requestOnlineRecordDetailEvent.getSuccess()){
            uploadLayout(requestOnlineRecordDetailEvent.getOnlineRecordDetail());
            setStatus(requestOnlineRecordDetailEvent.getOnlineRecordDetail().getStatus().getCode(), requestOnlineRecordDetailEvent.getOnlineRecordDetail().getConsignmentStatus());
        }else{
            ToastUtils.show(getActivity(), requestOnlineRecordDetailEvent.getMessage());
        }
    }

    public int getCardDrawableId(String cardType) {
        if(cardType.equals("visa"))
            return R.drawable.payment_method_icn_visa;

        if(cardType.equals("master"))
            return R.drawable.payment_method_icn_master_card;

        if(cardType.equals("amex"))
            return R.drawable.payment_method_icn_am;
        return R.drawable.payment_method_icn_visa;
    }


//    public final static int FRAUD_CHECK = 1;
//    public final static int ON_HOLD = 2;
//    public final static int CREATED = 3;
//    public final static int ORDER_PLACED_NOTIFICATION_SENT = 4;
//    public final static int WAITING_FOR_CAPTURE = 5;
//    public final static int PAYMENT_CAPTURED = 6;
//    public final static int COMPLETED = 7;
//    public final static int CANCELLED = 8;

    public void setStatus(String code, String consignmentStatus){

        String[] arrStatusStr = getResources().getStringArray(R.array.delivery_status_filter);
        String[] arrStatusCode = getResources().getStringArray(R.array.delivery_status_filter_code);

        int selectedPos = 1;
        ArrayList<String> statusStrings = new ArrayList<>();

        statusStrings.add(arrStatusStr[1]);
        statusStrings.add(arrStatusStr[2]);
        statusStrings.add(arrStatusStr[3]);
        statusStrings.add(arrStatusStr[4]);
        statusStrings.add(arrStatusStr[5]);
//        statusStrings.add(arrStatusStr[9]);

        for(int i = 0; i < arrStatusCode.length; i++){
            if(code.equals(arrStatusCode[i])){

                if(i == FRAUD_CHECK || i == ON_HOLD){
                    selectedPos = 1;
                }else if(i == CREATED){
                    selectedPos = 2;
                }else if(i == ORDER_PLACED_NOTIFICATION_SENT){
                    selectedPos = 3;
                }else if(i == WAITING_FOR_CAPTURE || i == WAITING_FOR_CAPTURE){
                    selectedPos = 4;
                    if(consignmentStatus != null && consignmentStatus.toLowerCase().equals("delivery_failure")){
                        selectedPos = 5;
                        statusStrings.set(4, arrStatusStr[6]);
                    }
                }else if(i == PAYMENT_CAPTURED || i == COMPLETED){
                    selectedPos = 5;
                }else if(i == CANCELLED){
                    selectedPos = 1;
                    statusStrings.clear();
                    statusStrings.add(arrStatusStr[7]);
                }

            }
        }
        updateProgress(statusStrings, selectedPos);

//        <item>ALL</item>
//        <item>CREATED</item>1
//        <item>ORDER_PLACED_NOTIFICATION_SENT</item>2
//        <item>COMPLETED</item>3
//        <item>CANCELLED</item>4
//        <item>ON_HOLD</item>5
//        <item>FRAUD_CHECK</item>6
//        <item>WAIT_RETURN</item>7
//        <item>WAITING_FOR_CAPTURE</item>8
//        <item>DELIVERY_FAILURE</item>9
//        <item>DELIVERY_CONFIRM</item>10

//            a: FRAUD_CHECK, ON_HOLD
//            b: CREATED
//            c: ORDER_PLACED_NOTIFICATION_SENT
//            d: WAITING_FOR_CAPTURE Shipped
//            e: WAITING_FOR_CAPTURE DELIVERING
//            f: DELIVERY_CONFIRM / COMPLETED / DELIVERY_FAILURE

//        }

    }

    public void updateProgress(ArrayList<String> statusStrings, int currentStatus){
        llProcess.setVisibility(View.VISIBLE);
        ArrayList<Integer> progressStatusList = new ArrayList<>();
        if(statusStrings.size() == 1){ // Order Canceled
            dot1.setVisibility(View.GONE);
            dot2.setVisibility(View.GONE);
            dot3.setVisibility(View.GONE);
            dot4.setVisibility(View.GONE);
            dot5.setVisibility(View.GONE);
            dot6.setVisibility(View.VISIBLE);
            new OrderDetailsDotViewHolder(dot6, 6, FINISH, statusStrings.get(0), getBaseActivity());
        }else{
            for(int i = 0 ; i < 5; i++){
                if(i < currentStatus){
                    progressStatusList.add(FINISH);
                }else if(i == currentStatus){
                    progressStatusList.add(CURRENT);
                }else{
                    progressStatusList.add(NOT_FINISH);
                }

            }
            dot1.setVisibility(View.VISIBLE);
            dot2.setVisibility(View.VISIBLE);
            dot3.setVisibility(View.VISIBLE);
            dot4.setVisibility(View.VISIBLE);
            dot5.setVisibility(View.VISIBLE);
            dot6.setVisibility(View.GONE);
            new OrderDetailsDotViewHolder(dot1, 1, progressStatusList.get(0), statusStrings.get(0), getBaseActivity());
            new OrderDetailsDotViewHolder(dot2, 2, progressStatusList.get(1), statusStrings.get(1), getBaseActivity());
            new OrderDetailsDotViewHolder(dot3, 3, progressStatusList.get(2), statusStrings.get(2), getBaseActivity());
            new OrderDetailsDotViewHolder(dot4, 4, progressStatusList.get(3), statusStrings.get(3), getBaseActivity());
            new OrderDetailsDotViewHolder(dot5, 5, progressStatusList.get(4), statusStrings.get(4), getBaseActivity());
        }
    }
}
