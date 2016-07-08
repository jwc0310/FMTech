package parknshop.parknshopapp.Fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Home.HomeListView.HeaderViewPagerAdapter;
import parknshop.parknshopapp.Model.ImageData;
import parknshop.parknshopapp.Model.NewsInfo;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 16/5/16.
 */
public class FullScreenViewPagerFragment extends BaseFragment {
    @Bind(R.id.view_pager) ViewPager viewPager;
    public int position;

    public List newsInfos = new ArrayList<>();
    public NewsInfo newsinfo;
    public ImageData imageData;

    HeaderViewPagerAdapter headerViewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getBaseActivity()).inflate(R.layout.fullscreen_viewpager_fragment_layout, container, false);
        ButterKnife.bind(this, view);

        hideToolbar();
        headerViewPagerAdapter = new HeaderViewPagerAdapter(getSupportFragmentManager(), newsInfos);
        headerViewPagerAdapter.zoomable = true;
        headerViewPagerAdapter.enableOnClick = false;
        headerViewPagerAdapter.isCenterInside = true;

        viewPager.setAdapter(headerViewPagerAdapter);
        viewPager.setCurrentItem(position);

        view.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getBaseActivity().onBackPressed();
            }
        });

        return view;
    }
}
