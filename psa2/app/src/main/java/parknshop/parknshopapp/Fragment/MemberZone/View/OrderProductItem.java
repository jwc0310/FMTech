package parknshop.parknshopapp.Fragment.MemberZone.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.API;
import parknshop.parknshopapp.EventUpdate.OrderProductReviewClickEvent;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.OnlineRecordDetail;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.LogUtil;

/**
 * Created by Gigi Wong on 2016年04月20日.
 */
public class OrderProductItem extends LinearLayout {
    @Bind(R.id.image) ImageView productImage;
    @Bind (R.id.title) TextView productTitle;
    @Bind (R.id.item_price) TextView itemPrice;
    @Bind (R.id.small_desc) TextView smallDescription;
    @Bind (R.id.weight) TextView productWeight;
    @Bind (R.id.price) TextView productPrice;
    @Bind(R.id.add_review) LinearLayout add_review;

    Context context;

    OnlineRecordDetail.Order mOrder;

    public OrderProductItem(Context context) {
        this(context, null);
    }

    public OrderProductItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OrderProductItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;

        try {
            LayoutInflater.from(context).inflate(R.layout.item_order_product, this);
            ButterKnife.bind(this);
        } catch (Exception e) {
            //Log.i("exception1234", "exception1234" + e.getMessage());
        }
    }

    public void setProduct(OnlineRecordDetail.Order order) {
        mOrder = order;

        add_review.setVisibility(GONE);
//        if(order.getProduct().getCanRateProductFlag()){
//            add_review.setVisibility(VISIBLE);
//        }else{
//            add_review.setVisibility(INVISIBLE);
//        }

        productTitle.setText(order.getProduct().getName());
        itemPrice.setText(order.getProduct().getPrice());
        smallDescription.setText(order.getProduct().getDescription());
        productWeight.setText(order.getProduct().getIgcContentSizeUnit());
        productPrice.setText(order.getProduct().getPrice()+" x " + order.getQuantity());
        LogUtil.info("exception1234", "getImageUrl::" + GlobalConstant.WATSONS_API_URL + order.getProduct().getImageUrl());
        Glide.with(context).load(API.WASTSONS_DOMAIN + order.getProduct().getImageUrl()).into(productImage);
    }

    @OnClick(R.id.add_review)
    public void add_review(){
        OrderProductReviewClickEvent event = new OrderProductReviewClickEvent();
        event.setOrder(mOrder);
        MyApplication.getInstance().mBus.post(event);
    }
}
