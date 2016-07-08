package parknshop.parknshopapp.Fragment.Settings;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import parknshop.parknshopapp.Adapter.StringPickerAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.LanguageUpdateEvent;
import parknshop.parknshopapp.EventUpdate.StringPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.FCM.MyFirebaseMessagingService;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Fragment.Settings.View.SettingItemView;
import parknshop.parknshopapp.Fragment.Tutorial.TutorialFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.Model.PromotionCategoryResponse;
import parknshop.parknshopapp.Model.TNCResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CartEvent;
import parknshop.parknshopapp.Rest.event.CategoryTreeEvent;
import parknshop.parknshopapp.Rest.event.PromotionListEvent;
import parknshop.parknshopapp.Rest.event.TNCResponseEvent;
import parknshop.parknshopapp.TokenHelper;
import parknshop.parknshopapp.Utils.LanguageUtil;
import parknshop.parknshopapp.Utils.NotificationsUtils;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.Utils.Utils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 27/4/16.
 */
public class SettingFragment extends BaseFragment {
    View view;
    @Bind(R.id.scPushOnOff)
    SwitchCompat scPushOnOff;
    @Bind(R.id.setting_item_version) SettingItemView settingItemVersionView;
    @Bind(R.id.language) SettingItemView settingItemLanguageView;
    @Bind(R.id.rate) SettingItemView settingItemRateView;
    @Bind(R.id.tutorial) SettingItemView settingItemTutorialView;
    @Bind(R.id.llAddView) LinearLayout llAddView;
    @Bind (R.id.setting_item_title) TextView notificationTextView;
    TNCResponseEvent mTNCResponseEvent;

    public void onCreate(Bundle onsavedBundle) {
        super.onCreate(onsavedBundle);
        view = getLayoutInflater(onsavedBundle).inflate(R.layout.setting_fragment, null);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        GATrackerHelper.getInstance(getActivity()).setGATracker("settings");
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.language)
    public void setLanguage(){

        GATrackerHelper.getInstance(getActivity()).setGATracker("settings/language");

        StringPickerAdapter stringPickerAdapter = new StringPickerAdapter(getActivity(), getResources().getStringArray(R.array.setting_language), this.hashCode());
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setAdapter(stringPickerAdapter, stringPickerAdapter);
            builder.show();
    }

    public void updateLayout(){
        String versionName = parknshop.parknshopapp.BuildConfig.VERSION_NAME;

        showMenuButton();
        setToolbarTitle(getString(R.string.home_activity_sliding_menu_settings));
        disableCartButton();

        if(Hawk.get(MyFirebaseMessagingService.GCM_ON_OFF, true)){
            scPushOnOff.setChecked(true);
        }

        settingItemTutorialView.setTitle(getString(R.string.home_activity_sliding_menu_tutorial));
        settingItemVersionView.setTitle(getString(R.string.setting_version));
        settingItemVersionView.setMinorTitle(versionName);//getString(R.string.app_version));
        settingItemLanguageView.setTitle(getString(R.string.setting_language));
        settingItemLanguageView.setDataArray(getResources().getStringArray(R.array.setting_language));
        settingItemRateView.setTitle(getString(R.string.setting_rate_in_app_store));

        if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
            settingItemLanguageView.setMinorTitle(getResources().getStringArray(R.array.setting_language)[1]);
        }else{
            settingItemLanguageView.setMinorTitle(getResources().getStringArray(R.array.setting_language)[0]);
        }


        if(mTNCResponseEvent == null){
            showProgressDialog();
            WebServiceModel.getInstance(getActivity()).requestGetTNC();
        }else{
            onEvent(mTNCResponseEvent);
        }
    }

    public void initAddView(TNCResponse tNCResponse){
        if(llAddView.getChildCount() > 0)
            llAddView.removeAllViews();

        for(int i = 0; i < tNCResponse.getData().size(); i++){

            SettingItemView settingItemView = new SettingItemView(getActivity());
            settingItemView.setTitle(tNCResponse.getData().get(i).getTitle());

            final String title = tNCResponse.getData().get(i).getTitle();
            final String tnc = tNCResponse.getData().get(i).getContent();

            settingItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    SettingTNCFragment fragment = new SettingTNCFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("title", title);
                    bundle.putString("tnc", tnc);
                    fragment.setArguments(bundle);
                    placeFragmentWithBackStack(fragment);
                }
            });
            llAddView.addView(settingItemView);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        updateLayout();

        if(!NotificationsUtils.isNotificationEnabled()){
            scPushOnOff.setChecked(false);
        }else{
            if(Hawk.get(MyFirebaseMessagingService.GCM_ON_OFF, true)){
                scPushOnOff.setChecked(true);
            }
        }
    }

    @OnCheckedChanged(R.id.scPushOnOff)
    public void scPushOnOff(){
//        if (checkPlayServices()) {
            if(scPushOnOff.isChecked()) {
                // Start IntentService to register this application with GCM.

                if(!NotificationsUtils.isNotificationEnabled()){
                    goToSettingPageDialog();
                    scPushOnOff.setChecked(false);
                    return;
                }

                Hawk.put(MyFirebaseMessagingService.GCM_ON_OFF, true);
            }else{
                Hawk.put(MyFirebaseMessagingService.GCM_ON_OFF, false);
            }
//        }
    }

    @OnClick(R.id.rate)
    public void btnRate(){
        final String appPackageName = getActivity().getPackageName(); // getPackageName() from Context or Activity object
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }

    @OnClick(R.id.tutorial)
    public void btnTutorial(){
        TutorialFragment fragment = new TutorialFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("closePage", true);
        fragment.setArguments(bundle);
        placeFragmentWithBackStack(fragment);
    }

    public void onEvent(TNCResponseEvent mTNCResponseEvent) {
        hideProgressDialog();
        if(mTNCResponseEvent.getSuccess()){
            this.mTNCResponseEvent = mTNCResponseEvent;
            initAddView(mTNCResponseEvent.getTNCResponse());
        }else{
            ToastUtils.show(getActivity(), mTNCResponseEvent.getMessage());
        }
    }

    public void onEvent(StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent) {
        if(stringPickerAdapterOnItemClickEvent.getSuccessCode() == this.hashCode()) {
            String areaSelected = stringPickerAdapterOnItemClickEvent.getText();
            settingItemLanguageView.setMinorTitle(areaSelected);

            if(stringPickerAdapterOnItemClickEvent.getPosition() == 0){ // English
                LanguageUtil.initLanguage(MyApplication.getInstance(),
                        GlobalConstant.LANG_EN);
            }else{ // Chinese
                LanguageUtil.initLanguage(MyApplication.getInstance(),
                        GlobalConstant.LANG_ZH);
            }

            notificationTextView.setText(getBaseActivity().getResources().getString(R.string.setting_notifications));
            getBaseActivity().slidingMenu = null;
            getBaseActivity().reloadLinearLayoutManager = true;

            //getBaseActivity().generatingSlidingMenu(getBaseActivity());
            //HomePresenter.initShoppingCart(HomePresenter.getRemoteShoppingCart(), getBaseActivity());
        }
    }

    public void onEvent(LanguageUpdateEvent languageUpdateEvent) {

        // Register a new push to server
        WebServiceModel.getInstance(getActivity()).requestRegisterPush(TokenHelper.getToken());

        updateLayout();
        WebServiceModel.getInstance(getActivity()).requestGetCategoryTreeContributors();
        WebServiceModel.getInstance(getActivity()).requestGetCart(getActivity());
        getBaseActivity().swipePosition = -1;
    }

    // Update Category Tree
    CategoryTreeEvent mCategoryTreeEvent;
    public void onEvent(CategoryTreeEvent categoryTreeEvent){
        hideProgressDialog();
        mCategoryTreeEvent = categoryTreeEvent;

        if(categoryTreeEvent.getSuccess()){
            WebServiceModel.getInstance(getActivity()).requestGetPromotionList(getActivity());
        } else {
            HomePresenter.prepareListData((CategoryTree) Hawk.get("categoryTree"), this);
            // show error msg
            ToastUtils.show(getActivity(), categoryTreeEvent.getMessage());
            getInboxMsg();
        }
    }

    // Update Promotion List
    public void onEvent(PromotionListEvent promotionListEvent){
        hideProgressDialog();
        if(promotionListEvent.getSuccess()){
            Hawk.put("promotionList", promotionListEvent.getPromotionCategoryResponse());
            HomePresenter.prepareListData(mCategoryTreeEvent.getCategoryTree(), this);
            HomePresenter.prepareRightList(Hawk.get("promotionList", new PromotionCategoryResponse() ) , this);
        } else {
            Hawk.get("promotionList", new PromotionCategoryResponse());// promotionListEvent.getPromotionCategoryResponse());
            HomePresenter.prepareListData(mCategoryTreeEvent.getCategoryTree(), this);
            HomePresenter.prepareRightList(Hawk.get("promotionList", new PromotionCategoryResponse() ) , this);
        }
        getInboxMsg();
    }

    // Update Cart
    public void onEvent(CartEvent cartEvent) {
        super.onEvent(cartEvent);
    }

    public void goToSettingPageDialog() {
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.dialog_quit, null);
        final Dialog mDialog = new Dialog(getActivity());

        TextView txtTitle = (TextView) layout.findViewById(R.id.txtTitle);
        TextView btnCancel = (TextView) layout.findViewById(R.id.btnCancel);
        TextView btnOK = (TextView) layout.findViewById(R.id.btnOK);

        txtTitle.setText(getString(R.string.setting_notifications_go_to_setting));

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
                Intent intent = new Intent();
                intent.setClassName("com.android.settings", "com.android.settings.Settings$AppNotificationSettingsActivity");
                intent.putExtra("app_package", getActivity().getPackageName());
                intent.putExtra("app_uid", getActivity().getApplicationInfo().uid);
                startActivity(intent);
            }
        });

        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(layout);
        mDialog.show();
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        Window window = mDialog.getWindow();
        lp.copyFrom(window.getAttributes());
        lp.width = Utils.dpToPx(300, getActivity());
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        window.setAttributes(lp);

    }
}
