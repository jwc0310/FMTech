import android.content.Context;
import android.os.Build.VERSION;
import java.util.WeakHashMap;

public class gy
{
  private static final WeakHashMap<Context, gy> a = new WeakHashMap();
  
  public static gy a(Context paramContext)
  {
    synchronized (a)
    {
      Object localObject2 = (gy)a.get(paramContext);
      if (localObject2 == null)
      {
        if (Build.VERSION.SDK_INT >= 17)
        {
          localObject2 = new gz(paramContext);
          a.put(paramContext, localObject2);
        }
      }
      else {
        return localObject2;
      }
      localObject2 = new ha(paramContext);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gy
 * JD-Core Version:    0.7.0.1
 */