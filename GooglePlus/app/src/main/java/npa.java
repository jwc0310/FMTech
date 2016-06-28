public final class npa
  extends qan<npa>
{
  public oif a = null;
  public String b = null;
  public okn[] c = okn.b();
  public okn d = null;
  public opo[] e = opo.c;
  private npf f = null;
  private oie g = null;
  private okj h = null;
  private nph i = null;
  private ojf[] j = ojf.b();
  private ojv k = null;
  
  public npa()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.f != null)
    {
      npf localnpf = this.f;
      int i26 = qal.d(8);
      int i27 = localnpf.a();
      localnpf.ak = i27;
      m += i26 + (i27 + qal.d(i27));
    }
    if (this.a != null)
    {
      oif localoif = this.a;
      int i24 = qal.d(16);
      int i25 = localoif.a();
      localoif.ak = i25;
      m += i24 + (i25 + qal.d(i25));
    }
    if ((this.j != null) && (this.j.length > 0))
    {
      int i20 = m;
      for (int i21 = 0; i21 < this.j.length; i21++)
      {
        ojf localojf = this.j[i21];
        if (localojf != null)
        {
          int i22 = qal.d(24);
          int i23 = localojf.a();
          localojf.ak = i23;
          i20 += i22 + (i23 + qal.d(i23));
        }
      }
      m = i20;
    }
    if (this.b != null)
    {
      String str = this.b;
      int i18 = qal.d(32);
      int i19 = qal.a(str);
      m += i18 + (i19 + qal.d(i19));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i14 = m;
      for (int i15 = 0; i15 < this.c.length; i15++)
      {
        okn localokn2 = this.c[i15];
        if (localokn2 != null)
        {
          int i16 = qal.d(40);
          int i17 = localokn2.a();
          localokn2.ak = i17;
          i14 += i16 + (i17 + qal.d(i17));
        }
      }
      m = i14;
    }
    if (this.g != null)
    {
      oie localoie = this.g;
      int i12 = qal.d(48);
      int i13 = localoie.a();
      localoie.ak = i13;
      m += i12 + (i13 + qal.d(i13));
    }
    if (this.i != null)
    {
      nph localnph = this.i;
      int i10 = qal.d(56);
      int i11 = localnph.a();
      localnph.ak = i11;
      m += i10 + (i11 + qal.d(i11));
    }
    if (this.h != null)
    {
      okj localokj = this.h;
      int i8 = qal.d(72);
      int i9 = localokj.a();
      localokj.ak = i9;
      m += i8 + (i9 + qal.d(i9));
    }
    if (this.d != null)
    {
      okn localokn1 = this.d;
      int i6 = qal.d(80);
      int i7 = localokn1.a();
      localokn1.ak = i7;
      m += i6 + (i7 + qal.d(i7));
    }
    if (this.e != null)
    {
      int i2 = this.e.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.e.length)
        {
          opo localopo = this.e[i3];
          if (localopo != null)
          {
            int i4 = qal.d(88);
            int i5 = localopo.a();
            localopo.ak = i5;
            m += i4 + (i5 + qal.d(i5));
          }
          i3++;
        }
      }
    }
    if (this.k != null)
    {
      ojv localojv = this.k;
      int n = qal.d(96);
      int i1 = localojv.a();
      localojv.ak = i1;
      m += n + (i1 + qal.d(i1));
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    if (this.f != null)
    {
      npf localnpf = this.f;
      paramqal.c(10);
      if (localnpf.ak < 0) {
        localnpf.ak = localnpf.a();
      }
      paramqal.c(localnpf.ak);
      localnpf.a(paramqal);
    }
    if (this.a != null)
    {
      oif localoif = this.a;
      paramqal.c(18);
      if (localoif.ak < 0) {
        localoif.ak = localoif.a();
      }
      paramqal.c(localoif.ak);
      localoif.a(paramqal);
    }
    if ((this.j != null) && (this.j.length > 0)) {
      for (int i2 = 0; i2 < this.j.length; i2++)
      {
        ojf localojf = this.j[i2];
        if (localojf != null)
        {
          paramqal.c(26);
          if (localojf.ak < 0) {
            localojf.ak = localojf.a();
          }
          paramqal.c(localojf.ak);
          localojf.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(34);
      paramqal.a(str);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i1 = 0; i1 < this.c.length; i1++)
      {
        okn localokn2 = this.c[i1];
        if (localokn2 != null)
        {
          paramqal.c(42);
          if (localokn2.ak < 0) {
            localokn2.ak = localokn2.a();
          }
          paramqal.c(localokn2.ak);
          localokn2.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      oie localoie = this.g;
      paramqal.c(50);
      if (localoie.ak < 0) {
        localoie.ak = localoie.a();
      }
      paramqal.c(localoie.ak);
      localoie.a(paramqal);
    }
    if (this.i != null)
    {
      nph localnph = this.i;
      paramqal.c(58);
      if (localnph.ak < 0) {
        localnph.ak = localnph.a();
      }
      paramqal.c(localnph.ak);
      localnph.a(paramqal);
    }
    if (this.h != null)
    {
      okj localokj = this.h;
      paramqal.c(74);
      if (localokj.ak < 0) {
        localokj.ak = localokj.a();
      }
      paramqal.c(localokj.ak);
      localokj.a(paramqal);
    }
    if (this.d != null)
    {
      okn localokn1 = this.d;
      paramqal.c(82);
      if (localokn1.ak < 0) {
        localokn1.ak = localokn1.a();
      }
      paramqal.c(localokn1.ak);
      localokn1.a(paramqal);
    }
    if (this.e != null)
    {
      int m = this.e.length;
      int n = 0;
      if (m > 0) {
        while (n < this.e.length)
        {
          opo localopo = this.e[n];
          if (localopo != null)
          {
            paramqal.c(90);
            if (localopo.ak < 0) {
              localopo.ak = localopo.a();
            }
            paramqal.c(localopo.ak);
            localopo.a(paramqal);
          }
          n++;
        }
      }
    }
    if (this.k != null)
    {
      ojv localojv = this.k;
      paramqal.c(98);
      if (localojv.ak < 0) {
        localojv.ak = localojv.a();
      }
      paramqal.c(localojv.ak);
      localojv.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npa
 * JD-Core Version:    0.7.0.1
 */