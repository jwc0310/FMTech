import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.zip.Adler32;

public final class iaj
  implements Closeable
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  public byte[] f = new byte[32];
  public iak g = new iak();
  private RandomAccessFile h;
  private RandomAccessFile i;
  private RandomAccessFile j;
  private FileChannel k;
  private MappedByteBuffer l;
  private int m;
  private int n;
  private RandomAccessFile o;
  private RandomAccessFile p;
  private int q;
  private byte[] r = new byte[20];
  private Adler32 s = new Adler32();
  private int t;
  private int u;
  
  public iaj(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    this.h = new RandomAccessFile(String.valueOf(paramString).concat(".idx"), "rw");
    this.i = new RandomAccessFile(String.valueOf(paramString).concat(".0"), "rw");
    this.j = new RandomAccessFile(String.valueOf(paramString).concat(".1"), "rw");
    this.n = 5;
    if (d()) {}
    do
    {
      return;
      this.h.setLength(0L);
      this.h.setLength(32 + (paramInt1 * 12 << 1));
      this.h.seek(0L);
      byte[] arrayOfByte = this.f;
      a(arrayOfByte, 0, -1289277392);
      a(arrayOfByte, 4, paramInt1);
      a(arrayOfByte, 8, paramInt2);
      a(arrayOfByte, 12, 0);
      a(arrayOfByte, 16, 0);
      a(arrayOfByte, 20, 4);
      a(arrayOfByte, 24, this.n);
      a(arrayOfByte, 28, b(arrayOfByte, 0, 28));
      this.h.write(arrayOfByte);
      this.i.setLength(0L);
      this.j.setLength(0L);
      this.i.seek(0L);
      this.j.seek(0L);
      a(arrayOfByte, 0, -1121680112);
      this.i.write(arrayOfByte, 0, 4);
      this.j.write(arrayOfByte, 0, 4);
    } while (d());
    c();
    throw new IOException("unable to load index");
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt)
  {
    return 0xFF & paramArrayOfByte[paramInt] | (0xFF & paramArrayOfByte[(paramInt + 1)]) << 8 | (0xFF & paramArrayOfByte[(paramInt + 2)]) << 16 | (0xFF & paramArrayOfByte[(paramInt + 3)]) << 24;
  }
  
  public static void a(String paramString)
  {
    try
    {
      new File(paramString).delete();
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (int i1 = 0; i1 < 4; i1++)
    {
      paramArrayOfByte[(paramInt1 + i1)] = ((byte)paramInt2);
      paramInt2 >>= 8;
    }
  }
  
  private final boolean a(RandomAccessFile paramRandomAccessFile, int paramInt, iak paramiak)
  {
    byte[] arrayOfByte1 = this.r;
    long l1 = paramRandomAccessFile.getFilePointer();
    long l2 = paramInt;
    try
    {
      paramRandomAccessFile.seek(l2);
      int i1 = paramRandomAccessFile.read(arrayOfByte1);
      if (i1 != 20) {
        return false;
      }
      long l3 = 0xFF & arrayOfByte1[7];
      for (int i2 = 6; i2 >= 0; i2--) {
        l3 = l3 << 8 | 0xFF & arrayOfByte1[(i2 + 0)];
      }
      if (l3 != paramiak.a)
      {
        new StringBuilder(45).append("blob key does not match: ").append(l3);
        return false;
      }
      int i3 = a(arrayOfByte1, 8);
      int i4 = a(arrayOfByte1, 12);
      if (i4 != paramInt)
      {
        new StringBuilder(39).append("blob offset does not match: ").append(i4);
        return false;
      }
      int i5 = a(arrayOfByte1, 16);
      if ((i5 < 0) || (i5 > -20 + (this.b - paramInt)))
      {
        new StringBuilder(32).append("invalid blob length: ").append(i5);
        return false;
      }
      if ((paramiak.b == null) || (paramiak.b.length < i5)) {
        paramiak.b = new byte[i5];
      }
      byte[] arrayOfByte2 = paramiak.b;
      paramiak.c = i5;
      int i6 = paramRandomAccessFile.read(arrayOfByte2, 0, i5);
      if (i6 != i5) {
        return false;
      }
      if (b(arrayOfByte2, 0, i5) != i3)
      {
        new StringBuilder(41).append("blob checksum does not match: ").append(i3);
        return false;
      }
      return true;
    }
    catch (Throwable localThrowable)
    {
      Log.e("BlobCache", "getBlob failed.", localThrowable);
      return false;
    }
    finally
    {
      paramRandomAccessFile.seek(l1);
    }
  }
  
  private int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.s.reset();
    this.s.update(paramArrayOfByte, 0, paramInt2);
    return (int)this.s.getValue();
  }
  
  private final void c()
  {
    FileChannel localFileChannel = this.k;
    if (localFileChannel != null) {}
    try
    {
      localFileChannel.close();
      localRandomAccessFile1 = this.h;
      if (localRandomAccessFile1 == null) {}
    }
    catch (Throwable localThrowable3)
    {
      try
      {
        RandomAccessFile localRandomAccessFile1;
        localRandomAccessFile1.close();
        localRandomAccessFile2 = this.i;
        if (localRandomAccessFile2 == null) {}
      }
      catch (Throwable localThrowable3)
      {
        try
        {
          for (;;)
          {
            RandomAccessFile localRandomAccessFile2;
            localRandomAccessFile2.close();
            label45:
            RandomAccessFile localRandomAccessFile3 = this.j;
            if (localRandomAccessFile3 != null) {}
            try
            {
              localRandomAccessFile3.close();
              return;
            }
            catch (Throwable localThrowable1) {}
            localThrowable4 = localThrowable4;
          }
          localThrowable3 = localThrowable3;
        }
        catch (Throwable localThrowable2)
        {
          break label45;
        }
      }
    }
  }
  
  private final boolean d()
  {
    try
    {
      this.h.seek(0L);
      this.i.seek(0L);
      this.j.seek(0L);
      byte[] arrayOfByte1 = this.f;
      if (this.h.read(arrayOfByte1) != 32) {
        return false;
      }
      if (a(arrayOfByte1, 0) != -1289277392) {
        return false;
      }
      if (a(arrayOfByte1, 24) != this.n) {
        return false;
      }
      this.a = a(arrayOfByte1, 4);
      this.b = a(arrayOfByte1, 8);
      this.m = a(arrayOfByte1, 12);
      this.c = a(arrayOfByte1, 16);
      this.d = a(arrayOfByte1, 20);
      int i1 = a(arrayOfByte1, 28);
      if (b(arrayOfByte1, 0, 28) != i1) {
        return false;
      }
      if (this.a <= 0) {
        return false;
      }
      if (this.b <= 0) {
        return false;
      }
      if ((this.m != 0) && (this.m != 1)) {
        return false;
      }
      if ((this.c >= 0) && (this.c <= this.a))
      {
        if ((this.d < 4) || (this.d > this.b)) {
          break label372;
        }
        if (this.h.length() != 32 + (12 * this.a << 1)) {
          return false;
        }
        byte[] arrayOfByte2 = new byte[4];
        if (this.i.read(arrayOfByte2) != 4) {
          return false;
        }
        if (a(arrayOfByte2, 0) != -1121680112) {
          return false;
        }
        if (this.j.read(arrayOfByte2) != 4) {
          return false;
        }
        if (a(arrayOfByte2, 0) != -1121680112) {
          return false;
        }
        this.k = this.h.getChannel();
        this.l = this.k.map(FileChannel.MapMode.READ_WRITE, 0L, this.h.length());
        this.l.order(ByteOrder.LITTLE_ENDIAN);
        e();
        return true;
      }
    }
    catch (IOException localIOException)
    {
      Log.e("BlobCache", "loadIndex failed.", localIOException);
      return false;
    }
    return false;
    label372:
    return false;
  }
  
  private final void e()
  {
    RandomAccessFile localRandomAccessFile1;
    if (this.m == 0)
    {
      localRandomAccessFile1 = this.i;
      this.o = localRandomAccessFile1;
      if (this.m != 1) {
        break label103;
      }
    }
    label103:
    for (RandomAccessFile localRandomAccessFile2 = this.i;; localRandomAccessFile2 = this.j)
    {
      this.p = localRandomAccessFile2;
      this.o.setLength(this.d);
      this.o.seek(this.d);
      this.e = 32;
      this.q = 32;
      if (this.m != 0) {
        break label111;
      }
      this.q += 12 * this.a;
      return;
      localRandomAccessFile1 = this.j;
      break;
    }
    label111:
    this.e += 12 * this.a;
  }
  
  private void f()
  {
    try
    {
      this.l.force();
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public final void a()
  {
    this.m = (1 - this.m);
    this.c = 0;
    this.d = 4;
    a(this.f, 12, this.m);
    a(this.f, 16, this.c);
    a(this.f, 20, this.d);
    b();
    e();
    int i1 = this.e;
    byte[] arrayOfByte = new byte[1024];
    this.l.position(i1);
    int i2 = 12 * this.a;
    while (i2 > 0)
    {
      int i3 = Math.min(i2, 1024);
      this.l.put(arrayOfByte, 0, i3);
      i2 -= i3;
    }
    try
    {
      this.l.force();
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public final void a(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = this.r;
    this.s.reset();
    this.s.update(paramArrayOfByte);
    int i1 = (int)this.s.getValue();
    int i2 = 0;
    long l1 = paramLong;
    while (i2 < 8)
    {
      arrayOfByte[(i2 + 0)] = ((byte)(int)(0xFF & l1));
      l1 >>= 8;
      i2++;
    }
    a(arrayOfByte, 8, i1);
    a(arrayOfByte, 12, this.d);
    a(arrayOfByte, 16, paramInt);
    this.o.write(arrayOfByte);
    this.o.write(paramArrayOfByte, 0, paramInt);
    this.l.putLong(this.t, paramLong);
    this.l.putInt(8 + this.t, this.d);
    this.d += paramInt + 20;
    a(this.f, 20, this.d);
  }
  
  public final boolean a(long paramLong, int paramInt)
  {
    int i1 = (int)(paramLong % this.a);
    if (i1 < 0) {
      i1 += this.a;
    }
    int i2 = i1;
    for (;;)
    {
      int i3 = paramInt + i2 * 12;
      long l1 = this.l.getLong(i3);
      int i4 = this.l.getInt(i3 + 8);
      if (i4 == 0)
      {
        this.t = i3;
        return false;
      }
      if (l1 == paramLong)
      {
        this.t = i3;
        this.u = i4;
        return true;
      }
      i2++;
      if (i2 >= this.a) {
        i2 = 0;
      }
      if (i2 == i1) {
        this.l.putInt(8 + (paramInt + i2 * 12), 0);
      }
    }
  }
  
  public final boolean a(iak paramiak)
  {
    if ((a(paramiak.a, this.e)) && (a(this.o, this.u, paramiak))) {}
    int i1;
    do
    {
      return true;
      i1 = this.t;
      if ((!a(paramiak.a, this.q)) || (!a(this.p, this.u, paramiak))) {
        break;
      }
    } while ((20 + this.d + paramiak.c > this.b) || (this.c << 1 >= this.a));
    this.t = i1;
    try
    {
      a(paramiak.a, paramiak.b, paramiak.c);
      this.c = (1 + this.c);
      a(this.f, 16, this.c);
      b();
      return true;
    }
    catch (Throwable localThrowable)
    {
      Log.e("BlobCache", "cannot copy over");
      return true;
    }
    return false;
  }
  
  public final void b()
  {
    a(this.f, 28, b(this.f, 0, 28));
    this.l.position(0);
    this.l.put(this.f);
  }
  
  public final void close()
  {
    f();
    try
    {
      this.i.getFD().sync();
      try
      {
        label14:
        this.j.getFD().sync();
        label24:
        c();
        return;
      }
      catch (Throwable localThrowable2)
      {
        break label24;
      }
    }
    catch (Throwable localThrowable1)
    {
      break label14;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iaj
 * JD-Core Version:    0.7.0.1
 */