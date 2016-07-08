package parknshop.parknshopapp.Fragment.MemberZone.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.View.PureCircleImageView;

/**
 * Created by Gigi Wong on 2016年04月19日.
 */
public class MemberZoneProfileView extends LinearLayout {

    @Bind(R.id.circle_image_view)
    PureCircleImageView icon;
    @Bind(R.id.btn_take_photo)
    ImageButton btn_take_photo;
    @Bind(R.id.tv_name)
    TextView name;

    public MemberZoneProfileView(Context context) {
        this(context, null);
    }

    public MemberZoneProfileView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MemberZoneProfileView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        inflateLayout(context);

        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutItem);
        CharSequence title = a.getString(R.styleable.CheckoutItem_header);
        Drawable drawable = a.getDrawable(R.styleable.CheckoutItem_drawable);

        name.setText(title);
        setIcon(drawable);
    }

    public void setName(String title){
        name.setText(title);
    }

    public void setIcon(Drawable drawable){
        if(drawable != null){
            icon.setImageDrawable(drawable);
            icon.setBorderWidth(0);
        }
    }

    public PureCircleImageView getIconView() {
        return icon;
    }

    public ImageButton getBtnTakePhoto() {
        return btn_take_photo;
    }

    public void setIcon(Bitmap bitmap) {
       icon.setImageBitmap(bitmap);
    }

    public void inflateLayout(Context context) {
        LayoutInflater.from(context).inflate(R.layout.member_zone_profile_header, this);
    }
}
