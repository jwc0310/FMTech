import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

final class ka
{
  private static Method a;
  private static Method b;
  
  static
  {
    try
    {
      Class localClass = Class.forName("libcore.icu.ICU");
      if (localClass != null)
      {
        a = localClass.getMethod("getScript", new Class[] { String.class });
        b = localClass.getMethod("addLikelySubtags", new Class[] { String.class });
      }
      return;
    }
    catch (Exception localException)
    {
      a = null;
      b = null;
    }
  }
  
  private static String a(String paramString)
  {
    try
    {
      if (a != null)
      {
        Object[] arrayOfObject = { paramString };
        String str = (String)a.invoke(null, arrayOfObject);
        return str;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label32:
      break label32;
    }
  }
  
  public static String a(Locale paramLocale)
  {
    String str = b(paramLocale);
    if (str != null) {
      return a(str);
    }
    return null;
  }
  
  private static String b(Locale paramLocale)
  {
    String str1 = paramLocale.toString();
    try
    {
      if (b != null)
      {
        Object[] arrayOfObject = { str1 };
        String str2 = (String)b.invoke(null, arrayOfObject);
        return str2;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return str1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label39:
      break label39;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ka
 * JD-Core Version:    0.7.0.1
 */