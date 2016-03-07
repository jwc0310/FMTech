package com.mpfa.empf;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;

import com.mpfa.empf.image.BitmapLoader;
import com.mpfa.empf.ui.activities.BaseActivity;
import com.mpfa.empf.ui.component.actionbar.ActionBarHelper;
import com.mpfa.empf.ui.component.drawer.DrawerAdapter;
import com.mpfa.empf.ui.fragments.LoginSignupFragment;
import com.mpfa.empf.ui.fragments.base.PageFragment;
import com.mpfa.empf.ui.fragments.base.PageFragmentHost;
import com.mpfa.empf.ui.navigationmanager.NavigationManager;
import com.mpfa.empf.utils.CommonResourceUtils;
import com.mpfa.empf.ui.component.actionbar.ActionBarController;
import com.mpfa.empf.ui.component.drawer.FMDrawerLayout;
import com.mpfa.empf.ui.component.layout.MtelToolbar;
import com.mpfa.empf.ui.fragments.FragmentConfig;

public class MainActivity extends BaseActivity implements ActionBarController, PageFragmentHost {

    public int MY_DATA_CHECK_CODE = 0;
    private Toolbar mToolbar;
    private MtelToolbar mMtelToolbar;
    private FMDrawerLayout mDrawerLayout;
    public boolean mStateSaved;
    public NavigationManager mNavigationManager;
    protected ActionBarHelper mActionBarHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(com.mpfa.empf.R.layout.activity_main);

        // check for TTS data
//        Intent checkTTSIntent = new Intent();
//        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
//        startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);


        initNavigationManager();
        initViews();
        initActionBar();
        initActionBarHelper();
        setUpFragments();
    }

    private void initNavigationManager() {
        mNavigationManager = new NavigationManager(this);
    }

    protected void initViews() {
        mDrawerLayout = (FMDrawerLayout) findViewById(com.mpfa.empf.R.id.drawer_layout);
        mToolbar = (Toolbar) findViewById(com.mpfa.empf.R.id.toolbar);
        mMtelToolbar = (MtelToolbar) findViewById(com.mpfa.empf.R.id.mtel_toolbar);
        mDrawerLayout.mNavigationManager = mNavigationManager;
        mDrawerLayout.mDrawerAdapter = new DrawerAdapter(this, mDrawerLayout, mDrawerLayout.mDrawerList, mDrawerLayout);
        mDrawerLayout.mDrawerList.setAdapter(mDrawerLayout.mDrawerAdapter);
        mDrawerLayout.refesh();
    }

    protected void initActionBar() {
//        mToolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
//        mToolbar.setTitle(CommonResourceUtils.getString(R.string.app_name));
        mMtelToolbar.setCustomTitle(CommonResourceUtils.getString(com.mpfa.empf.R.string.app_name));
        mToolbar.setTitle("");
        setSupportActionBar(mToolbar);
        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(com.mpfa.empf.R.drawable.ic_menu_white);
        ab.setDisplayHomeAsUpEnabled(true);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, com.mpfa.empf.R.string.drawer_open, com.mpfa.empf.R.string.drawer_close);
        actionBarDrawerToggle.syncState();
        mDrawerLayout.setDrawerListener(actionBarDrawerToggle);
    }

    private void initActionBarHelper() {
        mActionBarHelper = new ActionBarHelper(mNavigationManager, this, this);
    }

    private void setUpFragments() {
        mNavigationManager.showPage(FragmentConfig.FRAGMENT_LOGIN_SIGNUP, null, LoginSignupFragment.newInstance(), false, new View[0]);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent){
        int fragmentType = intent.getIntExtra("switch_fragment_type", -1);
        if(fragmentType != -1 && fragmentType == FragmentConfig.FRAGMENT_HOME){
            mNavigationManager.gotoHome();
        }
    }

    @Override
    public void onBackPressed() {
        //TODO
        if (mDrawerLayout.isDrawerOpen()) {
            mDrawerLayout.closeDrawer();
            return;
        }
//        PageFragment activePage = this.mNavigationManager.getActivePage();
//        if (((null != activePage) && (activePage.onBackPressed())) || (mNavigationManager.goBack())) {
//            return;
//        }
//        super.onBackPressed();

        PageFragment currPage = mNavigationManager.getActivePage();
        if((currPage == null) || (!currPage.onBackPressed())) {
            if(!mNavigationManager.goBack()) {
                super.onBackPressed();
            }
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        mNavigationManager.mActivity = null;
        super.onDestroy();
    }


    /***************
     * Methods implements from ActionBarController
     ****************/
    @Override
    public void disableActionBarOverlay() {

    }

    @Override
    public void disableStatusBarOverlay() {

    }

    @Override
    public void enableActionBarOverlay() {

    }

    @Override
    public void enableStatusBarOverlay() {

    }

    @Override
    public void enterActionBarSearchMode() {

    }

    @Override
    public void exitActionBarSearchMode() {

    }

    @Override
    public void exitActionBarSectionExpandedMode() {

    }

    @Override
    public Toolbar getToolbar() {
        return null;
    }

    @Override
    public void setActionBarSearchModeListener(ActionBarSearchModeListener actionBarSearchModeListener) {

    }

    @Override
    public void setHomeAsUpIndicator(int param) {

    }

    /***************
     * Methods implements from PageFragmentHost
     ****************/
    @Override
    public ActionBarController getActionBarController() {
        return null;
    }

    @Override
    public BitmapLoader getBitmapLoader() {
        return null;
    }

    @Override
    public NavigationManager getNavigationManager() {
        return null;
    }

    @Override
    public void goBack() {
        onBackPressed();
    }

    @Override
    public void overrideSearchBoxWidth(int paramInt) {

    }

    @Override
    public void showErrorDialog(String title, String message, boolean goBack) {

    }

    @Override
    public void switchToRegularActionBar() {

    }

    @Override
    public void updateActionBarTitle(String titleName) {
        mActionBarHelper.updateDefaultTitle(titleName);
    }

    @Override
    public void updateCurrentBackendId(int backend, boolean ignoreActionBarBackground) {
//        mActionBarHelper.updateCurrentBackendId(backend, ignoreActionBarBackground);
        mDrawerLayout.updateCurrentBackendId(backend);
    }
}
