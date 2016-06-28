import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Map;
import org.chromium.net.UserAgent;

public final class kcw
  extends kcq
{
  private final kbo a;
  
  public kcw(Context paramContext, String paramString1, String paramString2, kbo paramkbo)
  {
    super(paramContext, paramString1, paramString2);
    this.a = paramkbo;
  }
  
  protected final String a(Context paramContext)
  {
    StringBuilder localStringBuilder = new StringBuilder(UserAgent.a(paramContext));
    localStringBuilder.append("; G+ SDK/");
    if (this.a.e == null) {}
    for (String str = "1.0.0";; str = this.a.e)
    {
      localStringBuilder.append(str);
      localStringBuilder.append(';');
      return localStringBuilder.toString();
    }
  }
  
  public final Map<String, String> a(String paramString)
  {
    Map localMap = super.a(paramString);
    kbo localkbo = this.a;
    if (localkbo.f != null) {
      localkbo = localkbo.f;
    }
    if (localkbo.d != null) {}
    for (String str1 = localkbo.d;; str1 = "0")
    {
      String str2 = localkbo.b;
      String str3 = localkbo.a;
      String str4 = localkbo.c;
      String str5 = String.valueOf(Uri.encode(str1));
      Uri.Builder localBuilder = Uri.parse(35 + String.valueOf(str5).length() + "http://" + str5 + ".apps.googleusercontent.com/").buildUpon();
      if (str2 != null) {
        localBuilder.appendQueryParameter("client_id", str2);
      }
      if (str3 != null) {
        localBuilder.appendQueryParameter("api_key", str3);
      }
      if (str4 != null) {
        localBuilder.appendQueryParameter("pkg", str4);
      }
      localMap.put("X-Container-Url", localBuilder.build().toString());
      return localMap;
    }
  }
  
  public final boolean b(String paramString)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kcw
 * JD-Core Version:    0.7.0.1
 */