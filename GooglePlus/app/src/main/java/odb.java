public final class odb
  extends qan<odb>
{
  static final odb[] a = new odb[0];
  public int b = -2147483648;
  public odg[] c = odg.b();
  public ori d = null;
  public odd e = null;
  public ocz f = null;
  private mor[] g = mor.a;
  private String h = null;
  private ocw i = null;
  private odf j = null;
  private ocy k = null;
  private String l = null;
  private oda m = null;
  private ocx n = null;
  
  static
  {
    new qao(11, odb.class, (int)404547666L, false);
  }
  
  public odb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = super.a();
    int i32;
    int i33;
    if (this.b != -2147483648)
    {
      int i31 = this.b;
      i32 = qal.d(8);
      if (i31 >= 0) {
        i33 = qal.d(i31);
      }
    }
    for (int i2 = i1 + (i33 + i32);; i2 = i1)
    {
      if ((this.c != null) && (this.c.length > 0))
      {
        int i27 = i2;
        int i28 = 0;
        for (;;)
        {
          if (i28 < this.c.length)
          {
            odg localodg = this.c[i28];
            if (localodg != null)
            {
              int i29 = qal.d(16);
              int i30 = localodg.a();
              localodg.ak = i30;
              i27 += i29 + (i30 + qal.d(i30));
            }
            i28++;
            continue;
            i33 = 10;
            break;
          }
        }
        i2 = i27;
      }
      if (this.d != null)
      {
        ori localori = this.d;
        int i25 = qal.d(24);
        int i26 = localori.a();
        localori.ak = i26;
        i2 += i25 + (i26 + qal.d(i26));
      }
      if (this.h != null)
      {
        String str2 = this.h;
        int i23 = qal.d(48);
        int i24 = qal.a(str2);
        i2 += i23 + (i24 + qal.d(i24));
      }
      if (this.i != null)
      {
        ocw localocw = this.i;
        int i21 = qal.d(64);
        int i22 = localocw.a();
        localocw.ak = i22;
        i2 += i21 + (i22 + qal.d(i22));
      }
      if (this.j != null)
      {
        odf localodf = this.j;
        int i19 = qal.d(72);
        int i20 = localodf.a();
        localodf.ak = i20;
        i2 += i19 + (i20 + qal.d(i20));
      }
      if (this.k != null)
      {
        ocy localocy = this.k;
        int i17 = qal.d(80);
        int i18 = localocy.a();
        localocy.ak = i18;
        i2 += i17 + (i18 + qal.d(i18));
      }
      if (this.l != null)
      {
        String str1 = this.l;
        int i15 = qal.d(88);
        int i16 = qal.a(str1);
        i2 += i15 + (i16 + qal.d(i16));
      }
      if (this.m != null)
      {
        oda localoda = this.m;
        int i13 = qal.d(96);
        int i14 = localoda.a();
        localoda.ak = i14;
        i2 += i13 + (i14 + qal.d(i14));
      }
      if (this.n != null)
      {
        ocx localocx = this.n;
        int i11 = qal.d(104);
        int i12 = localocx.a();
        localocx.ak = i12;
        i2 += i11 + (i12 + qal.d(i12));
      }
      if (this.e != null)
      {
        odd localodd = this.e;
        int i9 = qal.d(120);
        int i10 = localodd.a();
        localodd.ak = i10;
        i2 += i9 + (i10 + qal.d(i10));
      }
      if (this.f != null)
      {
        ocz localocz = this.f;
        int i7 = qal.d(128);
        int i8 = localocz.a();
        localocz.ak = i8;
        i2 += i7 + (i8 + qal.d(i8));
      }
      if (this.g != null)
      {
        int i3 = this.g.length;
        int i4 = 0;
        if (i3 > 0) {
          while (i4 < this.g.length)
          {
            mor localmor = this.g[i4];
            if (localmor != null)
            {
              int i5 = qal.d(136);
              int i6 = localmor.a();
              localmor.ak = i6;
              i2 += i5 + (i6 + qal.d(i6));
            }
            i4++;
          }
        }
      }
      return i2;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int i4 = this.b;
      paramqal.c(8);
      paramqal.a(i4);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i3 = 0; i3 < this.c.length; i3++)
      {
        odg localodg = this.c[i3];
        if (localodg != null)
        {
          paramqal.c(18);
          if (localodg.ak < 0) {
            localodg.ak = localodg.a();
          }
          paramqal.c(localodg.ak);
          localodg.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      ori localori = this.d;
      paramqal.c(26);
      if (localori.ak < 0) {
        localori.ak = localori.a();
      }
      paramqal.c(localori.ak);
      localori.a(paramqal);
    }
    if (this.h != null)
    {
      String str2 = this.h;
      paramqal.c(50);
      paramqal.a(str2);
    }
    if (this.i != null)
    {
      ocw localocw = this.i;
      paramqal.c(66);
      if (localocw.ak < 0) {
        localocw.ak = localocw.a();
      }
      paramqal.c(localocw.ak);
      localocw.a(paramqal);
    }
    if (this.j != null)
    {
      odf localodf = this.j;
      paramqal.c(74);
      if (localodf.ak < 0) {
        localodf.ak = localodf.a();
      }
      paramqal.c(localodf.ak);
      localodf.a(paramqal);
    }
    if (this.k != null)
    {
      ocy localocy = this.k;
      paramqal.c(82);
      if (localocy.ak < 0) {
        localocy.ak = localocy.a();
      }
      paramqal.c(localocy.ak);
      localocy.a(paramqal);
    }
    if (this.l != null)
    {
      String str1 = this.l;
      paramqal.c(90);
      paramqal.a(str1);
    }
    if (this.m != null)
    {
      oda localoda = this.m;
      paramqal.c(98);
      if (localoda.ak < 0) {
        localoda.ak = localoda.a();
      }
      paramqal.c(localoda.ak);
      localoda.a(paramqal);
    }
    if (this.n != null)
    {
      ocx localocx = this.n;
      paramqal.c(106);
      if (localocx.ak < 0) {
        localocx.ak = localocx.a();
      }
      paramqal.c(localocx.ak);
      localocx.a(paramqal);
    }
    if (this.e != null)
    {
      odd localodd = this.e;
      paramqal.c(122);
      if (localodd.ak < 0) {
        localodd.ak = localodd.a();
      }
      paramqal.c(localodd.ak);
      localodd.a(paramqal);
    }
    if (this.f != null)
    {
      ocz localocz = this.f;
      paramqal.c(130);
      if (localocz.ak < 0) {
        localocz.ak = localocz.a();
      }
      paramqal.c(localocz.ak);
      localocz.a(paramqal);
    }
    if (this.g != null)
    {
      int i1 = this.g.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.g.length)
        {
          mor localmor = this.g[i2];
          if (localmor != null)
          {
            paramqal.c(138);
            if (localmor.ak < 0) {
              localmor.ak = localmor.a();
            }
            paramqal.c(localmor.ak);
            localmor.a(paramqal);
          }
          i2++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odb
 * JD-Core Version:    0.7.0.1
 */