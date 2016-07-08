package parknshop.parknshopapp.View;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by kwongyuenpan on 8/6/16.
 */
public class FixedFontStyleEditText extends EditText {
    public FixedFontStyleEditText(Context context) {
        super(context);
        setTypeface(Typeface.SANS_SERIF);
        setTransformationMethod(new PasswordTransformationMethod());
    }

    public FixedFontStyleEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public FixedFontStyleEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public FixedFontStyleEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
