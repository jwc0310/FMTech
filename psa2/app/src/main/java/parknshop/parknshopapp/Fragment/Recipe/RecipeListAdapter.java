package parknshop.parknshopapp.Fragment.Recipe;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Recipe.View.RecipeItemViewHolder;
import parknshop.parknshopapp.Model.RecipeDetailResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.Utils;

/**
 * Created by chrisyu on 3/5/16.
 */
public class RecipeListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<RecipeDetailResponse.RecipeDetailItem> data;
    boolean hasHeader = true;
    boolean hasFooter = false;
    BaseActivity baseActivity;
    public String headerUrl;

    public RecipeListAdapter(ArrayList<RecipeDetailResponse.RecipeDetailItem> data) {
        this.data = data;
    }

    public void setData(ArrayList<RecipeDetailResponse.RecipeDetailItem> data) {
        this.data = data;
    }


    public void setActivity(BaseActivity baseActivity) {
        this.baseActivity = baseActivity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Log.i("itemCount" , "itemCount " + viewType + " " + data);

        if(TYPE_HEADER == viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_list_header_layout, parent, false);

            StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setFullSpan(true);

            int  tenDp = Utils.dpToPx(10, baseActivity);
            layoutParams.setMargins(tenDp, tenDp, tenDp, tenDp);

            v.setLayoutParams(layoutParams);

            ImageViewHeader imageViewHeader = new ImageViewHeader(v);
            return imageViewHeader;
        }

        if(TYPE_FOOTER == viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.progress_layout, parent, false);

            StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setFullSpan(true);

            int  tenDp = Utils.dpToPx(10, baseActivity);
            layoutParams.setMargins(tenDp, tenDp, tenDp, tenDp);

            v.setLayoutParams(layoutParams);

            LoadingViewHeader loadingViewHeader = new LoadingViewHeader(v);
            return loadingViewHeader;
        }

        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setFullSpan(position == 1);
        int  tenDp = Utils.dpToPx(10, baseActivity);
        layoutParams.setMargins(tenDp, tenDp, tenDp, tenDp);

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_list_item_layout, parent, false);
        v.setLayoutParams(layoutParams);

        //ProductItemViewHolder vh = new ProductItemViewHolder(v, productListFragment);
        RecipeItemViewHolder recipeItemViewHolder = new RecipeItemViewHolder(v);
        recipeItemViewHolder.setActivity(baseActivity);

        return recipeItemViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof RecipeItemViewHolder) {
            ((RecipeItemViewHolder)holder).setData(data.get(getRealPosition(position)));
        } else if(holder instanceof ImageViewHeader)  {
            ((ImageViewHeader)holder).loadUrl(headerUrl, baseActivity);
        }
    }


    int TYPE_HEADER = 0;
    int TYPE_ITEM = 1;
    int TYPE_FOOTER = 2;

    int position;
    @Override
    public int getItemViewType(int position) {
        this.position = position;

        if (hasHeader && position == 0)
            return TYPE_HEADER;
        if(hasFooter && (position == (data.size() - 1 + (hasHeader ?  1 : 0) + (hasFooter ?  1 : 0))))
            return TYPE_FOOTER;
        return TYPE_ITEM;
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

    @Override
    public int getItemCount() {
        if(data == null) return 0;
        if(data == null || data.size() == 0) return 0;
        return data.size() + getHeaderCount() + getFooterCount();
    }

    public int getHeaderCount() {
        return hasHeader ? 1 : 0;
    }

    public int getFooterCount() {
        return hasFooter ? 1 : 0;
    }

    public int getFirstPosition () {
        return 0 + (hasHeader ? 1 : 0);
    }

    public int getLastPosition() {
        if(data == null || data.size() == 0) return 0;

        return data.size() + (hasHeader ? 1 : 0) + (hasFooter ? 1 : 0) - 1;
    }

    class ImageViewHeader extends RecyclerView.ViewHolder {
        @Bind(R.id.recipe_header_image_View) ImageView imageView;
        View rootView;

        public ImageViewHeader(View rootView) {
            super(rootView);
            this.rootView = rootView;
            ButterKnife.bind(this, rootView);
        }

        public void loadUrl(String url, Context context) {
            //Log.i("loadingUrl", "loadingUrl " + url);
            Glide.with(context).load(url).into(imageView);
        }
    }

    class LoadingViewHeader extends RecyclerView.ViewHolder {
        @Bind(R.id.loading) View loadingView;
        View rootView;

        public LoadingViewHeader (View rootView) {
            super(rootView);
            this.rootView = rootView;
            ButterKnife.bind(this, rootView);
        }

        public void showLoadingView() {
            loadingView.setVisibility(View.VISIBLE);
        }

    }
}
