package org.chromium.net;

import android.content.Context;
import android.os.Build.VERSION;
import org.chromium.base.annotations.UsedByReflection;
import org.json.JSONObject;

@Deprecated
@UsedByReflection
public class ChromiumUrlRequestFactory
  extends HttpUrlRequestFactory
{
  private ChromiumUrlRequestContext a;
  
  @UsedByReflection
  public ChromiumUrlRequestFactory(Context paramContext, CronetEngine.Builder paramBuilder)
  {
    if (Build.VERSION.SDK_INT >= 14) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        String str = paramBuilder.a.optString("USER_AGENT");
        if (str.isEmpty()) {
          str = UserAgent.a(new CronetEngine.Builder(paramContext).b);
        }
        this.a = new ChromiumUrlRequestContext(paramContext, str, paramBuilder);
      }
      return;
    }
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    this.a.a(paramString, false);
  }
  
  public final boolean a()
  {
    return Build.VERSION.SDK_INT >= 14;
  }
  
  public final String b()
  {
    return "Chromium/" + Version.a();
  }
  
  public final void c()
  {
    this.a.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.ChromiumUrlRequestFactory
 * JD-Core Version:    0.7.0.1
 */