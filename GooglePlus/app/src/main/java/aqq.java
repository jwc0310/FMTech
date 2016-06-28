import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.android.apps.photos.backuppromo.BackupPromoActivity;

public final class aqq
  implements hat
{
  private static final int a = aaw.gi;
  private final Context b;
  private final hba c;
  private final hyi d;
  
  public aqq(Context paramContext)
  {
    this.b = paramContext;
    this.c = ((hba)mbb.a(paramContext, hba.class));
    this.d = ((hyi)mbb.a(paramContext, hyi.class));
  }
  
  public final void a()
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.b);
    int i = this.c.d();
    int j;
    if (i == -1)
    {
      if (Log.isLoggable("BackupPromoManager", 6)) {
        Log.e("BackupPromoManager", "Invalid account id.");
      }
      j = 0;
    }
    for (;;)
    {
      if (j != 0)
      {
        NotificationManager localNotificationManager = (NotificationManager)this.b.getSystemService("notification");
        dk localdk = new dk(this.b);
        localdk.a(16, true);
        localdk.r = true;
        localdk.u = this.b.getResources().getColor(efj.jY);
        int k = efj.sc;
        localdk.x.icon = k;
        localdk.b = dk.a(this.b.getResources().getString(aau.oO));
        localdk.c = dk.a(this.b.getResources().getString(aau.oN));
        Context localContext = this.b;
        Intent localIntent = new Intent(localContext, BackupPromoActivity.class);
        localIntent.setAction("android.intent.action.VIEW");
        localdk.d = PendingIntent.getActivity(localContext, 0, localIntent, 134217728);
        Notification localNotification = localdk.b();
        localNotificationManager.notify("com.google.android.apps.photos.backuppromo.BackupPromoNotification", a, localNotification);
        PreferenceManager.getDefaultSharedPreferences(this.b).edit().putBoolean("backup_promo_notification_shown", true).apply();
      }
      return;
      if ((!hbj.a(this.b)) && (cux.a(this.b, i)) && (this.d.b(bwb.J, i)) && (!localSharedPreferences.getBoolean("backup_promo_notification_shown", false))) {
        j = 1;
      } else {
        j = 0;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aqq
 * JD-Core Version:    0.7.0.1
 */