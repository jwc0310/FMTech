package parknshop.parknshopapp.Fragment.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 20/4/16.
 */
public class BasketLevelPromotionDialogFragment extends DialogFragment {
    @Bind(R.id.promotion_item) LinearLayout promotionItem;
    private List<CartResponse.ReceivedPromotion> promotionList = new ArrayList<>();
    private CartResponse cartResponse;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null) {
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.basket_level_dialog_fragment, null);
        ButterKnife.bind(this, view);

        if(promotionList != null && promotionList.size() > 0) {
            for(int i = 0 ; i < promotionList.size(); i++) {
                TextView itemTextView = new TextView(getActivity());

                String tempPromotionMessage = "";
                if(promotionList.get(i).getMessage().contains("#")) {
                    tempPromotionMessage = promotionList.get(i).getMessage();
                    for(int x = 0; x < cartResponse.getAllEntry().size(); x++) {
                        if(tempPromotionMessage.contains("#" + cartResponse.getAllEntry().get(x).product.getCode())) {
                            tempPromotionMessage.replace("#" + cartResponse.getAllEntry().get(x).product.getCode(), cartResponse.getAllEntry().get(x).product.getName());
                        }
                    }
                } else {
                    tempPromotionMessage = promotionList.get(i).getMessage();
                }

                itemTextView.setText(tempPromotionMessage + ", " + getString(R.string.basket_reward_amount) + promotionList.get(i).getRewardValue());
                itemTextView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                promotionItem.addView(itemTextView);
            }
        }

        builder.setView(view);
        return builder.create();
    }

    @OnClick(R.id.confirmation)
    public void dismissClick() {
        dismiss();
    }

    public void setPromotionList(List<CartResponse.ReceivedPromotion> promotionList) {
        this.promotionList = promotionList;
    }

    public void setCartResponse(CartResponse cartResponse) {
        this.cartResponse = cartResponse;
    }
}
