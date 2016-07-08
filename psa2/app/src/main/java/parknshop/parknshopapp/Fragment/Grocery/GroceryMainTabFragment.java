package parknshop.parknshopapp.Fragment.Grocery;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Adapter.GroceryViewPagerAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.GroceryListAdapterItemClickEvent;
import parknshop.parknshopapp.EventUpdate.WishListUpdatedEvent;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.GroceryListEvent;
import parknshop.parknshopapp.Rest.event.RemoveWishListResponseEvent;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.DisbleScrollingViewPager;
import parknshop.parknshopapp.WebServiceModel;
import parknshop.parknshopapp.common.MemberHelper;

/**
 * Created by kwongyuenpan on 18/3/16.
 */
public class GroceryMainTabFragment extends BaseFragment {

    @Bind(R.id.viewpager)
    DisbleScrollingViewPager viewPager;
    @Bind (R.id.tab_layout)
    TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_grocery_tab_main, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-list/my-list");

        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        showLogo();
        showMenuButton();
        enableNavigationDrawer();
        setToolbarTitle(getString(R.string.home_activity_sliding_menu_grocery_list));
//        addListFooter();
        viewPager.setPagingEnabled(false);

        if(getArguments() != null){
            String gotoPagePK = getArguments().getString("PK");
            if (!TextUtils.isEmpty(gotoPagePK)) {
                ArrayList<WishListResponse> mWishListResponses = new ArrayList<>();
                WishListResponse[] wishStaticListResponses = Hawk.get(AppUtils.grocery_static_list);
                WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);
                for(int i = 0; i < wishStaticListResponses.length; i++){
                    mWishListResponses.add(wishStaticListResponses[i]);
                }

                for(int i = 0; i < wishListResponses.length; i++){
                    mWishListResponses.add(wishListResponses[i]);
                }

//                // check the grocery car pos and go in that page
                for(int i = 0; i < mWishListResponses.size(); i++){
                    if(mWishListResponses.get(i).getPrimaryKey().equals(gotoPagePK)){
                        GroceryListAdapterItemClickEvent groceryListAdapterItemClickEvent = new GroceryListAdapterItemClickEvent();
                        groceryListAdapterItemClickEvent.setFromAlarm(true);
                        groceryListAdapterItemClickEvent.setPosition(i);
                        onEvent(groceryListAdapterItemClickEvent);
                    }
                }

            }
            getArguments().putString("PK", null);
        }

        return view;
    }

//    public void addListFooter(){
//        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View convertView = inflater.inflate(R.layout.item_grocery_add_new_list_footer, null);
//        LinearLayout btnAddNewList = (LinearLayout) convertView.findViewById(R.id.btnAddNewList);
//        btnAddNewList.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ((OneActivity) getActivity()).addWishListDialog(getActivity(), null);
//            }
//        });
//        list.addFooterView(convertView);
//    }

    @Override
    public void onResume() {
        super.onResume();
        uploadLayout();
    }

    public void uploadLayout(){
        if(!TextUtils.isEmpty(MemberHelper.getUserToken(getActivity()))){
            showProgressDialog();
            // get the update static grocery list
            WebServiceModel.getInstance(getActivity()).requestGetGroceryList(getActivity());
        }else{
//            list.setVisibility(View.GONE);
//            txtNoItems.setVisibility(View.VISIBLE);
        }
    }

    public void onEvent(RemoveWishListResponseEvent removeWishListResponseEvent){
        hideProgressDialog();
        if(removeWishListResponseEvent.getSuccess()){
            WebServiceModel.getInstance(getActivity()).requestGetWishList(getActivity(), "remove", null);
        }else{
            ToastUtils.show(getActivity(), removeWishListResponseEvent.getMessage());
        }
    }

    public void onEvent(WishListUpdatedEvent wishListUpdatedEvent){
//        WishListResponse[] wishStaticListResponses = Hawk.get(AppUtils.grocery_static_list);
//        WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);
//        GroceryListAdapter adapter = new GroceryListAdapter(wishStaticListResponses, wishListResponses, getActivity());
//        list.setAdapter(adapter);
        setAdapter();
    }

    public void onEvent(GroceryListAdapterItemClickEvent groceryListAdapterItemClickEvent){
        GroceryCategoriesFragment groceryCategoriesFragment = new GroceryCategoriesFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", groceryListAdapterItemClickEvent.getPosition());
        bundle.putBoolean("isMyList", groceryListAdapterItemClickEvent.isMyList());
        bundle.putBoolean("isFromAlarm", groceryListAdapterItemClickEvent.isFromAlarm());
        groceryCategoriesFragment.setArguments(bundle);
        placeFragmentWithBackStack(groceryCategoriesFragment);
    }

    public void onEvent(GroceryListEvent groceryListEvent){
        hideProgressDialog();
        if(groceryListEvent.getSuccess()){

            ArrayList<WishListResponse> wishListResponsesList = new ArrayList<>();
            for(int i = 0 ; i < groceryListEvent.getGroceryList().getData().size(); i++){
                WishListResponse wishListResponse = new WishListResponse();
                wishListResponse.setName(groceryListEvent.getGroceryList().getData().get(i).getTitle());
                wishListResponse.setPrimaryKey(groceryListEvent.getGroceryList().getData().get(i).getTitle().hashCode() + "");
                wishListResponse.setStaticList(true);
                for(int j = 0 ; j < groceryListEvent.getGroceryList().getData().get(i).getGroceryItem().size(); j++){
                    Product product = new Product();
                    product.setCode(groceryListEvent.getGroceryList().getData().get(i).getGroceryItem().get(j).getProductId());
                    wishListResponse.addProduct(product);
                }
                wishListResponsesList.add(wishListResponse);
            }

            // Save the Grocery list
            WishListResponse[] tempWishListResponses = new WishListResponse[wishListResponsesList.size()];
            for(int i = 0; i < wishListResponsesList.size(); i++){
                tempWishListResponses[i] = wishListResponsesList.get(i);
            }
            // Update local static grocery list
            Hawk.put(AppUtils.grocery_static_list, tempWishListResponses);

        }else{
            ToastUtils.show(getActivity(), groceryListEvent.getMessage());
        }

        setAdapter();

    }

    public void setAdapter(){
//        list.setVisibility(View.VISIBLE);
//        txtNoItems.setVisibility(View.GONE);
        WishListResponse[] wishStaticListResponses = Hawk.get(AppUtils.grocery_static_list);
        WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);
//        groceryListAdapter = new GroceryListAdapter(wishStaticListResponses, wishListResponses, getActivity());
//        list.setAdapter(groceryListAdapter);

        GroceryViewPagerAdapter groceryViewPagerAdapter = new GroceryViewPagerAdapter(this.getChildFragmentManager(), wishStaticListResponses, wishListResponses, getBaseActivity());
        viewPager.setAdapter(groceryViewPagerAdapter);
        viewPager.setOffscreenPageLimit(2);
        viewPager.addOnPageChangeListener(groceryViewPagerAdapter);

        groceryViewPagerAdapter.notifyDataSetChanged();

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabTextColors(getResources().getColorStateList(R.color.tab_text_color));

    }


}
