import android.content.Context;
import java.util.Locale;

public final class kqs
  implements gwv
{
  public final int a;
  public final float b;
  public final rne[] c;
  private final String d;
  
  public kqs(String paramString, int paramInt, float paramFloat, rne[] paramArrayOfrne)
  {
    this.d = paramString;
    this.a = paramInt;
    this.b = paramFloat;
    this.c = paramArrayOfrne;
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    return this.d;
  }
  
  public final void a(Context paramContext) {}
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Float.valueOf(this.b);
    arrayOfObject[2] = this.c;
    return String.format(localLocale, "RpcFailureEvent networkType=%d, networkSpeedMbps=%f, requestPath=%s", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kqs
 * JD-Core Version:    0.7.0.1
 */