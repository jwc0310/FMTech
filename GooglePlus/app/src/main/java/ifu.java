import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.chromium.net.ChunkedWritableByteChannel;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;
import org.chromium.net.ResponseTooLargeException;

final class ifu
  implements HttpUrlRequestListener
{
  ifu(ift paramift) {}
  
  public final void a(HttpUrlRequest paramHttpUrlRequest)
  {
    this.a.c = System.currentTimeMillis();
    this.a.d = paramHttpUrlRequest.i();
    if (this.a.k != null)
    {
      ixe localixe = this.a.k;
      long l = paramHttpUrlRequest.a();
      localixe.a.c = l;
    }
  }
  
  public final void b(HttpUrlRequest paramHttpUrlRequest)
  {
    for (;;)
    {
      synchronized (this.a)
      {
        if (paramHttpUrlRequest != this.a.j) {
          return;
        }
        this.a.j = null;
        this.a.a();
        ift localift2 = this.a;
        localift2.h = (1 + localift2.h);
        IOException localIOException = paramHttpUrlRequest.c();
        if (!(localIOException instanceof ResponseTooLargeException)) {
          break label576;
        }
        i = 1;
        String str4 = String.valueOf(this.a.a.o);
        new StringBuilder(20 + String.valueOf(str4).length()).append("Response too large: ").append(str4);
        if ((0x800 & ((kba)this.a.a.o).j) != 0)
        {
          this.a.l = true;
          localIOException = null;
        }
        if (localIOException == null) {
          break label298;
        }
        if (Log.isLoggable("ImageResource", 3))
        {
          String str3 = String.valueOf(this.a.a.o);
          new StringBuilder(25 + String.valueOf(str3).length()).append("Network Exception: Id is:").append(str3);
        }
        String str1 = String.valueOf(localIOException.getMessage());
        if (str1.length() != 0)
        {
          str2 = "Network exception: ".concat(str1);
          Log.e("EsResource", str2, localIOException);
          ife localife = this.a.a;
          if (i == 0) {
            break label292;
          }
          k = 5;
          localife.a(k);
          return;
        }
      }
      String str2 = new String("Network exception: ");
      continue;
      label292:
      int k = 4;
      continue;
      label298:
      int j = paramHttpUrlRequest.b();
      if (j != 200)
      {
        if (this.a.m != null) {
          this.a.m.delete();
        }
        this.a.a.a(j, null);
        return;
      }
      if (this.a.a.q != 2) {
        this.a.l = true;
      }
      long l = paramHttpUrlRequest.a();
      kba localkba;
      ByteBuffer localByteBuffer;
      if (l == -1L)
      {
        this.a.i = -1L;
        localkba = (kba)this.a.a.o;
        this.a.b.a(localkba.d(), paramHttpUrlRequest.l(), paramHttpUrlRequest.j(), this.a.e, this.a.c, this.a.f, this.a.i, j, this.a.d);
        if (this.a.k == null) {
          break label549;
        }
        localByteBuffer = ((ChunkedWritableByteChannel)this.a.k.b).a();
      }
      for (;;)
      {
        this.a.b.a(this.a.a, localByteBuffer);
        return;
        this.a.i = (l + this.a.i);
        break;
        label549:
        if ((0x2 & localkba.j) == 0) {
          localByteBuffer = paramHttpUrlRequest.d();
        } else {
          localByteBuffer = null;
        }
      }
      label576:
      int i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ifu
 * JD-Core Version:    0.7.0.1
 */