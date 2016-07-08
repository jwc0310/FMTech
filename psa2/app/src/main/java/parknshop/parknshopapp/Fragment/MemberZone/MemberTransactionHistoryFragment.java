package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Adapter.OrderHistoryListAdapter;
import parknshop.parknshopapp.Adapter.TransactionHistoryListAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;

/**
 * Created by Gigi Wong on 2016年04月20日.
 */
public class MemberTransactionHistoryFragment extends BaseFragment {

    @Bind(R.id.list)
    ListView list;

    TransactionHistoryListAdapter transactionHistoryListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_card_transaction_history, container, false);
        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.transaction_history));
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        uploadLayout();
    }

    public void uploadLayout(){
        List<String> order = new ArrayList<>();
        order.add("Test");
        if(order != null && order.size() > 0) {
            transactionHistoryListAdapter = new TransactionHistoryListAdapter(order, getActivity());
            list.setAdapter(transactionHistoryListAdapter);
        }
    }
}