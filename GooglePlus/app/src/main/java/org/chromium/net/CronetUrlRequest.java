package org.chromium.net;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeClassQualifiedName;
import rii;
import rij;
import rik;
import ril;
import rim;
import rin;
import rio;

@JNINamespace
public final class CronetUrlRequest
  implements UrlRequest
{
  public long a;
  public boolean b = false;
  public boolean c = false;
  public final Object d = new Object();
  public final UrlRequest.Callback e;
  public UrlResponseInfo f;
  private boolean g = false;
  private boolean h = false;
  private boolean i = false;
  private final CronetUrlRequestContext j;
  private final Executor k;
  private final List<String> l = new ArrayList();
  private long m;
  private final String n;
  private final int o;
  private String p;
  private final CronetUrlRequest.HeadersList q = new CronetUrlRequest.HeadersList();
  private CronetUploadDataStream r;
  private rio s;
  
  CronetUrlRequest(CronetUrlRequestContext paramCronetUrlRequestContext, String paramString, int paramInt, UrlRequest.Callback paramCallback, Executor paramExecutor)
  {
    if (paramString == null) {
      throw new NullPointerException("URL is required");
    }
    if (paramCallback == null) {
      throw new NullPointerException("Listener is required");
    }
    if (paramExecutor == null) {
      throw new NullPointerException("Executor is required");
    }
    this.j = paramCronetUrlRequestContext;
    this.n = paramString;
    this.l.add(paramString);
    int i1 = 0;
    switch (paramInt)
    {
    default: 
      i1 = 3;
    }
    for (;;)
    {
      this.o = i1;
      this.e = paramCallback;
      this.k = paramExecutor;
      return;
      i1 = 1;
      continue;
      i1 = 2;
      continue;
      i1 = 3;
      continue;
      i1 = 4;
    }
  }
  
  private final UrlResponseInfo a(int paramInt, String[] paramArrayOfString)
  {
    long l1;
    CronetUrlRequest.HeadersList localHeadersList;
    synchronized (this.d)
    {
      if (this.a == 0L) {
        return null;
      }
      l1 = this.a;
      localHeadersList = new CronetUrlRequest.HeadersList();
      int i1 = 0;
      if (i1 < paramArrayOfString.length)
      {
        localHeadersList.add(new AbstractMap.SimpleImmutableEntry(paramArrayOfString[i1], paramArrayOfString[(i1 + 1)]));
        i1 += 2;
      }
    }
    return new UrlResponseInfo(new ArrayList(this.l), paramInt, nativeGetHttpStatusText(l1), localHeadersList, nativeGetWasCached(l1), nativeGetNegotiatedProtocol(l1), nativeGetProxyServer(l1));
  }
  
  private final void a(Runnable paramRunnable)
  {
    try
    {
      this.k.execute(paramRunnable);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      Log.e("ChromiumNetwork", "Exception posting task to executor", localRejectedExecutionException);
      c();
    }
  }
  
  private final void a(boolean paramBoolean)
  {
    synchronized (this.d)
    {
      if (this.a == 0L) {
        return;
      }
      nativeDestroy(this.a, paramBoolean);
      this.j.b.decrementAndGet();
      this.a = 0L;
      return;
    }
  }
  
  /* Error */
  private final void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 57	org/chromium/net/CronetUrlRequest:d	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 47	org/chromium/net/CronetUrlRequest:g	Z
    //   11: ifne +10 -> 21
    //   14: aload_0
    //   15: invokevirtual 159	org/chromium/net/CronetUrlRequest:d	()Z
    //   18: ifeq +18 -> 36
    //   21: new 187	java/lang/IllegalStateException
    //   24: dup
    //   25: ldc 189
    //   27: invokespecial 190	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   30: athrow
    //   31: astore_2
    //   32: aload_1
    //   33: monitorexit
    //   34: aload_2
    //   35: athrow
    //   36: aload_1
    //   37: monitorexit
    //   38: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	CronetUrlRequest
    //   4	33	1	localObject1	Object
    //   31	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   7	21	31	finally
    //   21	31	31	finally
    //   32	34	31	finally
    //   36	38	31	finally
  }
  
  @NativeClassQualifiedName
  private final native boolean nativeAddRequestHeader(long paramLong, String paramString1, String paramString2);
  
  private final native long nativeCreateRequestAdapter(long paramLong, String paramString, int paramInt);
  
  @NativeClassQualifiedName
  private final native void nativeDestroy(long paramLong, boolean paramBoolean);
  
  @NativeClassQualifiedName
  private final native void nativeDisableCache(long paramLong);
  
  @NativeClassQualifiedName
  private final native void nativeFollowDeferredRedirect(long paramLong);
  
  @NativeClassQualifiedName
  private final native String nativeGetHttpStatusText(long paramLong);
  
  @NativeClassQualifiedName
  private final native String nativeGetNegotiatedProtocol(long paramLong);
  
  @NativeClassQualifiedName
  private final native String nativeGetProxyServer(long paramLong);
  
  @NativeClassQualifiedName
  private final native void nativeGetStatus(long paramLong, UrlRequest.StatusListener paramStatusListener);
  
  @NativeClassQualifiedName
  private final native boolean nativeGetWasCached(long paramLong);
  
  @NativeClassQualifiedName
  private final native boolean nativeReadData(long paramLong, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
  
  @NativeClassQualifiedName
  private final native boolean nativeSetHttpMethod(long paramLong, String paramString);
  
  @NativeClassQualifiedName
  private final native void nativeStart(long paramLong);
  
  @CalledByNative
  private final void onCanceled()
  {
    a(new rim(this));
  }
  
  @CalledByNative
  private final void onError(int paramInt, String paramString, long paramLong)
  {
    if (this.f != null)
    {
      UrlResponseInfo localUrlResponseInfo = this.f;
      long l1 = paramLong + this.m;
      localUrlResponseInfo.b.set(l1);
    }
    a(new rii(this, new UrlRequestException("Exception in CronetUrlRequest: " + paramString, paramInt)));
  }
  
  @CalledByNative
  private final void onReadCompleted(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong)
  {
    UrlResponseInfo localUrlResponseInfo = this.f;
    long l1 = paramLong + this.m;
    localUrlResponseInfo.b.set(l1);
    if (paramByteBuffer.position() != paramInt2)
    {
      a(new rii(this, new UrlRequestException("ByteBuffer modified externally during read", null)));
      return;
    }
    if (this.s == null) {
      this.s = new rio(this);
    }
    paramByteBuffer.position(paramInt2 + paramInt1);
    this.s.a = paramByteBuffer;
    a(this.s);
  }
  
  @CalledByNative
  private final void onRedirectReceived(String paramString, int paramInt, String[] paramArrayOfString, long paramLong)
  {
    UrlResponseInfo localUrlResponseInfo = a(paramInt, paramArrayOfString);
    this.m = (paramLong + this.m);
    long l1 = this.m;
    localUrlResponseInfo.b.set(l1);
    this.l.add(paramString);
    a(new rij(this, localUrlResponseInfo, paramString));
  }
  
  @CalledByNative
  private final void onResponseStarted(int paramInt, String[] paramArrayOfString)
  {
    this.f = a(paramInt, paramArrayOfString);
    a(new rik(this));
  }
  
  @CalledByNative
  private final void onStatus(UrlRequest.StatusListener paramStatusListener, int paramInt)
  {
    a(new rin(this, paramStatusListener, paramInt));
  }
  
  @CalledByNative
  private final void onSucceeded(long paramLong)
  {
    UrlResponseInfo localUrlResponseInfo = this.f;
    long l1 = paramLong + this.m;
    localUrlResponseInfo.b.set(l1);
    a(new ril(this));
  }
  
  public final void a()
  {
    int i1 = 0;
    synchronized (this.d)
    {
      e();
      try
      {
        this.a = nativeCreateRequestAdapter(this.j.d(), this.n, this.o);
        this.j.b.incrementAndGet();
        if ((this.p != null) && (!nativeSetHttpMethod(this.a, this.p))) {
          throw new IllegalArgumentException("Invalid http method " + this.p);
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        a(false);
        throw localRuntimeException;
      }
    }
    Iterator localIterator = this.q.iterator();
    for (;;)
    {
      Map.Entry localEntry;
      if (localIterator.hasNext())
      {
        localEntry = (Map.Entry)localIterator.next();
        if ((!((String)localEntry.getKey()).equalsIgnoreCase("Content-Type")) || (((String)localEntry.getValue()).isEmpty())) {
          break label330;
        }
      }
      label330:
      for (int i2 = 1; !nativeAddRequestHeader(this.a, (String)localEntry.getKey(), (String)localEntry.getValue()); i2 = i1)
      {
        throw new IllegalArgumentException("Invalid header " + (String)localEntry.getKey() + "=" + (String)localEntry.getValue());
        if (this.r != null)
        {
          if (i1 == 0) {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
          }
          this.r.a(this, this.a);
        }
        if (this.h) {
          nativeDisableCache(this.a);
        }
        this.g = true;
        nativeStart(this.a);
        return;
      }
      i1 = i2;
    }
  }
  
  final void a(Exception paramException)
  {
    UrlRequestException localUrlRequestException = new UrlRequestException("Exception received from UploadDataProvider", paramException);
    Log.e("ChromiumNetwork", "Exception in upload method", paramException);
    a(new rii(this, localUrlRequestException));
  }
  
  public final void a(String paramString)
  {
    e();
    if (paramString == null) {
      throw new NullPointerException("Method is required.");
    }
    this.p = paramString;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    e();
    if (paramString1 == null) {
      throw new NullPointerException("Invalid header name.");
    }
    if (paramString2 == null) {
      throw new NullPointerException("Invalid header value.");
    }
    this.q.add(new AbstractMap.SimpleImmutableEntry(paramString1, paramString2));
  }
  
  public final void a(ByteBuffer paramByteBuffer)
  {
    synchronized (this.d)
    {
      if (!paramByteBuffer.hasRemaining()) {
        throw new IllegalArgumentException("ByteBuffer is already full.");
      }
    }
    if (!this.c) {
      throw new IllegalStateException("Unexpected read attempt.");
    }
    this.c = false;
    this.i = false;
    if (d()) {
      return;
    }
    if (!nativeReadData(this.a, paramByteBuffer, paramByteBuffer.position(), paramByteBuffer.limit()))
    {
      this.c = true;
      throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
    }
  }
  
  public final void a(UploadDataProvider paramUploadDataProvider, Executor paramExecutor)
  {
    if (paramUploadDataProvider == null) {
      throw new NullPointerException("Invalid UploadDataProvider.");
    }
    if (this.p == null) {
      this.p = "POST";
    }
    this.r = new CronetUploadDataStream(paramUploadDataProvider, paramExecutor);
  }
  
  public final void b()
  {
    synchronized (this.d)
    {
      if (!this.b) {
        throw new IllegalStateException("No redirect to follow.");
      }
    }
    this.b = false;
    if (d()) {
      return;
    }
    nativeFollowDeferredRedirect(this.a);
  }
  
  public final void c()
  {
    synchronized (this.d)
    {
      if ((d()) || (!this.g)) {
        return;
      }
      a(true);
      return;
    }
  }
  
  public final boolean d()
  {
    for (;;)
    {
      synchronized (this.d)
      {
        if ((this.g) && (this.a == 0L))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.CronetUrlRequest
 * JD-Core Version:    0.7.0.1
 */