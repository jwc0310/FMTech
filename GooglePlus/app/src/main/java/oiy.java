import java.nio.ByteBuffer;

public final class oiy
  extends qan<oiy>
{
  public String a = null;
  public String b = null;
  public Integer c = null;
  public Float d = null;
  public Float e = null;
  public Float f = null;
  public Boolean g = null;
  public Long h = null;
  public Integer i = null;
  private Float j = null;
  private Long k = null;
  private Float l = null;
  private String m = null;
  private Integer n = null;
  private Integer o = null;
  private String p = null;
  private String q = null;
  private String r = null;
  private String s = null;
  
  public oiy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.a != null)
    {
      String str7 = this.a;
      int i26 = qal.d(8);
      int i27 = qal.a(str7);
      i2 += i26 + (i27 + qal.d(i27));
    }
    if (this.b != null)
    {
      String str6 = this.b;
      int i24 = qal.d(16);
      int i25 = qal.a(str6);
      i2 += i24 + (i25 + qal.d(i25));
    }
    int i23;
    int i18;
    label419:
    int i13;
    int i14;
    if (this.c != null)
    {
      int i21 = this.c.intValue();
      int i22 = qal.d(24);
      if (i21 >= 0)
      {
        i23 = qal.d(i21);
        i2 += i23 + i22;
      }
    }
    else
    {
      if (this.d != null)
      {
        this.d.floatValue();
        i2 += 4 + qal.d(32);
      }
      if (this.e != null)
      {
        this.e.floatValue();
        i2 += 4 + qal.d(40);
      }
      if (this.j != null)
      {
        this.j.floatValue();
        i2 += 4 + qal.d(48);
      }
      if (this.k != null)
      {
        long l2 = this.k.longValue();
        i2 += qal.d(56) + qal.b(l2);
      }
      if (this.f != null)
      {
        this.f.floatValue();
        i2 += 4 + qal.d(64);
      }
      if (this.g != null)
      {
        this.g.booleanValue();
        i2 += 1 + qal.d(72);
      }
      if (this.l != null)
      {
        this.l.floatValue();
        i2 += 4 + qal.d(80);
      }
      if (this.m != null)
      {
        String str5 = this.m;
        int i19 = qal.d(88);
        int i20 = qal.a(str5);
        i2 += i19 + (i20 + qal.d(i20));
      }
      if (this.h != null)
      {
        long l1 = this.h.longValue();
        i2 += qal.d(96) + qal.b(l1);
      }
      if (this.n != null)
      {
        int i16 = this.n.intValue();
        int i17 = qal.d(104);
        if (i16 < 0) {
          break label685;
        }
        i18 = qal.d(i16);
        i2 += i18 + i17;
      }
      if (this.o != null)
      {
        i13 = this.o.intValue();
        i14 = qal.d(112);
        if (i13 < 0) {
          break label691;
        }
      }
    }
    label685:
    label691:
    for (int i15 = qal.d(i13);; i15 = i1)
    {
      i2 += i15 + i14;
      if (this.i != null)
      {
        int i11 = this.i.intValue();
        int i12 = qal.d(120);
        if (i11 >= 0) {
          i1 = qal.d(i11);
        }
        i2 += i12 + i1;
      }
      if (this.p != null)
      {
        String str4 = this.p;
        int i9 = qal.d(128);
        int i10 = qal.a(str4);
        i2 += i9 + (i10 + qal.d(i10));
      }
      if (this.q != null)
      {
        String str3 = this.q;
        int i7 = qal.d(136);
        int i8 = qal.a(str3);
        i2 += i7 + (i8 + qal.d(i8));
      }
      if (this.r != null)
      {
        String str2 = this.r;
        int i5 = qal.d(144);
        int i6 = qal.a(str2);
        i2 += i5 + (i6 + qal.d(i6));
      }
      if (this.s != null)
      {
        String str1 = this.s;
        int i3 = qal.d(152);
        int i4 = qal.a(str1);
        i2 += i3 + (i4 + qal.d(i4));
      }
      return i2;
      i23 = i1;
      break;
      i18 = i1;
      break label419;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str7 = this.a;
      paramqal.c(10);
      paramqal.a(str7);
    }
    if (this.b != null)
    {
      String str6 = this.b;
      paramqal.c(18);
      paramqal.a(str6);
    }
    if (this.c != null)
    {
      int i5 = this.c.intValue();
      paramqal.c(24);
      paramqal.a(i5);
    }
    if (this.d != null)
    {
      float f5 = this.d.floatValue();
      paramqal.c(37);
      paramqal.e(Float.floatToIntBits(f5));
    }
    if (this.e != null)
    {
      float f4 = this.e.floatValue();
      paramqal.c(45);
      paramqal.e(Float.floatToIntBits(f4));
    }
    if (this.j != null)
    {
      float f3 = this.j.floatValue();
      paramqal.c(53);
      paramqal.e(Float.floatToIntBits(f3));
    }
    if (this.k != null)
    {
      long l2 = this.k.longValue();
      paramqal.c(56);
      paramqal.a(l2);
    }
    if (this.f != null)
    {
      float f2 = this.f.floatValue();
      paramqal.c(69);
      paramqal.e(Float.floatToIntBits(f2));
    }
    if (this.g != null)
    {
      boolean bool = this.g.booleanValue();
      paramqal.c(72);
      if (bool) {}
      byte b1;
      for (int i4 = 1;; i4 = 0)
      {
        b1 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.l != null)
    {
      float f1 = this.l.floatValue();
      paramqal.c(85);
      paramqal.e(Float.floatToIntBits(f1));
    }
    if (this.m != null)
    {
      String str5 = this.m;
      paramqal.c(90);
      paramqal.a(str5);
    }
    if (this.h != null)
    {
      long l1 = this.h.longValue();
      paramqal.c(96);
      paramqal.a(l1);
    }
    if (this.n != null)
    {
      int i3 = this.n.intValue();
      paramqal.c(104);
      paramqal.a(i3);
    }
    if (this.o != null)
    {
      int i2 = this.o.intValue();
      paramqal.c(112);
      paramqal.a(i2);
    }
    if (this.i != null)
    {
      int i1 = this.i.intValue();
      paramqal.c(120);
      paramqal.a(i1);
    }
    if (this.p != null)
    {
      String str4 = this.p;
      paramqal.c(130);
      paramqal.a(str4);
    }
    if (this.q != null)
    {
      String str3 = this.q;
      paramqal.c(138);
      paramqal.a(str3);
    }
    if (this.r != null)
    {
      String str2 = this.r;
      paramqal.c(146);
      paramqal.a(str2);
    }
    if (this.s != null)
    {
      String str1 = this.s;
      paramqal.c(154);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oiy
 * JD-Core Version:    0.7.0.1
 */