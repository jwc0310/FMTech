import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;

public final class bpv
  implements kbp
{
  private final Context a;
  
  public bpv(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a()
  {
    hww localhww = new hww(this.a);
    localhww.b();
    if (!localhww.a.getSharedPreferences("es-app-upgrade-preferences", 0).getBoolean(localhww.a(".app_upgrade.notification_sent"), false))
    {
      localhww.a.getSharedPreferences("es-app-upgrade-preferences", 0).edit().putBoolean(localhww.a(".app_upgrade.notification_sent"), true).apply();
      Context localContext = this.a;
      NotificationManager localNotificationManager = (NotificationManager)localContext.getSystemService("notification");
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addFlags(524288);
      localIntent.setData(Uri.parse("market://details?id=com.google.android.apps.plus"));
      localIntent.addFlags(335544320);
      PendingIntent localPendingIntent = PendingIntent.getActivity(localContext, dmr.a(), localIntent, 0);
      String str1 = localContext.getString(aau.vh);
      String str2 = localContext.getString(aau.vi);
      Notification localNotification = new Notification.Builder(localContext).setSmallIcon(efj.sc).setContentTitle(str1).setContentText(str2).setTicker(str2).setWhen(System.currentTimeMillis()).setContentIntent(localPendingIntent).setAutoCancel(true).setDefaults(4).getNotification();
      localNotificationManager.notify(String.valueOf(localContext.getPackageName()).concat(":notifications:upgrade"), aaw.gz, localNotification);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpv
 * JD-Core Version:    0.7.0.1
 */