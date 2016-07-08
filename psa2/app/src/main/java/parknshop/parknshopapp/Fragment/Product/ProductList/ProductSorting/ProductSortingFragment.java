package parknshop.parknshopapp.Fragment.Product.ProductList.ProductSorting;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;
import com.yahoo.mobile.client.android.util.RangeSeekBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;
import parknshop.parknshopapp.AnimationHelper;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.Model.FilterData;
import parknshop.parknshopapp.Model.TextSearchResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;

/**
 * Created by chrisyu on 16/3/16.
 */
public class ProductSortingFragment extends BaseFragment {

    @Bind(R.id.seekbar) com.yahoo.mobile.client.android.util.RangeSeekBar rangeSeekBar;

    public @Bind(R.id.header) View header;
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

    @Bind(R.id.sort_by_selected_arrow) ImageView sortBySelectedArrow;
    @Bind(R.id.special_offer_selected_arrow) ImageView specialOfferSelectedArrow;
    @Bind(R.id.category_selected_arrow) ImageView categorySelectedArrow;
    @Bind(R.id.brand_selected_arrow) ImageView brandSelectedArrow;

    public @Bind (R.id.sort_root) View sortRoot;
    public @Bind (R.id.sorting_dimmed) View dimmed;

    private String[] sortTags = {"iwaBestSellerQty", "new", "price-asc", "price-desc", "topRated"};
    private String sortTag;

    ProductSortingAdapter productSortingAdapter;

    ProductListFragment pf;

    public void init(ProductListFragment pf) {
        anyThingSelected = false;
        this.pf = pf;
        verify();
        setSelected();

        mainPanel.setVisibility(View.VISIBLE);
        listviewPanel.setVisibility(View.GONE);
        title.setText(getResources().getString(R.string.product_list_fragment_sort_filter));
        if(anyThingSelected) {
            back.setText(getString(R.string.reset));
            back.setVisibility(View.VISIBLE);
            done.setVisibility(View.VISIBLE);
        } else {
            //back.setVisibility(View.GONE);
        }
    }

    @OnClick(R.id.back)
    public void back() {

        if( back.getText().equals(getString(R.string.reset))) {
            pf.productListRepo.reset();
            back.setText(getString(R.string.btn_cancel));
            setSelected();
            //rangeSeekBar.setSelectedMaxValue((Integer) Hawk.get(AppUtils.max_price));
            //rangeSeekBar.setSelectedMinValue((Integer) Hawk.get(AppUtils.min_price));

            rangeSeekBar.setSelectedMinValue(pf.productListRepo.minPrice);
            rangeSeekBar.setSelectedMaxValue(pf.productListRepo.maxPrice);

            //Log.i("rangeSeekBar", "rangeSeekBar " + pf.productListRepo.maxPrice + " " + pf.productListRepo.minPrice);
        } else if(back.getText().equals(getString(R.string.clear))) {
            if(title.getText().equals(getString(R.string.special_offer))) {
                resetFilterData(pf.productListRepo.eventList, AppUtils.event_list);
                productSortingAdapter.updateData("special_offer");
                productSortingAdapter.notifyDataSetChanged();
                brandSelectedArrow.setVisibility(View.GONE);
            }

            if(title.getText().equals(getString(R.string.brand))) {
                resetFilterData(pf.productListRepo.brandList, AppUtils.brand_list);
                productSortingAdapter.updateData("brand");
                productSortingAdapter.notifyDataSetChanged();
                brandSelectedArrow.setVisibility(View.GONE);
            }

            if(title.getText().equals(getString(R.string.category))) {
                resetFilterData(pf.productListRepo.categoryList, AppUtils.category_list);
                productSortingAdapter.updateData("category");
                productSortingAdapter.notifyDataSetChanged();
                categorySelectedArrow.setVisibility(View.GONE);
            }

            if(title.getText().equals(getString(R.string.product_list_fragment_sort_filter))) {
                resetFilterData(pf.productListRepo.eventList, AppUtils.event_list);
                resetFilterData(pf.productListRepo.brandList, AppUtils.brand_list);
                resetFilterData(pf.productListRepo.categoryList, AppUtils.category_list);
                Hawk.put(AppUtils.sort_tag, "");

                sortBySelected.setText("");
                //rankSelected.setText("");
                specialOfferSelected.setText("");
                categorySelected.setText("");
                brandSelected.setText("");

                //sortBySelectedArrow.setVisibility(View.GONE);
                //rankSelectedArrow.setVisibility(View.GONE);
                //specialOfferSelectedArrow.setVisibility(View.GONE);
                //categorySelectedArrow.setVisibility(View.GONE);
                //brandSelectedArrow.setVisibility(View.GONE);

                //(Integer) Hawk.get(AppUtils.min_price), (Integer) Hawk.get(AppUtils.max_price)
                rangeSeekBar.setSelectedMaxValue((Integer) pf.productListRepo.maxPrice);
                rangeSeekBar.setSelectedMinValue((Integer) pf.productListRepo.minPrice);


                pf.productListRepo.selectedMaxPrice = -1;
                pf.productListRepo.selectedMaxPrice = -1;
            }
        } else if(back.getText().toString().equals(getString(R.string.btn_cancel)) && title.getText().equals(getResources().getString(R.string.product_list_fragment_sort_filter))) {
            //else
            AnimationHelper.slideToBottom(sortRoot);
            dimmed.setVisibility(View.GONE);
        } else {

            verify();
            hideSortPanel();
            mainPanel.setVisibility(View.VISIBLE);
            listviewPanel.setVisibility(View.GONE);
            title.setText(getResources().getString(R.string.product_list_fragment_sort_filter));

            if(anyThingSelected) {
                back.setText(getString(R.string.reset));
                back.setVisibility(View.VISIBLE);
                done.setVisibility(View.VISIBLE);
            } else {
                //back.setVisibility(View.GONE);
            }
        }
    }

    public void verify() {
        if(type == null)
            return;

        if(this.type.equals("category")){
            for(int i = 0; i < pf.productListRepo.newCatList.size(); i++) {
                if (productListFragment.productListRepo.lastSelectedCategoryPosition - 1 == i) {
                    pf.productListRepo.newCatList.get(i).selected = true;
                } else {
                    pf.productListRepo.newCatList.get(i).selected = false;
                }
            }
        }

        if(this.type.equals("brand")) {
            for(int i = 0; i < pf.productListRepo.brandList.size(); i++) {
                boolean isSelected = false;
                for(int y = 0; y < productListFragment.productListRepo.lastSelectedBrandPositions.size(); y ++) {
                    if (productListFragment.productListRepo.lastSelectedBrandPositions.get(y) == i) {
                        isSelected = true;
                    }
                }

                if(isSelected) {
                    pf.productListRepo.brandList.get(i).selected = true;
                } else {
                    pf.productListRepo.brandList.get(i).selected = false;
                }
            }
        }

        if(this.type.equals("special_offer")) {
            if(pf.productListRepo.facets.get(0) != null) {
                for (int i = 0; i < pf.productListRepo.facets.get(0).getValues().size(); i++) {
                    boolean isSelected = false;
                    for (int y = 0; y < productListFragment.productListRepo.lastSelectedPromotionPositions.size(); y++) {
                        if (productListFragment.productListRepo.lastSelectedPromotionPositions.get(y) == i) {
                            isSelected = true;
                        }
                    }

                    if (isSelected) {
                        pf.productListRepo.facets.get(0).getValues().get(i).isSelected = true;
                    } else {
                        pf.productListRepo.facets.get(0).getValues().get(i).isSelected = false;
                    }
                }
            }
        }

        if(this.type.equals("sort")) {
            for(int i = 0; i < pf.productListRepo.sorts.size(); i++) {
                if (productListFragment.productListRepo.lastSelectedSortPosition  == i) {
                    pf.productListRepo.sorts.get(i).setSelected(true);
                } else {
                    pf.productListRepo.sorts.get(i).setSelected(false);
                }
            }
        }
    }

    @OnClick (R.id.done)
    public void done() {
        if(productListFragment.productListRepo.useSortButton) {
            mainPanel.setVisibility(View.VISIBLE);
        } else {
            mainPanel.setVisibility(View.INVISIBLE);
        }
        if(title.getText().equals(getString(R.string.product_list_fragment_sort_filter))) {
            //if((pf.productListRepo.maxPrice != rangeSeekBar.getSelectedMaxValue().intValue()))
                pf.productListRepo.selectedMaxPrice = rangeSeekBar.getSelectedMaxValue().intValue();

            //if(pf.productListRepo.minPrice != rangeSeekBar.getSelectedMinValue().intValue())
                pf.productListRepo.selectedMinPrice =  rangeSeekBar.getSelectedMinValue().intValue();

            productListFragment.setDimmed();


            //Hawk.put(AppUtils.product_list_has_more, true);
            productListFragment.hasMore = true;
            productListFragment.reload = true;
            //showLoadingView();
            productListFragment.showProgressDialog();
            productListFragment.productListAdapter.page = 0;
            productListFragment.page = 0;
            productListFragment.callApi(0);
            productListFragment.recyclerView.stopScroll();
            productListFragment.staggeredGridLayoutManager.scrollToPositionWithOffset(0,0);

            if (productListFragment.headerCircleProductCategoryAdapter != null && productListFragment.headerCircleProductCategoryAdapter.getItemCount() > 0)
                AnimationHelper.slideFromTop(productListFragment.categoryRecyclerView, 115);

            //this.finish();
        } else {

            if(this.type.equals("category"))
                productListFragment.productListRepo.lastSelectedCategoryPosition = productSortingAdapter.position;


            if(this.type.equals("brand")) {
                //productListFragment.productListRep.lastSelectedBrandPosition = productSortingAdapter.position;
                if(productSortingAdapter.data != null) {
                    productListFragment.productListRepo.lastSelectedBrandPositions.clear();
                    for (int i = 0; i < productSortingAdapter.data.size(); i++) {
                        if(productSortingAdapter.data.get(i).selected)
                            productListFragment.productListRepo.lastSelectedBrandPositions.add(i);
                    }
                }
            }

            if(this.type.equals("special_offer")) {
                //productListFragment.productListRepo.lastSelectedPromotionPosition = productSortingAdapter.position;
                //facets
                if(productSortingAdapter.facets != null && productSortingAdapter.facets.get(0) != null) {
                    productListFragment.productListRepo.lastSelectedPromotionPositions.clear();

                    for(int i = 0; i < productSortingAdapter.facets.get(0).getValues().size(); i++) {
                        if(productSortingAdapter.facets.get(0).getValues().get(i).isSelected) {
                            productListFragment.productListRepo.lastSelectedPromotionPositions.add(i);
                        }
                    }
                }
            }

            if(this.type.equals("sort"))
                productListFragment.productListRepo.lastSelectedSortPosition = productSortingAdapter.position;


            setSelected();
            hideSortPanel();
            mainPanel.setVisibility(View.VISIBLE);
            listviewPanel.setVisibility(View.GONE);
            title.setText(getResources().getString(R.string.product_list_fragment_sort_filter));

            if(isAnyThingSet()) {
                back.setText(R.string.reset);
                back.setVisibility(View.VISIBLE);
            } else {
                //back.setVisibility(View.GONE);
            }
        }
    }

    @OnClick (R.id.special_offer)
    public void specialOffer() {
        title.setText(getResources().getString(R.string.special_offer));
        done.setText(getResources().getString(R.string.btn_done));
        setListViewPanel("special_offer");
    }

    @OnClick (R.id.category)
    public void category() {
        title.setText(getResources().getString(R.string.special_offer));
        done.setText(getResources().getString(R.string.btn_done));
        setListViewPanel("category");
    }

    @OnClick (R.id.brand)
    public void brand() {
        title.setText(getResources().getString(R.string.special_offer));
        done.setText(getResources().getString(R.string.btn_done));
        setListViewPanel("brand");
    }

    @OnClick (R.id.sort_by)
    public void sortingBy() {
        title.setText(getResources().getString(R.string.sort_by));
        done.setText(getResources().getString(R.string.btn_done));
        setListViewPanel("sort");
    }

    public String type;
    public void setListViewPanel(String type) {
        if(type.equals("category"))
            title.setText(getString(R.string.category));

        if(type.equals("brand"))
            title.setText(getString(R.string.brand));

        if(type.equals("special_offer"))
            title.setText(getString(R.string.special_offer));

        if(type.equals("sort"))
            title.setText(getString(R.string.sort_by));

        listviewPanel.setVisibility(View.VISIBLE);
        mainPanel.setVisibility(View.GONE);

        this.type = type;
        productSortingAdapter = new ProductSortingAdapter(type, pf, listview);
        listview.setAdapter(productSortingAdapter);
        listview.setOnItemClickListener(productSortingAdapter);

        back.setText(getString(R.string.btn_cancel));
        back.setVisibility(View.VISIBLE);
        done.setVisibility(View.VISIBLE);
    }

    public void hideSortPanel() {
        sortBySelected.setVisibility(View.VISIBLE);
        //back.setVisibility(View.GONE);
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

        if(type.equals(AppUtils.category_list)) {
            pf.productListRepo.categoryList = filterDatas;
        }

        if(type.equals(AppUtils.brand_list)) {
            pf.productListRepo.brandList = filterDatas;
        }

        if(type.equals(AppUtils.event_list)) {
            pf.productListRepo.eventList = filterDatas;
        }
        //Hawk.put(type, filterDatas);
        return filterDatas;
    }

    /*
    @Bind(R.id.sort_by_selected) TextView sortBySelected;
    @Bind(R.id.rank_selected) TextView rankSelected;
    @Bind(R.id.special_offer_selected) TextView specialOfferSelected;
    @Bind(R.id.category_selected) TextView categorySelected;
    @Bind(R.id.brand_selected) TextView brandSelected;
    data.get(position - 1).selected
*/
    public boolean anyThingSelected = false;
    public void setSelected() {
        //setNumberCount(categorySelected, categorySelectedArrow, pf.productListRepo.categoryList);
        //setNumberCount(brandSelected, brandSelectedArrow, pf.productListRepo.brandList);

        String sortTag = pf.productListRepo.sortTag;

        for(int i = 0; i < pf.productListRepo.sorts.size(); i++) {
            if(pf.productListRepo.sorts.get(i).isSelected()) {
                sortBySelected.setText(pf.productListRepo.sorts.get(i).getName());
                if(i > 0)
                    anyThingSelected = true;
            }
        }

        List<TextSearchResponse.Facet> facet = pf.productListRepo.facets;
        if(facet != null && facet.size() > 0) {
            specialOfferSelected.setText("");
            int count = 0;
            for (int i = 0; i < facet.get(0).getValues().size(); i++) {
                if(facet.get(0).getValues().get(i).isSelected) {
                    anyThingSelected = true;
                    count++;
                }
            }
            if(count > 0)
                specialOfferSelected.setText("" +count);
            else
                specialOfferSelected.setText(getString(R.string.any));
        }


        int count = 0;
        for(int i = 0; i < pf.productListRepo.newCatList.size(); i++) {
            if(pf.productListRepo.newCatList.get(i).selected) {
                anyThingSelected = true;
                count++;
                categorySelected.setText(pf.productListRepo.newCatList.get(i).getName());
            }
        }
        if(count == 0) categorySelected.setText(getString(R.string.any));

         count = 0;
        for(int i = 0; i < pf.productListRepo.brandList.size(); i++) {
            String textAdd = "";
            if(pf.productListRepo.brandList.get(i).selected) {
                anyThingSelected = true;
                count++;
                textAdd += (pf.productListRepo.brandList.get(i).getName()) + " ";
            }
            brandSelected.setText(count > 0 ? count + "": getString(R.string.any));
        }

        if(pf.productListRepo.selectedMinPrice != -1) {
            if (pf.productListRepo.selectedMinPrice != pf.productListRepo.minPrice)
                anyThingSelected = true;
        }

        if(pf.productListRepo.selectedMaxPrice != -1) {
            if (pf.productListRepo.selectedMaxPrice != pf.productListRepo.maxPrice)
                anyThingSelected = true;
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                rangeSeekBar.setVisibility(View.VISIBLE);

                rangeSeekBar.setRangeValues(productListFragment.productListRepo.minPrice, productListFragment.productListRepo.maxPrice);

                if(pf.productListRepo.selectedMinPrice != -1) {
                    if(pf.productListRepo.selectedMinPrice != pf.productListRepo.minPrice)
                        anyThingSelected = true;
                    rangeSeekBar.setSelectedMinValue(pf.productListRepo.selectedMinPrice);
                }

                if(pf.productListRepo.selectedMaxPrice != -1) {
                    if(pf.productListRepo.selectedMaxPrice != pf.productListRepo.maxPrice)
                        anyThingSelected = true;
                    rangeSeekBar.setSelectedMaxValue(pf.productListRepo.selectedMaxPrice);
                }
                //TODO
                //rangeSeekBar.setSelectedMaxValue(productListFragment.productListRepo.maxPrice);
                //rangeSeekBar.setSelectedMinValue(productListFragment.productListRepo.minPrice);

                //rangeSeekBar.setSelectedMinValue(0);
                //rangeSeekBar.setSelectedMaxValue(Integer.MAX_VALUE);


                //rangeSeekBar.setTextAboveThumbsColorResource(android.R.color.black);
                rangeSeekBar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener() {
                    @Override
                    public void onRangeSeekBarValuesChanged(RangeSeekBar bar, Object minValue, Object maxValue) {

                        back.setText(getString(R.string.reset));
                        back.setVisibility(View.VISIBLE);
                        done.setVisibility(View.VISIBLE);
                    }
                });

                rangeSeekBar.invalidate();
            }
        }, 300);

    }


    ProductListFragment productListFragment;
    public void setRootFragemnt(ProductListFragment productListFragment) {
        this.productListFragment = productListFragment;
    }

    public boolean isAnyThingSet() {
        if(sortBySelectedArrow.getVisibility() == View.VISIBLE)
            return true;
        if(specialOfferSelectedArrow.getVisibility() == View.VISIBLE)
            return true;
        if(categorySelectedArrow.getVisibility() == View.VISIBLE)
            return true;
        if(brandSelectedArrow.getVisibility() == View.VISIBLE)
            return true;

        return false;

/*
        @Bind(R.id.sort_by_selected_arrow) ImageView sortBySelectedArrow;
        @Bind(R.id.rank_selected_arrow) ImageView rankSelectedArrow;
        @Bind(R.id.special_offer_selected_arrow) ImageView specialOfferSelectedArrow;
        @Bind(R.id.category_selected_arrow) ImageView categorySelectedArrow;
        @Bind(R.id.brand_selected_arrow) ImageView brandSelectedArrow;*/
    }

    @OnClick ({R.id.price,R.id.range_bar})
    public void ignoreOnclick() {

    }
}
