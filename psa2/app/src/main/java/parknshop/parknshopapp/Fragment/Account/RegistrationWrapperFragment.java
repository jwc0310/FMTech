package parknshop.parknshopapp.Fragment.Account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.Bind;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 31/3/16.
 */
public class RegistrationWrapperFragment extends BaseFragment {

    //status
    //0 - not finished
    //1 - finish
    //2 - current
    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;

    @Bind(R.id.checkout_dot_1) LinearLayout dot1;
    @Bind(R.id.checkout_dot_2) LinearLayout dot2;
    @Bind(R.id.checkout_dot_3) LinearLayout dot3;
    @Bind(R.id.checkout_dot_4) LinearLayout dot4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        //View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_fragment_layout, container, false);
        //ButterKnife.bind(this, view);
        showToolbar();
        showMenuButton();
        enableSecondRightButton();
        setToolbarTitle(getString(R.string.register_page_title));

//        new RegistrationDotViewHolder(dot1, 1, FINISH, getBaseActivity(), 0);
//        new RegistrationDotViewHolder(dot2, 2, CURRENT, getBaseActivity(), 0);
//        new RegistrationDotViewHolder(dot3, 3, NOT_FINISH, getBaseActivity(), 0);
//        new RegistrationDotViewHolder(dot4, 4, NOT_FINISH, getBaseActivity(), 0);

        return null;
    }
}
