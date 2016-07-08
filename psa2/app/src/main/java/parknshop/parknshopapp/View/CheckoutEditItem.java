package parknshop.parknshopapp.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 16/4/2.
 */
public class CheckoutEditItem extends LinearLayout {
    @Bind(R.id.title) TextView title;
    @Bind(R.id.content) EditText content;

    public CheckoutEditItem(Context context) {
        this(context, null);
    }

    public CheckoutEditItem(Context context, String titleString, String contentString) {
        this(context, null);
        setTitle(titleString);
        setContent(contentString);
    }

    public CheckoutEditItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutEditItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_dialogfragment_edit_item, this);
        ButterKnife.bind(this);
    }

    public void setTitle(String titleString) {
        title.setText(titleString);
    }

    public void setContent(String contentString) {
        content.setText(contentString);
    }
}
