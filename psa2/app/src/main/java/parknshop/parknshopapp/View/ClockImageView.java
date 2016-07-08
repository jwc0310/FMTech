package parknshop.parknshopapp.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 27/6/16.
 */
public class ClockImageView extends RelativeLayout {
    Context context;
    @Bind(R.id.clock_circle) ImageView clock_circle;
    @Bind(R.id.clock_arrow) ImageView clock_arrow;
    @Bind(R.id.clock_small_arrow) ImageView clock_small_arrow;

    public ClockImageView(Context context) {
        this(context, null);
    }

    public ClockImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ClockImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        inflateLayout(context);

        ButterKnife.bind(this);

        // Create an animation instance
        Animation an = AnimationUtils.loadAnimation(context, R.anim.clockwise_animation);//new RotateAnimation(0.0f, 360.0f, Utils.dpToPx(25, context), Utils.dpToPx(25, context));

        // Set the animation's parameters
        an.setDuration(5000);               // duration in ms
        an.setRepeatCount(0);                // -1 = infinite repeated
        an.setRepeatCount(Animation.INFINITE); // reverses each repeat
        an.setFillAfter(true);               // keep rotation after animation

        // Aply animation to image view
        clock_arrow.setAnimation(an);


        Animation an2 = AnimationUtils.loadAnimation(context, R.anim.clockwise_animation);//new RotateAnimation(0.0f, 360.0f, Utils.dpToPx(25, context), Utils.dpToPx(25, context));

        // Set the animation's parameters
        an2.setDuration(60000);               // duration in ms
        an2.setRepeatCount(0);                // -1 = infinite repeated
        an2.setRepeatCount(Animation.INFINITE); // reverses each repeat
        an2.setFillAfter(true);               // keep rotation after animation

        clock_small_arrow.setAnimation(an2);
    }


    public void inflateLayout(Context context) {
        LayoutInflater.from(context).inflate(R.layout.clock_image_view, this);
    }
}
