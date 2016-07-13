package com.fmtech.moneyamountinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private static final int MAX_LENGTH = 15;//
    private static final String INT_REGEX = "^[1-9]\\d*$";
    private static final String DECIMAL_REGEX = "^[0-9]+(\\.[0-9]+)?$";
    private static final String EXTRA_REGEX = "^[0-9]+(\\.)$";
    private static final String DECIMAL_ZERO_REGEX = "\\.[0-9]+";
    private static final String DECIMAL_POINT = ".";
    private static final String COMMA = ",";
    private static final String ZERO = "0";

    private EditText mMoneyAmountET;
    private TextWatcher mMoneyAmountTextWatcher;
    private int mStart = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMoneyAmountET = (EditText)findViewById(R.id.et_moeny_amount);

        InputFilter[] inputFilters = { new CashierInputFilter()};
        mMoneyAmountET.setFilters(inputFilters);


        mMoneyAmountTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                System.out.println("-------beTextChanged##start:"+start+"; count:"+count+"; after:"+after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                System.out.println("-------onTextChanged##start:"+start+"; count:"+count+"; before:"+before);
               if(count > 0){
                   mStart = start + count;
               }else{
                   mStart = start;
               }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    if(s.length() > 0){
                        String originalStr = s.toString();

                        int originalLen = 0,formatedLen =0, decimalPlaces = -1;

                        String amount = delComma(originalStr);

                        if(originalStr.indexOf(DECIMAL_POINT) != -1){
                            decimalPlaces = originalStr.length() -1 - originalStr.indexOf(DECIMAL_POINT);
                        }

                        mMoneyAmountET.removeTextChangedListener(mMoneyAmountTextWatcher);

                        try {
                            if(!TextUtils.isEmpty(amount) && (amount.matches(DECIMAL_REGEX) || amount.matches(INT_REGEX) || amount.matches(EXTRA_REGEX))) {
                                double amount1 = (Double.parseDouble(checkLength(amount)));
                                amount = formatMoneyAmount(amount1, decimalPlaces);
                            }

                            if(amount.matches(DECIMAL_ZERO_REGEX)){
                                amount = "0" + amount;
                            }
                            mMoneyAmountET.setText(amount);
                            //check the comma after formatting
                            int lengthDeff = countStr(amount, COMMA) - countStr(originalStr, COMMA);
                            if(lengthDeff > 0){
                                mStart = mStart + 1;
                            }else if(lengthDeff < 0){
                                mStart = mStart - 1;
                            }
                            String text = mMoneyAmountET.getText().toString();
                            System.out.println("-------text:"+text);
                            System.out.println("-------mStart:"+mStart);
                            if(mMoneyAmountET.getText().length() > 0 ) {
                                if(mStart > mMoneyAmountET.getText().length()){
                                    mStart = mMoneyAmountET.getText().length();
                                }
                                mMoneyAmountET.setSelection(mStart);
                            }

                            mMoneyAmountET.addTextChangedListener(mMoneyAmountTextWatcher);
                        } catch (Exception e) {
                            e.printStackTrace();
                            mMoneyAmountET.addTextChangedListener(mMoneyAmountTextWatcher);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        mMoneyAmountET.addTextChangedListener(mMoneyAmountTextWatcher);
    }

    private String formatMoneyAmount(double amount, int decimalPlaces){
        System.out.println("-------decimalPlaces:"+decimalPlaces);
        String decimalFormat = "###,###.00";
        switch (decimalPlaces){
            case 0:
                decimalFormat = "###,###";
                break;
            case 1:
                decimalFormat = "###,###.0";
                break;
            case -1:
            case 2:
                decimalFormat = "###,###.00";
                break;
        }

        DecimalFormat formatVal =new DecimalFormat(decimalFormat);
        return decimalPlaces == 0?formatVal.format(amount) + DECIMAL_POINT :formatVal.format(amount);
    }

    private String delComma(String s) {
        String formatString = "";
        if (s != null && s.length() >= 1) {
            formatString = s.replaceAll(COMMA, "");
        }

        return formatString;
    }

    private int countStr(String source, String taget) {
        int counter=0;
        if (source.indexOf(taget) == -1) {
            return 0;
        }
        while(source.indexOf(taget)!=-1){
            counter++;
            source=source.substring(source.indexOf(taget)+taget.length());
        }
        return counter;
    }

    private String checkLength(String source){
        int pointIndex = source.indexOf(DECIMAL_POINT);
        if(pointIndex != -1) {
            String temp = source.substring(0, pointIndex);
            if (temp.length() > MAX_LENGTH) {
                source = source.substring(0, pointIndex - 1) + source.substring(pointIndex, source.length());
                mStart = mStart - 1;
            }
        }
        return source;
    }
}
