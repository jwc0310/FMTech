import android.content.Context;
import android.content.SharedPreferences;

public final class hzb
{
  final Context a;
  
  public hzb(Context paramContext)
  {
    this.a = paramContext;
  }
  
  static String a(String paramString)
  {
    String str1 = String.valueOf(paramString);
    String str2 = String.valueOf(".flags");
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
  
  public static String b(String paramString)
  {
    String str1 = String.valueOf(paramString);
    String str2 = String.valueOf(".timestamp");
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
  
  public final long c(String paramString)
  {
    return this.a.getSharedPreferences("accounts", 0).getLong(b(paramString), 0L);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzb
 * JD-Core Version:    0.7.0.1
 */