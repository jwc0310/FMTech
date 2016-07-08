package parknshop.parknshopapp.Fragment.Home;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.zxing.BarcodeFormat;
import com.linkwish.app.zxing.CodeScannerActivityHandler;
import com.linkwish.app.zxing.DecodeFormatManager;
import com.linkwish.app.zxing.SampleCodeScannerActivity;
import com.linkwish.app.zxing.ViewfinderView;
import com.linkwish.app.zxing.camera.CameraManager;

import java.util.Vector;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.R;

/**
 * Created by Howard Chang on 2015/9/1
 */
public class ScanSearchActivity extends SampleCodeScannerActivity {

    private final static String TAG = "ScanSearchActivity";
    public static final int SCAN_REQUEST_CODE = 11;
    public static final String SCAN_CODE = "scan_code";
    public static String GAPrefix = "";

    @Bind(R.id.viewfinder_view) ViewfinderView viewfinderView;
    @Bind(R.id.preview_view) SurfaceView surfaceView;
    @Bind(R.id.tv_scan_tip) TextView tv_scan_tip;


    private Vector<BarcodeFormat> decodeFormats;
    private boolean hasSuccess = false;

//    private SpiceManager spiceManager = new SpiceManager(WatsonsService.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt_scanner);

        GATrackerHelper.getInstance(this).setGATracker("search/barcode-scan");

        ButterKnife.bind(this);
        CameraManager.init(getApplication());

        Point point = getScreenPoint(this);
        Rect rect = CameraManager.get().getFramingRectStatic(point);

        RelativeLayout.LayoutParams rlp = (RelativeLayout.LayoutParams) tv_scan_tip.getLayoutParams();
        rlp.topMargin = rect.bottom + getResources().getDimensionPixelSize(R.dimen.inner_padding);

        decodeFormats = new Vector<BarcodeFormat>();
        decodeFormats.addAll(DecodeFormatManager.ONE_D_FORMATS);
    }

    @Override
    protected void onStart() {

//        spiceManager.start(this);
        super.onStart();
    }

//    private SpiceManager getSpiceManager() {
//        return spiceManager;
//    }

    @Override
    public void finish() {
        if (hasSuccess) {
//            setResult(RESULT_OK);
        }
        super.finish();
    }

    @Override
    protected void onStop() {
//        spiceManager.shouldStop();
        super.onStop();
    }

    @Override
    public ViewfinderView getViewfinderView() {
        return viewfinderView;
    }

    @Override
    protected SurfaceView getSurfaceView() {
        return surfaceView;
    }

    @Override
    protected void handleRawText(String rawText) {
//        test(rawText);
        //tv_scan_tip.setVisibility(View.GONE);
        if (rawText == null || rawText.length() == 0) {
            showFailedDialog("fail");
            return;
        }
        hasSuccess = true;
        successScan(rawText);
    }


    @Override
    protected String getTag() {
        return TAG;
    }


    public static void launchForResult(Activity activity) {
        Intent intent = new Intent(activity, ScanSearchActivity.class);
        activity.startActivityForResult(intent, SCAN_REQUEST_CODE);
    }


    private void successScan(String code) {
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle.putString(SCAN_CODE, code);
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
        finish();
    }


    private void showFailedDialog(String msg) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("fail")
                .setMessage(msg)
                .setPositiveButton("retry", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        resetStatusView();
                        if (getHandler() != null) {
                            getHandler().sendEmptyMessageDelayed(CodeScannerActivityHandler.RESTART_PREVIEW, 1000);
                        }
                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finish();
                    }
                })
                .setCancelable(false)
                .setOnKeyListener(new DialogInterface.OnKeyListener() {
                    @Override
                    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                        if (keyCode == KeyEvent.KEYCODE_SEARCH
                                && event.getRepeatCount() == 0) {
                            // Pretend we processed it
                            return true;
                        }
                        // Any other keys are still processed as normal
                        return false;
                    }
                })
                .create();
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }

    protected Vector<BarcodeFormat> getDecodeFormats() {
        return decodeFormats;
    }

    @Override
    protected void resetStatusView() {
        super.resetStatusView();
        viewfinderView.setVisibility(View.INVISIBLE);
        //tv_scan_tip.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.left_root)
    public void onBack() {
        super.onBackPressed();
    }

    public static Point getScreenPoint(Activity activity) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        return new Point(displaymetrics.widthPixels, displaymetrics.heightPixels);
    }
}