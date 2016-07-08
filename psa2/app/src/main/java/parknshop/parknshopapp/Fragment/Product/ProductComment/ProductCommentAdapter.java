package parknshop.parknshopapp.Fragment.Product.ProductComment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import io.techery.properratingbar.ProperRatingBar;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 29/3/16.
 */
public class ProductCommentAdapter extends BaseAdapter{
    List<Product.Review> reviews = new ArrayList<Product.Review>();
    Context context;

    public ProductCommentAdapter(List<Product.Review> reviews, Context context) {
        this.reviews = reviews;
        this.context = context;
    }

    @Override
    public int getCount() {
        return reviews.size();
    }

    @Override
    public Product.Review getItem(int position) {
        return reviews.get(position);
    }

    @Override
    public long getItemId(int position) {
        return reviews.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView == null)
            view = LayoutInflater.from(context).inflate(R.layout.product_comment_fragment_item, null);
        else
            view = convertView;

        CommentItemViewHolder commentItemViewHolder = new CommentItemViewHolder((LinearLayout)view);
        commentItemViewHolder.setData(getItem(position));

        return view;
    }



    class CommentItemViewHolder {
        LinearLayout header;
        RatingBar ratingBar;
        TextView comment;
        TextView userName;
        TextView commentDate;
        ProperRatingBar properRatingBar;

        public CommentItemViewHolder(LinearLayout header) {
            this.header = header;
            ratingBar = (RatingBar) this.header.findViewById(R.id.rating_bar);
            comment = (TextView) this.header.findViewById(R.id.comment);
            userName = (TextView) this.header.findViewById(R.id.user_name);
            commentDate = (TextView) this.header.findViewById(R.id.cm_d);
            properRatingBar = (ProperRatingBar) this.header.findViewById(R.id.proper_rating_bar);
        }

        public void setData(Product.Review review) {
            setRatingBar(review.rating);
            setComment(review.comment);
            setUserName(review.alias);
            setCommentDate(review.date);
        }

        public void setRatingBar(float rating) {
           // LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
            //stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);

            //Drawable progress = ratingBar.getProgressDrawable();
           // DrawableCompat.setTint(progress, Color.YELLOW);

            this.properRatingBar.setRating((int) rating);
        }

        public void setComment(String s) {
            this.comment.setText(s != null ? s : "");
        }

        public void setUserName(String s) {
            this.userName.setText(s + "");
        }

        public void setCommentDate(String date) {
            String tempDate = date.substring(0, 9);
            String[] arr = tempDate.split("-");
            commentDate.setText(arr[0] + "/" + Integer.valueOf(arr[1]) + "/" + Integer.valueOf((arr[2])));
        }
    }
}
