import android.content.Context;
import java.util.Locale;

public final class kpv
  implements gwv
{
  public final boolean a = efj.j();
  private final String b = null;
  
  public kpv(String paramString) {}
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    if (this.b != null) {
      return this.b;
    }
    return paramgwx.a(paramContext);
  }
  
  public final void a(Context paramContext) {}
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(this.a);
    return String.format(localLocale, "CrashEvent isForegroundCrash=%b", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kpv
 * JD-Core Version:    0.7.0.1
 */