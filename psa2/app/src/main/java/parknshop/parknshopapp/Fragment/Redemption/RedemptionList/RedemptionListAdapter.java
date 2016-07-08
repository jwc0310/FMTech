package parknshop.parknshopapp.Fragment.Redemption.RedemptionList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Redemption.RedemptionDetail.RedemptionDetailFragment;
import parknshop.parknshopapp.Fragment.Redemption.RedemptionList.View.RedemptionListItem;
import parknshop.parknshopapp.Model.RedemptionResponse;

/**
 * Created by chrisyu on 7/3/16.
 */
public class RedemptionListAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
    Context context;
    ArrayList<RedemptionResponse.RedemptionListData> dataList = new ArrayList<RedemptionResponse.RedemptionListData>();

    public RedemptionListAdapter(Context context) {
        this.context = context;
    }


    public void setData(ArrayList<RedemptionResponse.RedemptionListData> dataList) {
        this.dataList = dataList;
    }

    @Override
    public int getCount(){
        if(dataList == null || dataList == null)
            return 0;
        return dataList.size() ;
    }

    @Override
    public RedemptionResponse.RedemptionListData getItem(int position) {
        return dataList == null ?  null : dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return dataList == null ? null: dataList.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RedemptionResponse.RedemptionListData data = getItem(position);

        RedemptionListItem view = null;
        if(!isInstanceOfHomeListViewItem(convertView)) {
            view = new RedemptionListItem(parent.getContext());
            view.setTag(view);
        } else {
            view = (RedemptionListItem)convertView.getTag();
        }

        view.setBackground(data.getImage());
        view.setTitle(data.getTitle());
        return view;
    }

    public boolean isInstanceOfHomeListViewItem(View convertView) {
        return !(convertView == null || !(convertView instanceof RedemptionListItem));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ((BaseActivity) context).placeFragmentWithBackStack(RedemptionDetailFragment.newInstance(dataList.get(position).id + ""));
        //Advertisement.Data data = (Advertisement.Data)getItem(position);
        //((BaseActivity)context).goToContentTypeFragment(data);
    }
}
