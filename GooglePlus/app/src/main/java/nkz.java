public final class nkz
  extends qan<nkz>
{
  private static volatile nkz[] a;
  private Integer b = null;
  private Integer c = null;
  private long[] d = qay.b;
  private njx[] e = njx.b();
  private njy[] f = njy.b();
  private nlm g = null;
  private int[] h = qay.a;
  private nlg[] i = nlg.b();
  private String j = null;
  private nlr k = null;
  
  public nkz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nkz[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nkz[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int m = super.a();
    int i29;
    int i30;
    if (this.b != null)
    {
      int i28 = this.b.intValue();
      i29 = qal.d(8);
      if (i28 >= 0) {
        i30 = qal.d(i28);
      }
    }
    for (int n = m + (i30 + i29);; n = m)
    {
      int i25;
      int i26;
      if (this.c != null)
      {
        i25 = this.c.intValue();
        i26 = qal.d(16);
        if (i25 < 0) {
          break label150;
        }
      }
      int i24;
      label150:
      for (int i27 = qal.d(i25);; i27 = 10)
      {
        n += i27 + i26;
        if ((this.d == null) || (this.d.length <= 0)) {
          break label170;
        }
        int i23 = 0;
        i24 = 0;
        while (i23 < this.d.length)
        {
          i24 += qal.b(this.d[i23]);
          i23++;
        }
        i30 = 10;
        break;
      }
      n = n + i24 + 1 * this.d.length;
      label170:
      if ((this.e != null) && (this.e.length > 0))
      {
        int i19 = n;
        for (int i20 = 0; i20 < this.e.length; i20++)
        {
          njx localnjx = this.e[i20];
          if (localnjx != null)
          {
            int i21 = qal.d(32);
            int i22 = localnjx.a();
            localnjx.ak = i22;
            i19 += i21 + (i22 + qal.d(i22));
          }
        }
        n = i19;
      }
      if ((this.f != null) && (this.f.length > 0))
      {
        int i15 = n;
        for (int i16 = 0; i16 < this.f.length; i16++)
        {
          njy localnjy = this.f[i16];
          if (localnjy != null)
          {
            int i17 = qal.d(40);
            int i18 = localnjy.a();
            localnjy.ak = i18;
            i15 += i17 + (i18 + qal.d(i18));
          }
        }
        n = i15;
      }
      if (this.g != null)
      {
        nlm localnlm = this.g;
        int i13 = qal.d(48);
        int i14 = localnlm.a();
        localnlm.ak = i14;
        n += i13 + (i14 + qal.d(i14));
      }
      if ((this.h != null) && (this.h.length > 0))
      {
        int i9 = 0;
        int i10 = 0;
        if (i9 < this.h.length)
        {
          int i11 = this.h[i9];
          if (i11 >= 0) {}
          for (int i12 = qal.d(i11);; i12 = 10)
          {
            i10 += i12;
            i9++;
            break;
          }
        }
        n = n + i10 + 1 * this.h.length;
      }
      if (this.i != null)
      {
        int i5 = this.i.length;
        int i6 = 0;
        if (i5 > 0) {
          while (i6 < this.i.length)
          {
            nlg localnlg = this.i[i6];
            if (localnlg != null)
            {
              int i7 = qal.d(72);
              int i8 = localnlg.a();
              localnlg.ak = i8;
              n += i7 + (i8 + qal.d(i8));
            }
            i6++;
          }
        }
      }
      if (this.j != null)
      {
        String str = this.j;
        int i3 = qal.d(80);
        int i4 = qal.a(str);
        n += i3 + (i4 + qal.d(i4));
      }
      if (this.k != null)
      {
        nlr localnlr = this.k;
        int i1 = qal.d(88);
        int i2 = localnlr.a();
        localnlr.ak = i2;
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
        long l = this.d[i5];
        paramqal.c(24);
        paramqal.a(l);
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i4 = 0; i4 < this.e.length; i4++)
      {
        njx localnjx = this.e[i4];
        if (localnjx != null)
        {
          paramqal.c(34);
          if (localnjx.ak < 0) {
            localnjx.ak = localnjx.a();
          }
          paramqal.c(localnjx.ak);
          localnjx.a(paramqal);
        }
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i3 = 0; i3 < this.f.length; i3++)
      {
        njy localnjy = this.f[i3];
        if (localnjy != null)
        {
          paramqal.c(42);
          if (localnjy.ak < 0) {
            localnjy.ak = localnjy.a();
          }
          paramqal.c(localnjy.ak);
          localnjy.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      nlm localnlm = this.g;
      paramqal.c(50);
      if (localnlm.ak < 0) {
        localnlm.ak = localnlm.a();
      }
      paramqal.c(localnlm.ak);
      localnlm.a(paramqal);
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
      int m = this.i.length;
      int n = 0;
      if (m > 0) {
        while (n < this.i.length)
        {
          nlg localnlg = this.i[n];
          if (localnlg != null)
          {
            paramqal.c(74);
            if (localnlg.ak < 0) {
              localnlg.ak = localnlg.a();
            }
            paramqal.c(localnlg.ak);
            localnlg.a(paramqal);
          }
          n++;
        }
      }
    }
    if (this.j != null)
    {
      String str = this.j;
      paramqal.c(82);
      paramqal.a(str);
    }
    if (this.k != null)
    {
      nlr localnlr = this.k;
      paramqal.c(90);
      if (localnlr.ak < 0) {
        localnlr.ak = localnlr.a();
      }
      paramqal.c(localnlr.ak);
      localnlr.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nkz
 * JD-Core Version:    0.7.0.1
 */