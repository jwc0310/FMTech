package parknshop.parknshopapp.Fragment.Home.LeftMenu;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.orhanobut.hawk.Hawk;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Model.Category.CategoryDrawerItem;
import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.R;

/**
 * Created by hp on 9/6/2016.
 */
public class LeftMenuChildViewHolder extends ChildViewHolder{
    /**
     * Default constructor.
     *
     * @param itemView The {@link View} being hosted in this ViewHolder
     */
    @Bind(R.id.submenu) TextView submenu;
    public View root;
    Context mContext;
    private CategoryTree mCategoryTree;

    public LeftMenuChildViewHolder(View itemView) {
        super(itemView);
        root = itemView;
        mContext = root.getContext();
        ButterKnife.bind(this, itemView);
    }

    public void setCategoryTree(CategoryTree categoryTree) {
        mCategoryTree = categoryTree;
    }

    public CategoryTree getCategoryTree() {
        return mCategoryTree;
    }


    public void bind(CategoryDrawerItem categoryDrawerItem, int position) {

        final String childText = categoryDrawerItem.text;//(String) (getChild(groupPosition, childPosition) != null ? ((CategoryDrawerItem)getChild(groupPosition, childPosition)).text : "");

        submenu.setText(childText);

        //Object groupData = categoryDrawerItem;//this.mListDataChild.get(this.mListDataHeader.get(groupPosition));
        //CategoryDrawerItem categoryDrawerItem = ((CategoryDrawerItem) getChild(groupPosition, childPosition));

        //convertView.setOnClickListener(new LeftMenuOnclickListener(categoryDrawerItem, groupPosition, childPosition, groupData, mContext, this));

        root.setOnClickListener(new LeftMenuOnclickListener(categoryDrawerItem, categoryDrawerItem.getParentPosition() , position - categoryDrawerItem.getParentPosition() - 1, categoryDrawerItem.groupData, mContext, null, getCategoryTree()));

        int groupPos = Hawk.get("groupPos", 0);
        int childPos = Hawk.get("childPos", 0);

        //Log.i("childPos2", "childPos2" + groupPos + " " + categoryDrawerItem.getParentPosition() + " " + childPos + " " + (position - categoryDrawerItem.getParentPosition() - 1) );

        Hawk.put("selectedGroupPos", 0);

        if(groupPos == categoryDrawerItem.getParentPosition() && childPos == (position - categoryDrawerItem.getParentPosition() - 1) ) {
            submenu.setTextColor(mContext.getResources().getColor(R.color.menu_click));
        } else {
            submenu.setTextColor(mContext.getResources().getColor(R.color.white));
        }

        //if(selectedChild ==  (int) (groupPosition * (Math.pow((double)(1 + childPosition), (double)2) )))
        //    txtListChild.setTextColor(mContext.getResources().getColor(R.color.colorPrimary));
        //else
        //    txtListChild.setTextColor(mContext.getResources().getColor(R.color.white));

        //if(position == expandedPosition) {

       // }

        //viewList.put(groupPosition * (childPosition + 1), convertView);
    }
}
