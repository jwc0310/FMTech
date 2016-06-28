import java.nio.ByteBuffer;

public final class ona
  extends qan<ona>
{
  private static volatile ona[] n;
  private int A = -2147483648;
  public String a = null;
  public opn b = null;
  public Long c = null;
  public String d = null;
  public String e = null;
  public String f = null;
  public Boolean g = null;
  public Boolean h = null;
  public Long i = null;
  public oks j = null;
  public Boolean k = null;
  public ood l = null;
  public qoq m = null;
  private String o = null;
  private opt p = null;
  private String q = null;
  private String r = null;
  private onh s = null;
  private Boolean t = null;
  private String u = null;
  private Boolean v = null;
  private String w = null;
  private Boolean x = null;
  private String y = null;
  private ooq z = null;
  
  public ona()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ona[] b()
  {
    if (n == null) {}
    synchronized (qar.a)
    {
      if (n == null) {
        n = new ona[0];
      }
      return n;
    }
  }
  
  protected final int a()
  {
    int i1 = super.a();
    String str1 = this.o;
    int i2 = qal.d(16);
    int i3 = qal.a(str1);
    int i4 = i1 + (i2 + (i3 + qal.d(i3)));
    String str2 = this.a;
    int i5 = qal.d(24);
    int i6 = qal.a(str2);
    int i7 = i4 + (i5 + (i6 + qal.d(i6)));
    long l1 = this.c.longValue();
    int i8 = i7 + (qal.d(32) + qal.b(l1));
    String str3 = this.d;
    int i9 = qal.d(40);
    int i10 = qal.a(str3);
    int i11 = i8 + (i9 + (i10 + qal.d(i10)));
    if (this.r != null)
    {
      String str10 = this.r;
      int i46 = qal.d(48);
      int i47 = qal.a(str10);
      i11 += i46 + (i47 + qal.d(i47));
    }
    String str4 = this.e;
    int i12 = qal.d(56);
    int i13 = qal.a(str4);
    int i14 = i11 + (i12 + (i13 + qal.d(i13)));
    String str5 = this.f;
    int i15 = qal.d(64);
    int i16 = qal.a(str5);
    int i17 = i14 + (i15 + (i16 + qal.d(i16)));
    this.g.booleanValue();
    int i18 = i17 + (1 + qal.d(72));
    this.t.booleanValue();
    int i19 = i18 + (1 + qal.d(80));
    if (this.u != null)
    {
      String str9 = this.u;
      int i44 = qal.d(88);
      int i45 = qal.a(str9);
      i19 += i44 + (i45 + qal.d(i45));
    }
    this.v.booleanValue();
    int i20 = i19 + (1 + qal.d(96));
    if (this.h != null)
    {
      this.h.booleanValue();
      i20 += 1 + qal.d(104);
    }
    if (this.i != null)
    {
      long l2 = this.i.longValue();
      i20 += qal.d(120) + qal.b(l2);
    }
    if (this.j != null)
    {
      oks localoks = this.j;
      int i42 = qal.d(128);
      int i43 = localoks.a();
      localoks.ak = i43;
      i20 += i42 + (i43 + qal.d(i43));
    }
    if (this.w != null)
    {
      String str8 = this.w;
      int i40 = qal.d(136);
      int i41 = qal.a(str8);
      i20 += i40 + (i41 + qal.d(i41));
    }
    if (this.x != null)
    {
      this.x.booleanValue();
      i20 += 1 + qal.d(144);
    }
    if (this.p != null)
    {
      opt localopt = this.p;
      int i38 = qal.d(152);
      int i39 = localopt.a();
      localopt.ak = i39;
      i20 += i38 + (i39 + qal.d(i39));
    }
    if (this.s != null)
    {
      onh localonh = this.s;
      int i36 = qal.d(160);
      int i37 = localonh.a();
      localonh.ak = i37;
      i20 += i36 + (i37 + qal.d(i37));
    }
    if (this.y != null)
    {
      String str7 = this.y;
      int i34 = qal.d(168);
      int i35 = qal.a(str7);
      i20 += i34 + (i35 + qal.d(i35));
    }
    if (this.z != null)
    {
      ooq localooq = this.z;
      int i32 = qal.d(176);
      int i33 = localooq.a();
      localooq.ak = i33;
      i20 += i32 + (i33 + qal.d(i33));
    }
    int i29;
    int i30;
    if (this.A != -2147483648)
    {
      i29 = this.A;
      i30 = qal.d(184);
      if (i29 < 0) {
        break label1003;
      }
    }
    label1003:
    for (int i31 = qal.d(i29);; i31 = 10)
    {
      i20 += i31 + i30;
      if (this.k != null)
      {
        this.k.booleanValue();
        i20 += 1 + qal.d(192);
      }
      if (this.q != null)
      {
        String str6 = this.q;
        int i27 = qal.d(200);
        int i28 = qal.a(str6);
        i20 += i27 + (i28 + qal.d(i28));
      }
      if (this.l != null)
      {
        ood localood = this.l;
        int i25 = qal.d(208);
        int i26 = localood.a();
        localood.ak = i26;
        i20 += i25 + (i26 + qal.d(i26));
      }
      if (this.b != null)
      {
        opn localopn = this.b;
        int i23 = qal.d(216);
        int i24 = localopn.a();
        localopn.ak = i24;
        i20 += i23 + (i24 + qal.d(i24));
      }
      if (this.m != null)
      {
        qoq localqoq = this.m;
        int i21 = qal.d(224);
        int i22 = localqoq.a();
        localqoq.ak = i22;
        i20 += i21 + (i22 + qal.d(i22));
      }
      return i20;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    String str1 = this.o;
    paramqal.c(18);
    paramqal.a(str1);
    String str2 = this.a;
    paramqal.c(26);
    paramqal.a(str2);
    long l1 = this.c.longValue();
    paramqal.c(32);
    paramqal.a(l1);
    String str3 = this.d;
    paramqal.c(42);
    paramqal.a(str3);
    if (this.r != null)
    {
      String str10 = this.r;
      paramqal.c(50);
      paramqal.a(str10);
    }
    String str4 = this.e;
    paramqal.c(58);
    paramqal.a(str4);
    String str5 = this.f;
    paramqal.c(66);
    paramqal.a(str5);
    boolean bool1 = this.g.booleanValue();
    paramqal.c(72);
    if (bool1) {}
    byte b1;
    for (int i2 = i1;; i2 = 0)
    {
      b1 = (byte)i2;
      if (paramqal.a.hasRemaining()) {
        break;
      }
      throw new qam(paramqal.a.position(), paramqal.a.limit());
    }
    paramqal.a.put(b1);
    boolean bool2 = this.t.booleanValue();
    paramqal.c(80);
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
    if (this.u != null)
    {
      String str9 = this.u;
      paramqal.c(90);
      paramqal.a(str9);
    }
    boolean bool3 = this.v.booleanValue();
    paramqal.c(96);
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
    if (this.h != null)
    {
      boolean bool6 = this.h.booleanValue();
      paramqal.c(104);
      if (bool6) {}
      byte b6;
      for (int i7 = i1;; i7 = 0)
      {
        b6 = (byte)i7;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if (this.i != null)
    {
      long l2 = this.i.longValue();
      paramqal.c(120);
      paramqal.a(l2);
    }
    if (this.j != null)
    {
      oks localoks = this.j;
      paramqal.c(130);
      if (localoks.ak < 0) {
        localoks.ak = localoks.a();
      }
      paramqal.c(localoks.ak);
      localoks.a(paramqal);
    }
    if (this.w != null)
    {
      String str8 = this.w;
      paramqal.c(138);
      paramqal.a(str8);
    }
    if (this.x != null)
    {
      boolean bool5 = this.x.booleanValue();
      paramqal.c(144);
      if (bool5) {}
      byte b5;
      for (int i6 = i1;; i6 = 0)
      {
        b5 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.p != null)
    {
      opt localopt = this.p;
      paramqal.c(154);
      if (localopt.ak < 0) {
        localopt.ak = localopt.a();
      }
      paramqal.c(localopt.ak);
      localopt.a(paramqal);
    }
    if (this.s != null)
    {
      onh localonh = this.s;
      paramqal.c(162);
      if (localonh.ak < 0) {
        localonh.ak = localonh.a();
      }
      paramqal.c(localonh.ak);
      localonh.a(paramqal);
    }
    if (this.y != null)
    {
      String str7 = this.y;
      paramqal.c(170);
      paramqal.a(str7);
    }
    if (this.z != null)
    {
      ooq localooq = this.z;
      paramqal.c(178);
      if (localooq.ak < 0) {
        localooq.ak = localooq.a();
      }
      paramqal.c(localooq.ak);
      localooq.a(paramqal);
    }
    if (this.A != -2147483648)
    {
      int i5 = this.A;
      paramqal.c(184);
      paramqal.a(i5);
    }
    if (this.k != null)
    {
      boolean bool4 = this.k.booleanValue();
      paramqal.c(192);
      if (bool4) {}
      byte b4;
      for (;;)
      {
        b4 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i1 = 0;
      }
      paramqal.a.put(b4);
    }
    if (this.q != null)
    {
      String str6 = this.q;
      paramqal.c(202);
      paramqal.a(str6);
    }
    if (this.l != null)
    {
      ood localood = this.l;
      paramqal.c(210);
      if (localood.ak < 0) {
        localood.ak = localood.a();
      }
      paramqal.c(localood.ak);
      localood.a(paramqal);
    }
    if (this.b != null)
    {
      opn localopn = this.b;
      paramqal.c(218);
      if (localopn.ak < 0) {
        localopn.ak = localopn.a();
      }
      paramqal.c(localopn.ak);
      localopn.a(paramqal);
    }
    if (this.m != null)
    {
      qoq localqoq = this.m;
      paramqal.c(226);
      if (localqoq.ak < 0) {
        localqoq.ak = localqoq.a();
      }
      paramqal.c(localqoq.ak);
      localqoq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ona
 * JD-Core Version:    0.7.0.1
 */