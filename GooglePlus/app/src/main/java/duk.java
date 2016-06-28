import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

public final class duk
{
  private static final Uri a = Uri.parse("market://search?q=com.android.youtube");
  
  public static Intent a(PackageManager paramPackageManager, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent("com.google.android.apps.plus.VIEW_DEEP_LINK");
    localIntent.setPackage(paramString1);
    localIntent.setData(Uri.parse("vnd.google.deeplink://link/").buildUpon().appendQueryParameter("deep_link_id", paramString2).appendQueryParameter("gplus_source", paramString3).build());
    localIntent.addFlags(335544320);
    if (a(paramPackageManager, localIntent)) {
      return localIntent;
    }
    return null;
  }
  
  public static Intent a(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("market://details?id=%1$s", new Object[] { paramString })));
    localIntent.putExtra("use_direct_purchase", true);
    localIntent.addFlags(524288);
    return localIntent;
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = a(localPackageManager, paramString3, paramString4, paramString5);
    if (localIntent == null)
    {
      localIntent = localPackageManager.getLaunchIntentForPackage(paramString3);
      localIntent.addFlags(335544320);
      if (!a(localPackageManager, localIntent)) {
        break label255;
      }
    }
    for (;;)
    {
      if (Log.isLoggable("DeepLinking", 3))
      {
        String str2 = String.valueOf(localIntent);
        new StringBuilder(62 + String.valueOf(paramString3).length() + String.valueOf(str2).length()).append("Could not resolve continue Intent for ").append(paramString3).append(" falling back to launch ").append(str2);
      }
      int i = (int)System.currentTimeMillis();
      String str1 = paramContext.getString(aau.tN, new Object[] { paramString2, paramString1 });
      PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, i, localIntent, 0);
      Notification localNotification = new Notification.Builder(paramContext).setSmallIcon(efj.sc).setContentTitle(paramContext.getString(aau.cf)).setContentText(str1).setTicker(str1).setWhen(System.currentTimeMillis()).setContentIntent(localPendingIntent).setAutoCancel(true).setDefaults(4).getNotification();
      NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramContext.getPackageName();
      arrayOfObject[1] = paramString3;
      localNotificationManager.notify(String.format("%s:notifications:%s", arrayOfObject), 1000, localNotification);
      return;
      label255:
      localIntent = null;
    }
  }
  
  public static boolean a(PackageManager paramPackageManager)
  {
    try
    {
      ApplicationInfo localApplicationInfo = paramPackageManager.getApplicationInfo("com.android.vending", 0);
      if (localApplicationInfo != null) {
        break label66;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (!Log.isLoggable("DeepLinking", 3)) {}
      String str1 = String.valueOf("com.android.vending not found: ");
      String str2 = String.valueOf(localNameNotFoundException.getMessage());
      if (str2.length() == 0) {
        break label55;
      }
      str1.concat(str2);
      return false;
      label55:
      new String(str1);
      return false;
    }
    return false;
    label66:
    return a(paramPackageManager, new Intent("android.intent.action.VIEW", a));
  }
  
  private static boolean a(PackageManager paramPackageManager, Intent paramIntent)
  {
    if (paramIntent == null) {}
    List localList;
    do
    {
      return false;
      localList = paramPackageManager.queryIntentActivities(paramIntent, 0);
    } while ((localList == null) || (localList.isEmpty()));
    return true;
  }
  
  public static boolean a(PackageManager paramPackageManager, String paramString)
  {
    Iterator localIterator = paramPackageManager.getInstalledApplications(128).iterator();
    while (localIterator.hasNext()) {
      if (((ApplicationInfo)localIterator.next()).packageName.equals(paramString)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     duk
 * JD-Core Version:    0.7.0.1
 */