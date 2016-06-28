import android.content.Context;
import java.util.Locale;

public class kqk
  implements gwv
{
  public final int a;
  public final float b;
  public final int c;
  public final float d;
  public String e;
  
  public kqk(int paramInt1, float paramFloat1, int paramInt2, float paramFloat2)
  {
    this.a = paramInt1;
    this.b = paramFloat1;
    this.c = paramInt2;
    this.d = paramFloat2;
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    if (this.e != null) {
      return this.e;
    }
    return paramgwx.a(paramContext);
  }
  
  public final void a(Context paramContext) {}
  
  public void b(Context paramContext)
  {
    ((gww)mbb.a(paramContext, gww.class)).a(paramContext, this);
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Float.valueOf(this.b);
    arrayOfObject[2] = Float.valueOf(this.d);
    arrayOfObject[3] = Integer.valueOf(this.c);
    return String.format(localLocale, "NetworkSamplingEvent networkType=%d, networkSpeedMbps=%f, initialNetworkSpeedMbps=%f, networkSpeedBucket=%d", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kqk
 * JD-Core Version:    0.7.0.1
 */