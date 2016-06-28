import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public final class bkd
{
  static final byte[] a = a("Content-Type: ");
  static final byte[] b = a("application/x-protobuf");
  static final byte[] c = a("Content-Transfer-Encoding: binary");
  static final byte[] d = a("\r\n");
  private static final byte[] j = a("--");
  private static final byte[] k = a("onetwothreefourfivesixseven");
  final byte[] e;
  final byte[] f;
  final InputStream g;
  final byte[] h;
  final long i;
  
  public bkd(byte[] paramArrayOfByte, InputStream paramInputStream, String paramString, long paramLong)
  {
    this.e = paramArrayOfByte;
    this.f = null;
    this.g = paramInputStream;
    this.h = a(paramString);
    this.i = (paramLong + a() + (0 + d.length + a(true)));
  }
  
  public bkd(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString)
  {
    this.e = paramArrayOfByte1;
    this.f = paramArrayOfByte2;
    this.g = null;
    this.h = a(paramString);
    this.i = (a() + paramArrayOfByte2.length + (0 + d.length + a(true)));
  }
  
  static int a(boolean paramBoolean)
  {
    int m = 0 + j.length + k.length;
    if (paramBoolean) {
      m += j.length;
    }
    return m + d.length;
  }
  
  static void a(bkf parambkf, boolean paramBoolean)
  {
    parambkf.a(j);
    parambkf.a(k);
    if (paramBoolean) {
      parambkf.a(j);
    }
    parambkf.a(d);
  }
  
  private static byte[] a(String paramString)
  {
    if (paramString != null) {
      try
      {
        byte[] arrayOfByte = paramString.getBytes("US-ASCII");
        return arrayOfByte;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
    }
    return new byte[0];
  }
  
  final int a()
  {
    int m = 0 + a(false);
    byte[] arrayOfByte1 = this.e;
    int n = m + (0 + a.length + b.length + d.length + d.length + arrayOfByte1.length + d.length) + a(false);
    byte[] arrayOfByte2 = this.h;
    return n + (0 + a.length + arrayOfByte2.length + d.length + c.length + d.length + d.length);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bkd
 * JD-Core Version:    0.7.0.1
 */