import java.nio.ByteBuffer;

public final class nso
  extends qan<nso>
{
  public String a = null;
  public Integer b = null;
  public String c = null;
  public String d = null;
  public nsl e = null;
  public Boolean f = null;
  public Boolean g = null;
  public Boolean h = null;
  private String i = null;
  private String j = null;
  
  public nso()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = super.a();
    if (this.a != null)
    {
      String str5 = this.a;
      int i12 = qal.d(8);
      int i13 = qal.a(str5);
      k += i12 + (i13 + qal.d(i13));
    }
    int i9;
    int i10;
    if (this.b != null)
    {
      i9 = this.b.intValue();
      i10 = qal.d(16);
      if (i9 < 0) {
        break label374;
      }
    }
    label374:
    for (int i11 = qal.d(i9);; i11 = 10)
    {
      k += i11 + i10;
      if (this.c != null)
      {
        String str4 = this.c;
        int i7 = qal.d(24);
        int i8 = qal.a(str4);
        k += i7 + (i8 + qal.d(i8));
      }
      if (this.d != null)
      {
        String str3 = this.d;
        int i5 = qal.d(32);
        int i6 = qal.a(str3);
        k += i5 + (i6 + qal.d(i6));
      }
      if (this.i != null)
      {
        String str2 = this.i;
        int i3 = qal.d(40);
        int i4 = qal.a(str2);
        k += i3 + (i4 + qal.d(i4));
      }
      if (this.e != null)
      {
        nsl localnsl = this.e;
        int i1 = qal.d(48);
        int i2 = localnsl.a();
        localnsl.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.f != null)
      {
        this.f.booleanValue();
        k += 1 + qal.d(56);
      }
      if (this.g != null)
      {
        this.g.booleanValue();
        k += 1 + qal.d(64);
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        k += 1 + qal.d(72);
      }
      if (this.j != null)
      {
        String str1 = this.j;
        int m = qal.d(80);
        int n = qal.a(str1);
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    int k = 1;
    if (this.a != null)
    {
      String str5 = this.a;
      paramqal.c(10);
      paramqal.a(str5);
    }
    if (this.b != null)
    {
      int i1 = this.b.intValue();
      paramqal.c(16);
      paramqal.a(i1);
    }
    if (this.c != null)
    {
      String str4 = this.c;
      paramqal.c(26);
      paramqal.a(str4);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      paramqal.c(34);
      paramqal.a(str3);
    }
    if (this.i != null)
    {
      String str2 = this.i;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      nsl localnsl = this.e;
      paramqal.c(50);
      if (localnsl.ak < 0) {
        localnsl.ak = localnsl.a();
      }
      paramqal.c(localnsl.ak);
      localnsl.a(paramqal);
    }
    if (this.f != null)
    {
      boolean bool3 = this.f.booleanValue();
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
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
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
    if (this.h != null)
    {
      boolean bool1 = this.h.booleanValue();
      paramqal.c(72);
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
    if (this.j != null)
    {
      String str1 = this.j;
      paramqal.c(82);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nso
 * JD-Core Version:    0.7.0.1
 */