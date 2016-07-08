package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Adapter.MemberFAQViewPagerFragmentRecyclerViewAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Model.FAQResponse;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.DividerItemDecoration;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class MemberFAQViewPagerFragment extends BaseFragment {

    @Bind(R.id.rvFAQ)
    RecyclerView rvFAQ;
    ArrayList<FAQResponse.Data> mFAQData;

    public static MemberFAQViewPagerFragment newInstance(ArrayList<FAQResponse.Data> mFAQData) {
        MemberFAQViewPagerFragment frag = new MemberFAQViewPagerFragment();
        Bundle b = new Bundle();
        b.putSerializable("faqData", mFAQData);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_zone_faq_fragment_view_pager_layout, container, false);
        ButterKnife.bind(this, view);

        mFAQData = (ArrayList<FAQResponse.Data>) getArguments().getSerializable("faqData");
        setAdapter();

        return view;
    }

    public void setAdapter() {

        rvFAQ.setHasFixedSize(true);
        rvFAQ.setLayoutManager(new LinearLayoutManager(getActivity()));

        final MemberFAQViewPagerFragmentRecyclerViewAdapter adapter = new MemberFAQViewPagerFragmentRecyclerViewAdapter(getActivity(), mFAQData, false);
        rvFAQ.setAdapter(adapter);
        RecyclerView.ItemDecoration itemDecoration =
                new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL);
        rvFAQ.addItemDecoration(itemDecoration);

//        final StickyRecyclerHeadersDecoration headersDecor = new StickyRecyclerHeadersDecoration(adapter);
//        rvFAQ.addItemDecoration(headersDecor);
    }

}
