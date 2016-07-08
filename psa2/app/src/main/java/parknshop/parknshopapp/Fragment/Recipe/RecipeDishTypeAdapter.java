package parknshop.parknshopapp.Fragment.Recipe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Model.DishTypeResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 5/5/16.
 */
public class RecipeDishTypeAdapter extends BaseAdapter implements AdapterView.OnItemClickListener{
    BaseActivity baseActivity;
    ArrayList<DishTypeResponse.DishTypeItem> data;
    ListView listView;

    @Bind(R.id.label) TextView labelTextView;
    @Bind(R.id.checked) ImageView checkedImageView;
    @Bind(R.id.unchecked) ImageView uncheckedImageView;

    boolean allSelected = true;

    public RecipeDishTypeAdapter(ListView listView, BaseActivity baseActivity) {
        this.listView = listView;
        this.baseActivity = baseActivity;
    }

    public boolean isAllSelected() {
        return allSelected;
    }

    public ArrayList<DishTypeResponse.DishTypeItem> getData() {
        return data;
    }

    public void setData(ArrayList<DishTypeResponse.DishTypeItem> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        //Log.i("count", "count " + (1 + data.size()) );
        if(data == null)
            return 0;
        return 1 + data.size();
    }

    @Override
    public Object getItem(int position) {
        if(data == null || position == 0)
            return null;
        if(data.get(position - 1) != null)
            return data.get(position - 1);
        return 0;
    }

    @Override
    public long getItemId(int position) {
        if(data == null || position == 0)
            return 0;
        if(data.get(position - 1) != null)
            return data.get(position - 1).hashCode();
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(baseActivity).inflate(R.layout.product_soring_listview_item, null);
        ButterKnife.bind(this, view);

        if(position == 0) {
            labelTextView.setText(baseActivity.getString(R.string.recipe_dish_type_all));
        } else if(data != null) {
            labelTextView.setText(data.get(position - 1).getType());
        }

        setSelectedView(position);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position == 0) {
            for(int i = 0; i < data.size(); i++)
                data.get(i).setSelected(false);
            allSelected = true;
        } else {
            data.get(position - 1).setSelected(!data.get(position - 1).getSelected());
            allSelected = !isAnyThingSelected();
        }
        redrawListView();
    }

    public boolean isAnyThingSelected() {
        boolean anyThingSelected = false;
        for(int i = 0 ; i < data.size(); i++) {
            if(data.get(i).getSelected())
                anyThingSelected = true;
        }
        return anyThingSelected;
    }

    public void setSelectedView(int position) {
        if(position == 0) {
            if(allSelected) {
                checkedImageView.setVisibility(View.VISIBLE);
                uncheckedImageView.setVisibility(View.GONE);
            } else {
                checkedImageView.setVisibility(View.GONE);
                uncheckedImageView.setVisibility(View.VISIBLE);
            }
        } else {
            if (data.get(position - 1).getSelected()) {
                checkedImageView.setVisibility(View.VISIBLE);
                uncheckedImageView.setVisibility(View.GONE);
            } else {
                checkedImageView.setVisibility(View.GONE);
                uncheckedImageView.setVisibility(View.VISIBLE);
            }
        }
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


/*public class ProductSortingAdapter extends BaseAdapter implements AdapterView.OnItemClickListener{
    String type;
    ArrayList<FilterData> data = new ArrayList<>();
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
            data = productListRepo.categoryList;
            this.type = "category";
            for(int i = 0 ; i < data.size(); i++) {
                if(data.get(i).selected)
                    isAnySelected = false;
            }
        } else if (type.equals("brand")) {
            data = productListRepo.brandList;
            this.type = "brand";
            for(int i = 0 ; i < data.size(); i++) {
                if(data.get(i).selected)
                    isAnySelected = false;
            }
        } else if (type.equals("special_offer")) {
            facets = productListRepo.facets;
            this.type = "special_offer";
            for (int i = 0; i < facets.get(0).getValues().size(); i++) {
                if (facets.get(0).getValues().get(i).isSelected)
                    isAnySelected = false;
            }
            Log.i("fac", "fac" + facets.size());//.getName());
        } else if(type.equals("sort")) {
            sortsList = productListRepo.sorts;
            Log.i("sort", "sort" + sortsList.size());
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
        if(this.type.equals("sorts"))
            return sortsList.size();
        else if(this.type.equals("special_offer")) {
            Log.i("sort", "sort" + facets.get(0).getValues().size());
            return 1 + facets.get(0).getValues().size();
        }
        return 1 + data.size();
    }

    @Override
    public Object getItem(int position) {
        if(position == 0) return  null;
        if(this.type.equals("sorts"))
            return sortsList.get(position);
        else if(this.type.equals("special_offer"))
            return facets.get(0).getValues().get(position - 1);
        return data.get(position - 1);
    }

    @Override
    public long getItemId(int position) {

        if(position == 0) return  9;

        if(this.type.equals("sorts"))
            return sortsList.get(position).hashCode();
        else if(this.type.equals("special_offer"))
            return facets.get(0).getValues().get(position - 1).hashCode();
        return 1 +data.get(position - 1).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_soring_listview_item, null);

        boolean selected;
        if(this.type.equals("sorts")) {
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
                ((TextView) view.findViewById(R.id.label)).setText("Any");
                selected = isAnySelected;
            }
        } else {

                if(position > 0) {
                    ((TextView) view.findViewById(R.id.label)).setText(data.get(position - 1).getName() + (type.equals("category")  ? "" : ""));// "(" + data.get(position - 1).getCount() + ")"));
                    selected = data.get(position - 1).selected;
                } else {
                    ((TextView) view.findViewById(R.id.label)).setText("Any");
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

        if(data.size() > 0) {
            if (!this.type.equals("brand")) {
                if (position > 0) {
                    data.get(position - 1).selected = !data.get(position - 1).selected;

                    for (int i = 0; i < data.size(); i++) {
                        if (i != position - 1)
                            data.get(i).selected = (false);
                    }

                    isAnySelected = false;
                } else {
                    isAnySelected = true;

                    for (int i = 0; i < data.size(); i++) {
                        data.get(i).selected = (false);
                    }
                }

                redrawListView();
            } else {
                if (position > 0) {
                    data.get(position - 1).selected = true;

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

                 Log.i("count", " count" + count);
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
*/