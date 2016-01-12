package com.fmtech.empf.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
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

public class CommonToolBar extends RelativeLayout {

    public CommonToolBar(Context context) {
        super(context);
    }

    public CommonToolBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CommonToolBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

    }

    public void disableBackButton(){

    }

    public void setToolbarTitle(String title){

    }


}
