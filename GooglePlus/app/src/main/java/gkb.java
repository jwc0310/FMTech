import android.content.SharedPreferences;

final class gkb
  implements gjb
{
  private final String a;
  
  gkb(gjt paramgjt, int paramInt)
  {
    this(paramgjt, Integer.toString(paramInt));
  }
  
  private gkb(gjt paramgjt, String paramString)
  {
    this.a = String.valueOf(paramString).concat(".");
  }
  
  private final String e(String paramString)
  {
    String str1 = String.valueOf(this.a);
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
  
  public final int a(String paramString, int paramInt)
  {
    String str = e(paramString);
    return this.b.a.getInt(str, paramInt);
  }
  
  public final long a(String paramString, long paramLong)
  {
    String str = e(paramString);
    return this.b.a.getLong(str, 0L);
  }
  
  public final String a(String paramString1, String paramString2)
  {
    String str = e(paramString1);
    return this.b.a.getString(str, paramString2);
  }
  
  public final boolean a()
  {
    return a("logged_in", false);
  }
  
  public final boolean a(String paramString)
  {
    String str = e(paramString);
    return this.b.a.contains(str);
  }
  
  public final boolean a(String paramString, boolean paramBoolean)
  {
    String str = e(paramString);
    return this.b.a.getBoolean(str, paramBoolean);
  }
  
  public final String b(String paramString)
  {
    return a(paramString, null);
  }
  
  public final boolean b()
  {
    return a("logged_out", false);
  }
  
  public final boolean c(String paramString)
  {
    return a(paramString, false);
  }
  
  public final gjb d(String paramString)
  {
    gjt localgjt = this.b;
    String str1 = String.valueOf(this.a);
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return new gkb(localgjt, str3);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gkb
 * JD-Core Version:    0.7.0.1
 */