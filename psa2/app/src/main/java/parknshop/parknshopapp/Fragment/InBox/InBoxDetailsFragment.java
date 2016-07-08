package parknshop.parknshopapp.Fragment.InBox;

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
 * Created by hp on 25/4/2016.
 */
public class InBoxDetailsFragment extends BaseFragment {
    @Bind(R.id.txtConstant)
    TextView txtConstant;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.inbox_details_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("inbox-details");

        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        disableSecondRightButton();
        disableCartButton();

        String title = getArguments().getString("title");
        String constant = getArguments().getString("msg");

        setToolbarTitle(title);
        txtConstant.setText(constant);

        return view;
    }

}
