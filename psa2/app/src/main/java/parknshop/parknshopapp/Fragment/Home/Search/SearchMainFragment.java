package parknshop.parknshopapp.Fragment.Home.Search;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Adapter.SearchHistoryListAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.SearchHistoryListAdapterOnItemClickEvent;
import parknshop.parknshopapp.Fragment.Home.ScanSearchActivity;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.HotSearchEvent;
import parknshop.parknshopapp.Utils.AppUtils;
import parknshop.parknshopapp.WebServiceModel;
import se.emilsjolander.stickylistheaders.ExpandableStickyListHeadersListView;

/**
 * Created by kwongyuenpan on 29/3/16.
 */
public class SearchMainFragment extends BaseFragment {

    public static final String TAG = "HomeFragment";

//    @Bind(R.id.swipe)
//    SwipeRefreshLayout swipeRefreshLayout;
    public @Bind(R.id.lvSearch) ExpandableStickyListHeadersListView lvSearch;
    @Bind(R.id.imgBarcode) ImageView imgBarcode;
    @Bind(R.id.edtProductSearch) EditText edtProductSearch;

    SearchHistoryListAdapter searchHistoryListAdapter;

    ArrayList<String> searchHistoryList = new ArrayList<String>();
    List<String> hotSearchList = new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_search_main, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("search/search-history");

        ButterKnife.bind(this, view);
        showToolbar();
        showLogo();
        showBackButton();
//        enableSecondRightButton();
        setToolbarTitle(getString(R.string.search_page_title));
        enableSecondRightTextButton(getString(R.string.history_page_title), new HistoryMainFragment());
        disableNavigationDrawer();
        hideShoppingCartButton();
        disableSearchButton();

        searchHistoryListAdapter = new SearchHistoryListAdapter(getActivity(), searchHistoryList);

        showProgressDialog();
        WebServiceModel.getInstance(getBaseActivity()).requestHotSearch();
//        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                swipeRefreshLayout.setRefreshing(true);
//                ( new Handler()).postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        getLoadingView().setVisibility(View.VISIBLE);
//                        HomeFragment.this.callApi();
//                        swipeRefreshLayout.setRefreshing(false);
//
//                    }
//                }, 0);
//            }
//        });

        getBaseActivity().editTextGetFocus(edtProductSearch);

        edtProductSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH || actionId == 0) {

                    WebServiceModel.getInstance(getActivity()).requestGetProductsByTextSearch(getActivity(), edtProductSearch.getText().toString(), "0", "iwaBestSellerQty", this.hashCode());


                    ArrayList<String> searchHistoryList = new ArrayList<String>();
                    if(Hawk.get(AppUtils.search_history_list) != null){
                        searchHistoryList.addAll((Collection<? extends String>) Hawk.get(AppUtils.search_history_list));
                    }
                    searchHistoryList.add(edtProductSearch.getText().toString());

                    Hawk.put(AppUtils.search_history_list, searchHistoryList);

                    placeFragmentWithBackStack(ProductListFragment.newInstance(0, edtProductSearch.getText().toString(), true));

                    // clear text
                    edtProductSearch.setText(null);

                    // hide keyboard
//                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(
//                            Context.INPUT_METHOD_SERVICE);
//                    imm.hideSoftInputFromWindow(edtProductSearch.getWindowToken(), 0);
                    hideKeyboard();

                }
                return false;
            }
        });

        return view;
    }

    public void onResume() {
        super.onResume();
//        getLoadingView().setVisibility(View.VISIBLE);
//        callApi();
        searchHistoryList.clear();
        if(Hawk.get(AppUtils.search_history_list) != null){
            searchHistoryList.addAll((Collection<? extends String>) Hawk.get(AppUtils.search_history_list));
        }

        searchHistoryListAdapter.setList(searchHistoryList);
        lvSearch.setOnItemClickListener(searchHistoryListAdapter);
        lvSearch.setAdapter(searchHistoryListAdapter);

    }

    public void onEvent(SearchHistoryListAdapterOnItemClickEvent searchHistoryListAdapterOnItemClickEvent) {
        int position = searchHistoryListAdapterOnItemClickEvent.getPosition();
        String item;

        if(position < hotSearchList.size()) {
            item = hotSearchList.get(position);
        } else {
            item = searchHistoryList.get(position - hotSearchList.size());
        }

        placeFragmentWithBackStack(ProductListFragment.newInstance(0, item, true));
    }

    public void onEvent(HotSearchEvent hotSearchEvent) {
        hideProgressDialog();

        if(hotSearchEvent.getSuccess()) {
            hotSearchList = hotSearchEvent.getData();

            if(searchHistoryListAdapter != null) {
                searchHistoryListAdapter.setHotSearchList(hotSearchList);
                lvSearch.setOnItemClickListener(searchHistoryListAdapter);
                lvSearch.setAdapter(searchHistoryListAdapter);
            }
        } else {
        }
    }

    @OnClick({R.id.imgBarcode})
    public void goToQRScanner(){
        ScanSearchActivity.launchForResult(getActivity());
    }
}
