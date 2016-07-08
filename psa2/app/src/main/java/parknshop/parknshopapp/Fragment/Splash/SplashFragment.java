package parknshop.parknshopapp.Fragment.Splash;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.google.firebase.iid.FirebaseInstanceId;
import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.ConfigHelper;
import parknshop.parknshopapp.Fragment.Home.HomeFragment;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Fragment.Tutorial.TutorialFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.Model.ConfigInfoResponse;
import parknshop.parknshopapp.Model.NewPromotionResponse;
import parknshop.parknshopapp.Model.RecipeListResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.BackendConfigEvent;
import parknshop.parknshopapp.Rest.event.CategoryTreeEvent;
import parknshop.parknshopapp.Rest.event.ForceUpdateResponseEvent;
import parknshop.parknshopapp.Rest.event.GetAdvertisementListEvent;
import parknshop.parknshopapp.Rest.event.NewPromotionEvent;
import parknshop.parknshopapp.Rest.event.PromotionListEvent;
import parknshop.parknshopapp.Rest.event.RecipeListResponseEvent;
import parknshop.parknshopapp.TokenHelper;
import parknshop.parknshopapp.Utils.LanguageUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;
import parknshop.parknshopapp.common.MemberHelper;

/**
 * Created by chrisyu on 11/3/16.
 */
public class SplashFragment extends BaseFragment {
    @Bind(R.id.background) ImageView background;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.splash_activity_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("splash-screen");

        ButterKnife.bind(this, view);
        hideToolbar();
        disableNavigationDrawer();

        LanguageUtil.initLanguage(getBaseActivity(), null);

        GlobalConstant.isMoneybackCardLogin = false;
        GlobalConstant.moneybackCardToken = null;

        // If device cannot get a registration id, generate token for inbox use.
        TokenHelper.saveDeviceId();

        if (MemberHelper.isRmbLogin() && !TextUtils.isEmpty(MemberHelper.getUserToken(getBaseActivity()))) {
            GlobalConstant.isLogin = true;
        }else{
            ((BaseActivity) getActivity()).clearUserInfo();
        }

        if (checkPlayServices()) {
            String refreshedToken = FirebaseInstanceId.getInstance().getToken();
            Log.d("", "Refreshed_token: " + refreshedToken);
            // Start IntentService to register this application with GCM.
//            Intent intent = new Intent(getActivity(), RegistrationIntentService.class);
//            getActivity().startService(intent);
        } else {
            // If device cannot get a registration id, send device id to server
            WebServiceModel.getInstance(getActivity()).requestRegisterPush(TokenHelper.getToken());
        }

        if(getArguments() != null){
            String gotoPage = getArguments().getString("goTo");
            String gotoPagePK = getArguments().getString("PK");
            if(!TextUtils.isEmpty(gotoPage) && !TextUtils.isEmpty(gotoPagePK)){
                Bundle bundle = new Bundle();
                HomeFragment fragment = new HomeFragment();
                bundle.putString("goTo", gotoPage);
                bundle.putString("PK", gotoPagePK);
                fragment.setArguments(bundle);
                placeFragment(fragment);
                return view;
            }
        }

        return view;
    }

    public void onResume() {
        super.onResume();
        Glide.with(this).load(R.drawable.menu_bg).diskCacheStrategy(DiskCacheStrategy.SOURCE).preload();
        //WebServiceModel.getInstance(getActivity()).requestGetBackendConfigContributors();
//        WebServiceModel.getInstance(getBaseActivity()).requestConfig();
//        HttpClient.makePostRequest(AppUtils.BACKEND_CONFIG, "{}", new CustomCallBack(ConfigInfoResponse.class, new SplashRunnable(this), getActivity()) );
//        WebServiceModel.getInstance(getActivity()).requestGetAdvertisementList(getActivity());
//
//        WebServiceModel.getInstance(getActivity()).requestGetAdvertisementListHome(getActivity());
        WebServiceModel.getInstance(getActivity()).requestGetForceUpdate();
    }

    public void onEvent(ForceUpdateResponseEvent forceUpdateResponseEvent) {
        double currentVersion = Double.parseDouble(getString(R.string.app_version));
        if (forceUpdateResponseEvent.getSuccess()) {
            double updateVersion = Double.parseDouble(forceUpdateResponseEvent.getForceUpdateResponse().getData().getSoft_version());

            Hawk.put("updateVersion", updateVersion);
            Hawk.put("updateForce", forceUpdateResponseEvent.getForceUpdateResponse().getData().isForceUpdate());
            if(currentVersion < updateVersion) {
                updateDialog(forceUpdateResponseEvent.getForceUpdateResponse().getData().isForceUpdate());
            }else{
                callAPIs();
            }

        }else{
            // If call api fail, use the previous call to check version
            double updateVersion = Hawk.get("updateVersion", Double.parseDouble(getString(R.string.app_version)));
            boolean isForceUpdate = Hawk.get("updateForce", false);
            if(currentVersion < updateVersion) {
                updateDialog(isForceUpdate);
            }else{
                callAPIs();
            }
        }
        goToNextPageIfNeeded();
    }

    public void callAPIs(){
        WebServiceModel.getInstance(getBaseActivity()).requestConfig();
        WebServiceModel.getInstance(getActivity()).requestGetAdvertisementList(getActivity());
        WebServiceModel.getInstance(getActivity()).requestGetAdvertisementListHome(getActivity());
        WebServiceModel.getInstance(getActivity()).requestGetCategoryTreeContributors();
    }


    CategoryTreeEvent mCategoryTreeEvent;
    // Receive API callback response
    public void onEvent(CategoryTreeEvent categoryTreeEvent){
        hideProgressDialog();
        mCategoryTreeEvent = categoryTreeEvent;

        if(categoryTreeEvent.getSuccess()){
            WebServiceModel.getInstance(getActivity()).requestGetPromotionList(getActivity());
            WebServiceModel.getInstance(getBaseActivity()).requestRecipeCatList();
            WebServiceModel.getInstance(getBaseActivity()).requestGetNewPromotion();
        } else {
            HomePresenter.prepareListData((CategoryTree) Hawk.get("categoryTree"), this);
            // show error msg
            ToastUtils.show(getActivity(), categoryTreeEvent.getMessage());
        }
        goToNextPageIfNeeded();
    }

    public void onEvent(GetAdvertisementListEvent getAdvertisementListEvent) {
        if (getAdvertisementListEvent.getSuccess()) {
            if (GlobalConstant.language.equals(GlobalConstant.LANG_ZH)) {

            } else {

            }
            if(getAdvertisementListEvent.getType().equals("ad")) {
                for(int i = 0; i < getAdvertisementListEvent.getAdvertisement().getData().size(); i++) {
                    if(getAdvertisementListEvent.getAdvertisement().getData().get(i).getType().equals("fullscreen")) {
                        networkAPICountTotal++;
                    }
                }

                for(int i = 0; i < getAdvertisementListEvent.getAdvertisement().getData().size(); i++) {
                    if(getAdvertisementListEvent.getAdvertisement().getData().get(i).getType().equals("fullscreen")) {
                        Glide.with(this).load(getAdvertisementListEvent.getAdvertisement().getData().get(i).getImage()).diskCacheStrategy(DiskCacheStrategy.SOURCE).listener(new RequestListener<String, GlideDrawable>() {
                            @Override
                            public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                                // do something
                                goToNextPageIfNeeded();
                                return true;
                            }

                            @Override
                            public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                                // do something
                                goToNextPageIfNeeded();
                                return true;
                            }
                        }).preload();
                    }
                }

                Hawk.put("advertisement", getAdvertisementListEvent.getAdvertisement());
            }else if(getAdvertisementListEvent.getType().equals("home"))
                Hawk.put("home", getAdvertisementListEvent.getAdvertisement());

        } else {
            ToastUtils.show(getActivity(), getAdvertisementListEvent.getMessage());
        }

        goToNextPageIfNeeded();
    }



    public void onEvent(PromotionListEvent promotionListEvent){
        hideProgressDialog();

        if(promotionListEvent.getSuccess()){
            Hawk.put("promotionList", promotionListEvent.getPromotionCategoryResponse());
            //HomePresenter.prepareListData(Hawk.get("categoryTree", new CategoryTree()), this);
            //HomePresenter.prepareRightList(Hawk.get("promotionList", new PromotionCategoryResponse() ) , this);
        } else {
            //Hawk.get("promotionList", new PromotionCategoryResponse());// promotionListEvent.getPromotionCategoryResponse());
            //HomePresenter.prepareListData(Hawk.get("categoryTree", new CategoryTree()), this);
            //HomePresenter.prepareRightList(Hawk.get("promotionList", new PromotionCategoryResponse() ) , this);
        }
        goToNextPageIfNeeded();
    }

    public void onEvent(RecipeListResponseEvent event) {
        if(event.getSuccess()) {
            RecipeListResponse remoteResponse = event.getRemoteResponse();
            ArrayList<RecipeListResponse.RecipeListItem> data = remoteResponse.data;
            Hawk.put("recipeListResponse", event.getRemoteResponse());
            //HomePresenter.prepareListData(Hawk.get("categoryTree", new CategoryTree()), this);
        } else {
            //HomePresenter.prepareListData(Hawk.get("categoryTree", new CategoryTree()), this);
        }
        goToNextPageIfNeeded();
    }

    public void onEvent(NewPromotionEvent newPromotionEvent) {
        //Log.i("newPromotionResponse", " " + newPromotionEvent + " " + newPromotionEvent.getSuccess());

        if(newPromotionEvent.getSuccess()) {
            ArrayList<NewPromotionResponse.PromotionResponseItem> newPromotionResponse = newPromotionEvent.getNewPromotionResponse();

            //Log.i("newPromotionResponse", " " + newPromotionResponse.size());

            Hawk.put("newPromotionResponse", newPromotionResponse);
            //HomePresenter.prepareListData(Hawk.get("categoryTree", new CategoryTree()), this);
        } else {
           // HomePresenter.prepareListData(Hawk.get("categoryTree", new CategoryTree()), this);
        }
        goToNextPageIfNeeded();
    }


    public void onEvent(final BackendConfigEvent backendConfigEvent) {
        Runnable run = new Runnable() {
            @Override
            public void run() {

                ConfigInfoResponse configInfoResponse = backendConfigEvent.getConfigInfoResponse();
                if (configInfoResponse == null) return;
                for (ConfigInfoResponse.ConfigInfo configInfo : configInfoResponse.getResults().getConfig_info()) {
//            Hawk.put(configInfo.getKey(), configInfo);
                    ConfigHelper.setConfig(getActivity(), configInfo.getKey(), configInfo);
                }
            }

            ;
            //run.run();
        };
        AsyncTask.execute(run);
        goToNextPageIfNeeded();
    }

    public void goToNextPage(){
        //if (Hawk.get("firstOpened", false)) {
        //    placeFragment(new HomeFragment());

        //    if(getBaseActivity().getAdvertisementData() != null)
        //        getBaseActivity().showFullScreenAd(getBaseActivity().getAdvertisementData().getImage());
        //} else {
        placeFragment(new TutorialFragment());
        //}
    }

    public int networkAPICountTotal = 7;
    public int apirecievedGot = 0;

    public void goToNextPageIfNeeded(){
        apirecievedGot++;

        if(apirecievedGot >= networkAPICountTotal) {
            apirecievedGot = 0;

            if (Hawk.get("firstOpened", false)) {
                placeFragment(new HomeFragment());

                if(getBaseActivity().getAdvertisementData() != null)
                    getBaseActivity().showFullScreenAd(getBaseActivity().getAdvertisementData().getImage(), getBaseActivity().getAdvertisementData().getColorCode());
            } else {
                placeFragment(new TutorialFragment());
            }
            //placeFragment(new HomeFragment());

            //if (getBaseActivity().getAdvertisementData() != null)
            //    getBaseActivity().showFullScreenAd(getBaseActivity().getAdvertisementData().getImage());
        }
    }

    public void updateDialog(boolean forceUpdate){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setCancelable(false);
        builder.setTitle(getString(R.string.app_update_title));
        builder.setMessage(getString(R.string.app_update_msg));
        builder.setPositiveButton(getString(R.string.btn_ok), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                final String appPackageName = getActivity().getPackageName();
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }
            }
        });
        if(!forceUpdate) {
            builder.setNegativeButton(getString(R.string.btn_cancel), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    callAPIs();
                }
            });
        }
        builder.create().show();
    }
}
