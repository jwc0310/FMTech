public final class mmb
  extends qan<mmb>
{
  public static final qao<mke, mmb> a = new qao(11, mmb.class, (int)571713034L, false);
  public mmc b = null;
  private pna c = null;
  private pwy d = null;
  private pwy e = null;
  private mmi f = null;
  private mme[] g = mme.b();
  private mmd h = null;
  private mmd[] i = mmd.b();
  private mmg j = null;
  
  public mmb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = super.a();
    if (this.f != null)
    {
      mmi localmmi = this.f;
      int i19 = qal.d(8);
      int i20 = localmmi.a();
      localmmi.ak = i20;
      k += i19 + (i20 + qal.d(i20));
    }
    if ((this.g != null) && (this.g.length > 0))
    {
      int i15 = k;
      for (int i16 = 0; i16 < this.g.length; i16++)
      {
        mme localmme = this.g[i16];
        if (localmme != null)
        {
          int i17 = qal.d(16);
          int i18 = localmme.a();
          localmme.ak = i18;
          i15 += i17 + (i18 + qal.d(i18));
        }
      }
      k = i15;
    }
    if (this.h != null)
    {
      mmd localmmd2 = this.h;
      int i13 = qal.d(24);
      int i14 = localmmd2.a();
      localmmd2.ak = i14;
      k += i13 + (i14 + qal.d(i14));
    }
    if (this.i != null)
    {
      int i9 = this.i.length;
      int i10 = 0;
      if (i9 > 0) {
        while (i10 < this.i.length)
        {
          mmd localmmd1 = this.i[i10];
          if (localmmd1 != null)
          {
            int i11 = qal.d(32);
            int i12 = localmmd1.a();
            localmmd1.ak = i12;
            k += i11 + (i12 + qal.d(i12));
          }
          i10++;
        }
      }
    }
    if (this.j != null)
    {
      mmg localmmg = this.j;
      int i7 = qal.d(40);
      int i8 = localmmg.a();
      localmmg.ak = i8;
      k += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      mmc localmmc = this.b;
      int i5 = qal.d(48);
      int i6 = localmmc.a();
      localmmc.ak = i6;
      k += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      pna localpna = this.c;
      int i3 = qal.d(56);
      int i4 = localpna.a();
      localpna.ak = i4;
      k += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      pwy localpwy2 = this.d;
      int i1 = qal.d(64);
      int i2 = localpwy2.a();
      localpwy2.ak = i2;
      k += i1 + (i2 + qal.d(i2));
    }
    if (this.e != null)
    {
      pwy localpwy1 = this.e;
      int m = qal.d(72);
      int n = localpwy1.a();
      localpwy1.ak = n;
      k += m + (n + qal.d(n));
    }
    return k;
  }
  
  public final void a(qal paramqal)
  {
    if (this.f != null)
    {
      mmi localmmi = this.f;
      paramqal.c(10);
      if (localmmi.ak < 0) {
        localmmi.ak = localmmi.a();
      }
      paramqal.c(localmmi.ak);
      localmmi.a(paramqal);
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int n = 0; n < this.g.length; n++)
      {
        mme localmme = this.g[n];
        if (localmme != null)
        {
          paramqal.c(18);
          if (localmme.ak < 0) {
            localmme.ak = localmme.a();
          }
          paramqal.c(localmme.ak);
          localmme.a(paramqal);
        }
      }
    }
    if (this.h != null)
    {
      mmd localmmd2 = this.h;
      paramqal.c(26);
      if (localmmd2.ak < 0) {
        localmmd2.ak = localmmd2.a();
      }
      paramqal.c(localmmd2.ak);
      localmmd2.a(paramqal);
    }
    if (this.i != null)
    {
      int k = this.i.length;
      int m = 0;
      if (k > 0) {
        while (m < this.i.length)
        {
          mmd localmmd1 = this.i[m];
          if (localmmd1 != null)
          {
            paramqal.c(34);
            if (localmmd1.ak < 0) {
              localmmd1.ak = localmmd1.a();
            }
            paramqal.c(localmmd1.ak);
            localmmd1.a(paramqal);
          }
          m++;
        }
      }
    }
    if (this.j != null)
    {
      mmg localmmg = this.j;
      paramqal.c(42);
      if (localmmg.ak < 0) {
        localmmg.ak = localmmg.a();
      }
      paramqal.c(localmmg.ak);
      localmmg.a(paramqal);
    }
    if (this.b != null)
    {
      mmc localmmc = this.b;
      paramqal.c(50);
      if (localmmc.ak < 0) {
        localmmc.ak = localmmc.a();
      }
      paramqal.c(localmmc.ak);
      localmmc.a(paramqal);
    }
    if (this.c != null)
    {
      pna localpna = this.c;
      paramqal.c(58);
      if (localpna.ak < 0) {
        localpna.ak = localpna.a();
      }
      paramqal.c(localpna.ak);
      localpna.a(paramqal);
    }
    if (this.d != null)
    {
      pwy localpwy2 = this.d;
      paramqal.c(66);
      if (localpwy2.ak < 0) {
        localpwy2.ak = localpwy2.a();
      }
      paramqal.c(localpwy2.ak);
      localpwy2.a(paramqal);
    }
    if (this.e != null)
    {
      pwy localpwy1 = this.e;
      paramqal.c(74);
      if (localpwy1.ak < 0) {
        localpwy1.ak = localpwy1.a();
      }
      paramqal.c(localpwy1.ak);
      localpwy1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmb
 * JD-Core Version:    0.7.0.1
 */