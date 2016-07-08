package parknshop.parknshopapp.Fragment.Account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.RegisterHelper;

/**
 * Created by chrisyu on 17/3/16.
 */
public class NewAccountFragment extends BaseFragment{
    @Bind(R.id.background) ImageView background;
    @Bind(R.id.btn_have_money_back_card)
    Button btn_have_money_back_card;
    @Bind(R.id.btn_dun_have_money_back_card)
    Button btn_dun_have_money_back_card;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_new_account_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("register");

        ButterKnife.bind(this, view);
        hideToolbar();

        Glide.with(this).load(R.drawable.sign_in_bg).into(background);

        return view;
    }

    @OnClick (R.id.btn_have_money_back_card)
    public void btn_have_money_back_card() {
        RegisterHelper.clear();
        placeFragmentWithBackStack(new RegisterMoneyBackCardFragment());
    }

    @OnClick (R.id.btn_dun_have_money_back_card)
    public void btn_dun_have_money_back_card() {
        RegisterHelper.clear();
        Bundle bundle = new Bundle();
        bundle.putInt("isMoneyBack", RegisterPageBasicFragment.NORMAL_USER);
        RegisterPageBasicFragment fragment = new RegisterPageBasicFragment();
        fragment.setArguments(bundle);
        placeFragmentWithBackStack(fragment);
//        placeFragmentWithBackStack(new RegisterWithoutMoneyBackCardFragment());
    }

    @OnClick ({R.id.back, R.id.already_have_an_account})
    public void back() {
        getActivity().onBackPressed();
    }
}
