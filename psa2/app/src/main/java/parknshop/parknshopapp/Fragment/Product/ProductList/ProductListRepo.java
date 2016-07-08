package parknshop.parknshopapp.Fragment.Product.ProductList;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.Model.FilterData;
import parknshop.parknshopapp.Model.TextSearchResponse;

/**
 * Created by hp on 23/4/2016.
 */
public class ProductListRepo {
    public String sortTag = "iwaBestSellerQty";
    public ArrayList<FilterData> categoryList = new ArrayList<>();
    public ArrayList<FilterData> brandList = new ArrayList<>();
    public ArrayList<FilterData> eventList = new ArrayList<>();
    public List<parknshop.parknshopapp.Model.Category.CategoryTree.Data.SubCategory> newCatList = new ArrayList<>();
    public List<TextSearchResponse.Facet> facets = new ArrayList<>();
    public List<TextSearchResponse.Sorts> sorts = new ArrayList<>();
    public boolean useSortButton = true;
    public boolean haveStock;
    public int selectedMinPrice = -1;
    public int selectedMaxPrice = -1;

    public int maxPrice;
    public int minPrice;

    public boolean firstRun = true;


    public int lastSelectedSortPosition;
    //public int lastSelectedPromotionPosition;
    public ArrayList<Integer> lastSelectedPromotionPositions = new ArrayList<>();
    public int lastSelectedCategoryPosition;
    public ArrayList<Integer> lastSelectedBrandPositions = new ArrayList<>();
    //public int lastSelectedBrandPosition;

    public ProductListRepo() {

    }

    public ProductListRepo (ProductListRepo p) {
        this.categoryList = p.categoryList;
        this.brandList = p.brandList;
        this.eventList = p.eventList;
        this.categoryList = p.categoryList;
        this.facets = p.facets;
        this.sorts = p.sorts;
        this.haveStock = p.haveStock;
        this.selectedMinPrice = p.selectedMinPrice;
        this.selectedMaxPrice = p.selectedMaxPrice;
        this.maxPrice = p.maxPrice;
        this.minPrice = p.minPrice;
    }

    public void reset() {
        for(int i = 0; i < brandList.size(); i++)
            brandList.get(i).selected = false;

        for(int i = 0; i < newCatList.size(); i++)
            newCatList.get(i).selected = false;

        for(int i = 0; i < eventList.size(); i++)
            eventList.get(i).selected = false;

        if(facets != null && facets.size() > 0) {
            for (int i = 0; i < facets.get(0).getValues().size(); i++)
                facets.get(0).getValues().get(i).isSelected = false;
        }

        for(int i = 1; i < sorts.size(); i++) {
            sorts.get(i).setSelected(false);
        }

        sorts.get(0).setSelected(true);

        selectedMinPrice = -1;
        selectedMaxPrice = -1;

        lastSelectedSortPosition = 0;
        //lastSelectedPromotionPosition = 0;
        lastSelectedPromotionPositions.clear();
        lastSelectedCategoryPosition = 0;
        lastSelectedBrandPositions.clear();
        //lastSelectedBrandPosition = 0;
    }
}