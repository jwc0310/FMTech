import java.nio.ByteBuffer;

public final class mjk
  extends qan<mjk>
{
  private static volatile mjk[] l;
  public String a = null;
  public int b = -2147483648;
  public int c = -2147483648;
  public mjt d = null;
  public mjl[] e = mjl.b();
  public mjo[] f = mjo.b();
  public String g = null;
  public Long h = null;
  public Boolean i = null;
  public mjy j = null;
  public mjc k = null;
  private Long m = null;
  private String[] n = qay.f;
  private String o = null;
  
  public mjk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mjk[] b()
  {
    if (l == null) {}
    synchronized (qar.a)
    {
      if (l == null) {
        l = new mjk[0];
      }
      return l;
    }
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = 0;
    int i3 = super.a();
    if (this.a != null)
    {
      String str4 = this.a;
      int i30 = qal.d(8);
      int i31 = qal.a(str4);
      i3 += i30 + (i31 + qal.d(i31));
    }
    int i27;
    int i28;
    if (this.b != -2147483648)
    {
      i27 = this.b;
      i28 = qal.d(16);
      if (i27 < 0) {
        break label299;
      }
    }
    int i19;
    label299:
    for (int i29 = qal.d(i27);; i29 = i1)
    {
      i3 += i29 + i28;
      if (this.c != -2147483648)
      {
        int i25 = this.c;
        int i26 = qal.d(24);
        if (i25 >= 0) {
          i1 = qal.d(i25);
        }
        i3 += i26 + i1;
      }
      if (this.m != null)
      {
        long l2 = this.m.longValue();
        i3 += qal.d(32) + qal.b(l2);
      }
      if (this.d != null)
      {
        mjt localmjt = this.d;
        int i23 = qal.d(40);
        int i24 = localmjt.a();
        localmjt.ak = i24;
        i3 += i23 + (i24 + qal.d(i24));
      }
      if ((this.e == null) || (this.e.length <= 0)) {
        break label308;
      }
      i19 = i3;
      for (int i20 = 0; i20 < this.e.length; i20++)
      {
        mjl localmjl = this.e[i20];
        if (localmjl != null)
        {
          int i21 = qal.d(48);
          int i22 = localmjl.a();
          localmjl.ak = i22;
          i19 += i21 + (i22 + qal.d(i22));
        }
      }
    }
    i3 = i19;
    label308:
    if ((this.f != null) && (this.f.length > 0))
    {
      int i15 = i3;
      for (int i16 = 0; i16 < this.f.length; i16++)
      {
        mjo localmjo = this.f[i16];
        if (localmjo != null)
        {
          int i17 = qal.d(56);
          int i18 = localmjo.a();
          localmjo.ak = i18;
          i15 += i17 + (i18 + qal.d(i18));
        }
      }
      i3 = i15;
    }
    if (this.g != null)
    {
      String str3 = this.g;
      int i13 = qal.d(64);
      int i14 = qal.a(str3);
      i3 += i13 + (i14 + qal.d(i14));
    }
    if ((this.n != null) && (this.n.length > 0))
    {
      int i10 = 0;
      int i11 = 0;
      while (i2 < this.n.length)
      {
        String str2 = this.n[i2];
        if (str2 != null)
        {
          i11++;
          int i12 = qal.a(str2);
          i10 += i12 + qal.d(i12);
        }
        i2++;
      }
      i3 = i3 + i10 + i11 * 1;
    }
    if (this.h != null)
    {
      long l1 = this.h.longValue();
      i3 += qal.d(80) + qal.b(l1);
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      i3 += 1 + qal.d(88);
    }
    if (this.o != null)
    {
      String str1 = this.o;
      int i8 = qal.d(96);
      int i9 = qal.a(str1);
      i3 += i8 + (i9 + qal.d(i9));
    }
    if (this.j != null)
    {
      mjy localmjy = this.j;
      int i6 = qal.d(104);
      int i7 = localmjy.a();
      localmjy.ak = i7;
      i3 += i6 + (i7 + qal.d(i7));
    }
    if (this.k != null)
    {
      mjc localmjc = this.k;
      int i4 = qal.d(112);
      int i5 = localmjc.a();
      localmjc.ak = i5;
      i3 += i4 + (i5 + qal.d(i5));
    }
    return i3;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(10);
      paramqal.a(str4);
    }
    if (this.b != -2147483648)
    {
      int i6 = this.b;
      paramqal.c(16);
      paramqal.a(i6);
    }
    if (this.c != -2147483648)
    {
      int i5 = this.c;
      paramqal.c(24);
      paramqal.a(i5);
    }
    if (this.m != null)
    {
      long l2 = this.m.longValue();
      paramqal.c(32);
      paramqal.a(l2);
    }
    if (this.d != null)
    {
      mjt localmjt = this.d;
      paramqal.c(42);
      if (localmjt.ak < 0) {
        localmjt.ak = localmjt.a();
      }
      paramqal.c(localmjt.ak);
      localmjt.a(paramqal);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i4 = 0; i4 < this.e.length; i4++)
      {
        mjl localmjl = this.e[i4];
        if (localmjl != null)
        {
          paramqal.c(50);
          if (localmjl.ak < 0) {
            localmjl.ak = localmjl.a();
          }
          paramqal.c(localmjl.ak);
          localmjl.a(paramqal);
        }
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i3 = 0; i3 < this.f.length; i3++)
      {
        mjo localmjo = this.f[i3];
        if (localmjo != null)
        {
          paramqal.c(58);
          if (localmjo.ak < 0) {
            localmjo.ak = localmjo.a();
          }
          paramqal.c(localmjo.ak);
          localmjo.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      String str3 = this.g;
      paramqal.c(66);
      paramqal.a(str3);
    }
    if ((this.n != null) && (this.n.length > 0)) {
      for (int i2 = 0; i2 < this.n.length; i2++)
      {
        String str2 = this.n[i2];
        if (str2 != null)
        {
          paramqal.c(74);
          paramqal.a(str2);
        }
      }
    }
    if (this.h != null)
    {
      long l1 = this.h.longValue();
      paramqal.c(80);
      paramqal.a(l1);
    }
    if (this.i != null)
    {
      boolean bool = this.i.booleanValue();
      paramqal.c(88);
      int i1 = 0;
      if (bool) {
        i1 = 1;
      }
      byte b1 = (byte)i1;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.o != null)
    {
      String str1 = this.o;
      paramqal.c(98);
      paramqal.a(str1);
    }
    if (this.j != null)
    {
      mjy localmjy = this.j;
      paramqal.c(106);
      if (localmjy.ak < 0) {
        localmjy.ak = localmjy.a();
      }
      paramqal.c(localmjy.ak);
      localmjy.a(paramqal);
    }
    if (this.k != null)
    {
      mjc localmjc = this.k;
      paramqal.c(114);
      if (localmjc.ak < 0) {
        localmjc.ak = localmjc.a();
      }
      paramqal.c(localmjc.ak);
      localmjc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mjk
 * JD-Core Version:    0.7.0.1
 */