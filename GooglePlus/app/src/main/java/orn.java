import java.nio.ByteBuffer;

public final class orn
  extends qan<orn>
{
  private String A = null;
  private Boolean B = null;
  private String C = null;
  private String[] D = qay.f;
  private int[] E = qay.a;
  private ory F = null;
  private String[] G = qay.f;
  private String H = null;
  private String I = null;
  private osa[] J = osa.b();
  public String a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public String e = null;
  public Boolean f = null;
  public int g = -2147483648;
  public Boolean h = null;
  public Boolean i = null;
  public String j = null;
  public String k = null;
  public String l = null;
  public String m = null;
  public String n = null;
  public int o = -2147483648;
  public orp p = null;
  public orx[] q = orx.b();
  public osg[] r = osg.b();
  public oro[] s = oro.b();
  private String t = null;
  private String u = null;
  private String v = null;
  private Double w = null;
  private Boolean x = null;
  private Boolean y = null;
  private Boolean z = null;
  
  public orn()
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
      String str19 = this.a;
      int i72 = qal.d(8);
      int i73 = qal.a(str19);
      i2 += i72 + (i73 + qal.d(i73));
    }
    if (this.w != null)
    {
      this.w.doubleValue();
      i2 += 8 + qal.d(32);
    }
    if (this.e != null)
    {
      String str18 = this.e;
      int i70 = qal.d(40);
      int i71 = qal.a(str18);
      i2 += i70 + (i71 + qal.d(i71));
    }
    if (this.b != null)
    {
      String str17 = this.b;
      int i68 = qal.d(48);
      int i69 = qal.a(str17);
      i2 += i68 + (i69 + qal.d(i69));
    }
    if (this.u != null)
    {
      String str16 = this.u;
      int i66 = qal.d(56);
      int i67 = qal.a(str16);
      i2 += i66 + (i67 + qal.d(i67));
    }
    if (this.x != null)
    {
      this.x.booleanValue();
      i2 += 1 + qal.d(64);
    }
    if (this.c != null)
    {
      String str15 = this.c;
      int i64 = qal.d(72);
      int i65 = qal.a(str15);
      i2 += i64 + (i65 + qal.d(i65));
    }
    if (this.z != null)
    {
      this.z.booleanValue();
      i2 += 1 + qal.d(88);
    }
    if (this.j != null)
    {
      String str14 = this.j;
      int i62 = qal.d(96);
      int i63 = qal.a(str14);
      i2 += i62 + (i63 + qal.d(i63));
    }
    if (this.k != null)
    {
      String str13 = this.k;
      int i60 = qal.d(104);
      int i61 = qal.a(str13);
      i2 += i60 + (i61 + qal.d(i61));
    }
    if (this.l != null)
    {
      String str12 = this.l;
      int i58 = qal.d(112);
      int i59 = qal.a(str12);
      i2 += i58 + (i59 + qal.d(i59));
    }
    if (this.m != null)
    {
      String str11 = this.m;
      int i56 = qal.d(120);
      int i57 = qal.a(str11);
      i2 += i56 + (i57 + qal.d(i57));
    }
    int i53;
    int i54;
    if (this.o != -2147483648)
    {
      i53 = this.o;
      i54 = qal.d(128);
      if (i53 < 0) {
        break label599;
      }
    }
    int i50;
    int i51;
    label599:
    for (int i55 = qal.d(i53);; i55 = i1)
    {
      i2 += i55 + i54;
      if (this.h != null)
      {
        this.h.booleanValue();
        i2 += 1 + qal.d(136);
      }
      if ((this.D == null) || (this.D.length <= 0)) {
        break label615;
      }
      int i49 = 0;
      i50 = 0;
      i51 = 0;
      while (i49 < this.D.length)
      {
        String str10 = this.D[i49];
        if (str10 != null)
        {
          i51++;
          int i52 = qal.a(str10);
          i50 += i52 + qal.d(i52);
        }
        i49++;
      }
    }
    i2 = i2 + i50 + i51 * 2;
    label615:
    if (this.p != null)
    {
      orp localorp = this.p;
      int i47 = qal.d(152);
      int i48 = localorp.a();
      localorp.ak = i48;
      i2 += i47 + (i48 + qal.d(i48));
    }
    if (this.d != null)
    {
      String str9 = this.d;
      int i45 = qal.d(160);
      int i46 = qal.a(str9);
      i2 += i45 + (i46 + qal.d(i46));
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      i2 += 1 + qal.d(168);
    }
    if (this.n != null)
    {
      String str8 = this.n;
      int i43 = qal.d(176);
      int i44 = qal.a(str8);
      i2 += i43 + (i44 + qal.d(i44));
    }
    if ((this.E != null) && (this.E.length > 0))
    {
      int i39 = 0;
      int i40 = 0;
      if (i39 < this.E.length)
      {
        int i41 = this.E[i39];
        if (i41 >= 0) {}
        for (int i42 = qal.d(i41);; i42 = i1)
        {
          i40 += i42;
          i39++;
          break;
        }
      }
      i2 = i2 + i40 + 2 * this.E.length;
    }
    if (this.F != null)
    {
      ory localory = this.F;
      int i37 = qal.d(192);
      int i38 = localory.a();
      localory.ak = i38;
      i2 += i37 + (i38 + qal.d(i38));
    }
    if (this.v != null)
    {
      String str7 = this.v;
      int i35 = qal.d(200);
      int i36 = qal.a(str7);
      i2 += i35 + (i36 + qal.d(i36));
    }
    if ((this.q != null) && (this.q.length > 0))
    {
      int i31 = i2;
      for (int i32 = 0; i32 < this.q.length; i32++)
      {
        orx localorx = this.q[i32];
        if (localorx != null)
        {
          int i33 = qal.d(208);
          int i34 = localorx.a();
          localorx.ak = i34;
          i31 += i33 + (i34 + qal.d(i34));
        }
      }
      i2 = i31;
    }
    if ((this.r != null) && (this.r.length > 0))
    {
      int i27 = i2;
      for (int i28 = 0; i28 < this.r.length; i28++)
      {
        osg localosg = this.r[i28];
        if (localosg != null)
        {
          int i29 = qal.d(216);
          int i30 = localosg.a();
          localosg.ak = i30;
          i27 += i29 + (i30 + qal.d(i30));
        }
      }
      i2 = i27;
    }
    if (this.B != null)
    {
      this.B.booleanValue();
      i2 += 1 + qal.d(224);
    }
    if (this.g != -2147483648)
    {
      int i25 = this.g;
      int i26 = qal.d(232);
      if (i25 >= 0) {
        i1 = qal.d(i25);
      }
      i2 += i26 + i1;
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i2 += 1 + qal.d(240);
    }
    if (this.t != null)
    {
      String str6 = this.t;
      int i23 = qal.d(248);
      int i24 = qal.a(str6);
      i2 += i23 + (i24 + qal.d(i24));
    }
    if ((this.s != null) && (this.s.length > 0))
    {
      int i19 = i2;
      for (int i20 = 0; i20 < this.s.length; i20++)
      {
        oro localoro = this.s[i20];
        if (localoro != null)
        {
          int i21 = qal.d(256);
          int i22 = localoro.a();
          localoro.ak = i22;
          i19 += i21 + (i22 + qal.d(i22));
        }
      }
      i2 = i19;
    }
    if ((this.G != null) && (this.G.length > 0))
    {
      int i15 = 0;
      int i16 = 0;
      int i17 = 0;
      while (i15 < this.G.length)
      {
        String str5 = this.G[i15];
        if (str5 != null)
        {
          i17++;
          int i18 = qal.a(str5);
          i16 += i18 + qal.d(i18);
        }
        i15++;
      }
      i2 = i2 + i16 + i17 * 2;
    }
    if (this.H != null)
    {
      String str4 = this.H;
      int i13 = qal.d(280);
      int i14 = qal.a(str4);
      i2 += i13 + (i14 + qal.d(i14));
    }
    if (this.y != null)
    {
      this.y.booleanValue();
      i2 += 1 + qal.d(288);
    }
    if (this.C != null)
    {
      String str3 = this.C;
      int i11 = qal.d(296);
      int i12 = qal.a(str3);
      i2 += i11 + (i12 + qal.d(i12));
    }
    if (this.I != null)
    {
      String str2 = this.I;
      int i9 = qal.d(304);
      int i10 = qal.a(str2);
      i2 += i9 + (i10 + qal.d(i10));
    }
    if (this.J != null)
    {
      int i5 = this.J.length;
      int i6 = 0;
      if (i5 > 0) {
        while (i6 < this.J.length)
        {
          osa localosa = this.J[i6];
          if (localosa != null)
          {
            int i7 = qal.d(312);
            int i8 = localosa.a();
            localosa.ak = i8;
            i2 += i7 + (i8 + qal.d(i8));
          }
          i6++;
        }
      }
    }
    if (this.A != null)
    {
      String str1 = this.A;
      int i3 = qal.d(320);
      int i4 = qal.a(str1);
      i2 += i3 + (i4 + qal.d(i4));
    }
    return i2;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.a != null)
    {
      String str19 = this.a;
      paramqal.c(10);
      paramqal.a(str19);
    }
    if (this.w != null)
    {
      double d1 = this.w.doubleValue();
      paramqal.c(33);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.e != null)
    {
      String str18 = this.e;
      paramqal.c(42);
      paramqal.a(str18);
    }
    if (this.b != null)
    {
      String str17 = this.b;
      paramqal.c(50);
      paramqal.a(str17);
    }
    if (this.u != null)
    {
      String str16 = this.u;
      paramqal.c(58);
      paramqal.a(str16);
    }
    if (this.x != null)
    {
      boolean bool7 = this.x.booleanValue();
      paramqal.c(64);
      if (bool7) {}
      byte b7;
      for (int i18 = i1;; i18 = 0)
      {
        b7 = (byte)i18;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b7);
    }
    if (this.c != null)
    {
      String str15 = this.c;
      paramqal.c(74);
      paramqal.a(str15);
    }
    if (this.z != null)
    {
      boolean bool6 = this.z.booleanValue();
      paramqal.c(88);
      if (bool6) {}
      byte b6;
      for (int i17 = i1;; i17 = 0)
      {
        b6 = (byte)i17;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if (this.j != null)
    {
      String str14 = this.j;
      paramqal.c(98);
      paramqal.a(str14);
    }
    if (this.k != null)
    {
      String str13 = this.k;
      paramqal.c(106);
      paramqal.a(str13);
    }
    if (this.l != null)
    {
      String str12 = this.l;
      paramqal.c(114);
      paramqal.a(str12);
    }
    if (this.m != null)
    {
      String str11 = this.m;
      paramqal.c(122);
      paramqal.a(str11);
    }
    if (this.o != -2147483648)
    {
      int i16 = this.o;
      paramqal.c(128);
      paramqal.a(i16);
    }
    if (this.h != null)
    {
      boolean bool5 = this.h.booleanValue();
      paramqal.c(136);
      if (bool5) {}
      byte b5;
      for (int i15 = i1;; i15 = 0)
      {
        b5 = (byte)i15;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if ((this.D != null) && (this.D.length > 0)) {
      for (int i14 = 0; i14 < this.D.length; i14++)
      {
        String str10 = this.D[i14];
        if (str10 != null)
        {
          paramqal.c(146);
          paramqal.a(str10);
        }
      }
    }
    if (this.p != null)
    {
      orp localorp = this.p;
      paramqal.c(154);
      if (localorp.ak < 0) {
        localorp.ak = localorp.a();
      }
      paramqal.c(localorp.ak);
      localorp.a(paramqal);
    }
    if (this.d != null)
    {
      String str9 = this.d;
      paramqal.c(162);
      paramqal.a(str9);
    }
    if (this.i != null)
    {
      boolean bool4 = this.i.booleanValue();
      paramqal.c(168);
      if (bool4) {}
      byte b4;
      for (int i13 = i1;; i13 = 0)
      {
        b4 = (byte)i13;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.n != null)
    {
      String str8 = this.n;
      paramqal.c(178);
      paramqal.a(str8);
    }
    if ((this.E != null) && (this.E.length > 0)) {
      for (int i11 = 0; i11 < this.E.length; i11++)
      {
        int i12 = this.E[i11];
        paramqal.c(184);
        paramqal.a(i12);
      }
    }
    if (this.F != null)
    {
      ory localory = this.F;
      paramqal.c(194);
      if (localory.ak < 0) {
        localory.ak = localory.a();
      }
      paramqal.c(localory.ak);
      localory.a(paramqal);
    }
    if (this.v != null)
    {
      String str7 = this.v;
      paramqal.c(202);
      paramqal.a(str7);
    }
    if ((this.q != null) && (this.q.length > 0)) {
      for (int i10 = 0; i10 < this.q.length; i10++)
      {
        orx localorx = this.q[i10];
        if (localorx != null)
        {
          paramqal.c(210);
          if (localorx.ak < 0) {
            localorx.ak = localorx.a();
          }
          paramqal.c(localorx.ak);
          localorx.a(paramqal);
        }
      }
    }
    if ((this.r != null) && (this.r.length > 0)) {
      for (int i9 = 0; i9 < this.r.length; i9++)
      {
        osg localosg = this.r[i9];
        if (localosg != null)
        {
          paramqal.c(218);
          if (localosg.ak < 0) {
            localosg.ak = localosg.a();
          }
          paramqal.c(localosg.ak);
          localosg.a(paramqal);
        }
      }
    }
    if (this.B != null)
    {
      boolean bool3 = this.B.booleanValue();
      paramqal.c(224);
      if (bool3) {}
      byte b3;
      for (int i8 = i1;; i8 = 0)
      {
        b3 = (byte)i8;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.g != -2147483648)
    {
      int i7 = this.g;
      paramqal.c(232);
      paramqal.a(i7);
    }
    if (this.f != null)
    {
      boolean bool2 = this.f.booleanValue();
      paramqal.c(240);
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
    if (this.t != null)
    {
      String str6 = this.t;
      paramqal.c(250);
      paramqal.a(str6);
    }
    if ((this.s != null) && (this.s.length > 0)) {
      for (int i5 = 0; i5 < this.s.length; i5++)
      {
        oro localoro = this.s[i5];
        if (localoro != null)
        {
          paramqal.c(258);
          if (localoro.ak < 0) {
            localoro.ak = localoro.a();
          }
          paramqal.c(localoro.ak);
          localoro.a(paramqal);
        }
      }
    }
    if ((this.G != null) && (this.G.length > 0)) {
      for (int i4 = 0; i4 < this.G.length; i4++)
      {
        String str5 = this.G[i4];
        if (str5 != null)
        {
          paramqal.c(274);
          paramqal.a(str5);
        }
      }
    }
    if (this.H != null)
    {
      String str4 = this.H;
      paramqal.c(282);
      paramqal.a(str4);
    }
    if (this.y != null)
    {
      boolean bool1 = this.y.booleanValue();
      paramqal.c(288);
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
    if (this.C != null)
    {
      String str3 = this.C;
      paramqal.c(298);
      paramqal.a(str3);
    }
    if (this.I != null)
    {
      String str2 = this.I;
      paramqal.c(306);
      paramqal.a(str2);
    }
    if (this.J != null)
    {
      int i2 = this.J.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.J.length)
        {
          osa localosa = this.J[i3];
          if (localosa != null)
          {
            paramqal.c(314);
            if (localosa.ak < 0) {
              localosa.ak = localosa.a();
            }
            paramqal.c(localosa.ak);
            localosa.a(paramqal);
          }
          i3++;
        }
      }
    }
    if (this.A != null)
    {
      String str1 = this.A;
      paramqal.c(322);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     orn
 * JD-Core Version:    0.7.0.1
 */