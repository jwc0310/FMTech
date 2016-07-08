package parknshop.parknshopapp.Fragment.WebView;

import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.LogUtil;

/**
 * Created by chrisyu on 22/4/16.
 */
public class WebViewFragment extends BaseFragment{
    @Bind (R.id.webview) WebView webview;
    @Bind (R.id.delivery_progress_bar)
    ProgressBar progressBar;

    public String title = "";
    public boolean showBackButton;
    public boolean showMoneyBackLogo;
    public String url;
    String htmlData;

    public static WebViewFragment newInstance(String url) {
        WebViewFragment webViewFragment = new WebViewFragment();

        Bundle args = new Bundle();
        args.putString("url", url);

        //Log.i("[url]", "[url1] "+ url);
        webViewFragment.setArguments(args);
        return webViewFragment;
    }

    public static WebViewFragment newInstance(String url, boolean boo) {
        WebViewFragment webViewFragment = new WebViewFragment();

        Bundle args = new Bundle();
        args.putString("html_content", url);

        webViewFragment.setArguments(args);
        return webViewFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.web_view_fragment_layout, container, false);
        ButterKnife.bind(this, view);
        showToolbar();

        if(showBackButton)
            showBackButton();
        else
            showMenuButton();

        showShoppingCartButton();
        enableNavigationDrawer();

       // if(!TextUtils.isEmpty(title)){

            setToolbarTitle(title);
        //} else {
        if(showMoneyBackLogo) {
            showLogo(R.drawable.money_back_logo);
            disableSecondRightButton();
        }
        //}

        //Log.i("[url]", "[url2] "+ (getArguments() == null)+","+getArguments().getString("url"));
        url = getArguments() == null ? "" : getArguments().getString("url");
        htmlData = getArguments() == null ? "" : getArguments().getString("html_content");
        String title = getArguments() == null ? "" : getArguments().getString("title");
        Log.i("[url]", "[htmlData] "+ htmlData);

        if(!TextUtils.isEmpty(title)){
            setToolbarTitle(title);
        }

        //Log.i("[url]", "[url] "+ url);

        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setUseWideViewPort(true);

        webview.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading (WebView view, String url){
                LogUtil.info("", "url:::"+url);
                if(url.contains("http"))
                    view.loadUrl(url);
                return true;
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
                return;
            }
        });

        webview.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress)
            {
                //Make the bar disappear after URL is loaded, and changes string to Loading...
                //setTitle("Loading...");
                //setProgress(progress * 100); //Make the bar disappear after URL is loaded
                progressBar.setProgress(progress);
                // Return the app name after finish loading
                //if(progress == 100)
                //    setTitle(R.string.app_name);
            }
        });


        if(url != null)
            webview.loadUrl(url);
        else if(htmlData != null)
            //webview.loadData(String.valueOf(Html.fromHtml(htmlData)), "text/html; charset=utf-8", "utf-8");
            webview.loadDataWithBaseURL("x-data://base", htmlData, "text/html", "UTF-8", null);
        return view;
    }

}
