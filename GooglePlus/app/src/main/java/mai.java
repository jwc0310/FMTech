import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.nio.channels.Pipe.SinkChannel;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestListener;

final class mai
  extends InputStream
  implements HttpUrlRequestListener
{
  private final HttpUrlRequest a;
  private final RandomAccessFile b;
  private final InputStream c;
  private final long d;
  private final long e;
  private long f;
  
  public mai(Context paramContext, File paramFile, String paramString, long paramLong1, long paramLong2, Map<String, String> paramMap)
  {
    if ((paramLong1 < 0L) || ((paramLong2 != -1L) && (paramLong1 > paramLong2))) {
      throw new IllegalArgumentException("Invalid stream limits");
    }
    this.f = paramLong1;
    this.d = paramLong2;
    long l1;
    if (paramFile == null)
    {
      l1 = 0L;
      this.e = l1;
      if (this.f >= this.e) {
        break label216;
      }
      this.b = new RandomAccessFile(paramFile, "r");
      this.b.seek(this.f);
    }
    for (;;)
    {
      if (paramString == null) {
        break label224;
      }
      Pipe localPipe = Pipe.open();
      this.c = Channels.newInputStream(localPipe.source());
      Pipe.SinkChannel localSinkChannel = localPipe.sink();
      this.a = ixd.a(paramContext).a(paramString, 4, paramMap, localSinkChannel, this);
      long l2 = Math.max(this.e, this.f);
      if (l2 != 0L)
      {
        new StringBuilder(41).append("Starting request at: ").append(l2);
        this.a.a(l2);
      }
      this.a.f();
      return;
      l1 = paramFile.length();
      break;
      label216:
      this.b = null;
    }
    label224:
    this.a = null;
    this.c = null;
  }
  
  public final void a(HttpUrlRequest paramHttpUrlRequest) {}
  
  public final void b(HttpUrlRequest paramHttpUrlRequest) {}
  
  public final void close()
  {
    super.close();
    if (this.c != null) {
      this.c.close();
    }
    if (this.b != null) {
      this.b.close();
    }
  }
  
  public final int read()
  {
    throw new UnsupportedOperationException();
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i;
    if ((this.d != -1L) && (this.f >= this.d)) {
      i = -1;
    }
    for (;;)
    {
      return i;
      if (this.f < this.e)
      {
        long l = this.e;
        if ((this.d != -1L) && (this.d < l)) {
          l = this.d;
        }
        int j = Math.min((int)(l - this.f), paramInt2);
        i = this.b.read(paramArrayOfByte, paramInt1, j);
      }
      while (i != -1)
      {
        this.f += i;
        return i;
        if (this.c != null)
        {
          if (this.d != -1L) {
            paramInt2 = Math.min((int)(this.d - this.f), paramInt2);
          }
          i = this.c.read(paramArrayOfByte, paramInt1, paramInt2);
        }
        else
        {
          i = -1;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mai
 * JD-Core Version:    0.7.0.1
 */