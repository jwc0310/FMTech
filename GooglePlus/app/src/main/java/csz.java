import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.locations.GcmLocationReportingSuggestionService;
import com.google.android.libraries.social.gcm.GcmBroadcastReceiver;

public final class csz
  implements icc
{
  public final String a()
  {
    return "reporting-suggestion-v2";
  }
  
  public final void a(Context paramContext, Intent paramIntent)
  {
    GcmBroadcastReceiver.a(paramContext, new Intent(paramContext, GcmLocationReportingSuggestionService.class).putExtras(paramIntent.getExtras()));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csz
 * JD-Core Version:    0.7.0.1
 */