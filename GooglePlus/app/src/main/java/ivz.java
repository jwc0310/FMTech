import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class ivz
{
  public static ivl a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 17) {
      return ivl.a;
    }
    try
    {
      ivl localivl = (ivl)Class.forName("com.google.android.apps.moviemaker.app.DefaultConnector").getConstructor(new Class[] { Context.class }).newInstance(new Object[] { paramContext });
      return localivl;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      String str1 = String.valueOf(localClassNotFoundException.getMessage());
      if (str1.length() != 0) {}
      for (String str2 = "Problem creating connector: ".concat(str1);; str2 = new String("Problem creating connector: "))
      {
        Log.e("MovieMakerModule", str2);
        return ivl.a;
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      break label49;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label49;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label49;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label49;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label49:
      break label49;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ivz
 * JD-Core Version:    0.7.0.1
 */