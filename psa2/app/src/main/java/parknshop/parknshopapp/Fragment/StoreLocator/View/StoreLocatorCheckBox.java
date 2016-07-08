package parknshop.parknshopapp.Fragment.StoreLocator.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CheckoutBoxEvent;
import parknshop.parknshopapp.Rest.event.CheckoutDeliveryTimeSlotOnClickEvent;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 29/4/16.
 */
public class StoreLocatorCheckBox extends LinearLayout {
    @Bind(R.id.icon)
    ImageView icon;
    //@Bind(R.id.icon_unselected) ImageView iconUnselected;

    public
    @Bind(R.id.checkbox_content)
    TextView contentTextView;

    public boolean isSelected;
    Drawable selected;
    Drawable un_selected;
    int successCode;
    Context context;

    String dataId;

    boolean isExclusiveBoolean = true;
    boolean isOnClickDisable;

    public StoreLocatorCheckBox(Context context) {
        this(context, null);
    }

    public StoreLocatorCheckBox(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StoreLocatorCheckBox(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LayoutInflater.from(context).inflate(R.layout.checkout_checkbox, this);
        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutCheckBoxWithText);
        CharSequence content = a.getString(R.styleable.CheckoutCheckBoxWithText_checkboxtitle);
        isSelected = a.getBoolean(R.styleable.CheckoutCheckBoxWithText_isSelected, false);
        selected = a.getDrawable(R.styleable.CheckoutCheckBoxWithText_selected_drawable);
        un_selected = a.getDrawable(R.styleable.CheckoutCheckBoxWithText_unselected_drawable);
        isExclusiveBoolean = a.getBoolean(R.styleable.CheckoutCheckBoxWithText_exclusive_checkbox, true);

        updateCheckbox();
        contentTextView.setText(content);

        this.context = context;
        successCode = this.hashCode();

        try {
            MyApplication.getInstance().register(this);
        } catch (Exception e) {

        }

    }

    @Nullable
    @OnClick(R.id.root)
    public void reverseCheckbox() {
        if (isOnClickDisable)
            return;
        /*isSelected = !isSelected;
        updateCheckbox();
        CheckoutBoxEvent checkoutBoxEvent = new CheckoutBoxEvent();
        checkoutBoxEvent.setHashCode(successCode);
        checkoutBoxEvent.setSelected(isSelected);
        MyApplication.getInstance().mBus.post(checkoutBoxEvent);*/

        if (!isSelected && dataId != null) {
            WebServiceModel.getInstance(context).setDefaultDeliveryAddress(context, dataId);
            ((BaseActivity) context).showProgressDialog();
        }

        //if(!isSelected) {
        isSelected = !isSelected;
        updateCheckbox();
        if (isExclusiveBoolean) {
            CheckoutBoxEvent checkoutBoxEvent = new CheckoutBoxEvent();
            checkoutBoxEvent.setHashCode(successCode);
            checkoutBoxEvent.setDataId(dataId);
            //checkoutBoxEvent.setSelected(isSelected);
            MyApplication.getInstance().mBus.post(checkoutBoxEvent);
        }

        //}
    }

    public void onEvent(EmptyJsonEvent emptyJsonEvent) {
        ((BaseActivity) context).hideProgressDialog();
        if (emptyJsonEvent.getType().equals("setDefaultDeliveryAddress")) {
            /*if(emptyJsonEvent.getSuccess()) {

            } else {
                ToastUtils.show(context, "error" + emptyJsonEvent.getMessage());
            }*/
        }
    }

    public void onEvent(CheckoutBoxEvent checkoutBoxEvent) {
        if (isExclusiveBoolean) {
            if (this.hashCode() == checkoutBoxEvent.getHashCode()) {
                //setSelected(checkoutBoxEvent.getSelected());//checkoutBoxEvent.getSelected();
            } else {
                setSelected(false);//checkoutBoxEvent.getSelected();
            }
        }
        /*
        if(this.hashCode() == checkoutBoxEvent.getHashCode()) {
            setSelected(checkoutBoxEvent.getSelected());//checkoutBoxEvent.getSelected();
        } else {
            setSelected(!checkoutBoxEvent.getSelected());//checkoutBoxEvent.getSelected();
        }*/
    }

    public void setSelected(boolean bool) {
        this.isSelected = bool;
        updateCheckbox();
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public void updateCheckbox() {
        if (isSelected) {
            //icon.setColorFilter(Color.argb(255, 255, 255, 0)); // White Tint
            icon.clearColorFilter();
            icon.setImageDrawable(selected);
        } else {
            icon.setImageDrawable(un_selected);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MyApplication.getInstance().unRegister(this);
    }


    public void onEvent(CheckoutDeliveryTimeSlotOnClickEvent event) {
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getDataId() {
        return dataId;
    }

    public void setText(String textString) {
        contentTextView.setText(textString);
    }

    public void setSelectedDrawable(int drawableid, Context context) {
        selected = context.getResources().getDrawable(drawableid);
    }

    public void setUnSelectedDrawable(int drawableid, Context context) {
        un_selected = context.getResources().getDrawable(drawableid);
    }

    public void disableOnClick(boolean onclick) {
        this.isOnClickDisable = onclick;
    }
}
