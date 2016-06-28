import java.nio.ByteBuffer;

public final class nqu
  extends qan<nqu>
{
  private nqw A = null;
  private Integer B = null;
  private Integer C = null;
  private Long D = null;
  private String E = null;
  private int F = -2147483648;
  public String a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public String e = null;
  public Boolean f = null;
  public String g = null;
  public String h = null;
  public String i = null;
  public nxh j = null;
  public Long k = null;
  public Long l = null;
  public Long m = null;
  public npy n = null;
  public nqh o = null;
  public String p = null;
  public nrw q = null;
  public String[] r = qay.f;
  public String s = null;
  public int t = -2147483648;
  public pst u = null;
  public nrz v = null;
  public int w = -2147483648;
  private Boolean x = null;
  private String y = null;
  private nrr z = null;
  
  public nqu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 0;
    int i2 = 10;
    int i3 = super.a();
    if (this.a != null)
    {
      String str13 = this.a;
      int i59 = qal.d(8);
      int i60 = qal.a(str13);
      i3 += i59 + (i60 + qal.d(i60));
    }
    if (this.b != null)
    {
      String str12 = this.b;
      int i57 = qal.d(16);
      int i58 = qal.a(str12);
      i3 += i57 + (i58 + qal.d(i58));
    }
    if (this.x != null)
    {
      this.x.booleanValue();
      i3 += 1 + qal.d(24);
    }
    if (this.d != null)
    {
      String str11 = this.d;
      int i55 = qal.d(32);
      int i56 = qal.a(str11);
      i3 += i55 + (i56 + qal.d(i56));
    }
    if (this.e != null)
    {
      String str10 = this.e;
      int i53 = qal.d(40);
      int i54 = qal.a(str10);
      i3 += i53 + (i54 + qal.d(i54));
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i3 += 1 + qal.d(48);
    }
    if (this.g != null)
    {
      String str9 = this.g;
      int i51 = qal.d(56);
      int i52 = qal.a(str9);
      i3 += i51 + (i52 + qal.d(i52));
    }
    if (this.y != null)
    {
      String str8 = this.y;
      int i49 = qal.d(64);
      int i50 = qal.a(str8);
      i3 += i49 + (i50 + qal.d(i50));
    }
    if (this.z != null)
    {
      nrr localnrr = this.z;
      int i47 = qal.d(72);
      int i48 = localnrr.a();
      localnrr.ak = i48;
      i3 += i47 + (i48 + qal.d(i48));
    }
    if (this.h != null)
    {
      String str7 = this.h;
      int i45 = qal.d(80);
      int i46 = qal.a(str7);
      i3 += i45 + (i46 + qal.d(i46));
    }
    if (this.i != null)
    {
      String str6 = this.i;
      int i43 = qal.d(88);
      int i44 = qal.a(str6);
      i3 += i43 + (i44 + qal.d(i44));
    }
    if (this.A != null)
    {
      nqw localnqw = this.A;
      int i41 = qal.d(96);
      int i42 = localnqw.a();
      localnqw.ak = i42;
      i3 += i41 + (i42 + qal.d(i42));
    }
    int i40;
    int i33;
    int i34;
    if (this.B != null)
    {
      int i38 = this.B.intValue();
      int i39 = qal.d(104);
      if (i38 >= 0)
      {
        i40 = qal.d(i38);
        i3 += i40 + i39;
      }
    }
    else
    {
      if (this.j != null)
      {
        nxh localnxh = this.j;
        int i36 = qal.d(112);
        int i37 = localnxh.a();
        localnxh.ak = i37;
        i3 += i36 + (i37 + qal.d(i37));
      }
      if (this.C != null)
      {
        i33 = this.C.intValue();
        i34 = qal.d(120);
        if (i33 < 0) {
          break label867;
        }
      }
    }
    int i25;
    label867:
    for (int i35 = qal.d(i33);; i35 = i2)
    {
      i3 += i35 + i34;
      if (this.k != null)
      {
        long l4 = this.k.longValue();
        i3 += qal.d(128) + qal.b(l4);
      }
      if (this.n != null)
      {
        npy localnpy = this.n;
        int i31 = qal.d(136);
        int i32 = localnpy.a();
        localnpy.ak = i32;
        i3 += i31 + (i32 + qal.d(i32));
      }
      if (this.p != null)
      {
        String str5 = this.p;
        int i29 = qal.d(144);
        int i30 = qal.a(str5);
        i3 += i29 + (i30 + qal.d(i30));
      }
      if (this.q != null)
      {
        nrw localnrw = this.q;
        int i27 = qal.d(152);
        int i28 = localnrw.a();
        localnrw.ak = i28;
        i3 += i27 + (i28 + qal.d(i28));
      }
      if ((this.r == null) || (this.r.length <= 0)) {
        break label882;
      }
      int i24 = 0;
      i25 = 0;
      while (i24 < this.r.length)
      {
        String str4 = this.r[i24];
        if (str4 != null)
        {
          i25++;
          int i26 = qal.a(str4);
          i1 += i26 + qal.d(i26);
        }
        i24++;
      }
      i40 = i2;
      break;
    }
    i3 = i3 + i1 + i25 * 2;
    label882:
    int i23;
    int i14;
    int i15;
    if (this.F != -2147483648)
    {
      int i21 = this.F;
      int i22 = qal.d(168);
      if (i21 >= 0)
      {
        i23 = qal.d(i21);
        i3 += i23 + i22;
      }
    }
    else
    {
      if (this.l != null)
      {
        long l3 = this.l.longValue();
        i3 += qal.d(176) + qal.b(l3);
      }
      if (this.m != null)
      {
        long l2 = this.m.longValue();
        i3 += qal.d(184) + qal.b(l2);
      }
      if (this.D != null)
      {
        long l1 = this.D.longValue();
        i3 += qal.d(192) + qal.b(l1);
      }
      if (this.s != null)
      {
        String str3 = this.s;
        int i19 = qal.d(200);
        int i20 = qal.a(str3);
        i3 += i19 + (i20 + qal.d(i20));
      }
      if (this.o != null)
      {
        nqh localnqh = this.o;
        int i17 = qal.d(208);
        int i18 = localnqh.a();
        localnqh.ak = i18;
        i3 += i17 + (i18 + qal.d(i18));
      }
      if (this.t != -2147483648)
      {
        i14 = this.t;
        i15 = qal.d(216);
        if (i14 < 0) {
          break label1383;
        }
      }
    }
    label1383:
    for (int i16 = qal.d(i14);; i16 = i2)
    {
      i3 += i16 + i15;
      if (this.u != null)
      {
        pst localpst = this.u;
        int i12 = qal.d(224);
        int i13 = localpst.a();
        localpst.ak = i13;
        i3 += i12 + (i13 + qal.d(i13));
      }
      if (this.v != null)
      {
        nrz localnrz = this.v;
        int i10 = qal.d(232);
        int i11 = localnrz.a();
        localnrz.ak = i11;
        i3 += i10 + (i11 + qal.d(i11));
      }
      if (this.E != null)
      {
        String str2 = this.E;
        int i8 = qal.d(240);
        int i9 = qal.a(str2);
        i3 += i8 + (i9 + qal.d(i9));
      }
      if (this.w != -2147483648)
      {
        int i6 = this.w;
        int i7 = qal.d(248);
        if (i6 >= 0) {
          i2 = qal.d(i6);
        }
        i3 += i7 + i2;
      }
      if (this.c != null)
      {
        String str1 = this.c;
        int i4 = qal.d(264);
        int i5 = qal.a(str1);
        i3 += i4 + (i5 + qal.d(i5));
      }
      return i3;
      i23 = i2;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.a != null)
    {
      String str13 = this.a;
      paramqal.c(10);
      paramqal.a(str13);
    }
    if (this.b != null)
    {
      String str12 = this.b;
      paramqal.c(18);
      paramqal.a(str12);
    }
    if (this.x != null)
    {
      boolean bool2 = this.x.booleanValue();
      paramqal.c(24);
      if (bool2) {}
      byte b2;
      for (int i9 = i1;; i9 = 0)
      {
        b2 = (byte)i9;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.d != null)
    {
      String str11 = this.d;
      paramqal.c(34);
      paramqal.a(str11);
    }
    if (this.e != null)
    {
      String str10 = this.e;
      paramqal.c(42);
      paramqal.a(str10);
    }
    if (this.f != null)
    {
      boolean bool1 = this.f.booleanValue();
      paramqal.c(48);
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
    if (this.g != null)
    {
      String str9 = this.g;
      paramqal.c(58);
      paramqal.a(str9);
    }
    if (this.y != null)
    {
      String str8 = this.y;
      paramqal.c(66);
      paramqal.a(str8);
    }
    if (this.z != null)
    {
      nrr localnrr = this.z;
      paramqal.c(74);
      if (localnrr.ak < 0) {
        localnrr.ak = localnrr.a();
      }
      paramqal.c(localnrr.ak);
      localnrr.a(paramqal);
    }
    if (this.h != null)
    {
      String str7 = this.h;
      paramqal.c(82);
      paramqal.a(str7);
    }
    if (this.i != null)
    {
      String str6 = this.i;
      paramqal.c(90);
      paramqal.a(str6);
    }
    if (this.A != null)
    {
      nqw localnqw = this.A;
      paramqal.c(98);
      if (localnqw.ak < 0) {
        localnqw.ak = localnqw.a();
      }
      paramqal.c(localnqw.ak);
      localnqw.a(paramqal);
    }
    if (this.B != null)
    {
      int i8 = this.B.intValue();
      paramqal.c(104);
      paramqal.a(i8);
    }
    if (this.j != null)
    {
      nxh localnxh = this.j;
      paramqal.c(114);
      if (localnxh.ak < 0) {
        localnxh.ak = localnxh.a();
      }
      paramqal.c(localnxh.ak);
      localnxh.a(paramqal);
    }
    if (this.C != null)
    {
      int i7 = this.C.intValue();
      paramqal.c(120);
      paramqal.a(i7);
    }
    if (this.k != null)
    {
      long l4 = this.k.longValue();
      paramqal.c(128);
      paramqal.a(l4);
    }
    if (this.n != null)
    {
      npy localnpy = this.n;
      paramqal.c(138);
      if (localnpy.ak < 0) {
        localnpy.ak = localnpy.a();
      }
      paramqal.c(localnpy.ak);
      localnpy.a(paramqal);
    }
    if (this.p != null)
    {
      String str5 = this.p;
      paramqal.c(146);
      paramqal.a(str5);
    }
    if (this.q != null)
    {
      nrw localnrw = this.q;
      paramqal.c(154);
      if (localnrw.ak < 0) {
        localnrw.ak = localnrw.a();
      }
      paramqal.c(localnrw.ak);
      localnrw.a(paramqal);
    }
    if (this.r != null)
    {
      int i5 = this.r.length;
      int i6 = 0;
      if (i5 > 0) {
        while (i6 < this.r.length)
        {
          String str4 = this.r[i6];
          if (str4 != null)
          {
            paramqal.c(162);
            paramqal.a(str4);
          }
          i6++;
        }
      }
    }
    if (this.F != -2147483648)
    {
      int i4 = this.F;
      paramqal.c(168);
      paramqal.a(i4);
    }
    if (this.l != null)
    {
      long l3 = this.l.longValue();
      paramqal.c(176);
      paramqal.a(l3);
    }
    if (this.m != null)
    {
      long l2 = this.m.longValue();
      paramqal.c(184);
      paramqal.a(l2);
    }
    if (this.D != null)
    {
      long l1 = this.D.longValue();
      paramqal.c(192);
      paramqal.a(l1);
    }
    if (this.s != null)
    {
      String str3 = this.s;
      paramqal.c(202);
      paramqal.a(str3);
    }
    if (this.o != null)
    {
      nqh localnqh = this.o;
      paramqal.c(210);
      if (localnqh.ak < 0) {
        localnqh.ak = localnqh.a();
      }
      paramqal.c(localnqh.ak);
      localnqh.a(paramqal);
    }
    if (this.t != -2147483648)
    {
      int i3 = this.t;
      paramqal.c(216);
      paramqal.a(i3);
    }
    if (this.u != null)
    {
      pst localpst = this.u;
      paramqal.c(226);
      if (localpst.ak < 0) {
        localpst.ak = localpst.a();
      }
      paramqal.c(localpst.ak);
      localpst.a(paramqal);
    }
    if (this.v != null)
    {
      nrz localnrz = this.v;
      paramqal.c(234);
      if (localnrz.ak < 0) {
        localnrz.ak = localnrz.a();
      }
      paramqal.c(localnrz.ak);
      localnrz.a(paramqal);
    }
    if (this.E != null)
    {
      String str2 = this.E;
      paramqal.c(242);
      paramqal.a(str2);
    }
    if (this.w != -2147483648)
    {
      int i2 = this.w;
      paramqal.c(248);
      paramqal.a(i2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(266);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqu
 * JD-Core Version:    0.7.0.1
 */