package parknshop.parknshopapp.Fragment.Product.ProductList.ProductSorting;

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
 * Created by chrisyu on 16/3/13.
 */
public class ProductSortingAdapter extends BaseAdapter implements AdapterView.OnItemClickListener{
    String type = "";
    ArrayList<FilterData> data = new ArrayList<>();
    public List<parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory> newCatList = new ArrayList<>();
    List<TextSearchResponse.Sorts> sortsList = new ArrayList<>();
    public List<TextSearchResponse.Facet> facets = new ArrayList<>();
    Context context;
    ProductListFragment pf;
    ProductListRepo productListRepo;
    ListView listView;

    boolean isAnySelected = true;

    public ProductSortingAdapter(String type, ProductListFragment pf, ListView listView) {
        this.pf = pf;
        productListRepo = pf.productListRepo;
        this.context = pf.getBaseActivity();
        this.listView = listView;
        updateData(type);
    }

    public void updateData (String type) {
        if(type.equals("category")) {
            newCatList = productListRepo.newCatList;
            this.type = "category";
            for(int i = 0 ; i < newCatList.size(); i++) {
                if(newCatList.get(i).selected)
                    isAnySelected = false;
            }
        } else if (type.equals("brand")) {
            data = productListRepo.brandList;
            this.type = "brand";
            for(int i = 0 ; i < data.size(); i++) {
                if(data.get(i).selected)
                    isAnySelected = false;
            }
        } else if (type.equals("special_offer") && productListRepo.facets != null && productListRepo.facets.size() > 0) {
            facets = productListRepo.facets;
            this.type = "special_offer";
            for (int i = 0; i < facets.get(0).getValues().size(); i++) {
                if (facets.get(0).getValues().get(i).isSelected)
                    isAnySelected = false;
            }
            //Log.i("fac", "fac" + facets.size());//.getName());
        } else if(type.equals("sort") && productListRepo.sorts != null && productListRepo.sorts.size() > 0) {
            sortsList = productListRepo.sorts;
            //Log.i("sort", "sort" + sortsList.size());
            this.type = "sorts";

            for(int i = 0; i < sortsList.size(); i++) {
                if(sortsList.get(i).isSelected())
                    isAnySelected = false;
            }
        }
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if(this.type.equals("sorts") && sortsList != null && sortsList.size() > 0)
            return sortsList.size();
        else if(this.type.equals("special_offer") && facets != null && facets.size() > 0) {
            //Log.i("sort", "sort" + facets.get(0).getValues().size());
            return 1 + facets.get(0).getValues().size();
        } else if(this.type.equals("category")) {
            return 1 + newCatList.size();
        }
        return 1 + (data != null ? data.size() : 0);
    }

    @Override
    public Object getItem(int position) {
        if(position == 0) return  null;
        if(this.type.equals("sorts"))
            return sortsList.get(position);
        else if(this.type.equals("special_offer"))
            return facets.get(0).getValues().get(position - 1);
        else if(this.type.equals("category")) {
            return newCatList.get(position);
        }
        return data.get(position - 1);
    }

    @Override
    public long getItemId(int position) {

        if(position == 0) return  9;

        if(this.type.equals("sorts"))
            return sortsList.get(position).hashCode();
        else if(this.type.equals("special_offer"))
            return facets.get(0).getValues().get(position - 1).hashCode();
        if(this.type.equals("category")) {
            return newCatList.get(position- 1).hashCode();
        }
        return 1 +data.get(position - 1).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_soring_listview_item, null);

        boolean selected;
        if(this.type.equals("category")) {

            if(position > 0) {
                parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory data = newCatList.get(position - 1);
                ((TextView) view.findViewById(R.id.label)).setText(data.getName());
                selected = data.selected;
                //Log.i("position", "position " + position + " " + selected);
            } else {
                ((TextView) view.findViewById(R.id.label)).setText(context.getResources().getString(R.string.any));
                selected = isAnySelected;
            }
        } else if(this.type.equals("sorts")) {
            TextSearchResponse.Sorts data = sortsList.get(position);
            ((TextView) view.findViewById(R.id.label)).setText(data.getName());
            selected = data.isSelected();
        } else if(this.type.equals("special_offer")) {
            if(position > 0) {
                TextSearchResponse.Facet data = facets.get(0);
                TextSearchResponse.Facet.Value value = data.getValues().get(position - 1);
                ((TextView) view.findViewById(R.id.label)).setText(value.getName() + " (" + value.getCount() + ")");
                selected = value.isSelected;
            } else {
                ((TextView) view.findViewById(R.id.label)).setText(context.getResources().getString(R.string.any));
                selected = isAnySelected;
            }
        } else {

                if(position > 0) {
                    ((TextView) view.findViewById(R.id.label)).setText(data.get(position - 1).getName() + (type.equals("category")  ? "" : ""));// "(" + data.get(position - 1).getCount() + ")"));
                    selected = data.get(position - 1).selected;
                } else {
                    ((TextView) view.findViewById(R.id.label)).setText(context.getResources().getString(R.string.any));
                    selected = isAnySelected;
                }
        }

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

    public int position;
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        boolean selected = false;
        this.position = position;

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


        if(this.type.equals("category")) {

            if (position > 0) {
                newCatList.get(position - 1).selected = !newCatList.get(position - 1).selected;


                for (int i = 0; i < newCatList.size(); i++) {
                    if (i != position - 1)
                        newCatList.get(i).selected = (false);
                }

                isAnySelected = !newCatList.get(position - 1).selected;
            } else {
                isAnySelected = true;

                for (int i = 0; i < newCatList.size(); i++) {
                    newCatList.get(i).selected = (false);
                }
            }

            redrawListView();
        }else if(data.size() > 0) {
             if (!this.type.equals("brand")) {
                if (position > 0) {
                    data.get(position - 1).selected = !data.get(position - 1).selected;


                    for (int i = 0; i < data.size(); i++) {
                        if (i != position - 1)
                            data.get(i).selected = (false);
                    }

                    isAnySelected = !data.get(position - 1).selected;
                } else {
                    isAnySelected = true;

                    for (int i = 0; i < data.size(); i++) {
                        data.get(i).selected = (false);
                    }
                }

                redrawListView();
            } else {
                if (position > 0) {
                    data.get(position - 1).selected = !data.get(position - 1).selected;

                    isAnySelected = true;
                    for(int i = 0; i < data.size(); i++)
                        if(data.get(i).selected)
                            isAnySelected = false;


                } else {
                    isAnySelected = true;

                    for (int i = 0; i < data.size(); i++) {
                        data.get(i).selected = (false);
                    }
                }

                redrawListView();
            }
        }

         if(sortsList.size() > 0 ){
            sortsList.get(position).setSelected(!sortsList.get(position).isSelected());

            for(int i = 0; i < sortsList.size(); i++) {
                if(i != position)
                    sortsList.get(i).setSelected(false);
            }

             int count = 0;
             for(int i = 0; i < sortsList.size(); i++) {
                 if(sortsList.get(i).isSelected())
                     count++;
             }

             if(count == 0)
                 sortsList.get(0).setSelected(true);

             redrawListView();
        } else if(facets.size() > 0 && facets.get(0).getValues().size() > 0) {
            int count = 0;
             if(position > 0) {
                 facets.get(0).getValues().get(position - 1).isSelected = !facets.get(0).getValues().get(position - 1).isSelected;
                 for (int i = 0; i < facets.get(0).getValues().size(); i++) {
                     if (facets.get(0).getValues().get(i).isSelected) {
                         count++;
                     }
                 }

                 //Log.i("count", " count" + count);
                 if (count == 0)
                     isAnySelected = true;
                 else
                     isAnySelected = false;
             } else {
                 for (int i = 0; i < facets.get(0).getValues().size(); i++) {
                     facets.get(0).getValues().get(i).isSelected = false;
                 }
                 isAnySelected = true;
             }
            redrawListView();
        }
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
