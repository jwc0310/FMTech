package parknshop.parknshopapp.View.old_stuff;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.lang.reflect.Field;

import butterknife.Bind;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 5/4/16.
 */
public class CheckoutDot extends LinearLayout {

    LinearLayout view;
    @Bind(R.id.number_image) ImageView numberImage;
    @Bind(R.id.description_text) TextView placeHolderText;
    @Bind(R.id.left_connection_line) View leftConnectionLine;
    @Bind(R.id.right_connection_line) View rightConnectionLine;

    int number;
    boolean done;
    boolean current;
    Context context;

    public CheckoutDot(Context context) {
        this(context, null);
    }

    public CheckoutDot(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutDot(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.registration_panel_item, this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutDot);
        int number = a.getInteger(R.styleable.CheckoutDot_checkout_dot_number, 1);
        int status = a.getInteger(R.styleable.CheckoutDot_checkout_dot_status, 1);

        this.number = number;
        this.done = (status != 1) ? false : true;
        this.current = (status == 2) ? true : false;
        this.context = context;
    }

    //status
    //0 - not finished
    //1 - finish
    //2 - current

    /*
    public CheckOutDotViewHolder(LinearLayout view, int number, int status , Context context) {
        this.view = view;
        ButterKnife.bind(this, view);

        this.number = number;
        this.done = (status != 1) ? false : true;
        this.current = (status == 2) ? true : false;
        this.context = context;

        init();
    }*/

    public void init() {
        String[] tempString = context.getResources().getStringArray(R.array.check_out_dot_string);

        String drawablePath = "checkout_" + (!done ? (current ? "blue_" : "white_") + "number" + number : "current_step");

        if(number == 1)
            leftConnectionLine.setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
        else {
            if (done || current)
                leftConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
            else
                leftConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.tran_grey));
        }

        if(done)
            rightConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        else
            rightConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.tran_grey));

        placeHolderText.setText(tempString[number - 1]);

        Glide.with(context).load(getId(drawablePath, R.drawable.class)).into(numberImage);
    }


    public int getId(String resourceName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(resourceName);
            return idField.getInt(idField);
        } catch (Exception e) {
            throw new RuntimeException("No resource ID found for: "
                    + resourceName + " / " + c, e);
        }
    }
}
