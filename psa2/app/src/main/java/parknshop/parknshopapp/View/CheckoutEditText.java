package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by hp on 5/4/2016.
 */
public class CheckoutEditText extends LinearLayout {
    public @Bind(R.id.picker_name) EditText title;
    @Bind(R.id.picker_image_btn) ImageView icon;

    public CheckoutEditText(Context context) {
        this(context, null);
    }

    public CheckoutEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_edittext_layout, this);

        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutEditText);
        CharSequence titleString = a.getString(R.styleable.CheckoutEditText_checkout_edittext_title);
        CharSequence type = a.getString(R.styleable.CheckoutEditText_checkout_edittext_type);
        Drawable drawable = a.getDrawable(R.styleable.CheckoutEditText_checkout_edittext_drawable);

        if(type != null && type.equals("number")) {
            title.setInputType(InputType.TYPE_CLASS_PHONE);
        } else {
            title.setInputType(InputType.TYPE_CLASS_TEXT);
        }

        setHint(titleString != null ? titleString.toString() : "");
        setIcon(drawable);
    }

    public void setHint(String titlestring) {
        title.setHint(titlestring);
    }

    public void setIcon(Drawable drawable) {
        icon.setImageDrawable(drawable);
    }

    public Editable getText() {
        return title.getText();
    }

    public void setText(String data) {
        title.setText(data);
    }
}
