package parknshop.parknshopapp.Fragment.Grocery;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.orhanobut.hawk.Hawk;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import parknshop.parknshopapp.API;
import parknshop.parknshopapp.Adapter.GroceryCategoriesListAdapter;
import parknshop.parknshopapp.Adapter.StringPickerAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.GroceryCategoriesListAdapterOnItemClickEvent;
import parknshop.parknshopapp.EventUpdate.GroceryListAdapterItemClickAddToCartEvent;
import parknshop.parknshopapp.EventUpdate.StringPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.EventUpdate.WishListUpdatedEvent;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.GetProductsByCatResponseEvent;
import parknshop.parknshopapp.Rest.event.RemoveProductFromWishListResponseEvent;
import parknshop.parknshopapp.Utils.AlarmReceiver;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by kwongyuenpan on 18/3/16.
 */
public class GroceryCategoriesFragment extends BaseFragment implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");

    @Bind(R.id.list)
    ListView list;
    GroceryCategoriesListAdapter groceryCategoriesListAdapter;
    @Bind(R.id.rlBtnShare)
    RelativeLayout rlBtnShare;
    @Bind(R.id.rlBtnReminder)
    RelativeLayout rlBtnReminder;
    @Bind(R.id.rlClickView)
    RelativeLayout rlClickView;
    @Bind(R.id.rlAlarm)
    RelativeLayout rlAlarm;
    @Bind(R.id.rlRepeat)
    RelativeLayout rlRepeat;
    @Bind(R.id.slLayout)
    SlidingUpPanelLayout slLayout;
    @Bind(R.id.btnCancel)
    TextView btnCancel;
    @Bind(R.id.btnOK)
    TextView btnOK;
    @Bind(R.id.scOnOff)
    SwitchCompat scOnOff;
    @Bind(R.id.btnAlarm)
    TextView btnAlarm;
    @Bind(R.id.btnRepeat)
    TextView btnRepeat;
    @Bind(R.id.add_to_cart)
    LinearLayout add_to_cart;

    WishListResponse mWishListResponse;
    int position;
    boolean isMyList;
    boolean isFromAlarm;

    private PendingIntent pendingIntent;
    ArrayList<String> pkList = new ArrayList<>();
    Date date = new Date();
    boolean isDatePickerClicked;
    int repeatTime = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_grocery_categories, container, false);

        position = getArguments().getInt("position", 0);
        isMyList = getArguments().getBoolean("isMyList", false);
        isFromAlarm = getArguments().getBoolean("isFromAlarm", false);

        WishListResponse[] wishListResponses = getAllGrocery();
        mWishListResponse = wishListResponses[position];

        ButterKnife.bind(this, view);
        showToolbar();
        showLogo();
        showBackButton();
        enableNavigationDrawer();
        setToolbarTitle(mWishListResponse.getName());

        String myListGA = "my_list/";
        if(!isMyList){
            myListGA = "recommend_list/";
        }

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-list/" + myListGA + mWishListResponse.getName());
        GATrackerHelper.getInstance(getActivity()).setCategory("my-list/" + myListGA + mWishListResponse.getName() + "/");

        slLayout.setTouchEnabled(false);
        slLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);

//        LogUtil.info("", "mWishListResponse:"+new Gson().toJson(mWishListResponse));
//        LogUtil.info("", "mWishListResponse:"+mWishListResponse.getPrimaryKey());

        // Get the previous reminder setting
        ArrayList<String> pkList = Hawk.get(GlobalConstant.REMINDER_PK_LIST, new ArrayList<String>());

        boolean prevSCOnOff = Hawk.get(mWishListResponse.getPrimaryKey()+"_"+GlobalConstant.REMINDER_ON_OFF, false);
        long prevDate = Hawk.get(mWishListResponse.getPrimaryKey()+"_"+GlobalConstant.REMINDER_SET_DATE, new Date().getTime());
        int prevRepeatType = Hawk.get(mWishListResponse.getPrimaryKey()+"_"+GlobalConstant.REMINDER_REPEAT_TYPE, 0);


        btnAlarm.setText(format.format(new Date()));

        if(prevSCOnOff){
            scOnOff.setChecked(true);
        }else{
            scOnOff.setChecked(false);
        }
        enableAlarmAndRepeat(prevSCOnOff);

        btnAlarm.setText(format.format(prevDate));
        btnRepeat.setText(getResources().getStringArray(R.array.grocery_list_alarm_picker)[prevRepeatType]);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
//        rlClickView.setVisibility(View.GONE);

        // From static list, get product info
//        if(mWishListResponse.getPrimaryKey() == null){
        if(mWishListResponse.isStaticList()){
            String query = ":iwaBestSellerQty";
            for(WishListResponse.Entry entry:mWishListResponse.getEntries()){
                query = query+":defaultVariantCode:"+entry.getProduct().getCode();
            }
            showProgressDialog();
            WebServiceModel.getInstance(getActivity()).requestGetProductsByCat(getActivity(), "Cat", query, 0, this.hashCode());
        }else{
            uploadLayout();
        }

    }

    public void onEvent(GetProductsByCatResponseEvent getProductsByCatResponseEvent) {
        hideProgressDialog();
        if(getProductsByCatResponseEvent.getSuccess()){

            for(int i = 0; i < mWishListResponse.getEntries().size(); i++){
                for(int j = 0; j < getProductsByCatResponseEvent.getTextSearchResponse().getProducts().size(); j++){
                    if(getProductsByCatResponseEvent.getTextSearchResponse().getProducts().get(j).getCode().equals(mWishListResponse.getEntries().get(i).getProduct().getCode())){
                        WishListResponse.Entry entry = new WishListResponse.Entry();
                        entry.setProduct(getProductsByCatResponseEvent.getTextSearchResponse().getProducts().get(j));
                        mWishListResponse.getEntries().set(i, entry);
                        break;
                    }
                }
            }

            // Filter the null object
            WishListResponse wishListResponse = new WishListResponse();
            for(int i = 0; i < mWishListResponse.getEntries().size(); i++){
                if(mWishListResponse.getEntries().get(i).getProduct().getBrandName() != null)
                    wishListResponse.addEntry(mWishListResponse.getEntries().get(i));
            }
            wishListResponse.setName(mWishListResponse.getName());
            wishListResponse.setStaticList(mWishListResponse.isStaticList());
            wishListResponse.setPrimaryKey(mWishListResponse.getPrimaryKey());
            mWishListResponse = wishListResponse;

            uploadLayout();
        }else{
            ToastUtils.show(getActivity(), getProductsByCatResponseEvent.getMessage());
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        rlClickView.setVisibility(View.GONE);
        slLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
    }

    public void uploadLayout(){
        btnAlarm.setText(format.format(date));

        groceryCategoriesListAdapter = new GroceryCategoriesListAdapter(mWishListResponse, getActivity());
        list.setAdapter(groceryCategoriesListAdapter);
    }

    public void onEvent(RemoveProductFromWishListResponseEvent removeProductFromWishListResponseEvent){
        hideProgressDialog();
        if(removeProductFromWishListResponseEvent.getSuccess()){
            WebServiceModel.getInstance(getActivity()).requestGetWishList(getActivity(), "remove", null);
        }else{
            ToastUtils.show(getActivity(), removeProductFromWishListResponseEvent.getMessage());
        }
    }

    public void onEvent(WishListUpdatedEvent wishListUpdatedEvent){
        WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);
        if(wishListResponses != null) {
            for (WishListResponse wishListResponse : wishListResponses) {
                if (wishListResponse.getPrimaryKey().equals(mWishListResponse.getPrimaryKey())) {
                    mWishListResponse = wishListResponse;
                }
            }
        }
        uploadLayout();
    }

    public void onEvent(GroceryListAdapterItemClickAddToCartEvent groceryListAdapterItemClickAddToCartEvent){
        showProgressDialog();
        WebServiceModel.getInstance(getBaseActivity()).addShoppingCart(groceryListAdapterItemClickAddToCartEvent.getProduct().getCode(), 1, getBaseActivity());
    }

    public void onEvent(GroceryCategoriesListAdapterOnItemClickEvent groceryCategoriesListAdapterOnItemClickEvent){
        ProductListFragment pf = ProductListFragment.newInstance((groceryCategoriesListAdapterOnItemClickEvent.getProduct().getCode()), false);
        placeFragmentWithBackStack(pf);
    }

    @OnClick(R.id.rlClickView)
    public void rlClickView(){

    }

    @OnClick(R.id.rlBtnShare)
    public void rlBtnShare(){
        String shareItems = "";
        for(int i = 0; i < mWishListResponse.getEntries().size(); i++){
            shareItems += shareItems + "&item" + (i+1) + "=" + mWishListResponse.getEntries().get(i).getProduct().getCode() + "&" +
                    "qty" + (i+1) + "=" + mWishListResponse.getEntries().get(i).getQuantity();
        }
        String shareUrl = API.SHARING_URL + shareItems;
        shareUrl(mWishListResponse.getName(), shareUrl);
    }

    @OnClick(R.id.rlBtnReminder)
    public void rlBtnReminder(){
        rlClickView.setVisibility(View.VISIBLE);
        slLayout.setPanelState(SlidingUpPanelLayout.PanelState.EXPANDED);
    }

    @OnClick(R.id.add_to_cart)
    public void add_to_cart(){
        if(mWishListResponse != null) {
            showProgressDialog();
            for (WishListResponse.Entry entry : mWishListResponse.getEntries()) {
                if(HomePresenter.getLocalShoppingCart().get(Integer.valueOf(entry.getProduct().getCode())) == null || HomePresenter.getLocalShoppingCart().get(Integer.valueOf(entry.getProduct().getCode())) == 0) {
                    WebServiceModel.getInstance(getBaseActivity()).addShoppingCart(entry.getProduct().getCode(), Integer.valueOf(entry.getQuantity()), getBaseActivity());
                } else {
                    WebServiceModel.getInstance(getBaseActivity()).addShoppingCart(entry.getProduct().getCode(), Integer.valueOf(entry.getQuantity()), getBaseActivity());
//                    WebServiceModel.getInstance(getBaseActivity()).editShoppingCart(HomePresenter.getRemoteShoppingCart().getEntryById(entry.getProduct().getCode()).getEntryNumber(), Integer.valueOf(entry.getQuantity()), getBaseActivity());
                }
                HomePresenter.handleLocalShoppingCartData((entry.getProduct().getCode()), Integer.valueOf(entry.getQuantity()));
            }
        }
    }

    @OnClick(R.id.btnCancel)
    public void btnCancel(){
        rlClickView.setVisibility(View.GONE);
        slLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
    }

    @OnClick(R.id.btnOK)
    public void btnOK(){
        GATrackerHelper.getInstance(getActivity()).setGATracker("my-list/set-reminder");
        rlClickView.setVisibility(View.GONE);
        slLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
        if(scOnOff.isChecked()){
            if(!pkList.contains(mWishListResponse.getPrimaryKey()))
                pkList.add(mWishListResponse.getPrimaryKey());
            LogUtil.info("", "pkList:"+mWishListResponse.getPrimaryKey());
            LogUtil.info("", "pkList1:"+pkList.size());
            Hawk.put(GlobalConstant.REMINDER_PK_LIST, pkList);
            Hawk.put(mWishListResponse.getPrimaryKey()+"_"+GlobalConstant.REMINDER_ON_OFF, true);
            Hawk.put(mWishListResponse.getPrimaryKey()+"_"+GlobalConstant.REMINDER_REPEAT_TYPE, repeatTime);
            Hawk.put(mWishListResponse.getPrimaryKey()+"_"+GlobalConstant.REMINDER_SET_DATE, date.getTime());
            startAlarm();
        }else{
            if(pkList.contains(mWishListResponse.getPrimaryKey()))
                pkList.remove(mWishListResponse.getPrimaryKey());
            Hawk.put(GlobalConstant.REMINDER_PK_LIST, pkList);
            Hawk.put(mWishListResponse.getPrimaryKey()+"_"+GlobalConstant.REMINDER_ON_OFF, false);
            Hawk.put(mWishListResponse.getPrimaryKey()+"_"+GlobalConstant.REMINDER_REPEAT_TYPE, 0);
            Hawk.put(mWishListResponse.getPrimaryKey()+"_"+GlobalConstant.REMINDER_SET_DATE, new Date().getTime()); // set to default date
            stopAlarm();
        }
    }

    @OnCheckedChanged(R.id.scOnOff)
    public void scOnOff(){
        enableAlarmAndRepeat(scOnOff.isChecked());
    }

    public void enableAlarmAndRepeat(boolean enable){
        if(enable){
            rlAlarm.setBackgroundColor(getResources().getColor(R.color.white));
            rlRepeat.setBackgroundColor(getResources().getColor(R.color.white));
        }else{
            rlAlarm.setBackgroundColor(getResources().getColor(R.color.redemption_grey));
            rlRepeat.setBackgroundColor(getResources().getColor(R.color.redemption_grey));
        }
        btnAlarm.setClickable(enable);
        btnRepeat.setClickable(enable);
    }

    @OnClick(R.id.btnAlarm)
    public void btnAlarm(){
        showDatePicker();
    }

    public void showDatePicker(){
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog dialog = new DatePickerDialog(getActivity(), GroceryCategoriesFragment.this,
                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH));
        dialog.getDatePicker().setMinDate(calendar.getTimeInMillis());
        dialog.setButton(DialogInterface.BUTTON_NEGATIVE, getString(android.R.string.cancel), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, getString(android.R.string.ok), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                showTimePicker();
            }
        });
        dialog.show();
    }

    public void showTimePicker(){
        final Calendar c = Calendar.getInstance();
        int mHour = c.get(Calendar.HOUR_OF_DAY);
        int mMinute = c.get(Calendar.MINUTE);

        TimePickerDialog tDialog = new TimePickerDialog(getActivity(), GroceryCategoriesFragment.this,
                mHour, mMinute, false);
        tDialog.setButton(DialogInterface.BUTTON_NEGATIVE, getString(android.R.string.cancel), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        tDialog.show();
    }

    @OnClick(R.id.btnRepeat)
    public void btnRepeat(){
        StringPickerAdapter stringPickerAdapter = new StringPickerAdapter(getActivity(), getResources().getStringArray(R.array.grocery_list_alarm_picker), 0);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setAdapter(stringPickerAdapter, stringPickerAdapter);
        builder.show();
    }

    public void startAlarm() {
        stopAlarm();
        Intent alarmIntent = new Intent(AlarmReceiver.INTENT_ACTION);
        alarmIntent.putExtra("type", AlarmReceiver.START_ALARM);
        alarmIntent.putExtra("pk", mWishListResponse.getPrimaryKey());
        getActivity().sendBroadcast(alarmIntent);
        ToastUtils.show(getActivity(), getResources().getString(R.string.grocery_list_alarm_setup));
    }

    public void stopAlarm(){
        Intent intentStop = new Intent(getActivity(), AlarmManager.class);
        PendingIntent senderStop = PendingIntent.getBroadcast(getActivity(),
                mWishListResponse.getPrimaryKey().hashCode(), intentStop, 0);
        AlarmManager alarmManagerStop = (AlarmManager) getActivity().getSystemService(getActivity().ALARM_SERVICE);

        alarmManagerStop.cancel(senderStop);

    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
        date = new Date(year - 1900, monthOfYear, dayOfMonth);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hours, int minutes) {
        date.setHours(hours);
        date.setMinutes(minutes);
        btnAlarm.setText(format.format(date));
    }

    public void onEvent(StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent) {
        btnRepeat.setText(stringPickerAdapterOnItemClickEvent.getText());
        repeatTime = stringPickerAdapterOnItemClickEvent.getPosition();
    }

    public WishListResponse[] getAllGrocery(){
        WishListResponse[] wishStaticListResponses = Hawk.get(AppUtils.grocery_static_list);
        WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);
        ArrayList<WishListResponse> wishListResponseList = new ArrayList<>();

        for(int i = 0; i < wishStaticListResponses.length; i++){
            wishListResponseList.add(wishStaticListResponses[i]);
        }

        for(int i = 0; i < wishListResponses.length; i++){
            wishListResponseList.add(wishListResponses[i]);
        }

        if(!isFromAlarm){
            if(isMyList){
                position += wishStaticListResponses.length;
            }
        }

        WishListResponse[] allWishListResponses = new WishListResponse[wishListResponseList.size()];

        for(int i = 0; i < wishListResponseList.size(); i++){
            allWishListResponses[i] = wishListResponseList.get(i);
        }

        return allWishListResponses;
    }
}
