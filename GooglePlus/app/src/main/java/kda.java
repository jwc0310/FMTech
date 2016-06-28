import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import org.chromium.net.UserAgent;

public final class kda
  implements kcb
{
  private final Context a;
  private final String b;
  private final String c;
  
  public kda(Context paramContext, String paramString)
  {
    this(paramContext, paramString, "webupdates");
  }
  
  public kda(Context paramContext, String paramString1, String paramString2)
  {
    this.a = paramContext;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final Map<String, String> a(String paramString)
  {
    kl localkl = new kl();
    localkl.put("Cache-Control", "no-cache, no-transform");
    localkl.put("X-Wap-Proxy-Cookie", "none");
    localkl.put("X-Mobile-Google-Client", "1");
    localkl.put("Accept-Encoding", "gzip");
    localkl.put("User-Agent", String.valueOf(UserAgent.a(this.a)).concat(" (gzip)"));
    for (;;)
    {
      try
      {
        localURI = new URI(paramString);
        if (!localURI.getScheme().equalsIgnoreCase("https")) {
          if (!localURI.getHost().equals("10.0.2.2")) {
            continue;
          }
        }
      }
      catch (URISyntaxException localURISyntaxException)
      {
        try
        {
          String str1 = kcz.a(this.a, this.b, this.c);
          String str2 = String.valueOf(str1);
          if (str2.length() == 0) {
            break label240;
          }
          str3 = "GoogleLogin auth=".concat(str2);
          localkl.put("Authorization", str3);
          localkl.put("X-Mobile-Google-Client-Version", Integer.toString(efj.E(this.a)));
          return localkl;
        }
        catch (Exception localException)
        {
          URI localURI;
          String str4;
          String str5;
          throw new IOException("Cannot obtain authentication token", localException);
        }
        localURISyntaxException = localURISyntaxException;
        str4 = String.valueOf(paramString);
        if (str4.length() != 0)
        {
          str5 = "Cannot parse URL: ".concat(str4);
          Log.e("HttpOperation", str5, localURISyntaxException);
          localURI = null;
          continue;
        }
        str5 = new String("Cannot parse URL: ");
        continue;
      }
      label240:
      String str3 = new String("GoogleLogin auth=");
    }
  }
  
  public final void a()
  {
    try
    {
      kcz.b(this.a, this.b, this.c);
      return;
    }
    catch (Exception localException)
    {
      throw new IOException("Cannot invalidate authentication token", localException);
    }
  }
  
  public final boolean b(String paramString)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kda
 * JD-Core Version:    0.7.0.1
 */