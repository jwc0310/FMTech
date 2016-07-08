package parknshop.parknshopapp.Fragment.Home.HomeListView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.support.v7.graphics.Palette;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Model.Advertisement;
import parknshop.parknshopapp.Model.Category.Category;
import parknshop.parknshopapp.Model.NewsInfo;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.Utils;

/**
 * Created by chrisyu on 7/3/16.
 */

public class HomeListViewItem extends RelativeLayout {
    public @Nullable @Bind(R.id.title) TextView titleTextView;
    public @Nullable @Bind(R.id.title_image) RoundedImageView titleImageView;
    public @Nullable @Bind(R.id.rounded_background) LinearLayout roundedBackground;

    public @Nullable @Bind(R.id.product_icon) ImageView productIconImageView;

    //@Bind(R.id.data_layout) LinearLayout dataLayout;

    public HomeListViewItem(Context context, boolean isHappyTime) {
        super(context);
        this.isHappyTime = isHappyTime;
        init(context);
    }

    public HomeListViewItem(Context context) {
        super(context);
        init(context);
    }

    public HomeListViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public HomeListViewItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public boolean isHappyTime;
    private void init(Context ctx) {
        LayoutInflater.from(ctx).inflate(R.layout.home_activity_listview_item, this, true);
        ButterKnife.bind(this);
        initImageView(ctx);
        if(isHappyTime) {
            initHappyTime(ctx);
        } else {
            initBackground(ctx);
        }

        titleImageView.setLayoutParams(new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, ( (( (Utils.getScreenWidth(ctx) - Utils.dpToPx(40, ctx)) * 250 / 440) ))));

        //440 / 250 = width / h

        //h = width *  250 / 440
    }

    public void setContent(Category category) {
        titleTextView.setText(category.getTitle());
        //descTextView.setText(category.getDesc());
        Glide.with(getContext()).load(category.getImageId()).into(titleImageView);
        Glide.with(getContext()).load(category.sp_icon).into(productIconImageView);
        //productIconTextView.setText(""+category.getCount());
    }

    public void setContent(NewsInfo newsInfo) {
        if(newsInfo != null && newsInfo.getImageUrl() != null)
        Glide.with(getContext()).load(newsInfo.getImageUrl()).into(titleImageView);
    }

    public void setContent(Advertisement.Data data) {
        titleTextView.setText(data.getTitle());
        //descTextView.setText(data.getDescription());
        Glide.with(getContext()).load(data.getImage())/*.override(300, 100)*/.error(R.drawable.parknshop_banner).into(titleImageView);
        //Glide.with(getContext()).load(data.get).into(productIconImageView);

//        Log.i("colorcode", "colorcode " + data.getColorCode() + " " + data.getColorCode().substring(0, 1));

        //descTextView.setText(data.getDescription());

        roundedBackground.setBackgroundResource(R.drawable.tags_rounded_corners);

        GradientDrawable drawable = (GradientDrawable) roundedBackground.getBackground();


        try {
            String colorCode = (data.getColorCode().substring(0, 1).equals("#") ? "" : "#") + data.getColorCode();

//            Log.i("colorcode", "colorcode " + colorCode);

            if(colorCode != null && colorCode.length() > 0)
                drawable.setColor(Color.parseColor(colorCode));

        } catch (Exception e) {
            //Log.i("failure", "failure @ color parsing" + e.getMessage());
        }
        //roundedBackground.setBackgroundColor();
        //roundedBackground.setBackgroundColor(data.getColorCode());
        // .getCount());
    }

    public void initBackground(Context context) {
        /*int screenWidth = Utils.getScreenWidth(context);
        int padding = Utils.dpToPx(10, context) * 2;
        int imageWidth = screenWidth -padding;
        LayoutParams lp = (new LayoutParams(imageWidth, (int)(imageWidth * 0.16)));
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        roundedBackground.setLayoutParams(lp);*/
    }

    public void initHappyTime(Context context) {
        /*int screenWidth = Utils.getScreenWidth(context);
        int padding = Utils.dpToPx(10, context) * 2;
        int imageWidth = screenWidth -padding;
        LayoutParams lp = (new LayoutParams(imageWidth, (int)(imageWidth * 0.10)));
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        roundedBackground.setLayoutParams(lp);*/
    }

    public void initImageView(Context context) {
        /*int screenWidth = Utils.getScreenWidth(context);
        int padding = Utils.dpToPx(10, context) * 2;
        int imageWidth = screenWidth -padding;
        titleImageView.setLayoutParams(new LayoutParams(imageWidth, (int)(imageWidth * 0.66)));*/

        //generateRoundedImageView(titleImageView, 100, 0);
        //getDominatColor(titleImageView, dataLayout);
        //generateRoundedImageView(backgroundImage, 0, 100);
    }

    public void setColorDrawable(ImageView iv) {
        //Drawable colorDrawable = new ColorDrawable(R.color.colorPrimary);
        //iv.setImageDrawable(colorDrawable);
    }

    public void generateRoundedImageView(ImageView iv, int topRadius, int bottomRadius) {
        Bitmap mbitmap = imageViewToBitmap(iv);
        Bitmap imageRounded = Bitmap.createBitmap(mbitmap.getWidth(), mbitmap.getHeight(), mbitmap.getConfig());
        Canvas canvas = new Canvas(imageRounded);
        Paint mpaint = new Paint();
        mpaint.setAntiAlias(true);
        mpaint.setShader(new BitmapShader(mbitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawRoundRect((new RectF(0, 0, mbitmap.getWidth(), mbitmap.getHeight())), topRadius, bottomRadius, mpaint);// Round Image Corner 100 100 100 100
        iv.setImageBitmap(imageRounded);
    }

    public void getDominatColor(ImageView iv, final LinearLayout linearLayout) {
        Bitmap bitmap = imageViewToBitmap(iv);
        Palette.generateAsync(bitmap, new Palette.PaletteAsyncListener() {
            public void onGenerated(Palette palette) {
                // Do something with colors...
                linearLayout.setBackgroundColor(palette.getDarkMutedSwatch().getRgb());
                drawableToBitmap(linearLayout.getBackground());
            }
        });
    }

    public Bitmap imageViewToBitmap(ImageView iv) {
        return ((BitmapDrawable)iv.getDrawable()).getBitmap();
    }

    public static Bitmap drawableToBitmap (Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable).getBitmap();
        }

        int width = drawable.getIntrinsicWidth();
        width = width > 0 ? width : 1;
        int height = drawable.getIntrinsicHeight();
        height = height > 0 ? height : 1;

        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);

        return bitmap;
    }
}

