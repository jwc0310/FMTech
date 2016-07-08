package parknshop.parknshopapp.Fragment.Product.ProductDetailWithPromotion;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Product.ProductDetail.ProductDetailEvent;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListAdapter;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by kwongyuenpan on 25/4/16.
 */
public class ProductDetailFragmentWithPromotion extends BaseFragment {
    RecyclerView productRecyclerView;
    ProductListAdapter redemptionHeader;// = new ProductListAdapter();
    Product product;
    int productId;

    //pnsRedemptionProductDatas

    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        productId = getArguments().getInt("productId");

        view = getActivity().getLayoutInflater().inflate(R.layout.product_detail_fragment_layout, null);

        showBackButton();
        showShoppingCartButton();
        ButterKnife.bind(this, view);

        redemptionHeader = new ProductListAdapter(this);
        productRecyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        productRecyclerView.setLayoutManager(staggeredGridLayoutManager);

        WebServiceModel.getInstance(getActivity()).requestGetProduct(String.valueOf(productId), this.hashCode());
    }

    public void onEvent(ProductDetailEvent productDetailEvent) {
        //Log.i("pnsredemption", "pnsredemption" + " " + productDetailEvent.getProduct().getPnsRedemptionProductDatas().size() + " " + productDetailEvent.getSuccess());

        if(productDetailEvent.getSuccess() && this.hashCode() == productDetailEvent.getSuccessCode()) {
            redemptionHeader.productList.addAll(productDetailEvent.getProduct().getPnsRedemptionProductDatas());
            redemptionHeader.hasHeader = false;
            redemptionHeader.hasFooter = false;
            productRecyclerView.setAdapter(redemptionHeader);
        }

    }
}