package parknshop.parknshopapp.Fragment.Product.ProductComment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.techery.properratingbar.ProperRatingBar;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.Product;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 29/3/16.
 */
public class ProductCommentFragment extends BaseFragment {
    public Product product = new Product();

    public @Bind(R.id.listview) ListView listView;
    public ProductCommentAdapter productCommentAdapter;
    //public

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getLayoutInflater(savedInstanceState).inflate(R.layout.product_comment_fragment_layout, null);
        ButterKnife.bind(this, view);

        setToolbarTitle(getString(R.string.comment_list));

        productCommentAdapter = new ProductCommentAdapter(product.getReviews(), getBaseActivity());
        listView.addHeaderView(createHeader());
        listView.setAdapter(productCommentAdapter);

        return view;
    }

    public LinearLayout createHeader() {
        LinearLayout ll = (LinearLayout)LayoutInflater.from(getBaseActivity()).inflate(R.layout.product_comment_fragment_header_dump, null);

        HeaderViewHolder headerViewHolder = new HeaderViewHolder(ll);
        headerViewHolder.setCommentCount(product.getReviews().size());
        headerViewHolder.setRatingBar(product.getAverageRating());

        return ll;
    }

    class HeaderViewHolder {
        LinearLayout header;
        public @Bind (R.id.ratingBar) RatingBar ratingBar;
        public @Bind (R.id.comments) TextView commentCount;
        public @Bind (R.id.proper_rating_bar) ProperRatingBar properRatingBar;

        public HeaderViewHolder(LinearLayout header) {
            this.header = header;
            ButterKnife.bind(this, header);
        }

        public void setRatingBar(float rating) {
            //L//ayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
            //stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);

            //Drawable progress = ratingBar.getProgressDrawable();
            //DrawableCompat.setTint(progress, Color.YELLOW);

            this.properRatingBar.setRating((int) rating);
        }

        public void setCommentCount(int count) {
            this.commentCount.setText(count + " " + getResources().getString(R.string.comments) + (GlobalConstant.language.equals(GlobalConstant.LANG_EN) ? "s" : "") );
        }
    }
}
