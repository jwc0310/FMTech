import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Locale;

final class lrs
  extends BroadcastReceiver
{
  static String a(int paramInt)
  {
    String str = String.valueOf("com.google.android.libraries.social.sync.impl.SyncAlarmListner.ACTION_SYNC_ALARM");
    return 11 + String.valueOf(str).length() + str + paramInt;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    lrw locallrw = (lrw)mbb.a(paramContext, lrw.class);
    int i = paramIntent.getIntExtra("account_id", -1);
    locallrw.c(i);
    if (!locallrw.f.c(i)) {
      if (Log.isLoggable("SyncletManager", 3))
      {
        Locale localLocale2 = Locale.US;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i);
        String.format(localLocale2, "requestSyncNow called with invalid account %d", arrayOfObject2);
      }
    }
    do
    {
      return;
      ((lrj)mbb.a(locallrw.d, lrj.class)).a(i);
    } while (!Log.isLoggable("SyncletManager", 3));
    Locale localLocale1 = Locale.US;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(i);
    String.format(localLocale1, "requestSyncNow called with account %d", arrayOfObject1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lrs
 * JD-Core Version:    0.7.0.1
 */