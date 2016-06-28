import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.chromium.net.ChunkedWritableByteChannel;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class ift
{
  final ife a;
  final ifj b;
  long c;
  String d;
  long e;
  long f;
  String g;
  int h = 0;
  long i;
  HttpUrlRequest j;
  ixe<ChunkedWritableByteChannel> k;
  boolean l;
  File m;
  final HttpUrlRequestListener n = new ifu(this);
  
  ift(ife paramife, ifj paramifj)
  {
    this.a = paramife;
    this.b = paramifj;
  }
  
  final String a(String paramString, boolean paramBoolean)
  {
    try
    {
      String str = mfx.b(String.valueOf(paramString).concat("u"));
      return str;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      return this.a.a();
    }
    catch (IOException localIOException)
    {
      Log.e("EsResource", "Cannot obtain download URL for partial file", localIOException);
      if (paramBoolean)
      {
        this.m.delete();
        new File(String.valueOf(paramString).concat("u")).delete();
      }
    }
    return this.a.a();
  }
  
  final void a()
  {
    if (!this.a.u) {}
    do
    {
      return;
      this.a.u = false;
      this.f = System.currentTimeMillis();
      this.b.b(this.a);
    } while (!this.a.t);
    ife localife = this.a;
    long l1 = localife.c.f - localife.c.e;
    String str1 = 23 + l1 + " ms";
    localife.g = str1;
    String str2 = String.valueOf(str1);
    String str3 = String.valueOf(this.a.o);
    new StringBuilder(24 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("Download completed in ").append(str2).append("; ").append(str3);
  }
  
  final boolean b(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (iab localiab = this.b.f();; localiab = this.b.e())
    {
      String str = localiab.b(String.valueOf(paramString).concat("u"));
      try
      {
        mfx.b(str, this.g);
        return true;
      }
      catch (IOException localIOException)
      {
        Log.e("EsResource", "Cannot save download URL", localIOException);
        new File(localiab.b(paramString)).delete();
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ift
 * JD-Core Version:    0.7.0.1
 */