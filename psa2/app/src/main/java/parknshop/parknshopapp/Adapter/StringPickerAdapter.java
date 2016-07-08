package parknshop.parknshopapp.Adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import parknshop.parknshopapp.EventUpdate.StringPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.MyApplication;

/**
 * Created by kwongyuenpan on 30/3/16.
 */
public class StringPickerAdapter extends BaseAdapter implements DialogInterface.OnClickListener {
    private LayoutInflater inflater;
    private String[] texts;
    private Context mContext;
    private int reqCode;

    private int successCode = -1;
    private int failureCode = -1;

    public StringPickerAdapter(Context context, String[] texts, int reqCode) {
        inflater = LayoutInflater.from(context);
        mContext = context;
        this.texts = texts;
        this.successCode = reqCode;
    }

    public StringPickerAdapter(Context context, String[] texts, int successCode, int failureCode) {
        inflater = LayoutInflater.from(context);
        mContext = context;
        this.texts = texts;
        this.successCode = successCode;
        this.failureCode = failureCode;
    }

    @Override
    public int getCount() {
        return texts.length;
    }

    @Override
    public Object getItem(int position) {
        return texts[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textview;
        if (convertView == null) {
            convertView = inflater.inflate(android.R.layout.simple_list_item_1, null);
            textview = (TextView) convertView.findViewById(android.R.id.text1);
            convertView.setTag(textview);
        } else {
            textview = (TextView) convertView.getTag();
        }
        textview.setText(texts[position]);
        return convertView;
    }

    Runnable callback;
    public void setCallBack(Runnable runnable) {
        this.callback = runnable;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int position) {
        StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent = new StringPickerAdapterOnItemClickEvent();
        stringPickerAdapterOnItemClickEvent.setPosition(position);
        stringPickerAdapterOnItemClickEvent.setText(texts[position]);
        stringPickerAdapterOnItemClickEvent.setReqCode(reqCode);
        //stringPickerAdapterOnItemClickEvent.setSelected(true);

        if(successCode != -1)
            stringPickerAdapterOnItemClickEvent.setSuccessCode(successCode);

        MyApplication.getInstance().mBus.post(stringPickerAdapterOnItemClickEvent);
    }
}
