package parknshop.parknshopapp.Fragment.Product.ProductList.ProductSorting;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.klinker.android.sliding.SlidingActivity;
import com.orhanobut.hawk.Hawk;

import org.florescu.android.rangeseekbar.RangeSeekBar;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Model.FilterData;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;

/**
 * Created by chrisyu on 16/3/13.
 */
public class ProductSortingActivity extends SlidingActivity {
    @Bind(R.id.seekbar)
    RangeSeekBar rangeSeekBar;

    @Bind(R.id.soring_panel_title) TextView title;

    @Bind(R.id.main_panel) View mainPanel;
    @Bind(R.id.listview_panel) View listviewPanel;
    @Bind(R.id.listview) ListView listview;

    @Bind(R.id.sort_by_selected) TextView sortBySelected;
    @Bind(R.id.special_offer_selected) TextView specialOfferSelected;
    @Bind(R.id.category_selected) TextView categorySelected;
    @Bind(R.id.brand_selected) TextView brandSelected;

    @Bind(R.id.back) TextView back;
    @Bind(R.id.done) TextView done;

    private String[] sortTags = {"iwaBestSellerQty", "new", "price-asc", "price-desc", "topRated"};
    private String sortTag;

    ProductSortingAdapter productSortingAdapter;

    @Override
    public void init(Bundle savedInstanceState) {

        //setTitle("Activity Title");

        setPrimaryColors(
                getResources().getColor(R.color.colorPrimary),
                getResources().getColor(R.color.colorPrimaryDark)
        );

        disableHeader();

        setContent(R.layout.product_sorting_activity_layout);
        ButterKnife.bind(this);

        setSelected();
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                rangeSeekBar.setVisibility(View.VISIBLE);
                rangeSeekBar.setRangeValues((Integer) Hawk.get(AppUtils.min_price), (Integer) Hawk.get(AppUtils.max_price));
                rangeSeekBar.setSelectedMaxValue(Math.max((Integer) Hawk.get(AppUtils.selected_max_price, Integer.MIN_VALUE), (Integer) Hawk.get(AppUtils.max_price, Integer.MIN_VALUE)) );
                rangeSeekBar.setSelectedMinValue(Math.min((Integer) Hawk.get(AppUtils.selected_min_price, Integer.MIN_VALUE), (Integer) Hawk.get(AppUtils.min_price, Integer.MIN_VALUE)) );
                rangeSeekBar.setTextAboveThumbsColorResource(android.R.color.black);
                rangeSeekBar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener() {
                    @Override
                    public void onRangeSeekBarValuesChanged(RangeSeekBar bar, Object minValue, Object maxValue) {
                        done.setVisibility(View.VISIBLE);
                    }
                });
            }
        }, 300);
    }

    @OnClick (R.id.back)
    public void back() {

        if(back.getText().equals(getString(R.string.clear))) {
            if(title.getText().equals(getString(R.string.special_offer))) {
                resetFilterData(Hawk.get(AppUtils.event_list, new ArrayList<FilterData>()), AppUtils.event_list);
                productSortingAdapter.updateData("special_offer");
            }

            if(title.getText().equals(getString(R.string.brand))) {
                resetFilterData(Hawk.get(AppUtils.brand_list, new ArrayList<FilterData>()), AppUtils.brand_list);
                productSortingAdapter.updateData("brand");
            }

            if(title.getText().equals(getString(R.string.category))) {
                resetFilterData(Hawk.get(AppUtils.category_list, new ArrayList<FilterData>()), AppUtils.category_list);
                productSortingAdapter.updateData("category");
            }

            productSortingAdapter.notifyDataSetChanged();

        } else {
            hideSortPanel();
            mainPanel.setVisibility(View.VISIBLE);
            listviewPanel.setVisibility(View.GONE);
            title.setText(getResources().getString(R.string.product_list_fragment_sort_filter));
            back.setVisibility(View.GONE);
        }
    }

    @OnClick (R.id.done)
    public void done() {
        mainPanel.setVisibility(View.VISIBLE);
        if(title.getText().equals(getString(R.string.product_list_fragment_sort_filter))) {
            if((Hawk.get(AppUtils.max_price, -1) != rangeSeekBar.getSelectedMaxValue()))
                Hawk.put(AppUtils.selected_max_price, rangeSeekBar.getSelectedMaxValue());

            if(Hawk.get(AppUtils.min_price, -1) != rangeSeekBar.getSelectedMinValue())
                Hawk.put(AppUtils.selected_min_price, rangeSeekBar.getSelectedMinValue());

            this.finish();
        } else {

            setSelected();
            hideSortPanel();
            mainPanel.setVisibility(View.VISIBLE);
            listviewPanel.setVisibility(View.GONE);
            title.setText(getResources().getString(R.string.product_list_fragment_sort_filter));
            back.setVisibility(View.GONE);
        }
    }

    @OnClick (R.id.special_offer)
    public void specialOffer() {
        title.setText(getResources().getString(R.string.special_offer));
        setListViewPanel("special_offer");
    }

    @OnClick (R.id.category)
    public void category() {
        title.setText(getResources().getString(R.string.special_offer));
        setListViewPanel("category");
    }

    @OnClick (R.id.brand)
    public void brand() {
        title.setText(getResources().getString(R.string.special_offer));
        setListViewPanel("brand");
    }

    @OnClick (R.id.sort_by)
    public void sortingBy() {
        title.setText(getResources().getString(R.string.sort_by));
        back.setText("<");
        back.setVisibility(View.VISIBLE);
    }

            @OnClick (R.id.sort_by_price_asc)
            public void sortingByPriceAsc() {
                sortBySelected.setText(getResources().getString(R.string.price_asc));
                Hawk.put(AppUtils.sort_tag, "price-asc");
                hideSortPanel();
            }

            @OnClick (R.id.sort_by_price_desc)
            public void sortingByPriceDesc() {
                sortBySelected.setText(getResources().getString(R.string.price_desc));
                Hawk.put(AppUtils.sort_tag, "price-desc");
                hideSortPanel();
            }

            @OnClick (R.id.sort_by_recommended)
            public void sortingByRecommended() {
                sortBySelected.setText(getResources().getString(R.string.recommended));
                Hawk.put(AppUtils.sort_tag, "iwaBestSellerQty");
                hideSortPanel();
            }

            @OnClick (R.id.sort_by_popularity)
            public void sortingByPopularity() {
                sortBySelected.setText(getResources().getString(R.string.popularity));
                Hawk.put(AppUtils.sort_tag, "topRated");
                hideSortPanel();
            }

            @OnClick (R.id.sort_by_rank_desc)
            public void sortingByRankDesc() {
                sortBySelected.setText(getResources().getString(R.string.rank_desc));
                hideSortPanel();
            }

            @OnClick (R.id.sort_by_brand_asc)
            public void sortingByBrandAsc() {
                sortBySelected.setText(getResources().getString(R.string.brand_name_asc));
                hideSortPanel();
            }

            @OnClick (R.id.sort_by_brand_desc)
            public void sortingByBrandDesc() {
                sortBySelected.setText(getResources().getString(R.string.brand_name_desc));
                hideSortPanel();
            }

            @OnClick (R.id.sort_by_product_name_asc)
            public void sortingByProductNameAsc() {
                sortBySelected.setText(getResources().getString(R.string.product_name_asc));
                hideSortPanel();
            }

            @OnClick (R.id.sort_by_product_name_desc)
            public void sortingByProductNameDesc() {
                sortBySelected.setText(getResources().getString(R.string.product_name_desc));
                hideSortPanel();
            }


        @OnClick (R.id.all_star)
        public void allStar() {
            rankPressed(getResources().getString(R.string.all_star));
        }

        @OnClick (R.id.four_star)
        public void fourStar() {
            rankPressed(getResources().getString(R.string.four_star));
        }

        @OnClick (R.id.three_star)
        public void threeStar() {
            rankPressed(getResources().getString(R.string.three_star));
        }

        @OnClick (R.id.two_star)
        public void twoStar() {
            rankPressed(getResources().getString(R.string.two_star));
        }




    public void setNumberCount(TextView tv, ArrayList<FilterData> filterDatas) {
        tv.setText("");
        tv.setVisibility(View.VISIBLE);
        int count = 0;
        for(FilterData fd : filterDatas) {
            if(fd.selected)
                count++;
        }
        tv.setText(count == 0 ? "" : count + "");
    }

    public void setListViewPanel(String type) {
        if(type.equals("category"))
            title.setText(getString(R.string.category));

        if(type.equals("brand"))
            title.setText(getString(R.string.brand));

        if(type.equals("special_offer"))
            title.setText(getString(R.string.special_offer));

        listviewPanel.setVisibility(View.VISIBLE);
        mainPanel.setVisibility(View.GONE);

       // productSortingAdapter = new ProductSortingAdapter(type, getBaseContext(), this);
        listview.setAdapter(productSortingAdapter);
        listview.setOnItemClickListener(productSortingAdapter);

        back.setText("CLEAR");
        back.setVisibility(View.VISIBLE);
        done.setVisibility(View.VISIBLE);
    }

    public void hideSortPanel() {
        sortBySelected.setVisibility(View.VISIBLE);
        back.setVisibility(View.GONE);
        done.setVisibility(View.VISIBLE);
        title.setText(getString(R.string.product_list_fragment_sort_filter));
    }

    public void hideStarPanel() {
        mainPanel.setVisibility(View.VISIBLE);
        title.setText(getResources().getString(R.string.product_list_fragment_sort_filter));
        done.setVisibility(View.VISIBLE);
    }

    public ArrayList<FilterData> resetFilterData(ArrayList<FilterData> filterDatas, String type) {
        for (FilterData fd : filterDatas)
            fd.selected = false;

        Hawk.put(type, filterDatas);
        return filterDatas;
    }

    public void setSelected() {
        setNumberCount(categorySelected,(ArrayList<FilterData>) Hawk.get(AppUtils.category_list));
        setNumberCount(brandSelected,(ArrayList<FilterData>) Hawk.get(AppUtils.brand_list) );
        setNumberCount(specialOfferSelected,(ArrayList<FilterData>) Hawk.get(AppUtils.event_list));

        String sortTag = Hawk.get(AppUtils.sort_tag, "");

        if(sortTag.equals("price-asc")) {
            sortBySelected.setText(getResources().getString(R.string.price_asc));
        } else if(sortTag.equals("price-desc")) {
            sortBySelected.setText(getResources().getString(R.string.price_desc));
        } else if(sortTag.equals("iwaBestSellerQty")) {
            sortBySelected.setText(getResources().getString(R.string.recommended));
        } else if(sortTag.equals("topRated")) {
            sortBySelected.setText(getResources().getString(R.string.popularity));
        }

    }

    public void rankPressed(String string) {
        hideStarPanel();
        Hawk.put(AppUtils.star_pressed, string);
    }
}
