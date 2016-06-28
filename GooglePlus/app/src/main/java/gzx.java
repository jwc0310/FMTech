import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

final class gzx
  extends gzf
{
  public gzx()
  {
    super("SaveResultsTask");
  }
  
  public final hae a(Context paramContext)
  {
    gzy localgzy = (gzy)mbb.a(paramContext, gzy.class);
    localgzy.f.c();
    PreferenceManager.getDefaultSharedPreferences(localgzy.a).edit().putInt("bom_last_listener_id", localgzy.g).apply();
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gzx
 * JD-Core Version:    0.7.0.1
 */