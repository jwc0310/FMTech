package parknshop.parknshopapp.Fragment.StoreLocator;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.StoreLocator.View.StoreLocatorHeader;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.StoreListResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.AppUtils;

/**
 * Created by chrisyu on 29/4/16.
 */
public class StoreLocatorSearchFragment extends BaseFragment {
    @Bind(R.id.store_locator_search_edit_text) EditText storeLocatorSearchEditText;
    @Bind(R.id.recently_search_listview) ListView recentlySearchedListView;
    @Bind(R.id.store_locator_clear_header) StoreLocatorHeader recentSearchHeader;
    View view;

    public void onCreate(Bundle onSaved) {
        super.onCreate(onSaved);
        view = getLayoutInflater(onSaved).inflate(R.layout.store_locator_search_fragment_layout, null);
        ButterKnife.bind(this, view);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        GATrackerHelper.getInstance(getActivity()).setGATracker("available-store-search");

        showBackButton();
        setToolbarTitle(getString(R.string.store_locator_search));

        storeLocatorSearchEditText.setOnEditorActionListener(new OnEditListener());
        // recentSearchHeader.findViewById(R.id.sub_title).setOnClickListener(new ClearSearchHistoryListener());
        ArrayList<String> searchHistoryList = Hawk.get(AppUtils.store_locator_search_history, new ArrayList<String>());
        if(searchHistoryList.size() > 0)
            recentSearchHeader.setVisibility(View.VISIBLE);
        else
            recentSearchHeader.setVisibility(View.GONE);

        recentSearchHeader.setSubTitleRunnable(new SubTitleRunnable());

        return view;
    }

    public void onResume() {
        super.onResume();
        setRecentlySearchedListView();
    }

    @OnClick(R.id.advanced_search)
    public void goToAdvancedSearch() {
        placeFragmentWithBackStack(new StoreLocatorAdvancedSearchFragment());
    }

    public void setRecentlySearchedListView() {
        ArrayList<String> storeLocatorSearchHistory = Hawk.get(AppUtils.store_locator_search_history);
        StoreLocatorSearchAdapter storeLocatorSearchAdapter = new StoreLocatorSearchAdapter(getBaseActivity(), storeLocatorSearchHistory);
        recentlySearchedListView.setAdapter(storeLocatorSearchAdapter);
        recentlySearchedListView.setOnItemClickListener(storeLocatorSearchAdapter);
    }

    public List<StoreListResponse.Store> getStoreListByTextSearch(String textSearch) {
        List<StoreListResponse.Store> searchResult = new ArrayList<StoreListResponse.Store>();

        ArrayList<StoreListResponse.Store> storeList = Hawk.get(AppUtils.store_locator_store_list, new ArrayList<StoreListResponse.Store>());

        String lowerCaseTextSearch = textSearch.toLowerCase();
        for(int i = 0; i < storeList.size(); i ++) {
            if(storeList.get(i).getName() == null) continue;
            if(storeList.get(i).getName().toLowerCase().contains(lowerCaseTextSearch))
                searchResult.add(storeList.get(i));
        }
        return searchResult;
    }

    class OnEditListener implements TextView.OnEditorActionListener {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            if (actionId == EditorInfo.IME_ACTION_SEARCH || actionId == 0) {
                ArrayList<String> searchHistoryList = Hawk.get(AppUtils.store_locator_search_history, new ArrayList<String>());
                searchHistoryList.add(v.getText().toString());

                Hawk.put(AppUtils.store_locator_search_history, searchHistoryList);

                List<StoreListResponse.Store> searchResult = getStoreListByTextSearch(storeLocatorSearchEditText.getText().toString());
                StoreLocatorListFragment storeLocatorSearchFragment = new StoreLocatorListFragment();
                storeLocatorSearchFragment.stores = searchResult;
                placeFragmentWithBackStack(storeLocatorSearchFragment);

                // clear text
                storeLocatorSearchEditText.setText(null);
                hideKeyboard();

            }
            return false;
        }
    }

    class StoreLocatorSearchAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
        Context context;
        private LayoutInflater inflater;
        ArrayList<String> historyList = new ArrayList<>();

        public StoreLocatorSearchAdapter(Context context, ArrayList<String> historyList) {
            this.context = context;
            inflater = LayoutInflater.from(context);
            setList(historyList);
        }

        public void setList(ArrayList<String> historyList) {
            this.historyList.clear();
            if (historyList == null)
                return;
            this.historyList.addAll(historyList);
            notifyDataSetChanged();
        }

        @Override
        public int getCount() {
            return historyList.size();
        }

        @Override
        public Object getItem(int position) {
            return historyList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return historyList.get(position).hashCode();
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder holder;
            if (view == null) {
                holder = new ViewHolder();
                view = inflater.inflate(R.layout.item_search_history, null, false);
                holder.txtName = (TextView) view.findViewById(R.id.txtName);
                view.setTag(holder);
            } else {
                holder = (ViewHolder) view.getTag();
            }
            holder.txtName.setText(historyList.get(i));
            return view;
        }

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            List<StoreListResponse.Store> searchResult = getStoreListByTextSearch(historyList.get(position));
            StoreLocatorListFragment storeLocatorSearchFragment = new StoreLocatorListFragment();
            storeLocatorSearchFragment.stores = searchResult;
            placeFragmentWithBackStack(storeLocatorSearchFragment);
        }


        class ViewHolder {
            TextView txtName;
        }
    }

    class SubTitleRunnable implements Runnable {
        @Override
        public void run() {
            Hawk.put(AppUtils.store_locator_search_history, new ArrayList<String>());
            ArrayList<String> searchHistoryList = Hawk.get(AppUtils.store_locator_search_history, new ArrayList<String>());

            if(searchHistoryList.size() > 0)
                recentSearchHeader.setVisibility(View.VISIBLE);
            else
                recentSearchHeader.setVisibility(View.GONE);

            setRecentlySearchedListView();
        }
    }
}
