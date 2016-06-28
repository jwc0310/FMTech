import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.gcm.GcmBroadcastReceiver;
import com.google.android.libraries.social.location.GcmLocationService;

public final class ija
  implements icc
{
  public final String a()
  {
    return "location-refresh-v2";
  }
  
  public final void a(Context paramContext, Intent paramIntent)
  {
    GcmBroadcastReceiver.a(paramContext, new Intent(paramContext, GcmLocationService.class).putExtras(paramIntent.getExtras()));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ija
 * JD-Core Version:    0.7.0.1
 */