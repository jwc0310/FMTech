package com.mpfa.empf.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.mpfa.empf.ui.fragments.base.PageFragment;

/**
 * ==================================================================
 * Copyright (C) 2015 Mtelnet All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2015/12/29 13:42
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2015/12/29 13:42  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class TutorialsFragment extends PageFragment {

    private String mBreadcrumb;

    public static TutorialsFragment newInstance(){
        TutorialsFragment newsFragment = new TutorialsFragment();
        return newsFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBreadcrumb = mContext.getString(com.mpfa.empf.R.string.fragment_title_tutorials);
        rebindActionBar();
    }

    @Override
    public void rebindActionBar() {
        this.mPageFragmentHost.updateActionBarTitle(mBreadcrumb);
        mPageFragmentHost.updateCurrentBackendId(FragmentConfig.FRAGMENT_TUTORIALS -1, true);
        mPageFragmentHost.switchToRegularActionBar();
    }

    @Override
    public int getLayoutRes() {
        return com.mpfa.empf.R.layout.fragment_tutorials;
    }

    @Override
    public void rebindViews() {

    }

    @Override
    public void requestData() {

    }
}
