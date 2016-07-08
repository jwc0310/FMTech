package parknshop.parknshopapp.Fragment.Checkout.old_stuff.DeliveryMethod;

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
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Account.RegisterPageContactFragment;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 15/3/16.
 */
public class CheckoutAddDeliveryAddressFragment extends BaseFragment {
    @Bind(R.id.btnMr)
    Button btnMr;
    @Bind(R.id.btnMrs)
    Button btnMrs;
    @Bind(R.id.btnMiss)
    Button btnMiss;
    @Bind(R.id.btnMs)
    Button btnMs;
    @Bind(R.id.edtFirstName)
    EditText edtFirstName;
    @Bind(R.id.edtLastName)
    EditText edtLastName;
    @Bind(R.id.edtCompanyName)
    EditText edtCompanyName;
    @Bind(R.id.edtAddress1)
    EditText edtAddress1;
    @Bind(R.id.edtAddress2)
    EditText edtAddress2;
    @Bind(R.id.txtPrefixNo)
    TextView txtPrefixNo;
    @Bind(R.id.txtCity)
    TextView txtCity;
    @Bind(R.id.txtCountry)
    TextView txtCountry;
    @Bind(R.id.edtPhoneNo)
    EditText edtPhoneNo;
    @Bind(R.id.btnAdd)
    Button btnAdd;

    String clickedMr = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_checkout_add_delivery_address, container, false);
        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();

        return view;
    }

    @OnClick (R.id.txtPrefixNo)
    public void txtPrefixNo() {
    }
    @OnClick (R.id.btnMr)
    public void btnMr() {
        setMrButton(0);
    }

    @OnClick (R.id.btnMrs)
    public void btnMrs() {
        setMrButton(1);
    }

    @OnClick (R.id.btnMiss)
    public void btnMiss() {
        setMrButton(2);
    }

    @OnClick (R.id.btnMs)
    public void btnMs() {
        setMrButton(3);
    }

    @OnClick (R.id.btnContinue)
    public void btnContinue() {
        placeFragmentWithBackStack(new RegisterPageContactFragment());
    }

    public void setMrButton(int clicked){
        switch(clicked){
            case 0:
                clickedMr = "Mr";
                btnMr.setTextColor(getResources().getColor(R.color.white));
                btnMrs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMiss.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMr.setBackgroundResource(R.drawable.btn_sharp_blue);
                btnMrs.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMiss.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMs.setBackgroundResource(R.drawable.btn_sharp_white);
                break;
            case 1:
                clickedMr = "Mrs";
                btnMr.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMrs.setTextColor(getResources().getColor(R.color.white));
                btnMiss.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMr.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMrs.setBackgroundResource(R.drawable.btn_sharp_blue);
                btnMiss.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMs.setBackgroundResource(R.drawable.btn_sharp_white);
                break;
            case 2:
                clickedMr = "Miss";
                btnMr.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMrs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMiss.setTextColor(getResources().getColor(R.color.white));
                btnMs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMr.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMrs.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMiss.setBackgroundResource(R.drawable.btn_sharp_blue);
                btnMs.setBackgroundResource(R.drawable.btn_sharp_white);
                break;
            case 3:
                clickedMr = "Ms";
                btnMr.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMrs.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMiss.setTextColor(getResources().getColor(R.color.txt_blue));
                btnMs.setTextColor(getResources().getColor(R.color.white));
                btnMr.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMrs.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMiss.setBackgroundResource(R.drawable.btn_sharp_white);
                btnMs.setBackgroundResource(R.drawable.btn_sharp_blue);
                break;
        }

    }

    @OnClick (R.id.txtCity)
    public void txtCity() {

    }

    @OnClick (R.id.txtCountry)
    public void txtCountry() {

    }

    @OnClick (R.id.btnAdd)
    public void btnAdd() {

    }

}
