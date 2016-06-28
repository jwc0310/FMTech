import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.support.rastermill.FrameSequence;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.util.Map;
import org.chromium.net.ChunkedWritableByteChannel;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestListener;

public abstract class ife
  extends kaz
  implements iwy
{
  public static DecimalFormat a;
  public final ifj b;
  final ift c;
  public ifg d;
  public ifh e;
  public String f;
  public String g;
  public int h;
  public String i;
  public String j;
  public String k;
  public String l;
  private long m;
  private String n;
  private int v = -1;
  
  public ife(ifj paramifj, kba paramkba)
  {
    super(paramifj, paramkba);
    this.b = paramifj;
    this.c = new ift(this, paramifj);
  }
  
  @TargetApi(19)
  private static int a(Bitmap paramBitmap)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramBitmap.getAllocationByteCount();
    }
    return paramBitmap.getRowBytes() * paramBitmap.getHeight();
  }
  
  private final void a(String paramString, ByteBuffer paramByteBuffer, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (!this.c.b(paramString, paramBoolean2))) {
      return;
    }
    if (paramBoolean2) {}
    for (iab localiab = this.b.f();; localiab = this.b.e())
    {
      localiab.a(paramString, paramByteBuffer);
      return;
    }
  }
  
  private final void a(ByteBuffer paramByteBuffer)
  {
    kba localkba = (kba)this.o;
    if ((this.q != 2) && (this.q != 1))
    {
      if (this.t)
      {
        String str7 = String.valueOf(this.o);
        String str8 = String.valueOf(kaz.c(this.q));
        new StringBuilder(53 + String.valueOf(str7).length() + String.valueOf(str8).length()).append("Resource no longer needed, not delivering: ").append(str7).append(", status: ").append(str8);
      }
      return;
    }
    if ((0x2 & localkba.j) != 0)
    {
      if (this.t)
      {
        String str5 = String.valueOf(this.o);
        String str6 = String.valueOf(f());
        new StringBuilder(48 + String.valueOf(str5).length() + String.valueOf(str6).length()).append("Completing a download-only request: ").append(str5).append(" file name: ").append(str6);
      }
      this.b.a(this, 1, f());
      return;
    }
    if ((0x8 & localkba.j) != 0)
    {
      if (this.t)
      {
        String str4 = String.valueOf(this.o);
        new StringBuilder(56 + String.valueOf(str4).length()).append("Image decoding disabled. Delivering bytes to consumers: ").append(str4);
      }
      this.b.a(this, 1, efj.a(paramByteBuffer));
      return;
    }
    int i1;
    for (;;)
    {
      try
      {
        if (paramByteBuffer.limit() >= 6)
        {
          paramByteBuffer.rewind();
          if ((paramByteBuffer.get(0) == 71) && (paramByteBuffer.get(1) == 73) && (paramByteBuffer.get(2) == 70))
          {
            i1 = 1;
            if (i1 != 0) {
              this.s = 2;
            }
            if (((0x4 & localkba.j) == 0) || ((0x20 & localkba.j) != 0) || (!ifb.a(paramByteBuffer))) {
              break;
            }
            c(new ifb(FrameSequence.a(paramByteBuffer)));
            return;
          }
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        if (this.t)
        {
          String str1 = String.valueOf(this.o);
          new StringBuilder(36 + String.valueOf(str1).length()).append("Out of memory while decoding image: ").append(str1);
        }
        iff localiff = new iff(this);
        efj.m().post(localiff);
        this.b.a(this, 6, null);
        return;
      }
      i1 = 0;
    }
    if (((0x4 & localkba.j) != 0) && (i1 != 0))
    {
      c(new icm(paramByteBuffer));
      return;
    }
    if ((0x40 & localkba.j) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      Object localObject1 = this.b.a(this, paramByteBuffer, bool);
      if (this.d != null) {}
      for (Object localObject2 = this.d.a((kba)this.o, localObject1);; localObject2 = localObject1)
      {
        if (localObject2 != null)
        {
          if (this.t)
          {
            String str2 = String.valueOf(this.o);
            new StringBuilder(31 + String.valueOf(str2).length()).append("Delivering image to consumers: ").append(str2);
          }
          c(localObject2);
          return;
        }
        if (this.t)
        {
          String str3 = String.valueOf(this.o);
          new StringBuilder(26 + String.valueOf(str3).length()).append("Bad image; cannot decode: ").append(str3);
        }
        File localFile = f();
        if (localFile != null) {
          localFile.delete();
        }
        this.b.a(this, 5);
        return;
      }
    }
  }
  
  public static boolean a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    while (paramString.charAt(-1 + paramString.length()) != '~') {
      return false;
    }
    return true;
  }
  
  public static int b(Object paramObject)
  {
    if ((paramObject instanceof Bitmap)) {
      return ((Bitmap)paramObject).getWidth();
    }
    if ((paramObject instanceof iey)) {
      return ((iey)paramObject).b;
    }
    return 0;
  }
  
  public abstract String a();
  
  public final void a(int paramInt)
  {
    this.c.a();
    super.a(paramInt);
  }
  
  public final void a(int paramInt, String paramString)
  {
    this.c.a();
    super.a(paramInt, paramString);
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    if (this.e != null) {
      this.e.a(paramLong1, paramLong2);
    }
  }
  
  public final void a(long paramLong, String paramString, int paramInt1, int paramInt2, int paramInt3, Bitmap paramBitmap)
  {
    this.m = (SystemClock.currentThreadTimeMillis() - paramLong);
    long l1 = this.m;
    this.f = (23 + l1 + " ms");
    this.n = paramString;
    this.h = paramInt1;
    if (this.t) {
      if (paramBitmap != null) {
        break label198;
      }
    }
    label198:
    int i1;
    int i2;
    for (String str1 = "null";; str1 = 25 + "[" + i1 + "x" + i2 + "]")
    {
      String str2 = this.f;
      new StringBuilder(80 + String.valueOf(paramString).length() + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Decoded ").append(paramInt1).append(" byte ").append(paramString).append(" from source [").append(paramInt2).append("x").append(paramInt3).append("] into bitmap ").append(str1).append(" in ").append(str2);
      this.i = null;
      this.j = null;
      this.k = null;
      this.l = null;
      return;
      i1 = paramBitmap.getWidth();
      i2 = paramBitmap.getHeight();
    }
  }
  
  public void a(Object paramObject)
  {
    ift localift2;
    boolean bool3;
    File localFile1;
    if ((0x2 & ((kba)this.o).j) != 0)
    {
      this.c.a();
      localift2 = this.c;
      if (localift2.l)
      {
        File localFile2 = localift2.m;
        String str10 = localift2.m.getName();
        if ((0x400 & ((kba)localift2.a.o).j) != 0)
        {
          bool3 = true;
          localift2.b(str10, bool3);
          localFile1 = localFile2;
          label91:
          if (this.t)
          {
            String str8 = String.valueOf(this.o);
            String str9 = String.valueOf(localFile1);
            new StringBuilder(48 + String.valueOf(str8).length() + String.valueOf(str9).length()).append("Completing a download-only request: ").append(str8).append(" file name: ").append(str9);
          }
          this.b.a(this, 1, localFile1);
        }
      }
    }
    ByteBuffer localByteBuffer;
    kba localkba;
    do
    {
      do
      {
        return;
        bool3 = false;
        break;
        localFile1 = localift2.a.f();
        localift2.m.renameTo(localFile1);
        break label91;
        localByteBuffer = (ByteBuffer)paramObject;
        if (this.t)
        {
          int i2 = localByteBuffer.remaining();
          String str7 = String.valueOf(this.o);
          new StringBuilder(47 + String.valueOf(str7).length()).append("Delivering data: ").append(str7).append("; buffer has ").append(i2).append(" bytes");
        }
      } while (localByteBuffer == null);
      localkba = (kba)this.o;
      this.c.a();
      ift localift1 = this.c;
      if (localift1.m != null) {
        localift1.m.delete();
      }
    } while ((this.q != 2) && (localByteBuffer.remaining() == 0));
    boolean bool1;
    if ((this.c.i == -1L) && (this.q != 2)) {
      bool1 = true;
    }
    for (;;)
    {
      String str1;
      label373:
      boolean bool2;
      String str4;
      String str5;
      if (bool1)
      {
        str1 = e();
        int i1 = 0x400 & localkba.j;
        bool2 = false;
        if (i1 != 0) {
          bool2 = true;
        }
        if ((0x2 & localkba.j) == 0) {
          break label578;
        }
        a(str1, localByteBuffer, bool1, bool2);
        if (this.t)
        {
          str4 = String.valueOf(this.o);
          str5 = String.valueOf(f());
          if (!bool2) {
            break label570;
          }
        }
      }
      label570:
      for (String str6 = "; long-term cache";; str6 = "")
      {
        new StringBuilder(48 + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length()).append("Completing a download-only request: ").append(str4).append(" file name: ").append(str5).append(str6);
        this.b.a(this, 1, f());
        return;
        if ((this.c.i <= 0L) || (localByteBuffer.remaining() >= this.c.i)) {
          break label706;
        }
        bool1 = true;
        break;
        str1 = d();
        break label373;
      }
      label578:
      if (!bool1) {
        a(localByteBuffer);
      }
      if ((0x1 & localkba.j) != 0) {
        break;
      }
      String str2;
      if (this.t)
      {
        str2 = String.valueOf(this.o);
        if (!bool2) {
          break label698;
        }
      }
      label698:
      for (String str3 = "; long-term cache";; str3 = "")
      {
        new StringBuilder(40 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length()).append("Saving image in file cache: ").append(str2).append(" file name: ").append(str1).append(str3);
        a(str1, localByteBuffer, bool1, bool2);
        return;
      }
      label706:
      bool1 = false;
    }
  }
  
  protected final void a(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append("\n  Size:").append(l());
  }
  
  public abstract String b();
  
  public void c()
  {
    kba localkba = (kba)this.o;
    if ((0x80 & localkba.j) != 0)
    {
      if (this.t)
      {
        String str9 = String.valueOf(this.o);
        String str10 = String.valueOf(f());
        new StringBuilder(34 + String.valueOf(str9).length() + String.valueOf(str10).length()).append("Loading disabled for: ").append(str9).append(" file name: ").append(str10);
      }
      this.b.a(this, 3, null);
      return;
    }
    if ((0x2 & localkba.j) != 0)
    {
      File localFile2 = g();
      if (localFile2 != null)
      {
        if (this.t)
        {
          String str7 = String.valueOf(this.o);
          String str8 = String.valueOf(localFile2);
          new StringBuilder(46 + String.valueOf(str7).length() + String.valueOf(str8).length()).append("Returning file name to consumers: ").append(str7).append(" file name: ").append(str8);
        }
        this.b.a(this, 1, localFile2);
        return;
      }
    }
    File localFile1;
    if ((0x1 & localkba.j) == 0)
    {
      localFile1 = g();
      if (localFile1 != null) {
        if (this.t)
        {
          String str5 = String.valueOf(this.o);
          String str6 = String.valueOf(localFile1);
          new StringBuilder(37 + String.valueOf(str5).length() + String.valueOf(str6).length()).append("Loading image from file: ").append(str5).append(" file name: ").append(str6);
        }
      }
    }
    for (;;)
    {
      try
      {
        ByteBuffer localByteBuffer2 = efj.a(localFile1, true);
        localByteBuffer1 = localByteBuffer2;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        localByteBuffer1 = null;
        continue;
      }
      catch (IOException localIOException)
      {
        String str4 = String.valueOf(localFile1);
        Log.e("EsResource", 18 + String.valueOf(str4).length() + "Cannot load file: " + str4, localIOException);
      }
      if (localByteBuffer1 == null) {
        break;
      }
      a(localByteBuffer1);
      return;
      ByteBuffer localByteBuffer1 = null;
    }
    if ((0x40000 & localkba.j) != 0)
    {
      if (this.t)
      {
        String str2 = String.valueOf(this.o);
        String str3 = String.valueOf(f());
        new StringBuilder(38 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("Downloading disabled for: ").append(str2).append(" file name: ").append(str3);
      }
      this.b.a(this, 3, null);
      return;
    }
    if (this.t)
    {
      String str1 = String.valueOf(this.o);
      new StringBuilder(21 + String.valueOf(str1).length()).append("Requesting download: ").append(str1);
    }
    h();
  }
  
  public String d()
  {
    return b();
  }
  
  public final String e()
  {
    String str = String.valueOf(d());
    return 1 + String.valueOf(str).length() + str + '~';
  }
  
  public File f()
  {
    kba localkba = (kba)this.o;
    if ((0x1 & localkba.j) != 0) {
      return null;
    }
    if ((0x400 & localkba.j) != 0) {}
    for (iab localiab = this.b.f();; localiab = this.b.e()) {
      return new File(localiab.b(d()));
    }
  }
  
  public File g()
  {
    String str = d();
    File localFile = this.b.e().a(str);
    if (localFile != null) {
      return localFile;
    }
    return this.b.f().a(str);
  }
  
  public void h()
  {
    ift localift1 = this.c;
    localift1.a.u = true;
    localift1.e = System.currentTimeMillis();
    localift1.b.a(localift1.a);
    String str1 = a();
    this.c.g = str1;
    if (str1 == null)
    {
      if (Log.isLoggable("ImageResource", 3))
      {
        String str16 = String.valueOf(this.o);
        new StringBuilder(35 + String.valueOf(str16).length()).append("Unable to download null image url: ").append(str16);
      }
      this.c.a();
      super.a(5);
      return;
    }
    ift localift3;
    if ((0x2 & ((kba)this.o).j) != 0)
    {
      localift3 = this.c;
      kba localkba = (kba)localift3.a.o;
      String str10 = localift3.a.e();
      if ((0x400 & localkba.j) != 0) {}
      FileChannel localFileChannel;
      for (iab localiab = localift3.b.f();; localiab = localift3.b.e())
      {
        String str11 = localiab.b(str10);
        localift3.m = new File(str11);
        if (localift3.m.exists()) {
          localift3.g = localift3.a(str11, false);
        }
        if (localift3.a.t)
        {
          String str14 = localift3.g;
          String str15 = String.valueOf(localift3.a.o);
          new StringBuilder(34 + String.valueOf(str14).length() + String.valueOf(str15).length()).append("Downloading using URL: ").append(str14).append(" resource: ").append(str15);
        }
        File localFile = localift3.m.getParentFile();
        if (!localFile.exists()) {
          localFile.mkdirs();
        }
        try
        {
          localFileChannel = new FileOutputStream(localift3.m, true).getChannel();
          if (localift3.g != null) {
            break;
          }
          String str13 = String.valueOf(localift3);
          throw new NullPointerException(22 + String.valueOf(str13).length() + "Download URL is null: " + str13);
        }
        catch (IOException localIOException2)
        {
          Log.e("EsResource", "Cannot open cache file", localIOException2);
          ife localife = localift3.a;
          localife.c.a();
          localife.a(4);
          return;
        }
      }
      Context localContext3 = localift3.b.r();
      String str12 = localift3.g;
      HttpUrlRequestListener localHttpUrlRequestListener3 = localift3.n;
      HttpUrlRequest localHttpUrlRequest2 = ixd.a(localContext3).a(str12, 0, null, localFileChannel, localHttpUrlRequestListener3);
      localHttpUrlRequest2.a(localift3.m.length());
      long l3;
      if ((0x2000 & localkba.j) != 0)
      {
        l3 = localift3.b.k();
        if ((0x800 & localkba.j) != 0) {
          break label601;
        }
      }
      label601:
      for (boolean bool = true;; bool = false)
      {
        localHttpUrlRequest2.a(l3, bool);
        try
        {
          localift3.j = localHttpUrlRequest2;
          localHttpUrlRequest2.f();
          return;
        }
        finally {}
        l3 = localift3.b.l();
        break;
      }
    }
    localift2 = this.c;
    long l1 = localift2.b.l();
    localift2.i = 0L;
    String str2 = localift2.a.e();
    localift2.m = localift2.b.e().a(str2);
    if (localift2.m != null)
    {
      localift2.g = localift2.a(localift2.m.getPath(), true);
      if (!localift2.m.exists()) {
        localift2.m = null;
      }
    }
    if (localift2.a.t)
    {
      String str8 = localift2.g;
      String str9 = String.valueOf(localift2.a.o);
      new StringBuilder(34 + String.valueOf(str8).length() + String.valueOf(str9).length()).append("Downloading using URL: ").append(str8).append(" resource: ").append(str9);
    }
    localift2.k = new ixe(new ChunkedWritableByteChannel(), localift2.a);
    if (localift2.m != null) {}
    try
    {
      localift2.i = localift2.m.length();
      if (localift2.a.t)
      {
        long l2 = localift2.i;
        String str7 = String.valueOf(localift2.a.o);
        new StringBuilder(68 + String.valueOf(str2).length() + String.valueOf(str7).length()).append("Continuing download to file ").append(str2).append(" (").append(l2).append(" bytes) resource: ").append(str7);
      }
      ByteBuffer localByteBuffer = efj.a(localift2.m, true);
      localift2.k.write(localByteBuffer);
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        Map localMap;
        try
        {
          ifd localifd;
          String str5;
          String str6;
          Context localContext2;
          String str4;
          ixe localixe;
          HttpUrlRequestListener localHttpUrlRequestListener2;
          localift2.j = localHttpUrlRequest1;
          localHttpUrlRequest1.f();
          return;
        }
        finally {}
        localIOException1 = localIOException1;
        localift2.k = null;
        localift2.i = 0L;
        continue;
        Context localContext1 = localift2.b.r();
        String str3 = localift2.g;
        HttpUrlRequestListener localHttpUrlRequestListener1 = localift2.n;
        HttpUrlRequest localHttpUrlRequest1 = ixd.a(localContext1).a(str3, 2, localMap, localHttpUrlRequestListener1);
      }
    }
    localifd = (ifd)mbb.b(localift2.b.r(), ifd.class);
    localMap = null;
    if (localifd != null)
    {
      localMap = localifd.a(localift2.b.r(), ((kba)localift2.a.o).d(), localift2.g);
      if ((localift2.a.t) && (!localMap.isEmpty()))
      {
        str5 = String.valueOf(localMap);
        str6 = String.valueOf(localift2.a.o);
        new StringBuilder(33 + String.valueOf(str5).length() + String.valueOf(str6).length()).append("Adding image headers: ").append(str5).append(" resource: ").append(str6);
      }
    }
    if (localift2.k != null)
    {
      localContext2 = localift2.b.r();
      str4 = localift2.g;
      localixe = localift2.k;
      localHttpUrlRequestListener2 = localift2.n;
      localHttpUrlRequest1 = ixd.a(localContext2).a(str4, 2, localMap, localixe, localHttpUrlRequestListener2);
      localHttpUrlRequest1.a(localift2.i);
      localHttpUrlRequest1.a(l1, true);
    }
  }
  
  public final void i()
  {
    if ((0x10 & ((kba)this.o).j) == 0)
    {
      Bitmap localBitmap = j();
      if (localBitmap != null)
      {
        if (localBitmap.isMutable()) {
          localBitmap.eraseColor(0);
        }
        this.b.a(localBitmap);
      }
    }
    super.i();
  }
  
  public final Bitmap j()
  {
    if ((this.p instanceof Bitmap)) {
      return (Bitmap)this.p;
    }
    if ((this.p instanceof iey)) {
      return ((iey)this.p).a;
    }
    return null;
  }
  
  public final int k()
  {
    if ((this.p instanceof Bitmap)) {
      return ((Bitmap)this.p).getHeight();
    }
    if ((this.p instanceof iey)) {
      return ((iey)this.p).c;
    }
    return 0;
  }
  
  public final int l()
  {
    if (this.v == -1)
    {
      if (this.p == null) {
        break label137;
      }
      if (!(this.p instanceof Bitmap)) {
        break label44;
      }
      this.v = a((Bitmap)this.p);
    }
    label137:
    for (;;)
    {
      return this.v;
      label44:
      if ((this.p instanceof iey))
      {
        this.v = a(((iey)this.p).a);
      }
      else if ((this.p instanceof icm))
      {
        icm localicm = (icm)this.p;
        this.v = (localicm.a.length + (localicm.f.length << 2));
      }
      else if ((this.p instanceof byte[]))
      {
        this.v = ((byte[])this.p).length;
      }
      else
      {
        this.v = 2147483647;
      }
    }
  }
  
  public String m()
  {
    String str = this.n;
    if (str != null)
    {
      if (str.startsWith("image/")) {
        str = str.substring(6);
      }
      return str;
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ife
 * JD-Core Version:    0.7.0.1
 */