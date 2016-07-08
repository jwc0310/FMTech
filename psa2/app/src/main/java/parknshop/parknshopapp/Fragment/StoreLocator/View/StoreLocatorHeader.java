package parknshop.parknshopapp.Fragment.StoreLocator.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 29/4/16.
 */
public class StoreLocatorHeader extends LinearLayout {
    @Bind(R.id.title) TextView titleTextView;
    @Bind(R.id.sub_title) TextView subTitleTextView;
    Runnable subTitleRunnable;

    public StoreLocatorHeader(Context context) {
        this(context, null);
    }

    public StoreLocatorHeader(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StoreLocatorHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.store_locator_layout, this);
        ButterKnife.bind(this);


        TypedArray a =context.obtainStyledAttributes(attrs, R.styleable.StoreLocatorHeader);
        CharSequence titleString = a.getString(R.styleable.StoreLocatorHeader_store_locator_header_title);
        CharSequence subTitleString = a.getString(R.styleable.StoreLocatorHeader_store_locator_header_sub_title);

        titleTextView.setText(titleString);
        subTitleTextView.setText(subTitleString);
    }

    public void setSubTitleRunnable(Runnable subTitleRunnable) {
        this.subTitleRunnable = subTitleRunnable;
    }

    @OnClick(R.id.sub_title)
    public void subTitleOnClick() {
        if(subTitleRunnable != null)
            subTitleRunnable.run();
    }

}
