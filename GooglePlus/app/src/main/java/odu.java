import java.nio.ByteBuffer;

public final class odu
  extends qan<odu>
{
  private static volatile odu[] f;
  public String a = null;
  public String b = null;
  public String c = null;
  public int d = -2147483648;
  public odn e = null;
  private String g = null;
  private Boolean h = null;
  private Boolean i = null;
  private Boolean j = null;
  
  public odu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static odu[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new odu[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int k = super.a();
    if (this.a != null)
    {
      String str4 = this.a;
      int i10 = qal.d(8);
      int i11 = qal.a(str4);
      k += i10 + (i11 + qal.d(i11));
    }
    if (this.b != null)
    {
      String str3 = this.b;
      int i8 = qal.d(16);
      int i9 = qal.a(str3);
      k += i8 + (i9 + qal.d(i9));
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int i6 = qal.d(24);
      int i7 = qal.a(str2);
      k += i6 + (i7 + qal.d(i7));
    }
    if (this.g != null)
    {
      String str1 = this.g;
      int i4 = qal.d(32);
      int i5 = qal.a(str1);
      k += i4 + (i5 + qal.d(i5));
    }
    int i1;
    int i2;
    if (this.d != -2147483648)
    {
      i1 = this.d;
      i2 = qal.d(40);
      if (i1 < 0) {
        break label333;
      }
    }
    label333:
    for (int i3 = qal.d(i1);; i3 = 10)
    {
      k += i3 + i2;
      if (this.h != null)
      {
        this.h.booleanValue();
        k += 1 + qal.d(56);
      }
      if (this.i != null)
      {
        this.i.booleanValue();
        k += 1 + qal.d(64);
      }
      if (this.e != null)
      {
        odn localodn = this.e;
        int m = qal.d(72);
        int n = localodn.a();
        localodn.ak = n;
        k += m + (n + qal.d(n));
      }
      if (this.j != null)
      {
        this.j.booleanValue();
        k += 1 + qal.d(80);
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    int k = 1;
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(10);
      paramqal.a(str4);
    }
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.d != -2147483648)
    {
      int i1 = this.d;
      paramqal.c(40);
      paramqal.a(i1);
    }
    if (this.h != null)
    {
      boolean bool3 = this.h.booleanValue();
      paramqal.c(56);
      if (bool3) {}
      byte b3;
      for (int n = k;; n = 0)
      {
        b3 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.i != null)
    {
      boolean bool2 = this.i.booleanValue();
      paramqal.c(64);
      if (bool2) {}
      byte b2;
      for (int m = k;; m = 0)
      {
        b2 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.e != null)
    {
      odn localodn = this.e;
      paramqal.c(74);
      if (localodn.ak < 0) {
        localodn.ak = localodn.a();
      }
      paramqal.c(localodn.ak);
      localodn.a(paramqal);
    }
    if (this.j != null)
    {
      boolean bool1 = this.j.booleanValue();
      paramqal.c(80);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        k = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odu
 * JD-Core Version:    0.7.0.1
 */