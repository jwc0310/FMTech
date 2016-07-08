package parknshop.parknshopapp.Fragment.Home.HomeListView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;
import parknshop.parknshopapp.API;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.FullScreenViewPagerFragment;
import parknshop.parknshopapp.Model.ImageData;
import parknshop.parknshopapp.Model.NewsInfo;
import parknshop.parknshopapp.R;
import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by chrisyu on 17/3/16.
 */
public class HomeListViewHeaderFragment extends BaseFragment {

    public List newsInfos = new ArrayList<>();

    NewsInfo newsinfo;
    ImageData imageData;
    boolean centerInside;
    public boolean enableOnClick = true;
    public int position;
    public boolean zoomable;
    public boolean isCenterInside;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.home_listview_header_fragment_layout, container, false);

        final ImageView imageview = (ImageView)view.findViewById(R.id.header_viewpager_product_image);

        //imageview.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));

        if(newsinfo != null && newsinfo.getImageUrl() != null)
            Glide.with(this).load(newsinfo.getImageUrl()).error(R.drawable.parknshop_square).listener(new RequestListener<String, GlideDrawable>() {
                @Override
                public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                    return false;
                }

                @Override
                public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                    //progressBar.setVisibility(View.GONE);

                    if(zoomable) {
                        PhotoViewAttacher mAttacher = new PhotoViewAttacher(imageview);
                    }

                    return false;
                }
            }).into(imageview);
        else if(imageData != null && imageData.getUrl() != null && imageData.getUrl().trim().length() > 0) {
            //if(imageData.getUrl() != null)
            Glide.with(this).load((imageData.getUrl().contains("http") ? "" : API.WASTSONS_DOMAIN) + imageData.getUrl()).error(R.drawable.parknshop_square).listener(new RequestListener<String, GlideDrawable>() {
                @Override
                public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                    return false;
                }

                @Override
                public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                    //progressBar.setVisibility(View.GONE);

                    if(zoomable) {
                        PhotoViewAttacher mAttacher = new PhotoViewAttacher(imageview);
                    }

                    return false;
                }
            }).into(imageview);
            //Log.i("imageData2", "imageData2["+ ( (imageData.getUrl().contains("http") ? "" : API.WASTSONS_DOMAIN) + imageData.getUrl()) +"]");
        } else {
            Glide.with(this).load(R.drawable.food_default).error(R.drawable.parknshop_square).into(imageview);
        }

//        int screenWidth = Utils.getScreenWidth(getActivity());
//
//        imageview.setLayoutParams(new RelativeLayout.LayoutParams(screenWidth, (int)(screenWidth * 0.9)));

        if(enableOnClick) {
            imageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Log.i("yoyoyoyoyoyoy", "yoyoyoyoyo");
                    FullScreenViewPagerFragment fullScreenViewPagerFragment = new FullScreenViewPagerFragment();
                    fullScreenViewPagerFragment.position = position;
                    fullScreenViewPagerFragment.newsInfos = newsInfos;
                    fullScreenViewPagerFragment.imageData = imageData;
                    getBaseActivity().placeFragmentWithBackStack(fullScreenViewPagerFragment);
                }
            });
        }

        return view;
    }

    public void setData(NewsInfo newsinfo) {
        this.newsinfo = newsinfo;
    }


    public void setData(ImageData imageData) {
        this.imageData = imageData;
    }

    @OnClick(R.id.close)
    public void close() {
        getBaseActivity().onBackPressed();
    }
    /*
    @OnClick(R.id.header_viewpager_product_image)
    public void fullScreenViewPager() {
        Log.i("yoyoyoyoyoyoy", "yoyoyoyoyo");
        HomeListViewHeaderFragment homeListViewHeaderFragment = new HomeListViewHeaderFragment();
        homeListViewHeaderFragment.newsinfo = newsinfo;
        getBaseActivity().placeFragmentWithBackStack(homeListViewHeaderFragment);
    }*/
}
