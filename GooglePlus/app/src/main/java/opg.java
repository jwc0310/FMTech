import java.nio.ByteBuffer;

public final class opg
  extends qan<opg>
{
  private int A = -2147483648;
  private onr B = null;
  private oor C = null;
  private oom D = null;
  private Boolean E = null;
  private oph[] F = oph.b();
  private Long G = null;
  private Boolean H = null;
  private int I = -2147483648;
  private int J = -2147483648;
  private opj K = null;
  private opi L = null;
  public int a = -2147483648;
  public int b = -2147483648;
  public String c = null;
  public String d = null;
  public String e = null;
  public Integer f = null;
  public int g = -2147483648;
  public int h = -2147483648;
  public Integer i = null;
  public Integer j = null;
  public Boolean k = null;
  public onm l = null;
  public Integer m = null;
  public opp n = null;
  public opf o = null;
  public opq p = null;
  public Boolean q = null;
  public Boolean r = null;
  public Boolean s = null;
  public int t = -2147483648;
  private String u = null;
  private String v = null;
  private Integer w = null;
  private String x = null;
  private String y = null;
  private onq[] z = onq.b();
  
  public opg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    int i3 = this.a;
    int i4 = qal.d(8);
    int i5;
    int i9;
    label64:
    int i10;
    int i73;
    int i74;
    if (i3 >= 0)
    {
      i5 = qal.d(i3);
      int i6 = i2 + (i5 + i4);
      int i7 = this.b;
      int i8 = qal.d(16);
      if (i7 < 0) {
        break label425;
      }
      i9 = qal.d(i7);
      i10 = i6 + (i9 + i8);
      if (this.c != null)
      {
        String str7 = this.c;
        int i80 = qal.d(24);
        int i81 = qal.a(str7);
        i10 += i80 + (i81 + qal.d(i81));
      }
      if (this.d != null)
      {
        String str6 = this.d;
        int i78 = qal.d(32);
        int i79 = qal.a(str6);
        i10 += i78 + (i79 + qal.d(i79));
      }
      if (this.u != null)
      {
        String str5 = this.u;
        int i76 = qal.d(40);
        int i77 = qal.a(str5);
        i10 += i76 + (i77 + qal.d(i77));
      }
      if (this.f != null)
      {
        i73 = this.f.intValue();
        i74 = qal.d(48);
        if (i73 < 0) {
          break label431;
        }
      }
    }
    label425:
    label431:
    for (int i75 = qal.d(i73);; i75 = i1)
    {
      i10 += i75 + i74;
      if (this.x != null)
      {
        String str4 = this.x;
        int i71 = qal.d(56);
        int i72 = qal.a(str4);
        i10 += i71 + (i72 + qal.d(i72));
      }
      if (this.y != null)
      {
        String str3 = this.y;
        int i69 = qal.d(64);
        int i70 = qal.a(str3);
        i10 += i69 + (i70 + qal.d(i70));
      }
      if ((this.z == null) || (this.z.length <= 0)) {
        break label437;
      }
      for (int i66 = 0; i66 < this.z.length; i66++)
      {
        onq localonq = this.z[i66];
        if (localonq != null)
        {
          int i67 = qal.d(72);
          int i68 = localonq.a();
          localonq.ak = i68;
          i10 += i67 + (i68 + qal.d(i68));
        }
      }
      i5 = i1;
      break;
      i9 = i1;
      break label64;
    }
    label437:
    int i65;
    int i54;
    int i55;
    if (this.A != -2147483648)
    {
      int i63 = this.A;
      int i64 = qal.d(80);
      if (i63 >= 0)
      {
        i65 = qal.d(i63);
        i10 += i65 + i64;
      }
    }
    else
    {
      if (this.B != null)
      {
        onr localonr = this.B;
        int i61 = qal.d(88);
        int i62 = localonr.a();
        localonr.ak = i62;
        i10 += i61 + (i62 + qal.d(i62));
      }
      if (this.C != null)
      {
        oor localoor = this.C;
        int i59 = qal.d(96);
        int i60 = localoor.a();
        localoor.ak = i60;
        i10 += i59 + (i60 + qal.d(i60));
      }
      if (this.D != null)
      {
        oom localoom = this.D;
        int i57 = qal.d(104);
        int i58 = localoom.a();
        localoom.ak = i58;
        i10 += i57 + (i58 + qal.d(i58));
      }
      if (this.E != null)
      {
        this.E.booleanValue();
        i10 += 1 + qal.d(112);
      }
      if (this.g != -2147483648)
      {
        i54 = this.g;
        i55 = qal.d(120);
        if (i54 < 0) {
          break label798;
        }
      }
    }
    label798:
    for (int i56 = qal.d(i54);; i56 = i1)
    {
      i10 += i56 + i55;
      if (this.F == null) {
        break label804;
      }
      int i50 = this.F.length;
      int i51 = 0;
      if (i50 <= 0) {
        break label804;
      }
      while (i51 < this.F.length)
      {
        oph localoph = this.F[i51];
        if (localoph != null)
        {
          int i52 = qal.d(128);
          int i53 = localoph.a();
          localoph.ak = i53;
          i10 += i52 + (i53 + qal.d(i53));
        }
        i51++;
      }
      i65 = i1;
      break;
    }
    label804:
    if (this.G != null)
    {
      long l1 = this.G.longValue();
      i10 += qal.d(136) + qal.b(l1);
    }
    if (this.H != null)
    {
      this.H.booleanValue();
      i10 += 1 + qal.d(144);
    }
    int i49;
    int i46;
    label946:
    int i43;
    label991:
    int i40;
    label1036:
    int i35;
    label1133:
    int i24;
    label1404:
    int i19;
    int i20;
    if (this.h != -2147483648)
    {
      int i47 = this.h;
      int i48 = qal.d(152);
      if (i47 >= 0)
      {
        i49 = qal.d(i47);
        i10 += i49 + i48;
      }
    }
    else
    {
      if (this.i != null)
      {
        int i44 = this.i.intValue();
        int i45 = qal.d(160);
        if (i44 < 0) {
          break label1742;
        }
        i46 = qal.d(i44);
        i10 += i46 + i45;
      }
      if (this.I != -2147483648)
      {
        int i41 = this.I;
        int i42 = qal.d(168);
        if (i41 < 0) {
          break label1748;
        }
        i43 = qal.d(i41);
        i10 += i43 + i42;
      }
      if (this.J != -2147483648)
      {
        int i38 = this.J;
        int i39 = qal.d(176);
        if (i38 < 0) {
          break label1754;
        }
        i40 = qal.d(i38);
        i10 += i40 + i39;
      }
      if (this.l != null)
      {
        onm localonm = this.l;
        int i36 = qal.d(184);
        int i37 = localonm.a();
        localonm.ak = i37;
        i10 += i36 + (i37 + qal.d(i37));
      }
      if (this.m != null)
      {
        int i33 = this.m.intValue();
        int i34 = qal.d(192);
        if (i33 < 0) {
          break label1760;
        }
        i35 = qal.d(i33);
        i10 += i35 + i34;
      }
      if (this.n != null)
      {
        opp localopp = this.n;
        int i31 = qal.d(200);
        int i32 = localopp.a();
        localopp.ak = i32;
        i10 += i31 + (i32 + qal.d(i32));
      }
      if (this.o != null)
      {
        opf localopf = this.o;
        int i29 = qal.d(208);
        int i30 = localopf.a();
        localopf.ak = i30;
        i10 += i29 + (i30 + qal.d(i30));
      }
      if (this.p != null)
      {
        opq localopq = this.p;
        int i27 = qal.d(216);
        int i28 = localopq.a();
        localopq.ak = i28;
        i10 += i27 + (i28 + qal.d(i28));
      }
      if (this.e != null)
      {
        String str2 = this.e;
        int i25 = qal.d(224);
        int i26 = qal.a(str2);
        i10 += i25 + (i26 + qal.d(i26));
      }
      if (this.k != null)
      {
        this.k.booleanValue();
        i10 += 1 + qal.d(232);
      }
      if (this.w != null)
      {
        int i22 = this.w.intValue();
        int i23 = qal.d(240);
        if (i22 < 0) {
          break label1766;
        }
        i24 = qal.d(i22);
        i10 += i24 + i23;
      }
      if (this.j != null)
      {
        i19 = this.j.intValue();
        i20 = qal.d(248);
        if (i19 < 0) {
          break label1772;
        }
      }
    }
    label1742:
    label1748:
    label1754:
    label1760:
    label1766:
    label1772:
    for (int i21 = qal.d(i19);; i21 = i1)
    {
      i10 += i21 + i20;
      if (this.q != null)
      {
        this.q.booleanValue();
        i10 += 1 + qal.d(256);
      }
      if (this.K != null)
      {
        opj localopj = this.K;
        int i17 = qal.d(264);
        int i18 = localopj.a();
        localopj.ak = i18;
        i10 += i17 + (i18 + qal.d(i18));
      }
      if (this.v != null)
      {
        String str1 = this.v;
        int i15 = qal.d(272);
        int i16 = qal.a(str1);
        i10 += i15 + (i16 + qal.d(i16));
      }
      if (this.L != null)
      {
        opi localopi = this.L;
        int i13 = qal.d(280);
        int i14 = localopi.a();
        localopi.ak = i14;
        i10 += i13 + (i14 + qal.d(i14));
      }
      if (this.r != null)
      {
        this.r.booleanValue();
        i10 += 1 + qal.d(288);
      }
      if (this.s != null)
      {
        this.s.booleanValue();
        i10 += 1 + qal.d(296);
      }
      if (this.t != -2147483648)
      {
        int i11 = this.t;
        int i12 = qal.d(304);
        if (i11 >= 0) {
          i1 = qal.d(i11);
        }
        i10 += i1 + i12;
      }
      return i10;
      i49 = i1;
      break;
      i46 = i1;
      break label946;
      i43 = i1;
      break label991;
      i40 = i1;
      break label1036;
      i35 = i1;
      break label1133;
      i24 = i1;
      break label1404;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    int i2 = this.a;
    paramqal.c(8);
    paramqal.a(i2);
    int i3 = this.b;
    paramqal.c(16);
    paramqal.a(i3);
    if (this.c != null)
    {
      String str7 = this.c;
      paramqal.c(26);
      paramqal.a(str7);
    }
    if (this.d != null)
    {
      String str6 = this.d;
      paramqal.c(34);
      paramqal.a(str6);
    }
    if (this.u != null)
    {
      String str5 = this.u;
      paramqal.c(42);
      paramqal.a(str5);
    }
    if (this.f != null)
    {
      int i21 = this.f.intValue();
      paramqal.c(48);
      paramqal.a(i21);
    }
    if (this.x != null)
    {
      String str4 = this.x;
      paramqal.c(58);
      paramqal.a(str4);
    }
    if (this.y != null)
    {
      String str3 = this.y;
      paramqal.c(66);
      paramqal.a(str3);
    }
    if ((this.z != null) && (this.z.length > 0)) {
      for (int i20 = 0; i20 < this.z.length; i20++)
      {
        onq localonq = this.z[i20];
        if (localonq != null)
        {
          paramqal.c(74);
          if (localonq.ak < 0) {
            localonq.ak = localonq.a();
          }
          paramqal.c(localonq.ak);
          localonq.a(paramqal);
        }
      }
    }
    if (this.A != -2147483648)
    {
      int i19 = this.A;
      paramqal.c(80);
      paramqal.a(i19);
    }
    if (this.B != null)
    {
      onr localonr = this.B;
      paramqal.c(90);
      if (localonr.ak < 0) {
        localonr.ak = localonr.a();
      }
      paramqal.c(localonr.ak);
      localonr.a(paramqal);
    }
    if (this.C != null)
    {
      oor localoor = this.C;
      paramqal.c(98);
      if (localoor.ak < 0) {
        localoor.ak = localoor.a();
      }
      paramqal.c(localoor.ak);
      localoor.a(paramqal);
    }
    if (this.D != null)
    {
      oom localoom = this.D;
      paramqal.c(106);
      if (localoom.ak < 0) {
        localoom.ak = localoom.a();
      }
      paramqal.c(localoom.ak);
      localoom.a(paramqal);
    }
    if (this.E != null)
    {
      boolean bool6 = this.E.booleanValue();
      paramqal.c(112);
      if (bool6) {}
      byte b6;
      for (int i18 = i1;; i18 = 0)
      {
        b6 = (byte)i18;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if (this.g != -2147483648)
    {
      int i17 = this.g;
      paramqal.c(120);
      paramqal.a(i17);
    }
    if ((this.F != null) && (this.F.length > 0)) {
      for (int i16 = 0; i16 < this.F.length; i16++)
      {
        oph localoph = this.F[i16];
        if (localoph != null)
        {
          paramqal.c(130);
          if (localoph.ak < 0) {
            localoph.ak = localoph.a();
          }
          paramqal.c(localoph.ak);
          localoph.a(paramqal);
        }
      }
    }
    if (this.G != null)
    {
      long l1 = this.G.longValue();
      paramqal.c(136);
      paramqal.a(l1);
    }
    if (this.H != null)
    {
      boolean bool5 = this.H.booleanValue();
      paramqal.c(144);
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
    if (this.h != -2147483648)
    {
      int i14 = this.h;
      paramqal.c(152);
      paramqal.a(i14);
    }
    if (this.i != null)
    {
      int i13 = this.i.intValue();
      paramqal.c(160);
      paramqal.a(i13);
    }
    if (this.I != -2147483648)
    {
      int i12 = this.I;
      paramqal.c(168);
      paramqal.a(i12);
    }
    if (this.J != -2147483648)
    {
      int i11 = this.J;
      paramqal.c(176);
      paramqal.a(i11);
    }
    if (this.l != null)
    {
      onm localonm = this.l;
      paramqal.c(186);
      if (localonm.ak < 0) {
        localonm.ak = localonm.a();
      }
      paramqal.c(localonm.ak);
      localonm.a(paramqal);
    }
    if (this.m != null)
    {
      int i10 = this.m.intValue();
      paramqal.c(192);
      paramqal.a(i10);
    }
    if (this.n != null)
    {
      opp localopp = this.n;
      paramqal.c(202);
      if (localopp.ak < 0) {
        localopp.ak = localopp.a();
      }
      paramqal.c(localopp.ak);
      localopp.a(paramqal);
    }
    if (this.o != null)
    {
      opf localopf = this.o;
      paramqal.c(210);
      if (localopf.ak < 0) {
        localopf.ak = localopf.a();
      }
      paramqal.c(localopf.ak);
      localopf.a(paramqal);
    }
    if (this.p != null)
    {
      opq localopq = this.p;
      paramqal.c(218);
      if (localopq.ak < 0) {
        localopq.ak = localopq.a();
      }
      paramqal.c(localopq.ak);
      localopq.a(paramqal);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(226);
      paramqal.a(str2);
    }
    if (this.k != null)
    {
      boolean bool4 = this.k.booleanValue();
      paramqal.c(232);
      if (bool4) {}
      byte b4;
      for (int i9 = i1;; i9 = 0)
      {
        b4 = (byte)i9;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.w != null)
    {
      int i8 = this.w.intValue();
      paramqal.c(240);
      paramqal.a(i8);
    }
    if (this.j != null)
    {
      int i7 = this.j.intValue();
      paramqal.c(248);
      paramqal.a(i7);
    }
    if (this.q != null)
    {
      boolean bool3 = this.q.booleanValue();
      paramqal.c(256);
      if (bool3) {}
      byte b3;
      for (int i6 = i1;; i6 = 0)
      {
        b3 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.K != null)
    {
      opj localopj = this.K;
      paramqal.c(266);
      if (localopj.ak < 0) {
        localopj.ak = localopj.a();
      }
      paramqal.c(localopj.ak);
      localopj.a(paramqal);
    }
    if (this.v != null)
    {
      String str1 = this.v;
      paramqal.c(274);
      paramqal.a(str1);
    }
    if (this.L != null)
    {
      opi localopi = this.L;
      paramqal.c(282);
      if (localopi.ak < 0) {
        localopi.ak = localopi.a();
      }
      paramqal.c(localopi.ak);
      localopi.a(paramqal);
    }
    if (this.r != null)
    {
      boolean bool2 = this.r.booleanValue();
      paramqal.c(288);
      if (bool2) {}
      byte b2;
      for (int i5 = i1;; i5 = 0)
      {
        b2 = (byte)i5;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.s != null)
    {
      boolean bool1 = this.s.booleanValue();
      paramqal.c(296);
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
    if (this.t != -2147483648)
    {
      int i4 = this.t;
      paramqal.c(304);
      paramqal.a(i4);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     opg
 * JD-Core Version:    0.7.0.1
 */