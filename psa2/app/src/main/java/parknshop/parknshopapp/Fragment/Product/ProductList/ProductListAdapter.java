package parknshop.parknshopapp.Fragment.Product.ProductList;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.CrazySale;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.PromotionResponse;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.UpdateProductListViewHolderEvent;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.Utils;

/**
 * Created by chrisyu on 11/3/16.
 */
public class ProductListAdapter extends RecyclerView.Adapter<ProductItemViewHolder> {

    public List<Product> productList = new ArrayList();
    public List<Product> relatedProductList = new ArrayList<>();
    public String totalCount;

    BaseFragment productListFragment;
    public int page = 0;

    public boolean isCallingApi;

    public boolean hasHeader;
    public boolean hasFooter = true;
    public View headerView;
    public View footerView;

    public boolean isCrazySale;
    public boolean isProductList = true;
    public boolean isProductDetail;
    public boolean searchByText;
    public PromotionResponse.Data mPromotionData;

    WishListResponse[] wishListResponses = new WishListResponse[]{};

    public boolean isRelatedProduct;
    public int tabPosition;

    public ProductListAdapter(BaseFragment productListFragment) {
        this.productList = new ArrayList();
        this.productListFragment = productListFragment;
        MyApplication.getInstance().register(this);
    }

    public void setPromotionData(PromotionResponse.Data mPromotionData) {
        this.mPromotionData = mPromotionData;
    }

    public PromotionResponse.Data getPromotionData() {
        return mPromotionData;
    }


    public void setWishList(){
        wishListResponses = Hawk.get(AppUtils.grocery_list, null);
    }

    @Override
    public ProductItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.productlist_items_placeholder, parent, false);
        ProductItemViewHolder vh = new ProductItemViewHolder(v, productListFragment, searchByText);

        return vh;
    }

    boolean isHeader = true;
    boolean isFooter = false;


    public void onEvent(UpdateProductListViewHolderEvent updateProductListViewHolderEvent) {
        //for(int i = 0; i < productList.size(); i++) {
        //    if(productList.get(i).getCode().equals(updateProductListViewHolderEvent.getProduct().getCode())) {
        //        notifyItemChanged(i + (hasHeader ? 1 : 0));
        //    }
       // }
    }

    @Override
    public void onBindViewHolder(ProductItemViewHolder holder, int position) {
        ProductItemViewHolder currentHolder =  holder;

        //Log.i("yoyoyoy", "yoyoyoy" + isCrazySale);
        if(position == 0 && hasHeader) {
            //Log.i("yoyoyoy", "yoyoyoy" + isCrazySale);
            if(mPromotionData != null /*aka isCrazySale*/) {
                holder.isCrazySale = true;
                holder.isProductDetail = false;
                holder.isProductList = false;

                CrazySale crazySale = new CrazySale();
                crazySale.tillDateString = mPromotionData.getEndTime();
                crazySale.crazySaleTitle = mPromotionData.getPromotionHeader();
                crazySale.crazySaleMessage = mPromotionData.getDescription();
                crazySale.tillDate = new Date();
                crazySale.loadingUrl = new ArrayList<String>();

                if(mPromotionData != null)
                    crazySale.showTimer = mPromotionData.getShowCountDown();

                HashMap<Integer, String> map = new HashMap<Integer, String>();

                for(int i = 0; i < mPromotionData.getPromotionImageSet().size(); i ++)
                    map.put(mPromotionData.getPromotionImageSet().get(i).getSequence(), mPromotionData.getPromotionImageSet().get(i).getImage());
                    //crazySale.loadingUrl.add(mPromotionData.getPromotionImageSet().get(i).getImage());

                Iterator entries = map.entrySet().iterator();
                while (entries.hasNext()) {
                    Map.Entry thisEntry = (Map.Entry) entries.next();

                    crazySale.loadingUrl.add(thisEntry.getValue().toString());
                }

                currentHolder.setCrazySale(crazySale);
            } else if (isProductDetail) {
                holder.isCrazySale = false;
                holder.isProductDetail = true;
                productListFragment.hideProgressDialog();
                holder.productId = ((ProductListFragment)productListFragment).productId;
                if(((ProductListFragment)productListFragment).product != null)
                    holder.setProductDetailFragment(((ProductListFragment)productListFragment).product);

               // if(((ProductListFragment)productListFragment).redemptionProductList.size() == 0)
                //    holder.tabLayout.setVisibility(View.GONE);
                holder.isProductList = false;
            } else if(isProductList){
                if(productListFragment instanceof  ProductListFragment ){
                    if(((ProductListFragment)productListFragment).productListRepo.newCatList.size() > 0) {
                        //118
                        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(Utils.dpToPx(80, productListFragment.getBaseActivity()), Utils.dpToPxHeight(20, productListFragment.getBaseActivity()));
                        llp.setMargins(0,Utils.dpToPxHeight(125, productListFragment.getBaseActivity()), 0, 0); // llp.setMargins(left, top, right, bottom);

                        holder.items.setLayoutParams(llp);
                    } else {
                        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(Utils.dpToPx(80, productListFragment.getBaseActivity()), Utils.dpToPxHeight(20, productListFragment.getBaseActivity()));
                        llp.setMargins(0, Utils.dpToPxHeight(3, productListFragment.getBaseActivity()), 0, 0); // llp.setMargins(left, top, right, bottom);

                        holder.items.setLayoutParams(llp);
                    }

                    if(((ProductListFragment)productListFragment).isHappyTime || ((ProductListFragment)productListFragment).isSideMenu){
                        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(Utils.dpToPx(80, productListFragment.getBaseActivity()), Utils.dpToPxHeight(20, productListFragment.getBaseActivity()));
                        llp.setMargins(0, Utils.dpToPxHeight(3, productListFragment.getBaseActivity()), 0, 0); // llp.setMargins(left, top, right, bottom);

                        holder.items.setLayoutParams(llp);
                    }
                }
                holder.setTotalCount(totalCount);

                holder.setHeaderImage(((ProductListFragment)productListFragment).headerImage);
                holder.isCrazySale = false;
                holder.isProductDetail = false;
                holder.isProductList = true;
            }
            setFullSpanHeaderView(holder, isHeader);
        } else if(withinValidRange(position)) {

            unsetFullSpanHeaderView(holder);

            Product product;

            if (isProductDetail) {
                if(isRelatedProduct) {
                    product =  relatedProductList.get(getRealPosition(position));
                } else {
                    product =  productList.get(getRealPosition(position));
                }
            } else {
                product =  productList.get(getRealPosition(position));
            }

            currentHolder.setProduct(product);
            currentHolder.setPosition(position);

            if(mPromotionData != null && mPromotionData.getPromotionType().equals("b"))
                currentHolder.btnAddToWishList.setVisibility(View.GONE);
            else
                currentHolder.btnAddToWishList.setVisibility(View.VISIBLE);

            if(wishListResponses != null) {
                for(WishListResponse wishListResponse : wishListResponses){
                    for(WishListResponse.Entry entry : wishListResponse.getEntries()) {
                        if (entry.getProduct().getCode().equals(product.getCode())){
                            currentHolder.setWishListBtn();
                            continue;
                        }
                    }
                }
            }
        } else if(position == getLastPosition() && hasFooter) {
            setFullSpanHeaderView(holder, isFooter);
            if(productListFragment instanceof ProductListFragment) {
                if ( ((ProductListFragment)productListFragment).subCategory == null  && ((ProductListFragment)productListFragment).hasMore && !((ProductListFragment)productListFragment).isHappyTime  && !(((ProductListFragment)productListFragment).productId.length() > 0) ) {
                    ((ProductListFragment)productListFragment).callApi(page);
                    holder.loadingView.setVisibility(View.VISIBLE);
                } else
                    holder.loadingView.setVisibility(View.INVISIBLE);
            }
        }
    }

    public void swap(List<Product> products) {
        productList.clear();
        productList.addAll(products);
        notifyDataSetChanged();
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        if(isProductDetail)
            if (isRelatedProduct)
                return relatedProductList.size() + (hasHeader ? 1 : 0) + (hasFooter ? 1 : 0);


        int count =  productList.size() + (hasHeader ? 1 : 0) + (hasFooter ? 1 : 0);
        return count;
    }

    public int getFirstPosition () {
        return 0 + (hasHeader ? 1 : 0);
    }

    public int getLastPosition() {
        if(isProductDetail)
            if (isRelatedProduct)
                return relatedProductList.size() + (hasHeader ? 1 : 0) + (hasFooter ? 1 : 0) - 1;

        return productList.size() + (hasHeader ? 1 : 0) + (hasFooter ? 1 : 0) - 1;
    }

    public int getRealPosition(int position) {
        if(hasHeader)
            return position - 1;
        return position;
    }

    public boolean withinValidRange(int position) {
        if(getFirstPosition() <= position && position < getLastPosition())
            return true;
        return false;
    }

    public void addHeaderView(View headerView) {
        this.headerView = headerView;
        hasHeader = true;
    }

    public void addFooterView(View footerView) {
        this.footerView = footerView;
        hasFooter = true;
    }

    public void removeHeaderView() {
        this.headerView = null;
        hasHeader = false;
    }

    public void removeFooterView() {
        this.footerView = null;
        hasFooter = false;
    }

    public void setFullSpanHeaderView(ProductItemViewHolder holder, boolean headerOrFooter) {
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setFullSpan(true);

        holder.placeholderRoot.setLayoutParams(layoutParams);
        holder.isHeader = headerOrFooter;
        holder.isFooter = !headerOrFooter;

        if(headerOrFooter)
            holder.hideItemViewAndShowHeader();
        else
            holder.hideItemViewAndShowFooter();
    }

    public void unsetFullSpanHeaderView(ProductItemViewHolder holder) {
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setFullSpan(false);

        holder.placeholderRoot.setLayoutParams(layoutParams);
        holder.isHeader = false;
        holder.isFooter = false;
    }

    /*
    public void onEvent (RelatedProductEvent relatedProductEvent) {
        productListFragment.hideProgressDialog();
        isRelatedProduct = true;
        relatedProductList = relatedProductEvent.getResponse().getProducts();
        //notifyDataSetChanged();
        for(int i = 0; i < Math.max(relatedProductList.size(), productList.size()); i++)
            this.notifyItemChanged( (hasHeader ? 1 : 0) + i);
    }*/
}
