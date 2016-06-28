import android.content.Context;
import java.util.Locale;

public final class kqe
  implements gwv
{
  public final int a;
  public final int b;
  private String c;
  
  public kqe(String paramString, int paramInt1, int paramInt2)
  {
    this.c = paramString;
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    return this.c;
  }
  
  public final void a(Context paramContext) {}
  
  public final void b(Context paramContext)
  {
    ((gww)mbb.a(paramContext, gww.class)).a(paramContext, this);
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Integer.valueOf(this.b);
    return String.format(localLocale, "GmsFailureEvent gmsApi=%d, statusCode=%d", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kqe
 * JD-Core Version:    0.7.0.1
 */