import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class jrn
{
  private static jrn d;
  public final Context a;
  public final Map<String, Integer> b = new ConcurrentHashMap();
  public fyd c;
  
  private jrn(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  public static jrn a(Context paramContext)
  {
    try
    {
      if (d == null) {
        d = new jrn(paramContext);
      }
      jrn localjrn = d;
      return localjrn;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jrn
 * JD-Core Version:    0.7.0.1
 */