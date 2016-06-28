import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;

public final class hto
  implements kcf
{
  public static final mcq a = new mcq("debug.plus.debug_rpc_config");
  final kcf b;
  private final Context c;
  
  public final String a()
  {
    return this.b.a();
  }
  
  public final String a(String paramString)
  {
    String str;
    if ("plusi".equals(paramString))
    {
      str = PreferenceManager.getDefaultSharedPreferences(this.c).getString("debug.plus.frontend.config", null);
      if (TextUtils.isEmpty(str)) {}
    }
    do
    {
      return str;
      if (!"plusdatamixer".equals(paramString)) {
        break;
      }
      str = PreferenceManager.getDefaultSharedPreferences(this.c).getString("debug.plus.datamixer.config", null);
    } while (!TextUtils.isEmpty(str));
    return this.b.a(paramString);
  }
  
  public final String b()
  {
    return this.b.b();
  }
  
  public final boolean c()
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c);
    if (localSharedPreferences.contains("debug.plus.frontend.tracing")) {
      return localSharedPreferences.getBoolean("debug.plus.frontend.tracing", false);
    }
    return this.b.c();
  }
  
  public final String d()
  {
    String str = PreferenceManager.getDefaultSharedPreferences(this.c).getString("tracing_token_key", null);
    if (!TextUtils.isEmpty(str)) {
      return str;
    }
    return this.b.d();
  }
  
  public final String e()
  {
    String str = PreferenceManager.getDefaultSharedPreferences(this.c).getString("tracing_pattern_key", null);
    if (str != null) {
      str = str.trim();
    }
    if (!TextUtils.isEmpty(str)) {
      return str;
    }
    return this.b.e();
  }
  
  public final String f()
  {
    String str = PreferenceManager.getDefaultSharedPreferences(this.c).getString("experiment_override_key", null);
    if (!TextUtils.isEmpty(str)) {
      return str;
    }
    return this.b.f();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hto
 * JD-Core Version:    0.7.0.1
 */