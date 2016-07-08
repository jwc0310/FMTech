package parknshop.parknshopapp.Fragment.Redemption.RedemptionDetail;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductItemViewHolder;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.Model.RedemptionItemResponse;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;

/**
 * Created by chrisyu on 11/3/16.
 */
public class RedemptionRecyclerViewAdapter extends RecyclerView.Adapter<ProductItemViewHolder> {


    public List<RedemptionItemResponse.RedemptionItem> redemptionItemList = new ArrayList();
    public RedemptionItemResponse.Redemption data;
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

    public RedemptionRecyclerViewAdapter(BaseFragment productListFragment) {
        this.redemptionItemList = new ArrayList();
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
            currentHolder.setRedemptionHeader(data);
            setFullSpanHeaderView(holder, isHeader);
        } else if(withinValidRange(position)) {

            //Log.i("position", "position" + position);

            unsetFullSpanHeaderView(holder);

            RedemptionItemResponse.RedemptionItem redemptionItem = redemptionItemList.get(getRealPosition(position));

            currentHolder.setRedemptionItem(redemptionItem);

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
                } else
                    holder.loadingView.setVisibility(View.INVISIBLE);
            }
        }
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        int count =  redemptionItemList.size() + (hasHeader ? 1 : 0) + (hasFooter ? 1 : 0);
        //Log.i("pnscount", "pnscount" + count);
        return count;
    }

    public int getFirstPosition () {
        return 0 + (hasHeader ? 1 : 0);
    }

    public int getLastPosition() {
        return redemptionItemList.size() + (hasHeader ? 1 : 0) + (hasFooter ? 1 : 0) ;
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
