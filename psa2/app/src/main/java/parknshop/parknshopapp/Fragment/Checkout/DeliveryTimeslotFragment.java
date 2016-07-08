package parknshop.parknshopapp.Fragment.Checkout;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.orhanobut.hawk.Hawk;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.Timeslot;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.BaseEvent;
import parknshop.parknshopapp.Rest.event.CartEvent;
import parknshop.parknshopapp.Rest.event.CheckoutDeliveryTimeSlotOnClickEvent;
import parknshop.parknshopapp.Rest.event.TimeslotEvent;
import parknshop.parknshopapp.Utils.Utils;
import parknshop.parknshopapp.View.CheckoutButton;
import parknshop.parknshopapp.View.CheckoutDeliveryTimeSlotItem;
import parknshop.parknshopapp.View.CheckoutReminder;
import parknshop.parknshopapp.WebServiceModel;
/**
 * Created by chrisyu on 6/4/16.
 */
public class DeliveryTimeslotFragment extends BaseFragment {
    public boolean goBackToConfirmation;

    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    //@Bind(R.id.checkout_dot_1) LinearLayout dot1;
    //@Bind(R.id.checkout_dot_2) LinearLayout dot2;
    //@Bind(R.id.checkout_dot_3) LinearLayout dot3;
    //@Bind(R.id.checkout_dot_4) LinearLayout dot4;

    @Bind (R.id.timeslot_panel) LinearLayout timeSlotPanel;
    @Bind (R.id.timeslot_panel_row_placeholder) LinearLayout timeslotPanelRowPlaceHolder;
    @Bind (R.id.reminder) CheckoutReminder reminder;

    @Bind (R.id.con) CheckoutButton checkoutButton;
    private ArrayList<String> dateList = new ArrayList<String>();
    private ArrayList<String> timeSlotList = new ArrayList<String>();

    List<Timeslot> timeslotList = new ArrayList<Timeslot>();
    private Map<String, Timeslot> timeslotMap = new HashMap<>();
    private Map<String, CheckoutDeliveryTimeSlotItem> timeslotViewMap = new HashMap<>();
    private Set<String> uniqueTimeSlotSet = new HashSet<String>();
    private Set<String> uniqueDateSet = new HashSet<String>();
    private String selectedCode;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file

        if(Hawk.get("goToConfirmation", false) == true)
            placeFragmentWithBackStack(new CheckoutPaymentFragment());

        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_delivery_slot_date_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step02-delivery-date-time");

        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        enableSecondRightButton();
        setToolbarTitle(getString(R.string.checkout));

        //new CheckOutDotViewHolder(dot1, 1, FINISH, getBaseActivity());
        //new CheckOutDotViewHolder(dot2, 2, FINISH, getBaseActivity());
        //new CheckOutDotViewHolder(dot3, 3, CURRENT, getBaseActivity());
        //new CheckOutDotViewHolder(dot4, 4, NOT_FINISH, getBaseActivity());


        showProgressDialog();
        WebServiceModel.getInstance(getBaseActivity()).requestTimeslot();

        return view;
    }

    public void onEvent(TimeslotEvent timeslotEvent) {
        hideProgressDialog();
        handleTimeslotData(timeslotEvent);
        drawTimeSlotView();

        String selectedDate = Hawk.get("selectedDate", new String());
        String selectedTime = Hawk.get("selectedTime", new String());

        if(selectedDate.length() == 0 || selectedTime.length() == 0)
            return;

        PressItemEvent event = new PressItemEvent();
        event.setRow(selectedDate);
        event.setCol(selectedTime);
        MyApplication.getInstance().mBus.post(event);
    }

    public class PressItemEvent extends BaseEvent {
        public int row;
        public int col;

        public void setRow(String date) {
            int xi = 0;
            for(int i = 0; i < dateList.size(); i++) {
                if(date.equals(dateList.get(i)))
                    xi =  i;
            }
            row = xi;
        }

        public void setCol(String time) {
            int xi = 0;
            for(int i = 0; i < timeSlotList.size(); i++) {
                if(time.equals(timeSlotList.get(i)))
                    xi =  i;
            }
            col = xi + 1;
        }
    }

    public void handleTimeslotData(TimeslotEvent timeslotEvent) {
        uniqueTimeSlotSet.clear();
        uniqueDateSet.clear();

        timeslotList =  timeslotEvent.getTimeslot();
        for(int i = 0; i < timeslotList.size(); i++) {
            timeslotMap.put(timeslotList.get(i).getName() + " " + timeslotList.get(i).getQuotaDate(), timeslotList.get(i));
            uniqueTimeSlotSet.add(timeslotList.get(i).getName());
            uniqueDateSet.add(timeslotList.get(i).getQuotaDate());
        }
        dateList.clear();
        timeSlotList.clear();

        timeSlotList.addAll(uniqueTimeSlotSet);
        dateList.addAll(uniqueDateSet);

        //Collections.sort(timeSlotList, new TimeslotComparator());
        Collections.sort(timeSlotList, new Comparator<String>() {
            @Override
            public int compare(String lhs, String rhs) {
                //2016-06-12T00:00:00+08:00
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mma", Locale.ENGLISH);
                try {
                    Date date1 = sdf.parse(lhs.split("-")[0].toString().trim());
                    Date date2 = sdf.parse(rhs.split("-")[0].toString().trim());

                    Log.i("yoyoyoyo", "yoyoyoyo" + date1.compareTo(date2));
                    return date1.compareTo(date2);
                } catch (Exception e) {
                    Log.i("exception", "exception" + e.getMessage());
                    e.printStackTrace();
                }
                return 0;
            }
        });
        Collections.sort(dateList);
    }


    public class TimeslotComparator implements Comparator<String> {
        public String timeslotComparator;

        @Override
        public int compare(String lhs, String rhs) {
            //String splitLeft = lhs.split("-")[0].trim();
            //String splitRight = rhs.split("-")[0].trim();

            int left = getInt(lhs);
            int right = getInt(rhs);

            if(left < right)
                return -1;
            else if (left > right)
                return 1;
            else
                return 0;
        }

        public int getInt(String ssss) {
            String s = ssss.split("-")[0].trim();


            int addValue = 0;
            if(s.contains("AM")) {
                addValue = 0;
            }

            if(s.contains("PM")) {
                if(Integer.valueOf(s.split(":")[0]) == 12 && Integer.valueOf(s.split(":")[1]) == 0)
                    addValue = 0;
                else
                    addValue = 12;
            }

            return Integer.valueOf(s.split(":")[0]) + addValue;
        }
    }
    public void onEvent(CheckoutDeliveryTimeSlotOnClickEvent cEvent) {
        if(cEvent.getSuccess()) {
            Log.i("cEvent", "cEvent" + dateList.get(cEvent.getRow()) + " " + timeSlotList.get(cEvent.getCol() - 1));
            Hawk.put("selectedDate", dateList.get(cEvent.getRow()));
            Hawk.put("selectedTime", timeSlotList.get(cEvent.getCol() - 1));
            checkoutButton.disabledView.setVisibility(View.GONE);
        }
    }

    public String getIdByRowCol(int row, int col) {
        for(int i = 0; i < timeslotList.size(); i++) {
            String timeString = dateList.get(row);
            String dateString = timeSlotList.get(col - 1);

            if(timeslotList.get(i).getName().equals(dateString) && (timeslotList.get(i).getQuotaDate().equals(timeString))) {
                return timeslotList.get(i).getCode();
            }
        }
        return  "";
    }

    public void drawTimeSlotView() {
        try {
            if (dateList.size() == 0 && timeSlotList.size() == 0)
                return;

            timeSlotPanel.addView(genearateFirstRow());
            for (int i = 0; i < dateList.size(); i++) {
                LinearLayout linearLayout = genearateRowWithPlaceHolder(i);
                //linearLayout.setGravity(Gravity.CENTER_VERTICAL);
                for (int y = 0; y < timeSlotList.size(); y++) {
                    CheckoutDeliveryTimeSlotItem checkoutDeliveryTimeSlotItem = generateGenearlItem(i, y + 1);

                    Timeslot timeslot = timeslotMap.get(timeSlotList.get(y) + " " + dateList.get(i));
                    Log.i("timeslot", "timeslot " + timeslot.isDeliveryAvailable());

                    if (!timeslot.isDeliveryAvailable())
                        checkoutDeliveryTimeSlotItem.setType(CheckoutDeliveryTimeSlotItem.UNAVALIABLE);

                    timeslotViewMap.put(timeslotList.get(y + 1).getName() + " " + timeslotList.get(y + 1).getQuotaDate(), checkoutDeliveryTimeSlotItem);
                    linearLayout.addView(checkoutDeliveryTimeSlotItem);
                }
                timeSlotPanel.addView(linearLayout);
                /*
                LinearLayout divider = new LinearLayout(getBaseActivity());
                divider.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5));
                divider.setBackgroundColor(getResources().getColor(Color.BLACK));
                timeSlotPanel.addView(divider);*/

            }
        } catch (Exception e) {
            Log.i("exception", "exception" + e.getMessage());
        }
    }

    public LinearLayout genearateFirstRow() {
        LinearLayout firstRom = new LinearLayout(getActivity());
        firstRom.addView(generateFirstDummyItem());

        timeslotPanelRowPlaceHolder.addView(generateFirstDummyItem());

        for(int y = 0; y < timeSlotList.size(); y++) {
            CheckoutDeliveryTimeSlotItem checkoutDeliveryTimeSlotItem = generateColPlaceHolder(y);

            if(Hawk.get("deliveryMode", "").equals("SelfPickUp")) {
                checkoutDeliveryTimeSlotItem.setVisibility(View.GONE);
            }

            firstRom.addView(checkoutDeliveryTimeSlotItem);
        }

        return firstRom;
    }

    public LinearLayout genearateRowWithPlaceHolder(int row) {

        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);

        linearLayout.addView(generateRowPlaceHolder(row));
        timeslotPanelRowPlaceHolder.addView(generateRowPlaceHolder(row));

        return linearLayout;
    }

    public CheckoutDeliveryTimeSlotItem generateFirstDummyItem () {
        CheckoutDeliveryTimeSlotItem firstRomcdsl = (new CheckoutDeliveryTimeSlotItem(getActivity()));
        firstRomcdsl.setDateString(getString(R.string.date));
        firstRomcdsl.setType(CheckoutDeliveryTimeSlotItem.PLACEHOLDER_COLUMN);
        return firstRomcdsl;
    }

    public CheckoutDeliveryTimeSlotItem generateRowPlaceHolder(int row) {
        CheckoutDeliveryTimeSlotItem cdsl = (new CheckoutDeliveryTimeSlotItem(getActivity()));
        cdsl.setDateString(dateList.get(row));
        cdsl.setRow(row);
        cdsl.setCol(0);
        cdsl.setType(CheckoutDeliveryTimeSlotItem.PLACEHOLDER_ROW);

        return  cdsl;
    }


    public CheckoutDeliveryTimeSlotItem generateColPlaceHolder(int col) {
        CheckoutDeliveryTimeSlotItem cdsl = (new CheckoutDeliveryTimeSlotItem(getActivity()));

        String tempString = "";
        String [] splitArray = timeSlotList.get(col).split("-");
        Log.i("splitArray[i]", "splitArray[i]1" + timeSlotList.get(col));

        for(int i = 0 ; i < splitArray.length; i ++) {
            //splitArray[i] = splitArray[i].replace("AM", context.getString(R.string.checkout_timeslot_item_am) );
            //splitArray[i] = splitArray[i].replace("PM", context.getString(R.string.checkout_timeslot_item_am));

            Log.i("splitArray[i]", "splitArray[i]" + splitArray[i]);

            if(splitArray[i] != null && splitArray[i].contains("AM"))
                splitArray[i] = getString(R.string.checkout_timeslot_item_am).replace("%s", splitArray[i].replace("AM", ""));

            if(splitArray[i] != null && splitArray[i].contains("PM"))
                splitArray[i] = getString(R.string.checkout_timeslot_item_pm).replace("%s", splitArray[i].replace("PM", ""));
            tempString += (i > 0 ? " - " : "") + splitArray[i];
        }

        cdsl.setDateString(tempString);
        cdsl.setType(CheckoutDeliveryTimeSlotItem.PLACEHOLDER_COLUMN);
        cdsl.setRow(0);
        cdsl.setCol(col + 1);

        cdsl.getTitleTextView().setLayoutParams(generateLayoutParams());

        return cdsl;
    }

    public CheckoutDeliveryTimeSlotItem generateGenearlItem (int row, int col) {
        CheckoutDeliveryTimeSlotItem cdtsi = new CheckoutDeliveryTimeSlotItem(getActivity());
        cdtsi.getTitleTextView().setLayoutParams(generateLayoutParams());
        cdtsi.setRow(row);
        cdtsi.setCol(col);
        cdtsi.setTimeslotCode(getIdByRowCol(row, col));
        return cdtsi;
    }

    public RelativeLayout.LayoutParams generateLayoutParams() {
        int height = Utils.dpToPxHeight(40, getBaseActivity());
        int width =  Math.max((Utils.getScreenWidth(getBaseActivity()) - Utils.dpToPx(140, getBaseActivity())) / timeSlotList.size(), Utils.dpToPx(90, getBaseActivity()));
        return new RelativeLayout.LayoutParams(width, height); //width,height;
    }

    @OnClick (R.id.con)
    public void nextPage() {
        // showProgressDialog();
        /// if(selectedCode.length() > 0)
        //     WebServiceModel.getInstance(getBaseActivity()).saveDeliveryScheduleId(selectedCode);
        //
        if(checkoutButton.disabledView.getVisibility() == View.GONE) {
            if(goBackToConfirmation)
                placeFragmentWithBackStack(new CheckoutConfirmationFragment());
            else
                placeFragmentWithBackStack(new CheckoutPaymentFragment());
        }
    }


    public void onEvent(CartEvent cartEvent) {
        hideProgressDialog();
        CartResponse cartResponse = cartEvent.getCartResponse();
        if(cartEvent.getSuccess() && cartResponse.getReminderCartEntries().size() > 0) {
            if(cartResponse.getReminderCartEntries().size() > 0)
                showReminderIfNeeded(cartResponse);
        } else {
            reminder.setVisibility(View.GONE);
        }
    }

    public void showReminderIfNeeded(CartResponse cartResponse) {
        if(cartResponse.getReminderCartEntries() != null && cartResponse.getReminderCartEntries().size() > 0) {
            reminder.setVisibility(View.VISIBLE);
            reminder.addProductChildIfNeeded(cartResponse.getReminderCartEntries());
            String deliveryMode = Hawk.get("deliveryMode", "");
            String placeHolderString = getResources().getString(R.string.reminder_primary_desc);

            if(deliveryMode.equals("HomeDelivery")) {
                deliveryMode = getResources().getString(R.string.check_out_home_delivery);
            } else if (deliveryMode.equals("SelfPickUp")){
                deliveryMode = getResources().getString(R.string.delivery_method_self);
            }

            reminder.subTitle.setText(String.format(placeHolderString, cartResponse.getReminderCartEntries().size() +  ""));
        } else {
            reminder.setVisibility(View.GONE);
        }
    }
}
