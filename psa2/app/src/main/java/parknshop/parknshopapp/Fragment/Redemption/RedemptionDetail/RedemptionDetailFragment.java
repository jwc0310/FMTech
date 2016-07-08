package parknshop.parknshopapp.Fragment.Redemption.RedemptionDetail;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.RedemptionItemResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.RedemptionItemEvent;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by hp on 22/4/2016.
 */
public class RedemptionDetailFragment extends BaseFragment {
    @Bind(R.id.recycler_view) RecyclerView recyclerView;
    String id = "1";
    RedemptionRecyclerViewAdapter redemptionListAdapter;

    public static RedemptionDetailFragment newInstance(String id) {
        RedemptionDetailFragment redemptionDetailFragment = new RedemptionDetailFragment();
        redemptionDetailFragment.id = id;

        return redemptionDetailFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.redemption_detail_fragment_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("redemption-details");

        ButterKnife.bind(this, view);
        showToolbar();
        showLogo();
        showBackButton();
        showShoppingCartButton();
        disableSecondRightButton();
        enableNavigationDrawer();


        //redemptionListAdapter = new RedemptionListAdapter(getActivity());
        redemptionListAdapter = new RedemptionRecyclerViewAdapter(this);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        return view;
    }

    public void onResume() {
        super.onResume();
        showProgressDialog();
        WebServiceModel.getInstance(getBaseActivity()).requestGetRedemptionItem(getBaseActivity(), id);
    }

    public void onEvent(RedemptionItemEvent event) {
        hideProgressDialog();

        if(event.getSuccess()) {
            RedemptionItemResponse re = (RedemptionItemResponse)event.getDataObject();
            RedemptionItemResponse.Redemption data = re.getData();
            redemptionListAdapter.hasFooter = false;
            redemptionListAdapter.hasHeader = true;
            redemptionListAdapter.data = data;

            setToolbarTitle(data.getTitle());

            redemptionListAdapter.redemptionItemList = (data).redemeptionItemVOList;
            recyclerView.setAdapter(redemptionListAdapter);
        } else {

        }
    }
}
