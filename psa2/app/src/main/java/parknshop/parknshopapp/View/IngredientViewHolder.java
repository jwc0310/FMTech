package parknshop.parknshopapp.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 29/3/16.
 */
public class IngredientViewHolder {
    @Bind(R.id.ingredient_item) TextView ingredientItem;
    @Bind(R.id.ingredient_weight) TextView ingredientWeight;

    LinearLayout view;
    public IngredientViewHolder(Context context) {
        init(context);
    }

    public void init(Context context) {
        view = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.ingredient_layout, null);
        view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        bind();
    }

    public void bind() {
        ButterKnife.bind(this, view);
    }

    public LinearLayout getView() {
        return view;
    }

    public void setIngredientItem(String s) {
        ingredientItem.setText(s);
    }

    public void setIngredientWeight(String s) {
        ingredientWeight.setText(s);
    }
}
