package parknshop.parknshopapp.Fragment.MemberZone.View;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Adapter.StringPickerAdapter;
import parknshop.parknshopapp.EventUpdate.StringPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.Fragment.Checkout.callback.OnRegionSelectedRunnable;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;

/**
 * Created by Gigi Wong on 2016年04月19日.
 */
public class MemberZoneItemPicker extends LinearLayout implements DatePickerDialog.OnDateSetListener  {
    public @Bind(R.id.header) TextView header;
    public @Bind(R.id.item) TextView item;
    public @Bind(R.id.picker_image_btn) ImageView icon;
    Context context;
    boolean isDatePicker;

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public static final int BIRTHDAY = 5;

    String[] stringArray;
    int successCode;

    String titleDefaultText;

    int clickedPos;

    String type;

    public MemberZoneItemPicker(Context context) {
        this(context, null);
    }

    public MemberZoneItemPicker(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MemberZoneItemPicker(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;

        inflateLayout(context);

        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MemberZoneItemPicker);
        CharSequence title = a.getString(R.styleable.MemberZoneItemPicker_member_picker_header);
        CharSequence content = a.getString(R.styleable.MemberZoneItemPicker_member_picker_content);
        Drawable drawable = a.getDrawable(R.styleable.MemberZoneItemPicker_member_picker_drawable);
        int dataPointer = a.getInteger(R.styleable.MemberZoneItemPicker_member_picker_data, -1);
        int textStyle = a.getInteger(R.styleable.MemberZoneItemPicker_member_picker_textStyle, 0);

        if (textStyle == 11) {
            header.setTypeface(Typeface.DEFAULT_BOLD);
            item.setTypeface(Typeface.DEFAULT_BOLD);
        }

        header.setText(title);
        item.setText(content);
        if (drawable != null) {
            icon.setImageDrawable(drawable);
            icon.setVisibility(View.VISIBLE);
        }

        if (dataPointer > 0) {
            stringArray = getResources().getStringArray(dataPointer);
        }

        titleDefaultText = content + "";
        setItem(content != null ? content.toString() : "");

        try {
            MyApplication.getInstance().register(this);
        }catch (Exception e) {
            //Log.i("null", "null pointer exeception found @ My Application");
        }
    }

    public void setItem(String itemText) {
        setVisibility(View.VISIBLE);
        item.setText(itemText);
    }

    public String getItem(){
        return item.getText().toString();
    }

    public int getPosition() {
        return clickedPos;
    }

    public void setDataArray(String[] array) {
        this.stringArray = array;
    }

    public void setDatePicker(boolean datePicker) {
        isDatePicker = datePicker;
    }

    public boolean isDatePicker() {
        return isDatePicker;
    }

    public void setHeader(String headerText) {
        header.setText(headerText);
    }

    public void setSuccessCode(int successCode){
        this.successCode = successCode;
    }

    public int getSuccessCode(){
        return successCode;
    }

    @Nullable
    @OnClick(R.id.root)
    public void rootOnClick() {

        if(isDatePicker){
            showDatePicker();
        }else
        if(stringArray != null && stringArray.length > 0) {
            StringPickerAdapter stringPickerAdapter = new StringPickerAdapter(context, stringArray, successCode);
            if(callback != null) {
                stringPickerAdapter.setCallBack(callback);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setAdapter(stringPickerAdapter, stringPickerAdapter);
            builder.show();
        }
    }

    public void onEvent(StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent) {
        if(stringPickerAdapterOnItemClickEvent.getSuccessCode() == successCode) {
            String selected = stringPickerAdapterOnItemClickEvent.getText();

            item.setText(selected);

            clickedPos = stringPickerAdapterOnItemClickEvent.getPosition();

            if(callback != null) {
                //Log.i("run callback", "run callback");
                callback.onRegionSelected(selected);
                callback.run();
            }
        }
    }

    public void sendCallBack(String selected){
        if(callback != null) {
            //Log.i("run callback", "run callback");
            callback.onRegionSelected(selected);
            callback.run();
        }
    }

    OnRegionSelectedRunnable callback;
    public void setOnItemSelectedCallback(OnRegionSelectedRunnable callback) {
        this.callback = callback;
    }

    public void inflateLayout(Context context) {
        LayoutInflater.from(context).inflate(R.layout.member_zone_item_picker, this);
    }


    public void showDatePicker(){
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog dialog = new DatePickerDialog(context, this,
                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH));
        dialog.getDatePicker().setMaxDate(calendar.getTimeInMillis());
        dialog.setButton(DialogInterface.BUTTON_NEGATIVE, context.getString(android.R.string.cancel), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.show();
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
        Date date = new Date(year - 1900, monthOfYear, dayOfMonth);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent = new StringPickerAdapterOnItemClickEvent();
        stringPickerAdapterOnItemClickEvent.setText(format.format(date));
        stringPickerAdapterOnItemClickEvent.setSuccessCode(BIRTHDAY);
        MyApplication.getInstance().mBus.post(stringPickerAdapterOnItemClickEvent);

    }
}