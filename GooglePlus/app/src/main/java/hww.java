import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class hww
{
  public final Context a;
  
  public hww(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final String a(String paramString)
  {
    int i = efj.E(this.a);
    return 11 + String.valueOf(paramString).length() + i + paramString;
  }
  
  public final boolean a()
  {
    return "recommended".equals(this.a.getSharedPreferences("es-app-upgrade-preferences", 0).getString(a(".app_upgrade.status"), null));
  }
  
  public final void b()
  {
    this.a.getSharedPreferences("es-app-upgrade-preferences", 0).edit().putString(a(".app_upgrade.status"), "required").putBoolean(a(".app_upgrade.show"), true).apply();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hww
 * JD-Core Version:    0.7.0.1
 */