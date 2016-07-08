package parknshop.parknshopapp.Fragment.Coupon.CouponList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import parknshop.parknshopapp.Fragment.Coupon.CouponList.View.CouponListItem;
import parknshop.parknshopapp.Fragment.Redemption.RedemptionList.View.RedemptionListItem;
import parknshop.parknshopapp.Model.CouponResponse;

/**
 * Created by chrisyu on 7/3/16.
 */
public class CouponListAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
    Context context;
    ArrayList<CouponResponse.Data> dataList = new ArrayList<CouponResponse.Data>();

    public CouponListAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<CouponResponse.Data> dataList) {
        this.dataList = dataList;
    }

    @Override
    public int getCount(){
        if(dataList == null || dataList == null)
            return 0;
        return dataList.size() ;
    }

    @Override
    public CouponResponse.Data getItem(int position) {
        return dataList == null ?  null : dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return dataList == null ? null: dataList.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CouponResponse.Data data = getItem(position);

        CouponListItem view = null;
        if(!isInstanceOfHomeListViewItem(convertView)) {
            view = new CouponListItem(parent.getContext());
            view.setTag(view);
        } else {
            view = (CouponListItem)convertView.getTag();
        }

        view.setBackground(data.getImage());
        view.setTitle(data.getTitle());
        view.setTxtValidUntil(data.getValid_Until());
        view.setTxtDesc(data.getDescription());
        return view;
    }

    public boolean isInstanceOfHomeListViewItem(View convertView) {
        return !(convertView == null || !(convertView instanceof RedemptionListItem));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Advertisement.Data data = (Advertisement.Data)getItem(position);
        //((BaseActivity)context).goToContentTypeFragment(data);
    }
}
