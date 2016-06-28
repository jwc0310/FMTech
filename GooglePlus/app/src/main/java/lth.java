import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestListener;

public final class lth
{
  final String a;
  final int b;
  private final Context c;
  
  public lth(Context paramContext)
  {
    try
    {
      String str = paramContext.getPackageName();
      int i = paramContext.getPackageManager().getPackageInfo(str, 0).versionCode;
      this.c = paramContext;
      this.a = str.trim();
      this.b = i;
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new IllegalArgumentException("Can't find package name.");
    }
  }
  
  public final void a(String paramString, HttpUrlRequestListener paramHttpUrlRequestListener)
  {
    if ((TextUtils.isEmpty(this.a)) || (this.b == -1)) {
      return;
    }
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = System.getProperty("http.agent");
    arrayOfObject[1] = this.a;
    arrayOfObject[2] = Integer.valueOf(this.b);
    String str = String.format(localLocale, "%s %s version/%d", arrayOfObject);
    kl localkl = new kl(1);
    localkl.put("User-Agent", str);
    ixd.a(this.c).a(paramString, 2, localkl, paramHttpUrlRequestListener).f();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lth
 * JD-Core Version:    0.7.0.1
 */