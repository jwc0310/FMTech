package com.fmtech.rxjavaretrofit;

import android.support.design.widget.TabLayout;
import android.app.Fragment;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.fmtech.rxjavaretrofit.modules.cache.CacheFragment;
import com.fmtech.rxjavaretrofit.modules.elementary.ElementaryFragment;
import com.fmtech.rxjavaretrofit.modules.map.MapFragment;
import com.fmtech.rxjavaretrofit.modules.token.TokenFragment;
import com.fmtech.rxjavaretrofit.modules.token_advanced.TokenAdvancedFragment;
import com.fmtech.rxjavaretrofit.modules.zip.ZipFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private int[] mTitles = {R.string.title_elementary, R.string.title_map, R.string.title_zip,
            R.string.title_token, R.string.title_token_advanced, R.string.title_cache};

    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @Bind(R.id.tabs)
    TabLayout mTabs;

    @Bind(R.id.viewpager)
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);

        mViewPager.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new ElementaryFragment();
                    case 1:
                        return new MapFragment();
                    case 2:
                        return new ZipFragment();
                    case 3:
                        return new TokenFragment();
                    case 4:
                        return new TokenAdvancedFragment();
                    case 5:
                        return new CacheFragment();
                    default:
                        return new ElementaryFragment();
                }
            }

            @Override
            public int getCount() {
                return 6;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return getString(mTitles[position]);
            }
        });

        mTabs.setupWithViewPager(mViewPager);
    }
}
