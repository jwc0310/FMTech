package com.mpfa.empf.ui.component;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * ==================================================================
 * Copyright (C) 2016 Mtelnet All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/1/12 17:03
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2016/1/12 17:03  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class CommonTitleBar extends RelativeLayout {

    private TextView mTitle;

    public CommonTitleBar(Context context) {
        super(context);
    }

    public CommonTitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CommonTitleBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mTitle = (TextView)findViewById(com.mpfa.empf.R.id.common_titlebar_title);
    }

    public void disableBackButton(){

    }

    public void setToolbarTitle(String title){
        if(!TextUtils.isEmpty(title)){
            mTitle.setText(title);
        }
    }


}
