package parknshop.parknshopapp.Fragment.Product.ProductPromotion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 30/3/16.
 */
public class ProductPromotionFragment extends BaseFragment{
    public @Bind(R.id.listview) ListView listView;
    public List<String> promotionList = new ArrayList<String>();

    View view;

    public void onCreate(Bundle savedBundle) {
        super.onCreate(savedBundle);
        view = getLayoutInflater(savedBundle).inflate(R.layout.product_comment_fragment_layout, null);
        ButterKnife.bind(this, view);

        setToolbarTitle(getString(R.string.promotion_list));
        listView.setAdapter(new ProductPromotionAdapter(promotionList, getBaseActivity()));
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return view;
    }
}
