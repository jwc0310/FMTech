package com.fmtech.softinput;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/17 17:22
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class ChineseInputFilter implements InputFilter{

    Pattern mPattern;

    public ChineseInputFilter() {
        mPattern = Pattern.compile("^[\u4e00-\u9fa5]*$");
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        String sourceText = source.toString();

        if (TextUtils.isEmpty(sourceText)) {
            return "";
        }

        Matcher matcher = mPattern.matcher(source);

        if (!matcher.matches()) {
            return "";
        }

        return dest.subSequence(dstart, dend) + sourceText;
    }
}
