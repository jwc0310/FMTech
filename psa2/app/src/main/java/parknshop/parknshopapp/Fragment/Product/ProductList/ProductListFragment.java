package parknshop.parknshopapp.Fragment.Product.ProductList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.AnimationHelper;
import parknshop.parknshopapp.EventUpdate.WishListUpdatedEvent;
import parknshop.parknshopapp.Fragment.Dialog.SimpleConfirmDialogFragment;
import parknshop.parknshopapp.Fragment.Product.ProductDetail.ProductDetailEvent;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductSorting.ProductSortingFragment;
import parknshop.parknshopapp.Fragment.StoreLocator.StoreLocatorListFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.HistoryHelper;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.Category.SubCategory;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.PromotionItemResponse;
import parknshop.parknshopapp.Model.PromotionResponse;
import parknshop.parknshopapp.Model.StoreListResponse;
import parknshop.parknshopapp.Model.StoreLocatorResponse;
import parknshop.parknshopapp.Model.TextSearchResponse;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.AddShoppingCartEvent;
import parknshop.parknshopapp.Rest.event.CustomizeProductEvent;
import parknshop.parknshopapp.Rest.event.GetProductsByCatResponseEvent;
import parknshop.parknshopapp.Rest.event.GetProductsByTextSearchResponseEvent;
import parknshop.parknshopapp.Rest.event.MultipleProductsEvent;
import parknshop.parknshopapp.Rest.event.PromotionItemEvent;
import parknshop.parknshopapp.Rest.event.RelatedProductEvent;
import parknshop.parknshopapp.Rest.event.StoreListEvent;
import parknshop.parknshopapp.Rest.event.StoreLocatorResponseEvent;
import parknshop.parknshopapp.Rest.event.WishListResponseEvent;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.Utils.Utils;
import parknshop.parknshopapp.View.ShoppingCartAddMinusCountPanel;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 11/3/16.
 */
public class ProductListFragment extends ProductSortingFragment {
    public String titleString;
    public static String GATag = "";

    @Bind(R.id.search_bar)
    View search_bar;
    @Bind(R.id.edtProductSearch)
    EditText edtProductSearch;

    public @Bind (R.id.category_recycler_view) RecyclerView categoryRecyclerView;
    public @Bind (R.id.recycler_view) RecyclerView recyclerView;
    public @Bind (R.id.items) TextView items;
    public @Nullable @Bind (R.id.cart_panel) View cartPanel;
    public @Nullable @Bind (R.id.small_progress) View smallProgress;

    //public @Bind (R.id._item_added) TextView itemAddedTextView;
    //public @Bind (R.id._money_needed_for_free_delivery) TextView moneyNeededForFreeDeliveryTextView;
    //public @Bind (R.id.delivery_progress_bar) ProgressBar deliveryProgressBar;

    //public @Bind (R.id.items) TextView items;
    public @Bind (R.id.sort_root) View sortRoot;
    public @Bind (R.id.sorting_dimmed) View dimmed;

    public @Bind (R.id.no_item_found) TextView no_item_found;
    public @Bind (R.id.sort) View sortButton;

    public @Bind (R.id.buttom_layout) LinearLayout bottomLayout;
    public @Bind (R.id.progressBar) ProgressBar progressBar;

    public @Bind (R.id.add_to_wish_list) ImageView btnAddToWishList;
    public @Bind (R.id.add_to_my_panel) View addToMyListPanel;

    //public CategoryViewPagerAdapter categoryViewPagerAdapter;
    public ProductListAdapter productListAdapter;
    public HeaderCircleProductCategoryAdapter headerCircleProductCategoryAdapter;

    public String headerId;
    public String categoryId;
    private int position;
    public int page;
    private String searchText;

    public boolean reload;
    public boolean hasMore = true;
    public boolean showMenuButton;

    public boolean searchByText;
    public boolean showBackButton;
    public boolean isCrazySale = false;
    public boolean isCategoryWrapping = false;
    String subCategoryType;

    public static int unique_fragment_count = 0;
    public int unique_fragment_id = 0;

    public ProductListRepo productListRepo = new ProductListRepo();

    CategoryDrawerItem childdata;
    PromotionResponse.Data mPromotionData;

    public String productId = "";
    public ArrayList<String> productIds = new ArrayList<>();
    public boolean isAnimationAdded;
    public boolean showProgressDialog;
    public boolean setTitle = true;
    public String headerImage;

    public void setGATag(String GATag) {
        this.GATag = GATag;
    }

    public static String getGATag() {
        return GATag;
    }

    public static ProductListFragment newInstance(String productId, boolean isFromSearch) {
        ProductListFragment productListFragment = new ProductListFragment();

        Bundle args = new Bundle();
        args.putString("productId", productId);

        LogUtil.info("", "getGATag:"+getGATag());

        productListFragment.setArguments(args);
        productListFragment.unique_fragment_id = unique_fragment_count++;
        productListFragment.searchByText = isFromSearch;
        return productListFragment;
    }

    public static ProductListFragment newInstance(ArrayList<String> productIds) {
        ProductListFragment productListFragment = new ProductListFragment();

        LogUtil.info("", "getGATag1:"+getGATag());

        productListFragment.productIds = productIds;
        productListFragment.unique_fragment_id = unique_fragment_count++;
        return productListFragment;
    }

    public static ProductListFragment newInstance(int page, String searchText, boolean isFromSearch) {
        ProductListFragment productListFragment = new ProductListFragment();

        Bundle args = new Bundle();
        args.putString("searchText", searchText);
        args.putInt("page", page);
        args.putString("title", searchText);
        LogUtil.info("", "searchByText1:"+isFromSearch + ", "+searchText);

        LogUtil.info("", "getGATag2:"+getGATag());

        productListFragment.setArguments(args);
        productListFragment.unique_fragment_id = unique_fragment_count++;
        productListFragment.searchByText = isFromSearch;
        return productListFragment;
    }

    public boolean isSideMenu;
    public static ProductListFragment newInstance(int id, CategoryDrawerItem childdata, boolean isFromSearch) {
        ProductListFragment productListFragment = new ProductListFragment();

        Bundle args = new Bundle();
        args.putString("categoryType", childdata.getName());

        LogUtil.info("", "getGATag3:"+getGATag());

        productListFragment.setArguments(args);
        productListFragment.unique_fragment_id = unique_fragment_count++;
        productListFragment.childdata = childdata;
        productListFragment.isSideMenu = true;
        productListFragment.searchByText = isFromSearch;
        return productListFragment;
    }

    public boolean isHappyTime;
    // Happytime
    public static ProductListFragment newInstance(PromotionResponse.Data promotionData, SubCategory subCategory, int page, String searchText, boolean isFromSearch) {
        ProductListFragment productListFragment = new ProductListFragment();

        Bundle args = new Bundle();
        args.putString("searchText", searchText);
        args.putInt("page", page);
        args.putString("title", searchText);
        args.putString("categoryId", subCategory.getValue());
        args.putString("categoryType", subCategory.getContentType());

        LogUtil.info("", "getGATag4:"+getGATag());

        productListFragment.isHappyTime = true;
        productListFragment.mPromotionData = promotionData;
        productListFragment.setArguments(args);
        productListFragment.unique_fragment_id = unique_fragment_count++;
        productListFragment.searchByText = isFromSearch;

        return productListFragment;
    }

    public static ProductListFragment newInstance(String categoryId, String title) {
        ProductListFragment productListFragment = new ProductListFragment();

        Bundle args = new Bundle();
        args.putString("categoryId", categoryId);
        args.putString("title", title);

        LogUtil.info("", "getGATag5:"+getGATag());

        productListFragment.setArguments(args);
        productListFragment.unique_fragment_id = unique_fragment_count++;
        productListFragment.searchByText = false;

        return productListFragment;
    }


    public static ProductListFragment newInstance(String categoryId, int position) {
        ProductListFragment productListFragment = new ProductListFragment();

        Bundle args = new Bundle();
        args.putString("categoryId", categoryId);
        args.putInt("position", position);

        LogUtil.info("", "getGATag6:"+getGATag());

        productListFragment.setArguments(args);
        productListFragment.unique_fragment_id = unique_fragment_count++;
        productListFragment.searchByText = false;

        return productListFragment;
    }

    View view;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = getActivity().getLayoutInflater().inflate(R.layout.productlist_fragment_layout, null);
        ButterKnife.bind(this, view);

        ProductListPresenter.resetValue(this);

        if(getArguments() != null)
            productId = getArguments().getString("productId", "");


//        if(!TextUtils.isEmpty(productId)){
////            GATrackerHelper.getInstance(getActivity()).setGATracker("product-" + GATag, "bp_" + productId);
//            GATrackerHelper.getInstance(getActivity()).setGATracker("product-" + GATag, "bp_" + productId);
//        }

        ProductListPresenter.resetValue(this);
        ProductListPresenter.initRecyclerView(recyclerView, this);
        ProductListPresenter.initHorizontalRecyclerView(categoryRecyclerView, this);

        productListAdapter = new ProductListAdapter(this);
        productListAdapter.setWishList();
        productListAdapter.isCrazySale = isCrazySale;

        if(getArguments() != null)
            subCategoryType = getArguments().getString("categoryType");

        //LogUtil.info("", "searchByText2:"+searchByText + ", "+getArguments().getString("searchText", ""));
        if(searchByText){
            //search_bar.setVisibility(View.VISIBLE);
            productListAdapter.searchByText = searchByText;
            categoryRecyclerView.setVisibility(View.GONE);
            searchText = getArguments().getString("searchText", "");
            edtProductSearch.setText(searchText);
            page = getArguments().getInt("page", 0);
//            WebServiceModel.getInstance(getActivity()).requestGetProductsByTextSearch(getActivity(), searchText, page + "", "iwaBestSellerQty");
            callApi(page);
        } else {
            if(getArguments() != null) {
                categoryId = getArguments().getString("categoryId");
                position = getArguments().getInt("position", 0);
            }
            callApi(0);
        }

        edtProductSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH || actionId == 0) {

                    WebServiceModel.getInstance(getActivity()).requestGetProductsByTextSearch(getActivity(), edtProductSearch.getText().toString(), "0", "iwaBestSellerQty", this.hashCode());


                    ArrayList<String> searchHistoryList = new ArrayList<String>();
                    if(Hawk.get(AppUtils.search_history_list) != null){
                        searchHistoryList.addAll((Collection<? extends String>) Hawk.get(AppUtils.search_history_list));
                    }
                    searchHistoryList.add(edtProductSearch.getText().toString());

                    Hawk.put(AppUtils.search_history_list, searchHistoryList);

                    placeFragmentWithBackStack(ProductListFragment.newInstance(0, edtProductSearch.getText().toString(), true));

                    // clear text
                    edtProductSearch.setText(null);

                    // hide keyboard
//                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(
//                            Context.INPUT_METHOD_SERVICE);
//                    imm.hideSoftInputFromWindow(edtProductSearch.getWindowToken(), 0);
                    hideKeyboard();

                }
                return false;
            }
        });

        header.setOnClickListener(null);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        setRootFragemnt(this);

        showToolbar();
        if(isCrazySale || isCategoryWrapping) {
            categoryRecyclerView.setVisibility(View.GONE);
        }

        if(isCrazySale) {
            disableNavigationDrawer();
            showBackButton();
            items.setVisibility(View.GONE);
            enableSecondRightButton();
            if(isCrazySale)
                showShoppingCartButton();
            if(searchByText)
                disableCartButton();
        } else {
            if(categoryId != null && categoryId.length() > 0) {
                showMenuButton();
            } else if(productId.length() > 0 || searchByText) {
                showBackButton();
            } else if(showBackButton) {
                showBackButton();
            }
            enableSecondRightButton();
            enableNavigationDrawer();
            enableSearchButton();
            showShoppingCartButton();
        }

        if(toolbarTitle != null)
            setToolbarTitle(toolbarTitle);

        if(product != null)
            setToolbarTitle(product.getName());

        if((childdata != null && childdata.text != null || mPromotionData != null)) {
            if(setTitle)
                setToolbarTitle(childdata != null ? childdata.text : mPromotionData != null ? mPromotionData.getTitle() : "");
        } else if(getArguments() != null && getArguments().getString("title") != null) {
            setToolbarTitle(getArguments().getString("title"));
        }
        //Log.i("isCrazySale", "isCrazySale:" + isCrazySale + ", " + isCategoryWrapping + " " + searchByText + " " + productId + " " + showBackButton + " " );

        if(showMenuButton) {
            showMenuButton();
        }
        return view;
    }

    public String toolbarTitle;
    @Override
    public void onResume() {
        super.onResume();
        //updateWishListBtn();
        showToolbar();
    }

    public void onDestroy() {
        super.onDestroy();
        ProductListPresenter.resetValue(this);
    }

    public void callApi(int page) {
        if(!productListAdapter.isCallingApi) {
            String queryText =  searchByText ? searchText : ProductListPresenter.getQueryString(this);

            if(productId.length() > 0) {
                callProductDetailPageApi();
            } else if(productIds != null && productIds.size() > 0) {
                
                String query = ":iwaBestSellerQty";
                for(int i = 0; i < productIds.size(); i++){
                    query = query+":defaultVariantCode:"+ productIds.get(i);
                }
                //String query, String currentPage, String sort, int successId
                //if(customizeProductEvent.getPage() != productListAdapter.page || productListAdapter.page == 0)
                WebServiceModel.getInstance(getActivity()).requestGetProductsByTextSearch(getActivity(), query, "" + page, "", this.hashCode());

            } else if(searchByText) {
                callSearchApi(searchText, page);
            } else if(childdata != null || mPromotionData != null){
                callSubCategoryApi(page);
            } else {
                WebServiceModel.getInstance(getActivity()).requestProductList(categoryId, page + "", ProductListPresenter.getQueryString(this), "Cat", this.hashCode(), null);
            }
            productListAdapter.isCallingApi = true;
        }
    }

    public void callProductDetailPageApi() {
        //Log.i("productlist:detail", "productlist:detail");
        //showProgressDialog();
        productListAdapter.isProductDetail = true;
        productListAdapter.hasHeader = false;
        WebServiceModel.getInstance(getActivity()).requestGetProduct(String.valueOf(productId), this.hashCode());
        //WebServiceModel.getInstance(getBaseActivity()).requestRelatedProductsById(productId + "");
        //WebServiceModel.getInstance(getActivity()).requestProductList("010100", 0 + "", ProductListPresenter.getQueryString(this), "Cat", this.hashCode(), null);
    }

    public void callSearchApi(String queryText, int page) {
        //Log.i("productlist:search", "productlist:search");
        //showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestGetProductsByTextSearch(getActivity(), queryText, page + "", "iwaBestSellerQty", this.hashCode());
    }

    public void callSubCategoryApi(int page) {
        //if(showProgressDialog)
        //    showProgressDialog();

        if(childdata != null) {
            String subCategoryType = childdata.getSubCategory().getContentType();  //Content type

            String value = childdata.getSubCategory().getValue();

            //Log.i("subcategoryType", "subcategoryType " + subCategoryType + " " + value);

            if(subCategoryType.equals(GlobalConstant.CATEGORY)){
                WebServiceModel.getInstance(getActivity()).requestProductList(value, page + "", ProductListPresenter.getQueryString(this), "Cat", this.hashCode(), subCategoryType);
            } else if(subCategoryType.equals(GlobalConstant.PROMOTION_TAG)){
                //https://www.parknshop.com/rest/v1/hybris/products/tag/pro25003
                //WebServiceModel.getInstance(getActivity()).requestProductList(value, page +"", ProductListPresenter.getQueryString(this), "Cat", this.hashCode(), subCategoryType);
                //WebServiceModel.getInstance(getActivity()).requestProductListByTag(value);
                WebServiceModel.getInstance(getBaseActivity()).requestProductListByTag(value, ProductListPresenter.getQueryString(this), page, this.hashCode(), subCategoryType);
            } else if(subCategoryType.equals(GlobalConstant.BRAND)){
                //!? WebServiceModel.getInstance(getActivity()).requestGetProductsByTextSearch(getActivity(), value, page + "", "iwaBestSellerQty", this.hashCode());
                WebServiceModel.getInstance(getActivity()).requestProductList(value, page +"", ProductListPresenter.getQueryString(this), "BRAND", this.hashCode(), subCategoryType);
            } else if(subCategoryType.equals(GlobalConstant.CUSTOMIZE_PRODUCT)){
                WebServiceModel.getInstance(getActivity()).requestGetCustomizeProducts(value, page, this.hashCode());
            } else if(subCategoryType.equals(GlobalConstant.ONLINE_PROMOTION) || subCategoryType.equals(GlobalConstant.NEW_PROMOTION)) {
                WebServiceModel.getInstance(getActivity()).requestProductList(value, page + "", this.hashCode(), subCategoryType, ProductListPresenter.getQueryString(this));
                //WebServiceModel.getInstance(getActivity()).requestProductList(value, page + "", ProductListPresenter.getQueryString(this), "Cat", this.hashCode(), subCategoryType);
            } else if (subCategoryType.equals(GlobalConstant.HAPPY_TIME)) {
                WebServiceModel.getInstance(getBaseActivity()).requestGetPromotionListItem(getBaseActivity(), value + "", GlobalConstant.HAPPY_TIME);
            } else if (subCategoryType.equals(GlobalConstant.PROMTOION)) {
                WebServiceModel.getInstance(getBaseActivity()).requestGetPromotionListItem(getBaseActivity(), value + "", GlobalConstant.PROMTOION);
            }

        } else if(mPromotionData != null){
            sortButton.setVisibility(View.GONE);

            //Log.i("mPromotion", "mPromotion " + mPromotionData.getId());
            //WebServiceModel.getInstance(getBaseActivity()).requestGetPromotionListItem(getBaseActivity(), mPromotionData.getId() + "", GlobalConstant.PROMTOION);

            if(mPromotionData.getPromotionType().equals("a")) {
                sortButton.setVisibility(View.GONE);
                WebServiceModel.getInstance(getBaseActivity()).requestGetPromotionListItem(getBaseActivity(), mPromotionData.getId() + "", GlobalConstant.PROMTOION);
            } else {
                progressBar.setVisibility(View.GONE);
                ProductListCallback uiCallback = new ProductListCallback(this);
                uiCallback.setPromotionData(mPromotionData);
                uiCallback.run();
            }
        }
    }

    public void onEvent(PromotionItemEvent event) {
        PromotionItemResponse promotionItemResponse = event.getPromotionItemResponse();
        mPromotionData = promotionItemResponse.getData();

        if(mPromotionData.getPromotionType().equals("a")) {
            String query = ":iwaBestSellerQty";
            for(int i = 0; i < mPromotionData.getPromotionItemSet().size(); i++){
                query = query+":defaultVariantCode:"+mPromotionData.getPromotionItemSet().get(i).getValue();
            }
            WebServiceModel.getInstance(getActivity()).requestGetMultipleProducts(getActivity(), "Cat", query, 0);
        } else {
            ProductListCallback uiCallback = new ProductListCallback(this);
            uiCallback.setPromotionData(promotionItemResponse.getData());
            uiCallback.run();
        }
    }

    public void onEvent(MultipleProductsEvent event) {
        showBackButton();
        //progressBar.setVisibility(View.GONE);
        sortButton.setVisibility(View.GONE);

        ProductListCallback uiCallback = new ProductListCallback(this);

        TextSearchResponse textSearchResponse = new TextSearchResponse();

        textSearchResponse.setProducts(event.getTextSearchResponse().getProducts());
        textSearchResponse.setTotalResult(event.getTextSearchResponse().getProducts().size());

        uiCallback.textSearchResponse = textSearchResponse;
        uiCallback.setPromotionData(mPromotionData);
        uiCallback.productListAdapter.hasHeader = true;
        hasMore = false;
        uiCallback.run();
    }

//    public void onEvent(GetProductsByCatResponseEvent getProductsByCatResponseEvent) {
//        hideLoadingView();
//        hideProgressDialog();
//        progressBar.setVisibility(View.GONE);
//
//        if(this.hashCode() != getProductsByCatResponseEvent.getSuccessCode())
//            return;
//
//        if(getProductsByCatResponseEvent.getSuccess()){
//
//            Log.i("", "getProductsByCatResponseEvent32312:"+getProductsByCatResponseEvent.getTextSearchResponse().getProducts().size());
//            ProductListCallback uiCallback = new ProductListCallback(this);
//            uiCallback.textSearchResponse = getProductsByCatResponseEvent.getTextSearchResponse();
//            uiCallback.setPromotionData(mPromotionData);
//            uiCallback.clearData(getProductsByCatResponseEvent.getTextSearchResponse());
//            uiCallback.run();
//        } else {
//            ToastUtils.show(getActivity(), getProductsByCatResponseEvent.getMessage());
//        }
//    }


    public String subCategory;
    //:iwaBestSellerQty:defaultVariantCode:101758:defaultVariantCode:119821:defaultVariantCode:339681:defaultVariantCode:370020:defaultVariantCode:38903
    public void onEvent(CustomizeProductEvent customizeProductEvent){
        hideProgressDialog();
        progressBar.setVisibility(View.GONE);

        if(!customizeProductEvent.getSuccess()){
            ToastUtils.show(getActivity(), customizeProductEvent.getMessage());
        }else if(this.hashCode() == customizeProductEvent.getSuccessCode()){
            String query = ":iwaBestSellerQty";
            for(int i = 0; i < customizeProductEvent.getCustomizeProductResponse().getData().getProducts().size(); i++){
                query = query+":defaultVariantCode:"+customizeProductEvent.getCustomizeProductResponse().getData().getProducts().get(i).getProductId();
            }
            //String query = "";
            //for(int i = 0; i < customizeProductEvent.getCustomizeProductResponse().getData().getProducts().size(); i++)
            //   query += customizeProductEvent.getCustomizeProductResponse().getData().getProducts().get(i).productId + ",";

            //WebServiceModel.getInstance(getActivity()).requestGetMultipleProducts(query);
            subCategory = "customize";
            //Log.i("productlist:sidemenu", "productlist:sidemenu " + childdata.getSubCategory().getContentType() + " " + GlobalConstant.CUSTOMIZE_PRODUCT + " " + query + " " + productListAdapter.page + " " + customizeProductEvent.getPage());
            //if(customizeProductEvent.getPage() != productListAdapter.page || productListAdapter.page == 0)
            WebServiceModel.getInstance(getActivity()).requestGetProductsByCat(getActivity(), "Cat", query, customizeProductEvent.getPage(), this.hashCode());
        }
    }

    public String getPromotionString(PromotionResponse.Data mPromotionData) {
        String query = ":iwaBestSellerQty";
        for(PromotionResponse.Data.PromotionItemSet promotionItemSet : mPromotionData.getPromotionItemSet()){
            query = query+":defaultVariantCode:"+promotionItemSet.getValue();
        }
        return query;
    }

    Product product;
    ShoppingCartAddMinusCountPanel shoppingCartAddMinusCountPanel;
    List<Product> redemptionProductList;
    public void onEvent(ProductDetailEvent productDetailEvent) {
        hideProgressDialog();
        //progressBar.setVisibility(View.GONE);

        if(productDetailEvent.getSuccess() && this.hashCode() == productDetailEvent.getSuccessCode()) {
            sortButton.setVisibility(View.GONE);
            bottomLayout.setVisibility(View.VISIBLE);
            bottomLayout.setOnClickListener(null);

            this.product = productDetailEvent.getProduct();

            GATrackerHelper.getInstance(getActivity()).setName(product.getName());
            GATrackerHelper.getInstance(getActivity()).setId("bp_" + product.getCode());
            GATrackerHelper.getInstance(getActivity()).setQuantity(1);
            GATrackerHelper.getInstance(getActivity()).setPrice(product.getPriceValue());
            GATrackerHelper.getInstance(getActivity()).setVariant(product.getVariantType());


            String productUrl = product.getUrl().length() > 0 ? product.getUrl().substring(1).toLowerCase() :  product.getUrl().toLowerCase();

            LogUtil.info("", "searchByText:"+searchByText+", "+productUrl);

            GATrackerHelper.getInstance(getActivity()).sendProductToGA(GATrackerHelper.getInstance(getActivity()).getCategory() + productUrl, product.getUrl());

            GATrackerHelper.getInstance(getActivity()).setGATracker(GATrackerHelper.getInstance(getActivity()).getCategory() + productUrl);

            if(searchByText)
                HistoryHelper.addToList(getActivity(), product);

            shoppingCartAddMinusCountPanel = new ShoppingCartAddMinusCountPanel(bottomLayout, product, getBaseActivity());
            shoppingCartAddMinusCountPanel.isProductDetailController = true;
            shoppingCartAddMinusCountPanel.countView.setVisibility(View.GONE);
            shoppingCartAddMinusCountPanel.editCount.setText("1");
            shoppingCartAddMinusCountPanel.editCount.setVisibility(View.VISIBLE);
            shoppingCartAddMinusCountPanel.productListFragment = this;

            redemptionProductList = product.getPnsRedemptionProductDatas();
            TextSearchResponse textSearchResponse = new TextSearchResponse();
            textSearchResponse.setProducts(product.getPnsRedemptionProductDatas());

            ProductListCallback uiCallback = new ProductListCallback(this);
            uiCallback.textSearchResponse = textSearchResponse;
            uiCallback.isProductDetail = true;
            uiCallback.run();


            updateWishListBtnAtDetailPage();

            WebServiceModel.getInstance(getBaseActivity()).requestRelatedProductsById(productId + "", this.hashCode());
        } else if(this.hashCode() == productDetailEvent.getSuccessCode()){
            SimpleConfirmDialogFragment dialog = new SimpleConfirmDialogFragment();
            dialog.message = getString(R.string.product_detail_not_for_sell);
            dialog.dial = false;
            dialog.showCancel = false;
            dialog.show( getBaseActivity().getSupportFragmentManager(), "");
        }
    }

    public void onEvent(GetProductsByCatResponseEvent getProductsByCatResponseEvent) {
        hideLoadingView();
        hideProgressDialog();
        //progressBar.setVisibility(View.GONE);

        if(this.hashCode() != getProductsByCatResponseEvent.getSuccessCode())
            return;

        if(getProductsByCatResponseEvent.getSuccess()){

            //Log.i("", "getProductsByCatResponseEvent32312:"+getProductsByCatResponseEvent.getTextSearchResponse().getProducts().size());
            ProductListCallback uiCallback = new ProductListCallback(this);
            uiCallback.textSearchResponse = getProductsByCatResponseEvent.getTextSearchResponse();
            uiCallback.setPromotionData(mPromotionData);
            uiCallback.clearData(getProductsByCatResponseEvent.getTextSearchResponse());
            uiCallback.run();
        } else {
            ToastUtils.show(getActivity(), getProductsByCatResponseEvent.getMessage());
        }
    }


    public void onEvent(GetProductsByTextSearchResponseEvent getProductsByTextSearchResponseEvent) {
        hideLoadingView();
        hideProgressDialog();
        //progressBar.setVisibility(View.GONE);

        if(getProductsByTextSearchResponseEvent.getSuccess()) {
            if (getProductsByTextSearchResponseEvent.successCode != this.hashCode()) return;

            if (!getProductsByTextSearchResponseEvent.getSuccess()) {
                ToastUtils.show(getActivity(), getProductsByTextSearchResponseEvent.getMessage());
            }
            ProductListCallback uiCallback = new ProductListCallback(this);
            uiCallback.textSearchResponse = getProductsByTextSearchResponseEvent.getTextSearchResponse();
            uiCallback.run();
        } else {
            ToastUtils.show(getBaseActivity(), getResources().getString(R.string.common_google_play_services_network_error_title));
        }
    }

    public void onPause() {
        dimmed.setVisibility(View.GONE);
        AnimationHelper.slideToBottom(sortRoot);
        hideKeyboard(getBaseActivity());
        super.onPause();
        //sortRoot.setVisibility(View.GONE);
    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @OnClick (R.id.sort)
    public void sort() {
        //startActivityForResult(new Intent(getActivity(), ProductSortingActivity.class), 0);
        //sortRoot.setVisibility(View.VISIBLE);
        dimmed.setVisibility(View.VISIBLE);
        //sortRoot.setVisibility(View.VISIBLE);
        AnimationHelper.slideFromBottom(sortRoot);
        recyclerView.stopScroll();
        init(this);
    }

    @OnClick (R.id.sorting_dimmed)
    public void setDimmed() {
        dimmed.setVisibility(View.GONE);
        AnimationHelper.slideToBottom(sortRoot);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //in fragment class callback
        //Hawk.put(AppUtils.product_list_has_more, true);
        reload = true;
        callApi(0);
    }

    public void onEvent(WishListUpdatedEvent wishListUpdatedEvent) {
        //ToastUtils.show(getBaseActivity(), "Wish List updated");
        updateWishListBtn();
    }

    public void updateWishListBtn(){
        if(productListAdapter != null){
            productListAdapter.setWishList();
            productListAdapter.notifyDataSetChanged();
        }
    }


    @Nullable @OnClick(R.id.add_to_wish_list)
    public void btnAddToWishList(){


        WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);
        WishListResponse currwishListResponse = null;
        int qty = 0;

        if(wishListResponses != null) {
            for (WishListResponse wishListResponse : wishListResponses) {
                for (WishListResponse.Entry tempEntry : wishListResponse.getEntries()) {
                    if (tempEntry.getProduct().getCode().equals(product.getCode())) {
                        qty = tempEntry.getQuantity();
                        currwishListResponse = wishListResponse;
                        continue;
                    }
                }
            }
        }
        final WishListResponse finalCurrwishListResponse = currwishListResponse;

        if (finalCurrwishListResponse == null) {
            ((OneActivity) getBaseActivity()).addToWishList(product, -1);
        } else {
            showProgressDialog();
            WebServiceModel.getInstance(getBaseActivity()).requestRemoveProductFromWishList(getBaseActivity(), finalCurrwishListResponse.getPrimaryKey(), qty, product.getCode());
        }
    }

    boolean alreadyAdded;
    public void updateWishListBtnAtDetailPage() {
        WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);

        if(product == null || wishListResponses == null) {
            return;
        }

        for(WishListResponse wishListResponse : wishListResponses){
            for(WishListResponse.Entry entry : wishListResponse.getEntries()) {
                if (entry.getProduct().getCode().equals(product.getCode())){
                    Glide.with(getActivity()).load(R.drawable.on_sale_tag_heart).into(btnAddToWishList);
                    alreadyAdded = true;
                    continue;
                }
            }
        }
    }

    //    public @Bind (R.id._item_added) TextView itemAddedTextView;
//    public @Bind (R.id._money_needed_for_free_delivery) TextView moneyNeededForFreeDeliveryTextView;

    public void onEvent(WishListResponseEvent event) {
        WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);
        WishListResponse currwishListResponse = null;
        int qty = 0;

        if(product != null) {
            for (WishListResponse wishListResponse : wishListResponses) {
                for (WishListResponse.Entry tempEntry : wishListResponse.getEntries()) {
                    if (tempEntry.getProduct().getCode().equals(product.getCode())) {
                        qty = tempEntry.getQuantity();
                        currwishListResponse = wishListResponse;
                        continue;
                    }
                }
            }

            final WishListResponse finalCurrwishListResponse = currwishListResponse;

            if (finalCurrwishListResponse != null)
                Glide.with(getBaseActivity()).load(R.drawable.on_sale_tag_heart).into(btnAddToWishList);
            else
                Glide.with(getBaseActivity()).load(R.drawable.on_sale_tag_heart_dim).into(btnAddToWishList);
        }

        if(event.type != null && event.type.equals("add")) {
            AnimationHelper.slideFromTop(addToMyListPanel, Utils.dpToPxHeight(90, getBaseActivity()));

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    AnimationHelper.slideToTop(addToMyListPanel, Utils.dpToPxHeight(90, getBaseActivity()));
                }
            };

            Handler h = new Handler();
            h.postDelayed(runnable, 3000);
        }
    }

    public boolean isLoadingCart;
/*
    public void onEvent(CartEvent event) {
       // Log.i("yoyoyoyo", "yoyyooyyo" + event.getType());
        super.onEvent(event);
        if(event.getSuccess() ) {
            CartResponse cartResponse = event.getCartResponse();
            int totalItem = cartResponse.getTotalUnitCount();
            if (event.getType().equals("add") || (event.getType().equals("edit")) ) {

                itemAddedTextView.setText(getString(R.string.productlist_fragment_cart_panel_item_added).replace("%s", totalItem + ""));

                if(Float.parseFloat(cartResponse.getTotalPrice().replace(",", "").substring(3)) >= 500)
                    moneyNeededForFreeDeliveryTextView.setText(getString(R.string.you_can_enjoy_free_delivery));
                else
                    moneyNeededForFreeDeliveryTextView.setText(getString(R.string.productlist_fragment_cart_panel_money_for_free_delivery).replace("%s", String.format("%.2f",500 - Float.parseFloat(cartResponse.getTotalPrice().substring(3))) + ""));

                itemAddedTextView.setVisibility(View.VISIBLE);
                moneyNeededForFreeDeliveryTextView.setVisibility(View.VISIBLE);

                //AnimationHelper.slideFromTop(cartPanel, 95);

                deliveryProgressBar.setProgress((int)(Float.parseFloat(cartResponse.getTotalPrice().replace(",", "").substring(3)) / 500 * 100));
                //Log.i("yoyoyoyo", "yoyyooyyo" + event.getType() + "add animation");

                smallProgress.setVisibility(View.GONE);

                isLoadingCart = false;

                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if(!isLoadingCart)
                            AnimationHelper.slideToTop(cartPanel, 95);
                    }
                };
                Handler h = new Handler();
                h.postDelayed(runnable, 3000);
            }
        }
    }*/


    public void onEvent (RelatedProductEvent relatedProductEvent) {
        hideProgressDialog();
        //productListAdapter.isRelatedProduct = true;
        if(relatedProductEvent.getSuccess() && this.hashCode() == relatedProductEvent.getSuccessCode()) {
            productListAdapter.relatedProductList = relatedProductEvent.getResponse().getProducts();

            if (redemptionProductList.size() == 0)
                productListAdapter.isRelatedProduct = true;

            productListAdapter.notifyDataSetChanged();
        }
        //for(int i = 0; i < Math.max(productListAdapter.relatedProductList.size(), productListAdapter.productList.size()); i++)
        //    productListAdapter.notifyItemChanged( (productListAdapter.hasHeader ? 1 : 0) + i);
    }


    public void onEvent(StoreLocatorResponseEvent event) {
        //Log.i("" , event.getSuccessCode() + " " + this.hashCode() + " " + event.getMessage() + " " + this.productId + "  ");
        if(event.getSuccessCode() == this.hashCode()) {
            if(event.getMessage().equals(this.productId)) {
                StoreLocatorResponse storeLocatorResponse = (StoreLocatorResponse) event.getDataObject();

                ArrayList<StoreLocatorResponse.StoreLcoatorItem> storeLocatorItems = storeLocatorResponse.getStoreLcoatorItems();
                Hawk.put(AppUtils.store_locator_product_item, storeLocatorItems);

                ArrayList<StoreListResponse.Store> storeList = Hawk.get(AppUtils.store_locator_store_list, new ArrayList<StoreListResponse.Store>());

                //if(storeList == null || storeList.size() == 0) {
                WebServiceModel.getInstance(getBaseActivity()).requestGetStoreList();

                /*} else if(storeList != null && storeList.size() > 0) {
                    hideProgressDialog();
                    StoreLocatorListFragment storeLocatorListFragment = new StoreLocatorListFragment();
                    storeLocatorListFragment.stores = storeList;
                    storeLocatorListFragment.storeLcoatorItems = storeLocatorItems;

                    Log.i("yoyoyo", "yoyoyo" + storeLocatorListFragment.stores.size() + " " + storeLocatorListFragment.storeLcoatorItems.size());

                    placeFragmentWithBackStack(storeLocatorListFragment);
                }*/
            }
        } else {
            hideProgressDialog();
        }
    }

    public void onEvent(StoreListEvent event) {
        hideProgressDialog();
        if(event.getSuccess()) {
            List<StoreListResponse.Store> storeList = ((StoreListResponse) event.getDataObject()).getStores();
            Hawk.put(AppUtils.store_locator_store_list, storeList);

            ArrayList<StoreLocatorResponse.StoreLcoatorItem> storeLocatorItems = Hawk.get(AppUtils.store_locator_product_item, new ArrayList<StoreLocatorResponse.StoreLcoatorItem>());

            StoreLocatorListFragment storeLocatorListFragment = new StoreLocatorListFragment();
            storeLocatorListFragment.titleString = getResources().getString(R.string.available_store);
            storeLocatorListFragment.gpsRequired = true;
            storeLocatorListFragment.stores = storeList;
            storeLocatorListFragment.storeLcoatorItems = storeLocatorItems;

            placeFragmentWithBackStack(storeLocatorListFragment);

        }
    }


    public void onEvent(AddShoppingCartEvent event){
        if(shoppingCartAddMinusCountPanel == null)
            return;

        if(shoppingCartAddMinusCountPanel.countView == null)
            return;
        shoppingCartAddMinusCountPanel.countView.setText("1");

        if(shoppingCartAddMinusCountPanel.editCount == null)
            return;

        shoppingCartAddMinusCountPanel.editCount.setText("1");
    }
//    public void onEvent(GetProductsByTextSearchResponseEvent getProductsByTextSearchResponseEvent) {
//        if(getProductsByTextSearchResponseEvent.getSuccess()){
//
//        }else{
//            ToastUtils.show(getActivity(), getProductsByTextSearchResponseEvent.getMessage());
//        }
//
//    }
}
