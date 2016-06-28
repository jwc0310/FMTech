import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class abf
  implements Runnable
{
  final Handler a;
  Method b;
  boolean c;
  private final DisplayManager d;
  
  public abf(Context paramContext, Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT != 17) {
      throw new UnsupportedOperationException();
    }
    this.d = ((DisplayManager)paramContext.getSystemService("display"));
    this.a = paramHandler;
    try
    {
      this.b = DisplayManager.class.getMethod("scanWifiDisplays", new Class[0]);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
  }
  
  public final void run()
  {
    if (this.c) {}
    try
    {
      this.b.invoke(this.d, new Object[0]);
      label23:
      this.a.postDelayed(this, 15000L);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      break label23;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label23;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abf
 * JD-Core Version:    0.7.0.1
 */