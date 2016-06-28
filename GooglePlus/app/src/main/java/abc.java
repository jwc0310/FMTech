import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;
import android.os.Build.VERSION;
import java.lang.reflect.Method;

public final class abc
{
  Method a;
  
  public abc()
  {
    if ((Build.VERSION.SDK_INT < 16) || (Build.VERSION.SDK_INT > 17)) {
      throw new UnsupportedOperationException();
    }
    try
    {
      Class[] arrayOfClass = new Class[2];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = MediaRouter.RouteInfo.class;
      this.a = MediaRouter.class.getMethod("selectRouteInt", arrayOfClass);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abc
 * JD-Core Version:    0.7.0.1
 */