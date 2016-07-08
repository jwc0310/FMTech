package parknshop.parknshopapp.Fragment.Product.ProductList;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.orhanobut.hawk.Hawk;

import org.apmem.tools.layouts.FlowLayout;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.techery.properratingbar.ProperRatingBar;
import parknshop.parknshopapp.API;
import parknshop.parknshopapp.AnimationHelper;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.EventUpdate.ProductDetailEvent;
import parknshop.parknshopapp.Fragment.Home.HomeListView.HeaderViewPagerAdapter;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Fragment.Product.CrazySale.CrazySaleHeaderAdapter;
import parknshop.parknshopapp.Fragment.Product.ProductComment.ProductCommentFragment;
import parknshop.parknshopapp.Fragment.Product.ProductPromotion.ProductPromotionFragment;
import parknshop.parknshopapp.Fragment.Recipe.RecipeSimpleListFragment;
import parknshop.parknshopapp.Fragment.Redemption.RedemptionDetailItem.RedemptionDetailItemFragment;
import parknshop.parknshopapp.Fragment.Tutorial.TutorialPresenter;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.CrazySale;
import parknshop.parknshopapp.Model.FilterData;
import parknshop.parknshopapp.Model.ImageData;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.PromotionResponse;
import parknshop.parknshopapp.Model.RedemptionItemResponse;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.ProductUpdateDetailEvent;
import parknshop.parknshopapp.Rest.event.RecipeSuggestionEvent;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.Utils.Utils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 11/3/16.
 */

public class ProductItemViewHolder extends RecyclerView.ViewHolder {
    public @Nullable @Bind(R.id.placeholder_root) View placeholderRoot;

    //HeaderView
    public @Nullable @Bind(R.id.recycler_view_header) View headerView;
    public @Nullable @Bind(R.id.header_list_image) ImageView headerImageView;

    public @Nullable @Bind(R.id.recycler_view_item) View itemView;
    public @Nullable @Bind(R.id.items) TextView items;
    public @Nullable @Bind(R.id.loading) View loadingView;

    public @Bind(R.id.product_list_header) View productListHeader;
    public @Nullable @Bind(R.id.crazy_sale_header) View crazySaleHeader;
    public @Nullable @Bind(R.id.redemption_header) View redemptionHeader;
    public @Nullable @Bind(R.id.gallery_viewpager) ViewPager crazySaleHeaderViewPager;
    public @Nullable @Bind(R.id.tutorial_dot_panel) LinearLayout tutorialDotPanel;

    public @Nullable @Bind(R.id.happy_time_gallery_viewpager) ViewPager happyTimeGalleryViewPage;
    public @Nullable @Bind(R.id.happy_time_tutorial_dot_panel) LinearLayout happyTimeTutorialDotPanel;
    public @Nullable @Bind(R.id.crazy_sale_time_only_panel) View crazySaleTimePanel;
    public @Nullable @Bind(R.id.txtValidUntil) TextView crazySaleValidUntil;
    public @Nullable @Bind(R.id.txtDay) TextView crazySaleTxtDay;
    public @Nullable @Bind(R.id.txtHour) TextView crazySaleTxtHour;
    public @Nullable @Bind(R.id.txtMin) TextView crazySaleTxtMinute;

    public @Nullable @Bind(R.id.rdemption_txtValidUntil) TextView redemptionValidUntil;
    public @Nullable @Bind(R.id.rdemption_txtDay) TextView redemptionTxtDay;
    public @Nullable @Bind(R.id.rdemption_txtHour) TextView redemptionTxtHour;
    public @Nullable @Bind(R.id.rdemption_txtMin) TextView redemptionTxtMinute;

    public @Nullable @Bind(R.id.crazy_sale_heading) TextView crazySaleHeading;
    public @Nullable @Bind(R.id.txtDesc) TextView crazySaleDesc;

    //product detail
    public @Nullable @Bind(R.id.product_code) TextView productCodeTextView;
    public @Nullable @Bind(R.id.product_detail_header) View productDetailHeader;
    public @Nullable @Bind(R.id.product_detail_title) TextView productDetailTitle;
    public @Nullable @Bind(R.id.small_description) TextView productDetailSmallDecription;
    public @Nullable @Bind(R.id.product_detail_current_price) TextView productDetailCurrentPrice;
    public @Nullable @Bind(R.id.product_detail_original_price) TextView productDetailOriginalPrice;
    public @Nullable @Bind(R.id.promotion_tag_panel) FlowLayout productPromotionHorizontalLayout;

    public @Nullable @Bind(R.id.product_detail_type) TextView type;
    public @Nullable @Bind(R.id.product_detail_country) TextView country;

    public @Nullable @Bind(R.id.product_detail_country_view) View countryView;
    public @Nullable @Bind(R.id.product_detail_country_flag) ImageView countryFlag;
    public @Nullable @Bind(R.id.product_detail_new_view) View new_view;

    public @Nullable @Bind(R.id.self_pick_up_view) View selfPickUpView;
    public @Nullable @Bind(R.id.home_delivery_view) View homeDeliveryView;

    public @Nullable @Bind(R.id.tab_layout) TabLayout tabLayout;
    public @Nullable @Bind(R.id.redemption_view_pager) ViewPager redemptionTagViewpager;

    @Nullable @Bind(R.id.product_detail_ratingBar) RatingBar productDetailRatingBar;
    @Nullable @Bind(R.id.proper_rating_bar) ProperRatingBar productDetailProperRatingBar;
    @Nullable @Bind(R.id.rating_count) TextView ratingCount;
    @Nullable @Bind(R.id.promotion_count) TextView promotionCount;

    @Nullable @Bind(R.id.ingredient_wrapper) LinearLayout ingredientWrapper;
    @Nullable @Bind(R.id.ingredient_placeholder) TextView ingredientPlaceholder;
    @Nullable @Bind(R.id.ingredients) LinearLayout ingredientLayout;
    @Nullable public @Bind(R.id.add_to_cart_textview) TextView checkoutBtn;
    @Nullable public @Bind(R.id.disable) View checkoutDisableView;

    //Product Itemm btnWishList
    public View root;
    public @Nullable @Bind(R.id.product_image) ImageView squareImage;
    public @Nullable @Bind(R.id.btn_wish_list) ImageView btnAddToWishList;
    public @Nullable @Bind(R.id.description_panel) View descriptionPanel;
    public @Nullable @Bind(R.id.promotion_redemption_title) TextView redemptionTitle;
    public @Nullable @Bind(R.id.title)TextView title;
    public @Nullable @Bind(R.id.product_detail_description) TextView description;
    public @Nullable @Bind(R.id.price) TextView price;
    public @Nullable @Bind(R.id.discount_price) TextView discount_price;
    public @Nullable @Bind(R.id.out_of_stock) TextView out_of_stock;
    public @Nullable @Bind(R.id.add_to_cart) TextView add_to_cart;
    public @Nullable @Bind(R.id.count) TextView count = null;
    //public @Nullable @Bind(R.id.add_panel) View addPanel;
    public @Nullable @Bind(R.id.notify_me) View notifyMe;
    public @Nullable @Bind(R.id.buy_n_give_n) TextView promotionText;
    public @Nullable @Bind(R.id.product_item_description) TextView productItemDescription;
    public @Nullable @Bind(R.id.product_detail_specification) TextView productDetailSpecification;
    public @Nullable @Bind(R.id.product_detail_use) TextView productDetailUse;
    public @Nullable @Bind(R.id.product_detail_precautions) TextView productDetailPrecautions;
    public @Nullable @Bind(R.id.item_weight) TextView itemWeight;
    public @Nullable @Bind(R.id.original_price) TextView originalPrice;
    public @Nullable @Bind(R.id.bottom_layout) View bottomLayout;
    public @Nullable @Bind(R.id.tag_1) TextView tag_1;
    public @Nullable @Bind(R.id.tag_2) TextView tag_2;

    public @Nullable @Bind(R.id.redemption_text) TextView redemptionDescriptionTextView;
    public @Nullable @Bind(R.id.redemption_title) TextView redemptionTitleTextView;
    public @Nullable @Bind(R.id.default_image) ImageView redemptionImageView;

    public @Nullable @Bind(R.id.in_store_rrp) ImageView instoreRrp;
    public @Nullable @Bind(R.id.rrp) ImageView rrp;
    public @Nullable @Bind(R.id.product_detail_rrp) ImageView productDetailRrp;

    public @Nullable @Bind(R.id.mb_price_layout) View mbPriceLayout;
    public @Nullable @Bind(R.id.member_price) TextView memberPrice;

    public @Nullable @Bind(R.id.product_detail_mb_price_layout) View productDetailMbPriceLayout;
    public @Nullable @Bind(R.id.product_detail_member_price) TextView productDetailMemberPrice;
    //public @Nullable @Bind(R.id.add_plus_disable) View disableView;
    //productDetailMbPriceLayout productDetailMemberPrice

    public @Nullable @Bind(R.id.happy_time_category_recycler_view) RecyclerView happyTimeCategoryRecycler;

    public boolean isHeader;
    public boolean isFooter;

    public boolean isCrazySale;
    public boolean isProductList = true;
    public boolean isProductDetail;
    public String productId;
    public boolean searchByText;

    BaseFragment productListFragment;
    Product product;

    int totalCount;
    Map<Integer, Integer> localShoppingCart = new HashMap<>();

    public ProductItemViewHolder(View v, BaseFragment productListFragment, boolean searchByText) {
        super(v);
        root = v;
        ButterKnife.bind(this, v);
        this.searchByText = searchByText;
        redemptionImageView = (ImageView)root.findViewById(R.id.default_image);
        notifyMe.setOnClickListener(null);
        MyApplication.getInstance().register(this);

        this.productListFragment = productListFragment;

        if(happyTimeCategoryRecycler != null)
            ProductListPresenter.initHorizontalRecyclerView(happyTimeCategoryRecycler, productListFragment);
    }


    int position = 0;
    public void setPosition(int position) {
        this.position = position;
    }

    public void setProduct(Product product) {
        showItemView();
        //scaleView(placeholderRoot, 0.8f, 1f);
        //localShoppingCart = Hawk.get(AppUtils.local_shopping_cart);
        setProductToView(product);
        this.product = product;

        //ShoppingCartAddMinusCountPanel scamcp = new ShoppingCartAddMinusCountPanel(addMinusCountPanel, product, productListFragment.getBaseActivity(), this.hashCode(), false);
        //handleLocalShoppingCart();

        //Log.i("yoyoyo", "yoyoyo" + product.getImageUrl());

        if(product.getImageUrl() != null && product.getImageUrl().length() > 0) {
            Glide.with(productListFragment.getBaseActivity()).load(API.WASTSONS_DOMAIN + product.getImageUrl()).placeholder(R.drawable.parknshop_square).into(this.squareImage);
        } else {
            Glide.with(productListFragment.getBaseActivity()).load(R.drawable.parknshop_square).into(this.squareImage);
        }
        //squareImage.setImageResource(R.drawable.parknshop_square);
        //}
    }

    @Nullable @Bind(R.id.redemption_header_viewpager) ViewPager redemptionViewpager;
    @Nullable @Bind(R.id.redemption_tutorial_dot_panel) LinearLayout redot;
    @Nullable @Bind(R.id.redemption_time_panel) View timePanel;
    public void setRedemptionHeader(RedemptionItemResponse.Redemption redemption) {
        //Log.i("redemption", "redemption " + redemption.getImage() + " " + redemptionImageView);
        timePanel.setVisibility(View.GONE);

        redemptionHeader.setVisibility(View.VISIBLE);
        redemptionValidUntil.setText(productListFragment.getBaseActivity().getString(R.string.valid_thru) + " : " +
                (redemption.valid_until.split(" ")[0].split("-")[2].length() == 1 ? "0" : "") + redemption.valid_until.split(" ")[0].split("-")[2] + "/" +
                (redemption.valid_until.split(" ")[0].split("-")[1].length() == 1 ? "0" : "") +redemption.valid_until.split(" ")[0].split("-")[1] + "/" +
                (redemption.valid_until.split(" ")[0].split("-")[0].length() == 1 ? "0" : "") + redemption.valid_until.split(" ")[0].split("-")[0] );
        redemptionTitleTextView.setText(redemption.getTitle());
        redemptionDescriptionTextView.setText(redemption.getDescription());

        //Glide.with(productListFragment.getBaseActivity()).load(redemption.getImage()).placeholder(R.drawable.food_default).into(this.redemptionImageView);

        CrazySale crazySale = new CrazySale();
        crazySale.loadingUrl.add(redemption.getImage());

        CrazySaleHeaderAdapter crazySaleHeaderAdapter = (new CrazySaleHeaderAdapter(productListFragment.getSupportFragmentManager(), crazySale.loadingUrl));
        crazySaleHeaderAdapter.tutorialPanel = redot;
        redemptionViewpager.setAdapter(crazySaleHeaderAdapter);
        redemptionViewpager.setOnPageChangeListener(crazySaleHeaderAdapter);
        redemptionViewpager.setOffscreenPageLimit(crazySale.loadingUrl.size());

        TutorialPresenter.initTutorialPanel(redot, productListFragment.getBaseActivity(), crazySale.loadingUrl.size());

        placeholderRoot.setOnClickListener(null);
    }

    public void setRedemptionItem(final RedemptionItemResponse.RedemptionItem redemptionItem) {
        redemptionHeader.setVisibility(View.GONE);
        showItemView();
        setRedemptionItemToView(redemptionItem);
        Glide.with(productListFragment.getBaseActivity()).load(redemptionItem.getImageUrl()).placeholder(R.drawable.parknshop_square).into(this.squareImage);

        placeholderRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RedemptionDetailItemFragment redemptionDetailFragment = new RedemptionDetailItemFragment();
                redemptionDetailFragment.redemptionItem = redemptionItem;
                productListFragment.getBaseActivity().placeFragmentWithBackStack(redemptionDetailFragment);
            }
        });
    }

    public void setPromotionItem(PromotionResponse.Data.PromotionItemSet mPromotionData, final PromotionResponse.Data.PromotionImageSet promotionImageSet) {
        redemptionHeader.setVisibility(View.GONE);
        showItemView();
        setPromotionItemToView(mPromotionData);
        Glide.with(productListFragment.getBaseActivity()).load(mPromotionData != null ? mPromotionData.getDataHolder().getImage() : "").placeholder(R.drawable.parknshop_square).into(this.squareImage);

        placeholderRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ProductListFragment productListFragment = ProductListFragment.newInstance(mPromotionData.getId());
//                RedemptionDetailItemFragment redemptionDetailFragment = new RedemptionDetailItemFragment();
//                redemptionDetailFragment.redemptionItem = redemptionItem;
//                productListFragment.getBaseActivity().placeFragmentWithBackStack(redemptionDetailFragment);
            }
        });

    }

    public boolean shouldShowValidThru(PromotionResponse.Data mPromotionData) {
        return mPromotionData.getShowValidUtils();
       // try {
/*
            if(mPromotionData.getBeforeEndDay() == null)
                return true;

            Date currentDate = new Date();
            Date endDate = new Date();

            endDate.setYear(Integer.valueOf( mPromotionData.getEndTime().split(" ")[0].split("-")[0]));
            endDate.setMonth(Integer.valueOf(mPromotionData.getEndTime().split(" ")[0].split("-")[1]) - 1);
            endDate.setDate(Integer.valueOf(mPromotionData.getEndTime().split(" ")[0].split("-")[2]));

            Calendar cal1 = Calendar.getInstance();
            cal1.set(Integer.valueOf(mPromotionData.getEndTime().split(" ")[0].split("-")[0]), Integer.valueOf(mPromotionData.getEndTime().split(" ")[0].split("-")[1]) - 1, Integer.valueOf(mPromotionData.getEndTime().split(" ")[0].split("-")[2]));
            cal1.add(Calendar.DAY_OF_MONTH, -mPromotionData.getBeforeEndDay() - 1);

            if(currentDate.after(cal1.getTime()))
                return true;
            else
                return false;*/
        //} catch (Exception e) {
        //    Log.i("yoyoyo", "yoyoyo" + e.getMessage());
       // }
        //return true;
    }

    public void setPromotionHeader(final PromotionResponse.Data mPromotionData) {

        if(!mPromotionData.getShowCountDown())
            timePanel.setVisibility(View.GONE);
        else
            timePanel.setVisibility(View.VISIBLE);

        final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final String validUntil = productListFragment.getResources().getString(R.string.valid_thru);

        Log.i("yoyoyo", "yoyoyyo" + shouldShowValidThru(mPromotionData));

        if(shouldShowValidThru(mPromotionData))
            redemptionValidUntil.setVisibility(View.VISIBLE);
        else
            redemptionValidUntil.setVisibility(View.GONE);

        try {
            final Handler handler = new Handler();

            handler.post(new Runnable() {
                //    @Override
                public void run() {
                    try {
                        redemptionValidUntil.setText(
                                validUntil + ":" + /*"Valid Until : " +*/
                                        mPromotionData.getEndTime().split(" ")[0].split("-")[2] + "/" + " " +
                                        mPromotionData.getEndTime().split(" ")[0].split("-")[1] + "/" +
                                        mPromotionData.getEndTime().split(" ")[0].split("-")[0]/*.replace("/", "-")*/);

                        Date date = df.parse(mPromotionData.getEndTime());

                        long diff = new Date().getTime() - date.getTime();

                        long diffSeconds = diff / 1000 % 60;
                        long diffMinutes = diff / (60 * 1000) % 60;
                        long diffHours = diff / (60 * 60 * 1000) % 24;
                        long diffDays = diff / (24 * 60 * 60 * 1000);

                        redemptionTxtDay.setText( ((Math.abs(diffDays) + "").length() == 1 ? "0" : "") +  Math.abs(diffDays) + "");
                        redemptionTxtHour.setText( ((Math.abs(diffHours) + "").length() == 1 ? "0" : "") +  Math.abs(diffHours) + "");
                        redemptionTxtMinute.setText( ((Math.abs(diffMinutes) + "").length() == 1 ? "0" : "") + Math.abs(diffMinutes) + "");
                    } catch (Exception e) {

                    }
                }
            });

        } catch (Exception e) {
            //Log.i("eeee", "eee" + e.getMessage());
        }
        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                try {
                    while(true) {
                        //productListFragment.getBaseActivity().runOnUiThread(new Runnable() {
                        //    @Override
                         //   public void run() {
                         //       try {

                        handler.post(new Runnable() {
                            //    @Override
                            public void run() {
                                try {
                                    redemptionValidUntil.setText(validUntil +
                                            mPromotionData.getEndTime().split(" ")[0].split("-")[2] + "/" +
                                            mPromotionData.getEndTime().split(" ")[0].split("-")[1] + "/" +
                                            mPromotionData.getEndTime().split(" ")[0].split("-")[0]);
                                    Date date = df.parse(mPromotionData.getEndTime());

                                    long diff = new Date().getTime() - date.getTime();

                                    long diffSeconds = diff / 1000 % 60;
                                    long diffMinutes = diff / (60 * 1000) % 60;
                                    long diffHours = diff / (60 * 60 * 1000) % 24;
                                    long diffDays = diff / (24 * 60 * 60 * 1000);
                                    redemptionTxtDay.setText( ((Math.abs(diffDays) + "").length() == 1 ? "0" : "") +  Math.abs(diffDays) + "");
                                    redemptionTxtHour.setText( ((Math.abs(diffHours) + "").length() == 1 ? "0" : "") +  Math.abs(diffHours) + "");
                                    redemptionTxtMinute.setText( ((Math.abs(diffMinutes) + "").length() == 1 ? "0" : "") + Math.abs(diffMinutes) + "");


                                    //Log.i("eeee", "eee " + diffMinutes);

                                } catch (Exception e) {

                                }
                            }}
                        );
                           //     } catch(Exception e ){
                           //         Log.i("eeee", "eee" + e.getMessage());
                           //     }
                          //  }
                        //});

                        try {
                            Thread.sleep(1000 * 60);
                        }
                        catch(Exception e) {
                            //Log.i("eeee", "eee" + e.getMessage());
                        }
                    }
                } catch (Exception e) {
                    //Log.i("eeee", "eee" + e.getMessage());
                }
            }
        };

        Thread a = new Thread(run);
        productListFragment.threadList.add(a);
        a.start();

        redemptionHeader.setVisibility(View.VISIBLE);
        //redemptionValidUntil.setText("Valid Until : ");
        redemptionTitleTextView.setText(mPromotionData.getPromotionHeader());
        redemptionDescriptionTextView.setText(mPromotionData.getDescription());

        //Glide.with(productListFragment.getBaseActivity()).load(redemption.getImage()).placeholder(R.drawable.food_default).into(this.redemptionImageView);

        CrazySale crazySale = new CrazySale();
        //crazySale.loadingUrl.add(mPromotionData.getImage());


        for(int i = 0; i < mPromotionData.getPromotionImageSet().size(); i++)
            crazySale.loadingUrl.add(mPromotionData.getPromotionImageSet().get(i).getImage());

        CrazySaleHeaderAdapter crazySaleHeaderAdapter = (new CrazySaleHeaderAdapter(productListFragment.getSupportFragmentManager(), crazySale.loadingUrl));
        crazySaleHeaderAdapter.tutorialPanel = redot;
        redemptionViewpager.setAdapter(crazySaleHeaderAdapter);
        redemptionViewpager.setOnPageChangeListener(crazySaleHeaderAdapter);
        redemptionViewpager.setOffscreenPageLimit(crazySale.loadingUrl.size());

        TutorialPresenter.initTutorialPanel(redot, productListFragment.getBaseActivity(), crazySale.loadingUrl.size());

        placeholderRoot.setOnClickListener(null);


        if(mPromotionData.getPromotionType().equals("c")) {
            ArrayList<FilterData> data = new ArrayList<>();
            for(int i = 0; i < mPromotionData.getPromotionItemSet().size(); i++) {
                //if(i > mPromotionData.getPromotionImageSet().size()) {
                FilterData fd = new FilterData(mPromotionData.getPromotionItemSet().get(i).getDataHolder().getCategoryName(),mPromotionData.getPromotionItemSet().get(i).getDataHolder().getCategoryId());
                fd.setImageUrl(mPromotionData.getPromotionItemSet().get(i).getDataHolder().getImage());
                data.add(fd);
                //Log.i("ads", "asdasd" + mPromotionData.getPromotionType() + " " + mPromotionData.getPromotionItemSet().get(i).getDataHolder().getCategoryName());
                // }
            }

            HeaderCircleProductCategoryAdapter headerCircleProductCategoryAdapter = (new HeaderCircleProductCategoryAdapter(data, productListFragment, happyTimeCategoryRecycler));
            headerCircleProductCategoryAdapter.toProductListPage = true;
            happyTimeCategoryRecycler.setAdapter(headerCircleProductCategoryAdapter);
            happyTimeCategoryRecycler.setVisibility(View.VISIBLE);
        }
    }

    public void setCrazySale(final CrazySale crazySale) {

        crazySaleHeading.setText(crazySale.crazySaleTitle);
        crazySaleDesc.setText(crazySale.crazySaleMessage);
        crazySaleValidUntil.setText(productListFragment.getResources().getString(R.string.valid_thru) + " : " +
                (crazySale.tillDateString.split(" ")[0].split("-")[2].length() == 1 ? "0" : "") + crazySale.tillDateString.split(" ")[0].split("-")[2] + "/" +
                (crazySale.tillDateString.split(" ")[0].split("-")[1].length() == 1 ? "0" : "") +crazySale.tillDateString.split(" ")[0].split("-")[1] + "/" +
                (crazySale.tillDateString.split(" ")[0].split("-")[0].length() == 1 ? "0" : "") +crazySale.tillDateString.split(" ")[0].split("-")[0] );

        //Log.i("crazySale.showTimer", "crazySale.showTimer" + crazySale.showTimer + " " + crazySaleValidUntil.getText().toString());

        if(!crazySale.showTimer) {
            crazySaleTimePanel.setVisibility(View.GONE);
        } else {
            crazySaleTimePanel.setVisibility(View.VISIBLE);
        }

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = df.parse(crazySale.tillDateString);

            long diff = new Date().getTime() - date.getTime();

            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);

            crazySaleTxtDay.setText( ((Math.abs(diffDays)+"").length() == 1 ? "0" : "") + Math.abs(diffDays) + "");
            crazySaleTxtHour.setText( ((Math.abs(diffHours)+"").length() == 1 ? "0" : "") + Math.abs(diffHours) + "");
            crazySaleTxtMinute.setText( ((Math.abs(diffMinutes)+"").length() == 1 ? "0" : "") + Math.abs(diffMinutes) + "");

        } catch (Exception e) {
        }

        final String validString = productListFragment.getResources().getString(R.string.valid_thru);
        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                while(true) {

                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    try {
                        final Date date = df.parse(crazySale.tillDateString);

                        long diff = new Date().getTime() - date.getTime();

                        final long diffSeconds = diff / 1000 % 60;
                        final long diffMinutes = diff / (60 * 1000) % 60;
                        final long diffHours = diff / (60 * 60 * 1000) % 24;
                        final long diffDays = diff / (24 * 60 * 60 * 1000);

                        handler.post(new Runnable() {
                            //    @Override
                            public void run() {
                                crazySaleHeading.setText(crazySale.crazySaleTitle);
                                crazySaleDesc.setText(crazySale.crazySaleMessage);
                                crazySaleValidUntil.setText(validString + " : "  + crazySale.tillDateString.split(" ")[0].replace("-", "/"));
                                crazySaleTxtDay.setText( ((Math.abs(diffDays)+"").length() == 1 ? "0" : "") + Math.abs(diffDays) + "");
                                crazySaleTxtHour.setText( ((Math.abs(diffHours)+"").length() == 1 ? "0" : "") + Math.abs(diffHours) + "");
                                crazySaleTxtMinute.setText( ((Math.abs(diffMinutes)+"").length() == 1 ? "0" : "") +  Math.abs(diffMinutes) + "");
                            }
                        });
                        //}, 0);


                        //Log.i("eeee", "eee 2" + diffMinutes);

                    } catch (Exception e) {
                    }

                    try {
                        Thread.sleep(1000 * 60);
                    } catch (Exception e) {
                    }
                }
            }
        };

        //Handler h = new Handler();
        Thread a = new Thread(run);
        productListFragment.threadList.add(a);
        a.start();

        CrazySaleHeaderAdapter crazySaleHeaderAdapter = (new CrazySaleHeaderAdapter(productListFragment.getSupportFragmentManager(), crazySale.loadingUrl));
        crazySaleHeaderAdapter.tutorialPanel = happyTimeTutorialDotPanel;
        happyTimeGalleryViewPage.setAdapter(crazySaleHeaderAdapter);
        happyTimeGalleryViewPage.setOnPageChangeListener(crazySaleHeaderAdapter);
        happyTimeGalleryViewPage.setOffscreenPageLimit(crazySale.loadingUrl.size());

        TutorialPresenter.initTutorialPanel(happyTimeTutorialDotPanel, productListFragment.getBaseActivity(), crazySale.loadingUrl.size());
    }

    public void setRedemptionItemToView(RedemptionItemResponse.RedemptionItem redemptionItem) {
        this.title.setText(redemptionItem.getBrand());
        productItemDescription.setText(redemptionItem.getTitle());
        //loadUrl
        this.price.setText("" + redemptionItem.getDescription());
        promotionText.setVisibility(View.GONE);
        out_of_stock.setVisibility(View.GONE);
        bottomLayout.setVisibility(View.GONE);
        btnAddToWishList.setVisibility(View.GONE);

        if(redemptionItem.getOption().size() > 0)
            tag_1.setText(redemptionItem.getOption().get(0).getLine());
        else
            tag_1.setVisibility(View.GONE);

        if(redemptionItem.getOption().size() > 1)
            tag_2.setText(redemptionItem.getOption().get(1).getLine());
        else
            tag_2.setVisibility(View.GONE);
    }

    public void setPromotionItemToView(PromotionResponse.Data.PromotionItemSet promotionData) {

        this.title.setText(promotionData.getDataHolder().getBrand());
        this.productItemDescription.setText(promotionData.getDataHolder().getName() + "\n" + promotionData.getDataHolder().getDescription());

        if(promotionData.getDataHolder().getPrice() != null)
            this.price.setText("" + promotionData.getDataHolder().getPrice());
        else
            this.price.setVisibility(View.GONE);

        this.price.setTextColor(Color.parseColor("#292d84"));
        //this.price.setVisibility(View.GONE);
        //this.originalPrice.setVisibility(View.VISIBLE);
        //this.originalPrice.setText("" + promotionData.getDataHolder().getPrice());

        if(promotionData.getDataHolder().getPriceStrike()) {
            Drawable drawable = productListFragment.getResources().getDrawable(R.drawable.crossline);
            drawable.setColorFilter(new PorterDuffColorFilter(0xffff00, PorterDuff.Mode.MULTIPLY));

            price.setBackgroundResource(R.drawable.crossline);
        } else {
            price.setBackgroundResource(R.color.transparent);
        }

        promotionText.setVisibility(View.GONE);
        out_of_stock.setVisibility(View.GONE);
        bottomLayout.setVisibility(View.GONE);
        btnAddToWishList.setVisibility(View.GONE);

        if(promotionData.getDataHolder().getItemSize() != null) {
            this.itemWeight.setVisibility(View.VISIBLE);
            this.itemWeight.setText(promotionData.getDataHolder().getItemSize());
        } else {
            this.itemWeight.setVisibility(View.GONE);
        }


        if(promotionData.getDataHolder().getPriceType().equals("off") ) {

        } else {
            if(promotionData.getDataHolder().getPriceType().equals("MB Price")) {
                this.mbPriceLayout.setVisibility(View.VISIBLE);
                this.memberPrice.setText("HK$" +promotionData.getDataHolder().getValue());
            } else if(promotionData.getDataHolder().getPriceType().equals("MB Point") || promotionData.getDataHolder().getPriceType().equals("MB Bonus")) {
                this.mbPriceLayout.setVisibility(View.VISIBLE);
                this.memberPrice.setText( (int)(Float.parseFloat( promotionData.getDataHolder().getValue())) + " " + productListFragment.getResources().getString(R.string.point));

            } else if(promotionData.getDataHolder().getPriceType().equals("Discount Price")) {
                //else
                discount_price.setVisibility(View.VISIBLE);
                discount_price.setText("HK$" + promotionData.getDataHolder().getValue());
            } else {
                this.mbPriceLayout.setVisibility(View.GONE);
            }
        }


        if(promotionData.getDataHolder().getRrp()) {
            instoreRrp.setVisibility(View.VISIBLE);
            instoreRrp.setImageResource(R.drawable.rrp);
        } else {
            instoreRrp.setVisibility(View.GONE);
        }
    }

    public void setProductToView(Product product) {
        tag_1.setVisibility(View.GONE);
        tag_2.setVisibility(View.GONE);

        this.product = product;


        try {
            if (product.getPromotionDescription(((ProductListFragment) productListFragment).product) != null) {
                redemptionTitle.setText(Html.fromHtml(product.getPromotionDescription(((ProductListFragment) productListFragment).product)));
                redemptionTitle.setVisibility(View.VISIBLE);
            } else {
                redemptionTitle.setVisibility(View.GONE);
            }
        } catch (Exception e) {
            redemptionTitle.setVisibility(View.GONE);
        }

        this.title.setText(product.getBrandData().getName() != null ? product.getBrandData().getName() : product.getBrandName());
        //if(title.getText().length() == 0)
        //    title.setVisibility(View.GONE);

        this.productItemDescription.setText(product.getName());

        if(product.getPrice() != null) {
            this.price.setText("" + product.getPrice());
            this.price.setVisibility(View.VISIBLE);
            this.price.setTextColor(productListFragment.getResources().getColor(R.color.product_item_text_color));
        } else {
            this.price.setVisibility(View.GONE);
        }

        if(product.getAppPromotionPrice() != null) {
            this.price.setText(product.getAppPromotionPrice());
            this.price.setTextColor(productListFragment.getResources().getColor(R.color.app_red));
        }

        if(product.getPnsContentSizeUnit() != null) {
            this.itemWeight.setVisibility(View.VISIBLE);
            this.itemWeight.setText(product.getPnsContentSizeUnit());
        } else {
            this.itemWeight.setVisibility(View.GONE);
        }

        if(product.getRrpPrice() != null && product.getRrpPriceFloat() > 0 && product.getRrpPriceTagFlag()) {
            this.originalPrice.setVisibility(View.VISIBLE);
            this.originalPrice.setText(productListFragment.getString(R.string.was_price) + product.getRrpPrice());
            if(product.showCrossLine()) {
                originalPrice.setBackgroundResource(R.drawable.crossline);
            } else {
                originalPrice.setBackgroundResource(R.color.transparent);
            }
        } else {
            originalPrice.setBackgroundResource(R.color.transparent);
            this.originalPrice.setVisibility(View.GONE);
            this.originalPrice.setText("");
        }

        if(product.getMemberPricePns() != null) {
            this.mbPriceLayout.setVisibility(View.VISIBLE);
            this.memberPrice.setText(product.getMemberPricePns());
        } else {
            this.mbPriceLayout.setVisibility(View.GONE);
        }

        if(product.getRrpPriceTagFlag()) {
            rrp.setVisibility(View.VISIBLE);
            rrp.setImageResource(R.drawable.rrp);
            if(product.getAppPromotionPrice() != null) {
                //rrp.setImageResource(R.drawable.rrp_red);
            }
        } else {
            rrp.setVisibility(View.GONE);
        }

        //this.originalPrice.setVisibility(View.GONE);

        this.out_of_stock.setVisibility(product.hasStock() ? View.GONE : View.VISIBLE);
        this.notifyMe.setVisibility(product.hasStock() && product.getPrice() != null ? View.GONE : View.VISIBLE);


        if( !(product.hasStock() && product.getPrice() != null) ){
            //notifyMe.setBackgroundResource(R.drawable.tags_rounded_corners);
            //GradientDrawable drawable = (GradientDrawable) notifyMe.getBackground();
            //drawable.setColor(Color.parseColor("#989898"));
            add_to_cart.setVisibility(View.GONE);
            //addPanel.setVisibility(View.GONE);
        } else {
            add_to_cart.setVisibility(View.VISIBLE);
        }

        //this.disableView.setVisibility(product.hasStock() ? View.GONE : View.VISIBLE);

        handlePromoteText();
        itemView.findViewById(R.id.btn_wish_list).setVisibility(View.GONE);

        //public void updateWishListBtnAtDetailPage() {
        boolean alreadyAdded = false;
        //WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);
        ArrayList<String> wishListResponses = Hawk.get(AppUtils.simple_grocery_list);

        if(product == null || wishListResponses == null) {
            return;
        }

        for(String wishListResponse : wishListResponses){
            //for(WishListResponse.Entry entry : wishListResponse.getEntries()) {
            if (wishListResponse.equals(product.getCode())){
                alreadyAdded = true;
                break;
            }
            //}
        }

        if(alreadyAdded) {
            //Log.i("alreadyAdded", "alreadyAdded " + product.getName());
            Glide.with(productListFragment.getBaseActivity()).load(R.drawable.on_sale_tag_heart).into(btnAddToWishList);
        } else {
            btnAddToWishList.setVisibility(View.GONE);
            Glide.with(productListFragment.getBaseActivity()).load(R.drawable.on_sale_tag_heart_dim).into(btnAddToWishList);
        }
        //}
    }

    public void handleLocalShoppingCart() {
        /*
        if(localShoppingCart.get(getIntegerValue(product)) == null) {
            this.addPanel.setVisibility(View.GONE);
            this.count.setText(0 + "");
        } else {
            this.addPanel.setVisibility(View.VISIBLE);
            this.notifyMe.setVisibility(View.GONE);

            int countVal = localShoppingCart.get(getIntegerValue(product));
            this.count.setText(countVal + "");
        }*/


        CartResponse cartResponse = HomePresenter.getRemoteShoppingCart();
        CartResponse.Entry entry = cartResponse.getEntryById(product.getCode());

        int remoteCount = entry.quantity;
        if (entry != null && remoteCount > 0) {
            remoteCount = entry.quantity;
            this.count.setText(remoteCount + "");
            //addPanel.setVisibility(View.VISIBLE);
        } else {
            //addPanel.setVisibility(View.GONE);
        }
    }

    public void handlePromoteText() {
        if(product.getPromotionTag(0) != null && product.getPromotionTag(0).length() > 0) {
            promotionText.setText(product.getPromotionTag(0));
            promotionText.setBackgroundResource(R.drawable.r_corners);
            GradientDrawable drawable = (GradientDrawable) promotionText.getBackground();
            drawable.setColor(Color.parseColor("#FDDB00"));
            promotionText.setTextColor(productListFragment.getResources().getColor(R.color.app_red));
            promotionText.setTypeface(Typeface.DEFAULT_BOLD);
            promotionText.setGravity(Gravity.CENTER);
            promotionText.setPadding(Utils.dpToPx(10, productListFragment.getBaseActivity()),0, Utils.dpToPx(10, productListFragment.getBaseActivity()),0);
            promotionText.setVisibility(View.VISIBLE);
        } else {
            promotionText.setVisibility(View.INVISIBLE);
        }
        //Glide.with(productListFragment.getContext()).load(R.drawable.on_sale_tag_heart_dim).into(btnAddToWishList);
    }

    public void setWishListBtn() {
        Glide.with(productListFragment.getContext()).load(R.drawable.on_sale_tag_heart).into(btnAddToWishList);
    }

    public void setTotalCount(String totalCount) {
        items.setText(totalCount + "");
        items.setVisibility(View.VISIBLE);
    }

    public void setHeaderImage(String url) {
        if(url != null) {
            headerImageView.setVisibility(View.VISIBLE);
            Glide.with(productListFragment.getBaseActivity()).load((url.startsWith("http://") || url.startsWith("https://"))? url : API.WASTSONS_DOMAIN + url).into(headerImageView);
        }
    }

    public int getIntegerValue(Product product) {
        try {
            return Integer.valueOf(product.getCode());
        } catch (Exception e) {
            return 0;
        }
    }

    public void hideItemViewAndShowFooter() {
        headerView.setVisibility(View.GONE);
        loadingView.setVisibility(View.VISIBLE);
        itemView.setVisibility(View.GONE);
    }

    public void hideItemViewAndShowHeader() {
        headerView.setVisibility(View.VISIBLE);
        //Log.i("yoyoyoy", "yoyoyyo isCrazySale " + isCrazySale);
        if(isCrazySale) {
            productListHeader.setVisibility(View.GONE);
            crazySaleHeader.setVisibility(View.VISIBLE);
            productDetailHeader.setVisibility(View.GONE);
        } else if (isProductDetail) {
            productDetailHeader.setVisibility(View.VISIBLE);
            productListHeader.setVisibility(View.GONE);
            crazySaleHeader.setVisibility(View.GONE);
        } else if(isProductList){
            productDetailHeader.setVisibility(View.GONE);
            productListHeader.setVisibility(View.VISIBLE);
            crazySaleHeader.setVisibility(View.GONE);
        }

        loadingView.setVisibility(View.GONE);
        itemView.setVisibility(View.GONE);
    }

    public void showItemView() {
        headerView.setVisibility(View.GONE);
        loadingView.setVisibility(View.GONE);
        itemView.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.placeholder_root)
    public void goToProductDetail() {

        if(product == null) return;

        if(product.getCode() == null) return;

        ProductListFragment pf = ProductListFragment.newInstance(product.getCode(), searchByText);
        pf.setGATag(product.getName());
        LogUtil.info("", "getGATagq145555:"+product.getName());
        productListFragment.placeFragmentWithBackStack(pf);
    }

    @OnClick (R.id.add_to_cart)
    public void addToCart() {
        if( (productListFragment.getBaseActivity()).isLoadingCart )
            return;

        CartResponse cartResponse = HomePresenter.getRemoteShoppingCart();
        CartResponse.Entry entry = cartResponse.getEntryById(product.getCode());


        if(product.getMaxAllowedBuyQty() <= entry.quantity + 1) {
            ToastUtils.show((productListFragment.getBaseActivity()), (productListFragment.getBaseActivity()).getString(R.string.max_allowed_buy_qty) );
            return;
        }

        int remoteCount = entry.quantity;

        if(productListFragment.getBaseActivity() != null) {
            AnimationHelper.slideFromTop( (productListFragment.getBaseActivity()).cartPanel, 95);
            (productListFragment.getBaseActivity()).itemAddedTextView.setVisibility(View.INVISIBLE);
            (productListFragment.getBaseActivity()).moneyNeededForFreeDeliveryTextView.setVisibility(View.INVISIBLE);
            (productListFragment.getBaseActivity()).smallProgress.setVisibility(View.VISIBLE);
            (productListFragment.getBaseActivity()).isLoadingCart = true;
        }

        //moneyNeededForFreeDeliveryTextView
        if(remoteCount > 0) {
            //addPanel.setVisibility(View.VISIBLE);
            for(int i = 0 ; i < cartResponse.getAllEntry().size(); i++) {
                Product product = cartResponse.getEntry(i).product;
                if(product != null) {
                    if(product.getCode().equals(this.product.getCode())) {
                        //productListFragment.getBaseActivity().showProgressDialog();
                        WebServiceModel.getInstance(productListFragment.getBaseActivity()).editShoppingCart(HomePresenter.getRemoteShoppingCart().getEntryById(product.getCode()).entryNumber, Integer.valueOf(cartResponse.getEntry(i).quantity) + 1, "edit", productListFragment.getBaseActivity(), false, 1);
                        return;
                    }
                }
            }

        } else {
            //productListFragment.showProgressDialog();
            WebServiceModel.getInstance(productListFragment.getBaseActivity()).addShoppingCart(product.getCode(), 1, this.hashCode(), "add", productListFragment.getBaseActivity(), false);
        }
        (productListFragment.getBaseActivity()).isLoadingCart = true;
    }

    @OnClick (R.id.btn_wish_list)
    public void btnAddToWishList() {
        // get the current wishlists, check if any wishlist created before
//        WebServiceModel.getInstance(root.getContext()).requestGetWishList(root.getContext(), product.getCode());
//        ((OneActivity)root.getContext()).addToWishList(product);

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
            ((OneActivity) root.getContext()).addToWishList(product, -1);
        } else {
            productListFragment.showProgressDialog();
            WebServiceModel.getInstance(root.getContext()).requestRemoveProductFromWishList(root.getContext(), finalCurrwishListResponse.getPrimaryKey(), qty, product.getCode());
        }
    }

    public void onEvent(ProductUpdateDetailEvent productUpdateDetailEvent) {
        if(productUpdateDetailEvent.getProduct() != null) {
            if(productUpdateDetailEvent.getProduct().getCode().equals(productId + "")) {
                setRatingBarLayout();
                setProductDetailFragment(productUpdateDetailEvent.getProduct());
                tabLayout.setVisibility(productUpdateDetailEvent.getRedemptionList().size() == 0 ? View.GONE : View.VISIBLE);
            }
        }
    }

    public void setRatingBarLayout() {
       // LayerDrawable stars = (LayerDrawable) productDetailRatingBar.getProgressDrawable();
       // stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);

       // Drawable progress = productDetailRatingBar.getProgressDrawable();
       // DrawableCompat.setTint(progress, Color.YELLOW);
    }


    public void setGalleryPanel(Product product) {
        Glide.with(productListFragment.getBaseActivity()).load(R.drawable.parknshop_square).into(redemptionImageView);

        HeaderViewPagerAdapter headerViewPagerAdapter = new HeaderViewPagerAdapter(productListFragment.getFragmentManager());

        headerViewPagerAdapter.centerInside = true;

        List<ImageData> productImageList = new ArrayList<ImageData>();
        HashMap<Integer, ImageData> hashMap = new HashMap<>();

        for (int i = 0; i < product.getImages().size(); i++) {
            if (product.getImages().get(i).isAdProductImage() || product.getImages().get(i).isProductImage()) {
                //productImageList.add(product.getImages().get(i).getGalleryIndex(), product.getImages().get(i));
                hashMap.put(product.getImages().get(i).getGalleryIndex(), product.getImages().get(i));
                redemptionImageView.setVisibility(View.GONE);
            }
        }

        for(int i = 0 ; i < hashMap.size(); i++) {
            productImageList.add(i, hashMap.get(i));
        }

        headerViewPagerAdapter.setList(productImageList);
        headerViewPagerAdapter.tutorialPanel = tutorialDotPanel;

        headerViewPagerAdapter.setCount(productImageList.size());

        crazySaleHeaderViewPager.setAdapter(headerViewPagerAdapter);
        crazySaleHeaderViewPager.setOnPageChangeListener(headerViewPagerAdapter);

        TutorialPresenter.initProductDotPanel(tutorialDotPanel, productListFragment.getBaseActivity(), productImageList.size());
    }


    public void setProductDetailFragment(Product product) {
        setRatingBarLayout();
        this.product = product;

        if(product == null) return;
            setGalleryPanel(product);

        productListFragment.setToolbarTitle(product.getName());
        productListFragment.enableSecondRightButton();
        productListFragment.disableNavigationDrawer();
        productListFragment.showBackButton();
        productDetailTitle.setText(product.getBrandName() );
//+ (product.getPnsContentSizeUnit() != null && product.getPnsContentSizeUnit().length() > 0 ? "," + product.getPnsContentSizeUnit() : "")

        String specText = (product.getPnsContentSizeUnit() != null && product.getPnsContentSizeUnit().length() > 0 ? "," + product.getPnsContentSizeUnit() : "");
        productDetailSmallDecription.setText(
                handEmptyString(product.getName()) +
                        (product.getDescSpec() != null ? "," : "") +
                        handEmptyString(product.getDescSpec()) + specText);

        if(product.getStorageInformation().length() == 0 && product.getIgcPhamacy().length() == 0 && product.getIgcUses().length() == 0 && product.getIgcWarnings().length() == 0)
            placeholderRoot.findViewById(R.id.desc_panel).setVisibility(View.GONE);

        //description.setText(product.getIgcPhamacy().length() == 0 ? Html.fromHtml(product.getIgcPhamacy()) : "");

        //if(description.getText().toString().length() == 0)
        //    description.setVisibility(View.GONE);

        //no use
        placeholderRoot.findViewById(R.id.dummy_product_detail_specification).setVisibility(/*product.getName() != null ? View.VISIBLE :*/ View.GONE);
        productDetailSpecification.setVisibility(View.GONE);

        placeholderRoot.findViewById(R.id.dummy_product_detail_use).setVisibility(product.getIgcUses().length() > 0 ? View.VISIBLE : View.GONE);
        productDetailUse.setText(product.getIgcUses().length() > 0 ? Html.fromHtml(product.getIgcUses()) : "");
        productDetailUse.setVisibility(product.getIgcUses().length() > 0 ? View.VISIBLE : View.GONE);

        placeholderRoot.findViewById(R.id.dummy_product_detail_precautions).setVisibility(product.getIgcWarnings().length() > 0 ? View.VISIBLE : View.GONE);
        productDetailPrecautions.setText(product.getIgcWarnings().length() > 0 ? Html.fromHtml(product.getIgcWarnings()) : "");
        productDetailPrecautions.setVisibility(product.getIgcWarnings().length() > 0 ? View.VISIBLE : View.GONE);

        placeholderRoot.findViewById(R.id.dummy_product_detail_storage_information).setVisibility(product.getStorageInformation().length() > 0 ? View.VISIBLE : View.GONE);
        ((TextView)placeholderRoot.findViewById(R.id.product_detail_storage_information)).setText(product.getStorageInformation().length() > 0 ? product.getStorageInformation() : "");
        (placeholderRoot.findViewById(R.id.product_detail_storage_information)).setVisibility(product.getStorageInformation().length() > 0 ? View.VISIBLE : View.GONE);

        productDetailCurrentPrice.setText(product.getPrice());

        if(product.getAppPromotionPrice() != null) {
            productDetailCurrentPrice.setText(product.getAppPromotionPrice());
            productDetailCurrentPrice.setTextColor(productListFragment.getBaseActivity().getResources().getColor(R.color.app_red));
        }

        if(product.getMemberPricePns() != null) {
            this.productDetailMbPriceLayout.setVisibility(View.VISIBLE);
            this.productDetailMemberPrice.setText(product.getMemberPricePns());
        } else {
            this.productDetailMbPriceLayout.setVisibility(View.GONE);
        }


        if(product.getRrpPriceTagFlag()) {
            productDetailRrp.setVisibility(View.VISIBLE);
            if(product.getAppPromotionPrice() != null) {
                //productDetailRrp.setImageResource(R.drawable.rrp_red);
            }
        }

        //Log.i("yoyo", "yoyo" + product.getOldPrice() + " " + product.showCrossLine() );

        if(product.getRrpPrice() != null && product.getRrpPriceFloat() > 0 && product.getRrpPriceTagFlag()) {
            productDetailOriginalPrice.setText(productListFragment.getString(R.string.was_price) + product.getRrpPrice());
            productDetailOriginalPrice.setVisibility(View.VISIBLE);

            if(product.showCrossLine()) {
                productDetailOriginalPrice.setBackgroundResource(R.drawable.crossline);
            } else {
                productDetailOriginalPrice.setBackgroundResource(android.R.color.transparent);
            }
        } else {
            productDetailOriginalPrice.setVisibility(View.GONE);
            productDetailOriginalPrice.setBackgroundResource(android.R.color.transparent);
        }

        country.setText(product.getIgcInformativeText3());

        if(product.getIgcInformativeText3() != null && product.getIgcInformativeText3().length() > 0 && !product.getIgcInformativeText3().equals("CN")) {
            if(! (ConfigHelper.getConfig(productListFragment.getBaseActivity(), "ICON_FLAG_" + product.getIgcInformativeText3()) == null)) {
                countryView.setVisibility(product.getIgcInformativeText3() == null || product.getIgcInformativeText3().length() == 0 ? View.GONE : View.VISIBLE);
                country.setText(ConfigHelper.getConfig(productListFragment.getBaseActivity(), "ICON_FLAG_" + product.getIgcInformativeText3()).getTitle());
                Glide.with(productListFragment.getBaseActivity()).load(ConfigHelper.getImageUrl(productListFragment.getBaseActivity(), "ICON_FLAG_" + product.getIgcInformativeText3())).into(countryFlag);
            }
        }

        //igcPromotionTag
        if(product.getIgcPromotionTag() != null) {
            productPromotionHorizontalLayout.removeAllViews();
            productPromotionHorizontalLayout.setVisibility(View.VISIBLE);
            for(int i = 0; i < product.getIgcPromotionTag().size() ; i++) {
                TextView tempTextView = new TextView(productListFragment.getBaseActivity());
                tempTextView.setText(product.getIgcPromotionTag().get(i ));
                tempTextView.setBackgroundResource(R.drawable.r_corners);

                GradientDrawable drawable = (GradientDrawable) tempTextView.getBackground();

                drawable.setColor(Color.parseColor("#FDDB00"));

                tempTextView.setTextColor(productListFragment.getResources().getColor(R.color.app_red));

                FlowLayout.LayoutParams ll = new FlowLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                ll.setMargins(Utils.dpToPx(5, productListFragment.getBaseActivity()) , 0, Utils.dpToPx(5, productListFragment.getBaseActivity()), Utils.dpToPx(5, productListFragment.getBaseActivity()));

                tempTextView.setPadding(Utils.dpToPx(10, productListFragment.getBaseActivity()),0, Utils.dpToPx(10, productListFragment.getBaseActivity()),0);

                tempTextView.setGravity(Gravity.CENTER);
                tempTextView.setLayoutParams(ll);
                tempTextView.setTypeface(Typeface.DEFAULT_BOLD);
                /*PromotionTextView tempTextView = new PromotionTextView(productListFragment.getBaseActivity());
                tempTextView.setPromotionText(product.getIgcPromotionTag().get(i));*/
                productPromotionHorizontalLayout.addView(tempTextView);
            }
        }

        new_view.setVisibility(product.getPnsNewLabel() ? View.VISIBLE : View.GONE);
        //type.setText(product.getDescOrigin());

        if (product.getStorePickupAllowed()) {
            selfPickUpView.setVisibility(View.VISIBLE);
            homeDeliveryView.setVisibility(View.VISIBLE);
        } else {
            selfPickUpView.setVisibility(View.GONE);
            homeDeliveryView.setVisibility(View.VISIBLE);
        }

        description.setText(Html.fromHtml(product.getDescription()));
        if(description.getText().length() == 0)
            description.setVisibility(View.GONE);


        //productDetailRatingBar.setRating(product.getAverageRating());
        productDetailProperRatingBar.setRating(product.getAverageRating());
        ratingCount.setText("(" + product.getNumberOfReviews()  + ")");
        promotionCount.setText("(" + product.getIwaPromotionsData().size() + ")");

        //iwaPromotionsData
        if(product.getIgcIngredients() != null) {
            //IngredientViewHolder ingredientView = new IngredientViewHolder(productListFragment.getBaseActivity());
            //ingredientView.init(productListFragment.getBaseActivity());
            //ingredientView.setIngredientItem(Html.fromHtml(product.getIgcIngredients()).toString());
            //ingredientView.setIngredientWeight("100 g");
            //ingredientLayout.addView(ingredientView.getView());
            ingredientLayout.removeAllViews();
            TextView ingredientTextView = new TextView(productListFragment.getBaseActivity());
            ingredientTextView.setText(Html.fromHtml(product.getIgcIngredients().toString()));
            ingredientTextView.setLineSpacing(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5.0f, productListFragment.getResources().getDisplayMetrics()), 1.0f);
            ingredientLayout.addView(ingredientTextView);

            ingredientPlaceholder.setVisibility(View.VISIBLE);
            //productDescriptionArrow.setVisibility(View.VISIBLE);

            //productDescriptionArrowViewHolder = new ProductDescriptionArrowViewHolder(productListFragment.productDescriptionArrow, ingredientWrapper);
        } else {
            ingredientWrapper.setVisibility(View.GONE);
        }

        productCodeTextView.setText(product.getCode());
        //product.getStorePickupAllowed()
        //
        ArrayList<String> stringArrayList = new ArrayList<>();

        if (( ((ProductListFragment)productListFragment).redemptionProductList.size() != 0)) {
            stringArrayList.add(productListFragment.getResources().getString(R.string.home_activity_sliding_menu_redemption));
        }

        if ( ( ((ProductListFragment)productListFragment).productListAdapter.relatedProductList.size() != 0)) {
            stringArrayList.add(productListFragment.getResources().getString(R.string.related_product));
        }


        if(stringArrayList.size() == 0)
            tabLayout.setVisibility(View.GONE);
        else
            tabLayout.setVisibility(View.VISIBLE);

        DummyAdapter dummyAdapter = new DummyAdapter(stringArrayList, productListFragment.getSupportFragmentManager());
        redemptionTagViewpager.setAdapter(dummyAdapter);
        redemptionTagViewpager.setOnPageChangeListener(dummyAdapter);
        tabLayout.setTabTextColors(productListFragment.getResources().getColorStateList(R.color.colorPrimary));

        tabLayout.setBackgroundResource(R.color.grey);
        //tabLayout.setSelectedTabIndicatorColor(R.color.white);

        tabLayout.setupWithViewPager(redemptionTagViewpager);
        redemptionTagViewpager.setCurrentItem( ((ProductListFragment)productListFragment).productListAdapter.tabPosition);


        final ImageView gradient_background = (ImageView) placeholderRoot.findViewById(R.id.gradient_background);

        final View view = placeholderRoot.findViewById(R.id.wrapper_for_detail);
        final ViewTreeObserver vto = placeholderRoot.findViewById(R.id.wrapper_for_detail).getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                double height = 0;//placeholderRoot.findViewById(R.id.wrapper_for_detail).getHeight();
                for(int i = 0; i < ((LinearLayout) placeholderRoot.findViewById(R.id.wrapper_for_detail)).getChildCount();i++) {
                    height += ((LinearLayout) placeholderRoot.findViewById(R.id.wrapper_for_detail)).getChildAt(i).getHeight();
                }
                double originalHeight = Utils.dpToPxHeight(120, productListFragment.getBaseActivity());

                //ToastUtils.show(productListFragment.getBaseActivity(), originalHeight + " " + height);

                if(height > originalHeight) {
                    gradient_background.setVisibility(View.VISIBLE);
                    arrowProductDetail.setVisibility(View.VISIBLE);
                    placeholderRoot.findViewById(R.id.wrapper_for_detail).setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, Utils.dpToPxHeight(120, productListFragment.getBaseActivity()) ));
                } else {
                    gradient_background.setVisibility(View.GONE);
                    arrowProductDetail.setVisibility(View.GONE);
                    placeholderRoot.findViewById(R.id.wrapper_for_detail).setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT ));
                }

                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);

                //removeGlobalOnLayoutListener();
            }
        });
    }

    public String handEmptyString(String s) {
        if(s == null || s.length() == 0) return "";
        return s;
    }

    public void scaleView(View v, float startScale, float endScale) {
        /*Animation anim = new ScaleAnimation(
                1f, 1f, // Start and end values for the X axis scaling
                startScale, endScale, // Start and end values for the Y axis scaling
                Animation.RELATIVE_TO_SELF, 0f, // Pivot point of X scaling
                Animation.RELATIVE_TO_SELF, 1f); // Pivot point of Y scaling
        anim.setFillAfter(true); // Needed to keep the result of the animation
        v.startAnimation(anim);*/
    }


    @Nullable @OnClick (R.id.rating_panel)
    public void goToRatingPage() {
        if(product == null) return;
        if(product.getRatingList() == null || product.getRatingList().size() == 0)
            return;

        GATrackerHelper.getInstance(productListFragment.getActivity()).setGATracker(product.getUrl()+"/comment");

        ProductCommentFragment productCommentFragment = new ProductCommentFragment();
        productCommentFragment.product = product;
        productListFragment.placeFragmentWithBackStack(productCommentFragment);
    }

    @Nullable @OnClick (R.id.promotion_panel)
    public void goToPromotionPage() {
        if(product == null) return;

        GATrackerHelper.getInstance(productListFragment.getActivity()).setGATracker(product.getUrl()+"/promotion");

        if( product.getIwaPromotionsData() == null ||  product.getIwaPromotionsData().size() == 0)
            return;

        ProductPromotionFragment productPromotionFragment = new ProductPromotionFragment();
        ArrayList<String> array = new ArrayList();
        for(int i = 0; i < product.getIwaPromotionsData().size(); i++) {
            array.add(product.getIwaPromotionsData().get(i).longDescription);
        }
        productPromotionFragment.promotionList = array;//product.getIgcPromotionTag();
        productListFragment.placeFragmentWithBackStack(productPromotionFragment);
    }

    public class DummyAdapter extends FragmentStatePagerAdapter implements ViewPager.OnPageChangeListener{
        public ArrayList<String> arrayList = new ArrayList<>();

        @Override
        public CharSequence getPageTitle(int position) {
            // Generate title based on item position
            if(arrayList.size() == 0)
                return "";
            return arrayList.get(position);
        }

        public DummyAdapter(ArrayList<String> arrayList, FragmentManager fm) {
            super(fm);
            this.arrayList = arrayList;
        }

        @Override
        public Fragment getItem(int position) {
            return new Fragment();
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        //        if ((( (ProductListFragment)productListFragment).redemptionProductList.size() != 0))

        @Override
        public void onPageSelected(int position) {
            ProductListFragment pf = (ProductListFragment) productListFragment;

            if(position != pf.productListAdapter.tabPosition) {
                boolean hasRedemption = ((ProductListFragment)productListFragment).redemptionProductList.size() != 0;
                if ( hasRedemption && position == 0) {
                    pf.productListAdapter.tabPosition = 0;
                    pf.productListAdapter.isRelatedProduct = false;
                    pf.productListAdapter.notifyDataSetChanged();
                }

                if (position == (hasRedemption ? 1 : 0) ) {
                    pf.productListAdapter.tabPosition = (hasRedemption ? 1 : 0);
                    pf.productListAdapter.isRelatedProduct = true;

                    pf.productListAdapter.notifyDataSetChanged();
                    //for(int i = 0; i < Math.max(pf.productListAdapter.relatedProductList.size(), pf.productListAdapter.productList.size()); i++)
                    //    pf.productListAdapter.notifyItemChanged( (pf.productListAdapter.hasHeader ? 1 : 0) + i);
                }
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

    @Nullable @OnClick (R.id.locator)
    public void getLocatorResponse() {

        GATrackerHelper.getInstance(productListFragment.getActivity()).setGATracker(product.getUrl()+"/available-store");

        productListFragment.showProgressDialog();
        WebServiceModel.getInstance(productListFragment.getBaseActivity()).requestGetStockByProductId( ((ProductListFragment) productListFragment).productId , ((ProductListFragment) productListFragment).hashCode());
    }

    @Nullable @OnClick (R.id.share)
    public void shareUrl() {
        ProductListFragment pf = (ProductListFragment) productListFragment;
        //<<<<<<< Updated upstream
        if(pf.productId.length() > 0 && isProductDetail) {
            productListFragment.shareUrl(pf.product != null ? pf.product.getName() : "", "http://www.parknshop.com/p/BP_" + pf.productId );
        }
    }

    @Nullable @OnClick (R.id.reciple)
    public void recipe() {

        GATrackerHelper.getInstance(productListFragment.getActivity()).setGATracker(product.getUrl()+"/recipes");

        WebServiceModel.getInstance(productListFragment.getBaseActivity()).requestRecipeDetailSuggestion(((ProductListFragment)productListFragment).productId);
        productListFragment.showProgressDialog();
    }



    boolean arrowDown = true;
    @Nullable @Bind(R.id.arrow_product_detail) ImageView arrowProductDetail;
    //@Nullable @Bind(R.id.wrapper_for_detail) TextView hiddenWrapper;
    @Nullable @OnClick (R.id.arrow_product_detail)
    public void productArrowDetailOnClick() {
        if(!arrowDown) {
            arrowDown = true;
            arrowProductDetail.setImageResource(R.drawable.buy_more_save_more_arrow_down);

            //description.setText(Html.fromHtml(product.getDescription()));
            //description.setMaxLines(Integer.MAX_VALUE);
            //placeholderRoot.findViewById(R.id.wrapper_for_detail).setVisibility(View.VISIBLE);

            placeholderRoot.findViewById(R.id.gradient_background).setVisibility(View.VISIBLE);

            placeholderRoot.findViewById(R.id.wrapper_for_detail).setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, Utils.dpToPxHeight(120, productListFragment.getBaseActivity())));
        } else {
            arrowDown = false;
            arrowProductDetail.setImageResource(R.drawable.buy_more_save_more_arrow_up);

            //description.setText(Html.fromHtml(product.getDescription()));
            //description.setMaxLines(4);
            placeholderRoot.findViewById(R.id.gradient_background).setVisibility(View.GONE);

            placeholderRoot.findViewById(R.id.wrapper_for_detail).setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
            //placeholderRoot.findViewById(R.id.wrapper_for_detail).setVisibility(View.GONE);
        }
    }

    public void onEvent (RecipeSuggestionEvent event) {
        productListFragment.hideProgressDialog();
        if(event.getSuccess()) {
            //Log.i("RecipeSuggestionEvent s" , "RecipeSuggestionEvent s" + event.getRecipeDetailResponse());

            if (productDetailHeader.getVisibility() != View.VISIBLE)
                return;

            //RecipeDetailResponse
            if (event.getRecipeDetailResponse() != null) {
                RecipeSimpleListFragment recipeSimpleListFragment = RecipeSimpleListFragment.newInstance(event.getRecipeDetailResponse().getData());
                productListFragment.placeFragmentWithBackStack(recipeSimpleListFragment);
            }
        } else {
            //Log.i("RecipeSuggestionEvent f" , "RecipeSuggestionEvent f" + event.getMessage());
        }
    }

    public void onEvent(ProductDetailEvent productDetailEvent) {
        if(isHeader) {
            float height = Utils.dpToPxHeight(250, productListFragment.getActivity());
            float verticalScrolling = productDetailEvent.dy;

            ///Log.i("height", "height" + height + " " + verticalScrolling);

            if(height > verticalScrolling) {
                redemptionImageView.setAlpha(1.0f - verticalScrolling / height);
                crazySaleHeaderViewPager.setAlpha(1.0f - verticalScrolling / height);
            }else {
                redemptionImageView.setAlpha(1);
                crazySaleHeaderViewPager.setAlpha(1);
            }
            //crazySaleHeaderViewPager
            //redemptionImageView
        }
    }
}