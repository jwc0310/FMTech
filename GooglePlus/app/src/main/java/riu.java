import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.ChunkedWritableByteChannel;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;
import org.chromium.net.ResponseTooLargeException;

@Deprecated
public final class riu
  implements HttpUrlRequest
{
  private static ExecutorService y;
  private static final Object z = new Object();
  final String a;
  final String b;
  final Map<String, String> c;
  final WritableByteChannel d;
  final HttpUrlRequestListener e;
  IOException f;
  HttpURLConnection g;
  long h;
  int i;
  long j;
  boolean k;
  boolean l;
  boolean m;
  long n;
  byte[] o;
  ReadableByteChannel p;
  String q;
  int r;
  boolean s;
  String t;
  InputStream u;
  final Object v;
  private int w;
  private String x;
  
  public riu(Context paramContext, String paramString1, String paramString2, int paramInt, Map<String, String> paramMap, HttpUrlRequestListener paramHttpUrlRequestListener)
  {
    this(paramContext, paramString1, paramString2, paramMap, new ChunkedWritableByteChannel(), paramHttpUrlRequestListener);
  }
  
  public riu(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      throw new NullPointerException("Context is required");
    }
    Object localObject2;
    if (localObject2 == null) {
      throw new NullPointerException("URL is required");
    }
    Object localObject1;
    this.a = localObject1;
    this.b = localObject2;
    Object localObject3;
    this.c = localObject3;
    Object localObject4;
    this.d = localObject4;
    Object localObject5;
    this.e = localObject5;
    this.v = new Object();
  }
  
  static ExecutorService m()
  {
    synchronized (z)
    {
      if (y == null) {
        y = Executors.newCachedThreadPool(new riv());
      }
      ExecutorService localExecutorService = y;
      return localExecutorService;
    }
  }
  
  public final long a()
  {
    return this.i;
  }
  
  public final void a(long paramLong)
  {
    this.h = paramLong;
  }
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    this.j = paramLong;
    this.k = paramBoolean;
  }
  
  public final void a(String paramString)
  {
    this.t = paramString;
  }
  
  public final void a(String paramString, ReadableByteChannel paramReadableByteChannel, long paramLong)
  {
    if (paramLong > 2147483647L) {
      throw new IllegalArgumentException("Upload contentLength is too big.");
    }
    this.w = ((int)paramLong);
    this.x = paramString;
    this.p = paramReadableByteChannel;
    this.o = null;
  }
  
  public final void a(String paramString, byte[] paramArrayOfByte)
  {
    this.x = paramString;
    this.o = paramArrayOfByte;
    this.p = null;
  }
  
  public final int b()
  {
    int i1 = this.r;
    if (i1 == 206) {
      i1 = 200;
    }
    return i1;
  }
  
  public final String b(String paramString)
  {
    if (this.g == null) {
      throw new IllegalStateException("Response headers not available");
    }
    Map localMap = this.g.getHeaderFields();
    if (localMap != null)
    {
      List localList = (List)localMap.get(paramString);
      if (localList != null) {
        return TextUtils.join(", ", localList);
      }
    }
    return null;
  }
  
  public final IOException c()
  {
    if ((this.f == null) && (this.l)) {
      this.f = new ResponseTooLargeException();
    }
    return this.f;
  }
  
  public final ByteBuffer d()
  {
    return ((ChunkedWritableByteChannel)this.d).a();
  }
  
  public final byte[] e()
  {
    return ((ChunkedWritableByteChannel)this.d).b();
  }
  
  public final void f()
  {
    m().execute(new riw(this));
  }
  
  public final void g()
  {
    synchronized (this.v)
    {
      if (this.s) {
        return;
      }
      this.s = true;
      return;
    }
  }
  
  public final boolean h()
  {
    synchronized (this.v)
    {
      boolean bool = this.s;
      return bool;
    }
  }
  
  public final String i()
  {
    return "";
  }
  
  public final String j()
  {
    return this.q;
  }
  
  public final Map<String, List<String>> k()
  {
    if (this.g == null) {
      throw new IllegalStateException("Response headers not available");
    }
    return this.g.getHeaderFields();
  }
  
  public final String l()
  {
    return this.b;
  }
  
  /* Error */
  final void n()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 131	riu:g	Ljava/net/HttpURLConnection;
    //   4: iconst_1
    //   5: invokevirtual 197	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   8: aload_0
    //   9: getfield 120	riu:x	Ljava/lang/String;
    //   12: invokestatic 201	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   15: ifne +16 -> 31
    //   18: aload_0
    //   19: getfield 131	riu:g	Ljava/net/HttpURLConnection;
    //   22: ldc 203
    //   24: aload_0
    //   25: getfield 120	riu:x	Ljava/lang/String;
    //   28: invokevirtual 207	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   31: aconst_null
    //   32: astore_1
    //   33: aload_0
    //   34: getfield 124	riu:o	[B
    //   37: astore_3
    //   38: aconst_null
    //   39: astore_1
    //   40: aload_3
    //   41: ifnull +40 -> 81
    //   44: aload_0
    //   45: getfield 131	riu:g	Ljava/net/HttpURLConnection;
    //   48: aload_0
    //   49: getfield 124	riu:o	[B
    //   52: arraylength
    //   53: invokevirtual 211	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   56: aload_0
    //   57: getfield 131	riu:g	Ljava/net/HttpURLConnection;
    //   60: invokevirtual 215	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   63: astore_1
    //   64: aload_1
    //   65: aload_0
    //   66: getfield 124	riu:o	[B
    //   69: invokevirtual 221	java/io/OutputStream:write	([B)V
    //   72: aload_1
    //   73: ifnull +7 -> 80
    //   76: aload_1
    //   77: invokevirtual 224	java/io/OutputStream:close	()V
    //   80: return
    //   81: aload_0
    //   82: getfield 131	riu:g	Ljava/net/HttpURLConnection;
    //   85: aload_0
    //   86: getfield 118	riu:w	I
    //   89: invokevirtual 211	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   92: aload_0
    //   93: getfield 131	riu:g	Ljava/net/HttpURLConnection;
    //   96: invokevirtual 215	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   99: astore_1
    //   100: sipush 8192
    //   103: newarray byte
    //   105: astore 4
    //   107: aload 4
    //   109: invokestatic 230	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   112: astore 5
    //   114: aload_0
    //   115: getfield 122	riu:p	Ljava/nio/channels/ReadableByteChannel;
    //   118: aload 5
    //   120: invokeinterface 236 2 0
    //   125: ifle -53 -> 72
    //   128: aload 5
    //   130: invokevirtual 240	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   133: pop
    //   134: aload_1
    //   135: aload 4
    //   137: iconst_0
    //   138: aload 5
    //   140: invokevirtual 243	java/nio/ByteBuffer:limit	()I
    //   143: invokevirtual 246	java/io/OutputStream:write	([BII)V
    //   146: aload 5
    //   148: invokevirtual 249	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   151: pop
    //   152: goto -38 -> 114
    //   155: astore_2
    //   156: aload_1
    //   157: ifnull +7 -> 164
    //   160: aload_1
    //   161: invokevirtual 224	java/io/OutputStream:close	()V
    //   164: aload_2
    //   165: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	this	riu
    //   32	129	1	localOutputStream	java.io.OutputStream
    //   155	10	2	localObject	Object
    //   37	4	3	arrayOfByte1	byte[]
    //   105	31	4	arrayOfByte2	byte[]
    //   112	35	5	localByteBuffer	ByteBuffer
    // Exception table:
    //   from	to	target	type
    //   33	38	155	finally
    //   44	72	155	finally
    //   81	114	155	finally
    //   114	152	155	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     riu
 * JD-Core Version:    0.7.0.1
 */