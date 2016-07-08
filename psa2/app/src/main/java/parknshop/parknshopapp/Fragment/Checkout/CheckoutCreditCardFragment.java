package parknshop.parknshopapp.Fragment.Checkout;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Dialog.WhatIsSecuCodeDialogFragment;
import parknshop.parknshopapp.Fragment.Home.HomeFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.PaymentCreditCardInfo;
import parknshop.parknshopapp.Model.PaymentInfoData;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.SetPaymentGatewayEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutButton;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by kwongyuenpan on 14/4/16.
 */
public class CheckoutCreditCardFragment extends BaseFragment {

    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    //@Bind(R.id.checkout_dot_1) LinearLayout dot1;
    //@Bind(R.id.checkout_dot_2) LinearLayout dot2;
    //@Bind(R.id.checkout_dot_3) LinearLayout dot3;
    //@Bind(R.id.checkout_dot_4) LinearLayout dot4;

    @Bind(R.id.edtHolderName) EditText edtHolderName;
    @Bind(R.id.edtCardNo) EditText edtCardNo;
    @Bind(R.id.edtExpiryMonth) EditText edtExpiryMonth;
    @Bind(R.id.edtExpiryYear) EditText edtExpiryYear;
    @Bind(R.id.edtIssueNumber) EditText edtIssueNumber;
    @Bind(R.id.btnConfirm) CheckoutButton btnConfirm;
    @Bind(R.id.llPayment) LinearLayout llPayment;
    @Bind(R.id.wvPayment) WebView wvPayment;

    @Bind(R.id.secu_code) TextView secu_code;

    String paymentGateway;
    String invoice;
    String url;
    PaymentCreditCardInfo paymentCreditCardInfo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_creditcard_fragment, container, false);

        paymentGateway = getArguments().getString("paymentGateway");
        invoice = getArguments().getString("invoice", "N");

        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.checkout));

        //new CheckOutDotViewHolder(dot1, 5, FINISH, getBaseActivity());
        //new CheckOutDotViewHolder(dot2, 6, FINISH, getBaseActivity());
        //new CheckOutDotViewHolder(dot3, 7, CURRENT, getBaseActivity());
        //new CheckOutDotViewHolder(dot4, 8, NOT_FINISH, getBaseActivity());

        /*
        edtHolderName.setText("test");
        edtCardNo.setText("4111111111111111");
        edtExpiryMonth.setText("10");
        edtExpiryYear.setText("16");
        edtIssueNumber.setText("123");
*/

        wvPayment.getSettings().setJavaScriptEnabled(true);
//            wvPayment.getSettings().setUseWideViewPort(true);
//        webView.loadUrl("file:///android_asset/filename.html");

        wvPayment.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading (WebView view, String url){
                LogUtil.info("", "url:::"+url);

                Uri uri=Uri.parse(url);
                String orderId = uri.getQueryParameter("orderId");
                String status = uri.getQueryParameter("status");

                if(status != null && status.equals("success") && orderId != null){
                    CheckoutThankYouFragment checkoutThankYouFragment = new CheckoutThankYouFragment();
                    checkoutThankYouFragment.setOrderNo(orderId);

                    GATrackerHelper.getInstance(getActivity()).setActionTransactionId(orderId);

                    Hawk.put("selectedDate", null);
                    Hawk.put("selectedTime", null);
                    Hawk.put("paymentMode", "");

                    placeFragmentWithBackStack(checkoutThankYouFragment);
                    return true;
                }else if(status != null && status.equals("failure")){
                    addFragmentToTop(new HomeFragment());
                    return true;
                }
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
                return;
            }
        });

        if(paymentGateway.equals("TNS")){
            url = getArguments().getString("url", "");
            llPayment.setVisibility(View.GONE);
            wvPayment.setVisibility(View.VISIBLE);
            wvPayment.loadUrl(url);
        }else{
            llPayment.setVisibility(View.VISIBLE);
            wvPayment.setVisibility(View.GONE);
        }

        getBaseActivity().editTextGetFocus(edtCardNo);

        return view;
    }

    @OnClick(R.id.btnConfirm)
    public void btnConfirm(){

        hideKeyboard();

        paymentCreditCardInfo = new PaymentCreditCardInfo();
        PaymentInfoData paymentInfoData = new PaymentInfoData();

        if(TextUtils.isEmpty(edtCardNo.getText().toString())){
            ToastUtils.show(getActivity(), getString(R.string.check_out_credit_card_no_empty));
            return;
        }

        if(TextUtils.isEmpty(edtCardNo.getText().toString()) || edtCardNo.getText().toString().length() < 16){
            ToastUtils.show(getActivity(), getString(R.string.check_out_credit_card_no_invalid));
            return;
        }

        if(TextUtils.isEmpty(edtIssueNumber.getText().toString())){
            ToastUtils.show(getActivity(), getString(R.string.check_out_credit_card_security_code_empty));
            return;
        }

        if(edtIssueNumber.length() < 3){
            ToastUtils.show(getActivity(), getString(R.string.check_out_credit_card_security_code_invalid));
            return;
        }

        if(TextUtils.isEmpty(edtExpiryMonth.getText().toString())){
            ToastUtils.show(getActivity(), getString(R.string.check_out_credit_card_expiry_month_empty));
            return;
        }

        if(edtExpiryMonth.getText().toString().length() < 2 || Integer.parseInt(edtExpiryMonth.getText().toString()) <= 0 || Integer.parseInt(edtExpiryMonth.getText().toString()) > 12){
            ToastUtils.show(getActivity(), getString(R.string.check_out_credit_card_expiry_month_invalid));
            return;
        }

        if(TextUtils.isEmpty(edtExpiryYear.getText().toString())){
            ToastUtils.show(getActivity(), getString(R.string.check_out_credit_card_expiry_year_empty));
            return;
        }

        if(edtExpiryYear.getText().toString().length() < 2){
            ToastUtils.show(getActivity(), getString(R.string.check_out_credit_card_expiry_year_invalid));
            return;
        }

        if(TextUtils.isEmpty(edtHolderName.getText().toString())){
            ToastUtils.show(getActivity(), getString(R.string.check_out_credit_card_name_empty));
            return;
        }

        paymentInfoData.setAccountHolderName(edtHolderName.getText().toString());
        paymentInfoData.setCardNumber(edtCardNo.getText().toString());
        paymentInfoData.setExpiryMonth(edtExpiryMonth.getText().toString());
        paymentInfoData.setExpiryYear(edtExpiryYear.getText().toString());
        paymentInfoData.setIssueNumber(edtIssueNumber.getText().toString());

        paymentCreditCardInfo.setPaymentInfoData(paymentInfoData);

        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestSetPaymentGateway(getActivity(), paymentGateway, "Y", invoice, "Y", paymentCreditCardInfo);

    }

    public void onEvent(SetPaymentGatewayEvent setPaymentGatewayEvent) {
        hideProgressDialog();
        if(setPaymentGatewayEvent.getSuccess()){
          //if(setPaymentGatewayEvent.getPaymentResponse().getStatus().equals("SUCCESS"))
            if(setPaymentGatewayEvent.getPaymentResponse().getUrl() != null){

//                CheckoutThankYouFragment checkoutThankYouFragment = new CheckoutThankYouFragment();
//                checkoutThankYouFragment.setOrderNo(setPaymentGatewayEvent.getPaymentResponse().getOrderNo());

                Hawk.put("selectedDate", null);
                Hawk.put("selectedTime", null);
                Hawk.put("paymentMode", "");

//                placeFragmentWithBackStack(checkoutThankYouFragment);

                url = setPaymentGatewayEvent.getPaymentResponse().getUrl();
                llPayment.setVisibility(View.GONE);
                wvPayment.setVisibility(View.VISIBLE);
//                wvPayment.loadUrl(url);

                Uri uri=Uri.parse(url);

                ArrayList<String> arrKey = new ArrayList<>();
                ArrayList<String> arrValue = new ArrayList<>();

                for(int i = 0; i < setPaymentGatewayEvent.getPaymentResponse().getParams().size(); i++){
                    arrKey.add(setPaymentGatewayEvent.getPaymentResponse().getParams().get(i).getKey());
                    arrValue.add(setPaymentGatewayEvent.getPaymentResponse().getParams().get(i).getValue());
                }

                String params = "";

                for(int i = 0; i < arrKey.size(); i++){
                    params = params + "<input type=\"text\" name=\""+ arrKey.get(i)+ "\" value=\""+ arrValue.get(i)+ "\">\n";
                }


                String data = "<html>\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\t<form action=\"" + url + "\" method=\"POST\" id=\"autoForm\" style=\"opacity:0;\">\n" +
                        params+
                        "\t</form>\n" +
                        "\t<script>\n" +
                        "\t\tdocument.getElementById(\"autoForm\").submit();\n" +
                        "\t</script>\t\n" +
                        "</body>\n" +
                        "</html>";

                wvPayment.getSettings().setJavaScriptEnabled(true);
                wvPayment.loadDataWithBaseURL("", data, "text/html", "UTF-8", "");
            }else if(setPaymentGatewayEvent.getPaymentResponse().getOrderNo() != null){
                CheckoutThankYouFragment checkoutThankYouFragment = new CheckoutThankYouFragment();
                checkoutThankYouFragment.setOrderNo(setPaymentGatewayEvent.getPaymentResponse().getOrderNo());

                Hawk.put("selectedDate", null);
                Hawk.put("selectedTime", null);
                Hawk.put("paymentMode", "");

                GATrackerHelper.getInstance(getActivity()).setActionTransactionId(setPaymentGatewayEvent.getPaymentResponse().getOrderNo());

                placeFragmentWithBackStack(checkoutThankYouFragment);
            }

        }else{
//            ToastUtils.show(getActivity(), setPaymentGatewayEvent.getMessage());
            ToastUtils.show(getActivity(), setPaymentGatewayEvent.getMessage());
        }
    }

    @OnClick(R.id.secu_code)
    public void onClickWhatIs() {
        new WhatIsSecuCodeDialogFragment().show(getSupportFragmentManager(), "");
    }
}
