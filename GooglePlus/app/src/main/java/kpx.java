import android.content.Context;
import java.util.Locale;

public final class kpx
  implements gwv
{
  public final String a;
  public final int b;
  public final int c;
  public final int d;
  private String e;
  
  public kpx(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    this.e = paramString1;
    this.a = paramString2;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    return this.e;
  }
  
  public final void a(Context paramContext) {}
  
  public final void b(Context paramContext)
  {
    ((gww)mbb.a(paramContext, gww.class)).a(paramContext, this);
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = Integer.valueOf(this.c);
    arrayOfObject[3] = Integer.valueOf(this.d);
    return String.format(localLocale, "DatabaseUpgradeFailureEvent: partitionName=%s, oldVersion=%d, newVersion=%d, failureVersion=%d", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kpx
 * JD-Core Version:    0.7.0.1
 */