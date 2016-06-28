import java.nio.ByteBuffer;

public final class mot
  extends qan<mot>
{
  public String a = null;
  public int b = -2147483648;
  public Boolean c = null;
  private Boolean d = null;
  private String[] e = qay.f;
  private String[] f = qay.f;
  private String[] g = qay.f;
  private int[] h = qay.a;
  private long[] i = qay.b;
  private int j = -2147483648;
  private int[] k = qay.a;
  private mmz[] l = mmz.b();
  private long[] m = qay.b;
  private long[] n = qay.b;
  private Boolean o = null;
  private int[] p = qay.a;
  private String[] q = qay.f;
  private Long r = null;
  private mox s = null;
  private mph t = null;
  private mnv u = null;
  private int v = -2147483648;
  
  public mot()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = 0;
    int i3 = super.a();
    if (this.d != null)
    {
      this.d.booleanValue();
      i3 += 1 + qal.d(8);
    }
    if ((this.m != null) && (this.m.length > 0))
    {
      int i55 = 0;
      int i56 = 0;
      while (i55 < this.m.length)
      {
        i56 += qal.b(this.m[i55]);
        i55++;
      }
      i3 = i3 + i56 + 1 * this.m.length;
    }
    if ((this.n != null) && (this.n.length > 0))
    {
      int i53 = 0;
      int i54 = 0;
      while (i53 < this.n.length)
      {
        i54 += qal.b(this.n[i53]);
        i53++;
      }
      i3 = i3 + i54 + 1 * this.n.length;
    }
    if (this.a != null)
    {
      String str5 = this.a;
      int i51 = qal.d(32);
      int i52 = qal.a(str5);
      i3 += i51 + (i52 + qal.d(i52));
    }
    int i48;
    int i49;
    if (this.b != -2147483648)
    {
      i48 = this.b;
      i49 = qal.d(40);
      if (i48 < 0) {
        break label300;
      }
    }
    int i47;
    label300:
    for (int i50 = qal.d(i48);; i50 = i1)
    {
      i3 += i50 + i49;
      if ((this.i == null) || (this.i.length <= 0)) {
        break label319;
      }
      int i46 = 0;
      i47 = 0;
      while (i46 < this.i.length)
      {
        i47 += qal.b(this.i[i46]);
        i46++;
      }
    }
    i3 = i3 + i47 + 1 * this.i.length;
    label319:
    if (this.o != null)
    {
      this.o.booleanValue();
      i3 += 1 + qal.d(56);
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i42 = 0;
      int i43 = 0;
      int i44 = 0;
      while (i42 < this.e.length)
      {
        String str4 = this.e[i42];
        if (str4 != null)
        {
          i44++;
          int i45 = qal.a(str4);
          i43 += i45 + qal.d(i45);
        }
        i42++;
      }
      i3 = i3 + i43 + i44 * 1;
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int i38 = 0;
      int i39 = 0;
      int i40 = 0;
      while (i38 < this.f.length)
      {
        String str3 = this.f[i38];
        if (str3 != null)
        {
          i40++;
          int i41 = qal.a(str3);
          i39 += i41 + qal.d(i41);
        }
        i38++;
      }
      i3 = i3 + i39 + i40 * 1;
    }
    if ((this.k != null) && (this.k.length > 0))
    {
      int i34 = 0;
      int i35 = 0;
      if (i34 < this.k.length)
      {
        int i36 = this.k[i34];
        if (i36 >= 0) {}
        for (int i37 = qal.d(i36);; i37 = i1)
        {
          i35 += i37;
          i34++;
          break;
        }
      }
      i3 = i3 + i35 + 1 * this.k.length;
    }
    if ((this.p != null) && (this.p.length > 0))
    {
      int i30 = 0;
      int i31 = 0;
      if (i30 < this.p.length)
      {
        int i32 = this.p[i30];
        if (i32 >= 0) {}
        for (int i33 = qal.d(i32);; i33 = i1)
        {
          i31 += i33;
          i30++;
          break;
        }
      }
      i3 = i3 + i31 + 1 * this.p.length;
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i3 += 1 + qal.d(96);
    }
    if ((this.h != null) && (this.h.length > 0))
    {
      int i26 = 0;
      int i27 = 0;
      if (i26 < this.h.length)
      {
        int i28 = this.h[i26];
        if (i28 >= 0) {}
        for (int i29 = qal.d(i28);; i29 = i1)
        {
          i27 += i29;
          i26++;
          break;
        }
      }
      i3 = i3 + i27 + 1 * this.h.length;
    }
    int i23;
    int i24;
    if (this.j != -2147483648)
    {
      i23 = this.j;
      i24 = qal.d(112);
      if (i23 < 0) {
        break label914;
      }
    }
    int i20;
    int i21;
    label914:
    for (int i25 = qal.d(i23);; i25 = i1)
    {
      i3 += i25 + i24;
      if ((this.q == null) || (this.q.length <= 0)) {
        break label930;
      }
      int i19 = 0;
      i20 = 0;
      i21 = 0;
      while (i19 < this.q.length)
      {
        String str2 = this.q[i19];
        if (str2 != null)
        {
          i21++;
          int i22 = qal.a(str2);
          i20 += i22 + qal.d(i22);
        }
        i19++;
      }
    }
    i3 = i3 + i20 + i21 * 1;
    label930:
    if (this.r != null)
    {
      long l1 = this.r.longValue();
      i3 += qal.d(128) + qal.b(l1);
    }
    if ((this.l != null) && (this.l.length > 0))
    {
      int i15 = i3;
      for (int i16 = 0; i16 < this.l.length; i16++)
      {
        mmz localmmz = this.l[i16];
        if (localmmz != null)
        {
          int i17 = qal.d(136);
          int i18 = localmmz.a();
          localmmz.ak = i18;
          i15 += i17 + (i18 + qal.d(i18));
        }
      }
      i3 = i15;
    }
    if ((this.g != null) && (this.g.length > 0))
    {
      int i12 = 0;
      int i13 = 0;
      while (i2 < this.g.length)
      {
        String str1 = this.g[i2];
        if (str1 != null)
        {
          i13++;
          int i14 = qal.a(str1);
          i12 += i14 + qal.d(i14);
        }
        i2++;
      }
      i3 = i3 + i12 + i13 * 2;
    }
    if (this.t != null)
    {
      mph localmph = this.t;
      int i10 = qal.d(160);
      int i11 = localmph.a();
      localmph.ak = i11;
      i3 += i10 + (i11 + qal.d(i11));
    }
    if (this.s != null)
    {
      mox localmox = this.s;
      int i8 = qal.d(168);
      int i9 = localmox.a();
      localmox.ak = i9;
      i3 += i8 + (i9 + qal.d(i9));
    }
    if (this.u != null)
    {
      mnv localmnv = this.u;
      int i6 = qal.d(176);
      int i7 = localmnv.a();
      localmnv.ak = i7;
      i3 += i6 + (i7 + qal.d(i7));
    }
    if (this.v != -2147483648)
    {
      int i4 = this.v;
      int i5 = qal.d(184);
      if (i4 >= 0) {
        i1 = qal.d(i4);
      }
      i3 += i5 + i1;
    }
    return i3;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.d != null)
    {
      boolean bool3 = this.d.booleanValue();
      paramqal.c(8);
      if (bool3) {}
      byte b3;
      for (int i21 = i1;; i21 = 0)
      {
        b3 = (byte)i21;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if ((this.m != null) && (this.m.length > 0)) {
      for (int i20 = 0; i20 < this.m.length; i20++)
      {
        long l4 = this.m[i20];
        paramqal.c(16);
        paramqal.a(l4);
      }
    }
    if ((this.n != null) && (this.n.length > 0)) {
      for (int i19 = 0; i19 < this.n.length; i19++)
      {
        long l3 = this.n[i19];
        paramqal.c(24);
        paramqal.a(l3);
      }
    }
    if (this.a != null)
    {
      String str5 = this.a;
      paramqal.c(34);
      paramqal.a(str5);
    }
    if (this.b != -2147483648)
    {
      int i18 = this.b;
      paramqal.c(40);
      paramqal.a(i18);
    }
    if ((this.i != null) && (this.i.length > 0)) {
      for (int i17 = 0; i17 < this.i.length; i17++)
      {
        long l2 = this.i[i17];
        paramqal.c(48);
        paramqal.a(l2);
      }
    }
    if (this.o != null)
    {
      boolean bool2 = this.o.booleanValue();
      paramqal.c(56);
      if (bool2) {}
      byte b2;
      for (int i16 = i1;; i16 = 0)
      {
        b2 = (byte)i16;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i15 = 0; i15 < this.e.length; i15++)
      {
        String str4 = this.e[i15];
        if (str4 != null)
        {
          paramqal.c(66);
          paramqal.a(str4);
        }
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i14 = 0; i14 < this.f.length; i14++)
      {
        String str3 = this.f[i14];
        if (str3 != null)
        {
          paramqal.c(74);
          paramqal.a(str3);
        }
      }
    }
    if ((this.k != null) && (this.k.length > 0)) {
      for (int i12 = 0; i12 < this.k.length; i12++)
      {
        int i13 = this.k[i12];
        paramqal.c(80);
        paramqal.a(i13);
      }
    }
    if ((this.p != null) && (this.p.length > 0)) {
      for (int i10 = 0; i10 < this.p.length; i10++)
      {
        int i11 = this.p[i10];
        paramqal.c(88);
        paramqal.a(i11);
      }
    }
    if (this.c != null)
    {
      boolean bool1 = this.c.booleanValue();
      paramqal.c(96);
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
    if ((this.h != null) && (this.h.length > 0)) {
      for (int i8 = 0; i8 < this.h.length; i8++)
      {
        int i9 = this.h[i8];
        paramqal.c(104);
        paramqal.a(i9);
      }
    }
    if (this.j != -2147483648)
    {
      int i7 = this.j;
      paramqal.c(112);
      paramqal.a(i7);
    }
    if ((this.q != null) && (this.q.length > 0)) {
      for (int i6 = 0; i6 < this.q.length; i6++)
      {
        String str2 = this.q[i6];
        if (str2 != null)
        {
          paramqal.c(122);
          paramqal.a(str2);
        }
      }
    }
    if (this.r != null)
    {
      long l1 = this.r.longValue();
      paramqal.c(128);
      paramqal.a(l1);
    }
    if ((this.l != null) && (this.l.length > 0)) {
      for (int i5 = 0; i5 < this.l.length; i5++)
      {
        mmz localmmz = this.l[i5];
        if (localmmz != null)
        {
          paramqal.c(138);
          if (localmmz.ak < 0) {
            localmmz.ak = localmmz.a();
          }
          paramqal.c(localmmz.ak);
          localmmz.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      int i3 = this.g.length;
      int i4 = 0;
      if (i3 > 0) {
        while (i4 < this.g.length)
        {
          String str1 = this.g[i4];
          if (str1 != null)
          {
            paramqal.c(154);
            paramqal.a(str1);
          }
          i4++;
        }
      }
    }
    if (this.t != null)
    {
      mph localmph = this.t;
      paramqal.c(162);
      if (localmph.ak < 0) {
        localmph.ak = localmph.a();
      }
      paramqal.c(localmph.ak);
      localmph.a(paramqal);
    }
    if (this.s != null)
    {
      mox localmox = this.s;
      paramqal.c(170);
      if (localmox.ak < 0) {
        localmox.ak = localmox.a();
      }
      paramqal.c(localmox.ak);
      localmox.a(paramqal);
    }
    if (this.u != null)
    {
      mnv localmnv = this.u;
      paramqal.c(178);
      if (localmnv.ak < 0) {
        localmnv.ak = localmnv.a();
      }
      paramqal.c(localmnv.ak);
      localmnv.a(paramqal);
    }
    if (this.v != -2147483648)
    {
      int i2 = this.v;
      paramqal.c(184);
      paramqal.a(i2);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mot
 * JD-Core Version:    0.7.0.1
 */