package parknshop.parknshopapp.Fragment.Category.CategoryHighLight;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.Category.SubCategory;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.PromotionEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 11/3/16.
 */
public class CategoryHighLightFragment extends BaseFragment {

    //@Bind (R.id.viewpager) ViewPager viewPager;
    //@Bind (R.id.tab_layout) TabLayout tabLayout;

    @Bind(R.id.listview) ListView listView;
    @Bind(R.id.progressBar) View progressView;
    public int id;
    public String title;
    public List<CategoryDrawerItem> groupData;
    public int childPosition;
    public CategoryDrawerItem categoryDrawerItem;

    static SubCategory mSubCategory;


    View view;

    public static CategoryHighLightFragment newInstance(SubCategory subCategory) {
        CategoryHighLightFragment frag = new CategoryHighLightFragment();
        mSubCategory = subCategory;
        Bundle b = new Bundle();
        //b.putInt(PAGE, index);
        frag.setArguments(b);
        return frag;
    }


    public void onCreate(Bundle onSavedBundle) {
        super.onCreate(onSavedBundle);
        view = getActivity().getLayoutInflater().inflate(R.layout.category_highlight_fragment, null);

        //GATrackerHelper.getInstance(getActivity()).setGATracker("promotion-inner");

        ButterKnife.bind(this, view);

        //showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestGetPromotion(getActivity(), id+"", "happytime", this.hashCode());
    }

    public String toolbarTitle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        showToolbar();
        showMenuButton();

        if(toolbarTitle != null)
            setToolbarTitle(toolbarTitle);

        enableNavigationDrawer();
        enableSecondRightButton();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    public void onEvent(final PromotionEvent promotionEvent) {
        if(promotionEvent.getSuccess()){
            hideProgressDialog();
            CategoryHighlightAdapter chla = new CategoryHighlightAdapter(getBaseActivity(), promotionEvent.getPromotionResponse());
            listView.setAdapter(chla);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    LogUtil.info("", "promotionEvent:"+promotionEvent.getPromotionResponse().getData().get(position).getId());

                    if(categoryDrawerItem.getContentType().equals(GlobalConstant.ONLINE_PROMOTION)) {
                        GATrackerHelper.getInstance(getBaseActivity()).setGATracker("online-promotion/" + categoryDrawerItem.getTagGA() + "/" + mSubCategory.titleEn);
                        GATrackerHelper.getInstance(getBaseActivity()).setCategory("online-promotion/" + categoryDrawerItem.getTagGA() + "/" + mSubCategory.titleEn);
                    } else if(categoryDrawerItem.getContentType().equals(GlobalConstant.PROMTOION)) {
                        GATrackerHelper.getInstance(getBaseActivity()).setGATracker(categoryDrawerItem.getTagGA().toLowerCase().replace(" ", "-") + "/" + mSubCategory.titleEn);
                        GATrackerHelper.getInstance(getBaseActivity()).setCategory(categoryDrawerItem.getTagGA() + "/" + mSubCategory.titleEn);
                    }

                    if(promotionEvent.getPromotionResponse().getData().get(position).getContentType().equals(GlobalConstant.PROMTOION) || promotionEvent.getPromotionResponse().getData().get(position).getContentType().equals(GlobalConstant.ONLINE_PROMOTION) ) {
                        ProductListFragment plf = (ProductListFragment.newInstance(promotionEvent.getPromotionResponse().getData().get(position), mSubCategory, mSubCategory.getId(), mSubCategory.getTitle(), false));
                        plf.isCrazySale = true;
                        plf.toolbarTitle = mSubCategory.getTitle();
                        plf.setGATag(mSubCategory.getTitleEn());
                        CategoryHighLightFragment.this.placeFragmentWithBackStack(plf);
                    } else {
                        CategoryDrawerItem tempCat = new CategoryDrawerItem("0" , promotionEvent.getPromotionResponse().getData().get(position).getTitle(), promotionEvent.getPromotionResponse().getData().get(position).getTitle_en());
                        parknshop.parknshopapp.Model.Category.SubCategory tempSubCat = tempCat.getSubCategory();
                        tempSubCat.setContentType(promotionEvent.getPromotionResponse().getData().get(position).getContentType());
                        tempSubCat.setValue(promotionEvent.getPromotionResponse().getData().get(position).getContent());

                        tempCat.setSubCategory(tempSubCat);

                        LogUtil.info("", "promotionEvent3123:"+promotionEvent.getPromotionResponse().getData().get(position).getContent());
                        (getBaseActivity()).handleCategoryFragmentSwitch(promotionEvent.getPromotionResponse().getData().get(position).getContentType(), promotionEvent.getPromotionResponse().getData().get(position).getContent(), tempCat);
                    }
                }
            });
        } else {
            ToastUtils.show(getActivity(), promotionEvent.getMessage());
        }
        progressView.setVisibility(View.GONE);
    }
}
