package parknshop.parknshopapp.Fragment.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Model.CartResponse;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CheckoutDialogFragmentOnConfirmClickedEvent;
import parknshop.parknshopapp.View.ShoppingCartProductItem;

/**
 * Created by chrisyu on 7/4/16.
 */
public class HamperNoticeDialogFragment extends DialogFragment{
    @Bind(R.id.reminder_cart) LinearLayout reminderCart;
    public List<CartResponse.Entry> reminderCartList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null) {
        }
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.hamper_notice_dialog_fragment, null);
        ButterKnife.bind(this, view);

        for(int i = 0; i < reminderCartList.size(); i++) {
            ShoppingCartProductItem item = new ShoppingCartProductItem(getActivity());
            item.setEntry(reminderCartList.get(i));
            reminderCart.addView(item);
        }

        builder.setView(view);
        return builder.create();
    }

    @OnClick(R.id.confirmation)
    public void confirmation() {
        MyApplication.getInstance().mBus.post(new CheckoutDialogFragmentOnConfirmClickedEvent());
        //goTocheckout
        dismiss();
    }

    @OnClick(R.id.dismiss)
    public void dismissClick() {
        dismiss();
    }
}
