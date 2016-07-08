package parknshop.parknshopapp.Fragment.Recipe.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.orhanobut.hawk.Hawk;

import java.util.Map;
import java.util.TreeMap;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 3/5/16.
 */
public class RecipeBookmarkButton extends LinearLayout {
    @Bind(R.id.dimmed) ImageView dimmed;
    @Bind (R.id.un_dimmed) ImageView unDimmed;
    @Bind (R.id.recipe_button_root) View root;

    int recipeId = -1;
    boolean isbookmarked = false;

    public RecipeBookmarkButton(Context context) {
        this(context, null);
    }

    public RecipeBookmarkButton(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public RecipeBookmarkButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.recipe_bookmark_button, this);
        ButterKnife.bind(this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.RecipeBookmarkButton);
        isbookmarked = a.getBoolean(R.styleable.RecipeBookmarkButton_is_bookmarked, false);
        setBookmarked(isbookmarked);
    }

    public void setBookmarked(boolean isbookmarked) {
        if(isbookmarked) {
            dimmed.setVisibility(View.VISIBLE);
            unDimmed.setVisibility(View.GONE);
        } else {
            dimmed.setVisibility(View.GONE);
            unDimmed.setVisibility(View.VISIBLE);
        }
    }

    public void setItemId(int recipeId) {
        this.recipeId = recipeId;
        if(isIsbookmarked())
            setBookmarked(true);
        else
            setBookmarked(false);

    }

    @OnClick (R.id.recipe_button_root)
    public void rootOnClick() {
        //Log.i("yoyoyo", "yoyoyo " + isbookmarked + " " + recipeId);
        if(isbookmarked) {
            return;
        } else if (recipeId >= 0) {
            if(!isIsbookmarked()) {
                setBookmarkedData(recipeId);
                setBookmarked(true);
            } else {
                unsetBookmarkedData(recipeId);
                setBookmarked(false);
            }
        }
    }

    public boolean isIsbookmarked() {
        Map<Integer, Boolean> dataList = Hawk.get("recipeBookmarkMap", new TreeMap<Integer, Boolean>());
        Boolean isBookmarked = dataList.get(recipeId);
        if(isBookmarked != null && isBookmarked == true)
            return true;

        return false;
    }

    public void setBookmarkedData(int recipeId) {
        Map<Integer, Boolean> dataList = Hawk.get("recipeBookmarkMap", new TreeMap<Integer, Boolean>());
        dataList.put(recipeId, true);

        Hawk.put("recipeBookmarkMap", dataList);
    }

    public void unsetBookmarkedData(int recipeId) {
        Map<Integer, Boolean> dataList = Hawk.get("recipeBookmarkMap", new TreeMap<Integer, Boolean>());
        dataList.put(recipeId, false);

        Hawk.put("recipeBookmarkMap", dataList);
    }
}
