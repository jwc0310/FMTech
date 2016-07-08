package parknshop.parknshopapp.Fragment.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CheckoutDialogFragmentOnConfirmClickedEvent;

/**
 * Created by chrisyu on 7/4/16.
 */
public class AlcoholAdultOnlyDialogFragment extends DialogFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null) {
        }
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.alcohol_adult_only_dialog_fragment, null);
        ButterKnife.bind(this, view);

        builder.setView(view);
        return builder.create();
    }

    @OnClick(R.id.confirmation)
    public void confirmation() {
        MyApplication.getInstance().mBus.post(new CheckoutDialogFragmentOnConfirmClickedEvent());
        dismiss();
    }

    @OnClick(R.id.dismiss)
    public void dismissClick() {
        dismiss();
    }
}
