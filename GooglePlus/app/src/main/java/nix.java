public final class nix
  extends qan<nix>
{
  private static volatile nix[] a;
  private Integer b = null;
  private Integer c = null;
  private String[] d = qay.f;
  private nin[] e = nin.b();
  private nio[] f = nio.b();
  private nje g = null;
  private int[] h = qay.a;
  private niq i = null;
  private njd[] j = njd.b();
  private nis k = null;
  private String l = null;
  
  public nix()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nix[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nix[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int m = super.a();
    int i33;
    int i34;
    if (this.b != null)
    {
      int i32 = this.b.intValue();
      i33 = qal.d(8);
      if (i32 >= 0) {
        i34 = qal.d(i32);
      }
    }
    for (int n = m + (i34 + i33);; n = m)
    {
      int i29;
      int i30;
      if (this.c != null)
      {
        i29 = this.c.intValue();
        i30 = qal.d(16);
        if (i29 < 0) {
          break label175;
        }
      }
      int i26;
      int i27;
      label175:
      for (int i31 = qal.d(i29);; i31 = 10)
      {
        n += i31 + i30;
        if ((this.d == null) || (this.d.length <= 0)) {
          break label192;
        }
        int i25 = 0;
        i26 = 0;
        i27 = 0;
        while (i25 < this.d.length)
        {
          String str2 = this.d[i25];
          if (str2 != null)
          {
            i27++;
            int i28 = qal.a(str2);
            i26 += i28 + qal.d(i28);
          }
          i25++;
        }
        i34 = 10;
        break;
      }
      n = n + i26 + i27 * 1;
      label192:
      if ((this.e != null) && (this.e.length > 0))
      {
        int i21 = n;
        for (int i22 = 0; i22 < this.e.length; i22++)
        {
          nin localnin = this.e[i22];
          if (localnin != null)
          {
            int i23 = qal.d(32);
            int i24 = localnin.a();
            localnin.ak = i24;
            i21 += i23 + (i24 + qal.d(i24));
          }
        }
        n = i21;
      }
      if ((this.f != null) && (this.f.length > 0))
      {
        int i17 = n;
        for (int i18 = 0; i18 < this.f.length; i18++)
        {
          nio localnio = this.f[i18];
          if (localnio != null)
          {
            int i19 = qal.d(40);
            int i20 = localnio.a();
            localnio.ak = i20;
            i17 += i19 + (i20 + qal.d(i20));
          }
        }
        n = i17;
      }
      if (this.g != null)
      {
        nje localnje = this.g;
        int i15 = qal.d(48);
        int i16 = localnje.a();
        localnje.ak = i16;
        n += i15 + (i16 + qal.d(i16));
      }
      if ((this.h != null) && (this.h.length > 0))
      {
        int i11 = 0;
        int i12 = 0;
        if (i11 < this.h.length)
        {
          int i13 = this.h[i11];
          if (i13 >= 0) {}
          for (int i14 = qal.d(i13);; i14 = 10)
          {
            i12 += i14;
            i11++;
            break;
          }
        }
        n = n + i12 + 1 * this.h.length;
      }
      if (this.i != null)
      {
        niq localniq = this.i;
        int i9 = qal.d(64);
        int i10 = localniq.a();
        localniq.ak = i10;
        n += i9 + (i10 + qal.d(i10));
      }
      if (this.j != null)
      {
        int i5 = this.j.length;
        int i6 = 0;
        if (i5 > 0) {
          while (i6 < this.j.length)
          {
            njd localnjd = this.j[i6];
            if (localnjd != null)
            {
              int i7 = qal.d(72);
              int i8 = localnjd.a();
              localnjd.ak = i8;
              n += i7 + (i8 + qal.d(i8));
            }
            i6++;
          }
        }
      }
      if (this.k != null)
      {
        nis localnis = this.k;
        int i3 = qal.d(80);
        int i4 = localnis.a();
        localnis.ak = i4;
        n += i3 + (i4 + qal.d(i4));
      }
      if (this.l != null)
      {
        String str1 = this.l;
        int i1 = qal.d(88);
        int i2 = qal.a(str1);
        n += i1 + (i2 + qal.d(i2));
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      int i7 = this.b.intValue();
      paramqal.c(8);
      paramqal.a(i7);
    }
    if (this.c != null)
    {
      int i6 = this.c.intValue();
      paramqal.c(16);
      paramqal.a(i6);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i5 = 0; i5 < this.d.length; i5++)
      {
        String str2 = this.d[i5];
        if (str2 != null)
        {
          paramqal.c(26);
          paramqal.a(str2);
        }
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i4 = 0; i4 < this.e.length; i4++)
      {
        nin localnin = this.e[i4];
        if (localnin != null)
        {
          paramqal.c(34);
          if (localnin.ak < 0) {
            localnin.ak = localnin.a();
          }
          paramqal.c(localnin.ak);
          localnin.a(paramqal);
        }
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i3 = 0; i3 < this.f.length; i3++)
      {
        nio localnio = this.f[i3];
        if (localnio != null)
        {
          paramqal.c(42);
          if (localnio.ak < 0) {
            localnio.ak = localnio.a();
          }
          paramqal.c(localnio.ak);
          localnio.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      nje localnje = this.g;
      paramqal.c(50);
      if (localnje.ak < 0) {
        localnje.ak = localnje.a();
      }
      paramqal.c(localnje.ak);
      localnje.a(paramqal);
    }
    if ((this.h != null) && (this.h.length > 0)) {
      for (int i1 = 0; i1 < this.h.length; i1++)
      {
        int i2 = this.h[i1];
        paramqal.c(56);
        paramqal.a(i2);
      }
    }
    if (this.i != null)
    {
      niq localniq = this.i;
      paramqal.c(66);
      if (localniq.ak < 0) {
        localniq.ak = localniq.a();
      }
      paramqal.c(localniq.ak);
      localniq.a(paramqal);
    }
    if (this.j != null)
    {
      int m = this.j.length;
      int n = 0;
      if (m > 0) {
        while (n < this.j.length)
        {
          njd localnjd = this.j[n];
          if (localnjd != null)
          {
            paramqal.c(74);
            if (localnjd.ak < 0) {
              localnjd.ak = localnjd.a();
            }
            paramqal.c(localnjd.ak);
            localnjd.a(paramqal);
          }
          n++;
        }
      }
    }
    if (this.k != null)
    {
      nis localnis = this.k;
      paramqal.c(82);
      if (localnis.ak < 0) {
        localnis.ak = localnis.a();
      }
      paramqal.c(localnis.ak);
      localnis.a(paramqal);
    }
    if (this.l != null)
    {
      String str1 = this.l;
      paramqal.c(90);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nix
 * JD-Core Version:    0.7.0.1
 */