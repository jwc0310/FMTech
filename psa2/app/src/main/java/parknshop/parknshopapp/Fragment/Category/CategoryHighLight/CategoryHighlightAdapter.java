package parknshop.parknshopapp.Fragment.Category.CategoryHighLight;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.Fragment.Home.HomeListView.HomeListViewItem;
import parknshop.parknshopapp.Fragment.Redemption.RedemptionList.View.RedemptionListItem;
import parknshop.parknshopapp.Model.NewsInfo;
import parknshop.parknshopapp.Model.PromotionResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 30/3/16.
 */
public class CategoryHighlightAdapter extends BaseAdapter {
    Context context;
    //List<NewsInfo> listViewData = new ArrayList<>();
    ArrayList<String> stringArrayList = new ArrayList<String>();
    PromotionResponse promotionResponse;

    public CategoryHighlightAdapter(Context context, PromotionResponse promotionResponse) {
        this.context = context;
        this.promotionResponse = promotionResponse;
    }

    public void setData(List<NewsInfo> newsInfos){
        //listViewData = newsInfos;
    }

    @Override
    public int getCount(){
        return promotionResponse.getData().size();
    }

    @Override
    public PromotionResponse.Data getItem(int position) {
        return promotionResponse.getData() == null ?  null : promotionResponse.getData().get(position);
    }

    @Override
    public long getItemId(int position) {
        return promotionResponse.getData() == null ? null: promotionResponse.getData().get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PromotionResponse.Data data = getItem(position);

        RedemptionListItem view = null;
        if(!isInstanceOfHomeListViewItem(convertView)) {
            view = new RedemptionListItem(parent.getContext());
            view.setTag(view);
        } else {
            view = (RedemptionListItem)convertView.getTag();
        }

        view.setBackground(data.getImage());
        view.setTitle(data.getTitle());
        view.setValidThru(context.getResources().getString(R.string.valid_thru_pure) +  " " + data.getEndTime().split(" ")[0].split("-")[2] + "/" + data.getEndTime().split(" ")[0].split("-")[1] + "/" +data.getEndTime().split(" ")[0].split("-")[0]);
        view.setColorCode(data.getColorCode());

        return view;
    }

    public boolean isInstanceOfHomeListViewItem(View convertView) {
        return !(convertView == null || !(convertView instanceof HomeListViewItem));
    }
}
