import android.content.Context;
import java.util.Locale;

public final class kpu
  implements gwv
{
  public final int a;
  
  public kpu(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    return paramgwx.a(paramContext);
  }
  
  public final void a(Context paramContext) {}
  
  public final void b(Context paramContext)
  {
    ((gww)mbb.a(paramContext, gww.class)).a(paramContext, this);
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.a);
    return String.format(localLocale, "CounterEvent: %d", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kpu
 * JD-Core Version:    0.7.0.1
 */