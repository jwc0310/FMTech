package parknshop.parknshopapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.EventUpdate.SearchHistoryListAdapterOnItemClickEvent;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

/**
 * Created by kwongyuenpan on 24/3/16.
 */
public class SearchHistoryListAdapter extends BaseAdapter implements StickyListHeadersAdapter, AdapterView.OnItemClickListener {
    Context context;
    private LayoutInflater inflater;
    ArrayList<String> historyList = new ArrayList<>();
    List<String> hotSearchList = new ArrayList<>();

    public SearchHistoryListAdapter(Context context, ArrayList<String> historyList) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        setList(historyList);
    }

    public void setList(ArrayList<String> historyList){
        this.historyList.clear();
        if(historyList == null)
            return;
        this.historyList.addAll(historyList);
        notifyDataSetChanged();
    }

    public void setHotSearchList(List<String> hotSearchList) {
        if(hotSearchList == null)
            return;

        this.hotSearchList = hotSearchList;
    }

    @Override
    public int getCount() {
        return hotSearchList.size() + historyList.size();
    }

    @Override
    public Object getItem(int position) {
        return hotSearchList.get(position) + historyList.get(position - hotSearchList.size());
    }

    @Override
    public long getItemId(int position) {
        if(position < hotSearchList.size()) {
            return hotSearchList.get(position).hashCode();
        }
        return historyList.get(position - hotSearchList.size()).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.item_search_history, null, false);
            holder.txtName = (TextView) view.findViewById(R.id.txtName);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        if(i < hotSearchList.size()) {
            holder.txtName.setText(hotSearchList.get(i));
        } else {
            holder.txtName.setText(historyList.get(i - hotSearchList.size()));
        }
        return view;
    }

//    @Override
//    public int getSwipeLayoutResourceId(int position) {
//        return R.id.swipe_layout;
//    }
//
//    @Override
//    public View generateView(int position, ViewGroup parent) {
//        return LayoutInflater.from(context).inflate(R.layout.item_search_history, null);
//    }

//    @Override
//    public void fillValues(final int position, View convertView) {
//
//        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
//
//        txtName.setText(historyList.get(position));
//        LogUtil.info("", "txtName:"+txtName.getText().toString());
//
////        RelativeLayout front_wrapper = (RelativeLayout) convertView.findViewById(R.id.front_wrapper);
////        RelativeLayout btnDelete = (RelativeLayout) convertView.findViewById(R.id.btnDelete);
////        front_wrapper.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                GroceryListAdapterItemClickEvent groceryListAdapterItemClickEvent = new GroceryListAdapterItemClickEvent();
////                groceryListAdapterItemClickEvent.setPosition(position);
////                groceryListAdapterItemClickEvent.setWishListResponse(historyList.get(position));
////                MyApplication.getInstance().mBus.post(groceryListAdapterItemClickEvent);
////            }
////        });
////        btnDelete.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                ((OneActivity)context).showLoadingView();
////                WebServiceModel.getInstance(context).requestRemoveWishList(context, historyList.get(position).getPrimaryKey());
////            }
////        });
//
//    }

    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {
        HeaderViewHolder holder;
        if (convertView == null) {
            holder = new HeaderViewHolder();
            convertView = inflater.inflate(R.layout.item_grocery_list_header, parent, false);
            holder.txtName = (TextView) convertView.findViewById(R.id.txtName);
            holder.txtClear = (TextView) convertView.findViewById(R.id.txtClear);
            convertView.setTag(holder);
        } else {
            holder = (HeaderViewHolder) convertView.getTag();
        }

        holder.txtName.setText(hotSearchList.size() > position ? context.getString(R.string.search_page_hot_search) : context.getString(R.string.search_page_recently_searched));

        if(hotSearchList.size() <= position) {
            holder.txtClear.setVisibility(View.VISIBLE);

            holder.txtClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    historyList.clear();
                    Hawk.put(AppUtils.search_history_list, historyList);
                    notifyDataSetChanged();
                }
            });
        }

        //Log.i("header", "header " + position);

        return convertView;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        SearchHistoryListAdapterOnItemClickEvent searchHistoryListAdapterOnItemClickEvent = new SearchHistoryListAdapterOnItemClickEvent();
        searchHistoryListAdapterOnItemClickEvent.setPosition(i);
        MyApplication.getInstance().mBus.post(searchHistoryListAdapterOnItemClickEvent);
    }

    class HeaderViewHolder {
        TextView txtName;
        TextView txtClear;
    }

    class ViewHolder {
        TextView txtName;
    }

    @Override
    public long getHeaderId(int position) {
//        return mWishListResponses.get(position).getName().subSequence(0, 1).charAt(0);
        if(hotSearchList.size() > position)
            return 1;
        else //if(hotSearchList.size() + hotSearchList.size() > position)
            return 2;

        //return 0;
    }
}
