import android.content.Context;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

public final class lte
  implements ain, HttpUrlRequestListener
{
  final lth a;
  final String b;
  final ltj c;
  final Context d;
  int e;
  private final ixf f;
  private final kl<String, String> g = new kl();
  
  public lte(Context paramContext, String paramString1, String paramString2, String paramString3, lth paramlth, ltj paramltj, ixf paramixf)
  {
    this.d = paramContext;
    this.b = paramString1;
    this.a = paramlth;
    this.c = paramltj;
    this.f = paramixf;
    this.e = 20;
    a("s", paramString2);
    a("v", paramString3);
  }
  
  private void a(String paramString1, String paramString2)
  {
    kl localkl = this.g;
    if (paramString1 == null) {
      throw new NullPointerException();
    }
    if (paramString2 == null) {
      throw new NullPointerException();
    }
    localkl.put(paramString1, paramString2);
  }
  
  public final void a(HttpUrlRequest paramHttpUrlRequest) {}
  
  public final void b(HttpUrlRequest paramHttpUrlRequest)
  {
    if ((paramHttpUrlRequest.h()) || (paramHttpUrlRequest.c() != null)) {
      gzj.a(this.d, new ltf(this, this.d, this.c, paramHttpUrlRequest.l()));
    }
    do
    {
      return;
      int i = paramHttpUrlRequest.b();
      if ((i != 204) && (i != 200) && (i != 201) && (i != 202) && (i != 203) && (i != 205) && (i != 206) && (i != 207)) {
        break;
      }
    } while ((this.c.b() == 0) || (!this.f.c()));
    gzj.a(this.d, new ltg(this, this.d, this));
    return;
    gzj.a(this.d, new ltf(this, this.d, this.c, paramHttpUrlRequest.l()));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lte
 * JD-Core Version:    0.7.0.1
 */