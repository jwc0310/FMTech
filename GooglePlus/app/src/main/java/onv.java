import java.nio.ByteBuffer;

public final class onv
  extends qan<onv>
{
  public Integer a = null;
  public Integer b = null;
  public Float c = null;
  public Float d = null;
  public String e = null;
  public String f = null;
  public String g = null;
  public Double h = null;
  private String i = null;
  private onw j = null;
  private String k = null;
  private String l = null;
  private String m = null;
  private String n = null;
  private Boolean o = null;
  private Boolean p = null;
  private String q = null;
  private ook[] r = ook.b();
  
  public onv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.c != null)
    {
      this.c.floatValue();
      i2 += 4 + qal.d(8);
    }
    if (this.d != null)
    {
      this.d.floatValue();
      i2 += 4 + qal.d(16);
    }
    if (this.e != null)
    {
      String str9 = this.e;
      int i30 = qal.d(24);
      int i31 = qal.a(str9);
      i2 += i30 + (i31 + qal.d(i31));
    }
    if (this.f != null)
    {
      String str8 = this.f;
      int i28 = qal.d(32);
      int i29 = qal.a(str8);
      i2 += i28 + (i29 + qal.d(i29));
    }
    if (this.g != null)
    {
      String str7 = this.g;
      int i26 = qal.d(40);
      int i27 = qal.a(str7);
      i2 += i26 + (i27 + qal.d(i27));
    }
    if (this.i != null)
    {
      String str6 = this.i;
      int i24 = qal.d(48);
      int i25 = qal.a(str6);
      i2 += i24 + (i25 + qal.d(i25));
    }
    if (this.j != null)
    {
      onw localonw = this.j;
      int i22 = qal.d(56);
      int i23 = localonw.a();
      localonw.ak = i23;
      i2 += i22 + (i23 + qal.d(i23));
    }
    if (this.k != null)
    {
      String str5 = this.k;
      int i20 = qal.d(64);
      int i21 = qal.a(str5);
      i2 += i20 + (i21 + qal.d(i21));
    }
    if (this.l != null)
    {
      String str4 = this.l;
      int i18 = qal.d(72);
      int i19 = qal.a(str4);
      i2 += i18 + (i19 + qal.d(i19));
    }
    if (this.m != null)
    {
      String str3 = this.m;
      int i16 = qal.d(80);
      int i17 = qal.a(str3);
      i2 += i16 + (i17 + qal.d(i17));
    }
    if (this.n != null)
    {
      String str2 = this.n;
      int i14 = qal.d(88);
      int i15 = qal.a(str2);
      i2 += i14 + (i15 + qal.d(i15));
    }
    if (this.o != null)
    {
      this.o.booleanValue();
      i2 += 1 + qal.d(96);
    }
    if (this.h != null)
    {
      this.h.doubleValue();
      i2 += 8 + qal.d(104);
    }
    int i11;
    int i12;
    if (this.a != null)
    {
      i11 = this.a.intValue();
      i12 = qal.d(112);
      if (i11 < 0) {
        break label723;
      }
    }
    int i3;
    label723:
    for (int i13 = qal.d(i11);; i13 = i1)
    {
      i2 += i13 + i12;
      if (this.b != null)
      {
        int i9 = this.b.intValue();
        int i10 = qal.d(120);
        if (i9 >= 0) {
          i1 = qal.d(i9);
        }
        i2 += i10 + i1;
      }
      if (this.p != null)
      {
        this.p.booleanValue();
        i2 += 1 + qal.d(128);
      }
      if (this.q != null)
      {
        String str1 = this.q;
        int i7 = qal.d(136);
        int i8 = qal.a(str1);
        i2 += i7 + (i8 + qal.d(i8));
      }
      if ((this.r == null) || (this.r.length <= 0)) {
        return i2;
      }
      i3 = i2;
      for (int i4 = 0; i4 < this.r.length; i4++)
      {
        ook localook = this.r[i4];
        if (localook != null)
        {
          int i5 = qal.d(144);
          int i6 = localook.a();
          localook.ak = i6;
          i3 += i5 + (i6 + qal.d(i6));
        }
      }
    }
    i2 = i3;
    return i2;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.c != null)
    {
      float f2 = this.c.floatValue();
      paramqal.c(13);
      paramqal.e(Float.floatToIntBits(f2));
    }
    if (this.d != null)
    {
      float f1 = this.d.floatValue();
      paramqal.c(21);
      paramqal.e(Float.floatToIntBits(f1));
    }
    if (this.e != null)
    {
      String str9 = this.e;
      paramqal.c(26);
      paramqal.a(str9);
    }
    if (this.f != null)
    {
      String str8 = this.f;
      paramqal.c(34);
      paramqal.a(str8);
    }
    if (this.g != null)
    {
      String str7 = this.g;
      paramqal.c(42);
      paramqal.a(str7);
    }
    if (this.i != null)
    {
      String str6 = this.i;
      paramqal.c(50);
      paramqal.a(str6);
    }
    if (this.j != null)
    {
      onw localonw = this.j;
      paramqal.c(58);
      if (localonw.ak < 0) {
        localonw.ak = localonw.a();
      }
      paramqal.c(localonw.ak);
      localonw.a(paramqal);
    }
    if (this.k != null)
    {
      String str5 = this.k;
      paramqal.c(66);
      paramqal.a(str5);
    }
    if (this.l != null)
    {
      String str4 = this.l;
      paramqal.c(74);
      paramqal.a(str4);
    }
    if (this.m != null)
    {
      String str3 = this.m;
      paramqal.c(82);
      paramqal.a(str3);
    }
    if (this.n != null)
    {
      String str2 = this.n;
      paramqal.c(90);
      paramqal.a(str2);
    }
    if (this.o != null)
    {
      boolean bool2 = this.o.booleanValue();
      paramqal.c(96);
      if (bool2) {}
      byte b2;
      for (int i6 = i1;; i6 = 0)
      {
        b2 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.h != null)
    {
      double d1 = this.h.doubleValue();
      paramqal.c(105);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.a != null)
    {
      int i5 = this.a.intValue();
      paramqal.c(112);
      paramqal.a(i5);
    }
    if (this.b != null)
    {
      int i4 = this.b.intValue();
      paramqal.c(120);
      paramqal.a(i4);
    }
    if (this.p != null)
    {
      boolean bool1 = this.p.booleanValue();
      paramqal.c(128);
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
    if (this.q != null)
    {
      String str1 = this.q;
      paramqal.c(138);
      paramqal.a(str1);
    }
    if (this.r != null)
    {
      int i2 = this.r.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.r.length)
        {
          ook localook = this.r[i3];
          if (localook != null)
          {
            paramqal.c(146);
            if (localook.ak < 0) {
              localook.ak = localook.a();
            }
            paramqal.c(localook.ak);
            localook.a(paramqal);
          }
          i3++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     onv
 * JD-Core Version:    0.7.0.1
 */