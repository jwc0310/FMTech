package parknshop.parknshopapp.Fragment.Home;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bumptech.glide.Glide;
import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Account.LoginFragment;
import parknshop.parknshopapp.Fragment.Home.LeftMenu.LeftMenuOnclickListener;
import parknshop.parknshopapp.Fragment.Home.LeftMenu.LeftMenuRecyclerExapandableAdapter;
import parknshop.parknshopapp.Fragment.Home.RightMenu.RightSlidingListViewAdapter;
import parknshop.parknshopapp.Fragment.InBox.InBoxFragment;
import parknshop.parknshopapp.Fragment.MemberZone.MemberCardFragment;
import parknshop.parknshopapp.Fragment.StoreLocator.StoreLocatorFragment;
import parknshop.parknshopapp.Fragment.TopBrands.TopBrandsFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.Model.Category.SubCategory;
import parknshop.parknshopapp.Model.ExpandedMenuModel;
import parknshop.parknshopapp.Model.NewPromotionResponse;
import parknshop.parknshopapp.Model.PromotionCategoryResponse;
import parknshop.parknshopapp.Model.RecipeListResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.LogUtil;

/**
 * Created by chrisyu on 7/3/16.
 */
public class HomePresenter {

    static HashMap<ExpandedMenuModel, List<CategoryDrawerItem>> listDataChild = new HashMap<ExpandedMenuModel, List<CategoryDrawerItem>>();
    public static RightSlidingListViewAdapter rightSlidingListViewAdapter;
    static SlideMenuHeaderViewHolder slideMenuHeaderViewHolder;

    public static void initShoppingCart(CartResponse cartResponse, final BaseActivity baseActivity) {
        baseActivity.showShoppingCart(shouldShowShoppingCart(cartResponse.getAllEntry()));

        if(baseActivity.getRightListView().getAdapter() == null) {
            rightSlidingListViewAdapter = new RightSlidingListViewAdapter(cartResponse.getAllEntry(), baseActivity);

            baseActivity.getRightListView().setAdapter(rightSlidingListViewAdapter);
            baseActivity.getRightListView().setOnItemClickListener(rightSlidingListViewAdapter);
        } else {

            rightSlidingListViewAdapter.data = cartResponse.getAllEntry();
            rightSlidingListViewAdapter.notifyDataSetChanged();
        }

        baseActivity.getRightSlidingMenu().findViewById(R.id.top_brand_right).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // if(homeFragment.getBaseActivity() == null) return;
                baseActivity.closeDrawer();
                baseActivity.placeFragment(new TopBrandsFragment());
            }
        });
        //} else {
        //     rightSlidingListViewAdapter.data = cartResponse.getAllEntry();
        //     redrawListView(baseActivity.getRightListView());
        //}
        baseActivity.setShoppingCartTitle(cartResponse.getAllEntry().size());
        baseActivity.setSubTotal(cartResponse.getTotalPriceWithoutDelivery());
        baseActivity.setDeliveryFee(cartResponse.getDeliveryCost(baseActivity));
        baseActivity.setCheckOutValue(cartResponse.getTotalPrice());
        baseActivity.showBasketLevelIfNeeded(cartResponse);

        cartResponseToGATrackerData(cartResponse);
    }

    public static void cartResponseToGATrackerData(CartResponse cartResponse){
        try {
            // init GA for checkout
            GATrackerHelper.getInstance(MyApplication.getInstance()).initCheckoutAction();
            Double shippingFee = Double.parseDouble(cartResponse.getDeliveryCost(MyApplication.getInstance()).replace("HK$", ""));
            Double totalPrice = Double.parseDouble(cartResponse.getTotalPrice().replace("HK$", ""));
            Double totalTax = Double.parseDouble(cartResponse.getTotalTax().getValue());
//        LogUtil.info("", "shippingFee_totalPrice:"+shippingFee+", "+totalPrice);
            GATrackerHelper.getInstance(MyApplication.getInstance()).setActionTransactionShipping(shippingFee);
            GATrackerHelper.getInstance(MyApplication.getInstance()).setActionTransactionRevenue(totalPrice);
            GATrackerHelper.getInstance(MyApplication.getInstance()).setActionTransactionShipping(shippingFee);
            GATrackerHelper.getInstance(MyApplication.getInstance()).setActionTransactionTax(totalTax);
        } catch (Exception e) {
            Log.i("exception", "exception" + e.getMessage());
        }
    }
/*
    public static void updateShoppingCart(CartResponse cartResponse, final BaseActivity baseActivity) {
        baseActivity.showShoppingCart(shouldShowShoppingCart(cartResponse.getAllEntry()));

        rightSlidingListViewAdapter.data = cartResponse.getAllEntry();
        rightSlidingListViewAdapter.notifyDataSetChanged();

        //if(rightSlidingListViewAdapter == null) {
        //RightSlidingListViewAdapter rightSlidingListViewAdapter = new RightSlidingListViewAdapter(cartResponse.getAllEntry(), baseActivity);
        //baseActivity.getRightListView().setAdapter(rightSlidingListViewAdapter);
        //baseActivity.getRightListView().setOnItemClickListener(rightSlidingListViewAdapter);

        //} else {
        //     rightSlidingListViewAdapter.data = cartResponse.getAllEntry();
        //     redrawListView(baseActivity.getRightListView());
        //}
        baseActivity.setShoppingCartTitle(cartResponse.getTotalUnitCount());
        baseActivity.setSubTotal(cartResponse.getTotalPriceWithoutDelivery());
        baseActivity.setDeliveryFee(cartResponse.getDeliveryCost());
        baseActivity.setCheckOutValue(cartResponse.getTotalPrice());
        baseActivity.showBasketLevelIfNeeded(cartResponse);
    }
*/
    public static void redrawListView(ListView listView) {
        int firstItem = listView.getFirstVisiblePosition();
        int lastItem = listView.getLastVisiblePosition();
        for(int i = firstItem;i <= lastItem; i++) {
            View v = listView.getChildAt(i - firstItem);
            listView.getAdapter().getView(i, v, listView);
            listView.invalidateViews();
        }
    }

    public static boolean shouldShowShoppingCart(List<CartResponse.Entry> objects) {
        return !(objects == null || objects.size() == 0);
    }

    public static ArrayList<ExpandedMenuModel> generatingLocalSlidingItemTop(Context context) {
        ArrayList<ExpandedMenuModel> listDataHeader = new ArrayList<ExpandedMenuModel>();
        boolean divider = true;
        String header = "header";

        listDataHeader.add(new ExpandedMenuModel(header));
        listDataHeader.add(new ExpandedMenuModel(divider));
        if (GlobalConstant.isLogin)
            listDataHeader.add(new ExpandedMenuModel(context.getString(R.string.home_activity_sliding_menu_my_account), R.drawable.menu_icn_account, true, false, "My Account"));
        else
            listDataHeader.add(new ExpandedMenuModel(context.getString(R.string.login), R.drawable.menu_icn_account, true, false, "My Account"));

        listDataHeader.add(new ExpandedMenuModel(context.getString(R.string.home_activity_sliding_menu_grocery_list), R.drawable.menu_icn_grocery, true, false, "My List"));

        if(Hawk.get(BaseActivity.MENU_MONEYBACK, false)) {
            listDataHeader.add(new ExpandedMenuModel(divider));
            listDataHeader.add(new ExpandedMenuModel(context.getString(R.string.moneyback_card), R.drawable.icn_moneyback_card, true, false, "moneyback"));
        }

        listDataHeader.add(new ExpandedMenuModel(divider));

        addPromotion(listDataHeader);

        listDataHeader.add(new ExpandedMenuModel(context.getString(R.string.home_activity_sliding_menu_top_brands), R.drawable.menu_icn_top_brand, true, false, "brandlist"));

        if(Hawk.get(BaseActivity.MENU_RECIPE, false))
            addRecipe(context, listDataHeader);

        listDataHeader.add(new ExpandedMenuModel(divider));

        return listDataHeader;
    }


    public static void addPromotion(ArrayList<ExpandedMenuModel> listDataHeader) {
        int count = listDataHeader.size();
        PromotionCategoryResponse promotionCategoryResponse = Hawk.get("promotionList");
        if (promotionCategoryResponse != null) {
            for(int i = 0 ; i < promotionCategoryResponse.getData().size(); i++) {

                String title = promotionCategoryResponse.getData().get(i).getTitle();
                String titleEn = promotionCategoryResponse.getData().get(i).getTitleEn();
                String contentType = promotionCategoryResponse.getData().get(i).getContentType();

                //  Log.i("MENU_INSTOREPROMOTION", "MENU_INSTOREPROMOTION " + titleEn.equals("In Store Promotion") + " " + Hawk.get(BaseActivity.MENU_INSTOREPROMOTION, false) );

                if(titleEn.equals("In Store Promotion") && !Hawk.get(BaseActivity.MENU_INSTOREPROMOTION, false))
                    continue;

                ExpandedMenuModel item = new ExpandedMenuModel(title, promotionCategoryResponse.getData().get(i).getImage(), true, false, promotionCategoryResponse.getData().get(i).getTitleEn());
                item.setContentType(promotionCategoryResponse.getData().get(i).getContentType());
                item.setContent(promotionCategoryResponse.getData().get(i).getContent());

                List<CategoryDrawerItem> heading = new ArrayList<CategoryDrawerItem>();

                if (promotionCategoryResponse.getData().get(i).getSubMenu() != null) {

                    for (int j = 0; j < promotionCategoryResponse.getData().get(i).getSubMenu().size(); j++) {
                        int id = promotionCategoryResponse.getData().get(i).getSubMenu().get(j).getId();
                        String subMenuContentType = promotionCategoryResponse.getData().get(i).getSubMenu().get(j).getContentType();
                        String name = promotionCategoryResponse.getData().get(i).getSubMenu().get(j).getTitle();

                        if(subMenuContentType.equals(GlobalConstant.PROMTOION) && !Hawk.get(BaseActivity.MENU_KEYPROMOTION, false))
                            continue;

                        CategoryDrawerItem categoryDrawerItem = new CategoryDrawerItem(id + "", name, promotionCategoryResponse.getData().get(i).getSubMenu().get(j).getTitleEn());

                        categoryDrawerItem.setHeaderId("" + promotionCategoryResponse.getData().get(i).getId());
                        categoryDrawerItem.setSubCategory(promotionCategoryResponse.getData().get(i).getSubMenu().get(j));

                        categoryDrawerItem.setContentType(promotionCategoryResponse.getData().get(i).getSubMenu().get(j).getContentType());
                        categoryDrawerItem.setContent(promotionCategoryResponse.getData().get(i).getSubMenu().get(j).getValue());

                        heading.add(categoryDrawerItem);
                    }


                    if(promotionCategoryResponse.getData().get(i).getContentType().equals(GlobalConstant.ONLINE_PROMOTION)) {
                        ArrayList<NewPromotionResponse.PromotionResponseItem> newPromotionResponse = Hawk.get("newPromotionResponse", new ArrayList<NewPromotionResponse.PromotionResponseItem>());



                        for(int y = 0; y < newPromotionResponse.size(); y++) {
                            NewPromotionResponse.PromotionResponseItem promotionResponseItem = newPromotionResponse.get(y);

                            CategoryDrawerItem categoryDrawerItem = new CategoryDrawerItem(0 + "", promotionResponseItem.getNameViaMap(), promotionResponseItem.getNameEnViaMapForGA());

                            categoryDrawerItem.setContentType(GlobalConstant.ONLINE_PROMOTION);
                            categoryDrawerItem.text = promotionResponseItem.getUrlName();
                            categoryDrawerItem.setContent(promotionResponseItem.getUrlPath() != null ? promotionResponseItem.getUrlPath() : "/products/" + promotionResponseItem.getCategoryId() + "?type=cat"  );
                            categoryDrawerItem.setImgUrl(promotionResponseItem.getImgUrl());

                            heading.add(categoryDrawerItem);
                        }
                    }

                    for(int x = 0 ; x < heading.size(); x++) {
                        heading.get(x).groupData = heading;
                        heading.get(x).parentPosition = count ;
                    }

                    listDataChild.put(item, heading);// Header, Child data
                    item.setCategoryDrawerItems(heading);
                    listDataHeader.add(item);
                    LogUtil.info("", "getUrlIcon::"+ item.getUrlIcon());
                }
            }
        }
    }

    public static void addRecipe(Context context, ArrayList<ExpandedMenuModel> listDataHeader) {

        int initSize = listDataHeader.size();
        ArrayList<RecipeListResponse.RecipeListItem> recipeListItems = Hawk.get("recipeListResponse", new RecipeListResponse()).data;

        if(recipeListItems != null) {
            ExpandedMenuModel item = new ExpandedMenuModel(context.getString(R.string.home_activity_sliding_menu_recipes), R.drawable.menu_icn_new_recipes, true, false, "Recipes");
            item.setContentType(GlobalConstant.RECIPLE);

            List<CategoryDrawerItem> heading = new ArrayList<CategoryDrawerItem>();
            for(int i = 0; i < recipeListItems.size(); i++) {
                RecipeListResponse.RecipeListItem recipeListItem = recipeListItems.get(i);

                CategoryDrawerItem categoryDrawerItem = new CategoryDrawerItem(recipeListItem.getId() + "", recipeListItem.getCategory(), recipeListItem.getCategory_en());
                categoryDrawerItem.setContentType(GlobalConstant.RECIPLE);
                categoryDrawerItem.setRecipleListItem(recipeListItem);

                heading.add(categoryDrawerItem);
            }
            listDataChild.put(item, heading);// Header, Child data

            for(int x = 0; x < heading.size(); x++)
                heading.get(x).parentPosition = initSize;

            item.setCategoryDrawerItems(heading);
            listDataHeader.add(item);
        }
    }


    public static ArrayList<ExpandedMenuModel> generatingLocalSlidingItemBottom(Context context) {
        ArrayList<ExpandedMenuModel> leftSlidingMenuItems = new ArrayList<>();
        boolean divider = true;

        leftSlidingMenuItems.add(new ExpandedMenuModel(divider));
        //leftSlidingMenuItems.add(new ExpandedMenuModel(context.getString(R.string.home_activity_sliding_menu_quality_assurance), R.drawable.menu_icn_qa, true, false, context.getString(R.string.home_activity_sliding_menu_quality_assurance)));
        leftSlidingMenuItems.add(new ExpandedMenuModel(context.getString(R.string.home_activity_sliding_menu_about_us), R.drawable.menu_about_us, true, false, "about-us"));
        leftSlidingMenuItems.add(new ExpandedMenuModel(context.getString(R.string.home_activity_sliding_menu_online_shopping), R.drawable.menu_shopping, true, false, "online-shopping"));
        leftSlidingMenuItems.add(new ExpandedMenuModel(context.getString(R.string.home_activity_sliding_menu_customer_service), R.drawable.menu_icn_cs, true, false, "customer-service"));
        leftSlidingMenuItems.add(new ExpandedMenuModel(context.getString(R.string.home_activity_sliding_menu_settings), R.drawable.menu_icn_setting, true, false, "settings"));
        leftSlidingMenuItems.add(new ExpandedMenuModel(context.getString(R.string.home_activity_sliding_menu_facebook), R.drawable.menu_icn_facebook, true, false, "facebook"));

//        if(GlobalConstant.isLogin) {
//            leftSlidingMenuItems.add(new ExpandedMenuModel(context.getString(R.string.home_activity_sliding_menu_logout), 0, true, false, context.getString(R.string.home_activity_sliding_menu_logout)));
//        }

        return leftSlidingMenuItems;
    }

    public static void prepareRightList(PromotionCategoryResponse promoResponse, final BaseFragment homeFragment) {
        View rightBaseView = homeFragment.getBaseActivity().getRightSlidingMenu();
        PromotionCategoryResponse promotionCategoryResponse = Hawk.get("promotionList");


        if(promotionCategoryResponse != null) {
            LinearLayout dynamicTag = (LinearLayout) rightBaseView.findViewById(R.id.dynamic_tag);
            dynamicTag.removeAllViews();

            for (int i = 0; i < promotionCategoryResponse.getData().size(); i++) {
                DynamicTag dTag = new DynamicTag(homeFragment.getBaseActivity());
                dTag.textView.setText(promoResponse.getData().get(i).getTitle());
                dynamicTag.addView(dTag);

                CategoryDrawerItem rootCat = new CategoryDrawerItem("", promoResponse.getData().get(i).getTitle(), promoResponse.getData().get(i).getTitleEn());
                SubCategory subCat = rootCat.getSubCategory();
                subCat.setValue(promoResponse.getData().get(i).getContent());
                subCat.setContentType(promoResponse.getData().get(i).getContentType());
                rootCat.setContentType(promoResponse.getData().get(i).getContentType());
                rootCat.setContent(promoResponse.getData().get(i).getContent());
                rootCat.setSubCategory(subCat);

                List<CategoryDrawerItem> groupData = new ArrayList<>();

                for (int j = 0; j < promotionCategoryResponse.getData().get(i).getSubMenu().size(); j++) {
                    int id = promotionCategoryResponse.getData().get(i).getSubMenu().get(j).getId();
                    String name = promotionCategoryResponse.getData().get(i).getSubMenu().get(j).getTitle();
                    CategoryDrawerItem categoryDrawerItem = new CategoryDrawerItem(id + "", name, promotionCategoryResponse.getData().get(i).getSubMenu().get(j).getTitleEn());

                    categoryDrawerItem.setHeaderId(""+promotionCategoryResponse.getData().get(i).getId());
                    categoryDrawerItem.setSubCategory(promotionCategoryResponse.getData().get(i).getSubMenu().get(j));

                    categoryDrawerItem.setContentType(promotionCategoryResponse.getData().get(i).getSubMenu().get(j).getContentType());
                    categoryDrawerItem.setContent(promotionCategoryResponse.getData().get(i).getSubMenu().get(j).getValue());

                    groupData.add(categoryDrawerItem);
                }


                if(promotionCategoryResponse.getData().get(i).getContentType().equals(GlobalConstant.ONLINE_PROMOTION)) {
                    ArrayList<NewPromotionResponse.PromotionResponseItem> newPromotionResponse = Hawk.get("newPromotionResponse", new ArrayList<NewPromotionResponse.PromotionResponseItem>());

                    for(int y = 0; y < newPromotionResponse.size(); y++) {
                        NewPromotionResponse.PromotionResponseItem promotionResponseItem = newPromotionResponse.get(y);
                        CategoryDrawerItem categoryDrawerItem = new CategoryDrawerItem(0 + "", promotionResponseItem.getUrlName(), promotionResponseItem.getUrlName());

                        categoryDrawerItem.setContentType(GlobalConstant.ONLINE_PROMOTION);
                        categoryDrawerItem.text = promotionResponseItem.getUrlName();
                        categoryDrawerItem.setContent(promotionResponseItem.getUrlPath());
                        categoryDrawerItem.setImgUrl(promotionResponseItem.getImgUrl());

                        groupData.add(categoryDrawerItem);
                    }
                }

                //Log.i("groupData", "groupData" + groupData.size());

                dTag.setOnClickListener(new LeftMenuOnclickListener(groupData.size() > 0 ? groupData.get(0) : rootCat, 0, groupData, homeFragment.getBaseActivity()));
            }
        }
    }

    public static LeftMenuRecyclerExapandableAdapter exapandableAdapter = null;// new LeftMenuRecyclerExapandableAdapter(homeFragment.getBaseActivity(), listDataHeader);
    public static void prepareListData(CategoryTree categoryTree, final BaseFragment homeFragment) {
        Hawk.put("category_tree", categoryTree);

        final ArrayList<ExpandedMenuModel> listDataHeader = new ArrayList<ExpandedMenuModel>();

        listDataHeader.addAll(HomePresenter.generatingLocalSlidingItemTop(homeFragment.getActivity()));

        int initSize = listDataHeader.size();

        if (categoryTree != null && categoryTree.getData() != null && categoryTree.getData().getLv1CategoryList() != null) {
            for (int i = 0; i < categoryTree.getData().getLv1CategoryList().size(); i++) {
                ExpandedMenuModel item = new ExpandedMenuModel(categoryTree.getData().getSubCategoryByIndex(i), categoryTree.getData().getSubCategoryByIndex(i).getImage(), false);

                item.id = categoryTree.getData().getSubcategories().get(i).id;

                List<CategoryDrawerItem> heading = new ArrayList<CategoryDrawerItem>();
                heading.addAll(categoryTree.getData().getLv2CategoryList(i));

                for(int x = 0; x < heading.size(); x++)
                    heading.get(x).parentPosition = i + initSize;


                listDataChild.put(item, heading);// Header, Child data
                item.setCategoryDrawerItems(heading);
                listDataHeader.add(item);
            }
        }

        listDataHeader.addAll(HomePresenter.generatingLocalSlidingItemBottom(homeFragment.getActivity()));


        /*addHeaderIfNeeded(homeFragment);

        ExpandableListAdapter mMenuAdapter = new ExpandableListAdapter  (homeFragment.getActivity(), listDataHeader, listDataChild, homeFragment.getLeftExpanableListView());
        WrapperExpandableListAdapter wrapper = new WrapperExpandableListAdapter(mMenuAdapter);
        homeFragment.getLeftExpanableListView().setAdapter(wrapper);
        homeFragment.getLeftExpanableListView().setOnScrollListener(mMenuAdapter);
        homeFragment.getLeftExpanableListView().setOnGroupClickListener(mMenuAdapter);*/
        //addFooterIfNeeded(homeFragment);

        //homeFragment.getLeftExpanableListView().addFooterView();
        //Log.i("groupData", "listDataHeader:" + listDataHeader.size());
        for (int i = 0; i < categoryTree.getData().getSubcategories().size(); i++){
            if(categoryTree.getData().getSubcategories().get(i) != null){
                //Log.i("groupData", "listDataHeader123:"+i+", " + categoryTree.getData().getSubcategories().get(i).getName());
//                for (int j = 0; j< listDataHeader.get(i).getCategoryDrawerItems().size(); j++) {
//                    if (listDataHeader.get(i).getCategoryDrawerItems().get(j) != null) {
//                        Log.i("groupData", "listDataHeader123444:"+j+", " + (listDataHeader.get(i).getCategoryDrawerItems().get(j).getSubCategory().getId()));
//                    }
//                }
            }
        }

        //final LeftMenuRecyclerExapandableAdapter
        exapandableAdapter = new LeftMenuRecyclerExapandableAdapter(homeFragment.getBaseActivity(), listDataHeader, categoryTree);
        //final LinearLayoutManager linearLayoutManager = homeFragment.getBaseActivity().linearLayoutManager;
        final View headerRoot = homeFragment.getBaseActivity().getHeaderRoot();
        final RecyclerView recyclerView = homeFragment.getBaseActivity().getRecyclerView();
        final BaseActivity baseActivity = homeFragment.getBaseActivity();

        exapandableAdapter.setExpandCollapseListener(new ExpandableRecyclerAdapter.ExpandCollapseListener() {
            @Override
            public void onListItemExpanded(final int position) {
                expanded = false;
                headerRoot.setVisibility(View.GONE);
                final RecyclerView.OnItemTouchListener disabler = new RecyclerViewDisabler();

                LogUtil.info("", "leftMenuOnGroupClick:"+listDataHeader.get(position).getTagGA());
                GATrackerHelper.getInstance(MyApplication.getInstance()).setGATracker(listDataHeader.get(position).getTagGA());

                //rv.addOnItemTouchListener(disabler);        // disables scolling
                // do stuff while scrolling is disabled
                //rv.removeOnItemTouchListener(disabler);     // scrolling is enabled again

                //Recipe expandedRecipe = recipes.get(position);
                for(int i = 0; i < exapandableAdapter.getItemCount(); i++) {
                    if (position != i)
                        exapandableAdapter.collapseParent(i);
                }

                if ((position < listDataHeader.size() - 1 && listDataHeader.get(position) != null && listDataHeader.get(position).getCategoryDrawerItems() != null && listDataHeader.get(position).getCategoryDrawerItems().size() > 0))
                    baseActivity.linearLayoutManager.scrollToPositionWithOffset(position, 0);

                expandedPosition = position;

                recyclerView.addOnItemTouchListener(disabler);

                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        expanded = true;
                        //headerRoot.setVisibility(View.VISIBLE);
                        recyclerView.removeOnItemTouchListener(disabler);

                        //setDummy Title
                        expandedChildCount = (listDataHeader.get(position) != null && listDataHeader.get(position).getCategoryDrawerItems() != null) ? listDataHeader.get(position).getCategoryDrawerItems().size() : 0;
                        ((TextView)headerRoot.findViewById(R.id.submenu)).setText(listDataHeader.get(position).getIconName());

                        //setDummy Image
                        if(listDataHeader.get(position).getIconImg() > 0) {
                            headerRoot.findViewById(R.id.iconimage).setVisibility(View.VISIBLE);
                            Glide.with(baseActivity).load(listDataHeader.get(position).getIconImg()).error(R.drawable.pns_default_circle).into((ImageView) headerRoot.findViewById(R.id.iconimage));
                        } else {
                            Glide.with(baseActivity).load(listDataHeader.get(position).getUrlIcon()).error(R.drawable.pns_default_circle).into((ImageView) headerRoot.findViewById(R.id.iconimage));
                            headerRoot.findViewById(R.id.iconimage).setVisibility(View.VISIBLE);
                        }

                        //setGroupIndicator
                        if(HomePresenter.expanded)
                            headerRoot.findViewById(R.id.group_indicator).setVisibility(View.VISIBLE);


                        headerRoot.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                headerRoot.setVisibility(View.GONE);
                                HomePresenter.expanded = false;
                                for(int i = 0 ; i < exapandableAdapter.getItemCount(); i ++) {
                                    exapandableAdapter.collapseParent(i);
                                }
                                exapandableAdapter.parentViewList.get(HomePresenter.expandedPosition).setAlpha(1.0f);

                                Runnable runnable1 = new Runnable() {
                                    @Override
                                    public void run() {
                                        exapandableAdapter.notifyDataSetChanged();
                                    }
                                };
                                new Handler().postDelayed(runnable1, 500);

                                //exapandableAdapter.collapseAllParents();
                            }
                        });
                        //group_indicator
                        exapandableAdapter.notifyDataSetChanged();
                    }
                };
                new Handler().postDelayed(runnable, 800);

            }

            @Override
            public void onListItemCollapsed(int position) {
                //Recipe collapsedRecipe = recipes.get(position);

                //String toastMsg = getResources().getString(R.string.collapsed, collapsedRecipe.getName());
                //recipe_layout.setVisibility(View.GONE);
                headerRoot.setVisibility(View.GONE);

                expanded = false;
            }
        });

        homeFragment.getBaseActivity().getRecyclerView().setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                // if(recyclerView.computeVerticalScrollOffset()) {
                //
                //}

                if (expanded) {
                    // if(recyclerView.)
                    headerRoot.setVisibility(View.VISIBLE);

                    //int predicted = expandedPosition + listDataHeader.get(expandedPosition).getCategoryDrawerItems().size();

                    if(exapandableAdapter.parentViewList.get(expandedPosition) != null ) {
                        float anotherScrolly = exapandableAdapter.parentViewList.get(expandedPosition).getTop() + exapandableAdapter.parentViewList.get(expandedPosition).getHeight();// + (lastExpandedPosition + i + 1) * c.getHeight();

                        //Log.i("yoyo1", "yoyo1 "+ anotherScrolly + " " + exapandableAdapter.parentViewList.get(expandedPosition).getHeight() );

                        if (anotherScrolly < exapandableAdapter.parentViewList.get(expandedPosition).getHeight()){// && expandedPosition + listDataHeader.get(expandedPosition).getCategoryDrawerItems().size() > linearLayoutManager.findFirstVisibleItemPosition()) {
                            exapandableAdapter.parentViewList.get(expandedPosition).setAlpha(0.0f);
                            //exapandableAdapter.parentViewList.get(expandedPosition).setAlpha(1f - Math.abs(exapandableAdapter.parentViewList.get(expandedPosition).getHeight() - anotherScrolly) / exapandableAdapter.parentViewList.get(expandedPosition).getHeight());
                        } else {
                            exapandableAdapter.parentViewList.get(expandedPosition).setAlpha(1.0f);
                        }
                        hidingPosition = expandedPosition;
                    }

                    if(listDataHeader.get(expandedPosition) != null && listDataHeader.get(expandedPosition).getCategoryDrawerItems() != null) {
                        for (int i = 0; i < listDataHeader.get(expandedPosition).getCategoryDrawerItems().size(); i++) {
                            if (exapandableAdapter.viewList.get(expandedPosition * (i + 1)) != null) {
                                float scrolly = exapandableAdapter.viewList.get(expandedPosition * (i + 1)).getTop();// + (lastExpandedPosition + i + 1) * c.getHeight();

                                if (scrolly < exapandableAdapter.viewList.get(expandedPosition * (i + 1)).getHeight()) {
                                    exapandableAdapter.viewList.get(expandedPosition * (i + 1)).setAlpha(1f - Math.abs(exapandableAdapter.viewList.get(expandedPosition * (i + 1)).getHeight() - scrolly) / exapandableAdapter.viewList.get(expandedPosition * (i + 1)).getHeight());
                                } else {
                                    exapandableAdapter.viewList.get(expandedPosition * (i + 1)).setAlpha(1.0f);
                                }
                            }
                        }
                    }

                    //Log.i("yoyo2", "yoyo2 "+ expandedPosition + " " + baseActivity.linearLayoutManager.findFirstVisibleItemPosition());
                    if (expandedPosition <= baseActivity.linearLayoutManager.findFirstVisibleItemPosition() && listDataHeader.get(expandedPosition) != null && listDataHeader.get(expandedPosition).getCategoryDrawerItems() != null && expandedPosition + listDataHeader.get(expandedPosition).getCategoryDrawerItems().size() > baseActivity.linearLayoutManager.findFirstVisibleItemPosition()) {
                        headerRoot.setVisibility(View.VISIBLE);
                    } else {
                        headerRoot.setVisibility(View.GONE);
                    }
                } else {
                    headerRoot.setVisibility(View.GONE);
                }

            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }
        });

        homeFragment.getBaseActivity().getRecyclerView().setAdapter(exapandableAdapter);
    }

    public static int hidingPosition;
    public static class RecyclerViewDisabler implements RecyclerView.OnItemTouchListener {

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
            return true;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {

        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }
    }

    public static boolean expanded = false;
    public static int expandedPosition;
    public static int expandedChildCount;

    public static void addHeaderIfNeeded(BaseFragment homeFragment) {
        if (homeFragment.getLeftExpanableListView().getHeaderViewsCount() == 0)
            homeFragment.getLeftExpanableListView().addHeaderView(generatingSlideMenuHeader(homeFragment));
    }

    public static void addFooterIfNeeded(BaseFragment homeFragment) {
        if (homeFragment.getLeftExpanableListView().getFooterViewsCount() == 0)
            homeFragment.getLeftExpanableListView().addFooterView(LayoutInflater.from(homeFragment.getActivity()).inflate(R.layout.home_activity_sliding_menu_left_footer, null));
    }

    public static Map<String, Integer> getLocalShoppingCart() {
        Map<String, Integer> localShoppingCart = new HashMap<>();

        if(Hawk.get(AppUtils.local_shopping_cart) == null)
            Hawk.put(AppUtils.local_shopping_cart, localShoppingCart);
        else
            localShoppingCart = Hawk.get(AppUtils.local_shopping_cart);

        return localShoppingCart;
    }

    public static CartResponse getRemoteShoppingCart() {
        return Hawk.get(AppUtils.remote_shopping_cart, new CartResponse());
    }

    public static void handleLocalShoppingCartData(String productId, int count) {
        Map<String, Integer> localShoppingCart = getLocalShoppingCart();

        if (getLocalShoppingCart().get(productId) == null)
            localShoppingCart.put(productId, count);
        else
            localShoppingCart.put(productId, count);

        Hawk.put(AppUtils.local_shopping_cart, localShoppingCart);
    }

    public static LinearLayout generatingSlideMenuHeader(BaseFragment homeFragment) {
        LinearLayout header = (LinearLayout)LayoutInflater.from(homeFragment.getActivity()).inflate(R.layout.home_activity_sliding_menu_left_header, null);
        slideMenuHeaderViewHolder = new SlideMenuHeaderViewHolder(header, homeFragment.getBaseActivity());
        return header;
    }

    public static void setUnreadMsgCount(int count, Context context) {
        LogUtil.info("", "unreadMsg:" + count + ", " + (slideMenuHeaderViewHolder == null));
        if(slideMenuHeaderViewHolder == null){
            return;
        }
       // ((BaseActivity)context).getRecyclerView().notify
        exapandableAdapter.notifyItemChanged(0);
        Hawk.put("unreadMesssageCount", count);
        slideMenuHeaderViewHolder.setUnreadMsgCount(count);
    }

    public static int getUnreadMsgCount(){
        if(slideMenuHeaderViewHolder == null){
            return 0;
        }
        return slideMenuHeaderViewHolder.getUnreadMsgCount();
    }

    static class SlideMenuHeaderViewHolder {
        LinearLayout header;
        BaseActivity baseActivity;
        @Bind(R.id.txtBadge)
        TextView txtBadge;

        public SlideMenuHeaderViewHolder(LinearLayout header, BaseActivity baseActivity) {
            this.header = header;
            this.baseActivity = baseActivity;

            ButterKnife.bind(this, header);
        }

        public void setUnreadMsgCount(int count){
            LogUtil.info("", "count:"+count);
            if(count > 0){
                txtBadge.setVisibility(View.VISIBLE);
                txtBadge.setText(count + "");
            }else{
                txtBadge.setVisibility(View.GONE);
            }
        }

        public int getUnreadMsgCount(){
            if(!TextUtils.isEmpty(txtBadge.getText().toString().trim())){
                if(!txtBadge.getText().toString().equals("0")){
                    return Integer.parseInt(txtBadge.getText().toString());
                }
            }
            return 0;
        }

        @OnClick(R.id.home)
        public void goHome() {
            baseActivity.closeDrawer();
            baseActivity.addFragmentToTop(new HomeFragment());
        }

        @OnClick(R.id.card)
        public void goCard() {
            baseActivity.closeDrawer();
            if(GlobalConstant.isLogin){
                baseActivity.addFragmentToTop(new MemberCardFragment());
            }else{
                Bundle bundle = new Bundle();
                bundle.putString("from" ,"MemberZone");
                LoginFragment fragment = new LoginFragment();
                fragment.setArguments(bundle);
                baseActivity.placeFragmentWithBackStack(fragment);
            }
        }

        @OnClick(R.id.locator)
        public void goLocator() {
            baseActivity.closeDrawer();
            baseActivity.addFragmentToTop(new StoreLocatorFragment());
        }

        @OnClick(R.id.scan)
        public void goScan() {
            baseActivity.closeDrawer();
            ScanSearchActivity.launchForResult(baseActivity);
        }

        @OnClick(R.id.message)
        public void goMessage() {
            baseActivity.closeDrawer();
            baseActivity.addFragmentToTop(new InBoxFragment());
        }
    }
}

