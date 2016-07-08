package parknshop.parknshopapp.Base;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 2/2/16.
 */
public class BaseDialogFragment extends DialogFragment {
    @Bind(R.id.title) TextView title;
    @Bind(R.id.message) TextView message;
    public @Bind(R.id.retry) Button retry;

    private String titleString, messageString;
    public boolean backPress;
    public boolean alignParentLeft;
    public boolean showRetryButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null) {
            titleString = getArguments().getString("title");
            messageString = getArguments().getString("message");
        }
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_fragment, null);
        ButterKnife.bind(this, view);

        title.setText(titleString);
        message.setText(messageString);

        if(alignParentLeft)
            message.setGravity(Gravity.LEFT);

        if(showRetryButton)
            retry.setVisibility(View.VISIBLE);

        builder.setView(view);
        return builder.create();
    }

    @OnClick (R.id.ok_btn)
    public void onPressOKButton() {
        this.dismiss();
    }

    @OnClick (R.id.retry)
    public void onPressRetryButton() {
        dismiss();
    }

    @Override
    public void onDismiss(final DialogInterface dialog) {
        //Fragment dialog had been dismissed
        super.onDismiss(dialog);
        if(backPress)
            getActivity().onBackPressed();
    }
}