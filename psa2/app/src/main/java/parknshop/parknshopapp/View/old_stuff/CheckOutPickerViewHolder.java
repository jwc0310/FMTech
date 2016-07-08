package parknshop.parknshopapp.View.old_stuff;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Adapter.StringPickerAdapter;
import parknshop.parknshopapp.EventUpdate.StringPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 31/3/16.
 */
public class CheckOutPickerViewHolder implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener{
    View view;
    @Bind(R.id.picker_name) TextView title;
    @Bind(R.id.picker_image_btn) ImageView icon;
    Context context;

    String[] stringArray;
    int successCode;

    boolean isDatePicker;
    boolean isTimePicker;

    public CheckOutPickerViewHolder(View view, String titleString, int iconId, Context context) {
        this.view = view;
        this.context = context;
        this.successCode = view.hashCode();

        ButterKnife.bind(this, view);
        setTitle(titleString);
        setIcon(iconId);

        MyApplication.getInstance().register(this);
    }

    public CheckOutPickerViewHolder(View view, String titleString, int iconId, String[] stringArray, Context context) {
        this.view = view;
        this.context = context;
        this.stringArray = stringArray;
        this.successCode = view.hashCode();

        ButterKnife.bind(this, view);
        setTitle(titleString);
        setIcon(iconId);

        MyApplication.getInstance().register(this);
    }

    public void setTitle(String titlestring) {
        title.setText(titlestring);
    }

    public void setIcon(int drawableid) {
        //Glide.with(context).load(drawableid).into(icon);
        icon.setImageResource(drawableid);
    }

    @Nullable @OnClick(R.id.root)
    public void rootOnClick() {
        if(stringArray != null) {
            StringPickerAdapter stringPickerAdapter = new StringPickerAdapter(context, stringArray, successCode);
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setAdapter(stringPickerAdapter, stringPickerAdapter);
            builder.show();
        }

        if(isDatePicker)
            showDatePicker();

        if(isTimePicker)
            showTimePicker();
    }


    public void onEvent(StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent) {
        if(stringPickerAdapterOnItemClickEvent.getReqCode() == successCode) {
            title.setText(stringPickerAdapterOnItemClickEvent.getText());

            if (viewList != null)
                showOnlyOneView(stringPickerAdapterOnItemClickEvent.getPosition());
        }
    }

    ArrayList<View> viewList = null;// new ArrayList<View>();
    public void setViewList(ArrayList<View> viewList) {
        this.viewList = viewList;
    }

    public void showOnlyOneView(int position) {
        for(int i = 0; i < viewList.size(); i++)
            viewList.get(i).setVisibility(View.INVISIBLE);

        viewList.get(position).setVisibility(View.VISIBLE);
    }

    public void enableDatePicker() {
        isDatePicker = true;
    }

    public void enableTimePicker() {
        isTimePicker = true;
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date(year - 1900, monthOfYear, dayOfMonth);
        title.setText(format.format(date));
    }

    public void showDatePicker(){
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog dialog = new DatePickerDialog(context, this, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        dialog.getDatePicker().setMinDate(calendar.getTimeInMillis());
        dialog.setButton(DialogInterface.BUTTON_NEGATIVE, context.getString(android.R.string.cancel), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.show();
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a");
        Date date = new Date();
        date.setHours(hourOfDay);
        date.setMinutes(minute);
        String time=dateFormat.format(date);
        title.setText(time);
    }

    public void showTimePicker() {
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(context, this, hour, minute, DateFormat.is24HourFormat(context));
        timePickerDialog.show();
    }
}
