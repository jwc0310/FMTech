package parknshop.parknshopapp.Fragment.StoreLocator.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Adapter.StringPickerAdapter;
import parknshop.parknshopapp.EventUpdate.StringPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.Fragment.Checkout.callback.OnRegionSelectedRunnable;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 29/4/16.
 */
public class StoreLocatorPicker extends LinearLayout {
    View view;
    public @Bind(R.id.picker_name) TextView title;
    public @Bind(R.id.picker_image_btn) ImageView icon;
    public @Bind(R.id.picker_icon) ImageView pickerIcon;
    public @Nullable @Bind (R.id.dimmed) View dimmed;
    Context context;

    String[] stringArray;
    int successCode;

    String titleDefaultText;

    int clickedPos;

    public StoreLocatorPicker(Context context) {
        this(context, null);
    }

    public StoreLocatorPicker(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StoreLocatorPicker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.store_locator_picker_layout, this);

        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutPicker);
        CharSequence titleString = a.getString(R.styleable.CheckoutPicker_checkout_picker_title);
        Drawable drawable = a.getDrawable(R.styleable.CheckoutPicker_checkout_picker_drawable);
        int dataPointer = a.getInteger(R.styleable.CheckoutPicker_checkout_picker_data, -1);

        if (dataPointer > 0) {
            stringArray = getResources().getStringArray(dataPointer);
        }

        titleDefaultText = titleString + "";
        setTitle(titleString != null ? titleString.toString() : "");
        setIcon(drawable);

        this.context = context;
        this.successCode = this.hashCode();

        try {
            MyApplication.getInstance().register(this);
        }catch (Exception e) {
            //Log.i("null", "null pointer exeception found @ My Application");
        }
    }


    public void setTitle(String titlestring) {
        title.setHint(titlestring);
    }

    public void setText(String titleString) {
        title.setText("");
    }

    public String getText() {
        return title.getText().toString();
    }

    public int getPosition() {
        return clickedPos;
    }

    public void resetDefaultText() {
        title.setHint(titleDefaultText);
    }

    public void setIcon(Drawable drawable) {
        if(drawable != null)
            icon.setImageDrawable(drawable);
    }

    public void setDataArray(String[] array) {
        this.stringArray = array;
    }

    public void setTitleGravity(int gravity){
        title.setGravity(gravity);
    }

    public void setPickerIcon(Drawable drawable){
        if(drawable != null)
            pickerIcon.setImageDrawable(drawable);
    }

    public void showPickerIcon(boolean show){
        if(show)
            pickerIcon.setVisibility(View.VISIBLE);
        else
            pickerIcon.setVisibility(View.GONE);
    }

    @Nullable
    @OnClick(R.id.root)
    public void rootOnClick() {
        //Log.i("stringArray", "stringArray" + stringArray + " " + (stringArray != null ? stringArray.length : 0));

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
        //Log.i("success code", "success code " + stringPickerAdapterOnItemClickEvent.getSuccessCode() + " " + this.hashCode());
        if(stringPickerAdapterOnItemClickEvent.getSuccessCode() == this.hashCode()) {
            String areaSelected = stringPickerAdapterOnItemClickEvent.getText();
            title.setText(areaSelected);

            clickedPos = stringPickerAdapterOnItemClickEvent.getPosition();

            if(callback != null) {
                //Log.i("run callback", "run callback");
                callback.onRegionSelected(areaSelected);
                callback.run();
            }
        }
    }

    public void showDimmedBackground() {
        dimmed.setVisibility(View.VISIBLE);
    }

    public void hideDimmedBackground() {
        dimmed.setVisibility(View.GONE);
    }

    OnRegionSelectedRunnable callback;
    public void setOnItemSelectedCallback(OnRegionSelectedRunnable callback) {
        this.callback = callback;
    }
}
