package parknshop.parknshopapp.Adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import parknshop.parknshopapp.API;
import parknshop.parknshopapp.Model.OnlineRecordDetail;
import parknshop.parknshopapp.R;

/**
 * Created by Gigi Wong on 2016年04月22日.
 */
public class OrderReviewListAdapter extends BaseAdapter {
    Context context;
    private LayoutInflater inflater;
    ArrayList<OnlineRecordDetail.Order> mEntries = new ArrayList<>();
    Map<String, boolean[]> commentSelected = new HashMap();
    ArrayList<String> comments = new ArrayList<>();
    ArrayList<Integer> ratings = new ArrayList<>();
    ViewHolder holder;
    String[] items;


    public OrderReviewListAdapter(ArrayList<OnlineRecordDetail.Order> entries, Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        setList(entries);

    }

    public void setList(ArrayList<OnlineRecordDetail.Order> entries) {
        this.mEntries.clear();
        this.commentSelected.clear();
        this.comments.clear();
        this.ratings.clear();
        items = context.getResources().getStringArray(R.array.order_details_review_status);
        boolean[] defaultSelected = new boolean[items.length];
        for(int i = 0; i < entries.size() ; i++){
            commentSelected.put(entries.get(i).getProduct().getCode(), defaultSelected);
            ratings.add(0);
            comments.add("");
        }
        mEntries.addAll(entries);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mEntries.size();
    }

    @Override
    public Object getItem(int position) {
        return mEntries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mEntries.get(position).hashCode();
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_product_review, null);
            holder = new ViewHolder();
            holder.image = (ImageView) view.findViewById(R.id.image);
            holder.title = (TextView) view.findViewById(R.id.title);
            holder.small_desc = (TextView) view.findViewById(R.id.small_desc);
            holder.weight = (TextView) view.findViewById(R.id.weight);
            holder.ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);
            holder.commentCount = (TextView) view.findViewById(R.id.comments);
            holder.txtReview = (TextView) view.findViewById(R.id.txtReview);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.title.setText(mEntries.get(position).getProduct().getName());
        holder.small_desc.setText(mEntries.get(position).getProduct().getDescription());
        holder.weight.setText(mEntries.get(position).getProduct().getPnsContentSizeUnit());
        holder.ratingBar.setFocusable(false);


        LayerDrawable stars = (LayerDrawable) holder.ratingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);
        holder.ratingBar.setRating(ratings.get(position));

        holder.txtReview.setText(comments.get(position));

        Glide.with(context).load(API.WASTSONS_DOMAIN + mEntries.get(position).getProduct().getImageUrl()).into(holder.image);

        holder.ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                ratings.set(position, Math.round(v));
                notifyDataSetChanged();
            }
        });


        holder.txtReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(position, commentSelected.get(mEntries.get(position).getProduct().getCode()));
            }
        });
//
//        setCommentCount(5);
//        setRatingBar(3);

        return view;
    }

    public void setRatingBar(float rating) {
        LayerDrawable stars = (LayerDrawable) holder.ratingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);

//        Drawable progress = holder.ratingBar.getProgressDrawable();
//        DrawableCompat.setTint(progress, Color.YELLOW);

        holder.ratingBar.setRating(rating);
    }

    public void setCommentCount(int count) {
        holder.commentCount.setText(count + " comments");
    }

    class ViewHolder {
        ImageView image;
        TextView title;
        TextView small_desc;
        TextView weight;
        RatingBar ratingBar;
        TextView commentCount;
        TextView txtReview;
    }



    public void showDialog(final int pos, final boolean[] arrCommentSelected) {
        // Strings to Show In Dialog with Radio Buttons

        final boolean[] tempCommentSelected = new boolean[arrCommentSelected.length];


        AlertDialog levelDialog;
        // Creating and Building the Dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
//        builder.setTitle("Select The Difficulty Level");

        for(int i = 0; i < arrCommentSelected.length; i++){
            tempCommentSelected[i] = arrCommentSelected[i];
        }

        builder.setMultiChoiceItems(items, tempCommentSelected,
                new DialogInterface.OnMultiChoiceClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean isChecked) {
                        tempCommentSelected[i] = isChecked;
                        commentSelected.put(mEntries.get(pos).getProduct().getCode(), tempCommentSelected);
                        ArrayList<String> review = new ArrayList<String>();
                        for(int j = 0; j < tempCommentSelected.length; j++){
                                if(tempCommentSelected[j]){
                                    review.add(items[j]);
                                }
                        }

                        comments.set(pos, review.toString().replace("[", "").replace("]", ""));
                        notifyDataSetChanged();
                    }
                });
        builder.setPositiveButton(context.getString(R.string.btn_ok), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        levelDialog = builder.create();
        levelDialog.show();
    }

    public Map<String, boolean[]> getCommentsSelected(){
        return commentSelected;
    }

    public ArrayList<Integer> getRatings(){
        return ratings;
    }

}