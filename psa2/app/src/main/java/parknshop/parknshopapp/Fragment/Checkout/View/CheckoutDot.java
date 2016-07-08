package parknshop.parknshopapp.Fragment.Checkout.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import java.lang.reflect.Field;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 6/5/16.
 */
public class CheckoutDot extends LinearLayout {
    @Bind(R.id.number_image) ImageView numberImage;
    @Bind(R.id.left_connection_line) View leftConnectionLine;
    @Bind(R.id.right_connection_line) View rightConnectionLine;

    int dotType = -1;
    boolean dotTypeIsDimmed;
    boolean currentStep;
    Context context;
    boolean istick;

    String prefix;
    int totalSize;

    public CheckoutDot(Context context) {
        this(context, null);
    }

    public CheckoutDot(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutDot(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_panel_item, this);
        ButterKnife.bind(this);
        this.context = context;

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutDot);
        dotType = a.getInteger(R.styleable.CheckoutDot_checkout_dot_type, -1);
        dotTypeIsDimmed = a.getBoolean(R.styleable.CheckoutDot_checkout_dot_is_dimmed, false);

        init();
    }

    public void init() {
        if(dotType == -1)
            return;

        String drawablePath = ( (prefix == null || prefix.length() == 0) ? "checkout_step" : prefix) + (istick ? dotType + 1 : dotType) + (dotTypeIsDimmed ? "_dim" : "");

        try {
            Glide.with(context).load(getId(drawablePath, R.drawable.class)).into(numberImage);
        } catch (Exception e) {
            //Log.i("exception" , "exception" + e.getMessage());
        }

        if(dotType == 1)
            leftConnectionLine.setVisibility(View.INVISIBLE);
        else
            leftConnectionLine.setVisibility(View.VISIBLE);

       // Log.i("exception" , "exception " + dotType + " " + totalSize);


        if(dotType == totalSize)
            rightConnectionLine.setVisibility(View.INVISIBLE);
        else
            rightConnectionLine.setVisibility(View.VISIBLE);


        if(dotTypeIsDimmed) {
            leftConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.tran_primary));
            rightConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.tran_primary));
        } else {
            leftConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.white));

            if(!currentStep)
                rightConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.white));
            else
                rightConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.tran_primary));
        }
    }

    public void setCurrentStep(boolean currentStep) {
        this.currentStep = currentStep;
        init();
    }

    public void setIsDimmed(boolean dotTypeIsDimmed) {
        this.dotTypeIsDimmed = dotTypeIsDimmed;
        init();
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
        init();
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
        init();
    }

    public void setTick(boolean tick) {
        this.istick = tick;
        init();
    }

    public int getId(String resourceName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(resourceName);
            return idField.getInt(idField);
        } catch (Exception e) {
            //Log.i("","No resource ID found for: ");
        }
        return 0;
    }
}