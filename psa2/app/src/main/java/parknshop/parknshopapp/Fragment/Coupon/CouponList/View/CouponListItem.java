package parknshop.parknshopapp.Fragment.Coupon.CouponList.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 22/4/16.
 */
public class CouponListItem extends RelativeLayout {
    @Bind (R.id.imgIcon)
    ImageView imgIcon;
    @Bind (R.id.title)
    TextView title;
    @Bind (R.id.txtValidUntil)
    TextView txtValidUntil;
    @Bind (R.id.txtDesc)
    TextView txtDesc;
    Context context;

    public CouponListItem(Context context) {
        this(context, null);
    }

    public CouponListItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CouponListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.coupon_layout_item, this);
        ButterKnife.bind(this);
        this.context = context;
    }

    public void setBackground(String url) {
        Glide.with(context).load(url).into(imgIcon);
    }

    public void setTitle(String titleString) {
        title.setText(titleString);
    }

    public void setTxtDesc(String desc) {
        txtDesc.setText(desc);
    }

    public void setTxtValidUntil(String validUntil) {
        txtValidUntil.setText(validUntil);
    }
}
