import android.media.MediaRouter.RouteInfo;
import android.os.Build.VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class abi
{
  private Method a;
  private int b;
  
  public abi()
  {
    if (Build.VERSION.SDK_INT != 17) {
      throw new UnsupportedOperationException();
    }
    try
    {
      this.b = MediaRouter.RouteInfo.class.getField("STATUS_CONNECTING").getInt(null);
      this.a = MediaRouter.RouteInfo.class.getMethod("getStatusCode", new Class[0]);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException) {}catch (NoSuchMethodException localNoSuchMethodException) {}catch (NoSuchFieldException localNoSuchFieldException) {}
  }
  
  public final boolean a(Object paramObject)
  {
    MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)paramObject;
    if (this.a != null) {}
    try
    {
      int i = ((Integer)this.a.invoke(localRouteInfo, new Object[0])).intValue();
      int j = this.b;
      return i == j;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return false;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label51:
      break label51;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abi
 * JD-Core Version:    0.7.0.1
 */