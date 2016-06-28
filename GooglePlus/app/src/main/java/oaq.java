import java.nio.ByteBuffer;

public final class oaq
  extends qan<oaq>
{
  private static volatile oaq[] k;
  public String a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public Boolean e = null;
  public String f = null;
  public Boolean g = null;
  public String h = null;
  public String i = null;
  public Boolean j = null;
  private String l = null;
  private oai[] m = oai.b();
  private int n = -2147483648;
  private Long o = null;
  
  public oaq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oaq[] b()
  {
    if (k == null) {}
    synchronized (qar.a)
    {
      if (k == null) {
        k = new oaq[0];
      }
      return k;
    }
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.a != null)
    {
      String str8 = this.a;
      int i23 = qal.d(8);
      int i24 = qal.a(str8);
      i1 += i23 + (i24 + qal.d(i24));
    }
    if (this.c != null)
    {
      String str7 = this.c;
      int i21 = qal.d(16);
      int i22 = qal.a(str7);
      i1 += i21 + (i22 + qal.d(i22));
    }
    if (this.l != null)
    {
      String str6 = this.l;
      int i19 = qal.d(24);
      int i20 = qal.a(str6);
      i1 += i19 + (i20 + qal.d(i20));
    }
    if (this.d != null)
    {
      String str5 = this.d;
      int i17 = qal.d(32);
      int i18 = qal.a(str5);
      i1 += i17 + (i18 + qal.d(i18));
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i1 += 1 + qal.d(40);
    }
    if ((this.m != null) && (this.m.length > 0))
    {
      int i13 = i1;
      for (int i14 = 0; i14 < this.m.length; i14++)
      {
        oai localoai = this.m[i14];
        if (localoai != null)
        {
          int i15 = qal.d(48);
          int i16 = localoai.a();
          localoai.ak = i16;
          i13 += i15 + (i16 + qal.d(i16));
        }
      }
      i1 = i13;
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i11 = qal.d(56);
      int i12 = qal.a(str4);
      i1 += i11 + (i12 + qal.d(i12));
    }
    if (this.f != null)
    {
      String str3 = this.f;
      int i9 = qal.d(64);
      int i10 = qal.a(str3);
      i1 += i9 + (i10 + qal.d(i10));
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      i1 += 1 + qal.d(72);
    }
    int i6;
    int i7;
    if (this.n != -2147483648)
    {
      i6 = this.n;
      i7 = qal.d(80);
      if (i6 < 0) {
        break label571;
      }
    }
    label571:
    for (int i8 = qal.d(i6);; i8 = 10)
    {
      i1 += i8 + i7;
      if (this.h != null)
      {
        String str2 = this.h;
        int i4 = qal.d(88);
        int i5 = qal.a(str2);
        i1 += i4 + (i5 + qal.d(i5));
      }
      if (this.i != null)
      {
        String str1 = this.i;
        int i2 = qal.d(96);
        int i3 = qal.a(str1);
        i1 += i2 + (i3 + qal.d(i3));
      }
      if (this.o != null)
      {
        long l1 = this.o.longValue();
        i1 += qal.d(104) + qal.b(l1);
      }
      if (this.j != null)
      {
        this.j.booleanValue();
        i1 += 1 + qal.d(112);
      }
      return i1;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.a != null)
    {
      String str8 = this.a;
      paramqal.c(10);
      paramqal.a(str8);
    }
    if (this.c != null)
    {
      String str7 = this.c;
      paramqal.c(18);
      paramqal.a(str7);
    }
    if (this.l != null)
    {
      String str6 = this.l;
      paramqal.c(26);
      paramqal.a(str6);
    }
    if (this.d != null)
    {
      String str5 = this.d;
      paramqal.c(34);
      paramqal.a(str5);
    }
    if (this.e != null)
    {
      boolean bool3 = this.e.booleanValue();
      paramqal.c(40);
      if (bool3) {}
      byte b3;
      for (int i5 = i1;; i5 = 0)
      {
        b3 = (byte)i5;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if ((this.m != null) && (this.m.length > 0)) {
      for (int i4 = 0; i4 < this.m.length; i4++)
      {
        oai localoai = this.m[i4];
        if (localoai != null)
        {
          paramqal.c(50);
          if (localoai.ak < 0) {
            localoai.ak = localoai.a();
          }
          paramqal.c(localoai.ak);
          localoai.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(58);
      paramqal.a(str4);
    }
    if (this.f != null)
    {
      String str3 = this.f;
      paramqal.c(66);
      paramqal.a(str3);
    }
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
      paramqal.c(72);
      if (bool2) {}
      byte b2;
      for (int i3 = i1;; i3 = 0)
      {
        b2 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.n != -2147483648)
    {
      int i2 = this.n;
      paramqal.c(80);
      paramqal.a(i2);
    }
    if (this.h != null)
    {
      String str2 = this.h;
      paramqal.c(90);
      paramqal.a(str2);
    }
    if (this.i != null)
    {
      String str1 = this.i;
      paramqal.c(98);
      paramqal.a(str1);
    }
    if (this.o != null)
    {
      long l1 = this.o.longValue();
      paramqal.c(104);
      paramqal.a(l1);
    }
    if (this.j != null)
    {
      boolean bool1 = this.j.booleanValue();
      paramqal.c(112);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i1 = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oaq
 * JD-Core Version:    0.7.0.1
 */