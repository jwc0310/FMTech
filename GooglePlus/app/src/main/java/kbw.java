import android.accounts.AuthenticatorException;
import android.content.Context;
import android.os.ConditionVariable;
import android.util.Log;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestListener;

public class kbw
  implements HttpUrlRequestListener
{
  private static final mcq a;
  private static final AtomicInteger b;
  private static final mcq c;
  private static volatile String d;
  public static final mcq i = new mcq("debug.rpc.dogfood");
  private kdh A;
  private String B;
  private int e = b.getAndIncrement();
  private final String f;
  private final ConditionVariable g = new ConditionVariable();
  private final List<kbv> h;
  public final Context j;
  public final kcg k;
  public final String l;
  public final kcb m;
  kbx n;
  public int o = -1;
  public String p;
  public Exception q;
  int r = 3;
  public WritableByteChannel s;
  public int t;
  public boolean u;
  public final kcc v;
  private final String w;
  private String x;
  private ByteBuffer y;
  private HttpUrlRequest z;
  
  static
  {
    a = new mcq("debug.rpc.metrics");
    b = new AtomicInteger(1);
    c = new mcq("debug.rpc.use_obscura_nonce", false);
    d = null;
    new AtomicBoolean(true);
  }
  
  public kbw(Context paramContext, kcg paramkcg, String paramString, kcb paramkcb)
  {
    this(paramContext, paramkcg, paramString, paramkcb, null, null);
  }
  
  public kbw(Context paramContext, kcg paramkcg, String paramString1, kcb paramkcb, String paramString2, String paramString3)
  {
    this.j = paramContext;
    this.k = paramkcg;
    this.l = paramString1;
    this.m = paramkcb;
    this.f = paramString2;
    this.w = paramString3;
    this.h = mbb.c(this.j, kbv.class);
    this.A = ((kdh)mbb.b(this.j, kdh.class));
    this.v = new kcc();
  }
  
  public static boolean a(Throwable paramThrowable)
  {
    if (paramThrowable == null) {}
    do
    {
      Throwable localThrowable;
      do
      {
        return false;
        if (!(paramThrowable instanceof RuntimeException)) {
          break;
        }
        localThrowable = paramThrowable.getCause();
      } while ((localThrowable == null) || (localThrowable == paramThrowable));
      paramThrowable = localThrowable;
      break;
    } while ((!(paramThrowable instanceof IOException)) || ((paramThrowable instanceof kce)) || ((paramThrowable instanceof kbt)));
    return true;
  }
  
  public static boolean b(Exception paramException)
  {
    if (paramException == null) {}
    while (((paramException instanceof SocketException)) || ((paramException instanceof UnknownHostException)) || ((paramException instanceof SSLException)) || (((paramException instanceof kbt)) && (((kbt)paramException).a == 401))) {
      return true;
    }
    return false;
  }
  
  public static final boolean b(Throwable paramThrowable)
  {
    while (paramThrowable != null)
    {
      if ((paramThrowable instanceof AuthenticatorException)) {
        return true;
      }
      paramThrowable = paramThrowable.getCause();
    }
    return false;
  }
  
  public void B_() {}
  
  public void a() {}
  
  public void a(int paramInt, String paramString, IOException paramIOException)
  {
    int i1;
    if ((paramInt == 200) && (paramIOException != null)) {
      i1 = 0;
    }
    for (;;)
    {
      this.o = i1;
      this.p = paramString;
      this.q = paramIOException;
      if ((this.A != null) && (i1 == 0)) {
        this.A.a(this.j, this.k.a, c(), i1, k());
      }
      return;
      if ((paramInt != 200) && (paramInt != 0) && (paramIOException == null))
      {
        paramIOException = new kbt(paramInt, paramString);
        i1 = paramInt;
      }
      else
      {
        i1 = paramInt;
      }
    }
  }
  
  public void a(int paramInt, String paramString, Exception paramException) {}
  
  public final void a(String paramString, long paramLong)
  {
    efj.a(paramString, "requestPath must be non-empty.");
    if (paramLong >= 0L) {}
    for (int i1 = 1; i1 == 0; i1 = 0) {
      throw new IllegalStateException();
    }
    kcc localkcc = this.v;
    localkcc.f.put(paramString, Long.valueOf(paramLong));
    if (paramLong > localkcc.e) {
      localkcc.e = paramLong;
    }
  }
  
  public void a(ByteBuffer paramByteBuffer, String paramString)
  {
    c(paramByteBuffer, null);
  }
  
  public final void a(HttpUrlRequest paramHttpUrlRequest)
  {
    if ((!paramHttpUrlRequest.h()) && (this.s == null))
    {
      String str = paramHttpUrlRequest.b("Content-Length");
      if (str != null) {
        this.v.b = Long.parseLong(str);
      }
    }
    this.B = paramHttpUrlRequest.i();
    if (this.n != null)
    {
      this.n.c = System.currentTimeMillis();
      this.v.d = this.B;
    }
    a_(paramHttpUrlRequest);
  }
  
  public final void a(byte[] paramArrayOfByte, String paramString)
  {
    int i1 = this.h.size();
    int i2 = 0;
    for (;;)
    {
      if (i2 < i1) {
        try
        {
          kbv localkbv = (kbv)this.h.get(i2);
          if (localkbv.a(k())) {
            localkbv.a(this.j, k(), paramArrayOfByte, paramString);
          }
          i2++;
        }
        catch (Throwable localThrowable)
        {
          for (;;)
          {
            Log.e("HttpOperation", "Couldn't log request", localThrowable);
          }
        }
      }
    }
  }
  
  public boolean a(Exception paramException)
  {
    if ((paramException instanceof kbt)) {}
    switch (((kbt)paramException).a)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public void a_(HttpUrlRequest paramHttpUrlRequest) {}
  
  public boolean a_(String paramString)
  {
    return false;
  }
  
  public void b(ByteBuffer paramByteBuffer, String paramString)
  {
    c(paramByteBuffer, null);
  }
  
  public final void b(HttpUrlRequest paramHttpUrlRequest)
  {
    if (paramHttpUrlRequest.h()) {
      this.u = true;
    }
    for (;;)
    {
      this.g.open();
      return;
      this.x = paramHttpUrlRequest.j();
      if (this.s == null) {
        this.y = paramHttpUrlRequest.d();
      }
      a(paramHttpUrlRequest.b(), null, paramHttpUrlRequest.c());
    }
  }
  
  public String c()
  {
    return this.f;
  }
  
  public void c(String paramString)
  {
    if (this.q != null)
    {
      str3 = String.valueOf(k());
      str4 = String.valueOf(this.q);
      Log.e(paramString, 28 + String.valueOf(str3).length() + String.valueOf(str4).length() + "[" + str3 + "] failed due to exception: " + str4, this.q);
    }
    while ((!n()) || (!Log.isLoggable(paramString, 4)))
    {
      String str3;
      String str4;
      return;
    }
    String str1 = String.valueOf(k());
    int i1 = this.o;
    String str2 = this.p;
    new StringBuilder(38 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("[").append(str1).append("] failed due to error: ").append(i1).append(" [").append(str2).append("]");
  }
  
  public final void c(ByteBuffer paramByteBuffer, String paramString)
  {
    int i1 = this.h.size();
    int i2 = 0;
    for (;;)
    {
      if (i2 < i1) {
        try
        {
          kbv localkbv = (kbv)this.h.get(i2);
          if (localkbv.b(k())) {
            localkbv.a(this.j, k(), paramByteBuffer.duplicate(), paramString);
          }
          i2++;
        }
        catch (Throwable localThrowable)
        {
          for (;;)
          {
            Log.e("HttpOperation", "Couldn't log response", localThrowable);
          }
        }
      }
    }
  }
  
  public boolean c(Exception paramException)
  {
    return true;
  }
  
  public String d()
  {
    return this.w;
  }
  
  public final void d(String paramString)
  {
    if (n())
    {
      c(paramString);
      q();
    }
  }
  
  public byte[] e()
  {
    return null;
  }
  
  public ReadableByteChannel f()
  {
    return null;
  }
  
  public long g()
  {
    throw new UnsupportedOperationException("You must specify a length when using streaming.");
  }
  
  public final void i()
  {
    ((kbu)mbb.a(this.j, kbu.class)).a(this);
  }
  
  public final void j()
  {
    try
    {
      this.u = true;
      HttpUrlRequest localHttpUrlRequest = this.z;
      if (localHttpUrlRequest != null)
      {
        localHttpUrlRequest.g();
        this.g.open();
      }
      return;
    }
    finally {}
  }
  
  public String k()
  {
    return getClass().getSimpleName();
  }
  
  public String[] l()
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = k();
    return arrayOfString;
  }
  
  public String m()
  {
    return null;
  }
  
  public boolean n()
  {
    return (this.o != 200) || (this.q != null);
  }
  
  final void o()
  {
    Map localMap;
    for (;;)
    {
      try
      {
        B_();
        this.v.a();
        localMap = this.m.a(c());
        if (!Log.isLoggable("HttpOperation", 3)) {
          break label270;
        }
        localStringBuilder = new StringBuilder("HTTP headers:\n");
        Iterator localIterator = localMap.entrySet().iterator();
        if (!localIterator.hasNext()) {
          break label270;
        }
        localEntry = (Map.Entry)localIterator.next();
        if (!"Authorization".equals(localEntry.getKey())) {
          continue;
        }
        localStringBuilder.append("Authorization: <removed>");
      }
      catch (IOException localIOException)
      {
        StringBuilder localStringBuilder;
        Map.Entry localEntry;
        a(0, null, localIOException);
        if ((b(this.q)) || (!c(this.q))) {
          continue;
        }
        String str1 = String.valueOf(k());
        Log.e("HttpOperation", 23 + String.valueOf(str1).length() + "[" + str1 + "] Unexpected exception", this.q);
        return;
        localStringBuilder.append((String)localEntry.getKey()).append(": ").append((String)localEntry.getValue());
        continue;
      }
      finally
      {
        this.y = null;
        this.z = null;
      }
      localStringBuilder.append('\n');
    }
    for (;;)
    {
      try
      {
        label270:
        if (this.u)
        {
          this.y = null;
          this.z = null;
          return;
        }
        if (this.s != null)
        {
          Context localContext2 = this.j;
          String str3 = c();
          int i2 = this.r;
          WritableByteChannel localWritableByteChannel = this.s;
          this.z = ixd.a(localContext2).a(str3, i2, localMap, localWritableByteChannel, this);
          this.g.close();
          kcc localkcc = this.v;
          localkcc.c = (1 + localkcc.c);
          byte[] arrayOfByte = e();
          if (arrayOfByte != null)
          {
            this.z.a(d(), arrayOfByte);
            this.v.a = arrayOfByte.length;
            if (s()) {
              a(arrayOfByte, m());
            }
            this.z.f();
            this.g.block();
            this.z = null;
            if (this.o != 200) {
              break label661;
            }
            if (this.n != null) {
              this.n.d = System.currentTimeMillis();
            }
            if ((this.y != null) && (this.v.b < 0L)) {
              this.v.b = this.y.capacity();
            }
            a(this.y, this.x);
            this.y = null;
            this.z = null;
          }
        }
        else
        {
          Context localContext1 = this.j;
          String str2 = c();
          int i1 = this.r;
          this.z = ixd.a(localContext1).a(str2, i1, localMap, this);
          continue;
        }
        localReadableByteChannel = f();
      }
      finally {}
      ReadableByteChannel localReadableByteChannel;
      if (localReadableByteChannel != null)
      {
        long l1 = g();
        this.v.a = l1;
        if (l1 <= 0L) {
          throw new IllegalArgumentException(47 + "length must not be 0, was: " + l1);
        }
        this.z.a(d(), localReadableByteChannel, l1);
        continue;
        label661:
        if ((!this.u) && (this.o != 401)) {
          b(this.y, this.x);
        }
      }
    }
  }
  
  final void p()
  {
    this.t = (1 + this.t);
    if ((a(this.q)) && (this.t < 2)) {
      try
      {
        if (a(this.q)) {
          this.m.a();
        }
        o();
        p();
        return;
      }
      catch (IOException localIOException)
      {
        a(0, null, localIOException);
      }
    }
    a(this.o, this.p, this.q);
  }
  
  public final void q()
  {
    if (!n()) {}
    do
    {
      return;
      if (this.q != null) {
        throw new IOException(String.valueOf(k()).concat(" operation failed"), this.q);
      }
    } while (!n());
    String str1 = String.valueOf(k());
    int i1 = this.o;
    String str2 = this.p;
    throw new IOException(40 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + " operation failed, error: " + i1 + " [" + str2 + "]");
  }
  
  final void r()
  {
    int i1 = this.h.size();
    int i2 = 0;
    for (;;)
    {
      if (i2 < i1) {
        try
        {
          kbv localkbv = (kbv)this.h.get(i2);
          Context localContext = this.j;
          String str = this.k.a;
          k();
          localkbv.a(localContext, str, this.n, this.o, this.q, this.B);
          i2++;
        }
        catch (Throwable localThrowable)
        {
          for (;;)
          {
            Log.e("HttpOperation", "Couldn't save network data", localThrowable);
          }
        }
      }
    }
  }
  
  public final boolean s()
  {
    int i1 = this.h.size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((kbv)this.h.get(i2)).a(k())) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean t()
  {
    int i1 = this.h.size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((kbv)this.h.get(i2)).b(k())) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbw
 * JD-Core Version:    0.7.0.1
 */