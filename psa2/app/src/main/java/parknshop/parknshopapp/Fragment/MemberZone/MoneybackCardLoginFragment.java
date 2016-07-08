package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.LoginEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by Gigi Wong on 2016年04月20日.
 */
public class MoneybackCardLoginFragment extends BaseFragment {
    @Bind(R.id.edtCardNO)
    EditText edtCardNO;
    @Bind(R.id.edtPwd)
    EditText edtPwd;
    @Bind(R.id.background)
    ImageView background;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_moneyback_login_layout, container, false);
        ButterKnife.bind(this, view);
        Glide.with(this).load(R.drawable.sign_in_bg).into(background);

        return view;
    }

    public void onResume() {
        super.onResume();
        hideToolbar();
    }

    public void onPause(){
        super.onPause();
        showToolbar();
    }

    @OnClick(R.id.btnLogin)
    public void btnLogin() {
        if(TextUtils.isEmpty(edtCardNO.getText().toString().trim())) {
            ToastUtils.show(getActivity(), "Email empty");
            return;
        }
        if(TextUtils.isEmpty(edtPwd.getText().toString().trim())) {
            ToastUtils.show(getActivity(), "Password empty");
            return;
        }

        showLoadingView();
        WebServiceModel.getInstance(getActivity()).requestLoginUser(edtCardNO.getText().toString(), edtPwd.getText().toString());
    }

    @OnClick(R.id.back)
    public void back() {
        getActivity().onBackPressed();
    }

    public void onEvent(LoginEvent loginEvent){
        hideLoadingView();
        if(loginEvent.getSuccess()){
            GlobalConstant.isMoneybackCardLogin = true;
            GlobalConstant.moneybackCardToken = loginEvent.getLoginResponse().getMemberProfile().getToken();
            addFragmentToTop(new MembershipCardFragment());
        }else{
            ToastUtils.show(getActivity(), getString(R.string.moneyback_card_login_fail));
        }

    }
}

