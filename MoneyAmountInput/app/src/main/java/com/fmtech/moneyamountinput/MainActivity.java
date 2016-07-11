package com.fmtech.moneyamountinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

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
                if(s.length() > 0){
                    String originalStr = s.toString();

                    int originalLen = 0,formatedLen =0;

                    String amount = delComma(originalStr);

                    mMoneyAmountET.removeTextChangedListener(mMoneyAmountTextWatcher);

                    amount = formatMoneyAmount(Double.parseDouble(amount));

                    if(originalStr.indexOf(".") > 0) {
                        originalLen = originalStr.length() - 3;
                        formatedLen = amount.length() - 3;
                    }
                    mMoneyAmountET.setText(amount);
                    if(formatedLen - originalLen > 0){
                        mStart = mStart + 1;
                    }else if(formatedLen - originalLen < 0){
                        mStart = mStart - 1;
                    }
                    mMoneyAmountET.setSelection(mStart);

                    mMoneyAmountET.addTextChangedListener(mMoneyAmountTextWatcher);
                }
            }
        };

        mMoneyAmountET.addTextChangedListener(mMoneyAmountTextWatcher);
    }

    private String formatMoneyAmount(double amount){
        DecimalFormat formatVal =new DecimalFormat("###,###.00");
        return formatVal.format(amount);
    }

    private String delComma(String s) {
        String formatString = "";
        if (s != null && s.length() >= 1) {
            formatString = s.replaceAll(",", "");
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
}
