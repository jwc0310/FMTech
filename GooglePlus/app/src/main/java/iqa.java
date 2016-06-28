import android.content.Context;
import android.content.SharedPreferences;

public final class iqa
  implements ioz
{
  private SharedPreferences a;
  
  public iqa(Context paramContext)
  {
    this.a = paramContext.getSharedPreferences(String.valueOf(paramContext.getPackageName()).concat("_preferences"), 0);
  }
  
  public final boolean a()
  {
    return this.a.getBoolean("overlay_key", false);
  }
  
  public final boolean a(String paramString)
  {
    return paramString.startsWith("W");
  }
  
  public final boolean b()
  {
    return this.a.getBoolean("com.google.android.libraries.social.media.settings.MediaSettings.low_bandwidth_key", false);
  }
  
  public final boolean c()
  {
    return this.a.getBoolean("automatic_quality_key", true);
  }
  
  public final String d()
  {
    return this.a.getString("standard_quality_key", "WL80");
  }
  
  public final String e()
  {
    return this.a.getString("low_quality_key", "WL60");
  }
  
  public final String f()
  {
    return this.a.getString("very_low_quality_key", "WL40");
  }
  
  public final boolean g()
  {
    return this.a.getBoolean("automatic_network_key", true);
  }
  
  public final String h()
  {
    return this.a.getString("network_classification_key", "standard_speed");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqa
 * JD-Core Version:    0.7.0.1
 */