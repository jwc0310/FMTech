import java.nio.ByteBuffer;

public final class oks
  extends qan<oks>
{
  public String a = null;
  public Double b = null;
  public Boolean c = null;
  public String d = null;
  public Integer e = null;
  private int f = -2147483648;
  private String g = null;
  private okq h = null;
  private String i = null;
  private String j = null;
  private okt k = null;
  private String l = null;
  private String m = null;
  private String n = null;
  private okp[] o = okp.b();
  private Boolean p = null;
  private String q = null;
  private String r = null;
  private Integer s = null;
  private okr[] t = okr.b();
  private Boolean u = null;
  private String v = null;
  private Boolean w = null;
  
  public oks()
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
      String str11 = this.a;
      int i43 = qal.d(8);
      int i44 = qal.a(str11);
      i2 += i43 + (i44 + qal.d(i44));
    }
    int i40;
    int i41;
    if (this.f != -2147483648)
    {
      i40 = this.f;
      i41 = qal.d(16);
      if (i40 < 0) {
        break label547;
      }
    }
    int i20;
    label547:
    for (int i42 = qal.d(i40);; i42 = i1)
    {
      i2 += i42 + i41;
      if (this.g != null)
      {
        String str10 = this.g;
        int i38 = qal.d(24);
        int i39 = qal.a(str10);
        i2 += i38 + (i39 + qal.d(i39));
      }
      if (this.h != null)
      {
        okq localokq = this.h;
        int i36 = qal.d(32);
        int i37 = localokq.a();
        localokq.ak = i37;
        i2 += i36 + (i37 + qal.d(i37));
      }
      if (this.i != null)
      {
        String str9 = this.i;
        int i34 = qal.d(40);
        int i35 = qal.a(str9);
        i2 += i34 + (i35 + qal.d(i35));
      }
      if (this.j != null)
      {
        String str8 = this.j;
        int i32 = qal.d(48);
        int i33 = qal.a(str8);
        i2 += i32 + (i33 + qal.d(i33));
      }
      if (this.b != null)
      {
        this.b.doubleValue();
        i2 += 8 + qal.d(56);
      }
      if (this.k != null)
      {
        okt localokt = this.k;
        int i30 = qal.d(64);
        int i31 = localokt.a();
        localokt.ak = i31;
        i2 += i30 + (i31 + qal.d(i31));
      }
      if (this.l != null)
      {
        String str7 = this.l;
        int i28 = qal.d(80);
        int i29 = qal.a(str7);
        i2 += i28 + (i29 + qal.d(i29));
      }
      if (this.m != null)
      {
        String str6 = this.m;
        int i26 = qal.d(88);
        int i27 = qal.a(str6);
        i2 += i26 + (i27 + qal.d(i27));
      }
      if (this.n != null)
      {
        String str5 = this.n;
        int i24 = qal.d(96);
        int i25 = qal.a(str5);
        i2 += i24 + (i25 + qal.d(i25));
      }
      if ((this.o == null) || (this.o.length <= 0)) {
        break label556;
      }
      i20 = i2;
      for (int i21 = 0; i21 < this.o.length; i21++)
      {
        okp localokp = this.o[i21];
        if (localokp != null)
        {
          int i22 = qal.d(104);
          int i23 = localokp.a();
          localokp.ak = i23;
          i20 += i22 + (i23 + qal.d(i23));
        }
      }
    }
    i2 = i20;
    label556:
    if (this.c != null)
    {
      this.c.booleanValue();
      i2 += 1 + qal.d(112);
    }
    if (this.q != null)
    {
      String str4 = this.q;
      int i18 = qal.d(120);
      int i19 = qal.a(str4);
      i2 += i18 + (i19 + qal.d(i19));
    }
    if (this.r != null)
    {
      String str3 = this.r;
      int i16 = qal.d(128);
      int i17 = qal.a(str3);
      i2 += i16 + (i17 + qal.d(i17));
    }
    int i13;
    int i14;
    if (this.e != null)
    {
      i13 = this.e.intValue();
      i14 = qal.d(136);
      if (i13 < 0) {
        break label796;
      }
    }
    label796:
    for (int i15 = qal.d(i13);; i15 = i1)
    {
      i2 += i15 + i14;
      if (this.t == null) {
        break;
      }
      int i9 = this.t.length;
      int i10 = 0;
      if (i9 <= 0) {
        break;
      }
      while (i10 < this.t.length)
      {
        okr localokr = this.t[i10];
        if (localokr != null)
        {
          int i11 = qal.d(144);
          int i12 = localokr.a();
          localokr.ak = i12;
          i2 += i11 + (i12 + qal.d(i12));
        }
        i10++;
      }
    }
    if (this.u != null)
    {
      this.u.booleanValue();
      i2 += 1 + qal.d(152);
    }
    if (this.s != null)
    {
      int i7 = this.s.intValue();
      int i8 = qal.d(160);
      if (i7 >= 0) {
        i1 = qal.d(i7);
      }
      i2 += i8 + i1;
    }
    if (this.p != null)
    {
      this.p.booleanValue();
      i2 += 1 + qal.d(168);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i5 = qal.d(176);
      int i6 = qal.a(str2);
      i2 += i5 + (i6 + qal.d(i6));
    }
    if (this.v != null)
    {
      String str1 = this.v;
      int i3 = qal.d(184);
      int i4 = qal.a(str1);
      i2 += i3 + (i4 + qal.d(i4));
    }
    if (this.w != null)
    {
      this.w.booleanValue();
      i2 += 1 + qal.d(192);
    }
    return i2;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.a != null)
    {
      String str11 = this.a;
      paramqal.c(10);
      paramqal.a(str11);
    }
    if (this.f != -2147483648)
    {
      int i9 = this.f;
      paramqal.c(16);
      paramqal.a(i9);
    }
    if (this.g != null)
    {
      String str10 = this.g;
      paramqal.c(26);
      paramqal.a(str10);
    }
    if (this.h != null)
    {
      okq localokq = this.h;
      paramqal.c(34);
      if (localokq.ak < 0) {
        localokq.ak = localokq.a();
      }
      paramqal.c(localokq.ak);
      localokq.a(paramqal);
    }
    if (this.i != null)
    {
      String str9 = this.i;
      paramqal.c(42);
      paramqal.a(str9);
    }
    if (this.j != null)
    {
      String str8 = this.j;
      paramqal.c(50);
      paramqal.a(str8);
    }
    if (this.b != null)
    {
      double d1 = this.b.doubleValue();
      paramqal.c(57);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.k != null)
    {
      okt localokt = this.k;
      paramqal.c(66);
      if (localokt.ak < 0) {
        localokt.ak = localokt.a();
      }
      paramqal.c(localokt.ak);
      localokt.a(paramqal);
    }
    if (this.l != null)
    {
      String str7 = this.l;
      paramqal.c(82);
      paramqal.a(str7);
    }
    if (this.m != null)
    {
      String str6 = this.m;
      paramqal.c(90);
      paramqal.a(str6);
    }
    if (this.n != null)
    {
      String str5 = this.n;
      paramqal.c(98);
      paramqal.a(str5);
    }
    if ((this.o != null) && (this.o.length > 0)) {
      for (int i8 = 0; i8 < this.o.length; i8++)
      {
        okp localokp = this.o[i8];
        if (localokp != null)
        {
          paramqal.c(106);
          if (localokp.ak < 0) {
            localokp.ak = localokp.a();
          }
          paramqal.c(localokp.ak);
          localokp.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      boolean bool4 = this.c.booleanValue();
      paramqal.c(112);
      if (bool4) {}
      byte b4;
      for (int i7 = i1;; i7 = 0)
      {
        b4 = (byte)i7;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.q != null)
    {
      String str4 = this.q;
      paramqal.c(122);
      paramqal.a(str4);
    }
    if (this.r != null)
    {
      String str3 = this.r;
      paramqal.c(130);
      paramqal.a(str3);
    }
    if (this.e != null)
    {
      int i6 = this.e.intValue();
      paramqal.c(136);
      paramqal.a(i6);
    }
    if ((this.t != null) && (this.t.length > 0)) {
      for (int i5 = 0; i5 < this.t.length; i5++)
      {
        okr localokr = this.t[i5];
        if (localokr != null)
        {
          paramqal.c(146);
          if (localokr.ak < 0) {
            localokr.ak = localokr.a();
          }
          paramqal.c(localokr.ak);
          localokr.a(paramqal);
        }
      }
    }
    if (this.u != null)
    {
      boolean bool3 = this.u.booleanValue();
      paramqal.c(152);
      if (bool3) {}
      byte b3;
      for (int i4 = i1;; i4 = 0)
      {
        b3 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.s != null)
    {
      int i3 = this.s.intValue();
      paramqal.c(160);
      paramqal.a(i3);
    }
    if (this.p != null)
    {
      boolean bool2 = this.p.booleanValue();
      paramqal.c(168);
      if (bool2) {}
      byte b2;
      for (int i2 = i1;; i2 = 0)
      {
        b2 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(178);
      paramqal.a(str2);
    }
    if (this.v != null)
    {
      String str1 = this.v;
      paramqal.c(186);
      paramqal.a(str1);
    }
    if (this.w != null)
    {
      boolean bool1 = this.w.booleanValue();
      paramqal.c(192);
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
 * Qualified Name:     oks
 * JD-Core Version:    0.7.0.1
 */