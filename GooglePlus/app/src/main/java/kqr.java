import android.content.Context;
import java.util.Locale;

public final class kqr
  implements gwv
{
  public final int a;
  public final String b;
  
  public kqr(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    return paramgwx.a(paramContext);
  }
  
  public final void a(Context paramContext) {}
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.b;
    return String.format(localLocale, "ReferrerEvent source=%d, referrer=%s", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kqr
 * JD-Core Version:    0.7.0.1
 */