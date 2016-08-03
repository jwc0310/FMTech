package com.fmtech.softinput;

import android.text.LoginFilter;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/8/2 20:54
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class EnglishInputFilterNew extends LoginFilter.UsernameFilterGeneric {
    private  String mAllowedInput;

    public EnglishInputFilterNew(){
        super(false);
    }

    public EnglishInputFilterNew(String allowedInput){
        super(false);
        mAllowedInput = allowedInput;
    }
    @Override
    public boolean isAllowed(char c) {
        return Character.isLetter(c) || c == ' ';
//       boolean allinput = mAllowedInput.indexOf(c) != -1;
//        if(allinput){
//            return true;
//        }
//        return false;
    }
}
