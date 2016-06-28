package org.chromium.net;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.nio.channels.WritableByteChannel;
import java.util.Map;

@Deprecated
public abstract class HttpUrlRequestFactory
{
  public static HttpUrlRequestFactory a(Context paramContext, CronetEngine.Builder paramBuilder)
  {
    try
    {
      HttpUrlRequestFactory localHttpUrlRequestFactory = (HttpUrlRequestFactory)HttpUrlRequestFactory.class.getClassLoader().loadClass("org.chromium.net.ChromiumUrlRequestFactory").asSubclass(HttpUrlRequestFactory.class).getConstructor(new Class[] { Context.class, CronetEngine.Builder.class }).newInstance(new Object[] { paramContext, paramBuilder });
      boolean bool = localHttpUrlRequestFactory.a();
      if (bool) {
        return localHttpUrlRequestFactory;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      return null;
    }
    catch (Exception localException)
    {
      throw new IllegalStateException("Cannot instantiate: org.chromium.net.ChromiumUrlRequestFactory", localException);
    }
    return null;
  }
  
  public abstract HttpUrlRequest a(String paramString, int paramInt, Map<String, String> paramMap, WritableByteChannel paramWritableByteChannel, HttpUrlRequestListener paramHttpUrlRequestListener);
  
  public abstract HttpUrlRequest a(String paramString, int paramInt, Map<String, String> paramMap, HttpUrlRequestListener paramHttpUrlRequestListener);
  
  public abstract void a(String paramString, boolean paramBoolean);
  
  public abstract boolean a();
  
  public abstract String b();
  
  public abstract void c();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.HttpUrlRequestFactory
 * JD-Core Version:    0.7.0.1
 */