package parknshop.parknshopapp.Fragment.Redemption.RedemptionList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.RedemptionResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.RedemptionListEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by hp on 22/4/2016.
 */
public class RedemptionListFragment extends BaseFragment {
    @Bind(R.id.listview) ListView redemptionListView;
    RedemptionListAdapter redemptionListAdapter;

    View view;


    public void onCreate(Bundle onSavedBundle) {
        super.onCreate(onSavedBundle);
        view = getActivity().getLayoutInflater().inflate(R.layout.redemption_list_fragment_layout, null);
        ButterKnife.bind(this, view);

        GATrackerHelper.getInstance(getActivity()).setGATracker("redemption");

        redemptionListAdapter = new RedemptionListAdapter(getActivity());

        showProgressDialog();
        WebServiceModel.getInstance(getBaseActivity()).requestGetRedemptionList(getBaseActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        showToolbar();
        showLogo();

        if(getArguments() != null){
            if(getArguments().getBoolean("isBack", false)){
                showBackButton();
            }else{
                showMenuButton();
            }
        }else{
            showMenuButton();
        }
        showShoppingCartButton();
        disableSecondRightButton();
        enableNavigationDrawer();
        setToolbarTitle(getString(R.string.home_activity_sliding_menu_redemption));

        return view;
    }

    public void onEvent(RedemptionListEvent redemptionListEvent) {
        hideProgressDialog();
        if(redemptionListEvent.getSuccess()) {
            //Log.i("redemption", "redemption" + ((RedemptionResponse) redemptionListEvent.getDataObject()).getData().size());

            RedemptionResponse redemptionResponse = (RedemptionResponse) redemptionListEvent.getDataObject();
            ArrayList<RedemptionResponse.RedemptionListData> dataArrayList = redemptionResponse.getData();
            redemptionListAdapter.setData(dataArrayList);
            redemptionListView.setAdapter(redemptionListAdapter);
            redemptionListView.setOnItemClickListener(redemptionListAdapter);
        } else {
            ToastUtils.show(getBaseActivity(), redemptionListEvent.getMessage());
        }
    }

}
