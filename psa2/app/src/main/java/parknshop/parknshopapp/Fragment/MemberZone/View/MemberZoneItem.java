package parknshop.parknshopapp.Fragment.MemberZone.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.View.CheckoutHeader;
import parknshop.parknshopapp.View.CheckoutItem;

/**
 * Created by hp on 19/4/2016.
 */
public class MemberZoneItem extends LinearLayout {
    public @Bind(R.id.header) TextView header;
    public @Bind(R.id.item)
    EditText item;
    public @Bind(R.id.image_drawable) ImageView icon;
    Context context;

    public MemberZoneItem(Context context) {
        this(context, null);
    }

    public MemberZoneItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MemberZoneItem(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;

        inflateLayout(context);

        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutItem);
        CharSequence title = a.getString(R.styleable.CheckoutItem_header);
        CharSequence content = a.getString(R.styleable.CheckoutItem_content);
        Drawable drawable = a.getDrawable(R.styleable.CheckoutItem_drawable);

        int textStyle = a.getInteger(R.styleable.CheckoutItem_textStyle, 0);

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

        item.setEnabled(false);
    }

    public void setItem(String itemText) {
//        if (itemText == null || itemText.length() == 0) {
//            setVisibility(View.GONE);
//        } else {
//            setVisibility(View.VISIBLE);
//            item.setText(itemText);
//        }
        item.setText(itemText);

        hideGroupIfNeeded();
    }


    public void setItemEnable(boolean enable) {
        item.setEnabled(enable);
    }

    public void hideGroupIfNeeded() {
        if (this.getParent() instanceof CheckoutHeader) {
            CheckoutHeader checkoutHeader = (CheckoutHeader) this.getParent();

            int checkoutItemCount = 0;
            int invisibiltyCount = 0;

            for (int i = 0; i < checkoutHeader.getChildCount(); i++) {
                if (checkoutHeader.getChildAt(i) instanceof CheckoutItem) {
                    checkoutItemCount++;
                    if (checkoutHeader.getChildAt(i).getVisibility() == View.GONE) {
                        invisibiltyCount++;
                    }
                }
            }
            if (checkoutItemCount == invisibiltyCount)
                checkoutHeader.setVisibility(View.GONE);
            else
                checkoutHeader.setVisibility(View.VISIBLE);
        }
    }

    public void setHeader(String headerText) {
        header.setText(headerText);
    }

    public void setLeftDrawable(int drawableId) {
        if (drawableId == 0) return;
        Drawable drawable = context.getResources().getDrawable(drawableId);
        icon.setVisibility(View.VISIBLE);
        icon.setImageDrawable(drawable);
    }

    public void inflateLayout(Context context) {
        LayoutInflater.from(context).inflate(R.layout.member_zone_item, this);
    }
}