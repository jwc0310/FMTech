package org.chromium.net;

import android.content.Context;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.WritableByteChannel;
import java.util.Map;
import org.json.JSONObject;
import riu;

@Deprecated
public final class HttpUrlConnectionUrlRequestFactory
  extends HttpUrlRequestFactory
{
  private final Context a;
  private final String b;
  
  public HttpUrlConnectionUrlRequestFactory(Context paramContext, CronetEngine.Builder paramBuilder)
  {
    this.a = paramContext;
    String str = paramBuilder.a.optString("USER_AGENT");
    if (str.isEmpty()) {
      str = UserAgent.a(new CronetEngine.Builder(this.a).b);
    }
    this.b = str;
  }
  
  public final HttpUrlRequest a(String paramString, int paramInt, Map<String, String> paramMap, WritableByteChannel paramWritableByteChannel, HttpUrlRequestListener paramHttpUrlRequestListener)
  {
    return new riu(this.a, this.b, paramString, paramMap, paramWritableByteChannel, paramHttpUrlRequestListener);
  }
  
  public final HttpUrlRequest a(String paramString, int paramInt, Map<String, String> paramMap, HttpUrlRequestListener paramHttpUrlRequestListener)
  {
    return new riu(this.a, this.b, paramString, paramInt, paramMap, paramHttpUrlRequestListener);
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    try
    {
      PrintWriter localPrintWriter = new PrintWriter(paramString);
      localPrintWriter.println("NetLog is not supported by " + b());
      localPrintWriter.close();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final String b()
  {
    return "HttpUrlConnection/" + Version.a();
  }
  
  public final void c() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.HttpUrlConnectionUrlRequestFactory
 * JD-Core Version:    0.7.0.1
 */