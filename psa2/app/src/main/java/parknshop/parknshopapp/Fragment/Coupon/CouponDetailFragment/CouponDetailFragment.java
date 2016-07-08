package parknshop.parknshopapp.Fragment.Coupon.CouponDetailFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.R;

/**
 * Created by hp on 22/4/2016.
 */
public class CouponDetailFragment extends BaseFragment {
    @Bind(R.id.imgIcon)
    ImageView imgIcon;
    @Bind(R.id.txtValidUntil)
    TextView txtValidUntil;
    @Bind(R.id.txtDesc)
    TextView txtDesc;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.coupon_fragment_detail, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("m-coupon-details");

        ButterKnife.bind(this, view);
        showToolbar();
        showLogo();
        showBackButton();
        showShoppingCartButton();
        disableSecondRightButton();

        String title = getArguments().getString("title");
        String image = getArguments().getString("image");
        String date = getArguments().getString("date");
        String desc = getArguments().getString("desc");
        setToolbarTitle(title);

        Glide.with(getActivity()).load(image).into(imgIcon);

        txtValidUntil.setText(date);

        txtDesc.setText(desc);

        return view;
    }


}
