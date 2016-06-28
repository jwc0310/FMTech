import android.media.MediaRouter;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class abb
{
  private Method a;
  
  public abb()
  {
    if ((Build.VERSION.SDK_INT < 16) || (Build.VERSION.SDK_INT > 17)) {
      throw new UnsupportedOperationException();
    }
    try
    {
      this.a = MediaRouter.class.getMethod("getSystemAudioRoute", new Class[0]);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
  }
  
  public final Object a(Object paramObject)
  {
    MediaRouter localMediaRouter = (MediaRouter)paramObject;
    if (this.a != null) {}
    try
    {
      Object localObject = this.a.invoke(localMediaRouter, new Object[0]);
      return localObject;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return localMediaRouter.getRouteAt(0);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label31:
      break label31;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abb
 * JD-Core Version:    0.7.0.1
 */