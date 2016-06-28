import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import java.io.File;

public final class mdc
  extends bj
  implements DialogInterface.OnClickListener
{
  public final Dialog c(Bundle paramBundle)
  {
    bp localbp = f();
    try
    {
      PackageManager localPackageManager = localbp.getPackageManager();
      ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo(localbp.getPackageName(), 0);
      localObject = null;
      if (localApplicationInfo != null)
      {
        CharSequence localCharSequence = localPackageManager.getApplicationLabel(localApplicationInfo);
        localObject = localCharSequence;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        AlertDialog.Builder localBuilder;
        Object localObject = null;
      }
    }
    if (localObject == null) {
      localObject = localbp.getString(efj.aaX);
    }
    localBuilder = new AlertDialog.Builder(localbp);
    localBuilder.setTitle(localbp.getString(efj.aaZ, new Object[] { localObject }));
    localBuilder.setMessage(localbp.getString(efj.aaY, new Object[] { localObject }));
    localBuilder.setPositiveButton(17039370, this);
    localBuilder.setCancelable(true);
    return localBuilder.create();
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bp localbp = f();
    if (localbp != null) {
      localbp.finish();
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    }
    bp localbp = f();
    new File(localbp.getFilesDir(), "corrupted_install").delete();
    String str1 = String.valueOf(localbp.getPackageName());
    if (str1.length() != 0) {}
    for (String str2 = "market://details?id=".concat(str1);; str2 = new String("market://details?id="))
    {
      localbp.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
      localbp.finish();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mdc
 * JD-Core Version:    0.7.0.1
 */