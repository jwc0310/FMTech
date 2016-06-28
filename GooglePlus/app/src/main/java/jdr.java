import android.util.Log;

public final class jdr
{
  private static mcq a = new mcq("debug.nots.logging", false);
  private static final int b = 18;
  
  public static String a(Class<?> paramClass)
  {
    return a(paramClass.getSimpleName());
  }
  
  public static String a(String paramString)
  {
    if (paramString.startsWith("Gns")) {
      paramString = paramString.replace("Gns", "");
    }
    if (paramString.startsWith("Guns")) {
      paramString = paramString.replace("Guns", "");
    }
    if (paramString.length() <= b)
    {
      String str4 = String.valueOf("Gns:");
      String str5 = String.valueOf(paramString);
      if (str5.length() != 0) {
        return str4.concat(str5);
      }
      return new String(str4);
    }
    String str1 = String.valueOf("Gns:");
    String str2 = String.valueOf(paramString.substring(0, b));
    String str3 = String.valueOf("~");
    return 0 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + str1 + str2 + str3;
  }
  
  public static void a(String paramString1, String paramString2) {}
  
  public static void a(String paramString1, String paramString2, Throwable paramThrowable) {}
  
  private static boolean a(String paramString, int paramInt)
  {
    return Log.isLoggable(paramString, paramInt);
  }
  
  public static void b(String paramString1, String paramString2) {}
  
  public static void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a(paramString1, 6)) {
      Log.e(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void c(String paramString1, String paramString2)
  {
    if (a(paramString1, 6)) {
      Log.e(paramString1, paramString2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdr
 * JD-Core Version:    0.7.0.1
 */