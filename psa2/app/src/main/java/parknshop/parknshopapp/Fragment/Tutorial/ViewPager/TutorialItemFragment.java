package parknshop.parknshopapp.Fragment.Tutorial.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.lang.reflect.Field;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 4/3/16.
 */
public class TutorialItemFragment extends BaseFragment {

    private static final String PAGE = "page";
    private int mPage;

    @Bind(R.id.dot_1) View dot1;
    @Bind(R.id.dot_2) View dot2;
    @Bind(R.id.dot_3) View dot3;
    @Bind(R.id.dot_4) View dot4;
    @Bind(R.id.tutorial_image) ImageView tutorialImage;

    @Bind(R.id.tutorial_title) TextView tutorialTitle;
    @Bind(R.id.tutorial_text) TextView tutorialText;

    int index;

    public static TutorialItemFragment newInstance(int index) {
        TutorialItemFragment frag = new TutorialItemFragment();
        Bundle b = new Bundle();
        b.putInt(PAGE, index);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.tutorial_fragment_layout, container, false);
        ButterKnife.bind(this, view);

        if(getArguments() != null) {
            index = getArguments().getInt(PAGE);
        }

        String drawablePath = "tutorial" + (index + 1);

        //R.string.class
        try {
            //Glide.with(context).load(getId(drawablePath, R.drawable.class)).into(numberImage);
            Glide.with(this).load(getId(drawablePath, R.drawable.class)).into(tutorialImage);
        } catch (Exception e) {
            //Log.i("exception" , "exception" + e.getMessage());
        }

        //R.string.class
        String titlePath = "tutorial_title_" + (index + 1);
        try {
            tutorialTitle.setText(getId(titlePath, R.string.class));
        } catch (Exception e) {
            //Log.i("exception" , "exception" + e.getMessage());
        }

        //R.string.class
        String descPath = "tutorial_desc_" + (index + 1);
        try {
            tutorialText.setText(getId(descPath, R.string.class));
        } catch (Exception e) {
            //Log.i("exception" , "exception" + e.getMessage());
        }

        //Glide.with(this).load(R.drawable.tutorial_fragment_tutorial_1).into(tutorialImage);

        return view;
    }



    public int getId(String resourceName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(resourceName);
            return idField.getInt(idField);
        } catch (Exception e) {
            //Log.i("","No resource ID found for: ");
        }
        return 0;
    }
}
