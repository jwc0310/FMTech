import android.content.Context;
import java.util.Locale;

public final class kqg
  implements gwv
{
  private static Boolean b = null;
  public final int a;
  
  public kqg(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    return null;
  }
  
  public final void a(Context paramContext) {}
  
  public final void b(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext == localContext.getApplicationContext()) {}
    for (boolean bool = true;; bool = false)
    {
      efj.c(bool, "must pass an application context");
      if (b == null) {
        b = Boolean.valueOf(fpf.a(localContext.getContentResolver(), "ozexperiment:enable_memory_logging", false));
      }
      if (b.booleanValue()) {
        ((gww)mbb.a(paramContext, gww.class)).a(paramContext, this);
      }
      return;
    }
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.a);
    return String.format(localLocale, "MemoryEvent eventCode = %d.", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kqg
 * JD-Core Version:    0.7.0.1
 */