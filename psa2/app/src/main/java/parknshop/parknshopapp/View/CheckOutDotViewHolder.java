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
public class CheckOutDotViewHolder {
    LinearLayout view;
    @Bind(R.id.number_image) ImageView numberImage;
    @Bind(R.id.description_text) TextView placeHolderText;
    @Bind(R.id.left_connection_line) View leftConnectionLine;
    @Bind(R.id.right_connection_line) View rightConnectionLine;

    int number;
    boolean done;
    boolean current;
    Context context;
    String[] tempString ;
    //status
    //0 - not finished
    //1 - finish
    //2 - current

    public CheckOutDotViewHolder(LinearLayout view, int number, int status , Context context) {
        this.view = view;
        ButterKnife.bind(this, view);

        this.number = number;
        this.done = (status != 1) ? false : true;
        this.current = (status == 2) ? true : false;
        this.context = context;

        tempString= context.getResources().getStringArray(R.array.check_out_dot_string);

        init();
    }

    public CheckOutDotViewHolder(LinearLayout view, int number, int status , String text, Context context) {
        this.view = view;
        ButterKnife.bind(this, view);

        this.number = number;
        this.done = (status != 1) ? false : true;
        this.current = (status == 2) ? true : false;
        this.context = context;

        tempString= context.getResources().getStringArray(R.array.check_out_dot_string);

        init();

        placeHolderText.setText(text);

    }

    public CheckOutDotViewHolder(LinearLayout view, int number, int status , Context context,boolean isWatson) {
        this.view = view;
        ButterKnife.bind(this, view);

        this.number = number;
        this.done = (status != 1) ? false : true;
        this.current = (status == 2) ? true : false;
        this.context = context;
        if(isWatson)
            tempString = context.getResources().getStringArray(R.array.watson_check_out_dot_string);

            init();
    }

    //checkout_blue_number1
    //checkout_white_number1
    //check_out_current_step
    public void init() {

//        String[] tempString = context.getResources().getStringArray(R.array.check_out_dot_string);

        String drawablePath;
        if(number < 9)
            drawablePath = "checkout_" + (!done ? (current ? "blue_" : "white_") + "number" + number : "current_step");
        else
            drawablePath = "checkout_" + (!done ? (current ? "blue_" : "white_") + "number" + String.valueOf(number-8) : "current_step");

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

//        if(this.number == 5){
//            rightConnectionLine.setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
//        }

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
