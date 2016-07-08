package parknshop.parknshopapp.Fragment.Recipe;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.AnimationHelper;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.DishTypeResponse;
import parknshop.parknshopapp.Model.RecipeDetailResponse;
import parknshop.parknshopapp.Model.RecipeListResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.RecipeDetailListEvent;
import parknshop.parknshopapp.Rest.event.RecipeListSortTypeEvent;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by kwongyuenpan on 12/4/16.
 */
public class RecipeMainFragment extends BaseFragment {

    public static final String TAG = "RecipeMainFragment";

    @Bind (R.id.tab_layout) TabLayout tabLayout;
    @Bind (R.id.viewpager) ViewPager viewPager;

    @Bind (R.id.recycler_view) RecyclerView recyclerView;
    @Bind (R.id.progressBar) ProgressBar progressBar;

    @Bind (R.id.dish_type) Button dishType;
    @Bind (R.id.dish_type_root) View dishTypeRoot;
    @Bind (R.id.sorting_list_view) ListView dishTypeListView;
    @Bind (R.id.sorting_dimmed) View dimmed;

    @Bind (R.id.no_item_found) TextView noItemFound;

    public CategoryDrawerItem categoryDrawerItem;
    public RecipeListResponse.RecipeListItem data;
    public RecipeListAdapter recipeListAdapter;

    ArrayList<RecipeDetailResponse.RecipeDetailItem> totalItems = new ArrayList<>();
    ArrayList<RecipeDetailResponse.RecipeDetailItem> allItems = new ArrayList<>();
    ArrayList<RecipeDetailResponse.RecipeDetailItem> currentList = new ArrayList<>();
    int currentPosition = 0;
    Map<Integer,ArrayList<RecipeDetailResponse.RecipeDetailItem>> dataMap = new TreeMap<>();

    ArrayList<DishTypeResponse.DishTypeItem> dishTypeItems;

    RecipeDishTypeAdapter recipeDishTypeAdapter;

    View view;
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        view = getActivity().getLayoutInflater().inflate(R.layout.recipe_main_fragment_layout, null);

        GATrackerHelper.getInstance(getActivity()).setGATracker("recipe");

        ButterKnife.bind(this, view);

        data = categoryDrawerItem.getRecipeListItem();

        setViewpager();
        showProgressDialog();
        progressBar.setVisibility(View.VISIBLE);
        count = 0;

        if(data.getRecipeCatVOList() == null || data.getRecipeCatVOList().size() == 0) {
            hideProgressDialog();
            progressBar.setVisibility(View.GONE);
            noItemFound.setVisibility(View.VISIBLE);
           //tabLayout.setVisibility(View.GONE);
        }

        //for(int i = 0; i < data.getRecipeCatVOList().size(); i++)
        //    WebServiceModel.getInstance(getBaseActivity()).requestRecipeListByCat(data.getRecipeCatVOList().get(i).getId() + "");

        WebServiceModel.getInstance(getBaseActivity()).requestRecipeListByCat(data.getId() + "");
        WebServiceModel.getInstance(getBaseActivity()).requestRecipeListSortType();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        showToolbar();
        showLogo();
        showMenuButton();
        showShoppingCartButton();
        disableSecondRightButton();
        enableNavigationDrawer();

        setToolbarTitle(categoryDrawerItem.getName());

        return view;
    }

    public void onResume() {
        super.onResume();
        //if(tabAdapter != null)
        //    tabAdapter.onPageSelected(currentPosition);
    }

    TabAdapter tabAdapter;
    public void setViewpager() {
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        tabAdapter = new TabAdapter(this.getChildFragmentManager(), data, getBaseActivity());
        viewPager.setAdapter(tabAdapter);
        viewPager.addOnPageChangeListener(tabAdapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabTextColors(getResources().getColorStateList(R.color.tab_text_color));
    }

    class TabAdapter extends FragmentStatePagerAdapter implements ViewPager.OnPageChangeListener{
        RecipeListResponse.RecipeListItem data;

        public TabAdapter(FragmentManager fm, RecipeListResponse.RecipeListItem data, BaseActivity baseActivity) {
            super(fm);
            this.data = data;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // Generate title based on item position
            if(position == 0)
                return getString(R.string.recipe_all);
            if(position == 1)
                return getString(R.string.recipe_bookmarked);

            return this.data.getRecipeCatVOList().get(position - 2).getCategory();
        }

        @Override
        public Fragment getItem(int position) {
            return new BaseFragment();
        }

        @Override
        public int getCount() {
            if(data == null) return 2;
            if(data.getRecipeCatVOList() == null || data.getRecipeCatVOList().size() == 0) return 2;

            return this.data.getRecipeCatVOList().size() + 2;
        }

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            if(position == 0) {
                //currentList = getSorted(allItems);
                //updateAdapterData(currentList, true);
                showProgressDialog();
                WebServiceModel.getInstance(getBaseActivity()).requestRecipeListByCat(data.getId() + "");
            }else if(position == 1) {
                ArrayList<RecipeDetailResponse.RecipeDetailItem> items = getBookmarkedData();
                currentList = getSorted(items);
                updateAdapterData(currentList, false);
            } else {
                //int id = this.data.getRecipeCatVOList().get(position - 2).getId();
                //currentList = getSorted(dataMap.get(id));
                //updateAdapterData(currentList, false);
                showProgressDialog();
                WebServiceModel.getInstance(getBaseActivity()).requestRecipeListByCat(data.getRecipeCatVOList().get(position - 2).getId() + "");
            }
            currentPosition = position;
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

    public void updateAdapterData(ArrayList<RecipeDetailResponse.RecipeDetailItem> listData, boolean hasHeader) {
        if(recipeListAdapter == null) return;

        recipeListAdapter.hasHeader = hasHeader;
        recipeListAdapter.setData(listData);
        recipeListAdapter.setActivity(getBaseActivity());
        recipeListAdapter.notifyDataSetChanged();

        handleNoItemFoundIfNeeded(listData);
    }

    public void onEvent(RecipeDetailListEvent event) {
        if(event.getSuccess()) {
            if(event.getId().equals(data.getId() + "")) {
                allItems.clear();
                allItems.addAll(event.getResponse().getData());
                currentList = getSorted(allItems);
                setDataIfNeeded();

                hideProgressDialog();
                progressBar.setVisibility(View.GONE);
            } else {
                allItems.clear();
                allItems.addAll(event.getResponse().getData());
                currentList = getSorted(allItems);
                updateAdapterData(currentList, false);
                hideProgressDialog();
            }
        } else {
        }
    }


    int count = 0;
    public void hideProgressDialogIfNeeded(int count) {
        this.count++;
        if(this.count >= count) {
            hideProgressDialog();
            progressBar.setVisibility(View.GONE);
            setDataIfNeeded();
            this.count = 0;
        }
    }

    public void setDataIfNeeded() {
        recipeListAdapter = new RecipeListAdapter(getSorted(allItems));
        recipeListAdapter.hasHeader = true;
        recipeListAdapter.hasFooter = true;
        recipeListAdapter.headerUrl = "" + data.getImage();
        recipeListAdapter.setActivity(getBaseActivity());
        recyclerView.setAdapter(recipeListAdapter);
        totalItems.clear();
        totalItems.addAll(allItems);

        handleNoItemFoundIfNeeded(allItems);
    }

    public void handleNoItemFoundIfNeeded(ArrayList<RecipeDetailResponse.RecipeDetailItem> item) {
        if(item != null && item.size() == 0)
            noItemFound.setVisibility(View.VISIBLE);
        else
            noItemFound.setVisibility(View.GONE);
    }

    public void setSortedDataIfNeeded(ArrayList<RecipeDetailResponse.RecipeDetailItem> sortedItems) {
        recipeListAdapter = new RecipeListAdapter(sortedItems);
        recipeListAdapter.hasHeader = false;
        recipeListAdapter.hasFooter = true;
        recipeListAdapter.setActivity(getBaseActivity());
        recyclerView.setAdapter(recipeListAdapter);
    }

    public ArrayList<RecipeDetailResponse.RecipeDetailItem>  getBookmarkedData() {
        ArrayList<RecipeDetailResponse.RecipeDetailItem> bookmarked = new ArrayList<>();
        for(int i = 0; i < totalItems.size(); i++) {
            Map<Integer, Boolean> dataList = Hawk.get("recipeBookmarkMap", new TreeMap<Integer, Boolean>());
            Boolean selected = dataList.get(totalItems.get(i).getId());

            if(selected != null && selected == true)
                bookmarked.add(totalItems.get(i));
        }
        return bookmarked;
    }

    public void onEvent(RecipeListSortTypeEvent event) {
        if(event.getSuccess()) {
            if(event.getRemoteResponse() != null) {
                dishTypeItems = event.getRemoteResponse().data;
                if(dishTypeItems != null && dishTypeItems.size() > 0)
                    if(data.getRecipeCatVOList() != null && data.getRecipeCatVOList().size() > 0)
                        dishType.setVisibility(View.VISIBLE);
                recipeDishTypeAdapter = new RecipeDishTypeAdapter(dishTypeListView, getBaseActivity());
                recipeDishTypeAdapter.setData(dishTypeItems);
                dishTypeListView.setAdapter(recipeDishTypeAdapter);
                dishTypeListView.setOnItemClickListener(recipeDishTypeAdapter);
            }
        }
    }

    @OnClick(R.id.dish_type)
    public void dishTypeOnClick() {
        if(dishTypeItems != null && dishTypeItems.size() > 0) {
            //dishTypeRoot.setVisibility(View.VISIBLE);
            AnimationHelper.slideFromBottom(dishTypeRoot);
            dimmed.setVisibility(View.VISIBLE);
        }
    }

    @OnClick(R.id.sorting_dimmed)
    public void dimClicked() {
        AnimationHelper.slideToBottom(dishTypeRoot);
        dimmed.setVisibility(View.GONE);
    }

    @OnClick(R.id.dish_type_root)
    public void rootClick() {

    }

    @OnClick(R.id.back)
    public void back() {
        AnimationHelper.slideToBottom(dishTypeRoot);
        dimmed.setVisibility(View.GONE);
    }

    @OnClick(R.id.done)
    public void done() {
        boolean isAllSelected = recipeDishTypeAdapter.isAllSelected();
        dishTypeItems = recipeDishTypeAdapter.getData();

        //Log.i("isAllSelected" , "isAllSelected " + isAllSelected);

        if(isAllSelected) {
            updateAdapterData(allItems, recipeListAdapter.hasHeader);
        } else {
            updateAdapterData(getSorted(allItems), recipeListAdapter.hasHeader);
        }

        AnimationHelper.slideToBottom(dishTypeRoot);
        dimmed.setVisibility(View.GONE);
    }

    public ArrayList<RecipeDetailResponse.RecipeDetailItem> getSorted(ArrayList<RecipeDetailResponse.RecipeDetailItem> source) {
        if(recipeDishTypeAdapter == null)
            return source;

        boolean isAllSelected = recipeDishTypeAdapter.isAllSelected();

        if(isAllSelected)
            return source;

        ArrayList<RecipeDetailResponse.RecipeDetailItem> sortedItems = new ArrayList<>();

        for(int i = 0; i < source.size(); i++)
            for(int y = 0; y < dishTypeItems.size(); y++)
                if(dishTypeItems.get(y).getSelected() && dishTypeItems.get(y).getId() == source.get(i).getId())
                    sortedItems.add(source.get(i));

        return sortedItems;
    }
}