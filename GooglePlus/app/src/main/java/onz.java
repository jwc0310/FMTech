import java.nio.ByteBuffer;

public final class onz
  extends qan<onz>
{
  private static volatile onz[] e;
  private qch A = null;
  public String a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  private String f = null;
  private String g = null;
  private Integer h = null;
  private Integer i = null;
  private Integer j = null;
  private Integer k = null;
  private String l = null;
  private Integer m = null;
  private Integer n = null;
  private Integer o = null;
  private Integer p = null;
  private String q = null;
  private String r = null;
  private Boolean s = null;
  private Double t = null;
  private String u = null;
  private String v = null;
  private String w = null;
  private String x = null;
  private String y = null;
  private String z = null;
  
  public onz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static onz[] b()
  {
    if (e == null) {}
    synchronized (qar.a)
    {
      if (e == null) {
        e = new onz[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.f != null)
    {
      String str15 = this.f;
      int i56 = qal.d(8);
      int i57 = qal.a(str15);
      i2 += i56 + (i57 + qal.d(i57));
    }
    if (this.g != null)
    {
      String str14 = this.g;
      int i54 = qal.d(16);
      int i55 = qal.a(str14);
      i2 += i54 + (i55 + qal.d(i55));
    }
    if (this.a != null)
    {
      String str13 = this.a;
      int i52 = qal.d(24);
      int i53 = qal.a(str13);
      i2 += i52 + (i53 + qal.d(i53));
    }
    int i51;
    int i48;
    label209:
    int i45;
    label252:
    int i42;
    label295:
    int i35;
    label420:
    int i32;
    label463:
    int i27;
    int i28;
    if (this.h != null)
    {
      int i49 = this.h.intValue();
      int i50 = qal.d(32);
      if (i49 >= 0)
      {
        i51 = qal.d(i49);
        i2 += i51 + i50;
      }
    }
    else
    {
      if (this.i != null)
      {
        int i46 = this.i.intValue();
        int i47 = qal.d(40);
        if (i46 < 0) {
          break label1080;
        }
        i48 = qal.d(i46);
        i2 += i48 + i47;
      }
      if (this.j != null)
      {
        int i43 = this.j.intValue();
        int i44 = qal.d(48);
        if (i43 < 0) {
          break label1086;
        }
        i45 = qal.d(i43);
        i2 += i45 + i44;
      }
      if (this.k != null)
      {
        int i40 = this.k.intValue();
        int i41 = qal.d(56);
        if (i40 < 0) {
          break label1092;
        }
        i42 = qal.d(i40);
        i2 += i42 + i41;
      }
      if (this.b != null)
      {
        String str12 = this.b;
        int i38 = qal.d(64);
        int i39 = qal.a(str12);
        i2 += i38 + (i39 + qal.d(i39));
      }
      if (this.l != null)
      {
        String str11 = this.l;
        int i36 = qal.d(72);
        int i37 = qal.a(str11);
        i2 += i36 + (i37 + qal.d(i37));
      }
      if (this.m != null)
      {
        int i33 = this.m.intValue();
        int i34 = qal.d(80);
        if (i33 < 0) {
          break label1098;
        }
        i35 = qal.d(i33);
        i2 += i35 + i34;
      }
      if (this.n != null)
      {
        int i30 = this.n.intValue();
        int i31 = qal.d(88);
        if (i30 < 0) {
          break label1104;
        }
        i32 = qal.d(i30);
        i2 += i32 + i31;
      }
      if (this.o != null)
      {
        i27 = this.o.intValue();
        i28 = qal.d(96);
        if (i27 < 0) {
          break label1110;
        }
      }
    }
    label1080:
    label1086:
    label1092:
    label1098:
    label1104:
    label1110:
    for (int i29 = qal.d(i27);; i29 = i1)
    {
      i2 += i29 + i28;
      if (this.p != null)
      {
        int i25 = this.p.intValue();
        int i26 = qal.d(104);
        if (i25 >= 0) {
          i1 = qal.d(i25);
        }
        i2 += i26 + i1;
      }
      if (this.q != null)
      {
        String str10 = this.q;
        int i23 = qal.d(112);
        int i24 = qal.a(str10);
        i2 += i23 + (i24 + qal.d(i24));
      }
      if (this.r != null)
      {
        String str9 = this.r;
        int i21 = qal.d(120);
        int i22 = qal.a(str9);
        i2 += i21 + (i22 + qal.d(i22));
      }
      if (this.s != null)
      {
        this.s.booleanValue();
        i2 += 1 + qal.d(128);
      }
      if (this.t != null)
      {
        this.t.doubleValue();
        i2 += 8 + qal.d(136);
      }
      if (this.c != null)
      {
        String str8 = this.c;
        int i19 = qal.d(144);
        int i20 = qal.a(str8);
        i2 += i19 + (i20 + qal.d(i20));
      }
      if (this.d != null)
      {
        String str7 = this.d;
        int i17 = qal.d(152);
        int i18 = qal.a(str7);
        i2 += i17 + (i18 + qal.d(i18));
      }
      if (this.u != null)
      {
        String str6 = this.u;
        int i15 = qal.d(160);
        int i16 = qal.a(str6);
        i2 += i15 + (i16 + qal.d(i16));
      }
      if (this.v != null)
      {
        String str5 = this.v;
        int i13 = qal.d(168);
        int i14 = qal.a(str5);
        i2 += i13 + (i14 + qal.d(i14));
      }
      if (this.w != null)
      {
        String str4 = this.w;
        int i11 = qal.d(176);
        int i12 = qal.a(str4);
        i2 += i11 + (i12 + qal.d(i12));
      }
      if (this.x != null)
      {
        String str3 = this.x;
        int i9 = qal.d(184);
        int i10 = qal.a(str3);
        i2 += i9 + (i10 + qal.d(i10));
      }
      if (this.y != null)
      {
        String str2 = this.y;
        int i7 = qal.d(192);
        int i8 = qal.a(str2);
        i2 += i7 + (i8 + qal.d(i8));
      }
      if (this.z != null)
      {
        String str1 = this.z;
        int i5 = qal.d(200);
        int i6 = qal.a(str1);
        i2 += i5 + (i6 + qal.d(i6));
      }
      if (this.A != null)
      {
        qch localqch = this.A;
        int i3 = qal.d(216);
        int i4 = localqch.a();
        localqch.ak = i4;
        i2 += i3 + (i4 + qal.d(i4));
      }
      return i2;
      i51 = i1;
      break;
      i48 = i1;
      break label209;
      i45 = i1;
      break label252;
      i42 = i1;
      break label295;
      i35 = i1;
      break label420;
      i32 = i1;
      break label463;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.f != null)
    {
      String str15 = this.f;
      paramqal.c(10);
      paramqal.a(str15);
    }
    if (this.g != null)
    {
      String str14 = this.g;
      paramqal.c(18);
      paramqal.a(str14);
    }
    if (this.a != null)
    {
      String str13 = this.a;
      paramqal.c(26);
      paramqal.a(str13);
    }
    if (this.h != null)
    {
      int i9 = this.h.intValue();
      paramqal.c(32);
      paramqal.a(i9);
    }
    if (this.i != null)
    {
      int i8 = this.i.intValue();
      paramqal.c(40);
      paramqal.a(i8);
    }
    if (this.j != null)
    {
      int i7 = this.j.intValue();
      paramqal.c(48);
      paramqal.a(i7);
    }
    if (this.k != null)
    {
      int i6 = this.k.intValue();
      paramqal.c(56);
      paramqal.a(i6);
    }
    if (this.b != null)
    {
      String str12 = this.b;
      paramqal.c(66);
      paramqal.a(str12);
    }
    if (this.l != null)
    {
      String str11 = this.l;
      paramqal.c(74);
      paramqal.a(str11);
    }
    if (this.m != null)
    {
      int i5 = this.m.intValue();
      paramqal.c(80);
      paramqal.a(i5);
    }
    if (this.n != null)
    {
      int i4 = this.n.intValue();
      paramqal.c(88);
      paramqal.a(i4);
    }
    if (this.o != null)
    {
      int i3 = this.o.intValue();
      paramqal.c(96);
      paramqal.a(i3);
    }
    if (this.p != null)
    {
      int i2 = this.p.intValue();
      paramqal.c(104);
      paramqal.a(i2);
    }
    if (this.q != null)
    {
      String str10 = this.q;
      paramqal.c(114);
      paramqal.a(str10);
    }
    if (this.r != null)
    {
      String str9 = this.r;
      paramqal.c(122);
      paramqal.a(str9);
    }
    if (this.s != null)
    {
      boolean bool = this.s.booleanValue();
      paramqal.c(128);
      if (bool) {}
      byte b1;
      for (int i1 = 1;; i1 = 0)
      {
        b1 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.t != null)
    {
      double d1 = this.t.doubleValue();
      paramqal.c(137);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.c != null)
    {
      String str8 = this.c;
      paramqal.c(146);
      paramqal.a(str8);
    }
    if (this.d != null)
    {
      String str7 = this.d;
      paramqal.c(154);
      paramqal.a(str7);
    }
    if (this.u != null)
    {
      String str6 = this.u;
      paramqal.c(162);
      paramqal.a(str6);
    }
    if (this.v != null)
    {
      String str5 = this.v;
      paramqal.c(170);
      paramqal.a(str5);
    }
    if (this.w != null)
    {
      String str4 = this.w;
      paramqal.c(178);
      paramqal.a(str4);
    }
    if (this.x != null)
    {
      String str3 = this.x;
      paramqal.c(186);
      paramqal.a(str3);
    }
    if (this.y != null)
    {
      String str2 = this.y;
      paramqal.c(194);
      paramqal.a(str2);
    }
    if (this.z != null)
    {
      String str1 = this.z;
      paramqal.c(202);
      paramqal.a(str1);
    }
    if (this.A != null)
    {
      qch localqch = this.A;
      paramqal.c(218);
      if (localqch.ak < 0) {
        localqch.ak = localqch.a();
      }
      paramqal.c(localqch.ak);
      localqch.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     onz
 * JD-Core Version:    0.7.0.1
 */