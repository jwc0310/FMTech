import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public final class ike
  extends gzf
{
  private final String a;
  private final boolean b;
  
  public ike(Context paramContext, String paramString, boolean paramBoolean)
  {
    super(paramContext, "SaveBooleanPreferenceTask");
    this.a = paramString;
    this.b = paramBoolean;
  }
  
  protected final hae a()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(g()).edit();
    localEditor.putBoolean(this.a, this.b);
    localEditor.apply();
    return new hae(200, null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ike
 * JD-Core Version:    0.7.0.1
 */