package parknshop.parknshopapp.Fragment.Contacts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.WebView.WebViewFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.R;
public class CustomerServiceFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.customer_service_fragment_layout, container, false);
        ButterKnife.bind(this, view);

        showMenuButton();
        showToolbar();
        enableNavigationDrawer();
        setToolbarTitle(getString(R.string.home_activity_sliding_menu_customer_service));
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @OnClick(R.id.rlContacts)
    public void rlContacts(){

        GATrackerHelper.getInstance(getActivity()).setGATracker("customer-service/contact-us");

        ContactUsFragment fragment = new ContactUsFragment();
        placeFragmentWithBackStack(fragment);
    }

    @OnClick(R.id.rlAbout)
    public void rlAbout(){

        //CustomerServiceAboutFragment fragment = new CustomerServiceAboutFragment();
        //placeFragmentWithBackStack(fragment);
        String postfix = "?uiel=Mobile&lang=" + (GlobalConstant.language.equals(GlobalConstant.LANG_ZH) ? GlobalConstant.LANG_ZH : GlobalConstant.LANG_EN);

        WebViewFragment webViewFragment = WebViewFragment.newInstance("http://www.parknshop.com/contactUs" + postfix);
        webViewFragment.title = getString(R.string.customer_service_page_about);
        webViewFragment.showBackButton = true;
        placeFragmentWithBackStack(webViewFragment);
    }

    @OnClick(R.id.rlFAQ)
    public void rlFAQ(){

        GATrackerHelper.getInstance(getActivity()).setGATracker("customer-service/faqs");

//        MemberFAQFragment fragment = new MemberFAQFragment();
//        placeFragmentWithBackStack(fragment);
        String postfix = "?uiel=Mobile&lang=" + (GlobalConstant.language.equals(GlobalConstant.LANG_ZH) ? GlobalConstant.LANG_ZH : GlobalConstant.LANG_EN);

        WebViewFragment webViewFragment = WebViewFragment.newInstance("http://www.parknshop.com/FAQ" + postfix);
        webViewFragment.showBackButton = true;
        webViewFragment.title = getString(R.string.faq);
        placeFragmentWithBackStack(webViewFragment);

    }

}
