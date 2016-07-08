package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 5/4/16.
 */
public class CheckoutReminder extends LinearLayout {
    public @Bind(R.id.sub_title) TextView subTitle;
    @Bind(R.id.child_linear_layout) LinearLayout childLinearLayout;
    Context context;

    public CheckoutReminder(Context context) {
        this(context, null);
    }

    public CheckoutReminder(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckoutReminder(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.checkout_reminder_layout, this);
        ButterKnife.bind(this);
        this.context = context;

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CheckoutReminder);
        CharSequence titleString = a.getString(R.styleable.CheckoutReminder_checkout_remeinder_type);

        subTitle.setText(String.format(subTitle.getText().toString(), titleString));
    }

    public LinearLayout getChildLinearLayout() {
        return childLinearLayout;
    }

    public void addProductChildIfNeeded(List<CartResponse.Entry> cartEntry) {
        //if(childLinearLayout != null && childLinearLayout.getChildCount() == 0) {

        try {
            childLinearLayout.removeAllViews();
            for (int i = 0; i < cartEntry.size(); i++) {
                ShoppingCartProductItem shoppingCartProductItem = new ShoppingCartProductItem(context);
                shoppingCartProductItem.setEntry(cartEntry.get(i));
                //Log.i("product1234", "product1234" + cartEntry.get(i).product.getName());
                childLinearLayout.addView(shoppingCartProductItem);
            }
        } catch (Exception e) {
            //Log.i("product1234", "product1234" + e.getMessage());

        }
        //}
    }
}
