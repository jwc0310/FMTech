import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class htz
  implements kex
{
  htz(hty paramhty, String paramString, kej paramkej) {}
  
  public final boolean a(ket paramket, Object paramObject)
  {
    mbf localmbf = this.c.bn;
    localmbf.getSharedPreferences(String.valueOf(localmbf.getPackageName()).concat("_preferences"), 0).edit().putString(this.a, paramObject.toString()).apply();
    String str = (String)this.b.a[this.b.c(paramObject.toString())];
    this.b.a_(str);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     htz
 * JD-Core Version:    0.7.0.1
 */