import android.content.Context;
import android.net.Uri;
import com.google.android.apps.plus.content.EsProvider;

public final class bpj
  implements hho
{
  private final Context a;
  
  public bpj(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Uri a()
  {
    String str1 = String.valueOf(EsProvider.b(this.a));
    String str2 = String.valueOf("cxns");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return Uri.parse(str3);
    }
  }
  
  public final Uri a(String paramString)
  {
    return Uri.withAppendedPath(Uri.withAppendedPath(a(), "cxn"), paramString);
  }
  
  public final Uri b()
  {
    return Uri.withAppendedPath(a(), "featured");
  }
  
  public final Uri b(String paramString)
  {
    return Uri.withAppendedPath(Uri.withAppendedPath(a(), "owner"), paramString);
  }
  
  public final Uri c()
  {
    return Uri.withAppendedPath(a(), "search");
  }
  
  public final Uri c(String paramString)
  {
    return Uri.withAppendedPath(Uri.withAppendedPath(a(), "followers"), paramString);
  }
  
  public final Uri d()
  {
    return Uri.withAppendedPath(a(), "my");
  }
  
  public final Uri d(String paramString)
  {
    return Uri.withAppendedPath(Uri.withAppendedPath(a(), "circles"), paramString);
  }
  
  public final Uri e()
  {
    return Uri.withAppendedPath(a(), "myvisible");
  }
  
  public final Uri e(String paramString)
  {
    return Uri.withAppendedPath(Uri.withAppendedPath(a(), "uservisible"), paramString);
  }
  
  public final Uri f()
  {
    return Uri.withAppendedPath(a(), "header");
  }
  
  public final Uri f(String paramString)
  {
    return Uri.withAppendedPath(Uri.withAppendedPath(a(), "userfollowed"), paramString);
  }
  
  public final Uri g()
  {
    return Uri.withAppendedPath(a(), "default");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpj
 * JD-Core Version:    0.7.0.1
 */