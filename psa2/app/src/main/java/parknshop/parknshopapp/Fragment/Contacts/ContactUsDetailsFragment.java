package parknshop.parknshopapp.Fragment.Contacts;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.ContactResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 11/4/16.
 */
public class ContactUsDetailsFragment extends BaseFragment {

    @Bind(R.id.llLayoutTel1) LinearLayout llLayoutTel1;
    @Bind(R.id.llLayoutTel2) LinearLayout llLayoutTel2;
    @Bind(R.id.llEmail) LinearLayout llEmail;
    @Bind(R.id.llLayoutOpenHr) LinearLayout llLayoutOpenHr;
    @Bind(R.id.txtTel) TextView txtTel;
    @Bind(R.id.txtFax) TextView txtFax;
    @Bind(R.id.txtEmail) TextView txtEmail;
    @Bind(R.id.txtOfficeHrPlaceHolder) TextView txtOfficeHrPlaceHolder;
    @Bind(R.id.txtOfficeHr) TextView txtOfficeHr;

    public final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    ContactResponse.Data data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.contact_us_details_fragment_layout, container, false);
        ButterKnife.bind(this, view);

        data = (ContactResponse.Data) getArguments().getSerializable("contactData");

        String title = getArguments().getString("title");
        setToolbarTitle(title);

        if(data.getNameEn().toLowerCase().contains(".com"))
            GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/contact-us/parknshopcom");
        else if(data.getNameEn().toLowerCase().contains("stores"))
            GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/contact-us/parknshop-retail-stores");

        if(data.getTelephone1() == null)
            llLayoutTel1.setVisibility(View.GONE);
        else
            txtTel.setText(data.getTelephone1());
        if(data.getFax() == null)
            llLayoutTel2.setVisibility(View.GONE);
        else
            txtFax.setText(data.getFax());
        if(data.getEmail() == null)
            llEmail.setVisibility(View.GONE);
        else
            txtEmail.setText(data.getEmail());
        if(data.getOfficeHours() == null)
            llLayoutOpenHr.setVisibility(View.GONE);
        else
            txtOfficeHrPlaceHolder.setText(data.getOfficeHours());


        txtOfficeHr.setText("");

        showBackButton();
        showToolbar();
        enableNavigationDrawer();
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @OnClick(R.id.btnCallHK)
    public void btnCallHK(){
        callDialog(data.getTelephone1(), data.getTelephone1());
    }

//    @OnClick(R.id.btnCallMO)
//    public void btnCallMO(){
//        callDialog(data.getTelephone2(), getString(R.string.contacts_details_page_mo_office_no) + " " + data.getTelephone1());
//    }

    @OnClick(R.id.llEmail)
    public void llEmail(){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto",data.getEmail(), null));
    emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.customer_service_contact_us_email_subject));

//        String strID = "";
//        if(GlobalConstant.isLogin)
//            strID = "User ID: " + MemberHelper.getMemberProfile().getEmail() + "\n";

        String content = "\n\n\n ================== \n" + getString(R.string.customer_service_contact_us_os_version) + " " + Build.VERSION.RELEASE + "\n" +
                getString(R.string.customer_service_contact_us_device_model) + Build.MANUFACTURER + " " + Build.MODEL + "\n" +
                getString(R.string.customer_service_contact_us_app_version) + " " + getString(R.string.app_version) + "\n" +
                getString(R.string.customer_service_contact_us_app_language) + " " + getString(R.string.customer_service_contact_us_langauge) + "\n" +
//                strID +
                getString(R.string.customer_service_contact_us_date_n_time) + " " + DEFAULT_DATE_FORMAT.format(System.currentTimeMillis());

    emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, content);
        startActivity(Intent.createChooser(emailIntent, null));
    }

    public void callDialog(final String number, String msg){
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.dialog_call, null);
        final Dialog mDialog = new Dialog(getActivity());
        TextView txtTitle = (TextView) layout.findViewById(R.id.txtTitle);
        TextView btnCancel = (TextView) layout.findViewById(R.id.btnCancel);
        TextView btnOK = (TextView) layout.findViewById(R.id.btnOK);

        txtTitle.setText(getString(R.string.contacts_details_page_dial_to) + " " + msg);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
                // Add new Wishlist
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+number));
                startActivity(intent);

            }
        });
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(layout);
        mDialog.show();
    }

}
