package parknshop.parknshopapp.Fragment.Product.ProductDetailWithPromotion;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductItemViewHolder;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.Model.CrazySale;
import parknshop.parknshopapp.Model.PromotionResponse;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;

/**
 * Created by kwongyuenpan on 25/4/16.
 */
public class PromotionRecyclerViewAdapter extends RecyclerView.Adapter<ProductItemViewHolder> {

    public List<PromotionResponse.Data.PromotionItemSet> mPromotionItemSet = new ArrayList();
    public List<PromotionResponse.Data.PromotionImageSet> mPromotionImageSet = new ArrayList();
    public PromotionResponse.Data mPromotionData;
    public int totalCount;

    BaseFragment productListFragment;
    int page = 0;

    public boolean isCallingApi;

    public boolean hasHeader;
    public boolean hasFooter = false;
    public View headerView;
    public View footerView;

    public boolean isCrazySale;
    public boolean isProductList = true;
    public boolean isProductDetail;

    WishListResponse[] wishListResponses = new WishListResponse[]{};

    public PromotionRecyclerViewAdapter(BaseFragment productListFragment) {
        this.mPromotionItemSet = new ArrayList();
        this.mPromotionImageSet = new ArrayList<>();
        this.productListFragment = productListFragment;
    }

    public PromotionRecyclerViewAdapter(BaseFragment productListFragment, List<PromotionResponse.Data.PromotionItemSet> mPromotionItemSet, List<PromotionResponse.Data.PromotionImageSet> mPromotionImageSet) {
        this.mPromotionItemSet = mPromotionItemSet;//new ArrayList();
        this.mPromotionImageSet = mPromotionImageSet;//new ArrayList<>();
        this.productListFragment = productListFragment;
    }

    public void setWishList(){
        wishListResponses = Hawk.get(AppUtils.grocery_list, null);
    }

    @Override
    public ProductItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.redemption_items_placeholder, parent, false);
        ProductItemViewHolder vh = new ProductItemViewHolder(v, productListFragment, false);
        return vh;
    }

    boolean isHeader = true;
    boolean isFooter = false;

    @Override
    public void onBindViewHolder(ProductItemViewHolder holder, int position) {
        ProductItemViewHolder currentHolder =  holder;

        //Log.i("yoyoyoy", "yoyoyoy" + isCrazySale);
        if(position == 0 && hasHeader) {
            //Log.i("yoyoyoy", "yoyoyoy" + isCrazySale);

            if(isCrazySale) {
                //Log.i("mPromotionData", "mPromotionData" + mPromotionData);
                //if(mPromotionData != null)
                //    Log.i("mPromotionData", "mPromotionData" + mPromotionData.getImage() + " " + mPromotionData.getShowCountDown());

                holder.isCrazySale = true;
                holder.isProductDetail = false;
                holder.isProductList = false;

                CrazySale crazySale = new CrazySale();
                crazySale.tillDate = new Date();
                crazySale.loadingUrl = new ArrayList<String>();
                crazySale.loadingUrl.add(mPromotionData.getImage());
                if(mPromotionData != null)
                    crazySale.showTimer = mPromotionData.getShowCountDown();

                currentHolder.setCrazySale(crazySale);
            } else if (isProductDetail) {
                holder.isCrazySale = false;
                holder.isProductDetail = true;
                holder.isProductList = false;
            } else if(isProductList){
                //holder.setTotalCount(totalCount);
                holder.isCrazySale = false;
                holder.isProductDetail = false;
                holder.isProductList = true;
            }

            if(mPromotionData != null)
                currentHolder.setPromotionHeader(mPromotionData);
            setFullSpanHeaderView(holder, isHeader);
        } else if(withinValidRange(position)) {

            //Log.i("position", "position" + position + " " + mPromotionItemSet.size() + " " + mPromotionImageSet.size() + " " + getRealPosition(position) );

            unsetFullSpanHeaderView(holder);

            PromotionResponse.Data.PromotionItemSet promotionItemSet = mPromotionItemSet.get(getRealPosition(position));
            PromotionResponse.Data.PromotionImageSet promotionImageSet = mPromotionImageSet.size() > getRealPosition(position) ? mPromotionImageSet.get(getRealPosition(position)) : null;

            //Log.i("position", "position" + position + " " + mPromotionItemSet.size() + " " + mPromotionItemSet.get(getRealPosition(position)).getDataHolder().getBrand() + " " + getRealPosition(position) );

            currentHolder.setPromotionItem(promotionItemSet, promotionImageSet);

            /*if(wishListResponses != null) {
                for(WishListResponse wishListResponse : wishListResponses){
                    for(WishListResponse.Entry entry : wishListResponse.getEntries()) {
                        if (entry.getProduct().getCode().equals(product.getCode())){
                            currentHolder.setWishListBtn();
                            continue;
                        }
                    }
                }
            }*/
        } else if(position == getLastPosition() && hasFooter) {
            setFullSpanHeaderView(holder, isFooter);

            if(productListFragment instanceof ProductListFragment) {
                if (((ProductListFragment)productListFragment).hasMore) {
                    ((ProductListFragment)productListFragment).callApi(page);
                    holder.loadingView.setVisibility(View.VISIBLE);
                } else {
                    holder.loadingView.setVisibility(View.INVISIBLE);
                }
            }
        }
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        int count =  mPromotionItemSet.size() + (hasHeader ? 1 : 0) + (hasFooter ? 1 : 0);
        //Log.i("pnscount", "pnscount" + count);
        return count;
    }

    public int getFirstPosition () {
        return 0 + (hasHeader ? 1 : 0);
    }

    public int getLastPosition() {
       return mPromotionItemSet.size() + (hasHeader ? 1 : 0) + (hasFooter ? 1 : 0) ;
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
}
