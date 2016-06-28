import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.UserAgent;

final class ice
  implements kcb
{
  private static String a = null;
  private final Context b;
  private final String c;
  private final String d;
  private final fpw e;
  private String f;
  
  public ice(Context paramContext, String paramString1, String paramString2)
  {
    this.b = paramContext;
    this.c = paramString1;
    this.d = paramString2;
    this.e = ((fpw)mbb.a(paramContext, fpw.class));
  }
  
  public final Map<String, String> a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    try
    {
      this.f = this.e.a(this.c, "oauth2:https://www.googleapis.com/auth/gcm");
      Context localContext = this.b;
      if (a == null) {
        a = UserAgent.a(localContext);
      }
      localHashMap.put("User-Agent", a);
      localHashMap.put("project_id", this.d);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.f;
      localHashMap.put("Authorization", String.format("AuthSub token=%s", arrayOfObject));
      return localHashMap;
    }
    catch (Exception localException)
    {
      Log.e("GcmManager", "Cannot obtain authentication token", localException);
    }
    return localHashMap;
  }
  
  public final void a()
  {
    if (!TextUtils.isEmpty(this.f)) {}
    try
    {
      this.e.a(this.f);
      return;
    }
    catch (IOException localIOException)
    {
      Log.e("GcmManager", "Failed to clear authentication token", localIOException);
    }
  }
  
  public final boolean b(String paramString)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ice
 * JD-Core Version:    0.7.0.1
 */