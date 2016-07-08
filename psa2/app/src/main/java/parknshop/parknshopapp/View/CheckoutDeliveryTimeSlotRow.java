package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CheckoutDeliveryTimeSlotOnClickEvent;

/**
 * Created by chrisyu on 6/4/16.
 */
public class CheckoutDeliveryTimeSlotRow extends LinearLayout {
    @Bind (R.id.row_title) TextView rowTitle;
    String rowTitleString = null;
    int timeslotCount = 0;

    ArrayList<CheckoutDeliveryTimeSlotItem> columnList = new ArrayList<CheckoutDeliveryTimeSlotItem>();
    //@Bind (R.id.column_1) CheckoutDeliveryTimeSlotItem column1;
    //@Bind (R.id.column_2) CheckoutDeliveryTimeSlotItem column2;
    //@Bind (R.id.column_3) CheckoutDeliveryTimeSlotItem column3;

    ArrayList<String> checkoutDeliveryTimeSlotRows = new ArrayList<String>();
    //String rowTitleString_1;
    //String rowTitleString_2;
    //String rowTitleString_3;

    public CheckoutDeliveryTimeSlotRow(Context context,  ArrayList<String> timeslot, int placeholder) {
        this(context);
        this.checkoutDeliveryTimeSlotRows = timeslot;
        drawLayout();
    }

    public CheckoutDeliveryTimeSlotRow(Context context, int timeslotCount, String rowTitleString) {
        this(context);
        this.rowTitleString = rowTitleString;
        this.timeslotCount = timeslotCount;
        for(int i = 0; i < timeslotCount; i++) {
            CheckoutDeliveryTimeSlotItem checkoutDeliveryTimeSlotItem = new CheckoutDeliveryTimeSlotItem(context);

            //android:layout_weight="1"
            //android:layout_width="0dp"
            //android:layout_height="wrap_content"

            columnList.add(checkoutDeliveryTimeSlotItem);
            this.addView(checkoutDeliveryTimeSlotItem);
            ///Log.i("yoyoItem", "yoyoItem" + i);
        }
        drawLayout();
    }

    public CheckoutDeliveryTimeSlotRow(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.checkout_delivery_slot_date_row, this);
        ButterKnife.bind(this);
        drawLayout();
        MyApplication.getInstance().register(this);
    }

    public CheckoutDeliveryTimeSlotRow(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        LayoutInflater.from(context).inflate(R.layout.checkout_delivery_slot_date_row, this);
        ButterKnife.bind(this);
        drawLayout();
        MyApplication.getInstance().register(this);
    }

    public CheckoutDeliveryTimeSlotRow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_delivery_slot_date_row, this);
        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutDeliveryTimeSlotRow);
        //rowTitleString = a.getString(R.styleable.CheckoutDeliveryTimeSlotRow_checkout_delivery_timeslot_row_title);

        //rowTitle.setText(rowTitleString != null ? rowTitleString : "1/4");

        //rowTitleString_1 = a.getString(R.styleable.CheckoutDeliveryTimeSlotRow_checkout_delivery_timeslot_row_title_1);
        //rowTitleString_2 = a.getString(R.styleable.CheckoutDeliveryTimeSlotRow_checkout_delivery_timeslot_row_title_2);
        //rowTitleString_3 = a.getString(R.styleable.CheckoutDeliveryTimeSlotRow_checkout_delivery_timeslot_row_title_3);

        /*if(rowTitleString_1 != null && rowTitleString_1.length() > 0) {
            column1.title.setText(rowTitleString_1);
            column1.type = 3;

            column2.title.setText(rowTitleString_2);
            column2.type = 3;

            column3.title.setText(rowTitleString_3);
            column3.type = 3;
        }*/

        //if(rowTitleString == null || rowTitleString.length() == 0)
        //    rowTitle.setVisibility(View.INVISIBLE);

        drawLayout();
        MyApplication.getInstance().register(this);
    }

    public void drawLayout() {
        rowTitle.setText(rowTitleString != null ? rowTitleString : "1/4");
        //Log.i("data", "data " + rowTitleString + " " + timeslotCount);
        if(rowTitleString == null || rowTitleString.length() == 0)
            rowTitle.setVisibility(View.INVISIBLE);
        else
            rowTitle.setVisibility(View.VISIBLE);
    }

    public void onEvent(CheckoutDeliveryTimeSlotOnClickEvent event) {
        for(int i = 1; i < columnList.size(); i++) {
            if(event.getSelected() && event.getSucessCode() == columnList.get(i).getSuccessCode())
                rowTitle.setBackgroundResource(R.drawable.checkout_next_btn_red);
            else
                rowTitle.setBackgroundResource(R.drawable.checkout_next_btn_background);
        }

        //Log.i("successCode2", "successCode2" + event.getSucessCode() + " " + column1.getSuccessCode() + " " + column2.getSuccessCode() + " " + column3.getSuccessCode());
        //if(event.getSelected() && (event.getSucessCode() == column1.getSuccessCode() || event.getSucessCode() == column2.getSuccessCode() || event.getSucessCode() == column3.getSuccessCode()))
        //   rowTitle.setBackgroundResource(R.drawable.checkout_next_btn_red);
        //else
        //    rowTitle.setBackgroundResource(R.drawable.checkout_next_btn_background);

        /*
        if(rowTitleString_1 != null && rowTitleString_1.length() > 0) {
            if(event.getSelected() && event.getRow() == 1)
                column1.title.setBackgroundResource(R.drawable.checkout_next_btn_red);
            else
                column1.title.setBackgroundResource(R.drawable.checkout_next_btn_background);
        }

        if(rowTitleString_2 != null && rowTitleString_2.length() > 0) {
            if(event.getSelected() && event.getRow() == 2)
                column2.title.setBackgroundResource(R.drawable.checkout_next_btn_red);
            else
                column2.title.setBackgroundResource(R.drawable.checkout_next_btn_background);
        }

        if(rowTitleString_3 != null && rowTitleString_3.length() > 0) {
            if(event.getSelected() && event.getRow() == 3)
                column3.title.setBackgroundResource(R.drawable.checkout_next_btn_red);
            else
                column3.title.setBackgroundResource(R.drawable.checkout_next_btn_background);
        }*/
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MyApplication.getInstance().unRegister(this);
    }
}
