package parknshop.parknshopapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import parknshop.parknshopapp.Fragment.Account.LoginFragment;
import parknshop.parknshopapp.Fragment.Contacts.CustomerServiceFragment;
import parknshop.parknshopapp.Fragment.Coupon.CouponList.CouponListFragment;
import parknshop.parknshopapp.Fragment.Grocery.GroceryMainTabFragment;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Fragment.Home.LeftMenu.LeftMenuOnclickListener;
import parknshop.parknshopapp.Fragment.MemberZone.MemberCardFragment;
import parknshop.parknshopapp.Fragment.Product.ProductDetailRedem.ProductDetailRedemFragment;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.Fragment.QualityAssurance.AboutUsMainFragment;
import parknshop.parknshopapp.Fragment.QualityAssurance.OnlineShoppingMainFragment;
import parknshop.parknshopapp.Fragment.QualityAssurance.QualityAssuranceMainFragment;
import parknshop.parknshopapp.Fragment.Redemption.RedemptionList.RedemptionListFragment;
import parknshop.parknshopapp.Fragment.Settings.SettingFragment;
import parknshop.parknshopapp.Fragment.StoreLocator.StoreLocatorFragment;
import parknshop.parknshopapp.Fragment.TopBrands.TopBrandsFragment;
import parknshop.parknshopapp.Fragment.WebView.WebViewFragment;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.ExpandedMenuModel;
import parknshop.parknshopapp.Rest.event.LogoutEvent;
import parknshop.parknshopapp.Utils.LogUtil;

/**
 * Created by chrisyu on 16/3/12.
 */
public class ExpandableListAdapter extends BaseExpandableListAdapter implements ExpandableListView.OnGroupClickListener, AbsListView.OnScrollListener{
    private Context mContext;
    private List<ExpandedMenuModel> mListDataHeader; // header titles

    // child data in format of header title, child title
    private HashMap<ExpandedMenuModel, List<CategoryDrawerItem>> mListDataChild; // child data getting it via header
    ExpandableListView expandList;

    Map<Integer, View> viewList = new TreeMap<Integer, View>();//new ArrayList<>();
    public int selectedChild;

    public ExpandableListAdapter(Context context, List<ExpandedMenuModel> listDataHeader, HashMap<ExpandedMenuModel, List<CategoryDrawerItem>> listChildData, ExpandableListView mView) {
        this.mContext = context;
        this.mListDataHeader = listDataHeader;
        this.mListDataChild = listChildData;
        this.expandList = mView;
        ViewTreeObserver vto = expandList.getViewTreeObserver();

        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                expandList.setIndicatorBounds(expandList.getRight() - 100, expandList.getWidth() - 40);
            }
        });
    }

    @Override
    public int getGroupCount() {
        int i = mListDataHeader.size();
        //Log.d("GROUPCOUNT", String.valueOf(i));
        return this.mListDataHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        int childCount = 0;
        if(this.mListDataChild.get(this.mListDataHeader.get(groupPosition)) == null) return 0;

        if(this.mListDataChild.get(this.mListDataHeader.get(groupPosition)).size() > 0){  // Tips and Ideas, OnSale, New Arrival
            childCount = this.mListDataChild.get(this.mListDataHeader.get(groupPosition)).size();
            return childCount;
        }else if (groupPosition < HomePresenter.generatingLocalSlidingItemTop(mContext).size()) {

        } else if (groupPosition < HomePresenter.generatingLocalSlidingItemTop(mContext).size() + this.mListDataChild.get(this.mListDataHeader.get(groupPosition)).size()) {
            childCount = this.mListDataChild.get(this.mListDataHeader.get(groupPosition)).size();
        }
        return childCount > 0 ? childCount - 1 : 0;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.mListDataHeader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        if(this.mListDataChild.get(this.mListDataHeader.get(groupPosition)).size() > 0){  // Tips and Ideas, OnSale, New Arrival

            return this.mListDataChild.get(this.mListDataHeader.get(groupPosition)).get(childPosition);
        }else
        if (groupPosition < HomePresenter.generatingLocalSlidingItemTop(mContext).size()) {

        } else if (groupPosition < HomePresenter.generatingLocalSlidingItemTop(mContext).size() + this.mListDataChild.get(this.mListDataHeader.get(groupPosition)).size()) {
            return this.mListDataChild.get(this.mListDataHeader.get(groupPosition)).get(childPosition + 1);
        } else {

        }
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ExpandedMenuModel headerTitle = (ExpandedMenuModel) getGroup(groupPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.one_activity_listheader, null);
        }

        if(headerTitle == null)
            return convertView;

        if(headerTitle.isDivider) {
            convertView.findViewById(R.id.divider).setVisibility(View.VISIBLE);
            convertView.findViewById(R.id.ordinary_root).setVisibility(View.GONE);
            //submenu
        } else {
            convertView.findViewById(R.id.divider).setVisibility(View.GONE);
            convertView.findViewById(R.id.ordinary_root).setVisibility(View.VISIBLE);
        }

        ImageView iv = (ImageView) convertView.findViewById(R.id.group_indicator);

        if(getChildrenCount(groupPosition) == 0) {
            iv.setVisibility(View.INVISIBLE);
        } else {
            iv.setVisibility(View.VISIBLE);
            if(isExpanded) {
                iv.setVisibility(View.VISIBLE);
                Glide.with(mContext).load(R.drawable.home_activity_sliding_menu_item_arrow_up).into(iv);
            } else {
                iv.setVisibility(View.GONE);
            }
        }

        TextView lblListHeader = (TextView) convertView.findViewById(R.id.submenu);
        ImageView headerIcon = (ImageView) convertView.findViewById(R.id.iconimage);
        lblListHeader.setText(headerTitle.getIconName());


        if(headerTitle.getIconImg() > 0) {
            headerIcon.setVisibility(View.VISIBLE);
            Glide.with(mContext).load(headerTitle.getIconImg()).error(R.drawable.pns_default_circle).into(headerIcon);
        } else {
            Glide.with(mContext).load(headerTitle.getUrlIcon()).error(R.drawable.pns_default_circle).into(headerIcon);
            headerIcon.setVisibility(View.VISIBLE);
        }

        //Log.i("isDimmed", "isDimmed " + headerTitle.isDimmed + " " + headerTitle.getIconName());
        if(headerTitle.isDimmed) {
            //convertView.findViewById(R.id.tran_dimmed).setVisibility(View.VISIBLE);
            lblListHeader.setTextColor(mContext.getResources().getColor(R.color.txt_grey));
        } else {
            lblListHeader.setTextColor(mContext.getResources().getColor(R.color.white));
            //convertView.findViewById(R.id.tran_dimmed).setVisibility(View.GONE);
        }

        return convertView;
    }


    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childText = (String) (getChild(groupPosition, childPosition) != null ? ((CategoryDrawerItem)getChild(groupPosition, childPosition)).text : "");

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.one_activity_list_submenu, null);
        }

        TextView txtListChild = (TextView) convertView.findViewById(R.id.submenu);

        txtListChild.setText(childText);

        Object groupData = this.mListDataChild.get(this.mListDataHeader.get(groupPosition));
        CategoryDrawerItem categoryDrawerItem = ((CategoryDrawerItem) getChild(groupPosition, childPosition));

        convertView.setOnClickListener(new LeftMenuOnclickListener(categoryDrawerItem, groupPosition, childPosition, groupData, mContext, this));

        if(selectedChild ==  (int) (groupPosition * (Math.pow((double)(1 + childPosition), (double)2) )))
            txtListChild.setTextColor(mContext.getResources().getColor(R.color.sliding_item_cart_add_to_grocery_list));
        else
            txtListChild.setTextColor(mContext.getResources().getColor(R.color.white));


        viewList.put(groupPosition * (childPosition + 1), convertView);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }


    int lastExpandedPosition;
    public void onGroupExpanded(final int groupPosition) {
        super.onGroupExpanded(groupPosition);
        if(lastExpandedPosition != groupPosition)
            expandList.collapseGroup(lastExpandedPosition);
        expandList.setSelectedGroup(groupPosition);
        lastExpandedPosition = groupPosition;
    }

    @Override//refer groupposition here as position
    public boolean onGroupClick(final ExpandableListView parent, View v, final int position, long id) {
        if(getChildrenCount(position) != 0) return false;
        selectedChild = 0;

        ExpandedMenuModel expandedMenuModel = (ExpandedMenuModel) getGroup(position);
        OneActivity oneActivity = ((OneActivity)mContext);
        oneActivity.closeDrawer();

        //Log.i("onGroupClick", "onGroupClick " + getChildrenCount(position) + " " + expandedMenuModel.getIconName());

        //Log.i("GATAG", "GATAG:" + expandedMenuModel.getTagGA());
        GATrackerHelper.getInstance(mContext).setGATracker(expandedMenuModel.getTagGA());

        if(expandedMenuModel == null)
            return false;

        if(expandedMenuModel.getIconName().equals(mContext.getString(R.string.login))){
            Bundle bundle = new Bundle();
            bundle.putString("from", "MemberZone");
            LoginFragment fragment = new LoginFragment();
            fragment.setArguments(bundle);
            oneActivity.placeFragmentWithBackStack(fragment);
        }else
        if(expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_my_account))){
            if(GlobalConstant.isLogin){
                oneActivity.addFragmentToTop(new MemberCardFragment());
            }else{
                Bundle bundle = new Bundle();
                bundle.putString("from", "MemberZone");
                LoginFragment fragment = new LoginFragment();
                fragment.setArguments(bundle);
                oneActivity.placeFragmentWithBackStack(fragment);
            }
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_grocery_list))) {
            if(GlobalConstant.isLogin){
                oneActivity.addFragmentToTop(new GroceryMainTabFragment());
            }else{
                Bundle bundle = new Bundle();
                bundle.putString("from" ,"GroceryList");
                LoginFragment fragment = new LoginFragment();
                fragment.setArguments(bundle);
                oneActivity.placeFragmentWithBackStack(fragment);
            }
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_redemption))) {
            oneActivity.addFragmentToTop(new RedemptionListFragment());
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.moneyback_card))) {
//            if(GlobalConstant.isLogin || GlobalConstant.isMoneybackCardLogin){
//                oneActivity.addFragmentToTop(new MembershipCardFragment());
//            }else{
//                oneActivity.placeFragmentWithBackStack(new MoneybackCardLoginFragment());
//            }
            WebViewFragment webViewFragment = WebViewFragment.newInstance("https://app.parknshop.com/"+(GlobalConstant.language.equals(GlobalConstant.LANG_ZH) ? "tc" : GlobalConstant.LANG_EN)+"/menu.php");
            GATrackerHelper.getInstance(mContext).setGATracker("moneyback");
            oneActivity.addFragmentToTop(webViewFragment);
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_m_coupon))) {
            oneActivity.addFragmentToTop(new CouponListFragment());
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_tips_ideas))) {
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_on_sale))) {
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_new_arrival))) {
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_international))) {
            oneActivity.addFragmentToTop(new StoreLocatorFragment());
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_top_brands))) {
            oneActivity.addFragmentToTop(new TopBrandsFragment());
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_recipes))) {
            oneActivity.addFragmentToTop(ProductDetailRedemFragment.newPDInstance(308485));
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_settings))) {
            oneActivity.addFragmentToTop(new SettingFragment());
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_quality_assurance))) {
            oneActivity.addFragmentToTop(new QualityAssuranceMainFragment());
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_about_us))) {
            oneActivity.addFragmentToTop(new AboutUsMainFragment());
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_online_shopping))) {
            oneActivity.addFragmentToTop(new OnlineShoppingMainFragment());
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_customer_service))) {
            oneActivity.addFragmentToTop(new CustomerServiceFragment());
        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_facebook))) {
            try{
                ApplicationInfo info = mContext.getPackageManager().getApplicationInfo("com.facebook.katana", 0 );
                //Uri uri = Uri.parse("fb://facewebmodal/f?href=" + url);
                mContext.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/1445121809056813")));
                return true;
            } catch( Exception e ){
                WebViewFragment webViewFragment =  WebViewFragment.newInstance("https://www.facebook.com/parknshophk");
                webViewFragment.title = "Facebook";
                oneActivity.addFragmentToTop(webViewFragment);
                return false;
            }

        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_logout))) {
            MyApplication.getInstance().mBus.post(new LogoutEvent());
        } else if (this.mListDataHeader.get(position).id != null) {
            ProductListFragment plf = ProductListFragment.newInstance(this.mListDataHeader.get(position).id , this.mListDataHeader.get(position).getIconName());
            plf.setGATag(this.mListDataHeader.get(position).getTagGA());
            oneActivity.addFragmentToTop(plf);
            LogUtil.info("", "SubCate1:"+mListDataHeader.get(position).id+", "+mListDataHeader.get(position).getContent());
        } else if(this.mListDataHeader.get(position) != null ) {

            CategoryDrawerItem tempCat = new CategoryDrawerItem("0" , expandedMenuModel.getIconName(), expandedMenuModel.contentEn);
            parknshop.parknshopapp.Model.Category.SubCategory tempSubCat = tempCat.getSubCategory();
            tempSubCat.setContentType(expandedMenuModel.getContentType());
            tempSubCat.setValue(expandedMenuModel.getContent());
            tempCat.setSubCategory(tempSubCat);

            LogUtil.info("", "SubCate1:"+tempSubCat.getValue()+", "+tempSubCat.getId());

            oneActivity.handleCategoryFragmentSwitch(expandedMenuModel.getContentType(), expandedMenuModel.getContent(), tempCat);
        }
        return true;
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

        for(int i = 0; i < getChildrenCount(lastExpandedPosition); i++) {
            if(viewList.get(lastExpandedPosition * (i + 1)) != null) {
                float scrolly = viewList.get(lastExpandedPosition * (i + 1)).getTop();// + (lastExpandedPosition + i + 1) * c.getHeight();

                if(scrolly < viewList.get(lastExpandedPosition * (i + 1)).getHeight()){
                    viewList.get(lastExpandedPosition * (i + 1)).setAlpha( 1f -  Math.abs(viewList.get(lastExpandedPosition * (i + 1)).getHeight() - scrolly) / viewList.get(lastExpandedPosition * (i + 1)).getHeight()   );
                } else {
                    viewList.get(lastExpandedPosition * (i + 1)).setAlpha(1.0f);
                }
            }
        }
    }


    public void redrawListView() {
        int firstItem = expandList.getFirstVisiblePosition();
        int lastItem = expandList.getLastVisiblePosition();
        for(int i = firstItem;i <= lastItem; i++) {
            View v = expandList.getChildAt(i - firstItem);
            expandList.getAdapter().getView(i, v, expandList);
            expandList.invalidateViews();
        }
    }

}
