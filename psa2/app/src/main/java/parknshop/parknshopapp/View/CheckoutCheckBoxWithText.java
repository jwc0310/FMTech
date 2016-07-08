package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import java.lang.reflect.Method;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.WebView.WebViewFragment;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.BaseEvent;
import parknshop.parknshopapp.Rest.event.CartEvent;
import parknshop.parknshopapp.Rest.event.CheckoutBoxEvent;
import parknshop.parknshopapp.Rest.event.CheckoutDeliveryTimeSlotOnClickEvent;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 16/4/2.
 */
public class CheckoutCheckBoxWithText extends LinearLayout {
    public AddressData.AddressForm addressForm;
    @Bind(R.id.icon) ImageView icon;
    //@Bind(R.id.icon_unselected) ImageView iconUnselected;

    public @Bind(R.id.checkbox_content) TextView contentTextView;
    public @Bind(R.id.checkout_box_background_root) View root;

    public boolean isSelected;
    Drawable selected;
    Drawable un_selected;
    int successCode;
    Context context;

    String dataId;

    boolean isBillingAddress = false;
    boolean isExclusiveBoolean = true;
    public boolean isTAndC = false;
    //public boolean isSelectAll = false;
    //public boolean removeProduct = false;
    public String productCode = "";

    boolean isOnClickDisable;
    public boolean isHomeDeliveryCheckbox;

    String backgroundColorStringCode;
    String textColorStringCode;

    public CheckoutCheckBoxWithText(Context context) {
        this(context, null);
    }

    public CheckoutCheckBoxWithText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutCheckBoxWithText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LayoutInflater.from(context).inflate(R.layout.checkout_checkbox, this);
        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutCheckBoxWithText);
        CharSequence content = a.getString(R.styleable.CheckoutCheckBoxWithText_checkboxtitle);
        isSelected = a.getBoolean(R.styleable.CheckoutCheckBoxWithText_isSelected, false);
        selected = a.getDrawable(R.styleable.CheckoutCheckBoxWithText_selected_drawable);
        un_selected = a.getDrawable(R.styleable.CheckoutCheckBoxWithText_unselected_drawable);
        isExclusiveBoolean = a.getBoolean(R.styleable.CheckoutCheckBoxWithText_exclusive_checkbox, true);
        backgroundColorStringCode = a.getString(R.styleable.CheckoutCheckBoxWithText_background_color);
        textColorStringCode = a.getString(R.styleable.CheckoutCheckBoxWithText_text_color);
        //isSelectAll = a.getBoolean(R.styleable.CheckoutCheckBoxWithText_select_all, false);
        //removeProduct = a.getBoolean(R.styleable.CheckoutCheckBoxWithText_select_shopping_cart_remove_item, false);
        //select_shopping_cart_remove_item

        updateCheckbox();

        if(content != null && content.length() > 0)
            contentTextView.setVisibility(View.VISIBLE);

        contentTextView.setText(content);

        this.context = context;
        successCode = this.hashCode();

        if(backgroundColorStringCode != null)
            root.setBackgroundColor(Color.parseColor(backgroundColorStringCode));

        if(textColorStringCode != null)
            setTextColor(textColorStringCode);
        else
            setTextColor("#000000");

        try {
            MyApplication.getInstance().register(this);
        } catch (Exception e) {

        }
    }

    public void setTextColor(String colorCode) {
        contentTextView.setTextColor(Color.parseColor(colorCode));
    }

    public void setBGColor(int color) {
        ((LinearLayout) findViewById(R.id.checkout_box_background_root)).setBackgroundColor(color);
    }

    @OnClick(R.id.checkout_box_background_root)
    public void reverseCheckbox() {
        if(isOnClickDisable || (isSelected && dataId != null) )
            return;
        /*isSelected = !isSelected;
        updateCheckbox();
        CheckoutBoxEvent checkoutBoxEvent = new CheckoutBoxEvent();
        checkoutBoxEvent.setHashCode(successCode);
        checkoutBoxEvent.setSelected(isSelected);
        MyApplication.getInstance().mBus.post(checkoutBoxEvent);*/

        //Log.i("isBillingAddress", "isBillingAddress" + isBillingAddress + " " + dataId + " " + addressForm.getBillingAddress() + " " + addressForm.getAddressBookName()) ;

        if(isBillingAddress) {
            AddressData addressData = getUpdateAddress(addressForm);
            WebServiceModel.getInstance(context).saveDeliveryAddress(addressData, context, this.hashCode());
            ((BaseActivity)context).showProgressDialog();
        } else if(dataId != null) {
            WebServiceModel.getInstance(context).saveDeliveryAddress(dataId, context, this.hashCode());
            ((BaseActivity)context).showProgressDialog();
        }

        if(isHomeDeliveryCheckbox) {
            String deliveryMode = "HomeDelivery";
            //Log.i("deliveryMode", "deliveryMode" + deliveryMode);
            Hawk.put("deliveryMode", deliveryMode);
        }

        //if(!isSelected) {
        isSelected = !isSelected;
        updateCheckbox();


        if(isExclusiveBoolean) {
            CheckoutBoxEvent checkoutBoxEvent = new CheckoutBoxEvent();
            checkoutBoxEvent.setHashCode(successCode);
            checkoutBoxEvent.setDataId(dataId);
            //checkoutBoxEvent.setSelected(isSelected);
            MyApplication.getInstance().mBus.post(checkoutBoxEvent);
        } else if(isTAndC) {
            BaseEvent event = new BaseEvent();
            event.setSuccessCode(successCode);
            event.setDataObject(isSelected);
            MyApplication.getInstance().mBus.post(event);
        } /*else if(isSelectAll) {
            ShoppingCartSelectAllEvent shoppingCartSelectAllEvent = new ShoppingCartSelectAllEvent(isSelected);
            MyApplication.getInstance().mBus.post(shoppingCartSelectAllEvent);
        } else if (productCode != null && productCode.length() > 0) {
            ShoppingCartRemoveEvent shoppingCartRemoveEvent = new ShoppingCartRemoveEvent(productCode, isSelected);
            MyApplication.getInstance().mBus.post(shoppingCartRemoveEvent);
        }*/

        //}
    }

    public void setTnc(String tAndCString){
//        String tAndCString = context.getString(R.string.t_and_c);
        Spannable WordtoSpan = new SpannableString(tAndCString);
        WordtoSpan.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                String postfix = "?uiel=Mobile&lang=" + (GlobalConstant.language.equals(GlobalConstant.LANG_ZH) ? GlobalConstant.LANG_ZH : GlobalConstant.LANG_EN);
                WebViewFragment webViewFragment = WebViewFragment.newInstance("http://www.parknshop.com/termsAndConditions" + postfix);
                webViewFragment.title = context.getString(R.string.t_and_c_terms_con);
                webViewFragment.showBackButton = true;
                ((BaseActivity) context).placeFragmentWithBackStack(webViewFragment);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                ds.setColor(getResources().getColor(R.color.txt_blue));

                try {
                    final Method method = TextPaint.class.getMethod("setUnderlineText",
                            Integer.TYPE,
                            Float.TYPE);
                    method.invoke(ds, R.color.txt_blue, 1.0f);
                } catch (final Exception e) {
                    ds.setUnderlineText(true);
                }
            }
        }, tAndCString.indexOf(context.getString(R.string.t_and_c_terms).toLowerCase()), tAndCString.indexOf(context.getString(R.string.t_and_c_condition).toLowerCase()) + context.getString(R.string.t_and_c_condition).length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

//        WordtoSpan.setSpan(new ClickableSpan() {
//            @Override
//            public void onClick(View widget) {
//                String postfix = "?uiel=Mobile&lang=" + (GlobalConstant.language.equals(GlobalConstant.LANG_ZH) ? GlobalConstant.LANG_ZH : GlobalConstant.LANG_EN);
//                WebViewFragment webViewFragment = WebViewFragment.newInstance("http://www.parknshop.com/privacyPolicy" + postfix);
//                webViewFragment.title = context.getString(R.string.reg_terms_privacy_policy);
//                webViewFragment.showBackButton = true;
//                ((BaseActivity) context).placeFragmentWithBackStack(webViewFragment);
//            }
//
//            @Override
//            public void updateDrawState(TextPaint ds) {
//                ds.setColor(getResources().getColor(R.color.txt_blue));
//
//                try {
//                    final Method method = TextPaint.class.getMethod("setUnderlineText",
//                            Integer.TYPE,
//                            Float.TYPE);
//                    method.invoke(ds, R.color.txt_blue, 1.0f);
//                } catch (final Exception e) {
//                    ds.setUnderlineText(true);
//                }
//            }
//        }, tAndCString.indexOf(context.getString(R.string.reg_privacy).toLowerCase()), tAndCString.indexOf(context.getString(R.string.reg_policy).toLowerCase()) + context.getString(R.string.reg_policy).length() , Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        contentTextView.setMovementMethod(LinkMovementMethod.getInstance());

        contentTextView.setText(WordtoSpan);
    }


    public void onEvent(EmptyJsonEvent emptyJsonEvent) {
        if( emptyJsonEvent.getSuccessCode() == this.hashCode()) {
            WebServiceModel.getInstance(context).requestGetCart(context, "");
            ((BaseActivity) context).showProgressDialog();
        }
    }

    public void onEvent(CartEvent cartEvent) {
        //WebServiceModel.getInstance(context).requestGetCart(context);
        //saveDeliveryAddressViaAddressData

        if( (cartEvent.getType().equals("saveDeliveryAddress") || cartEvent.getType().equals("saveDeliveryAddressViaAddressData") ) && cartEvent.getSuccessCode() == this.hashCode()) {
            WebServiceModel.getInstance(context).requestGetCart(context);
        } else {
            ((BaseActivity) context).hideProgressDialog();
        }
    }

    public void onEvent(CheckoutBoxEvent checkoutBoxEvent) {
        if(isExclusiveBoolean) {
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
        if(isSelected) {
            //icon.setColorFilter(Color.argb(255, 255, 255, 0)); // White Tint
            icon.clearColorFilter();
            icon.setImageDrawable(selected);
        } else {
            icon.setImageDrawable(un_selected);
        }
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
        contentTextView.setVisibility(View.VISIBLE);
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

    public void setAddressData(AddressData.AddressForm addressForm){
        this.addressForm = addressForm;
    }

    public AddressData getUpdateAddress(AddressData.AddressForm addressForm){
        AddressData addressData = new AddressData();
        AddressData.AddressForm addressFormCon = addressData.getAddressForm();

        addressFormCon.setRoom(addressForm.getRoom().toString());
        addressFormCon.setLine1(addressForm.getLine1().toString());
        addressFormCon.setFloor(addressForm.getFloor().toString());
        addressFormCon.setBlock(addressForm.getBlock().toString());
        addressFormCon.setLine3(addressForm.getLine3().toString());
        addressFormCon.setAlley(addressForm.getAlley().toString());
        addressFormCon.setLane(addressForm.getLane().toString());
        addressFormCon.setStreetName(addressForm.getStreetName().toString());
        addressFormCon.setStreetNumber(addressForm.getStreetNumber().toString());
        addressFormCon.setTown(addressForm.getDistrict().toString());
        addressFormCon.setDistrict(addressForm.getDistrict().toString());


        String titleCode;
        if(!TextUtils.isEmpty(addressForm.getTitle())){
            titleCode = addressForm.getTitleCode().toLowerCase();
        }else{
            titleCode = addressForm.getTitleCode().toLowerCase();
        }

        addressFormCon.setTitleCode(titleCode);
        addressFormCon.setFirstName(addressForm.getFirstName().toString());
        addressFormCon.setLastName(addressForm.getLastName().toString());
        addressFormCon.setEmail(addressForm.getEmail().toString());
        addressFormCon.setPhone(addressForm.getPhone().toString());
        addressFormCon.setMobile(addressForm.getMobilePhone().toString());
        addressFormCon.setShippingAddress(addressForm.getShippingAddress());
        addressFormCon.setBillingAddress(true);
        addressFormCon.setShippingAddress(false);
        addressFormCon.setAddressBookName(addressForm.getAddressBookName());
        addressFormCon.setCompanyName(addressForm.getCompanyName());
        addressFormCon.setLine2(addressForm.getLine2());

        addressData.setAddressForm(addressFormCon);

        return addressData;
    }

}
