package parknshop.parknshopapp.Fragment.Contacts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 11/4/16.
 */
public class CustomerServiceAboutFragment extends BaseFragment {
    @Bind(R.id.wvAbout)
    WebView wvAbout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.customer_service_about_fragment_layout, container, false);
        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        enableNavigationDrawer();
        setToolbarTitle(getString(R.string.contacts_page_head_title));
        disableSecondRightButton();
        disableCartButton();

        wvAbout.loadUrl("http://infpnshkuat.aswatson.net/");

        return view;
    }

}
