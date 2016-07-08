package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.EventUpdate.LoadingButtonProgressDialogDismissEvent;
import parknshop.parknshopapp.EventUpdate.LoadingButtonProgressDialogShowEvent;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 15/6/16.
 */
public class LoadingButton extends LinearLayout {

    @Nullable
    @Bind(R.id.rlBtn)
    RelativeLayout rlBtn;
    @Nullable @Bind(R.id.pbLoading)
    ProgressBar pbLoading;
    @Nullable
    @Bind(R.id.txtBtn)
    TextView txtBtn;

    public LoadingButton(Context context) {
        this(context, null);
    }

    public LoadingButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadingButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        MyApplication.getInstance().register(this);

        inflateLayout(context);

        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.LoadingButton);
        CharSequence ab = a.getString(R.styleable.LoadingButton_btn_text);
        Drawable bgColor = a.getDrawable(R.styleable.LoadingButton_btn_background);

        txtBtn.setText(ab);
        rlBtn.setBackgroundDrawable(bgColor);
    }

    public void setText(String str) {
        txtBtn.setText(str);
    }

    public void setTextColor(int color) {
        txtBtn.setTextColor(color);
    }

    public void inflateLayout(Context context) {
        LayoutInflater.from(context).inflate(R.layout.loading_button, this);
    }

    public void onEvent(LoadingButtonProgressDialogShowEvent loadingButtonProgressDialogShowEvent){
        pbLoading.setVisibility(VISIBLE);
        txtBtn.setTextColor(getResources().getColor(R.color.txt_grey));
    }

    public void onEvent(LoadingButtonProgressDialogDismissEvent loadingButtonProgressDialogDismissEvent){
        pbLoading.setVisibility(GONE);
        txtBtn.setTextColor(getResources().getColor(R.color.white));
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MyApplication.getInstance().unRegister(this);
    }
}
