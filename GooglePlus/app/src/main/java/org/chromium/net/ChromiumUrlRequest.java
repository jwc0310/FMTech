package org.chromium.net;

import android.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;

@Deprecated
@JNINamespace
public class ChromiumUrlRequest
  implements HttpUrlRequest
{
  private int A = 0;
  private String B;
  private long C;
  private int D = 0;
  private String E;
  private final Object F = new Object();
  private long a;
  private final ChromiumUrlRequestContext b;
  private final String c;
  private final int d;
  private final Map<String, String> e;
  private final WritableByteChannel f;
  private Map<String, String> g;
  private String h;
  private String i;
  private byte[] j;
  private ReadableByteChannel k;
  private boolean l;
  private IOException m;
  private volatile boolean n;
  private volatile boolean o;
  private volatile boolean p;
  private boolean q;
  private long r;
  private final HttpUrlRequestListener s;
  private boolean t;
  private long u;
  private long v;
  private boolean w;
  private boolean x;
  private boolean y;
  private long z;
  
  public ChromiumUrlRequest(ChromiumUrlRequestContext paramChromiumUrlRequestContext, String paramString, int paramInt, Map<String, String> paramMap, WritableByteChannel paramWritableByteChannel, HttpUrlRequestListener paramHttpUrlRequestListener)
  {
    if (paramChromiumUrlRequestContext == null) {
      throw new NullPointerException("Context is required");
    }
    if (paramString == null) {
      throw new NullPointerException("URL is required");
    }
    this.b = paramChromiumUrlRequestContext;
    this.c = paramString;
    int i1 = 0;
    switch (paramInt)
    {
    default: 
      i1 = 3;
    }
    for (;;)
    {
      this.d = i1;
      this.e = paramMap;
      this.f = paramWritableByteChannel;
      this.a = nativeCreateRequestAdapter(this.b.a, this.c, this.d);
      this.s = paramHttpUrlRequestListener;
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
  
  public ChromiumUrlRequest(ChromiumUrlRequestContext paramChromiumUrlRequestContext, String paramString, int paramInt, Map<String, String> paramMap, HttpUrlRequestListener paramHttpUrlRequestListener)
  {
    this(paramChromiumUrlRequestContext, paramString, paramInt, paramMap, new ChunkedWritableByteChannel(), paramHttpUrlRequestListener);
    this.t = true;
  }
  
  private final void a(Exception paramException)
  {
    this.m = new IOException("CalledByNative method has thrown an exception", paramException);
    Log.e("ChromiumNetwork", "Exception in CalledByNative method", paramException);
    try
    {
      g();
      return;
    }
    catch (Exception localException)
    {
      Log.e("ChromiumNetwork", "Exception trying to cancel request", localException);
    }
  }
  
  /* Error */
  @CalledByNative
  private void finish()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 64	org/chromium/net/ChromiumUrlRequest:F	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: iconst_1
    //   9: putfield 131	org/chromium/net/ChromiumUrlRequest:p	Z
    //   12: aload_0
    //   13: getfield 92	org/chromium/net/ChromiumUrlRequest:a	J
    //   16: lconst_0
    //   17: lcmp
    //   18: ifne +6 -> 24
    //   21: aload_2
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 83	org/chromium/net/ChromiumUrlRequest:f	Ljava/nio/channels/WritableByteChannel;
    //   28: invokeinterface 136 1 0
    //   33: aload_0
    //   34: getfield 138	org/chromium/net/ChromiumUrlRequest:k	Ljava/nio/channels/ReadableByteChannel;
    //   37: ifnull +24 -> 61
    //   40: aload_0
    //   41: getfield 138	org/chromium/net/ChromiumUrlRequest:k	Ljava/nio/channels/ReadableByteChannel;
    //   44: invokeinterface 144 1 0
    //   49: ifeq +12 -> 61
    //   52: aload_0
    //   53: getfield 138	org/chromium/net/ChromiumUrlRequest:k	Ljava/nio/channels/ReadableByteChannel;
    //   56: invokeinterface 145 1 0
    //   61: aload_0
    //   62: aload_0
    //   63: aload_0
    //   64: getfield 92	org/chromium/net/ChromiumUrlRequest:a	J
    //   67: invokespecial 149	org/chromium/net/ChromiumUrlRequest:nativeGetErrorCode	(J)I
    //   70: putfield 62	org/chromium/net/ChromiumUrlRequest:D	I
    //   73: aload_0
    //   74: aload_0
    //   75: aload_0
    //   76: getfield 92	org/chromium/net/ChromiumUrlRequest:a	J
    //   79: invokespecial 153	org/chromium/net/ChromiumUrlRequest:nativeGetErrorString	(J)Ljava/lang/String;
    //   82: putfield 155	org/chromium/net/ChromiumUrlRequest:E	Ljava/lang/String;
    //   85: aload_0
    //   86: getfield 62	org/chromium/net/ChromiumUrlRequest:D	I
    //   89: ifeq +24 -> 113
    //   92: aload_0
    //   93: aload_0
    //   94: aload_0
    //   95: getfield 92	org/chromium/net/ChromiumUrlRequest:a	J
    //   98: invokespecial 158	org/chromium/net/ChromiumUrlRequest:nativeGetHttpStatusCode	(J)I
    //   101: putfield 60	org/chromium/net/ChromiumUrlRequest:A	I
    //   104: aload_0
    //   105: aload_0
    //   106: getfield 92	org/chromium/net/ChromiumUrlRequest:a	J
    //   109: invokespecial 161	org/chromium/net/ChromiumUrlRequest:nativeGetHttpStatusText	(J)Ljava/lang/String;
    //   112: pop
    //   113: aload_0
    //   114: getfield 94	org/chromium/net/ChromiumUrlRequest:s	Lorg/chromium/net/HttpUrlRequestListener;
    //   117: aload_0
    //   118: invokeinterface 166 2 0
    //   123: aload_0
    //   124: aload_0
    //   125: getfield 92	org/chromium/net/ChromiumUrlRequest:a	J
    //   128: invokespecial 170	org/chromium/net/ChromiumUrlRequest:nativeDestroyRequestAdapter	(J)V
    //   131: aload_0
    //   132: lconst_0
    //   133: putfield 92	org/chromium/net/ChromiumUrlRequest:a	J
    //   136: aload_2
    //   137: monitorexit
    //   138: return
    //   139: astore_3
    //   140: aload_2
    //   141: monitorexit
    //   142: aload_3
    //   143: athrow
    //   144: astore_1
    //   145: aload_0
    //   146: new 107	java/io/IOException
    //   149: dup
    //   150: ldc 172
    //   152: aload_1
    //   153: invokespecial 112	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   156: putfield 114	org/chromium/net/ChromiumUrlRequest:m	Ljava/io/IOException;
    //   159: return
    //   160: astore 5
    //   162: goto -101 -> 61
    //   165: astore 4
    //   167: goto -134 -> 33
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	170	0	this	ChromiumUrlRequest
    //   144	9	1	localException	Exception
    //   139	4	3	localObject2	Object
    //   165	1	4	localIOException1	IOException
    //   160	1	5	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   7	23	139	finally
    //   24	33	139	finally
    //   33	61	139	finally
    //   61	113	139	finally
    //   113	138	139	finally
    //   140	142	139	finally
    //   0	7	144	java/lang/Exception
    //   142	144	144	java/lang/Exception
    //   33	61	160	java/io/IOException
    //   24	33	165	java/io/IOException
  }
  
  private final void m()
  {
    if (this.a == 0L) {
      throw new IllegalStateException("Adapter has been destroyed");
    }
  }
  
  private final void n()
  {
    if (this.n) {
      throw new IllegalStateException("Request already started");
    }
  }
  
  private native void nativeAddHeader(long paramLong, String paramString1, String paramString2);
  
  private native void nativeAppendChunk(long paramLong, ByteBuffer paramByteBuffer, int paramInt, boolean paramBoolean);
  
  private native void nativeCancel(long paramLong);
  
  private native long nativeCreateRequestAdapter(long paramLong, String paramString, int paramInt);
  
  private native void nativeDestroyRequestAdapter(long paramLong);
  
  private native void nativeDisableRedirects(long paramLong);
  
  private native void nativeEnableChunkedUpload(long paramLong, String paramString);
  
  private native void nativeGetAllHeaders(long paramLong, ChromiumUrlRequest.ResponseHeadersMap paramResponseHeadersMap);
  
  private native long nativeGetContentLength(long paramLong);
  
  private native String nativeGetContentType(long paramLong);
  
  private native int nativeGetErrorCode(long paramLong);
  
  private native String nativeGetErrorString(long paramLong);
  
  private native String nativeGetHeader(long paramLong, String paramString);
  
  private native int nativeGetHttpStatusCode(long paramLong);
  
  private native String nativeGetHttpStatusText(long paramLong);
  
  private native String nativeGetNegotiatedProtocol(long paramLong);
  
  private native boolean nativeGetWasCached(long paramLong);
  
  private native void nativeSetMethod(long paramLong, String paramString);
  
  private native void nativeSetUploadChannel(long paramLong1, String paramString, long paramLong2);
  
  private native void nativeSetUploadData(long paramLong, String paramString, byte[] paramArrayOfByte);
  
  private native void nativeStart(long paramLong);
  
  private final void o()
  {
    if (!this.q) {
      throw new IllegalStateException("Response headers not available");
    }
  }
  
  @CalledByNative
  private void onAppendResponseHeader(ChromiumUrlRequest.ResponseHeadersMap paramResponseHeadersMap, String paramString1, String paramString2)
  {
    try
    {
      if (!paramResponseHeadersMap.containsKey(paramString1)) {
        paramResponseHeadersMap.put(paramString1, new ArrayList());
      }
      ((List)paramResponseHeadersMap.get(paramString1)).add(paramString2);
      return;
    }
    catch (Exception localException)
    {
      a(localException);
    }
  }
  
  @CalledByNative
  private void onBytesRead(ByteBuffer paramByteBuffer)
  {
    int i1 = 1;
    for (;;)
    {
      try
      {
        if (this.x) {
          return;
        }
        int i2 = paramByteBuffer.remaining();
        this.z += i2;
        if (this.y)
        {
          if (this.z <= this.u) {
            return;
          }
          this.y = false;
          paramByteBuffer.position((int)(this.u - (this.z - i2)));
        }
        if ((this.v != 0L) && (this.z > this.v))
        {
          if (i1 != 0) {
            paramByteBuffer.limit(i2 - (int)(this.z - this.v));
          }
          if (!paramByteBuffer.hasRemaining()) {
            break;
          }
          this.f.write(paramByteBuffer);
          continue;
        }
        i1 = 0;
      }
      catch (Exception localException)
      {
        a(localException);
        return;
      }
    }
    if (i1 != 0)
    {
      this.x = true;
      g();
    }
  }
  
  @CalledByNative
  private void onResponseStarted()
  {
    ChunkedWritableByteChannel localChunkedWritableByteChannel;
    int i1;
    try
    {
      this.A = nativeGetHttpStatusCode(this.a);
      nativeGetHttpStatusText(this.a);
      this.B = nativeGetContentType(this.a);
      this.C = nativeGetContentLength(this.a);
      this.q = true;
      if ((this.v > 0L) && (this.C > this.v) && (this.w))
      {
        this.x = true;
        g();
        return;
      }
      if ((!this.t) || (this.C == -1L) || (this.x)) {
        break label169;
      }
      localChunkedWritableByteChannel = (ChunkedWritableByteChannel)this.f;
      i1 = (int)this.C;
      if ((!localChunkedWritableByteChannel.a.isEmpty()) || (localChunkedWritableByteChannel.b != null)) {
        throw new IllegalStateException();
      }
    }
    catch (Exception localException)
    {
      a(localException);
      return;
    }
    localChunkedWritableByteChannel.b = ByteBuffer.allocateDirect(i1);
    label169:
    if (this.u != 0L)
    {
      if (this.A != 200) {
        break label228;
      }
      if (this.C != -1L) {
        this.C -= this.u;
      }
      this.y = true;
    }
    for (;;)
    {
      this.s.a(this);
      return;
      label228:
      this.z = this.u;
    }
  }
  
  @CalledByNative
  private int readFromUploadChannel(ByteBuffer paramByteBuffer)
  {
    try
    {
      if ((this.k != null) && (this.k.isOpen()))
      {
        i1 = this.k.read(paramByteBuffer);
        if (i1 >= 0) {
          return i1;
        }
        this.k.close();
        return 0;
      }
    }
    catch (Exception localException)
    {
      a(localException);
      return -1;
    }
    int i1 = -1;
    return i1;
  }
  
  public final long a()
  {
    return this.C;
  }
  
  public final void a(long paramLong)
  {
    this.u = paramLong;
    if (paramLong != 0L)
    {
      String str = "bytes=" + paramLong + "-";
      synchronized (this.F)
      {
        n();
        if (this.g == null) {
          this.g = new HashMap();
        }
        this.g.put("Range", str);
        return;
      }
    }
  }
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    this.v = paramLong;
    this.w = paramBoolean;
  }
  
  public final void a(String paramString)
  {
    n();
    this.i = paramString;
  }
  
  public final void a(String paramString, ReadableByteChannel paramReadableByteChannel, long paramLong)
  {
    synchronized (this.F)
    {
      n();
      if (paramString == null) {
        throw new NullPointerException("contentType is required");
      }
    }
    this.h = paramString;
    this.k = paramReadableByteChannel;
    this.r = paramLong;
    this.j = null;
    this.l = false;
  }
  
  public final void a(String paramString, byte[] paramArrayOfByte)
  {
    synchronized (this.F)
    {
      n();
      if (paramString == null) {
        throw new NullPointerException("contentType is required");
      }
    }
    this.h = paramString;
    this.j = paramArrayOfByte;
    this.k = null;
    this.l = false;
  }
  
  public final int b()
  {
    if (this.A == 206) {
      return 200;
    }
    return this.A;
  }
  
  public final String b(String paramString)
  {
    synchronized (this.F)
    {
      m();
      o();
      String str = nativeGetHeader(this.a, paramString);
      return str;
    }
  }
  
  public final IOException c()
  {
    if (this.m != null) {
      return this.m;
    }
    switch (this.D)
    {
    default: 
      throw new IllegalStateException("Unrecognized error code: " + this.D);
    case 0: 
      if (this.x) {
        return new ResponseTooLargeException();
      }
      return null;
    case 1: 
      return new IOException(this.E);
    case 2: 
      return new MalformedURLException("Malformed URL: " + this.c);
    case 3: 
      return new SocketTimeoutException("Connection timed out");
    case 4: 
      try
      {
        String str2 = new URL(this.c).getHost();
        str1 = str2;
      }
      catch (MalformedURLException localMalformedURLException)
      {
        for (;;)
        {
          String str1 = this.c;
        }
      }
      return new UnknownHostException("Unknown host: " + str1);
    }
    return new IOException("Request failed because there were too many redirects or redirects have been disabled");
  }
  
  public final ByteBuffer d()
  {
    return ((ChunkedWritableByteChannel)this.f).a();
  }
  
  public final byte[] e()
  {
    return ((ChunkedWritableByteChannel)this.f).b();
  }
  
  public final void f()
  {
    synchronized (this.F)
    {
      if (this.o) {
        return;
      }
      n();
      m();
      this.n = true;
      if ((this.e != null) && (!this.e.isEmpty()))
      {
        Iterator localIterator2 = this.e.entrySet().iterator();
        if (localIterator2.hasNext())
        {
          Map.Entry localEntry2 = (Map.Entry)localIterator2.next();
          nativeAddHeader(this.a, (String)localEntry2.getKey(), (String)localEntry2.getValue());
        }
      }
    }
    if (this.g != null)
    {
      Iterator localIterator1 = this.g.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry1 = (Map.Entry)localIterator1.next();
        nativeAddHeader(this.a, (String)localEntry1.getKey(), (String)localEntry1.getValue());
      }
    }
    if ((this.j != null) && (this.j.length > 0)) {
      nativeSetUploadData(this.a, this.h, this.j);
    }
    for (;;)
    {
      if (this.i != null) {
        nativeSetMethod(this.a, this.i);
      }
      nativeStart(this.a);
      return;
      if (this.k != null) {
        nativeSetUploadChannel(this.a, this.h, this.r);
      }
    }
  }
  
  public final void g()
  {
    synchronized (this.F)
    {
      if (this.o) {
        return;
      }
      this.o = true;
      if (this.a != 0L) {
        nativeCancel(this.a);
      }
      return;
    }
  }
  
  public final boolean h()
  {
    synchronized (this.F)
    {
      boolean bool = this.o;
      return bool;
    }
  }
  
  public final String i()
  {
    synchronized (this.F)
    {
      m();
      o();
      String str = nativeGetNegotiatedProtocol(this.a);
      return str;
    }
  }
  
  public final String j()
  {
    return this.B;
  }
  
  public final Map<String, List<String>> k()
  {
    synchronized (this.F)
    {
      m();
      o();
      ChromiumUrlRequest.ResponseHeadersMap localResponseHeadersMap = new ChromiumUrlRequest.ResponseHeadersMap();
      nativeGetAllHeaders(this.a, localResponseHeadersMap);
      return localResponseHeadersMap;
    }
  }
  
  public final String l()
  {
    return this.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.ChromiumUrlRequest
 * JD-Core Version:    0.7.0.1
 */