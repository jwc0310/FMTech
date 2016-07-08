package parknshop.parknshopapp.Utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class ToastUtils {

    public static void show(Context context, String msg){
        if(TextUtils.isEmpty(msg))
            return;
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
