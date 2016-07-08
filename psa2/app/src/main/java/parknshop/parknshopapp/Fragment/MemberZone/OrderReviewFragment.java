package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Adapter.OrderReviewListAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.OnlineRecordDetail;
import parknshop.parknshopapp.Model.ProductRatingRequest;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class OrderReviewFragment extends BaseFragment {

    @Bind(R.id.list)
    ListView list;

    OrderReviewListAdapter orderReviewListAdapter;

    ArrayList<OnlineRecordDetail.Order> entries = new ArrayList<>();
    String orderNo;

    String[] commentCode = new String[] {"Value for Money", "Good Quality/Texture", "Nice Scent/Taste", "Quick visible results", "Ideal for Gift", "Ease of use"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_product_review, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("product-reviews");

        ButterKnife.bind(this, view);

        entries = (ArrayList<OnlineRecordDetail.Order>) getArguments().getSerializable("products");
        orderNo = getArguments().getString("orderNo");

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.product_review));
        disableSecondRightButton();
        disableCartButton();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        uploadLayout();
    }

    public void uploadLayout(){
            orderReviewListAdapter = new OrderReviewListAdapter(entries, getActivity());
            list.setAdapter(orderReviewListAdapter);
    }

    @OnClick(R.id.btnContinue)
    public void btnContinue(){

        ProductRatingRequest productRatingRequest = new ProductRatingRequest();
        ArrayList<ProductRatingRequest.IwaOrderRatingForm.IwaProductRatings> iwaProductRatings = new ArrayList<>();
        for(int i = 0; i < entries.size(); i++){
            ProductRatingRequest.IwaOrderRatingForm.IwaProductRatings iwaProductRating = new ProductRatingRequest.IwaOrderRatingForm.IwaProductRatings();
            String comment = null;
            for (Map.Entry<String, boolean[]> entry : orderReviewListAdapter.getCommentsSelected().entrySet()) {
                if(entry.getKey().equals(entries.get(i).getProduct().getCode())){
                    for(int j = 0; j < entry.getValue().length; j++){
                        if(comment == null){
                            comment = commentCode[j];
                        }else{
                            comment = comment + ";" + (commentCode[j]);
                        }
                    }
                }
            }
            iwaProductRating.setProductCode(entries.get(i).getProduct().getCode());
            iwaProductRating.setComment(comment);
            iwaProductRating.setRating(orderReviewListAdapter.getRatings().get(i) + "");
            iwaProductRatings.add(iwaProductRating);
        }
        ProductRatingRequest.IwaOrderRatingForm iwaOrderRatingForm = new ProductRatingRequest.IwaOrderRatingForm();
        iwaOrderRatingForm.setIwaProductRatings(iwaProductRatings);
        productRatingRequest.setIwaOrderRatingForm(iwaOrderRatingForm);

        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestGetProductRating(getActivity(), orderNo, productRatingRequest);
    }

    public void onEvent(EmptyJsonEvent emptyJsonEvent) {
        hideProgressDialog();
        if (emptyJsonEvent.getType().equals("productRating")) {
            if(emptyJsonEvent.getSuccess()){
                ToastUtils.show(getActivity(), getString(R.string.order_details_rate_success));
                getActivity().onBackPressed();
            }else{
                ToastUtils.show(getActivity(), emptyJsonEvent.getMessage());
            }
        }
    }
}
