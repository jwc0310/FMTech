import java.nio.ByteBuffer;

public final class obg
  extends qan<obg>
{
  private static volatile obg[] d;
  public String a = null;
  public int b = -2147483648;
  public Boolean c = null;
  private int e = -2147483648;
  private int f = -2147483648;
  private String g = null;
  private Boolean h = null;
  private Boolean i = null;
  
  public obg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static obg[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new obg[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int j = 10;
    int k = super.a();
    int i10;
    int i11;
    if (this.e != -2147483648)
    {
      int i9 = this.e;
      i10 = qal.d(8);
      if (i9 >= 0) {
        i11 = qal.d(i9);
      }
    }
    for (int m = k + (i11 + i10);; m = k)
    {
      if (this.h != null)
      {
        this.h.booleanValue();
        m += 1 + qal.d(16);
      }
      int i6;
      int i7;
      if (this.f != -2147483648)
      {
        i6 = this.f;
        i7 = qal.d(24);
        if (i6 < 0) {
          break label297;
        }
      }
      label297:
      for (int i8 = qal.d(i6);; i8 = j)
      {
        m += i8 + i7;
        if (this.a != null)
        {
          String str2 = this.a;
          int i4 = qal.d(32);
          int i5 = qal.a(str2);
          m += i4 + (i5 + qal.d(i5));
        }
        if (this.b != -2147483648)
        {
          int i2 = this.b;
          int i3 = qal.d(40);
          if (i2 >= 0) {
            j = qal.d(i2);
          }
          m += j + i3;
        }
        if (this.i != null)
        {
          this.i.booleanValue();
          m += 1 + qal.d(48);
        }
        if (this.c != null)
        {
          this.c.booleanValue();
          m += 1 + qal.d(56);
        }
        if (this.g != null)
        {
          String str1 = this.g;
          int n = qal.d(64);
          int i1 = qal.a(str1);
          m += n + (i1 + qal.d(i1));
        }
        return m;
        i11 = j;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    int j = 1;
    if (this.e != -2147483648)
    {
      int i2 = this.e;
      paramqal.c(8);
      paramqal.a(i2);
    }
    if (this.h != null)
    {
      boolean bool3 = this.h.booleanValue();
      paramqal.c(16);
      if (bool3) {}
      byte b3;
      for (int i1 = j;; i1 = 0)
      {
        b3 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.f != -2147483648)
    {
      int n = this.f;
      paramqal.c(24);
      paramqal.a(n);
    }
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.b != -2147483648)
    {
      int m = this.b;
      paramqal.c(40);
      paramqal.a(m);
    }
    if (this.i != null)
    {
      boolean bool2 = this.i.booleanValue();
      paramqal.c(48);
      if (bool2) {}
      byte b2;
      for (int k = j;; k = 0)
      {
        b2 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.c != null)
    {
      boolean bool1 = this.c.booleanValue();
      paramqal.c(56);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        j = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(66);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     obg
 * JD-Core Version:    0.7.0.1
 */