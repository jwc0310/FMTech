package parknshop.parknshopapp.Fragment.Grocery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Adapter.GroceryListAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.WishListResponse;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.R;
import se.emilsjolander.stickylistheaders.ExpandableStickyListHeadersListView;

/**
 * Created by Kwong Yuen Pan on 2016/6/26.
 */

public class GroceryViewPagerFragment extends BaseFragment {
    @Bind(R.id.list)
    ExpandableStickyListHeadersListView list;
    @Bind(R.id.txtNoItems) TextView txtNoItems;
    @Bind(R.id.llAddNewList)
    LinearLayout llAddNewList;
//    GroceryListAdapter groceryListAdapter;

    public int positionType;

    WishListResponse[] mWishListResponse;

    public static GroceryViewPagerFragment newInstance(WishListResponse[] wishListResponse) {
        GroceryViewPagerFragment frag = new GroceryViewPagerFragment();
        Bundle b = new Bundle();
        b.putSerializable("wishListResponse", wishListResponse);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_grocery_view_pager, container, false);

//        GATrackerHelper.getInstance(getActivity()).setGATracker("ecoupon-and-evoucher");

        ButterKnife.bind(this, view);

        mWishListResponse = (WishListResponse[]) getArguments().getSerializable("wishListResponse");
        if(mWishListResponse.length == 0){
            txtNoItems.setVisibility(View.VISIBLE);
        }else{
            setAdapter();
        }

        return view;
    }

    public void setAdapter() {
        GroceryListAdapter adapter = null;
        if(positionType == 0) { // My List
            adapter = new GroceryListAdapter(null, mWishListResponse, getActivity());
            llAddNewList.setVisibility(View.VISIBLE);
        } else {// recommended list
            adapter = new GroceryListAdapter(mWishListResponse, null, getActivity());;
            llAddNewList.setVisibility(View.GONE);
        }
        list.setAdapter(adapter);
    }

    @OnClick(R.id.btnAddNewList)
    public void btnAddNewList(){
        ((OneActivity) getActivity()).addWishListDialog(getActivity(), null);
    }
}
