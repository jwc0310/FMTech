package parknshop.parknshopapp.Fragment.Recipe;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.RecipeDetailResponse;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 6/5/16.
 */
public class RecipeSimpleListFragment extends BaseFragment {
    @Bind(R.id.recycler_view) RecyclerView recyclerView;
    @Bind (R.id.items) TextView itemsTextView;
    @Bind (R.id.no_item_found) TextView noItemFound;

    public ArrayList<RecipeDetailResponse.RecipeDetailItem> data;
    public RecipeListAdapter recipeListAdapter;
    View rootView;

    public static RecipeSimpleListFragment newInstance(ArrayList<RecipeDetailResponse.RecipeDetailItem> data) {
        RecipeSimpleListFragment recipeSimpleListFragment = new RecipeSimpleListFragment();
        recipeSimpleListFragment.data = data;
        return recipeSimpleListFragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        rootView = getActivity().getLayoutInflater().inflate(R.layout.recipe_simple_layout, container, false);
        ButterKnife.bind(this, rootView);

        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        setDataIfNeeded();

        return rootView;
    }


    public void setDataIfNeeded() {
        //Log.i("data" , "data" + data);

        if(data == null || data.size() == 0) {
            itemsTextView.setVisibility(View.GONE);
            noItemFound.setVisibility(View.VISIBLE);
            return;
        } else {
            noItemFound.setVisibility(View.GONE);
            itemsTextView.setVisibility(View.VISIBLE);
            itemsTextView.setText(data.size() + " items");
        }
        //Log.i("data" , "data" + data.size());

        recipeListAdapter = new RecipeListAdapter(data);
        recipeListAdapter.hasHeader = false;
        recipeListAdapter.hasFooter = false;
        recipeListAdapter.setActivity(getBaseActivity());
        recyclerView.setAdapter(recipeListAdapter);

        recipeListAdapter.notifyDataSetChanged();
        //handleNoItemFoundIfNeeded(allItems);
    }

}
