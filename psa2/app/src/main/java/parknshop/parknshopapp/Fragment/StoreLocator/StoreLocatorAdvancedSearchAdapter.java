package parknshop.parknshopapp.Fragment.StoreLocator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListRepo;
import parknshop.parknshopapp.Model.FilterData;
import parknshop.parknshopapp.Model.TextSearchResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 29/4/16.
 */
public class StoreLocatorAdvancedSearchAdapter  extends BaseAdapter implements AdapterView.OnItemClickListener{
    String type;
    ArrayList<FilterData> data = new ArrayList<>();
    List<TextSearchResponse.Sorts> sortsList = new ArrayList<>();
    public List<TextSearchResponse.Facet> facets = new ArrayList<>();
    Context context;
    ProductListFragment pf;
    ProductListRepo productListRepo;
    ListView listView;

    boolean isAnySelected = true;

    public StoreLocatorAdvancedSearchAdapter(String type, ProductListFragment pf, ListView listView) {
        this.pf = pf;
        //productListRepo = pf.productListRepo;
        this.context = pf.getBaseActivity();
        this.listView = listView;
        updateData(type);
    }

    public void updateData (String type) {
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return 1 + data.size();
    }

    @Override
    public Object getItem(int position) {
        if(position == 0) return  null;
        return data.get(position - 1);
    }

    @Override
    public long getItemId(int position) {

        if(position == 0) return  9;

        return 1 +data.get(position - 1).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_soring_listview_item, null);

        boolean selected = false;

        if (selected) {
            ((TextView) view.findViewById(R.id.selected)).setText("x");
            view.findViewById(R.id.checked).setVisibility(View.VISIBLE);
            view.findViewById(R.id.unchecked).setVisibility(View.GONE);
        } else {
            ((TextView) view.findViewById(R.id.selected)).setText("");
            view.findViewById(R.id.checked).setVisibility(View.GONE);
            view.findViewById(R.id.unchecked).setVisibility(View.VISIBLE);
        }
        view.setTag(getItemId(position));

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        boolean selected = false;

        if(((TextView)view.findViewById(R.id.selected)).getText().equals("")) {
            ((TextView) view.findViewById(R.id.selected)).setText("x");
            view.findViewById(R.id.checked).setVisibility(View.VISIBLE);
            view.findViewById(R.id.unchecked).setVisibility(View.GONE);
            selected = true;
        } else {
            ((TextView) view.findViewById(R.id.selected)).setText("");
            view.findViewById(R.id.checked).setVisibility(View.GONE);
            view.findViewById(R.id.unchecked).setVisibility(View.VISIBLE);
            selected = false;
        }

        redrawListView();
        //Hawk.put(type, data);
    }

    public void redrawListView() {
        int firstItem = listView.getFirstVisiblePosition();
        int lastItem = listView.getLastVisiblePosition();
        for(int i = firstItem;i <= lastItem; i++) {
            View v = listView.getChildAt(i - firstItem);
            listView.getAdapter().getView(i, v, listView);
            listView.invalidateViews();
        }
    }
}
