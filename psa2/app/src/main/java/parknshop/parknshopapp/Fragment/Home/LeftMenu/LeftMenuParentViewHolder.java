package parknshop.parknshopapp.Fragment.Home.LeftMenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.bumptech.glide.Glide;
import com.orhanobut.hawk.Hawk;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Fragment.Account.LoginFragment;
import parknshop.parknshopapp.Fragment.Category.CategoryHighLight.CategoryHighLightFragment;
import parknshop.parknshopapp.Fragment.Contacts.CustomerServiceFragment;
import parknshop.parknshopapp.Fragment.Coupon.CouponList.CouponListFragment;
import parknshop.parknshopapp.Fragment.Grocery.GroceryMainTabFragment;
import parknshop.parknshopapp.Fragment.Home.HomeFragment;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Fragment.Home.ScanSearchActivity;
import parknshop.parknshopapp.Fragment.InBox.InBoxFragment;
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
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.Model.ExpandedMenuModel;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.LogoutEvent;

/**
 * Created by hp on 9/6/2016.
 */
public class LeftMenuParentViewHolder extends ParentViewHolder {
    /**
     * Default constructor.
     *
     * @param itemView The {@link View} being hosted in this ViewHolder
     */
    @Bind(R.id.ordinary_root) LinearLayout ordinaryRoot;
    @Bind(R.id.iconimage) ImageView iconImage;
    @Bind(R.id.submenu) TextView submenu;
    @Bind(R.id.group_indicator) ImageView groupIndicator;
    @Bind(R.id.divider) View divider;
    @Bind(R.id.tran_dimmed) View tran_dimmed;
    @Bind(R.id.header) View header;


    @Nullable
    @Bind(R.id.txtBadge) TextView txtBadge;

    Context mContext;
    int position;
    public View root;
    private CategoryTree mCategoryTree;

    public LeftMenuParentViewHolder(View itemView) {
        super(itemView);
        root = itemView;
        mContext = itemView.getContext();
        ButterKnife.bind(this, itemView);
    }

    public void setCategoryTree(CategoryTree categoryTree) {
        mCategoryTree = categoryTree;
    }

    public CategoryTree getCategoryTree() {
        return mCategoryTree;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    ExpandedMenuModel data;
    public void bind(final ExpandedMenuModel data) {
        this.data = data;
        int unreadMessageCount = Hawk.get("unreadMesssageCount", 0);

        if(unreadMessageCount > 0) {
            txtBadge.setText(unreadMessageCount + "");
            txtBadge.setVisibility(View.VISIBLE);
        } else {
            txtBadge.setText(unreadMessageCount + "");
            txtBadge.setVisibility(View.GONE);
        }

        if(data.isDivider) {
            divider.setVisibility(View.VISIBLE);
            ordinaryRoot.setVisibility(View.GONE);
            header.setVisibility(View.GONE);
        } else if (data.header != null) {
            divider.setVisibility(View.GONE);
            ordinaryRoot.setVisibility(View.GONE);
            header.setVisibility(View.VISIBLE);
        } else {
            divider.setVisibility(View.GONE);
            ordinaryRoot.setVisibility(View.VISIBLE);
            header.setVisibility(View.GONE);
        }

        //if(getChildrenCount(groupPosition) == 0) {
            //groupIndicator.setVisibility(View.INVISIBLE);
        //} else {
            //groupIndicator.setVisibility(View.VISIBLE);
            /*if(isExpanded) {
                iv.setVisibility(View.VISIBLE);
                Glide.with(mContext).load(R.drawable.home_activity_sliding_menu_item_arrow_up).into(iv);
            } else {
                iv.setVisibility(View.GONE);
            }*/
        //}

        //TextView lblListHeader = (TextView) convertView.findViewById(R.id.submenu);
        //ImageView headerIcon = (ImageView) convertView.findViewById(R.id.iconimage);
        submenu.setText(data.getIconName());


        if(data.getIconImg() > 0) {
            iconImage.setVisibility(View.VISIBLE);
            Glide.with(mContext).load(data.getIconImg()).error(R.drawable.pns_default_circle).into(iconImage);
        } else {
            Glide.with(mContext).load(data.getUrlIcon()).error(R.drawable.pns_default_circle).into(iconImage);
            iconImage.setVisibility(View.VISIBLE);
        }

        //Log.i("isDimmed", "isDimmed " + headerTitle.isDimmed + " " + headerTitle.getIconName());
        if(data.isDimmed) {
            //convertView.findViewById(R.id.tran_dimmed).setVisibility(View.VISIBLE);
            submenu.setTextColor(mContext.getResources().getColor(R.color.txt_grey));
        } else {
            submenu.setTextColor(mContext.getResources().getColor(R.color.white));
            //convertView.findViewById(R.id.tran_dimmed).setVisibility(View.GONE);
        }

        if(HomePresenter.expandedPosition == position)
            setExpanded(HomePresenter.expanded);


        //if(HomePresenter.expanded) {
            //Log.i("position", "position" + position + " " + Hawk.get("selectedGroupPos") + " " + Hawk.get("childPos"));
        if(position == Hawk.get("selectedGroupPos", 0))
            submenu.setTextColor(mContext.getResources().getColor(R.color.menu_click));
       //}

        ordinaryRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Log.i("GATAG", "GATAG123:"+", "+(getCategoryTree() == null));
                if(data.getCategoryDrawerItems() == null || data.getCategoryDrawerItems().size() == 0) {
                    performSwitch();
                    //Log.i("GATAG", "GATAG3:"+", ");

                    Hawk.put("selectedGroupPos", HomePresenter.expanded ? (HomePresenter.expandedPosition < position ? position - HomePresenter.expandedChildCount : position) : position);
                    Hawk.put("groupPos", 0);
                    Hawk.put("childPos", 0);

                    for(int i = 0; i < HomePresenter.exapandableAdapter.getItemCount(); i++) {
                        if (position != i)
                            HomePresenter.exapandableAdapter.collapseParent(i);
                    }

                    HomePresenter.expanded = false;
                    HomePresenter.exapandableAdapter.notifyDataSetChanged();

                    //submenu.setTextColor(mContext.getColor(R.color.menu_click));
                } else if (isExpanded()) {
                    //Log.i("GATAG", "GATAG13:"+", "+getCategoryTree().getData().getSubcategories().get(0).getName());
                    collapseView();
                    //submenu.setTextColor(mContext.getColor(R.color.menu_click));
                } else {
                    //Log.i("GATAG", "GATAG2:"+", "+(data.getCategoryDrawerItems().size())+", "+data.getChildItemList().size());
                    //Log.i("GATAG", "GATAG12:"+", "+getCategoryTree().getData().getSubcategories().get(0).getName());
                    expandView();
                    Hawk.put("groupPos", 0);
                    Hawk.put("childPos", 0);
                    //submenu.setTextColor(mContext.getColor(R.color.menu_click));
                }
            }
        });
    }

    public void performSwitch() {

        ExpandedMenuModel expandedMenuModel = (ExpandedMenuModel) data;
        OneActivity oneActivity = ((OneActivity)mContext);
        oneActivity.closeDrawer();


        //Log.i("GATAG", "GATAG:" + expandedMenuModel.getTagGA());
        GATrackerHelper.getInstance(mContext).setGATracker(expandedMenuModel.getTagGA());

        if(expandedMenuModel == null)
            return ;

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
            webViewFragment.showMoneyBackLogo = true;
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
                return ;
            } catch( Exception e ){
                WebViewFragment webViewFragment =  WebViewFragment.newInstance("https://www.facebook.com/parknshophk");
                webViewFragment.title = "Facebook";
                oneActivity.addFragmentToTop(webViewFragment);
                return ;
            }

        } else if (expandedMenuModel.getIconName().equals(mContext.getString(R.string.home_activity_sliding_menu_logout))) {
            MyApplication.getInstance().mBus.post(new LogoutEvent());
        } else if (expandedMenuModel.id != null) { //TODO
            ProductListFragment plf = ProductListFragment.newInstance(expandedMenuModel.id , expandedMenuModel.getIconName());
            plf.setGATag(expandedMenuModel.getTagGA());
            oneActivity.addFragmentToTop(plf);
        } else if(expandedMenuModel != null ) {

            //Log.i("GATAG", "GATAG3333332123:" + expandedMenuModel.getTagGA());
            CategoryDrawerItem tempCat = new CategoryDrawerItem("0" , expandedMenuModel.getIconName(), expandedMenuModel.contentEn);
            parknshop.parknshopapp.Model.Category.SubCategory tempSubCat = tempCat.getSubCategory();
            tempSubCat.setContentType(expandedMenuModel.getContentType());
            tempSubCat.setValue(expandedMenuModel.getContent());
            tempCat.setSubCategory(tempSubCat);


            if(expandedMenuModel.getContentType() != null && expandedMenuModel.getContentType().equals(GlobalConstant.PROMTOION)) {
                CategoryHighLightFragment chlf = CategoryHighLightFragment.newInstance(tempCat.getSubCategory());
                chlf.id = Integer.valueOf(expandedMenuModel.getContent());
                chlf.toolbarTitle = tempCat.text;
                chlf.isChildFragment = true;
                oneActivity.addFragmentToTop(chlf);
            } else {
                oneActivity.handleCategoryFragmentSwitch(expandedMenuModel.getContentType(), expandedMenuModel.getContent(), tempCat);
            }
        }

    }

    public void resetExpandStatus() {
        Hawk.put("selectedGroupPos", position);
        Hawk.put("groupPos", 0);
        Hawk.put("childPos", 0);
        HomePresenter.expanded = false;
    }

    @OnClick(R.id.home)
    public void goHome() {
        ((BaseActivity)mContext).closeDrawer();
        ((BaseActivity)mContext).addFragmentToTop(new HomeFragment());
        resetExpandStatus();
    }


    @OnClick(R.id.locator)
    public void goLocator() {
        ((BaseActivity)mContext).closeDrawer();
        ((BaseActivity)mContext).addFragmentToTop(new StoreLocatorFragment());
        resetExpandStatus();

    }

    @OnClick(R.id.scan)
    public void goScan() {
        ((BaseActivity)mContext).closeDrawer();
        ScanSearchActivity.launchForResult( ((BaseActivity)mContext));
        resetExpandStatus();

    }

    @OnClick(R.id.message)
    public void goMessage() {
        ((BaseActivity)mContext).closeDrawer();
        ((BaseActivity)mContext).addFragmentToTop(new InBoxFragment());
        resetExpandStatus();
    }

    @SuppressLint("NewApi")
    @Override
    public void setExpanded(boolean expanded) {
        super.setExpanded(expanded);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            if (expanded) {
                //mArrowExpandImageView.setRotation(ROTATED_POSITION);
                if(data != null && data.getCategoryDrawerItems() != null && data.getCategoryDrawerItems().size() > 0)
                    groupIndicator.setVisibility(View.VISIBLE);
                //Log.i("expanded VISIBLE", "expanded VISIBLE");
            } else {
                groupIndicator.setVisibility(View.GONE);
                //Log.i("expanded GONE", "expanded GONE");
                //mArrowExpandImageView.setRotation(INITIAL_POSITION);
            }
        }
    }
}
