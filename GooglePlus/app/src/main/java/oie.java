public final class oie
  extends qan<oie>
{
  public oig a = null;
  private ojv[] b = ojv.b();
  private oki[] c = oki.b();
  private ojv[] d = ojv.b();
  private oki[] e = oki.b();
  private String f = null;
  private pvn[] g = pvn.b();
  private psi[] h = psi.b();
  private pvf[] i = pvf.b();
  
  public oie()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    if ((this.b != null) && (this.b.length > 0))
    {
      int i26 = j;
      for (int i27 = 0; i27 < this.b.length; i27++)
      {
        ojv localojv2 = this.b[i27];
        if (localojv2 != null)
        {
          int i28 = qal.d(8);
          int i29 = localojv2.a();
          localojv2.ak = i29;
          i26 += i28 + (i29 + qal.d(i29));
        }
      }
      j = i26;
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i22 = j;
      for (int i23 = 0; i23 < this.d.length; i23++)
      {
        ojv localojv1 = this.d[i23];
        if (localojv1 != null)
        {
          int i24 = qal.d(16);
          int i25 = localojv1.a();
          localojv1.ak = i25;
          i22 += i24 + (i25 + qal.d(i25));
        }
      }
      j = i22;
    }
    if (this.a != null)
    {
      oig localoig = this.a;
      int i20 = qal.d(24);
      int i21 = localoig.a();
      localoig.ak = i21;
      j += i20 + (i21 + qal.d(i21));
    }
    if (this.f != null)
    {
      String str = this.f;
      int i18 = qal.d(32);
      int i19 = qal.a(str);
      j += i18 + (i19 + qal.d(i19));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i14 = j;
      for (int i15 = 0; i15 < this.c.length; i15++)
      {
        oki localoki2 = this.c[i15];
        if (localoki2 != null)
        {
          int i16 = qal.d(40);
          int i17 = localoki2.a();
          localoki2.ak = i17;
          i14 += i16 + (i17 + qal.d(i17));
        }
      }
      j = i14;
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i10 = j;
      for (int i11 = 0; i11 < this.e.length; i11++)
      {
        oki localoki1 = this.e[i11];
        if (localoki1 != null)
        {
          int i12 = qal.d(48);
          int i13 = localoki1.a();
          localoki1.ak = i13;
          i10 += i12 + (i13 + qal.d(i13));
        }
      }
      j = i10;
    }
    if ((this.g != null) && (this.g.length > 0))
    {
      int i6 = j;
      for (int i7 = 0; i7 < this.g.length; i7++)
      {
        pvn localpvn = this.g[i7];
        if (localpvn != null)
        {
          int i8 = qal.d(56);
          int i9 = localpvn.a();
          localpvn.ak = i9;
          i6 += i8 + (i9 + qal.d(i9));
        }
      }
      j = i6;
    }
    if ((this.h != null) && (this.h.length > 0))
    {
      int i2 = j;
      for (int i3 = 0; i3 < this.h.length; i3++)
      {
        psi localpsi = this.h[i3];
        if (localpsi != null)
        {
          int i4 = qal.d(64);
          int i5 = localpsi.a();
          localpsi.ak = i5;
          i2 += i4 + (i5 + qal.d(i5));
        }
      }
      j = i2;
    }
    if (this.i != null)
    {
      int k = this.i.length;
      int m = 0;
      if (k > 0) {
        while (m < this.i.length)
        {
          pvf localpvf = this.i[m];
          if (localpvf != null)
          {
            int n = qal.d(72);
            int i1 = localpvf.a();
            localpvf.ak = i1;
            j += n + (i1 + qal.d(i1));
          }
          m++;
        }
      }
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i4 = 0; i4 < this.b.length; i4++)
      {
        ojv localojv2 = this.b[i4];
        if (localojv2 != null)
        {
          paramqal.c(10);
          if (localojv2.ak < 0) {
            localojv2.ak = localojv2.a();
          }
          paramqal.c(localojv2.ak);
          localojv2.a(paramqal);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i3 = 0; i3 < this.d.length; i3++)
      {
        ojv localojv1 = this.d[i3];
        if (localojv1 != null)
        {
          paramqal.c(18);
          if (localojv1.ak < 0) {
            localojv1.ak = localojv1.a();
          }
          paramqal.c(localojv1.ak);
          localojv1.a(paramqal);
        }
      }
    }
    if (this.a != null)
    {
      oig localoig = this.a;
      paramqal.c(26);
      if (localoig.ak < 0) {
        localoig.ak = localoig.a();
      }
      paramqal.c(localoig.ak);
      localoig.a(paramqal);
    }
    if (this.f != null)
    {
      String str = this.f;
      paramqal.c(34);
      paramqal.a(str);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i2 = 0; i2 < this.c.length; i2++)
      {
        oki localoki2 = this.c[i2];
        if (localoki2 != null)
        {
          paramqal.c(42);
          if (localoki2.ak < 0) {
            localoki2.ak = localoki2.a();
          }
          paramqal.c(localoki2.ak);
          localoki2.a(paramqal);
        }
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i1 = 0; i1 < this.e.length; i1++)
      {
        oki localoki1 = this.e[i1];
        if (localoki1 != null)
        {
          paramqal.c(50);
          if (localoki1.ak < 0) {
            localoki1.ak = localoki1.a();
          }
          paramqal.c(localoki1.ak);
          localoki1.a(paramqal);
        }
      }
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int n = 0; n < this.g.length; n++)
      {
        pvn localpvn = this.g[n];
        if (localpvn != null)
        {
          paramqal.c(58);
          if (localpvn.ak < 0) {
            localpvn.ak = localpvn.a();
          }
          paramqal.c(localpvn.ak);
          localpvn.a(paramqal);
        }
      }
    }
    if ((this.h != null) && (this.h.length > 0)) {
      for (int m = 0; m < this.h.length; m++)
      {
        psi localpsi = this.h[m];
        if (localpsi != null)
        {
          paramqal.c(66);
          if (localpsi.ak < 0) {
            localpsi.ak = localpsi.a();
          }
          paramqal.c(localpsi.ak);
          localpsi.a(paramqal);
        }
      }
    }
    if (this.i != null)
    {
      int j = this.i.length;
      int k = 0;
      if (j > 0) {
        while (k < this.i.length)
        {
          pvf localpvf = this.i[k];
          if (localpvf != null)
          {
            paramqal.c(74);
            if (localpvf.ak < 0) {
              localpvf.ak = localpvf.a();
            }
            paramqal.c(localpvf.ak);
            localpvf.a(paramqal);
          }
          k++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oie
 * JD-Core Version:    0.7.0.1
 */