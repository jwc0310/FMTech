import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.social.mediamonitor.MediaMonitor;
import com.google.android.libraries.social.mediamonitor.MediaMonitorIntentService;

public class irf
{
  public volatile boolean a;
  private final Context b;
  private final hgs c;
  private boolean d;
  
  public irf(Context paramContext, hgs paramhgs)
  {
    this.b = paramContext;
    this.c = paramhgs;
  }
  
  public final void a(Intent paramIntent)
  {
    boolean bool = "com.google.android.libraries.social.mediamonitor.FORCE_RESCAN".equals(paramIntent.getAction());
    if ("com.google.android.libraries.social.mediamonitor.FIRE_ALARM".equals(paramIntent.getAction())) {
      this.d = false;
    }
    a(bool);
  }
  
  final void a(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if ((this.d) && (!paramBoolean))
        {
          if (Log.isLoggable("MediaMonitor", 2)) {}
          ire localire = (ire)mbb.b(this.b, ire.class);
          if (localire != null) {
            localire.a();
          }
          return;
        }
        if ((this.a) && (!paramBoolean))
        {
          AlarmManager localAlarmManager = (AlarmManager)this.b.getSystemService("alarm");
          PendingIntent localPendingIntent = PendingIntent.getBroadcast(this.b, 1, new Intent("com.google.android.libraries.social.mediamonitor.FIRE_ALARM"), 268435456);
          localAlarmManager.cancel(localPendingIntent);
          localAlarmManager.set(0, 200L + this.c.a(), localPendingIntent);
          this.d = true;
          continue;
        }
        if (!this.a) {
          break label146;
        }
      }
      finally {}
      if (paramBoolean)
      {
        label146:
        this.a = true;
        MediaMonitor.a(this.b, new Intent(this.b, MediaMonitorIntentService.class));
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     irf
 * JD-Core Version:    0.7.0.1
 */