package parknshop.parknshopapp.Utils;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 29/4/16.
 */
public class PermissionCheckingUtil {

        public static final int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 1;
        public static final int MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 2;

        Context mContext;

        public PermissionCheckingUtil(Context context){
            this.mContext = context;
        }

        public boolean checkReadContactsPermission(Fragment fragment){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (mContext.checkSelfPermission(Manifest.permission.READ_CONTACTS)
                        != PackageManager.PERMISSION_GRANTED) {

                    if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.READ_CONTACTS) == PackageManager.PERMISSION_GRANTED) {
//                    if (FragmentCompat.shouldShowRequestPermissionRationale(fragment, Manifest.permission.READ_CONTACTS)) {
                        showAskPermissionDialog(fragment, Manifest.permission.READ_CONTACTS, MY_PERMISSIONS_REQUEST_READ_CONTACTS, mContext.getString(R.string.permission_contacts));

                    }
                    return false;
                }
            }
            return true;
        }

        public boolean checkFineLocationPermission(final Fragment fragment){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (mContext.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)
                        != PackageManager.PERMISSION_GRANTED) {

                    if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
//                    if (FragmentCompat.shouldShowRequestPermissionRationale(fragment, Manifest.permission.ACCESS_FINE_LOCATION)) {
                        showAskPermissionDialog(fragment, Manifest.permission.ACCESS_FINE_LOCATION, MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION, mContext.getString(R.string.permission_location));

                    }
                    return false;
                }
            }
            return true;
        }

        public void showAskPermissionDialog(final Fragment fragment, final String permission,  final int requestCode, String msg){
            AlertDialog.Builder ab = new AlertDialog.Builder(mContext);
            ab.setTitle(mContext.getString(R.string.permission_title));
            ab.setMessage(msg);

            ab.setPositiveButton(
                    mContext.getText(R.string.btn_ok),
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            ActivityCompat.requestPermissions(fragment.getActivity(), new String[]{permission}, requestCode);
//                            FragmentCompat.requestPermissions(fragment,
//                                    new String[]{permission},
//                                    requestCode);
                        }
                    });
            ab.setNegativeButton(
                    mContext.getText(R.string.btn_close),
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            ab.create().show();
        }
}
