package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Home.ScanSearchActivity;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.R;

/**
 * Created by Gigi Wong on 2016年04月20日.
 */
public class MemberCardLinkFragment extends BaseFragment {

    @Bind(R.id.edtMemberCardNo)
    EditText edtMemberCardNo;
    @Bind(R.id.edtPassword)
    EditText edtPassword;
    @Bind(R.id.btnLink)
    Button btnLink;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_card_link_card, container, false);
        ButterKnife.bind(this, view);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account-link-card");

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.top_brands_page_title));
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @OnClick(R.id.btnLink)
    public void btnLink() {

    }

    @OnClick({R.id.imgBarcode})
    public void goToQRScanner(){
        ScanSearchActivity.launchForResult(getActivity());
    }
}