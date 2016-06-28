import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;

public final class iqw
{
  static Context a;
  private static iqy b = new iqy();
  
  static
  {
    Uri.parse("https://lh3.googleusercontent.com");
  }
  
  private static String a(float paramFloat)
  {
    if ((paramFloat < 0.0D) || (paramFloat > 1.0D)) {
      paramFloat = Math.max(0.0F, Math.min(1.0F, paramFloat));
    }
    String str1 = Integer.toString((int)(65535.0F * paramFloat), 16);
    String str2 = String.valueOf("0000".substring(0, 4 - str1.length()));
    String str3 = String.valueOf(str1);
    if (str3.length() != 0) {
      return str2.concat(str3);
    }
    return new String(str2);
  }
  
  public static String a(RectF paramRectF, int paramInt)
  {
    RectF localRectF = new RectF();
    int i = 0;
    while (i < paramInt)
    {
      float f = paramRectF.top;
      localRectF.top = (1.0F - paramRectF.right);
      localRectF.right = paramRectF.bottom;
      localRectF.bottom = (1.0F - paramRectF.left);
      localRectF.left = f;
      i++;
      paramRectF = localRectF;
    }
    String str1 = String.valueOf(a(paramRectF.left));
    String str2 = String.valueOf(a(paramRectF.top));
    String str3 = String.valueOf(a(paramRectF.right));
    String str4 = String.valueOf(a(paramRectF.bottom));
    return 11 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + "-fcrop64=1," + str1 + str2 + str3 + str4;
  }
  
  public static String a(String paramString, int paramInt)
  {
    String str = a(paramString, paramInt, 0, 0, 0, -1, -1, null, iqx.a, -1);
    if (str == null) {
      str = iqz.a(-1, paramString);
    }
    return str;
  }
  
  public static String a(String paramString, int paramInt1, int paramInt2)
  {
    String str = a(paramString, 582, paramInt2, 0, 0, -1, -1, null, iqx.a, -1);
    if (str == null) {
      str = iqz.a(paramInt2, paramString);
    }
    return str;
  }
  
  public static String a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = iqx.a;
    String str = a(paramString, paramInt1, 0, paramInt2, paramInt3, -1, -1, null, i, -1);
    if (str != null) {
      paramString = str;
    }
    while ((paramInt2 == 0) && (paramInt3 == 0)) {
      return paramString;
    }
    return iqz.a(paramInt2, paramInt3, paramString);
  }
  
  private static String a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, RectF paramRectF, int paramInt7, int paramInt8)
  {
    return b.a(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramRectF, paramInt7, -1);
  }
  
  public static String a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, RectF paramRectF)
  {
    int i = iqx.a;
    String str = a(paramString, paramInt1, 0, paramInt2, paramInt3, paramInt4, paramInt5, paramRectF, i, -1);
    if (str != null) {
      paramString = str;
    }
    while ((paramInt2 == 0) && (paramInt3 == 0)) {
      return paramString;
    }
    return iqz.a(paramInt2, paramInt3, paramString);
  }
  
  public static String a(String paramString, int paramInt1, int paramInt2, RectF paramRectF)
  {
    String str = a(paramString, paramInt1, paramInt2, 0, 0, -1, -1, paramRectF, iqx.a, -1);
    if (str == null) {
      str = iqz.a(paramInt2, paramString);
    }
    return str;
  }
  
  public static String a(String paramString, int paramInt, RectF paramRectF)
  {
    String str = a(paramString, paramInt, 0, 0, 0, -1, -1, paramRectF, iqx.a, -1);
    if (str == null) {
      str = iqz.a(-1, paramString);
    }
    return str;
  }
  
  @Deprecated
  public static void a(Context paramContext)
  {
    a = (Context)efj.e(paramContext, "Application Context can't be null!");
  }
  
  public static boolean a(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    return b.a(paramString);
  }
  
  public static String b(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    do
    {
      return paramString;
      if (paramString == null) {}
      for (boolean bool = false; bool; bool = b.a(paramString)) {
        return a(paramString, 2);
      }
    } while ((!paramString.startsWith("https")) && (!paramString.startsWith("http")));
    return iqz.a(-1, paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqw
 * JD-Core Version:    0.7.0.1
 */