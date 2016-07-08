package parknshop.parknshopapp.Fragment.MemberZone.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 16/4/2.
 */
public class MemberZoneHeader extends LinearLayout {
    @Bind(R.id.title) TextView tv;

    public MemberZoneHeader(Context context) {
        this(context, null);
    }

    public MemberZoneHeader(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MemberZoneHeader(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        inflateLayout(context);

        ButterKnife.bind(this);

        TypedArray a =context.obtainStyledAttributes(attrs, R.styleable.CheckoutHeader);
        CharSequence ab = a.getString(R.styleable.CheckoutHeader_text);

        tv.setText(ab);
    }

    public void inflateLayout(Context context) {
        LayoutInflater.from(context).inflate(R.layout.member_zone_header, this);
    }
}
