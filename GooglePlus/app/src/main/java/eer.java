import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eer
{
  @Deprecated
  public static final int a = 7895000;
  private static boolean b = false;
  private static boolean c = false;
  private static int d = -1;
  private static final Object e = new Object();
  private static String f = null;
  private static Integer g = null;
  private static AtomicBoolean h = new AtomicBoolean();
  
  @Deprecated
  public static int a(Context paramContext)
  {
    int i = 9;
    if (ehy.a)
    {
      i = 0;
      return i;
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    Integer localInteger;
    for (;;)
    {
      try
      {
        paramContext.getResources().getString(efj.Cj);
        if ("com.google.android.gms".equals(paramContext.getPackageName())) {
          break label282;
        }
      }
      catch (Throwable localThrowable)
      {
        synchronized (e)
        {
          if (f == null)
          {
            f = paramContext.getPackageName();
            try
            {
              Bundle localBundle = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
              if (localBundle == null) {
                continue;
              }
              g = Integer.valueOf(localBundle.getInt("com.google.android.gms.version"));
            }
            catch (PackageManager.NameNotFoundException localNameNotFoundException4)
            {
              Log.wtf("GooglePlayServicesUtil", "This should never happen.", localNameNotFoundException4);
              continue;
            }
            localInteger = g;
            if (localInteger != null) {
              break;
            }
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            localThrowable = localThrowable;
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
            continue;
            g = null;
          }
        }
      }
      if (!f.equals(paramContext.getPackageName())) {
        throw new IllegalArgumentException("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '" + f + "' and this call used package '" + paramContext.getPackageName() + "'.");
      }
    }
    if (localInteger.intValue() != a) {
      throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + a + " but found " + localInteger + ".  You must have the following declaration within the <application> element: " + "    <meta-data android:name=\"com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
    }
    label282:
    PackageInfo localPackageInfo;
    label407:
    do
    {
      for (;;)
      {
        try
        {
          localPackageInfo = localPackageManager.getPackageInfo("com.google.android.gms", 64);
          if (localPackageInfo.versionCode % 1000 / 100 == 3)
          {
            j = 1;
            if ((j == 0) && (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch"))) {
              break label407;
            }
            if (eet.a(localPackageInfo, epg.a) == null) {
              break;
            }
            int k = a / 1000;
            if (localPackageInfo.versionCode / 1000 >= k) {
              break label475;
            }
            new StringBuilder("Google Play services out of date.  Requires ").append(a).append(" but found ").append(localPackageInfo.versionCode);
            return 2;
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException1)
        {
          return 1;
        }
        int j = 0;
        continue;
        try
        {
          ejx localejx1 = eet.a(localPackageManager.getPackageInfo("com.android.vending", 64), epg.a);
          if (localejx1 == null) {
            break;
          }
          ejx localejx2 = eet.a(localPackageInfo, new ejx[] { localejx1 });
          if (localejx2 == null) {
            return i;
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException3) {}
      }
      if (!a(paramContext, "com.android.vending")) {
        break;
      }
    } while (eet.a(localPackageInfo, epg.a) != null);
    return i;
    label475:
    Object localObject1 = localPackageInfo.applicationInfo;
    if (localObject1 == null) {}
    try
    {
      ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
      localObject1 = localApplicationInfo;
      if (!((ApplicationInfo)localObject1).enabled) {
        return 3;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException2)
    {
      Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
      localNameNotFoundException2.printStackTrace();
      return 1;
    }
    return 0;
  }
  
  @Deprecated
  public static Dialog a(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return b(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
  }
  
  @Deprecated
  public static Intent a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
    case 2: 
      return eis.b("com.google.android.gms");
    case 42: 
      return eis.a();
    }
    return eis.a("com.google.android.gms");
  }
  
  @Deprecated
  public static void a(int paramInt, Context paramContext)
  {
    if ((paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch")) && (paramInt == 2)) {
      paramInt = 42;
    }
    if (!b(paramContext, paramInt)) {
      if (paramInt != 9) {
        break label70;
      }
    }
    label70:
    for (boolean bool = a(paramContext, "com.android.vending"); bool; bool = false)
    {
      ees localees = new ees(paramContext);
      localees.sendMessageDelayed(localees.obtainMessage(1), 120000L);
      return;
    }
    Resources localResources1 = paramContext.getResources();
    String str1 = e(paramContext);
    Resources localResources2 = paramContext.getResources();
    String str2;
    Resources localResources3;
    String str3;
    label374:
    Intent localIntent;
    PendingIntent localPendingIntent;
    switch (paramInt)
    {
    default: 
      Log.e("GoogleApiAvailability", "Unexpected error code " + paramInt);
      str2 = null;
      if (str2 == null) {
        str2 = localResources1.getString(efj.Cg);
      }
      localResources3 = paramContext.getResources();
      switch (paramInt)
      {
      default: 
        str3 = localResources3.getString(efj.Cj);
        localIntent = a(paramInt);
        localPendingIntent = null;
        if (localIntent == null)
        {
          label388:
          if (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            break label1066;
          }
          if (Build.VERSION.SDK_INT < 16) {
            break label889;
          }
        }
        break;
      }
      break;
    }
    label889:
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        break label895;
      }
      throw new IllegalStateException();
      str2 = null;
      break;
      str2 = localResources2.getString(efj.Cb);
      break;
      str2 = localResources2.getString(efj.BX);
      break;
      str2 = localResources2.getString(efj.Cq);
      break;
      str2 = localResources2.getString(efj.Co);
      break;
      str2 = localResources2.getString(efj.BT);
      break;
      Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
      str2 = localResources2.getString(efj.Cl);
      break;
      Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
      str2 = localResources2.getString(efj.Cf);
      break;
      Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
      str2 = null;
      break;
      Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
      str2 = null;
      break;
      Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
      str2 = localResources2.getString(efj.Cd);
      break;
      Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
      str2 = null;
      break;
      Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
      str2 = null;
      break;
      Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
      str2 = localResources2.getString(efj.Ci);
      break;
      if (efj.a(localResources3))
      {
        str3 = localResources3.getString(efj.Ca, new Object[] { str1 });
        break label374;
      }
      str3 = localResources3.getString(efj.BZ, new Object[] { str1 });
      break label374;
      str3 = localResources3.getString(efj.Cp, new Object[] { str1 });
      break label374;
      str3 = localResources3.getString(efj.Cn, new Object[] { str1 });
      break label374;
      str3 = localResources3.getString(efj.BR, new Object[] { str1 });
      break label374;
      str3 = localResources3.getString(efj.BW, new Object[] { str1 });
      break label374;
      str3 = localResources3.getString(efj.Ck, new Object[] { str1 });
      break label374;
      str3 = localResources3.getString(efj.Ce);
      break label374;
      str3 = localResources3.getString(efj.Cc);
      break label374;
      str3 = localResources3.getString(efj.BU, new Object[] { str1 });
      break label374;
      str3 = localResources3.getString(efj.Ch);
      break label374;
      localPendingIntent = PendingIntent.getActivity(paramContext, 0, localIntent, 268435456);
      break label388;
    }
    label895:
    Object localObject = new Notification.Builder(paramContext).setSmallIcon(efj.BQ).setPriority(2).setAutoCancel(true).setStyle(new Notification.BigTextStyle().bigText(str2 + " " + str3)).addAction(efj.BP, localResources1.getString(efj.Cr), localPendingIntent).build();
    int j;
    switch (paramInt)
    {
    default: 
      j = 0;
      label1031:
      if (j != 0) {
        h.set(false);
      }
      break;
    }
    for (int k = 10436;; k = 39789)
    {
      ((NotificationManager)paramContext.getSystemService("notification")).notify(k, (Notification)localObject);
      return;
      label1066:
      String str4 = localResources1.getString(efj.Cg);
      int i;
      label1087:
      Notification.Builder localBuilder;
      int m;
      label1143:
      int n;
      if (Build.VERSION.SDK_INT >= 11)
      {
        i = 1;
        if (i == 0) {
          break label1251;
        }
        localBuilder = new Notification.Builder(paramContext).setSmallIcon(17301642).setContentTitle(str2).setContentText(str3).setContentIntent(localPendingIntent).setTicker(str4).setAutoCancel(true);
        if (Build.VERSION.SDK_INT < 20) {
          break label1229;
        }
        m = 1;
        if (m != 0) {
          localBuilder.setLocalOnly(true);
        }
        if (Build.VERSION.SDK_INT < 16) {
          break label1235;
        }
        n = 1;
        label1166:
        if (n == 0) {
          break label1241;
        }
        localBuilder.setStyle(new Notification.BigTextStyle().bigText(str3));
      }
      label1229:
      label1235:
      label1241:
      for (Notification localNotification2 = localBuilder.build();; localNotification2 = localBuilder.getNotification())
      {
        if (Build.VERSION.SDK_INT == 19) {
          localNotification2.extras.putBoolean("android.support.localOnly", true);
        }
        localObject = localNotification2;
        break;
        i = 0;
        break label1087;
        m = 0;
        break label1143;
        n = 0;
        break label1166;
      }
      label1251:
      Notification localNotification1 = new Notification(17301642, str4, System.currentTimeMillis());
      localNotification1.flags = (0x10 | localNotification1.flags);
      localNotification1.setLatestEventInfo(paramContext, str2, str3, localPendingIntent);
      localObject = localNotification1;
      break;
      j = 1;
      break label1031;
    }
  }
  
  @Deprecated
  public static void a(PackageManager paramPackageManager, String paramString)
  {
    if (!eet.a.a(paramPackageManager, paramString)) {
      throw new SecurityException("Signature check failed for " + paramString);
    }
  }
  
  @Deprecated
  public static boolean a(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return a(paramInt1, paramActivity, null, 0, null);
  }
  
  public static boolean a(int paramInt1, Activity paramActivity, bk parambk, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Dialog localDialog1 = b(paramInt1, paramActivity, parambk, paramInt2, paramOnCancelListener);
    if (localDialog1 == null) {
      return false;
    }
    if ((paramActivity instanceof bp))
    {
      bz localbz = ((bp)paramActivity).b.a.d;
      eeu localeeu = new eeu();
      Dialog localDialog3 = (Dialog)efj.b(localDialog1, "Cannot display null dialog");
      localDialog3.setOnCancelListener(null);
      localDialog3.setOnDismissListener(null);
      localeeu.Z = localDialog3;
      if (paramOnCancelListener != null) {
        localeeu.aa = paramOnCancelListener;
      }
      localeeu.a(localbz, "GooglePlayServicesErrorDialog");
    }
    for (;;)
    {
      return true;
      int i = Build.VERSION.SDK_INT;
      int j = 0;
      if (i >= 11) {
        j = 1;
      }
      if (j == 0) {
        break;
      }
      FragmentManager localFragmentManager = paramActivity.getFragmentManager();
      een localeen = new een();
      Dialog localDialog2 = (Dialog)efj.b(localDialog1, "Cannot display null dialog");
      localDialog2.setOnCancelListener(null);
      localDialog2.setOnDismissListener(null);
      localeen.a = localDialog2;
      if (paramOnCancelListener != null) {
        localeen.b = paramOnCancelListener;
      }
      localeen.show(localFragmentManager, "GooglePlayServicesErrorDialog");
    }
    throw new RuntimeException("This Activity does not support Fragments.");
  }
  
  public static boolean a(Context paramContext, int paramInt)
  {
    if (a(paramContext, paramInt, "com.google.android.gms"))
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (eet.a.a(localPackageManager, "com.google.android.gms")) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean a(Context paramContext, int paramInt, String paramString)
  {
    int i;
    AppOpsManager localAppOpsManager;
    if (Build.VERSION.SDK_INT >= 19)
    {
      i = 1;
      if (i == 0) {
        break label44;
      }
      localAppOpsManager = (AppOpsManager)paramContext.getSystemService("appops");
    }
    for (;;)
    {
      label44:
      try
      {
        localAppOpsManager.checkPackage(paramInt, paramString);
        bool = true;
        return bool;
      }
      catch (SecurityException localSecurityException) {}
      i = 0;
      break;
      String[] arrayOfString = paramContext.getPackageManager().getPackagesForUid(paramInt);
      boolean bool = false;
      if (arrayOfString != null) {
        for (int j = 0;; j++)
        {
          int k = arrayOfString.length;
          bool = false;
          if (j >= k) {
            break;
          }
          if (paramString.equals(arrayOfString[j])) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private static boolean a(Context paramContext, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (int i = 1; i != 0; i = 0)
    {
      Iterator localIterator = paramContext.getPackageManager().getPackageInstaller().getAllSessions().iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (!paramString.equals(((PackageInstaller.SessionInfo)localIterator.next()).getAppPackageName()));
      return true;
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      boolean bool = localPackageManager.getApplicationInfo(paramString, 8192).enabled;
      if (bool) {
        return true;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  public static boolean a(PackageManager paramPackageManager)
  {
    return (b(paramPackageManager)) || (!"user".equals(Build.TYPE));
  }
  
  private static Dialog b(int paramInt1, Activity paramActivity, bk parambk, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    if (paramInt1 == 0) {
      return null;
    }
    if ((paramActivity.getPackageManager().hasSystemFeature("android.hardware.type.watch")) && (paramInt1 == 2)) {
      paramInt1 = 42;
    }
    int i;
    if (Build.VERSION.SDK_INT >= 14)
    {
      i = 1;
      if (i == 0) {
        break label610;
      }
      TypedValue localTypedValue = new TypedValue();
      paramActivity.getTheme().resolveAttribute(16843529, localTypedValue, true);
      if (!"Theme.Dialog.Alert".equals(paramActivity.getResources().getResourceEntryName(localTypedValue.resourceId))) {
        break label610;
      }
    }
    label163:
    label610:
    for (AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity, 5);; localBuilder = null)
    {
      if (localBuilder == null) {
        localBuilder = new AlertDialog.Builder(paramActivity);
      }
      localBuilder.setMessage(efj.l(paramActivity, paramInt1, e(paramActivity)));
      if (paramOnCancelListener != null) {
        localBuilder.setOnCancelListener(paramOnCancelListener);
      }
      Intent localIntent = a(paramInt1);
      ehz localehz;
      Resources localResources;
      Object localObject;
      if (parambk == null)
      {
        localehz = new ehz(paramActivity, localIntent, paramInt2);
        String str = efj.p(paramActivity, paramInt1);
        if (str != null) {
          localBuilder.setPositiveButton(str, localehz);
        }
        localResources = paramActivity.getResources();
        localObject = null;
        switch (paramInt1)
        {
        default: 
          Log.e("GoogleApiAvailability", "Unexpected error code " + paramInt1);
        }
      }
      for (;;)
      {
        if (localObject != null) {
          localBuilder.setTitle((CharSequence)localObject);
        }
        return localBuilder.create();
        i = 0;
        break;
        localehz = new ehz(parambk, localIntent, paramInt2);
        break label163;
        localObject = localResources.getString(efj.Cb);
        continue;
        localObject = localResources.getString(efj.BX);
        continue;
        localObject = localResources.getString(efj.Cq);
        continue;
        localObject = localResources.getString(efj.Co);
        continue;
        localObject = localResources.getString(efj.BT);
        continue;
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        localObject = localResources.getString(efj.Cl);
        continue;
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        localObject = localResources.getString(efj.Cf);
        continue;
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        localObject = null;
        continue;
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        localObject = null;
        continue;
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        localObject = localResources.getString(efj.Cd);
        continue;
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        localObject = null;
        continue;
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        localObject = null;
        continue;
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        localObject = localResources.getString(efj.Ci);
      }
    }
  }
  
  @Deprecated
  public static void b(Context paramContext)
  {
    int i = a(paramContext);
    if (i != 0)
    {
      Intent localIntent = a(i);
      Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + i);
      if (localIntent == null) {
        throw new eep(i);
      }
      throw new eeq(i, "Google Play Services not available", localIntent);
    }
  }
  
  @Deprecated
  public static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    default: 
      return false;
    }
    return true;
  }
  
  @Deprecated
  public static boolean b(Context paramContext, int paramInt)
  {
    if (paramInt == 18) {
      return true;
    }
    if (paramInt == 1) {
      return a(paramContext, "com.google.android.gms");
    }
    return false;
  }
  
  private static boolean b(PackageManager paramPackageManager)
  {
    synchronized (e)
    {
      int i = d;
      if (i == -1) {}
      try
      {
        PackageInfo localPackageInfo = paramPackageManager.getPackageInfo("com.google.android.gms", 64);
        ejx[] arrayOfejx = new ejx[1];
        arrayOfejx[0] = ejw.b[1];
        if (eet.a(localPackageInfo, arrayOfejx) != null) {}
        for (d = 1; d != 0; d = 0) {
          return true;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;)
        {
          d = 0;
        }
      }
    }
    return false;
  }
  
  @Deprecated
  public static boolean b(PackageManager paramPackageManager, String paramString)
  {
    return eet.a.a(paramPackageManager, paramString);
  }
  
  private static void c(int paramInt, Context paramContext)
  {
    Resources localResources1 = paramContext.getResources();
    String str1 = e(paramContext);
    Resources localResources2 = paramContext.getResources();
    String str2;
    Resources localResources3;
    String str3;
    label298:
    Intent localIntent;
    PendingIntent localPendingIntent;
    switch (paramInt)
    {
    default: 
      Log.e("GoogleApiAvailability", "Unexpected error code " + paramInt);
      str2 = null;
      if (str2 == null) {
        str2 = localResources1.getString(efj.Cg);
      }
      localResources3 = paramContext.getResources();
      switch (paramInt)
      {
      default: 
        str3 = localResources3.getString(efj.Cj);
        localIntent = a(paramInt);
        localPendingIntent = null;
        if (localIntent == null)
        {
          label312:
          if (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            break label982;
          }
          if (Build.VERSION.SDK_INT < 16) {
            break label805;
          }
        }
        break;
      }
      break;
    }
    label805:
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        break label811;
      }
      throw new IllegalStateException();
      str2 = null;
      break;
      str2 = localResources2.getString(efj.Cb);
      break;
      str2 = localResources2.getString(efj.BX);
      break;
      str2 = localResources2.getString(efj.Cq);
      break;
      str2 = localResources2.getString(efj.Co);
      break;
      str2 = localResources2.getString(efj.BT);
      break;
      Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
      str2 = localResources2.getString(efj.Cl);
      break;
      Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
      str2 = localResources2.getString(efj.Cf);
      break;
      Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
      str2 = null;
      break;
      Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
      str2 = null;
      break;
      Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
      str2 = localResources2.getString(efj.Cd);
      break;
      Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
      str2 = null;
      break;
      Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
      str2 = null;
      break;
      Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
      str2 = localResources2.getString(efj.Ci);
      break;
      if (efj.a(localResources3))
      {
        str3 = localResources3.getString(efj.Ca, new Object[] { str1 });
        break label298;
      }
      str3 = localResources3.getString(efj.BZ, new Object[] { str1 });
      break label298;
      str3 = localResources3.getString(efj.Cp, new Object[] { str1 });
      break label298;
      str3 = localResources3.getString(efj.Cn, new Object[] { str1 });
      break label298;
      str3 = localResources3.getString(efj.BR, new Object[] { str1 });
      break label298;
      str3 = localResources3.getString(efj.BW, new Object[] { str1 });
      break label298;
      str3 = localResources3.getString(efj.Ck, new Object[] { str1 });
      break label298;
      str3 = localResources3.getString(efj.Ce);
      break label298;
      str3 = localResources3.getString(efj.Cc);
      break label298;
      str3 = localResources3.getString(efj.BU, new Object[] { str1 });
      break label298;
      str3 = localResources3.getString(efj.Ch);
      break label298;
      localPendingIntent = PendingIntent.getActivity(paramContext, 0, localIntent, 268435456);
      break label312;
    }
    label811:
    Object localObject = new Notification.Builder(paramContext).setSmallIcon(efj.BQ).setPriority(2).setAutoCancel(true).setStyle(new Notification.BigTextStyle().bigText(str2 + " " + str3)).addAction(efj.BP, localResources1.getString(efj.Cr), localPendingIntent).build();
    int j;
    switch (paramInt)
    {
    default: 
      j = 0;
      label947:
      if (j != 0) {
        h.set(false);
      }
      break;
    }
    for (int k = 10436;; k = 39789)
    {
      ((NotificationManager)paramContext.getSystemService("notification")).notify(k, (Notification)localObject);
      return;
      label982:
      String str4 = localResources1.getString(efj.Cg);
      int i;
      label1002:
      Notification.Builder localBuilder;
      int m;
      label1058:
      int n;
      if (Build.VERSION.SDK_INT >= 11)
      {
        i = 1;
        if (i == 0) {
          break label1166;
        }
        localBuilder = new Notification.Builder(paramContext).setSmallIcon(17301642).setContentTitle(str2).setContentText(str3).setContentIntent(localPendingIntent).setTicker(str4).setAutoCancel(true);
        if (Build.VERSION.SDK_INT < 20) {
          break label1144;
        }
        m = 1;
        if (m != 0) {
          localBuilder.setLocalOnly(true);
        }
        if (Build.VERSION.SDK_INT < 16) {
          break label1150;
        }
        n = 1;
        label1081:
        if (n == 0) {
          break label1156;
        }
        localBuilder.setStyle(new Notification.BigTextStyle().bigText(str3));
      }
      label1156:
      for (Notification localNotification2 = localBuilder.build();; localNotification2 = localBuilder.getNotification())
      {
        if (Build.VERSION.SDK_INT == 19) {
          localNotification2.extras.putBoolean("android.support.localOnly", true);
        }
        localObject = localNotification2;
        break;
        i = 0;
        break label1002;
        label1144:
        m = 0;
        break label1058;
        label1150:
        n = 0;
        break label1081;
      }
      label1166:
      Notification localNotification1 = new Notification(17301642, str4, System.currentTimeMillis());
      localNotification1.flags = (0x10 | localNotification1.flags);
      localNotification1.setLatestEventInfo(paramContext, str2, str3, localPendingIntent);
      localObject = localNotification1;
      break;
      j = 1;
      break label947;
    }
  }
  
  @Deprecated
  public static void c(Context paramContext)
  {
    if (h.getAndSet(true)) {
      return;
    }
    try
    {
      ((NotificationManager)paramContext.getSystemService("notification")).cancel(10436);
      return;
    }
    catch (SecurityException localSecurityException) {}
  }
  
  public static Context d(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public static String e(Context paramContext)
  {
    String str = paramContext.getApplicationInfo().name;
    PackageManager localPackageManager;
    if (TextUtils.isEmpty(str))
    {
      str = paramContext.getPackageName();
      localPackageManager = paramContext.getApplicationContext().getPackageManager();
    }
    try
    {
      ApplicationInfo localApplicationInfo2 = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 0);
      localApplicationInfo1 = localApplicationInfo2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        ApplicationInfo localApplicationInfo1 = null;
      }
    }
    if (localApplicationInfo1 != null) {
      str = localPackageManager.getApplicationLabel(localApplicationInfo1).toString();
    }
    return str;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eer
 * JD-Core Version:    0.7.0.1
 */