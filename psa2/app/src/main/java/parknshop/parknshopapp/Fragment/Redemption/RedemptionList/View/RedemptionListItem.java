package parknshop.parknshopapp.Fragment.Redemption.RedemptionList.View;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by hp on 22/4/2016.
 */
public class RedemptionListItem extends RelativeLayout {
    @Bind(R.id.background) ImageView background;
    public @Bind(R.id.rounded_background) View roundedBackground;
    @Bind (R.id.title) TextView title;
    @Bind (R.id.valid_thru_) TextView valid_thru_;
    Context context;

    public RedemptionListItem(Context context) {
        this(context, null);
    }

    public RedemptionListItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RedemptionListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.redemption_layout_item, this);
        ButterKnife.bind(this);


        roundedBackground.setBackgroundResource(R.drawable.tags_rounded_corners);

        GradientDrawable drawable = (GradientDrawable) roundedBackground.getBackground();

        drawable.setColor(getResources().getColor(R.color.black));
//        roundedBackground.setLayoutParams(new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, ((Utils.getScreenWidth(context) - Utils.dpToPx(40, context))  / 1140 * 520) + Utils.dpToPxHeight(10, context) ));

        this.context = context;
    }

    public void setBackground(String url) {
        Glide.with(context).load(url).into(background);
    }

    public void setColorCode(String colorCodeC) {
        if(colorCodeC == null)
            return;

        GradientDrawable drawable = (GradientDrawable) roundedBackground.getBackground();


        try {
            String colorCode = (colorCodeC.substring(0, 1).equals("#") ? "" : "#") + colorCodeC;

            if(colorCode != null && colorCode.length() > 0)
                drawable.setColor(Color.parseColor(colorCode));

        } catch (Exception e) {
            //Log.i("failure", "failure @ color parsing" + e.getMessage());
        }
    }

    public void setTitle(String titleString) {
        title.setText(titleString);
    }

    public void setValidThru(String validString) {
        valid_thru_.setText(validString);
    }
}
