package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Checkout.DeliveryTimeslotFragment;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CheckoutDeliveryTimeSlotOnClickEvent;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 6/4/16.
 */
public class CheckoutDeliveryTimeSlotItem extends RelativeLayout {
    @Bind(R.id.title) TextView title;
    @Bind(R.id.disabled_view) View disabledView;
    @Bind(R.id.hidden_textview) View hiddenTextView;
    Context context;

    Boolean isSelected = false;
    Integer type;
    String dateString = "1/4";
    int successCode;
    String timeslotCode;

    int row = -1;
    int col = -1;

    public CheckoutDeliveryTimeSlotItem(Context context) {
        this(context, null);
    }

    public CheckoutDeliveryTimeSlotItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutDeliveryTimeSlotItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_delivery_slot, this);
        setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        ButterKnife.bind(this);

        this.context = context;

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutDeliveryTimeSlotItem);
        type = a.getInteger(R.styleable.CheckoutDeliveryTimeSlotItem_checkout_delivery_timeslot_status, AVALIABLE);
        isSelected = a.getBoolean(R.styleable.CheckoutDeliveryTimeSlotItem_checkout_delivery_timeslot_is_selected, false);
        dateString = a.getString(R.styleable.CheckoutDeliveryTimeSlotItem_checkout_delivery_timeslot_date);
        successCode = this.hashCode();

        drawBackground();
        try {
            MyApplication.getInstance().register(this);
        } catch (Exception e) {

        }
    }

    public int getSuccessCode() {
        return successCode;
    }

    public void drawBackground() {
        //Log.i("type", "type" + getTypeTitle(type));

        if(PLACEHOLDER_ROW != type && PLACEHOLDER_COLUMN != type) {
            title.setText(getTypeTitle(type));
            title.setBackgroundResource(type == SELECTED || isSelected ? R.drawable.checkout_next_btn_background : R.drawable.checkout_next_btn_alternative);
            title.setTextColor(type == SELECTED || isSelected ? Color.WHITE :  context.getResources().getColor(R.color.colorPrimary));

            if (type == UNAVALIABLE) {
                title.setBackgroundColor(Color.WHITE);
                //disabledView.setVisibility(View.VISIBLE);
            }else
                disabledView.setVisibility(View.GONE);
        } else {

            title.setBackgroundColor(Color.WHITE);
            title.setTextColor(Color.BLACK);
            try {
                if(PLACEHOLDER_ROW == type) {
                    //2016-05-14T00:00:00+08:00
                    String tempString = dateString.split("T")[0].split("-")[1] + "/" + dateString.split("T")[0].split("-")[2];
                    /*String [] splitArray = tempString.split("-");

                    for(int i = 0 ; i < splitArray.length; i ++) {
                        //splitArray[i] = splitArray[i].replace("AM", context.getString(R.string.checkout_timeslot_item_am) );
                        //splitArray[i] = splitArray[i].replace("PM", context.getString(R.string.checkout_timeslot_item_am));

                        Log.i("splitArray[i]", "splitArray[i]" + splitArray[i]);

                        if(splitArray[i] != null && splitArray[i].contains("AM"))
                            splitArray[i] = context.getString(R.string.checkout_timeslot_item_am).replace("%s", splitArray[i]);

                        if(splitArray[i] != null && splitArray[i].contains("PM"))
                            splitArray[i] = context.getString(R.string.checkout_timeslot_item_pm).replace("%s", splitArray[i]);
                        tempString += splitArray[i];
                    }*/

                    //return 1/4 format
                    title.setText(tempString);
                } else {
                    title.setText(dateString);
                }
            } catch (Exception e) {
                //Log.i("exception", "" + e.getMessage());
            }
        }
    }

    public static int AVALIABLE = 0;
    public static int UNAVALIABLE = 1;
    public static int SELECTED = 2;
    public static int PLACEHOLDER_ROW = 3;
    public static int PLACEHOLDER_COLUMN = 4;

    public String getTypeTitle(int i) {
        if (i == AVALIABLE)
            return context.getString(R.string.checkout_timeslot_avaliable);
        if (i == UNAVALIABLE)
            return context.getString(R.string.checkout_timeslot_unavaliable);
        if (i == SELECTED)
            return context.getString(R.string.checkout_timeslot_selected);
        return "";
    }

    @OnClick(R.id.background)
    public void onItemClick() {
        //isSelected = !isSelected;
        //type = type == 1 ? 0 : 1;

        if (type == SELECTED || type == UNAVALIABLE)
            return;

        //Log.i("type", "type" + (type));
        if(PLACEHOLDER_ROW != type && PLACEHOLDER_COLUMN != type) {
            if (type == 0)
                type = SELECTED;
            //else if (type == SELECTED)
            //    type = AVALIABLE;
            drawBackground();

            ((BaseActivity)context).showProgressDialog();

            WebServiceModel.getInstance(context).saveDeliveryScheduleId(this.timeslotCode, this.hashCode());
            //WebServiceModel.getInstance()

            CheckoutDeliveryTimeSlotOnClickEvent event = new CheckoutDeliveryTimeSlotOnClickEvent();
            event.setSuccess(true);
            event.setSuccessCode(successCode);
            event.setRow(row);
            event.setCol(col);
            //Log.i("row_col", "row_col" + row + " " + (col - 1));
            event.setSelected(type == SELECTED ? true : false);

            MyApplication.getInstance().mBus.post(event);
        }
    }

    public void onEvent(EmptyJsonEvent emptyJsonEvent) {
        if(emptyJsonEvent.getSuccessCode() == this.hashCode()) {
            //Log.i("call123456456 ", "call12345645 " + emptyJsonEvent.getDataObject());
            ((BaseActivity) context).showProgressDialog();
            WebServiceModel.getInstance((context)).requestGetCart((context), "init");
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MyApplication.getInstance().unRegister(this);
    }

    public void reset() {
        if(type == SELECTED)
            type = AVALIABLE;
        drawBackground();
    }

    public void setType(int i) {
        type = i;
        drawBackground();
    }

    public void setIsSelected(boolean isSelected){
        this.isSelected = isSelected;
        drawBackground();
    }

    public void setDateString(String dataString) {
        this.dateString = dataString;
        drawBackground();
    }

    public void onEvent(CheckoutDeliveryTimeSlotOnClickEvent event) {
        //Log.i("successCode", "successCode" + successCode);
        if(!(event.getSucessCode() == successCode))
            reset();

        if (type == PLACEHOLDER_ROW) {
            if(row == event.getRow() && event.getSelected()) {
                title.setBackgroundResource(R.drawable.checkout_next_btn_background);
                title.setTextColor(Color.WHITE);
            } else {
                //title.setBackgroundColor(Color.WHITE);
                //title.setTextColor(Color.BLACK);
            }
        }

        if (type == PLACEHOLDER_COLUMN) {
            //Log.i("place_holder", "place_holder_col" + event.getCol() + " " + col + " type " + type);
            if(col == event.getCol() && event.getSelected()) {
                title.setBackgroundResource(R.drawable.checkout_next_btn_background);
                title.setTextColor(Color.WHITE);
            } else {
                //title.setBackgroundColor(Color.WHITE);
                //title.setTextColor(Color.BLACK);
            }
        }
    }


    public TextView getTitleTextView() {
        return title;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setTimeslotCode(String timeslotCode) {
        this.timeslotCode = timeslotCode;
    }

    public String getTimeslotCode() {
        return  timeslotCode;
    }

    public void onEvent(DeliveryTimeslotFragment.PressItemEvent pressItemEvent) {
        if(row == pressItemEvent.row && col == pressItemEvent.col)
            this.onItemClick();
    }
}
