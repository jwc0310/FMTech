import android.text.TextUtils;

public final class jjf
{
  public boolean a;
  public boolean b;
  
  public jjf(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramString.startsWith("g:"))
      {
        this.a = false;
        this.b = true;
      }
      while (!paramString.startsWith("e:")) {
        return;
      }
      this.a = true;
      this.b = false;
      return;
    }
    this.a = false;
    this.b = false;
  }
  
  @Deprecated
  public static String a(String paramString)
  {
    String str = String.valueOf(paramString);
    if (str.length() != 0) {
      return "g:".concat(str);
    }
    return new String("g:");
  }
  
  public static String b(String paramString)
  {
    String str = String.valueOf(paramString);
    if (str.length() != 0) {
      return "g:".concat(str);
    }
    return new String("g:");
  }
  
  public static String c(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 2) && (paramString.startsWith("g:"))) {
      return paramString.substring(2);
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jjf
 * JD-Core Version:    0.7.0.1
 */