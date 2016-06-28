import android.content.Context;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestListener;

final class iuq
  extends iuf
{
  HttpUrlRequest a;
  private final Context j;
  private final String k;
  private final String l;
  private final long m;
  private final long n;
  private final InputStream o;
  private final boolean p;
  private final iwy q;
  
  public iuq(Context paramContext, kcb paramkcb, String paramString1, String paramString2, long paramLong1, long paramLong2, InputStream paramInputStream, boolean paramBoolean, iwy paramiwy)
  {
    super(paramkcb);
    this.j = paramContext;
    this.k = paramString1;
    this.l = paramString2;
    this.m = paramLong1;
    this.n = paramLong2;
    this.o = paramInputStream;
    this.p = paramBoolean;
    this.q = paramiwy;
  }
  
  public final void a()
  {
    kl localkl = new kl();
    localkl.putAll(this.c.a(this.k));
    long l1 = this.m;
    long l2 = this.n - 1L;
    long l3 = this.n;
    localkl.put("Content-Range", 68 + "bytes " + l1 + "-" + l2 + "/" + l3);
    Context localContext = this.j;
    String str = this.k;
    HttpUrlRequestListener localHttpUrlRequestListener = this.i;
    this.a = ixd.a(localContext).a(str, 3, localkl, localHttpUrlRequestListener);
    this.a.a(this.l, new ixc(Channels.newChannel(this.o), this.q, this.n - this.m), this.n - this.m);
    this.a.a("PUT");
  }
  
  protected final void a(HttpUrlRequest paramHttpUrlRequest) {}
  
  protected final HttpUrlRequest b()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iuq
 * JD-Core Version:    0.7.0.1
 */