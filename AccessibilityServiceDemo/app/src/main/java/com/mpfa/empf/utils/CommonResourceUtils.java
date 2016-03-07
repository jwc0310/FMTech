package com.mpfa.empf.utils;

import com.mpfa.empf.FMApplication;

/**
 * ==================================================================
 * Copyright (C) 2016 Mtelnet All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/1/5 14:25
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2016/1/5 14:25  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class CommonResourceUtils {

    public static String getString(int resId){
        return FMApplication.getApplication().getResources().getString(resId);
    }
}
