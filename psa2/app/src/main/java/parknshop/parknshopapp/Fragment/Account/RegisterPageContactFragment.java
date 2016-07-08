package parknshop.parknshopapp.Fragment.Account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Model.RegisterForm;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.RegisterHelper;
import parknshop.parknshopapp.View.RegistrationDotViewHolder;

/**
 * Created by chrisyu on 15/3/16.
 */
public class RegisterPageContactFragment extends RegistrationWrapperFragment {
    @Bind(R.id.edtEmail)
    EditText edtEmail;
    @Bind(R.id.txtPrefixNo)
    TextView txtPrefixNo;
    @Bind(R.id.edtPhoneNo)
    EditText edtPhoneNo;
    @Bind(R.id.btnContinue)
    Button btnContinue;

    int moneyBack;

    RegisterForm registerForm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_register_contact, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();

        registerForm = RegisterHelper.getInfo();

        moneyBack = getArguments().getInt("isMoneyBack", 0);

        new RegistrationDotViewHolder(dot1, 1, FINISH, getBaseActivity(), moneyBack);
        new RegistrationDotViewHolder(dot2, 2, FINISH, getBaseActivity(), moneyBack);
        new RegistrationDotViewHolder(dot3, 3, CURRENT, getBaseActivity(), moneyBack);
        new RegistrationDotViewHolder(dot4, 4, NOT_FINISH, getBaseActivity(), moneyBack);

        return view;
    }

    @OnClick (R.id.txtPrefixNo)
    public void txtPrefixNo() {

    }

    @OnClick (R.id.btnContinue)
    public void btnContinue() {

        registerForm.setMobile(txtPrefixNo.getText().toString().trim() + edtPhoneNo.getText().toString().trim());
        RegisterForm.PhoneForm phoneForm = registerForm.getPhoneForm();
        phoneForm.setPhoneNumber(txtPrefixNo.getText().toString().trim() + edtPhoneNo.getText().toString().trim());
        registerForm.setPhoneForm(phoneForm);
        RegisterHelper.saveInfo(registerForm);

        Bundle bundle = new Bundle();
        bundle.putInt("isMoneyBack", moneyBack);
        RegisterPageAccountDetailsFragment fragment = new RegisterPageAccountDetailsFragment();
        fragment.setArguments(bundle);
        placeFragmentWithBackStack(fragment);
    }

}
