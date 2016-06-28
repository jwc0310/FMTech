import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.service.CastService;

public final class dkn
  extends BroadcastReceiver
{
  public dkn(CastService paramCastService) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("com.google.android.apps.photos.SLIDESHOW_STATE"))
    {
      boolean bool1 = paramIntent.getBooleanExtra("slideshow_playing", false);
      boolean bool2 = this.a.a;
      int i = 0;
      if (bool1 != bool2) {
        i = 1;
      }
      this.a.a = bool1;
      if (i != 0)
      {
        Notification localNotification = this.a.a();
        this.a.startForeground(aaw.aX, localNotification);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkn
 * JD-Core Version:    0.7.0.1
 */