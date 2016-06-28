package org.chromium.net;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

public abstract class CronetEngine
{
  public static CronetEngine a(CronetEngine.Builder paramBuilder)
  {
    try
    {
      CronetEngine localCronetEngine = (CronetEngine)CronetEngine.class.getClassLoader().loadClass("org.chromium.net.CronetUrlRequestContext").asSubclass(CronetEngine.class).getConstructor(new Class[] { CronetEngine.Builder.class }).newInstance(new Object[] { paramBuilder });
      boolean bool = localCronetEngine.a();
      if (bool) {
        return localCronetEngine;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      return null;
    }
    catch (Exception localException)
    {
      throw new IllegalStateException("Cannot instantiate: org.chromium.net.CronetUrlRequestContext", localException);
    }
    return null;
  }
  
  @Deprecated
  public abstract UrlRequest a(String paramString, UrlRequest.Callback paramCallback, Executor paramExecutor, int paramInt);
  
  abstract boolean a();
  
  public abstract String b();
  
  public abstract byte[] c();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.CronetEngine
 * JD-Core Version:    0.7.0.1
 */