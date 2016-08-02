package com.fmtech.softinput;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
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
 * @create_date 2016/7/17 17:23
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class EnglishInputFilter implements InputFilter {

    Pattern mPattern;

    public EnglishInputFilter() {
//        mPattern = Pattern.compile("^[A-Za-z]*$");
        mPattern = Pattern.compile("^[A-Za-z\\s]*$");
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        String sourceText = source.toString();

        //======================Solution1
        /*if (TextUtils.isEmpty(sourceText)) {
            return "";
        }

        Matcher matcher = mPattern.matcher(source);

        if (!matcher.matches()) {
            return "";
        }

        return dest.subSequence(dstart, dend) + sourceText;*/

        //======================Solution2
//        if (source instanceof SpannableStringBuilder) {
//            SpannableStringBuilder sourceAsSpannableBuilder = (SpannableStringBuilder)source;
//            for (int i = end - 1; i >= start; i--) {
//                char currentChar = source.charAt(i);
//                if (!Character.isLetterOrDigit(currentChar) && !Character.isSpaceChar(currentChar)) {
//                    sourceAsSpannableBuilder.delete(i, i+1);
//                }
//            }
//            return source;
//        } else {
//            StringBuilder filteredStringBuilder = new StringBuilder();
//            for (int i = start; i < end; i++) {
//                char currentChar = source.charAt(i);
//                if (Character.isLetterOrDigit(currentChar) || Character.isSpaceChar(currentChar)) {
//                    filteredStringBuilder.append(currentChar);
//                }
//            }
//            return filteredStringBuilder.toString();
//        }

        //Solution3
        boolean keepOriginal = true;
        StringBuilder sb = new StringBuilder(end - start);
        for (int i = start; i < end; i++) {
            char c = source.charAt(i);
            if (isCharAllowed(c)) // put your condition here
                sb.append(c);
            else
                keepOriginal = false;
        }
        if (keepOriginal)
            return null;
        else {
            if (source instanceof Spanned) {
                SpannableString sp = new SpannableString(sb);
                TextUtils.copySpansFrom((Spanned) source, start, sb.length(), null, sp, 0);
                return sp;
            } else {
                return sb;
            }
        }
    }

    private boolean isCharAllowed(char c) {
        return Character.isLetterOrDigit(c) || Character.isSpaceChar(c);
    }
}
