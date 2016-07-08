package parknshop.parknshopapp.Fragment.TopBrands;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Adapter.TopBrandListAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.TopBrandListAdapterOnItemClickEvent;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.BrandList;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.BrandListResponseEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;
import se.emilsjolander.stickylistheaders.ExpandableStickyListHeadersListView;

/**
 * Created by kwongyuenpan on 8/4/16.
 */
public class TopBrandsFragment extends BaseFragment {

    @Bind(R.id.list)
    ExpandableStickyListHeadersListView list;
    View view;

    @Override
    public void onCreate(Bundle onsaved) {
        super.onCreate(onsaved);
        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestGetBrandList(getActivity());
        view = getActivity().getLayoutInflater().inflate(R.layout.fragment_top_brands, null);
        ButterKnife.bind(this, view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        GATrackerHelper.getInstance(getActivity()).setCategory("top-brands/all-brands");
        return view;
    }

    public void onResume() {
        super.onResume();

        showMenuButton();
        showToolbar();
        showLogo();
        enableNavigationDrawer();
        setToolbarTitle(getString(R.string.top_brands_page_title));
        enableSecondRightButton();
        showShoppingCartButton();
    }

    public void onEvent(BrandListResponseEvent brandListResponseEvent) {
        hideProgressDialog();
        if(brandListResponseEvent.getSuccess()){
            List<BrandList> brandLists = brandListResponseEvent.getBrandListResponse().getBrandList();
            Collections.sort(brandLists, new BrandComparator());

            TopBrandListAdapter topBrandListAdapter = new TopBrandListAdapter(getActivity(), brandLists);
            list.setAdapter(topBrandListAdapter);
        }else{
            ToastUtils.show(getActivity(), brandListResponseEvent.getMessage());
        }
    }

    public void onEvent(TopBrandListAdapterOnItemClickEvent topBrandListAdapterOnItemClickEvent) {
        ProductListFragment pf = ProductListFragment.newInstance(0, topBrandListAdapterOnItemClickEvent.getBrandName(), true);
        pf.setGATag("drgerger4weretpk[pbrandlist/" + topBrandListAdapterOnItemClickEvent.getBrandCode());
        //GATrackerHelper.getInstance(getActivity()).setCategory("brandlist/" + topBrandListAdapterOnItemClickEvent.getBrandCode() + "/");
        placeFragmentWithBackStack(pf);
    }

    class BrandComparator implements Comparator<BrandList> {

        @Override
        public int compare(BrandList lhs, BrandList rhs) {

            return lhs.getPrefix().compareTo(rhs.getPrefix());
        }
    }
}
