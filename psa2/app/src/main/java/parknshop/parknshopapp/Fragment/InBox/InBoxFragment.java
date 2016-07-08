package parknshop.parknshopapp.Fragment.InBox;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Adapter.InboxListAdapter;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.InboxCheckBoxOnSelectedEvent;
import parknshop.parknshopapp.EventUpdate.InboxFragmentSelectAllEvent;
import parknshop.parknshopapp.EventUpdate.InboxListAdapterItemClickEvent;
import parknshop.parknshopapp.EventUpdate.InboxRemoveBtnOnClickEvent;
import parknshop.parknshopapp.Fragment.Home.HomePresenter;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.DeleteMsgEvent;
import parknshop.parknshopapp.Rest.event.InboxResponseEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;

/**
 * Created by hp on 25/4/2016.
 */
public class InBoxFragment extends BaseFragment {
    @Bind(R.id.list) ListView list;
    @Bind(R.id.rlSelectAll) RelativeLayout rlSelectAll;
    @Bind(R.id.btnSelectAll) ImageView btnSelectAll;
    @Bind(R.id.txtNoResult) TextView txtNoResult;

    InboxResponseEvent mInboxResponseEvent;

    InboxListAdapter inboxListAdapter;

    boolean isRemove;

    boolean isSelecteAll;

    ArrayList<Boolean> isSelected = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.inbox_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("notification-inbox");

        ButterKnife.bind(this, view);

        showMenuButton();
        showToolbar();
        setToolbarTitle(getString(R.string.inbox_page_title));
        disableSecondRightButton();
        disableSearchButton();
        disableCartButton();

        setSecondRightTextButtonOnClickListenerText("");
        setSecondRightTextButtonOnClickListenerImage(R.drawable.shopping_cart_icn_del);


        enableSecondRightTextButtonOnClickListenerWithImage("", R.drawable.shopping_cart_icn_del, new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(isRemove){
                    isRemove = false;
                    setSecondRightTextButtonOnClickListenerText("");
                    setSecondRightTextButtonOnClickListenerImage(R.drawable.shopping_cart_icn_del);

                    // Reset select all button
                    rlSelectAll.setVisibility(View.GONE);
                    isSelecteAll = false;
                    btnSelectAll.setImageResource(R.drawable.filter_without_tick);

                    if(isSelected.size() > 0 && mInboxResponseEvent != null){
                        ArrayList<String> msgIds = new ArrayList<>();
                        for(int i = 0 ; i < isSelected.size(); i++){
                            if(isSelected.get(i)){
                                msgIds.add(mInboxResponseEvent.getInboxResponse().getData().get(i).getMessage().getId());
                            }
                        }
                        if(msgIds.size() > 0){
                            showProgressDialog();
                            WebServiceModel.getInstance(getActivity()).requestDeleteMsg(msgIds.toString().replace("[", "").replace("]", "").replace(", ", ","));
                        }
                    }
                }else{
                    isRemove = true;
                    setSecondRightTextButtonOnClickListenerText(InBoxFragment.this.getString(R.string.btn_remove));
                    setSecondRightTextButtonOnClickListenerImage(0);
                    rlSelectAll.setVisibility(View.VISIBLE);
                }

                // Update list view layout
                InboxRemoveBtnOnClickEvent inboxRemoveBtnOnClickEvent = new InboxRemoveBtnOnClickEvent();
                inboxRemoveBtnOnClickEvent.setRemove(isRemove);
                MyApplication.getInstance().mBus.post(inboxRemoveBtnOnClickEvent);

            }
        });

        inboxListAdapter = new InboxListAdapter(getActivity());

        return view;
    }


    @OnClick(R.id.btnSelectAll)
    public void btnSelectAll(){
        if(isSelecteAll){
            isSelecteAll = false;
            btnSelectAll.setImageResource(R.drawable.filter_without_tick);
        }else{
            btnSelectAll.setImageResource(R.drawable.filter_tick);
            isSelecteAll = true;
        }
        for (int j = 0; j < isSelected.size(); j++) {
            isSelected.set(j, isSelecteAll);
        }

        InboxFragmentSelectAllEvent inboxFragmentSelectAllEvent = new InboxFragmentSelectAllEvent();
        inboxFragmentSelectAllEvent.setIsSelecteAll(isSelected);
        MyApplication.getInstance().mBus.post(inboxFragmentSelectAllEvent);
    }

    @Override
    public void onResume() {
        super.onResume();
//        if(mInboxResponseEvent == null){
            MyApplication.getInstance().register(inboxListAdapter);
            getInboxMsg();
//        }else{
//            onEvent(mInboxResponseEvent);
//        }
    }

//    public void getInboxMsg(){
//        // If has registration id
//        if(!TextUtils.isEmpty(TokenHelper.getToken())){
//            showProgressDialog();
//            WebServiceModel.getInstance(getActivity()).requestGetInboxMsg();
//            getInboxMsg();
//        }o
//    }

    @Override
    public void onPause() {
        super.onPause();
        setSecondRightTextButtonOnClickListenerImage(0);
        MyApplication.getInstance().unRegister(inboxListAdapter);
    }

    // From BaseActivity
    public void onEvent(InboxResponseEvent inboxResponseEvent) {
        mInboxResponseEvent = inboxResponseEvent;
        hideProgressDialog();
        if(inboxResponseEvent.getSuccess()){
            // Update left menu unread msg badge
//            int unreadMsg = 0;
//            for(int i = 0; i < inboxResponseEvent.getInboxResponse().getData().size() ; i++){
//                if(inboxResponseEvent.getInboxResponse().getData().get(i).getStatus().equals("UNREAD"))
//                    unreadMsg++;
//            }
//            HomePresenter.setUnreadMsgCount(unreadMsg);

            inboxListAdapter.setList(inboxResponseEvent.getInboxResponse().getData());
            list.setAdapter(inboxListAdapter);
        } else {
            ToastUtils.show(getActivity(), inboxResponseEvent.getMessage());
        }

        if(inboxResponseEvent.getInboxResponse().getData().size() == 0){
            txtNoResult.setVisibility(View.VISIBLE);
        } else {
            txtNoResult.setVisibility(View.GONE);
        }
    }

    // Receive selected list from list view
    public void onEvent(InboxCheckBoxOnSelectedEvent inboxCheckBoxOnSelectedEvent) {
        isSelected = inboxCheckBoxOnSelectedEvent.getIsSelected();
    }

    // When delete msg succeed, get a new msg list
    public void onEvent(DeleteMsgEvent deleteMsgEvent) {
        hideProgressDialog();
        if(deleteMsgEvent.getSuccess()){
            getInboxMsg();
        }else{
            ToastUtils.show(getActivity(), deleteMsgEvent.getMessage());
        }
    }

    // inbox list item click event
    public void onEvent(InboxListAdapterItemClickEvent inboxListAdapterItemClickEvent) {

        if(inboxListAdapterItemClickEvent.getData().getStatus().equals("UNREAD")){
            // read Msg
            WebServiceModel.getInstance(getActivity()).requestReadMsgMsg(inboxListAdapterItemClickEvent.getData().getMessage().getId());

            if(HomePresenter.getUnreadMsgCount() > 0)
                HomePresenter.setUnreadMsgCount(HomePresenter.getUnreadMsgCount() - 1, this.getBaseActivity());
        }

        InBoxDetailsFragment inBoxDetailsFragment = new InBoxDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", inboxListAdapterItemClickEvent.getData().getMessage().getMessage());
        bundle.putString("msg", inboxListAdapterItemClickEvent.getData().getMessage().getInbox());
        inBoxDetailsFragment.setArguments(bundle);
        placeFragmentWithBackStack(inBoxDetailsFragment);

    }

}
