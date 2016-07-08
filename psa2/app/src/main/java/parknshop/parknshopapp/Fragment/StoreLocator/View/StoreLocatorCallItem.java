package parknshop.parknshopapp.Fragment.StoreLocator.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Dialog.SimpleConfirmDialogFragment;
import parknshop.parknshopapp.Fragment.MemberZone.View.MemberZoneButton;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 28/4/16.
 */
public class StoreLocatorCallItem extends LinearLayout {
    public @Bind(R.id.store_locator_call_icon)ImageView iconImageView;
    public @Bind(R.id.store_locator_call_title) TextView titleTextView;
    public @Bind(R.id.store_locator_call_button_title) MemberZoneButton button;
    public @Bind(R.id.store_locator_call_minor_title) TextView titleMinorTextView;

    String itemTitle;
    String minorTitle;
    String buttonTitle;
    Drawable imageDrawable;
    Context context;
    int rid;

    public StoreLocatorCallItem(Context context) {
        this(context, null);
    }

    public StoreLocatorCallItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StoreLocatorCallItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.store_locator_call_item, this);
        this.context = context;
        ButterKnife.bind(this);


        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.StoreLocatorCallItem);
        itemTitle = a.getString(R.styleable.StoreLocatorCallItem_store_locator_call_item_title);
        minorTitle = a.getString(R.styleable.StoreLocatorCallItem_store_locator_call_minor_title);
        rid = a.getInt(R.styleable.StoreLocatorCallItem_store_locator_call_item_image, 0);
        buttonTitle = a.getString(R.styleable.StoreLocatorCallItem_store_title);

        //iconImageView.setImageDrawable(imageDrawable);
        setImageDrawable(rid);
        setImageVisible();

        titleTextView.setText(itemTitle);

       // Log.i("buttonTitle", "buttonTitle" + buttonTitle);
       // if((buttonTitle != null && buttonTitle.length() > 0)) {
        button.setText(buttonTitle);
        button.setVisibility(View.VISIBLE);
         //   titleMinorTextView.setVisibility(View.GONE);
      //  } else {
         //   button.setVisibility(View.GONE);
         //   titleMinorTextView.setVisibility(View.VISIBLE);
        titleMinorTextView.setText(minorTitle);
       /// }
    }

    public void setImageVisible() {
        if(rid > 0) {
            iconImageView.setVisibility(View.VISIBLE);
        } else {
            iconImageView.setVisibility(View.GONE);
        }
    }

    public void setMajorTitle(String itemTitle) {
        titleTextView.setText(itemTitle);
        titleTextView.setVisibility(View.VISIBLE);
        setImageVisible();
    }

    public void setButtonTitle(String itemTitle) {
        button.setText(itemTitle);
        button.setVisibility(View.VISIBLE);
        titleMinorTextView.setVisibility(View.GONE);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleConfirmDialogFragment simpleConfirmDialogFragment = new SimpleConfirmDialogFragment();
                simpleConfirmDialogFragment.number = titleTextView.getText().toString();
                simpleConfirmDialogFragment.message = getResources().getString(R.string.store_lcaotor_call).replace("%s", titleTextView.getText().toString());

                simpleConfirmDialogFragment. show( ((BaseActivity)context).getSupportFragmentManager(), "");
            }
        });
        setImageVisible();
    }

    public void setMinorTitle(String itemTitle) {
        button.setVisibility(View.GONE);
        titleMinorTextView.setVisibility(View.VISIBLE);
        titleMinorTextView.setText(itemTitle);
        setImageVisible();
    }

    public void setImageDrawable(int rid) {
        //if(rid > 0) {
        iconImageView.setImageResource(rid);
        Glide.with(context).load(rid).into(iconImageView);
        iconImageView.setVisibility(View.VISIBLE);
        //} else {
        //}
    }

    public void setGone() {
        this.setVisibility(View.GONE);
        iconImageView.setVisibility(View.GONE);
        titleTextView.setVisibility(View.GONE);
        button.setVisibility(View.GONE);
        titleMinorTextView.setVisibility(View.GONE);
    }
}
