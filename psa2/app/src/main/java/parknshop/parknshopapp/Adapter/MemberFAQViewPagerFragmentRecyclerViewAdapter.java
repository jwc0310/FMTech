package parknshop.parknshopapp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Model.FAQResponse;
import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class MemberFAQViewPagerFragmentRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    ArrayList<FAQResponse.Data> mFAQData;
    ArrayList<Boolean> isOpening = new ArrayList<>();

    public MemberFAQViewPagerFragmentRecyclerViewAdapter(Context context, ArrayList<FAQResponse.Data> mFAQData, boolean b) {
        this.mFAQData = mFAQData;
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        isOpening.clear();
        for(int i = 0; i < mFAQData.size()+1; i++){
            isOpening.add(false);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TextViewHolder(mLayoutInflater.inflate(R.layout.view_item_faq, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ((TextViewHolder) holder).txtTitle.setText(mFAQData.get(position).getTitle());
        ((TextViewHolder) holder).txtContent.setText(mFAQData.get(position).getContent());
        for(int i = 0; i < isOpening.size(); i++){
            if(isOpening.get(i))
                ((TextViewHolder) holder).txtContent.setVisibility(View.VISIBLE);
        }

        if(isOpening.get(position)){
            isOpening.set(position, true);
            ((TextViewHolder) holder).imgArrow.setImageResource(R.drawable.grocery_list_icn_up);
            ((TextViewHolder) holder).txtContent.setVisibility(View.VISIBLE);
        }else {
            isOpening.set(position, false);
            ((TextViewHolder) holder).imgArrow.setImageResource(R.drawable.grocery_list_icn_down);
            ((TextViewHolder) holder).txtContent.setVisibility(View.GONE);
        }

        ((TextViewHolder) holder).rlTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int j = 0; j < isOpening.size(); j++) {
                    if (position == j) {
                        if (isOpening.get(position)) {
                            isOpening.set(position, false);
                        } else {
                            isOpening.set(position, true);
                        }
                    } else {
                        isOpening.set(j, false);
                    }
                }
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mFAQData == null ? 0 : mFAQData.size();
    }

    public static class TextViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.txtTitle)
        TextView txtTitle;
        @Bind(R.id.txtContent)
        TextView txtContent;
        @Bind(R.id.imgArrow)
        ImageView imgArrow;
        @Bind(R.id.rlTitle)
        RelativeLayout rlTitle;

        TextViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Log.d("TextViewHolder", "onClick--> position = " + getPosition());
                }
            });
        }
    }
}
