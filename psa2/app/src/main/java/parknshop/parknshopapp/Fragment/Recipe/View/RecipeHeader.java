package parknshop.parknshopapp.Fragment.Recipe.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by hp on 22/4/2016.
 */
public class RecipeHeader extends LinearLayout {
    @Bind(R.id.icon) ImageView icon;
    @Bind(R.id.title) TextView titleTextView;

    public RecipeHeader(Context context) {
        this(context, null);
    }

    public RecipeHeader(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public RecipeHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.recipe_header, this);
        ButterKnife.bind(this);
    }
}
