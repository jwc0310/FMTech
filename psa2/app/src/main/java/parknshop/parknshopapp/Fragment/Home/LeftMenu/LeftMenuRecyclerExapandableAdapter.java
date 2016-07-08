package parknshop.parknshopapp.Fragment.Home.LeftMenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.Model.ExpandedMenuModel;
import parknshop.parknshopapp.R;

/**
 * Created by hp on 9/6/2016.
 */
public class LeftMenuRecyclerExapandableAdapter extends ExpandableRecyclerAdapter<LeftMenuParentViewHolder, LeftMenuChildViewHolder> {
    /**
     * Primary constructor. Sets up {@link #mParentItemList} and {@link #mItemList}.
     * <p/>
     * Changes to {@link #mParentItemList} should be made through add/remove methods in
     * {@link ExpandableRecyclerAdapter}
     *
     * @param parentItemList List of all {@link ParentListItem} objects to be
     *                       displayed in the RecyclerView that this
     *                       adapter is linked to
     */
    private LayoutInflater mInflator;
    public Map<Integer, View> viewList = new TreeMap<Integer, View>();//new ArrayList<>();
    public Map<Integer, View> parentViewList = new TreeMap<Integer, View>();//new ArrayList<>();
    private CategoryTree mCategoryTree;

    public LeftMenuRecyclerExapandableAdapter(Context context, List parentItemList, CategoryTree categoryTree) {
        super(parentItemList);
        mInflator = LayoutInflater.from(context);
        mCategoryTree = categoryTree;
    }

    public CategoryTree getCategoryTree() {
        return mCategoryTree;
    }

    @Override
    public LeftMenuParentViewHolder onCreateParentViewHolder(ViewGroup parentViewGroup) {
        View parentView = mInflator.inflate(R.layout.one_activity_listheader, parentViewGroup, false);
        LeftMenuParentViewHolder leftMenuParentViewHolder = new LeftMenuParentViewHolder(parentView);
        leftMenuParentViewHolder.setCategoryTree(mCategoryTree);
        return leftMenuParentViewHolder;
    }

    @Override
    public LeftMenuChildViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {
        View childView = mInflator.inflate(R.layout.one_activity_list_submenu, null);
        LeftMenuChildViewHolder leftMenuChildViewHolder = new LeftMenuChildViewHolder(childView);
        leftMenuChildViewHolder.setCategoryTree(mCategoryTree);
        return leftMenuChildViewHolder;
    }

    @Override
    public void onBindParentViewHolder(LeftMenuParentViewHolder parentViewHolder, int position, ParentListItem parentListItem) {
        ExpandedMenuModel data = (ExpandedMenuModel) parentListItem;
        parentViewHolder.setPosition(position);
        parentViewHolder.bind(data);


        if(HomePresenter.expandedPosition != position)
            parentViewHolder.root.setAlpha(1.0f);


        parentViewList.put(position /*- (HomePresenter.expanded ? HomePresenter.expandedChildCount : 0)*/, parentViewHolder.root);

       // parentViewList.get(position).setAlpha(1.0f);
    }

    @Override
    public void onBindChildViewHolder(LeftMenuChildViewHolder childViewHolder, int position, Object childListItem) {
        CategoryDrawerItem data = (CategoryDrawerItem) childListItem;
        //Log.i("onBindChildViewHolder", "onBindChildViewHolder" + data.getParentPosition() + " " + position);
        childViewHolder.bind(data, position);
        viewList.put(data.getParentPosition() * (position - data.getParentPosition() ), childViewHolder.root);
        //viewList.put(groupPosition * (childPosition + 1), convertView);
    }
}
