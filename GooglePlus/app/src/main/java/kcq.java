import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.UserAgent;

public class kcq
  implements kcb
{
  private static mcq a = new mcq("debug.allowBackendOverride");
  private static String g;
  private final Context b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  
  public kcq(Context paramContext, String paramString1, String paramString2)
  {
    this(paramContext, paramString1, null, paramString2);
  }
  
  private kcq(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this(paramContext, paramString1, null, paramString3, null);
  }
  
  public kcq(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.b = paramContext;
    this.c = paramString1;
    this.d = paramString3;
    this.f = paramString2;
    this.e = paramString4;
  }
  
  protected String a(Context paramContext)
  {
    if (g == null) {
      g = String.valueOf(UserAgent.a(paramContext)).concat(" (gzip)");
    }
    return g;
  }
  
  public Map<String, String> a(String paramString)
  {
    kl localkl = new kl();
    localkl.put("Accept-Encoding", "gzip");
    localkl.put("Accept-Language", Locale.getDefault().toString());
    localkl.put("User-Agent", a(this.b));
    if (this.c != null) {}
    for (;;)
    {
      try
      {
        kcn localkcn = ((kcm)mbb.a(this.b, kcm.class)).a(this.d);
        String str1 = localkcn.a(this.b, this.c);
        String str2 = Long.toString(localkcn.c(this.b, str1).longValue());
        String str3 = String.valueOf(str1);
        if (str3.length() != 0)
        {
          str4 = "Bearer ".concat(str3);
          localkl.put("Authorization", str4);
          localkl.put("X-Auth-Time", str2);
          if (this.f != null) {
            localkl.put("X-Goog-PageId", this.f);
          }
          if ("PUT".equals(this.e)) {
            localkl.put("X-HTTP-Method-Override", "PUT");
          }
          return localkl;
        }
      }
      catch (Exception localException)
      {
        new kqe(this.c, 26, -1).b(this.b);
        throw new IOException("Cannot obtain authentication token", localException);
      }
      String str4 = new String("Bearer ");
    }
  }
  
  public final void a()
  {
    if (this.c != null) {}
    try
    {
      ((kcm)mbb.a(this.b, kcm.class)).a(this.d).b(this.b, this.c);
      return;
    }
    catch (Exception localException)
    {
      throw new IOException("Cannot invalidate authentication token", localException);
    }
  }
  
  public boolean b(String paramString)
  {
    return TextUtils.equals(this.d, paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kcq
 * JD-Core Version:    0.7.0.1
 */