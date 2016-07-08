package parknshop.parknshopapp.Fragment.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 15/6/16.
 */
public class LoadingDialog extends DialogFragment {
    //loading_spinner
    @Bind(R.id.loading_spinner) ImageView loadingSpinnerImageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.hamper_notice_dialog_fragment, null);
        ButterKnife.bind(this, view);

        Glide.with(getActivity()).load(R.drawable.ios_spinner).into(loadingSpinnerImageView);

        builder.setView(view);
        return builder.create();
    }
}
