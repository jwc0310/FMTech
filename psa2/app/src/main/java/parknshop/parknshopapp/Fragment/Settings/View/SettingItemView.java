package parknshop.parknshopapp.Fragment.Settings.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 27/4/16.
 */
public class SettingItemView extends LinearLayout {
    @Bind(R.id.setting_item_root) View settingItemRoot;
    @Bind(R.id.setting_item_title) TextView settingItemTitleTextView;
    @Bind(R.id.setting_item_minor_title) TextView settingMinorTitleTextView;
    @Bind(R.id.setting_item_arrow) ImageView settingArrowImageView;
    boolean showArrow;
    String type;
    Context context;

    public SettingItemView(Context context) {
        this(context, null);
    }

    public SettingItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SettingItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;

        LayoutInflater.from(context).inflate(R.layout.setting_fragment_item, this);

        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SettingItemView);

        settingItemTitleTextView.setText(a.getString(R.styleable.SettingItemView_setting_item_title));
        settingMinorTitleTextView.setText(a.getString(R.styleable.SettingItemView_setting_item_minor_title));

        if(a.getString(R.styleable.SettingItemView_setting_item_type) != null)
            this.type = a.getString(R.styleable.SettingItemView_setting_item_type).toString();

        settingArrowImageView.setVisibility(a.getBoolean(R.styleable.SettingItemView_setting_item_show_arrow, true) ? View.VISIBLE : View.GONE);


        try {
            MyApplication.getInstance().register(this);
        }catch (Exception e) {
            //Log.i("null", "null pointer exeception found @ My Application");
        }
    }


    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MyApplication.getInstance().unRegister(this);
    }

    public void setTitle(String title) {
        settingItemTitleTextView.setText(title);
    }

    public void setMinorTitle(String minorTitle) {
        settingMinorTitleTextView.setText(minorTitle);
    }


    String[] stringArray;
    public void setDataArray(String[] array) {
        this.stringArray = array;
        if(stringArray != null)
            settingMinorTitleTextView.setText(stringArray[0]);
    }

//    @OnClick(R.id.setting_item_root)
//    public void itemRootOnClick() {
//        //context.getString(R.string.)
//
//        if(type == null)
//            type = settingItemTitleTextView.getText().toString();
//
//        if(type.equals(context.getString(R.string.setting_notifications))) {
//
//        }
//
//
//        if(type.equals(context.getString(R.string.setting_language))) {
//            StringPickerAdapter stringPickerAdapter = new StringPickerAdapter(context, stringArray, this.hashCode());
//            AlertDialog.Builder builder = new AlertDialog.Builder(context);
//            builder.setAdapter(stringPickerAdapter, stringPickerAdapter);
//            builder.show();
//        }
//
//
//        if(type.equals(context.getString(R.string.setting_terms_of_use))) {
//
//        }
//
//
//        if(type.equals(context.getString(R.string.setting_privacy_policy))) {
//
//        }
//
//
//        if(type.equals(context.getString(R.string.setting_license))) {
//
//        }
//
//
//        if(type.equals(context.getString(R.string.setting_disclaimer_and_notice))) {
//
//        }
//
//
//        if(type.equals(context.getString(R.string.setting_rate_in_app_store))) {
//
//        }
//
//        if(type.equals(context.getString(R.string.setting_version))) {
//
//        }
//    }


//
//    public void onEvent(StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent) {
//        if(stringPickerAdapterOnItemClickEvent.getSuccessCode() == this.hashCode()) {
//            String areaSelected = stringPickerAdapterOnItemClickEvent.getText();
//            setMinorTitle(areaSelected);
//        }
//    }
}
