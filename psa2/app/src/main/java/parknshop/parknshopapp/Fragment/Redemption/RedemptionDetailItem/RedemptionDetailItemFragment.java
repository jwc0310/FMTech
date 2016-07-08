package parknshop.parknshopapp.Fragment.Redemption.RedemptionDetailItem;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Product.CrazySale.CrazySaleHeaderAdapter;
import parknshop.parknshopapp.Fragment.Tutorial.TutorialPresenter;
import parknshop.parknshopapp.Model.CrazySale;
import parknshop.parknshopapp.Model.RedemptionItemResponse;
import parknshop.parknshopapp.R;

/**
 * Created by hp on 23/4/2016.
 */
public class RedemptionDetailItemFragment  extends BaseFragment {
    public RedemptionItemResponse.RedemptionItem redemptionItem;
    @Nullable @Bind(R.id.gallery_viewpager) ViewPager crazySaleHeaderViewPager;
    @Nullable @Bind(R.id.default_image) ImageView defaultImage;

    @Nullable @Bind(R.id.product_detail_title) TextView titleTextView;
    @Nullable @Bind(R.id.small_description) TextView descriptionTextView;
    @Nullable @Bind(R.id.ingredient_wrapper) View ingredientWrapper;

    @Nullable @Bind(R.id.product_detail_organic_view) View organic_view;
    @Nullable @Bind(R.id.product_detail_country_view) View country_view;
    @Nullable @Bind(R.id.product_detail_new_view) View new_view;

    @Nullable @Bind(R.id.tag_1) TextView tag1;
    @Nullable @Bind(R.id.tag_2) TextView tag2;
    @Nullable @Bind(R.id.tag_wrapper) View tagWrapper;

    @Nullable @Bind(R.id.description_field) TextView description_field;
    @Nullable @Bind(R.id.product_description_item_panel) View itemPanel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.redemption_detail_item_layout, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showLogo();
        showBackButton();
        showShoppingCartButton();
        disableSecondRightButton();
        enableNavigationDrawer();

        setToolbarTitle(redemptionItem.getBrand());

        titleTextView.setText(redemptionItem.getTitle());
        descriptionTextView.setText(redemptionItem.getDescription());
        description_field.setText(redemptionItem.getDescription());
        ingredientWrapper.setVisibility(View.VISIBLE);


        if(redemptionItem.getOption().size() > 0) {
            if (redemptionItem.getOption().size() > 0)
                tag1.setText(redemptionItem.getOption().get(0).getLine());
            else
                tag1.setVisibility(View.GONE);

            if (redemptionItem.getOption().size() > 1)
                tag2.setText(redemptionItem.getOption().get(1).getLine());
            else
                tag2.setVisibility(View.GONE);
        } else {
            tagWrapper.setVisibility(View.GONE);
        }

        //id = getArguments().getString("id");

        //redemptionListAdapter = new RedemptionListAdapter(getActivity());
        //redemptionListAdapter = new RedemptionRecyclerViewAdapter(this);
        //recyclerView.setHasFixedSize(true);
        //StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        //recyclerView.setLayoutManager(staggeredGridLayoutManager);

        CrazySale crazySale = new CrazySale();
        for(int i = 0; i < redemptionItem.getImages().size(); i++) {
            crazySale.loadingUrl.add(redemptionItem.getImages().get(i).getValue());
            defaultImage.setVisibility(View.GONE);
        }

        CrazySaleHeaderAdapter crazySaleHeaderAdapter = (new CrazySaleHeaderAdapter(getSupportFragmentManager(), crazySale.loadingUrl));
        crazySaleHeaderAdapter.tutorialPanel = tutorialDotPanel;
        crazySaleHeaderViewPager.setAdapter(crazySaleHeaderAdapter);
        crazySaleHeaderViewPager.setOnPageChangeListener(crazySaleHeaderAdapter);
        crazySaleHeaderViewPager.setOffscreenPageLimit(crazySale.loadingUrl.size());

        TutorialPresenter.initTutorialPanel(tutorialDotPanel, getBaseActivity(), crazySale.loadingUrl.size());

        itemPanel.setVisibility(View.GONE);

        return view;
    }
    public @Nullable @Bind(R.id.tutorial_dot_panel)
    LinearLayout tutorialDotPanel;

}
