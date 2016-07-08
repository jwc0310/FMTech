package parknshop.parknshopapp.View;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.zxing.ResultPoint;
import com.linkwish.app.zxing.camera.CameraManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Utils.Utils;

/**
 * Created by chrisyu on 31/5/16.
 */


public final class CustomViewFinderView extends View {
    private static final String TAG = "ViewfinderView";
    private static final int[] SCANNER_ALPHA = new int[]{0, 64, 128, 192, 255, 192, 128, 64};
    private static final long ANIMATION_DELAY = 80L;
    private static final int CURRENT_POINT_OPACITY = 160;
    private static final int MAX_RESULT_POINTS = 20;
    private final Paint paint = new Paint();
    private Bitmap resultBitmap;
    private final int maskColor;
    private final int resultColor;
    private final int frameColor;
    private final int laserColor;
    private final int resultPointColor;
    private int scannerAlpha;
    private List<ResultPoint> possibleResultPoints;
    private List<ResultPoint> lastPossibleResultPoints;
    Context context;

    public CustomViewFinderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Resources resources = this.getResources();
        this.maskColor = resources.getColor(com.linkwish.app.zxing.R.color.viewfinder_mask);
        this.resultColor = resources.getColor(com.linkwish.app.zxing.R.color.result_view);
        this.frameColor = resources.getColor(android.R.color.holo_blue_light);
        this.laserColor = resources.getColor(com.linkwish.app.zxing.R.color.viewfinder_laser);
        this.resultPointColor = resources.getColor(com.linkwish.app.zxing.R.color.possible_result_points);
        this.scannerAlpha = 0;
        this.possibleResultPoints = new ArrayList(5);
        this.lastPossibleResultPoints = null;
        this.context = context;
    }

    public void onDraw(Canvas canvas) {
        Rect frame = CameraManager.get().getFramingRect();
        //frame.set(frame.left, frame.right, frame.top + Utils.dpToPx(20, context), frame.bottom - Utils.dpToPx(20, context));
        if(frame != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            int viewWidth = this.getRight() - this.getLeft();
            int viewHeight = this.getBottom() - this.getTop();
            this.paint.setAntiAlias(false);
            this.paint.setColor(this.resultBitmap != null?this.resultColor:this.maskColor);

            canvas.drawRect(0.0F, 0.0F, (float)width, (float)frame.top + Utils.dpToPx(100 , context), this.paint);
            canvas.drawRect(0.0F, (float)frame.top + Utils.dpToPx(100 , context), (float)frame.left, (float)(frame.bottom + 1) - Utils.dpToPx(100 , context), this.paint);

            canvas.drawRect((float)(frame.right + 1), (float)frame.top + Utils.dpToPx(100 , context), (float)width, (float)(frame.bottom + 1) - Utils.dpToPx(100 , context), this.paint);
            canvas.drawRect(0.0F, (float)(frame.bottom + 1) - Utils.dpToPx(100 , context), (float)width, (float)height, this.paint);

            if(this.resultBitmap != null) {
                this.paint.setAlpha(160);
                canvas.drawBitmap(this.resultBitmap, (Rect)null, frame, this.paint);
            } else {
                this.paint.setColor(this.frameColor);

                //canvas.drawRect((float)frame.left, (float)frame.top  + Utils.dpToPx(100 , context), (float)frame.left + Utils.dpToPx(100 , context) , (float)(frame.top + 100), this.paint);

                //canvas.drawRect((float)frame.left, (float)frame.top  + Utils.dpToPx(100 , context), (float)(frame.right + 1), (float)(frame.top + 2), this.paint);

                //one done
                canvas.drawRect((float)frame.left, (float)(frame.top + 2) + Utils.dpToPx(100 , context), (float)(frame.left + 5), (float)(frame.top + 2) + Utils.dpToPx(150 , context), this.paint);
                canvas.drawRect((float)frame.left, (float)(frame.top) + Utils.dpToPx(100 , context), (float)(frame.left) + Utils.dpToPx(50 , context) , (float)(frame.top + 5) + Utils.dpToPx(100 , context), this.paint);

                canvas.drawRect((float)frame.left, (float)(frame.bottom) - Utils.dpToPx(150 , context), (float)(frame.left + 5), (float)(frame.bottom) - Utils.dpToPx(100 , context), this.paint);
                canvas.drawRect((float)frame.left, (float)(frame.bottom) - Utils.dpToPx(100 , context), (float)(frame.left) + Utils.dpToPx(50 , context) , (float)(frame.bottom + 5) - Utils.dpToPx(100 , context), this.paint);

                canvas.drawRect((float)frame.right, (float)(frame.top + 2) + Utils.dpToPx(100 , context), (float)(frame.right + 5), (float)(frame.top + 2) + Utils.dpToPx(150 , context), this.paint);
                canvas.drawRect((float)frame.right - Utils.dpToPx(50 , context) , (float)(frame.top) + Utils.dpToPx(100 , context), (float)(frame.right), (float)(frame.top + 5) + Utils.dpToPx(100 , context), this.paint);

                canvas.drawRect((float)frame.right, (float)(frame.bottom) - Utils.dpToPx(150 , context), (float)(frame.right + 5), (float)(frame.bottom) - Utils.dpToPx(100 , context), this.paint);
                canvas.drawRect((float)frame.right - Utils.dpToPx(50 , context), (float)(frame.bottom) - Utils.dpToPx(100 , context), (float)(frame.right + 5) , (float)(frame.bottom + 5) - Utils.dpToPx(100 , context), this.paint);

                //canvas.drawRect((float)(frame.right - 1), (float)frame.top, (float)(frame.right + 1), (float)(frame.bottom - 1), this.paint);
                //canvas.drawRect((float)frame.left, (float)(frame.bottom - 1), (float)(frame.right + 1), (float)(frame.bottom + 1), this.paint);


                this.paint.setColor(this.laserColor);
                this.paint.setAlpha(SCANNER_ALPHA[this.scannerAlpha]);

                this.scannerAlpha = (this.scannerAlpha + 1) % SCANNER_ALPHA.length;
                int middle = frame.height() / 2 + frame.top;
                //canvas.drawRect((float)(frame.left + 2), (float)(middle - 1), (float)(frame.right - 1), (float)(middle + 2), this.paint);

                Rect previewFrame = CameraManager.get().getFramingRectInPreview();
                float scaleX = (float)frame.width() / (float)previewFrame.width();
                float scaleY = (float)frame.height() / (float)previewFrame.height();
                List currentPossible = this.possibleResultPoints;
                List currentLast = this.lastPossibleResultPoints;
                Iterator i$;
                ResultPoint point;
                if(currentPossible.isEmpty()) {
                    this.lastPossibleResultPoints = null;
                } else {
                    this.possibleResultPoints = new ArrayList(5);
                    this.lastPossibleResultPoints = currentPossible;
                    this.paint.setAlpha(160);
                    this.paint.setColor(this.resultPointColor);
                    synchronized(currentPossible) {
                        i$ = currentPossible.iterator();

                        while(i$.hasNext()) {
                            point = (ResultPoint)i$.next();
                            canvas.drawCircle((float)(frame.left + (int)(point.getX() * scaleX)), (float)(frame.top + (int)(point.getY() * scaleY)), 6.0F, this.paint);
                        }
                    }
                }

                if(currentLast != null) {
                    this.paint.setAlpha(80);
                    this.paint.setColor(this.resultPointColor);
                    synchronized(currentLast) {
                        i$ = currentLast.iterator();

                        while(i$.hasNext()) {
                            point = (ResultPoint)i$.next();
                            canvas.drawCircle((float)(frame.left + (int)(point.getX() * scaleX)), (float)(frame.top + (int)(point.getY() * scaleY)), 3.0F, this.paint);
                        }
                    }
                }

                this.postInvalidateDelayed(80L, frame.left, frame.top, frame.right, frame.bottom);
            }

            LinearLayout layout = new LinearLayout(context);

            labelText = new TextView(context);
            labelText.setVisibility(View.VISIBLE);
            labelText.setText(labelString != null ? labelString : context.getString(R.string.bardcode_scan_dummy_label));
            labelText.setTextColor(getResources().getColor(android.R.color.white));
            layout.addView(labelText);

            layout.measure(canvas.getWidth(), canvas.getHeight());
            layout.layout(0, 0, canvas.getWidth(), canvas.getHeight());

            // To place the text view somewhere specific:
            canvas.translate((Utils.getScreenWidth(context) / 2 - labelText.getWidth() / 2), (float)(frame.bottom + 1) - Utils.dpToPx(100 , context) );

            layout.draw(canvas);
        }
    }

    TextView labelText;
    String labelString;
    public void setLabelPlaceHolder(String labeltextString) {
        labelString = labeltextString;
        labelText.setText(labelString);
    }

    public void drawViewfinder() {
        this.resultBitmap = null;
        this.invalidate();
    }

    public void drawResultBitmap(Bitmap barcode) {
        this.resultBitmap = barcode;
        this.invalidate();
    }

    public void addPossibleResultPoint(ResultPoint point) {
        List points = this.possibleResultPoints;
        synchronized(point) {
            points.add(point);
            int size = points.size();
            if(size > 20) {
                points.subList(0, size - 10).clear();
            }
        }
    }
}
