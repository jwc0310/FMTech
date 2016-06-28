import java.nio.ByteBuffer;

public final class ojj
  extends qan<ojj>
{
  private Integer A = null;
  private Boolean B = null;
  private Boolean C = null;
  private int D = -2147483648;
  private Boolean E = null;
  private ojt F = null;
  private ojp G = null;
  private oiv H = null;
  private ojq I = null;
  private Boolean J = null;
  private oju K = null;
  private oit L = null;
  private ojn M = null;
  public Boolean a = null;
  public Boolean b = null;
  public Boolean c = null;
  public Boolean d = null;
  public ojo e = null;
  public Boolean f = null;
  public Boolean g = null;
  public Boolean h = null;
  public Long i = null;
  public ojb j = null;
  public ois k = null;
  public Boolean l = null;
  private String m = null;
  private String n = null;
  private ome o = null;
  private Boolean p = null;
  private ojk q = null;
  private Boolean r = null;
  private Boolean s = null;
  private Boolean t = null;
  private Boolean u = null;
  private Boolean v = null;
  private oiq[] w = oiq.b();
  private Boolean x = null;
  private Long y = null;
  private Long z = null;
  
  public ojj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.m != null)
    {
      String str2 = this.m;
      int i38 = qal.d(8);
      int i39 = qal.a(str2);
      i2 += i38 + (i39 + qal.d(i39));
    }
    if (this.n != null)
    {
      String str1 = this.n;
      int i36 = qal.d(16);
      int i37 = qal.a(str1);
      i2 += i36 + (i37 + qal.d(i37));
    }
    if (this.a != null)
    {
      this.a.booleanValue();
      i2 += 1 + qal.d(24);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i2 += 1 + qal.d(32);
    }
    if (this.r != null)
    {
      this.r.booleanValue();
      i2 += 1 + qal.d(40);
    }
    if (this.s != null)
    {
      this.s.booleanValue();
      i2 += 1 + qal.d(48);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i2 += 1 + qal.d(56);
    }
    if ((this.w != null) && (this.w.length > 0))
    {
      int i32 = i2;
      for (int i33 = 0; i33 < this.w.length; i33++)
      {
        oiq localoiq = this.w[i33];
        if (localoiq != null)
        {
          int i34 = qal.d(64);
          int i35 = localoiq.a();
          localoiq.ak = i35;
          i32 += i34 + (i35 + qal.d(i35));
        }
      }
      i2 = i32;
    }
    if (this.x != null)
    {
      this.x.booleanValue();
      i2 += 1 + qal.d(72);
    }
    if (this.e != null)
    {
      ojo localojo = this.e;
      int i30 = qal.d(80);
      int i31 = localojo.a();
      localojo.ak = i31;
      i2 += i30 + (i31 + qal.d(i31));
    }
    if (this.y != null)
    {
      long l3 = this.y.longValue();
      i2 += qal.d(88) + qal.b(l3);
    }
    if (this.z != null)
    {
      long l2 = this.z.longValue();
      i2 += qal.d(96) + qal.b(l2);
    }
    int i27;
    int i28;
    if (this.A != null)
    {
      i27 = this.A.intValue();
      i28 = qal.d(104);
      if (i27 < 0) {
        break label1428;
      }
    }
    label1428:
    for (int i29 = qal.d(i27);; i29 = i1)
    {
      i2 += i29 + i28;
      if (this.f != null)
      {
        this.f.booleanValue();
        i2 += 1 + qal.d(112);
      }
      if (this.C != null)
      {
        this.C.booleanValue();
        i2 += 1 + qal.d(120);
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        i2 += 1 + qal.d(128);
      }
      if (this.g != null)
      {
        this.g.booleanValue();
        i2 += 1 + qal.d(136);
      }
      if (this.b != null)
      {
        this.b.booleanValue();
        i2 += 1 + qal.d(144);
      }
      if (this.i != null)
      {
        long l1 = this.i.longValue();
        i2 += qal.d(152) + qal.b(l1);
      }
      if (this.F != null)
      {
        ojt localojt = this.F;
        int i25 = qal.d(160);
        int i26 = localojt.a();
        localojt.ak = i26;
        i2 += i25 + (i26 + qal.d(i26));
      }
      if (this.j != null)
      {
        ojb localojb = this.j;
        int i23 = qal.d(168);
        int i24 = localojb.a();
        localojb.ak = i24;
        i2 += i23 + (i24 + qal.d(i24));
      }
      if (this.D != -2147483648)
      {
        int i21 = this.D;
        int i22 = qal.d(176);
        if (i21 >= 0) {
          i1 = qal.d(i21);
        }
        i2 += i22 + i1;
      }
      if (this.k != null)
      {
        ois localois = this.k;
        int i19 = qal.d(192);
        int i20 = localois.a();
        localois.ak = i20;
        i2 += i19 + (i20 + qal.d(i20));
      }
      if (this.G != null)
      {
        ojp localojp = this.G;
        int i17 = qal.d(200);
        int i18 = localojp.a();
        localojp.ak = i18;
        i2 += i17 + (i18 + qal.d(i18));
      }
      if (this.t != null)
      {
        this.t.booleanValue();
        i2 += 1 + qal.d(208);
      }
      if (this.u != null)
      {
        this.u.booleanValue();
        i2 += 1 + qal.d(216);
      }
      if (this.v != null)
      {
        this.v.booleanValue();
        i2 += 1 + qal.d(224);
      }
      if (this.H != null)
      {
        oiv localoiv = this.H;
        int i15 = qal.d(232);
        int i16 = localoiv.a();
        localoiv.ak = i16;
        i2 += i15 + (i16 + qal.d(i16));
      }
      if (this.I != null)
      {
        ojq localojq = this.I;
        int i13 = qal.d(240);
        int i14 = localojq.a();
        localojq.ak = i14;
        i2 += i13 + (i14 + qal.d(i14));
      }
      if (this.J != null)
      {
        this.J.booleanValue();
        i2 += 1 + qal.d(248);
      }
      if (this.E != null)
      {
        this.E.booleanValue();
        i2 += 1 + qal.d(256);
      }
      if (this.o != null)
      {
        ome localome = this.o;
        int i11 = qal.d(264);
        int i12 = localome.a();
        localome.ak = i12;
        i2 += i11 + (i12 + qal.d(i12));
      }
      if (this.l != null)
      {
        this.l.booleanValue();
        i2 += 1 + qal.d(280);
      }
      if (this.p != null)
      {
        this.p.booleanValue();
        i2 += 1 + qal.d(288);
      }
      if (this.q != null)
      {
        ojk localojk = this.q;
        int i9 = qal.d(296);
        int i10 = localojk.a();
        localojk.ak = i10;
        i2 += i9 + (i10 + qal.d(i10));
      }
      if (this.B != null)
      {
        this.B.booleanValue();
        i2 += 1 + qal.d(304);
      }
      if (this.K != null)
      {
        oju localoju = this.K;
        int i7 = qal.d(312);
        int i8 = localoju.a();
        localoju.ak = i8;
        i2 += i7 + (i8 + qal.d(i8));
      }
      if (this.L != null)
      {
        oit localoit = this.L;
        int i5 = qal.d(320);
        int i6 = localoit.a();
        localoit.ak = i6;
        i2 += i5 + (i6 + qal.d(i6));
      }
      if (this.M != null)
      {
        ojn localojn = this.M;
        int i3 = qal.d(328);
        int i4 = localojn.a();
        localojn.ak = i4;
        i2 += i3 + (i4 + qal.d(i4));
      }
      return i2;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.m != null)
    {
      String str2 = this.m;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.n != null)
    {
      String str1 = this.n;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if (this.a != null)
    {
      boolean bool19 = this.a.booleanValue();
      paramqal.c(24);
      if (bool19) {}
      byte b19;
      for (int i22 = i1;; i22 = 0)
      {
        b19 = (byte)i22;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b19);
    }
    if (this.c != null)
    {
      boolean bool18 = this.c.booleanValue();
      paramqal.c(32);
      if (bool18) {}
      byte b18;
      for (int i21 = i1;; i21 = 0)
      {
        b18 = (byte)i21;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b18);
    }
    if (this.r != null)
    {
      boolean bool17 = this.r.booleanValue();
      paramqal.c(40);
      if (bool17) {}
      byte b17;
      for (int i20 = i1;; i20 = 0)
      {
        b17 = (byte)i20;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b17);
    }
    if (this.s != null)
    {
      boolean bool16 = this.s.booleanValue();
      paramqal.c(48);
      if (bool16) {}
      byte b16;
      for (int i19 = i1;; i19 = 0)
      {
        b16 = (byte)i19;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b16);
    }
    if (this.d != null)
    {
      boolean bool15 = this.d.booleanValue();
      paramqal.c(56);
      if (bool15) {}
      byte b15;
      for (int i18 = i1;; i18 = 0)
      {
        b15 = (byte)i18;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b15);
    }
    if ((this.w != null) && (this.w.length > 0)) {
      for (int i17 = 0; i17 < this.w.length; i17++)
      {
        oiq localoiq = this.w[i17];
        if (localoiq != null)
        {
          paramqal.c(66);
          if (localoiq.ak < 0) {
            localoiq.ak = localoiq.a();
          }
          paramqal.c(localoiq.ak);
          localoiq.a(paramqal);
        }
      }
    }
    if (this.x != null)
    {
      boolean bool14 = this.x.booleanValue();
      paramqal.c(72);
      if (bool14) {}
      byte b14;
      for (int i16 = i1;; i16 = 0)
      {
        b14 = (byte)i16;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b14);
    }
    if (this.e != null)
    {
      ojo localojo = this.e;
      paramqal.c(82);
      if (localojo.ak < 0) {
        localojo.ak = localojo.a();
      }
      paramqal.c(localojo.ak);
      localojo.a(paramqal);
    }
    if (this.y != null)
    {
      long l3 = this.y.longValue();
      paramqal.c(88);
      paramqal.a(l3);
    }
    if (this.z != null)
    {
      long l2 = this.z.longValue();
      paramqal.c(96);
      paramqal.a(l2);
    }
    if (this.A != null)
    {
      int i15 = this.A.intValue();
      paramqal.c(104);
      paramqal.a(i15);
    }
    if (this.f != null)
    {
      boolean bool13 = this.f.booleanValue();
      paramqal.c(112);
      if (bool13) {}
      byte b13;
      for (int i14 = i1;; i14 = 0)
      {
        b13 = (byte)i14;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b13);
    }
    if (this.C != null)
    {
      boolean bool12 = this.C.booleanValue();
      paramqal.c(120);
      if (bool12) {}
      byte b12;
      for (int i13 = i1;; i13 = 0)
      {
        b12 = (byte)i13;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b12);
    }
    if (this.h != null)
    {
      boolean bool11 = this.h.booleanValue();
      paramqal.c(128);
      if (bool11) {}
      byte b11;
      for (int i12 = i1;; i12 = 0)
      {
        b11 = (byte)i12;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b11);
    }
    if (this.g != null)
    {
      boolean bool10 = this.g.booleanValue();
      paramqal.c(136);
      if (bool10) {}
      byte b10;
      for (int i11 = i1;; i11 = 0)
      {
        b10 = (byte)i11;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b10);
    }
    if (this.b != null)
    {
      boolean bool9 = this.b.booleanValue();
      paramqal.c(144);
      if (bool9) {}
      byte b9;
      for (int i10 = i1;; i10 = 0)
      {
        b9 = (byte)i10;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b9);
    }
    if (this.i != null)
    {
      long l1 = this.i.longValue();
      paramqal.c(152);
      paramqal.a(l1);
    }
    if (this.F != null)
    {
      ojt localojt = this.F;
      paramqal.c(162);
      if (localojt.ak < 0) {
        localojt.ak = localojt.a();
      }
      paramqal.c(localojt.ak);
      localojt.a(paramqal);
    }
    if (this.j != null)
    {
      ojb localojb = this.j;
      paramqal.c(170);
      if (localojb.ak < 0) {
        localojb.ak = localojb.a();
      }
      paramqal.c(localojb.ak);
      localojb.a(paramqal);
    }
    if (this.D != -2147483648)
    {
      int i9 = this.D;
      paramqal.c(176);
      paramqal.a(i9);
    }
    if (this.k != null)
    {
      ois localois = this.k;
      paramqal.c(194);
      if (localois.ak < 0) {
        localois.ak = localois.a();
      }
      paramqal.c(localois.ak);
      localois.a(paramqal);
    }
    if (this.G != null)
    {
      ojp localojp = this.G;
      paramqal.c(202);
      if (localojp.ak < 0) {
        localojp.ak = localojp.a();
      }
      paramqal.c(localojp.ak);
      localojp.a(paramqal);
    }
    if (this.t != null)
    {
      boolean bool8 = this.t.booleanValue();
      paramqal.c(208);
      if (bool8) {}
      byte b8;
      for (int i8 = i1;; i8 = 0)
      {
        b8 = (byte)i8;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b8);
    }
    if (this.u != null)
    {
      boolean bool7 = this.u.booleanValue();
      paramqal.c(216);
      if (bool7) {}
      byte b7;
      for (int i7 = i1;; i7 = 0)
      {
        b7 = (byte)i7;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b7);
    }
    if (this.v != null)
    {
      boolean bool6 = this.v.booleanValue();
      paramqal.c(224);
      if (bool6) {}
      byte b6;
      for (int i6 = i1;; i6 = 0)
      {
        b6 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if (this.H != null)
    {
      oiv localoiv = this.H;
      paramqal.c(234);
      if (localoiv.ak < 0) {
        localoiv.ak = localoiv.a();
      }
      paramqal.c(localoiv.ak);
      localoiv.a(paramqal);
    }
    if (this.I != null)
    {
      ojq localojq = this.I;
      paramqal.c(242);
      if (localojq.ak < 0) {
        localojq.ak = localojq.a();
      }
      paramqal.c(localojq.ak);
      localojq.a(paramqal);
    }
    if (this.J != null)
    {
      boolean bool5 = this.J.booleanValue();
      paramqal.c(248);
      if (bool5) {}
      byte b5;
      for (int i5 = i1;; i5 = 0)
      {
        b5 = (byte)i5;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.E != null)
    {
      boolean bool4 = this.E.booleanValue();
      paramqal.c(256);
      if (bool4) {}
      byte b4;
      for (int i4 = i1;; i4 = 0)
      {
        b4 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.o != null)
    {
      ome localome = this.o;
      paramqal.c(266);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    if (this.l != null)
    {
      boolean bool3 = this.l.booleanValue();
      paramqal.c(280);
      if (bool3) {}
      byte b3;
      for (int i3 = i1;; i3 = 0)
      {
        b3 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.p != null)
    {
      boolean bool2 = this.p.booleanValue();
      paramqal.c(288);
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
    if (this.q != null)
    {
      ojk localojk = this.q;
      paramqal.c(298);
      if (localojk.ak < 0) {
        localojk.ak = localojk.a();
      }
      paramqal.c(localojk.ak);
      localojk.a(paramqal);
    }
    if (this.B != null)
    {
      boolean bool1 = this.B.booleanValue();
      paramqal.c(304);
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
    if (this.K != null)
    {
      oju localoju = this.K;
      paramqal.c(314);
      if (localoju.ak < 0) {
        localoju.ak = localoju.a();
      }
      paramqal.c(localoju.ak);
      localoju.a(paramqal);
    }
    if (this.L != null)
    {
      oit localoit = this.L;
      paramqal.c(322);
      if (localoit.ak < 0) {
        localoit.ak = localoit.a();
      }
      paramqal.c(localoit.ak);
      localoit.a(paramqal);
    }
    if (this.M != null)
    {
      ojn localojn = this.M;
      paramqal.c(330);
      if (localojn.ak < 0) {
        localojn.ak = localojn.a();
      }
      paramqal.c(localojn.ak);
      localojn.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojj
 * JD-Core Version:    0.7.0.1
 */