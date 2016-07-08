package parknshop.parknshopapp.Fragment.Home;

import parknshop.parknshopapp.Base.HttpController.CustomRunnable;
import parknshop.parknshopapp.Model.Category.CategoryTree;

/**
 * Created by chrisyu on 16/3/12.
 */
public class CategoryTreeRunnable extends CustomRunnable {
    HomeFragment homeFragment;

    public CategoryTreeRunnable(HomeFragment homeFragment) {
        this.homeFragment = homeFragment;
    }

    @Override
    public void run() {
        CategoryTree categoryTree = (CategoryTree) this.data;
        HomePresenter.prepareListData(categoryTree, homeFragment);
        //mMenuAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild, expandableListView);
    }
}
