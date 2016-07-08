package parknshop.parknshopapp.Fragment.Home.Search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Home.ScanSearchActivity;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.HistoryHelper;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.GetProductsByCatResponseEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by kwongyuenpan on 29/3/16.
 */
public class HistoryMainFragment extends BaseFragment {

    public static final String TAG = "HistoryMainFragment";

//    @Bind(R.id.swipe)
//    SwipeRefreshLayout swipeRefreshLayout;
    public
    @Bind(R.id.lvHistory)
    ListView lvHistory;

    HistoryListViewAdapter historyListViewAdapter;

    ArrayList<Product> searchHistoryList = new ArrayList<Product>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_history_main, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("search/search-history");
        ScanSearchActivity.GAPrefix = "search/";

        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        showLogo();
        enableNavigationDrawer();
        setToolbarTitle(getString(R.string.history_page_title));
        enableSecondRightTextButtonOnClickListener(getString(R.string.clear), new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HistoryHelper.clearAll(getActivity());
                searchHistoryList.clear();
                setAdapter();
            }
        });
//        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    public void onResume() {
        super.onResume();

        searchHistoryList.clear();
        if(HistoryHelper.getList(getActivity()) != null){
            searchHistoryList.addAll(HistoryHelper.getList(getActivity()));
        }
        if (searchHistoryList.size() == 0){
            return;
        }
        showLoadingView();
        String query = ":iwaBestSellerQty";
        for(Product product:searchHistoryList){
            query = query+":defaultVariantCode:"+product.getCode();
        }
        WebServiceModel.getInstance(getActivity()).requestGetProductsByCat(getActivity(), "Cat", query, this.hashCode(), 0);
        setAdapter();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ScanSearchActivity.GAPrefix = "";
    }

    public void setAdapter(){
        ArrayList<Product> productList = new ArrayList<>();

        for(int i = 0; i < searchHistoryList.size(); i++) {
            boolean contain = false;
            for(int y = 0; y < productList.size(); y++) {
                if(productList.get(y).getCode().equals(searchHistoryList.get(i).getCode() ))
                    contain = true;
            }

            if(!contain)
                productList.add(searchHistoryList.get(i));
        }

        historyListViewAdapter = new HistoryListViewAdapter(productList, getActivity());
        lvHistory.setOnItemClickListener(historyListViewAdapter);
        lvHistory.setAdapter(historyListViewAdapter);
    }

    public void onEvent(GetProductsByCatResponseEvent getProductsByCatResponseEvent) {
        hideLoadingView();
        if(getProductsByCatResponseEvent.hashCode() != this.hashCode()) return;

        if(getProductsByCatResponseEvent.getSuccess()){
            for(int i = 0; i < searchHistoryList.size(); i++){
                for(int j = 0; j < getProductsByCatResponseEvent.getTextSearchResponse().getProducts().size(); j++){
                    if(getProductsByCatResponseEvent.getTextSearchResponse().getProducts().get(j).getCode().equals(searchHistoryList.get(i).getCode())){
                        searchHistoryList.set(i, getProductsByCatResponseEvent.getTextSearchResponse().getProducts().get(j));
                        break;
                    }
                }
            }
        }else{
            ToastUtils.show(getActivity(), getProductsByCatResponseEvent.getMessage());
        }
    }
}
