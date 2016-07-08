package parknshop.parknshopapp.Fragment.MemberZone.View;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code39Writer;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 12/4/16.
 */
public class MemberZoneCardView extends LinearLayout {
    @Bind(R.id.front_card) RelativeLayout frontcard;
    @Bind(R.id.back_card) RelativeLayout backcard;
    @Bind(R.id.points) TextView points;
    @Bind(R.id.txtValidThru) TextView txtValidThru;
    @Bind(R.id.barcode) TextView showBarcodeOrNot;
    @Bind(R.id.imgBarcode) ImageView imgBarcode;
    @Bind(R.id.txtCardNo) TextView txtCardNo;

    boolean shownBackSide;

    Context mContext;

    ObjectAnimator animFrontOut, animBackOut;
    private final int ANIM_DURATION = 500;

    public MemberZoneCardView(Context context) {
        this(context, null);
    }

    public MemberZoneCardView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MemberZoneCardView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        mContext = context;

        inflateLayout(context);

        ButterKnife.bind(this);

        initAnimator();

        initCard();
    }


    public Bitmap getBarCode(String data){
        Bitmap mBitmap = null;
        com.google.zxing.Writer c9 = new Code39Writer();

        int width = 600;
        int height = 150;

        try {
            BitMatrix bm = c9.encode(data, BarcodeFormat.CODE_39, width, height);
            mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    mBitmap.setPixel(i, j, bm.get(i, j) ? Color.WHITE : Color.TRANSPARENT);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mBitmap;
    }

    public void initCard() {
        shownBackSide = true;
        frontcard.setVisibility(View.VISIBLE);
        frontcard.setRotationY(0);
        backcard.setVisibility(View.VISIBLE);
        backcard.setRotationY(90);
    }

    public void initAnimator() {
        try {
            animFrontOut = ObjectAnimator.ofFloat(frontcard, "rotationY", 0.0f, 90f);
            animFrontOut.setDuration(ANIM_DURATION);
            animFrontOut.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {
                    frontcard.setVisibility(View.VISIBLE);
                    backcard.setVisibility(View.GONE);
                    showBarcodeOrNot.setClickable(false);
                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    frontcard.setVisibility(View.GONE);
                    backcard.setVisibility(View.VISIBLE);
                    ObjectAnimator animBackIn = ObjectAnimator.ofFloat(backcard, "rotationY", 270.0f, 360f);
                    animBackIn.setDuration(ANIM_DURATION);
                    animBackIn.start();
                    showBarcodeOrNot.setClickable(true);
                }

                @Override
                public void onAnimationCancel(Animator animation) {
                }

                @Override
                public void onAnimationRepeat(Animator animation) {
                }
            });

            animBackOut = ObjectAnimator.ofFloat(backcard, "rotationY", 0.0f, 90f);
            animBackOut.setDuration(ANIM_DURATION);
            animBackOut.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {
                    frontcard.setVisibility(View.GONE);
                    backcard.setVisibility(View.VISIBLE);
                    showBarcodeOrNot.setClickable(false);
                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    frontcard.setVisibility(View.VISIBLE);
                    backcard.setVisibility(View.GONE);
                    ObjectAnimator animFrontIn = ObjectAnimator.ofFloat(frontcard, "rotationY", 270.0f, 360f);
                    animFrontIn.setDuration(ANIM_DURATION);
                    animFrontIn.start();
                    showBarcodeOrNot.setClickable(true);
                }

                @Override
                public void onAnimationCancel(Animator animation) {
                }

                @Override
                public void onAnimationRepeat(Animator animation) {
                }
            });

        } catch (Exception e) {

        }
    }

    public void setCardNo(String cardNo) {
        if(TextUtils.isEmpty(cardNo))
            return;
        imgBarcode.setImageBitmap(getBarCode(cardNo));
        txtCardNo.setText(cardNo);
    }

    public void setPoints(String points) {
        this.points.setText(points);
    }

    public void setValidThru(String txtValidThru) {
        this.txtValidThru.setText(mContext.getString(R.string.myaccount_page_moneyback_valid_thru) + " " + txtValidThru);
    }

    @OnClick(R.id.barcode)
    public void redrawBackCard() {
        try {
            if (shownBackSide) {
                animFrontOut.start();
                showBarcodeOrNot.setText("FINISH");
            } else {
                animBackOut.start();
                showBarcodeOrNot.setText("SHOW BARCODE");
            }
            shownBackSide = !shownBackSide;
        } catch (Exception e) {

        }
    }

    public void inflateLayout(Context context) {
        LayoutInflater.from(context).inflate(R.layout.member_zone_card_layout, this);
    }

    public void setText() {

    }
}
