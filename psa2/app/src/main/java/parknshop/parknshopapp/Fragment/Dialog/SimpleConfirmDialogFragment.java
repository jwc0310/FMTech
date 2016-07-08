package parknshop.parknshopapp.Fragment.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.View.CheckoutButton;

/**
 * Created by chrisyu on 29/4/16.
 */
public class SimpleConfirmDialogFragment extends DialogFragment {
    public Runnable runnable;
    public String title;
    public String message;
    public String number;
    @Bind(R.id.title) TextView titleTextView;
    @Bind(R.id.message) TextView messageTextView;
    @Bind(R.id.dismiss) CheckoutButton cancelButton;

    public boolean dial = true;
    public boolean showCancel = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null) {
        }
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.simple_confirm_dialog_fragment, null);
        ButterKnife.bind(this, view);

        if(title != null) {
            titleTextView.setText(title);
            titleTextView.setVisibility(View.VISIBLE);
        } else {
            titleTextView.setVisibility(View.GONE);
        }

        if(showCancel) {
            cancelButton.setVisibility(View.VISIBLE);
        } else {
            cancelButton.setVisibility(View.GONE);
        }

        messageTextView.setText(message);

        builder.setView(view);
        return builder.create();
    }

    @Override
    public void onDismiss(final DialogInterface dialog) {
        //Fragment dialog had been dismissed
        super.onDismiss(dialog);
    }


    @OnClick(R.id.dismiss)
    public void dismissClick() {
        dismiss();
    }

    @OnClick(R.id.confirm)
    public void confirmation() {
        if(dial) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + number));
            startActivity(intent);
        } else {
            dismiss();
        }
    }
}
