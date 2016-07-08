package parknshop.parknshopapp.Fragment.Recipe;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.API;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Home.HomeListView.HeaderViewPagerAdapter;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.Fragment.Tutorial.TutorialPresenter;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.ImageData;
import parknshop.parknshopapp.Model.RecipeDetailItemResponse;
import parknshop.parknshopapp.Model.RecipeDetailResponse;
import parknshop.parknshopapp.Model.RecipeSuggestionResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.RecipeDetailItemEvent;
import parknshop.parknshopapp.Rest.event.RecipeSuggestionEvent;
import parknshop.parknshopapp.View.IngredientViewHolder;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by hp on 22/4/2016.
 */
public class RecipeDetailFragment extends BaseFragment implements ViewPager.OnPageChangeListener{
    public @Bind (R.id.gallery_viewpager) ViewPager galleryViewPager;
    public @Bind (R.id.bookmark) ImageView bookmarkBotton;

    public @Bind (R.id.tutorial_dot_panel) LinearLayout tutorialDotPanel;
    public @Bind (R.id.default_image) ImageView defaultImage;

    public @Bind (R.id.title) TextView titleTextView;

    public @Bind (R.id.serves_text_view) TextView servesTextView;
    public @Bind (R.id.preparation_text_view) TextView preparationTextView;
    public @Bind (R.id.cooking_text_view) TextView cookingTextView;

    public @Bind (R.id.ingredients_item) LinearLayout ingredientsItem;

    public @Bind (R.id.seasoning_text) TextView seasoningTextView;
    public @Bind (R.id.method_text) TextView methodTextView;
    public @Bind (R.id.tips_text) TextView tipsTextView;

    public @Bind (R.id.suggested_items) TextView suggestedItemsTextView;

    HeaderViewPagerAdapter headerViewPagerAdapter;

    public static RecipeDetailFragment newInstance(int id) {
        RecipeDetailFragment recipeDetailFragment = new RecipeDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("id", id);
        recipeDetailFragment.setArguments(bundle);

        return recipeDetailFragment;
    }

    View view;
    int id = -1;
    RecipeDetailResponse.RecipeDetailItem data;

    public void onCreate(Bundle saved) {
        super.onCreate(saved);
        view = getActivity().getLayoutInflater().inflate(R.layout.recipe_detail_layout, null);

        GATrackerHelper.getInstance(getActivity()).setGATracker("recipe-details");

        ButterKnife.bind(this, view);
        id = getArguments().getInt("id");

        if(id >= 0) {
            WebServiceModel.getInstance(getBaseActivity()).requestRecipeItemDetail(id + "");
            showProgressDialog();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        showBackButton();
        showToolbar();
        disableSecondRightButton();
        disableCartButton();

        if(data != null && data.getTitle() != null)
            setToolbarTitle(data.getTitle());

        return view;
    }


    public void onEvent(RecipeDetailItemEvent event) {
        hideProgressDialog();
        if(event.getSuccess()) {
            RecipeDetailItemResponse response = event.getResponse();
            if(response != null) {
                data = response.getDetailData();
                setData(data);
                if(data.getTitle() != null)
                    setToolbarTitle(data.getTitle());
            }
            //Log.i("data", "data " + data);
        } else {
            //Log.i("error", "error " + event.getMessage());
        }
    }

    public void onEvent(RecipeSuggestionEvent event) {
        if(event.getSuccess()) {
            if(event.getResponse() != null) {
                RecipeSuggestionResponse response = event.getResponse();
                //Log.i("data", "data " + response.data);
            }
        } else {
            //Log.i("error", "error " + event.getMessage());
        }
    }

    public void setData(RecipeDetailResponse.RecipeDetailItem data) {
        titleTextView.setText(data.getTitle());

        servesTextView.setText(data.getServes());
        preparationTextView.setText(data.getPreparation());
        cookingTextView.setText(data.getCooking());


        class RecipeIngredientsVOListItemComparator implements Comparator<RecipeDetailResponse.RecipeIngredientsVOListItem> {
            @Override
            public int compare(RecipeDetailResponse.RecipeIngredientsVOListItem a, RecipeDetailResponse.RecipeIngredientsVOListItem b) {
                if(a.getSequence() > b.getSequence())
                    return 1;
                else if(a.getSequence() < b.getSequence())
                    return -1;
                return 0;
            }
        }

        Collections.sort(data.getRecipeIngredientsVOList() , new RecipeIngredientsVOListItemComparator());

        for(int i = 0; i < data.getRecipeIngredientsVOList().size(); i++) {
            RecipeDetailResponse.RecipeIngredientsVOListItem item = data.getRecipeIngredientsVOList().get(i);

            IngredientViewHolder ingredientView = new IngredientViewHolder(getBaseActivity());
            ingredientView.init(getBaseActivity());
            ingredientView.setIngredientItem(item.getName());
            ingredientView.setIngredientWeight(item.getQuantity());
            ingredientsItem.addView(ingredientView.getView());
        }

        seasoningTextView.setText(data.getSeasoning());
        methodTextView.setText(data.getProcess());
        tipsTextView.setText(data.getTips());

        if(data.getRecipeSuggestItemsVOList().size() > 0)
            suggestedItemsTextView.setText(getString(R.string.recipe_suggested_items) + "( " + data.getRecipeSuggestItemsVOList().size()  + " )");
        else {
            suggestedItemsTextView.setBackgroundColor(getResources().getColor(R.color.tran_grey));
        }

        setGalleryPanel();
        setBookmarked();
    }

    public void setGalleryPanel() {
        Glide.with(getBaseActivity()).load(R.drawable.parknshop_square).into(defaultImage);

        headerViewPagerAdapter = new HeaderViewPagerAdapter(getFragmentManager());

        headerViewPagerAdapter.centerInside = true;

        List<ImageData> productImageList = new ArrayList<ImageData>();
        for (int i = 0; i < data.getRecipeImageVOList().size(); i++) {
            if (data.getRecipeImageVOList().get(i).getImage() != null) {
                ImageData imageData = new ImageData();
                imageData.url = data.getRecipeImageVOList().get(i).getImage();//"http://cliparwolf.com/images/g/g-08.jpg";//data.getRecipeImageVOList().get(i).getImage();

                productImageList.add(imageData);
                defaultImage.setVisibility(View.GONE);
            }
        }

        headerViewPagerAdapter.setList(productImageList);

        headerViewPagerAdapter.setCount(productImageList.size());

        galleryViewPager.setAdapter(headerViewPagerAdapter);
        galleryViewPager.setOnPageChangeListener(this);

        TutorialPresenter.initProductDotPanel(tutorialDotPanel, getActivity(), productImageList.size());
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        TutorialPresenter.redrawDotPanel(tutorialDotPanel, position, headerViewPagerAdapter.getCount());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public boolean isBookmarked() {
        Map<Integer, Boolean> dataList = Hawk.get("recipeBookmarkMap", new TreeMap<Integer, Boolean>());
        Boolean bookmarked = dataList.get(data.getId());

        if(bookmarked == null || bookmarked == false)
            return false;

        return true;
    }

    @OnClick(R.id.share)
    public void share() {
        shareUrl(data.getTitle(), API.PNS_API_URL + id+"");
    }

    @OnClick(R.id.bookmark)
    public void bookmark() {
        if(!isBookmarked()) {
            setBookmarkedData(data.getId());
            setBookmarked();
        } else {
            unsetBookmarkedData(data.getId());
            setBookmarked();
        }
    }

    @OnClick(R.id.suggested_items)
    public void showSuggestedItemPanel() {

        ArrayList<String> productIds = new ArrayList<>();
        for(int i = 0; i < data.getRecipeSuggestItemsVOList().size(); i++) {
            productIds.add(data.getRecipeSuggestItemsVOList().get(i).getProductId());
        }

        if(productIds.size() > 0) {
            ProductListFragment productListFragment = ProductListFragment.newInstance(productIds);
            productListFragment.showBackButton = true;
            productListFragment.toolbarTitle = data.getTitle();
            productListFragment.setGATag(data.getTitle_en());
            placeFragmentWithBackStack(productListFragment);
        }
    }

    public void setBookmarked() {
        if(!isBookmarked()) {
            Glide.with(getBaseActivity()).load(R.drawable.recipes_icn_bookmarked_dim).into(bookmarkBotton);
        } else {
            Glide.with(getBaseActivity()).load(R.drawable.recipes_icn_bookmarked).into(bookmarkBotton);
        }
    }

    public void setBookmarkedData(int recipeId) {
        Map<Integer, Boolean> dataList = Hawk.get("recipeBookmarkMap", new TreeMap<Integer, Boolean>());
        dataList.put(recipeId, true);

        Hawk.put("recipeBookmarkMap", dataList);
    }

    public void unsetBookmarkedData(int recipeId) {
        Map<Integer, Boolean> dataList = Hawk.get("recipeBookmarkMap", new TreeMap<Integer, Boolean>());
        dataList.put(recipeId, false);

        Hawk.put("recipeBookmarkMap", dataList);
    }
}
