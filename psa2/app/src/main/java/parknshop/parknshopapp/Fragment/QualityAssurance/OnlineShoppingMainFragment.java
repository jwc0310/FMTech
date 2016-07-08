package parknshop.parknshopapp.Fragment.QualityAssurance;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseActivity;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.WebView.WebViewFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 20/6/16.
 */
public class OnlineShoppingMainFragment extends BaseFragment {
    public ArrayList<String> arrayList = new ArrayList<>();
    public ArrayList<String> urlList = new ArrayList<>();

    View view;
    @Bind(R.id.my_listview)
    ListView listView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        showMenuButton();
        showToolbar();
        setToolbarTitle(getString(R.string.home_activity_sliding_menu_online_shopping));

        view = getActivity().getLayoutInflater().inflate(R.layout.quality_assurance_main_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("quality-assurance");

        arrayList.clear();
        arrayList.add(getString(R.string.online_shopping_app));
        arrayList.add(getString(R.string.online_shopping_delivery_detail));
        arrayList.add(getString(R.string.online_shopping_payment_method));
        arrayList.add(getString(R.string.online_shopping_refund_guraantee));
        arrayList.add(getString(R.string.online_shopping_self_pickup));

        String postfix = "?uiel=Mobile&lang=" + (GlobalConstant.language.equals(GlobalConstant.LANG_ZH) ? "zt" : "en");

        urlList.clear();
        urlList.add("http://www.parknshop.com/howToBuyInApp" + postfix);
        urlList.add("http://www.parknshop.com/deliveryDetails" + postfix);
        urlList.add("http://www.parknshop.com/paymentMethods" + postfix);
        urlList.add("http://www.parknshop.com/refundReplaceG" + postfix);
        urlList.add("http://www.parknshop.com/selfPickUpService" + postfix);

        ButterKnife.bind(this, view);

        QualityAssuranceBaseAdapter adapter = new QualityAssuranceBaseAdapter(arrayList, getBaseActivity());

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(adapter);
        return view;
    }

    public class QualityAssuranceBaseAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
        ArrayList<String> arrayList = new ArrayList<String>();
        BaseActivity baseActivity;

        public QualityAssuranceBaseAdapter(ArrayList<String> arrayList, BaseActivity baseActivity) {
            this.arrayList = arrayList;
            this.baseActivity = baseActivity;
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return arrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return arrayList.get(position).hashCode();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //Log.i("call", "call");

            LayoutInflater layoutInflater = (LayoutInflater) baseActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(R.layout.quality_assurance_item, null);

            TextView label = (TextView) view.findViewById(R.id.label_textview);

            label.setText(arrayList.get(position));

            return view;
        }

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            WebViewFragment webViewFragment = WebViewFragment.newInstance(urlList.get(position));
            GATrackerHelper.getInstance(getActivity()).setGATracker("online-shopping/" + OnlineShoppingMainFragment.this.arrayList.get(position).toString().replace(" ", "-").toLowerCase() + "");

            webViewFragment.title = arrayList.get(position);
            webViewFragment.showBackButton = true;

            placeFragmentWithBackStack(webViewFragment);
        }
    }
}
