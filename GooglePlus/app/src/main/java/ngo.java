import java.nio.ByteBuffer;

public final class ngo
  extends qan<ngo>
{
  public String a = null;
  public ngj b = null;
  public Boolean c = null;
  private int d = -2147483648;
  private Integer e = null;
  private String f = null;
  private String g = null;
  private Boolean h = null;
  private Boolean i = null;
  private Boolean j = null;
  
  public ngo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = 10;
    int m = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i11 = qal.d(8);
      int i12 = qal.a(str3);
      m += i11 + (i12 + qal.d(i12));
    }
    int i8;
    int i9;
    if (this.d != -2147483648)
    {
      i8 = this.d;
      i9 = qal.d(16);
      if (i8 < 0) {
        break label364;
      }
    }
    label364:
    for (int i10 = qal.d(i8);; i10 = k)
    {
      m += i10 + i9;
      if (this.c != null)
      {
        this.c.booleanValue();
        m += 1 + qal.d(24);
      }
      if (this.f != null)
      {
        String str2 = this.f;
        int i6 = qal.d(32);
        int i7 = qal.a(str2);
        m += i6 + (i7 + qal.d(i7));
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        m += 1 + qal.d(40);
      }
      if (this.i != null)
      {
        this.i.booleanValue();
        m += 1 + qal.d(48);
      }
      if (this.e != null)
      {
        int i4 = this.e.intValue();
        int i5 = qal.d(56);
        if (i4 >= 0) {
          k = qal.d(i4);
        }
        m += i5 + k;
      }
      if (this.g != null)
      {
        String str1 = this.g;
        int i2 = qal.d(64);
        int i3 = qal.a(str1);
        m += i2 + (i3 + qal.d(i3));
      }
      if (this.b != null)
      {
        ngj localngj = this.b;
        int n = qal.d(72);
        int i1 = localngj.a();
        localngj.ak = i1;
        m += n + (i1 + qal.d(i1));
      }
      if (this.j != null)
      {
        this.j.booleanValue();
        m += 1 + qal.d(80);
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    int k = 1;
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.d != -2147483648)
    {
      int i3 = this.d;
      paramqal.c(16);
      paramqal.a(i3);
    }
    if (this.c != null)
    {
      boolean bool4 = this.c.booleanValue();
      paramqal.c(24);
      if (bool4) {}
      byte b4;
      for (int i2 = k;; i2 = 0)
      {
        b4 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.f != null)
    {
      String str2 = this.f;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.h != null)
    {
      boolean bool3 = this.h.booleanValue();
      paramqal.c(40);
      if (bool3) {}
      byte b3;
      for (int i1 = k;; i1 = 0)
      {
        b3 = (byte)i1;
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
      paramqal.c(48);
      if (bool2) {}
      byte b2;
      for (int n = k;; n = 0)
      {
        b2 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.e != null)
    {
      int m = this.e.intValue();
      paramqal.c(56);
      paramqal.a(m);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(66);
      paramqal.a(str1);
    }
    if (this.b != null)
    {
      ngj localngj = this.b;
      paramqal.c(74);
      if (localngj.ak < 0) {
        localngj.ak = localngj.a();
      }
      paramqal.c(localngj.ak);
      localngj.a(paramqal);
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
 * Qualified Name:     ngo
 * JD-Core Version:    0.7.0.1
 */