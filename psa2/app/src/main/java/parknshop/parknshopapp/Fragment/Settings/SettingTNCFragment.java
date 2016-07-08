package parknshop.parknshopapp.Fragment.Settings;

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
 * Created by chrisyu on 27/4/16.
 */
public class SettingTNCFragment extends BaseFragment {
    @Bind(R.id.txtTNC)
    TextView txtTNC;

    public void onCreate(Bundle onsavedBundle) {
        super.onCreate(onsavedBundle);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.setting_tnc_fragment, container, false);


        ButterKnife.bind(this, view);

        String title = getArguments().getString("title");
        String tnc = getArguments().getString("tnc");

        GATrackerHelper.getInstance(getActivity()).setGATracker("settings-" + tnc);

        showBackButton();
        setToolbarTitle(title);
        disableCartButton();

        txtTNC.setText(tnc);

        return view;
    }

}
