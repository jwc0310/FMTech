package parknshop.parknshopapp.View;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import java.util.Map;
import java.util.TreeMap;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 16/4/2.
 */
public class CheckoutHeaderItemGroup extends CheckoutHeader {
    Map<String, String> stringMap = new TreeMap<String, String>();
    Context context;
    public @Nullable @Bind(R.id.edit) TextView editTextView;

    public CheckoutHeaderItemGroup(Context context) {
        this(context, null);
    }

    public CheckoutHeaderItemGroup(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutHeaderItemGroup(final Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        ButterKnife.bind(this);


        this.findViewById(R.id.edit).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                stringMap.clear();
                for(int i = 0 ; i < CheckoutHeaderItemGroup.this.getChildCount(); i ++) {
                    if(CheckoutHeaderItemGroup.this.getChildAt(i) instanceof CheckoutItem) {
                        CheckoutItem checkoutItem = ((CheckoutItem)CheckoutHeaderItemGroup.this.getChildAt(i));
                        stringMap.put(checkoutItem.header.getText().toString(), checkoutItem.item.getText().toString());
                    }
                }

                //FragmentTransaction ft = ((AppCompatActivity)context).getSupportFragmentManager().beginTransaction();
                //CheckoutEditDailogFragment newFragment = new CheckoutEditDailogFragment();
                //newFragment.stringMap = stringMap;
                //newFragment.show(ft, "dialog");
            }
        });

        editTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseActivity ba = ((BaseActivity)context);
                //Log.i("yoyoyoyyo", "yoyoyoyoyoyoy" + CheckoutHeaderItemGroup.this.getId());

                if(CheckoutHeaderItemGroup.this.getId() == R.id.your_detail_header) {
                    //CheckoutYourDetailFragment cydf = new CheckoutYourDetailFragment();
                    //cydf.goBackToConfirmation = true;
                    //ba.placeFragmentWithBackStack(cydf);
                }

                if(CheckoutHeaderItemGroup.this.getId() == R.id.delivery_details) {
                    //CheckoutDeliveryMethodFragment cdmf = new CheckoutDeliveryMethodFragment();
                    //cdmf.goBackToConfirmation = true;
                    //ba.placeFragmentWithBackStack(cdmf);
                    ba.onBackPressed();
                    ba.onBackPressed();
                    ba.onBackPressed();
                    Hawk.put("goToConfirmation", true);
                }

                if(CheckoutHeaderItemGroup.this.getId() == R.id.ecoupon_evoucher) {
                    //CheckoutCouponFragment ckcf = new CheckoutCouponFragment();
                    //ckcf.goBackToConfirmation = true;
                    //ba.placeFragmentWithBackStack(ckcf);

                    ba.onBackPressed();
                }

                if(CheckoutHeaderItemGroup.this.getId() == R.id.payment_method) {
                    //CheckoutPaymentFragment cpf = new CheckoutPaymentFragment();
                   // cpf.goBackToConfirmation = true;
                   // ba.placeFragmentWithBackStack(cpf);
                    ba.onBackPressed();
                }

                if(CheckoutHeaderItemGroup.this.getId() == R.id.delivery_time_group) {
                    //DeliveryTimeslotFragment deliveryTimeslotFragment = new DeliveryTimeslotFragment();
                    //deliveryTimeslotFragment.goBackToConfirmation = true;
                   // ba.placeFragmentWithBackStack(deliveryTimeslotFragment);

                    ba.onBackPressed();
                    ba.onBackPressed();
                    Hawk.put("goToConfirmation", true);
                }
            }
        });
    }

    @Override
    public void inflateLayout(Context context) {
        LayoutInflater.from(context).inflate(R.layout.checkout_header_item_group, this);
    }
    /*
    @OnClick (R.id.your_detail_header)
    public void goToEditDetail() {
        getBaseActivity().placeFragmentWithBackStack(new CheckoutYourDetailFragment());
    }

    @OnClick (R.id.delivery_details)
    public void goToditDeliveryDetail() {
        getBaseActivity().placeFragmentWithBackStack(new CheckoutDeliveryMethodFragment());
    }

    @OnClick (R.id.ecoupon_evoucher)
    public void goToEditCoupon() {
        getBaseActivity().placeFragmentWithBackStack(new CheckoutCouponFragment());
    }

    @OnClick (R.id.payment_method)
    public void goToEditPayment() {
        getBaseActivity().placeFragmentWithBackStack(new CheckoutPaymentFragment());
    }*/
}
