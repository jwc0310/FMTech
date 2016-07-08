package parknshop.parknshopapp.Fragment.Product.ProductDetailRedem;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.Product.ProductDetail.ProductDetailEvent;
import parknshop.parknshopapp.Fragment.Product.ProductList.ProductListAdapter;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.GetProductsByTextSearchResponseEvent;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by chrisyu on 20/4/16.
 */

public class ProductDetailRedemFragment extends BaseFragment {
    @Bind(R.id.product_detail_redemption) RecyclerView productRecyclerView;
    ProductListAdapter productDetailAdapter;// = new ProductListAdapter();
    Product product;
    int productId;

    //pnsRedemptionProductDatas

    public static ProductDetailRedemFragment newPDInstance(int productId) {
        ProductDetailRedemFragment pfwd = new ProductDetailRedemFragment();

        Bundle args = new Bundle();
        args.putInt("productId", productId);
        pfwd.setArguments(args);
        //Log.i("yosadad", "yosadad");
        return pfwd;
    }

    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        productId = getArguments().getInt("productId");

        view = getActivity().getLayoutInflater().inflate(R.layout.product_detail_fragment_layout, null);

        showBackButton();
        showShoppingCartButton();
        ButterKnife.bind(this, view);

        productDetailAdapter = new ProductListAdapter(this);
        productRecyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        productRecyclerView.setLayoutManager(staggeredGridLayoutManager);

        //Log.i("event", "eventasdsad");

    }

    public void onResume() {
        super.onResume();
        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestGetProduct(String.valueOf(productId), this.hashCode());
        WebServiceModel.getInstance(getActivity()).requestProductList("010100", 0 + "", "", "Cat", this.hashCode(), null);
    }

    public void onEvent(GetProductsByTextSearchResponseEvent event) {
        hideProgressDialog();
        //Log.i("event", "eventasdsad" + event.getSuccess() + event.getTextSearchResponse().getProducts().size());
        try {
            if (event.getSuccess()) {
                List<Product> productList = event.getTextSearchResponse().getProducts();//new ArrayList<>();

                productDetailAdapter.productList.addAll(productList/*productDetailEvent.getProduct().getPnsRedemptionProductDatas()*/);
                productDetailAdapter.hasHeader = true;
                productDetailAdapter.hasFooter = true;
                productRecyclerView.setAdapter(productDetailAdapter);
            }
        } catch(Exception e) {
           //Log.i("exception", "exception " + e.getMessage());
        }
    }

    //https://infpnshkuat.aswatson.net/rest/v1/hybris/products/010100?type=Cat&query=:&currentPage=0
    public void onEvent(ProductDetailEvent productDetailEvent) {
        /*
        List<Product> productList = new ArrayList<>();
        productList.add(new Product());
        productList.add(new Product());
        productList.add(new Product());
        productList.add(new Product());
        try {
            if (productDetailEvent.getSuccess()) {
                productDetailAdapter.productList.addAll(productListproductDetailEvent.getProduct().getPnsRedemptionProductDatas());
                productDetailAdapter.hasHeader = true;
                productDetailAdapter.hasFooter = true;
                productRecyclerView.setAdapter(productDetailAdapter);
            }
        } catch(Exception e) {
            Log.i("exception", "exception " + e.getMessage());
        }*/
    }
}
