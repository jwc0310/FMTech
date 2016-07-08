package parknshop.parknshopapp.Fragment.MemberZone.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 11/4/16.
 */
public class MemberZoneIconTitle extends LinearLayout {
    @Bind(R.id.icon) ImageView icon;
    @Bind(R.id.title) TextView title;

    Drawable drawable;
    String titleString;

    public MemberZoneIconTitle(Context context) {
        this(context, null);
    }

    public MemberZoneIconTitle(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MemberZoneIconTitle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.member_zone_icon_title, this);


        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MemberZoneIconTitle);
        drawable = a.getDrawable(R.styleable.MemberZoneIconTitle_member_zone_drawable);
        titleString = a.getString(R.styleable.MemberZoneIconTitle_member_zone_title);

        ButterKnife.bind(this);

        if(drawable != null)
            icon.setImageDrawable(drawable);
        title.setText(titleString);
    }

    public void setTitle(String strTitle){
        title.setText(strTitle);
    }
}
