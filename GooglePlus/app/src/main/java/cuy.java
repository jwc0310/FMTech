import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;

final class cuy
  implements gji
{
  public final String a()
  {
    return "notifications_upgraded";
  }
  
  public final void a(Context paramContext, gje paramgje)
  {
    Resources localResources = paramContext.getResources();
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    paramgje.c("push_notifications", localSharedPreferences.getBoolean("notifications_enabled", localResources.getBoolean(efj.jb)));
    paramgje.c("notifications_vibrate", localSharedPreferences.getBoolean("notifications_vibrate", localResources.getBoolean(efj.jc)));
    paramgje.c("notifications_ringtone", localSharedPreferences.getString("notifications_ringtone", localResources.getString(aau.mb)));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cuy
 * JD-Core Version:    0.7.0.1
 */