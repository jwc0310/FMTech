package parknshop.parknshopapp.View;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.lang.reflect.Field;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 31/3/16.
 */
public class RegistrationDotViewHolder {
    LinearLayout view;
    @Bind(R.id.number_image) ImageView numberImage;
    @Bind(R.id.description_text) TextView placeHolderText;
    @Bind(R.id.left_connection_line) View leftConnectionLine;
    @Bind(R.id.right_connection_line) View rightConnectionLine;

    int number;
    boolean done;
    boolean current;
    Context context;

    //status
    //0 - not finished
    //1 - finish
    //2 - current

    public RegistrationDotViewHolder(LinearLayout view, int number, int status , Context context, int type) {
        this.view = view;
        ButterKnife.bind(this, view);

        this.number = number;
        this.done = (status != 1) ? false : true;
        this.current = (status == 2) ? true : false;
        this.context = context;

        init(type);
    }

    //checkout_blue_number1
    //checkout_white_number1
    //check_out_current_step

    // type = 0 == Register
    // type = 1 == Checkout

    public void init(int type) {
        String[] tempString;

        if (type == 0) {
            tempString = context.getResources().getStringArray(R.array.register_dot_string);
        } else {
            tempString = context.getResources().getStringArray(R.array.check_out_dot_string);
        }

        String drawablePath = "checkout_" + (!done ? (current ? "blue_" : "white_") + "number" + number : "current_step");
        if(number == 1)
            leftConnectionLine.setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
        else {
            if (done || current) {
                placeHolderText.setTextColor(context.getResources().getColor(R.color.white));
                leftConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
            }else {
                placeHolderText.setTextColor(context.getResources().getColor(R.color.tran_grey));
                leftConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.tran_grey));
            }
        }

        if(done)
            rightConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        else
            rightConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.tran_grey));

        if (number == 3 && type == 0){
            rightConnectionLine.setBackgroundColor(context.getResources().getColor(R.color.transparent));
        }

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
