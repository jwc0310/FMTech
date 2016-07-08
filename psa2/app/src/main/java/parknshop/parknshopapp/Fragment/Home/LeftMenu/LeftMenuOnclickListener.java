package parknshop.parknshopapp.Fragment.Home.LeftMenu;

import android.content.Context;
import android.view.View;

import com.orhanobut.hawk.Hawk;

import java.util.List;

import parknshop.parknshopapp.ExpandableListAdapter;
import parknshop.parknshopapp.Fragment.Category.CategoryFragment;
import parknshop.parknshopapp.Fragment.Category.CategoryHighLight.CategoryHighLightFragment;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.Fragment.WebView.WebViewFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.Utils.LogUtil;

import static android.view.View.OnClickListener;

/**
 * Created by chrisyu on 16/3/12.
 */
public class LeftMenuOnclickListener implements OnClickListener {
    CategoryDrawerItem categoryDrawerItem;
    Context context;
    OneActivity oneActivity;
    int groupPos;
    int childPos;
    boolean up;
    List<CategoryDrawerItem> groupData;
    ExpandableListAdapter expandableListAdapter;
    CategoryTree mCategoryTree;


    public LeftMenuOnclickListener(CategoryDrawerItem categoryDrawerItem, int childPos, Object groupData, Context context) {
        LogUtil.info("", "LeftMenuOnclickListener1");
        this.categoryDrawerItem = categoryDrawerItem;
        this.context = context;
        this.oneActivity = (OneActivity) context;
        this.groupPos = groupPos;
        this.childPos = childPos;
        this.groupData = (List<CategoryDrawerItem>)groupData;
    }

    public LeftMenuOnclickListener(CategoryDrawerItem categoryDrawerItem, int groupPos, int childPos, Object groupData, Context context, ExpandableListAdapter expandableListAdapter) {
        LogUtil.info("", "LeftMenuOnclickListener2");
        this.categoryDrawerItem = categoryDrawerItem;
        this.context = context;
        this.oneActivity = (OneActivity) context;
        this.groupPos = groupPos;
        this.childPos = childPos;
        this.groupData = (List<CategoryDrawerItem>)groupData;
        this.expandableListAdapter = expandableListAdapter;
    }

    public LeftMenuOnclickListener(CategoryDrawerItem categoryDrawerItem, int groupPos, int childPos, Object groupData, Context context, ExpandableListAdapter expandableListAdapter, CategoryTree categoryTree) {

        LogUtil.info("", "LeftMenuOnclickListener3");
        this.categoryDrawerItem = categoryDrawerItem;
        this.context = context;
        this.oneActivity = (OneActivity) context;
        this.groupPos = groupPos;
        this.childPos = childPos;
        this.groupData = (List<CategoryDrawerItem>)groupData;
        this.expandableListAdapter = expandableListAdapter;
        this.mCategoryTree = categoryTree;
    }

    @Override
    public void onClick(View v) {
        //Log.i("contentType", "[contentType] " + categoryDrawerItem.getName());
        //Log.i("GATAG", "GATAG:" + categoryDrawerItem.getTagGA());


        if(mCategoryTree != null) {
            CategoryTree.Data.SubCategory subCategory = mCategoryTree.getData().getSubcategories().get(childPos);
            GATrackerHelper.getInstance(context).setProduct();
            GATrackerHelper.getInstance(context).setCategory(subCategory.getCateStringEN() + "/" + categoryDrawerItem.getTagGA() + "/c/" + subCategory.getId());
            GATrackerHelper.getInstance(context).setGATracker( subCategory.getCateStringEN() + "/" + categoryDrawerItem.getTagGA() + "/c/" +subCategory.getId());
        } else {
            GATrackerHelper.getInstance(context).setGATracker(categoryDrawerItem.getTagGA());
        }

        //Redraw listview item for selecting blue color
        //if(expandableListAdapter != null ) {
        Hawk.put("groupPos", groupPos);
        Hawk.put("childPos", childPos);

        //Log.i("childPos", "childPos" + groupPos + " " + childPos);
        // expandableListAdapter.selectedChild = (int) (groupPos * (Math.pow((double)(1 + childPos), (double)2) ));
        //( (TextView) v.findViewById(R.id.submenu) ).setTextColor(context.getResources().getColor(R.color.menu_click));
        //   expandableListAdapter.redrawListView();
        //}

        HomePresenter.exapandableAdapter.notifyDataSetChanged();

        oneActivity.getRecyclerView().scrollBy(0, 1);
        //.linearLayoutManager.scrollVerticallyBy(1, oneActivity.getRecyclerView(), RecyclerView.State );

        if(categoryDrawerItem.getContentType() != null && (categoryDrawerItem.getContentType().equals(GlobalConstant.ONLINE_PROMOTION) || categoryDrawerItem.getContentType().equals(GlobalConstant.PROMTOION))) {
            oneActivity.closeDrawer();
            handleOnSaleFragmentSwitch(categoryDrawerItem);
        } else if(categoryDrawerItem.getContentType() != null) {
            oneActivity.closeDrawer();
            oneActivity.handleCategoryFragmentSwitch(categoryDrawerItem.getContentType(), categoryDrawerItem.getContent(), categoryDrawerItem, groupData, childPos);
        } else {
            handleServerSideFragmentSwitch(categoryDrawerItem);
        }

    }

    public void handeWebViewFragmentSwitch(String url) {
        oneActivity.closeDrawer();
        WebViewFragment webViewFragment = WebViewFragment.newInstance(url);
        oneActivity.placeFragmentWithBackStack(webViewFragment);
    }

    public void handleServerSideFragmentSwitch(CategoryDrawerItem categoryDrawerItem) {
        oneActivity.closeDrawer();
        //oneActivity.showProgressDialog();
        ProductListFragment pf = ProductListFragment.newInstance((categoryDrawerItem.id), categoryDrawerItem.text);
        pf.categoryId = categoryDrawerItem.id;
        pf.headerId = categoryDrawerItem.getHeaderId();
        pf.setGATag(categoryDrawerItem.getTagGA());
        oneActivity.addFragmentToTop(pf);
    }

    // On Sale
    public void handleOnSaleFragmentSwitch(CategoryDrawerItem categoryDrawerItem) {
        oneActivity.closeDrawer();

        if(categoryDrawerItem.getContentType().equals(GlobalConstant.ONLINE_PROMOTION)) {
            GATrackerHelper.getInstance(oneActivity).setGATracker("online-promotion/" + categoryDrawerItem.getTagGA());
            GATrackerHelper.getInstance(oneActivity).setCategory("online-promotion/" + categoryDrawerItem.getTagGA() + "/");
        } else if(categoryDrawerItem.getContentType().equals(GlobalConstant.PROMTOION)) {
            GATrackerHelper.getInstance(oneActivity).setGATracker(categoryDrawerItem.getTagGA().toLowerCase().replace(" ", "-"));
            GATrackerHelper.getInstance(oneActivity).setCategory(categoryDrawerItem.getTagGA() + "/");
        }

        if(groupData != null && groupData.size() > 0) {
            CategoryFragment categoryFragment = new CategoryFragment();
            categoryFragment.groupData = groupData;
            categoryFragment.childPosition = childPos;
            categoryFragment.title = categoryDrawerItem.text;

            oneActivity.addFragmentToTop(categoryFragment);
        } else {
            CategoryHighLightFragment chlf = CategoryHighLightFragment.newInstance(categoryDrawerItem.getSubCategory());
            chlf.id = Integer.valueOf(categoryDrawerItem.getContent());
            chlf.toolbarTitle = categoryDrawerItem.text;
            chlf.categoryDrawerItem = categoryDrawerItem;
            chlf.isChildFragment = true;
            oneActivity.addFragmentToTop(chlf);
        }
    }
}
