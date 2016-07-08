package parknshop.parknshopapp.Fragment.Home;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.markmao.pulltorefresh.widget.XListView;
import com.orhanobut.hawk.Hawk;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Account.LoginFragment;
import parknshop.parknshopapp.Fragment.Grocery.GroceryMainTabFragment;
import parknshop.parknshopapp.Fragment.Home.HomeListView.HeaderViewPagerAdapter;
import parknshop.parknshopapp.Fragment.Home.HomeListView.HomeListViewAdapter;
import parknshop.parknshopapp.Fragment.Home.HomeListView.ListViewHeader;
import parknshop.parknshopapp.Fragment.Home.Search.SearchMainFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Advertisement;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.Model.PromotionCategoryResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CartEvent;
import parknshop.parknshopapp.Rest.event.CategoryTreeEvent;
import parknshop.parknshopapp.Rest.event.GetAdvertisementListEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

public class HomeFragment extends BaseFragment implements XListView.IXListViewListener{

    public static final String TAG = "HomeFragment";

    @Bind (R.id.swipe) SwipeRefreshLayout swipeRefreshLayout;
    public @Bind(R.id.listview) ListView homeListView;
    @Bind(R.id.imgBarcode) ImageView imgBarcode;
    @Bind(R.id.edtProductSearch) EditText edtProductSearch;

    CategoryTreeEvent mCategoryTreeEvent;

    View view;
    boolean calledAPI;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        view = getActivity().getLayoutInflater().inflate(R.layout.home_activity_layout, null);

        ButterKnife.bind(this, view);

        edtProductSearch.setFocusable(false);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(true);
                (new Handler()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //getLoadingView().setVisibility(View.VISIBLE);
                        HomeFragment.this.onRefresh();
                        swipeRefreshLayout.setRefreshing(false);

                    }
                }, 0);
            }
        });


        getLeftExpanableListView();
        HomePresenter.prepareListData((CategoryTree) Hawk.get("categoryTree"), this);
        getInboxMsg();
        //showProgressDialog();
        homeListViewAdapter = new HomeListViewAdapter(getActivity());
        homeListViewAdapter.setData(Hawk.get("home", new Advertisement()));
        homeListView.setAdapter(homeListViewAdapter);
        homeListView.setOnItemClickListener(homeListViewAdapter);

        /*

        ((XListView)homeListView).setPullRefreshEnable(true);
        ((XListView)homeListView).setPullLoadEnable(true);
        ((XListView)homeListView).setAutoLoadEnable(false);
        ((XListView)homeListView).setXListViewListener(this);
        ((XListView)homeListView).setRefreshTime(getTime());
*/

        callApi();

        if(getArguments() != null){
            boolean isGoToLoginPage = getArguments().getBoolean("isGoToLoginPage", false);
            if(isGoToLoginPage) {
                placeFragmentWithBackStack(new LoginFragment());
                return;
            }

            String gotoPage = getArguments().getString("goTo");
            String gotoPagePK = getArguments().getString("PK");
            if(!TextUtils.isEmpty(gotoPage) && !TextUtils.isEmpty(gotoPagePK)){
                if (gotoPage.equals("GROCERY_LIST_CAT")) {
                    if(GlobalConstant.isLogin){
                        Bundle bundle2 = new Bundle();
                        GroceryMainTabFragment fragment = new GroceryMainTabFragment();
                        bundle2.putString("goTo", gotoPage);
                        bundle2.putString("PK", gotoPagePK);
                        fragment.setArguments(bundle2);
                        placeFragmentWithBackStack(fragment);
                    }
                    return;
                }
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        showToolbar();
        showLogo();
        showMenuButton();
        showShoppingCartButton();
        enableSearchButton();
        enableSecondRightButton();
        enableNavigationDrawer();

        GATrackerHelper.getInstance(getActivity()).setGATracker("home");
        return view;
    }

    public void onResume() {
        super.onResume();
        //if(!calledAPI) {
        ////    callApi();
        //    calledAPI = true;
        //}
        getInboxMsg();
        Hawk.put("selectedGroupPos", 0);
        Hawk.put("groupPos", 0);
        Hawk.put("childPos", 0);
        HomePresenter.expanded = false;; // reset selected left menu
    }

    public void callApi() {
        //WebServiceModel.getInstance(getBaseActivity()).requestGetDummy();
        WebServiceModel.getInstance(getActivity()).requestGetCart(getActivity());
        getBaseActivity().swipePosition = -1;
    }

    @OnClick(R.id.edtProductSearch)
    public void edtProductSearch(){
        placeFragmentWithBackStack(new SearchMainFragment());
    }

    @OnClick({R.id.imgBarcode})
    public void goToQRScanner(){
        ScanSearchActivity.launchForResult(getActivity());
    }

    HomeListViewAdapter homeListViewAdapter;
    HeaderViewPagerAdapter headerViewPagerAdapter;
    ListViewHeader listViewHeader;

    public void onEvent(CartEvent cartEvent) {
        super.onEvent(cartEvent);
        //HomePresenter.prepareListData(Hawk.get("categoryTree", new CategoryTree()), this);
        HomePresenter.prepareRightList(Hawk.get("promotionList", new PromotionCategoryResponse() ) , this);
    }

    private String getTime() {
        return new SimpleDateFormat("MM-dd HH:mm", Locale.TRADITIONAL_CHINESE).format(new Date());
    }

    @Override
    public void onRefresh() {
        WebServiceModel.getInstance(getActivity()).requestGetAdvertisementListHome(getActivity());
    }

    public void onEvent(GetAdvertisementListEvent getAdvertisementListEvent) {
        if (getAdvertisementListEvent.getSuccess()) {
            if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH)) {

            } else {

            }
            if(getAdvertisementListEvent.getType().equals("ad"))
                Hawk.put("advertisement", getAdvertisementListEvent.getAdvertisement());
            else if(getAdvertisementListEvent.getType().equals("home"))
                Hawk.put("home", getAdvertisementListEvent.getAdvertisement());

        } else {
            ToastUtils.show(getActivity(), getAdvertisementListEvent.getMessage());
        }

        if(getBaseActivity().getAdvertisementData() != null && getBaseActivity().getAdvertisementData().getType().equals("fullscreen"))
            Glide.with(this).load(getBaseActivity().getAdvertisementData().getImage()).diskCacheStrategy(DiskCacheStrategy.SOURCE).preload();


        //((XListView)homeListView).stopRefresh();
        //((XListView)homeListView).stopLoadMore();
        //((XListView)homeListView).setRefreshTime(getTime());
    }

    @Override
    public void onLoadMore() {
    }
}
