package parknshop.parknshopapp.Fragment.Home.HomeListView;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.Advertisement;
import parknshop.parknshopapp.Model.Advertisement.Data;

/**
 * Created by chrisyu on 7/3/16.
 */
public class HomeListViewAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
    Context context;
    Advertisement advertisement = new Advertisement();
    ArrayList<Data> homeList;

    public HomeListViewAdapter(Context context) {
        this.context = context;
    }


    public void setData(Advertisement advertisement) {
        this.advertisement = advertisement;
        this.homeList = getDataByTypeHome(advertisement);
    }

    @Override
    public int getCount(){
        if(homeList == null || homeList == null)
            return 0;
        return homeList.size() ;
    }

    @Override
    public Object getItem(int position) {
        return homeList == null ?  null : homeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return homeList == null ? null: homeList.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HomeListViewItem view = null;
        if(!isInstanceOfHomeListViewItem(convertView)) {
            view = new HomeListViewItem(parent.getContext());
            view.setTag(view);
        } else {
            view = (HomeListViewItem)convertView.getTag();
        }

        view.setContent((Advertisement.Data)getItem(position));
        return view;
    }

    public boolean isInstanceOfHomeListViewItem(View convertView) {
        return !(convertView == null || !(convertView instanceof HomeListViewItem));
    }

    public ArrayList<Data> getDataByTypeHome(Advertisement advertisement) {
        ArrayList<Data> homeList = new ArrayList<Data>();
        if (advertisement == null || advertisement.getData() == null) return homeList;
        for(int i = 0 ;i < advertisement.getData().size(); i++) {
            if(advertisement.getData().get(i).getType().equals("home")) {
                homeList.add(advertisement.getData().get(i));
            }
        }
/*
        Collections.sort(homeList,new Comparator<Data>(){
            public int compare(Data s1,Data s2){
                if(s1.getSequence() > s2.getSequence())
                    return 1;
                if(s1.getSequence() < s2.getSequence())
                    return -1;
                return 0;
                // Write your logic here.
            }});*/
        return homeList;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Advertisement.Data data = (Advertisement.Data)getItem(position);
        ((BaseActivity)context).goToContentTypeFragment(data);

        String postFix = data.getTitle_en().replace("/", "").replace("--", "-");
        String postFixResult = "";

        for(int i = 0; i < postFix.length(); i ++) {
            if(Character.isDigit(postFix.charAt(i)) || Character.isLetter(postFix.charAt(i)) || postFix.charAt(i) == '%' || postFix.charAt(i) == '-') {
                postFixResult += postFix.charAt(i);
            }
        }

        GATrackerHelper.getInstance(context).setGATracker("home/" + postFixResult);
    }
}
