package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Model.AddressData;
import parknshop.parknshopapp.R;

/**
 * Created by hp on 4/4/2016.
 */
public class CheckoutAddress extends LinearLayout {
    public @Bind(R.id.checkbox) CheckoutCheckBoxWithText checkboxView;
    public @Bind(R.id.address_view_title) TextView title;
    public @Bind(R.id.address_view_recevier_address) TextView recevierAddress;
    public @Bind(R.id.address_view_recevier_name) TextView recevierName;

    public boolean isBillingAddress;
    public boolean enableCheckboxView;
    public AddressData.AddressForm addressForm;

    Context context;
    //string/delivery_address_placeholder

    public CheckoutAddress(Context context) {
        this(context, null);
    }

    public CheckoutAddress(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutAddress(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_address_layout, this);
        ButterKnife.bind(this);

        this.context = context;

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutAddress);

        CharSequence titleString = a.getString(R.styleable.CheckoutAddress_checkout_address_receiver_title);
        CharSequence addressString = a.getString(R.styleable.CheckoutAddress_checkout_address_receiver_address);
        CharSequence nameAddress = a.getString(R.styleable.CheckoutAddress_checkout_address_receiver_name);
        CharSequence checkboxString = a.getString(R.styleable.CheckoutAddress_checkout_address_checkbox_title);//.length() > 0 ? a.getString(R.styleable.CheckoutAddress_checkout_address_checkbox_title) : context.getString(R.string.delivery_address_placeholder);
        enableCheckboxView = a.getBoolean(R.styleable.CheckoutAddress_checkout_address_checkbox_is_enable, false);
        //checkout_address_checkbox_is_enable

        if(titleString != null && titleString.length() > 0) {
            title.setText(titleString);
            title.setVisibility(View.VISIBLE);
        } else {
            title.setVisibility(View.GONE);
        }

        recevierAddress.setText(addressString);
        recevierName.setText(nameAddress);
        checkboxView.contentTextView.setText(checkboxString);

        if(enableCheckboxView) {
            checkboxView.setVisibility(View.VISIBLE);
        } else {
            checkboxView.setVisibility(View.GONE);
        }
    }

    public void handleTitle(String titleString) {
        if(titleString != null && titleString.length() > 0 && !titleString.equals("null")) {
            title.setText(titleString);
            title.setVisibility(View.VISIBLE);
        } else {
            title.setVisibility(View.GONE);
        }
    }

    public static CheckoutAddress build(Context context, AddressData.AddressForm addressForm) {
        CheckoutAddress checkoutAddress = new CheckoutAddress(context);
        checkoutAddress.addressForm = addressForm;
        checkoutAddress.handleTitle("");
        //checkoutAddress.title.setText(context.getString(R.string.delivery_address_placeholder));
        checkoutAddress.recevierName.setText(addressForm.generateTitle());
        checkoutAddress.recevierAddress.setText(addressForm.generateAddress(context));
        checkoutAddress.enableCheckboxView = true;
        //checkoutAddress.checkboxView.contentTextView.setText(context.getString(R.string.use_as_delivery_address));
        checkoutAddress.checkboxView.setDataId(addressForm.getId());
        checkoutAddress.checkboxView.setVisibility(View.VISIBLE);
        return checkoutAddress;
    }

    public static CheckoutAddress build(Context context, String titlePlaceHolder, AddressData.AddressForm addressForm) {
        CheckoutAddress checkoutAddress = build(context, addressForm);

        checkoutAddress.title.setText(titlePlaceHolder);
        checkoutAddress.title.setVisibility(View.VISIBLE);
        return checkoutAddress;
    }

    public void setBillingAddress() {
        if(addressForm != null) {
            if(addressForm.getBillingAddress()) {
                checkboxView.setSelected(true);
            }
        }
    }

    public void setShippingAddress() {
        if(addressForm != null) {
            if(addressForm.getShippingAddress()) {
                checkboxView.setSelected(true);
            }
        }
    }

    public void setOrderAddress(AddressData.AddressForm address) {
        recevierName.setText(address.generateTitle());
        recevierAddress.setText(address.generateHomeAddress());
    }

    public void setAddress(AddressData.AddressForm address) {
        recevierName.setText(address.generateTitle());
        recevierAddress.setText(address.generateAddress(context));
       // recevierName.setText(address.getLastName() + address.getFirstName());
       // public @Bind(R.id.address_view_title) TextView title;
        //public @Bind(R.id.address_view_recevier_address) TextView recevierAddress;
        //public @Bind(R.id.address_view_recevier_name) TextView recevierName;
    }

    public void setBillingAddress(boolean isBillingAddress) {
        checkboxView.isBillingAddress = isBillingAddress;
        addressForm.setBillingAddress(true);
        checkboxView.setAddressData(addressForm);
    }

    @OnClick(R.id.address_layout_root)
    public void addressLayoutRoot() {
        checkboxView.reverseCheckbox();
    }
}
