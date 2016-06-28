import android.text.TextUtils;

public final class gwr
{
  public final int a;
  public final String b;
  public final String c;
  
  private gwr(int paramInt, String paramString1, String paramString2)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public static gwr a(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != gws.a)) {}
    for (boolean bool = true;; bool = false)
    {
      efj.c(bool, "status must be non-empty and non-success");
      return new gwr(paramInt, null, null);
    }
  }
  
  public static gwr a(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString1)) {}
    for (boolean bool = true;; bool = false)
    {
      efj.c(bool, "photoId must be non-empty.");
      return new gwr(gws.a, paramString1, paramString2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwr
 * JD-Core Version:    0.7.0.1
 */