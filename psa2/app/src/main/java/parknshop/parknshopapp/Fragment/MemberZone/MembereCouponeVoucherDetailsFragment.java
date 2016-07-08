package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class MembereCouponeVoucherDetailsFragment extends BaseFragment {

    @Bind(R.id.txtDetails)
    TextView txtDetails;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_ecoupon_evoucher_details, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("ecoupon-and-evoucher-details");

        ButterKnife.bind(this, view);

        String title = getArguments().getString("title", "");
        String desc = getArguments().getString("desc", "");

        showBackButton();
        showToolbar();
        enableNavigationDrawer();
        enableSecondRightButton();
        disableCartButton();

        setToolbarTitle(title);
        txtDetails.setText(desc);

        return view;
    }

}
