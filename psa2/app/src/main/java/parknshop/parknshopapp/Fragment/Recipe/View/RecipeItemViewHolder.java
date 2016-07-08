package parknshop.parknshopapp.Fragment.Recipe.View;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Recipe.RecipeDetailFragment;
import parknshop.parknshopapp.Model.RecipeDetailResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 3/5/16.
 */
public class RecipeItemViewHolder extends RecyclerView.ViewHolder {
    @Bind (R.id.background_image) ImageView backgroundImage;
    @Bind (R.id.title_text_view) TextView titleTextView;
    @Bind (R.id.bookmark_btn) RecipeBookmarkButton recipeBookmarkButton;
    BaseActivity baseActivity;

    RecipeDetailResponse.RecipeDetailItem data;
    View rootView;

    public RecipeItemViewHolder(View itemView) {
        super(itemView);
        rootView = itemView;
        ButterKnife.bind(this, itemView);
    }

    public void setActivity(BaseActivity baseActivity) {
        this.baseActivity = baseActivity;
    }

    public void setData(RecipeDetailResponse.RecipeDetailItem data) {
        this.data = data;
        for(int i = 0; i < data.getRecipeImageVOList().size(); i++) {
            if(data.getRecipeImageVOList().get(i).getImage() != null) {
                Glide.with(rootView.getContext()).load(data.getRecipeImageVOList().get(i).getImage()).error(R.drawable.pns_default_square).into(backgroundImage);
                break;
            }
        }
        titleTextView.setText(data.getTitle());
        recipeBookmarkButton.setItemId(data.getId());
    }

    @OnClick(R.id.recipe_item_root)
    public void rootOnClick() {
        RecipeDetailFragment recipeDetailFragment = RecipeDetailFragment.newInstance(data.getId());
        if(baseActivity != null)
            baseActivity.placeFragmentWithBackStack(recipeDetailFragment);
    }

}
