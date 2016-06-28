public final class okl
  extends qan<okl>
{
  public static final qao<okn, okl> a = new qao(11, okl.class, (int)339005026L, false);
  public oif b = null;
  public ojv[] c = ojv.b();
  public okj d = null;
  public oie e = null;
  public oil f = null;
  private ojv g = null;
  private psl h = null;
  
  public okl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      oif localoif = this.b;
      int i11 = qal.d(8);
      int i12 = localoif.a();
      localoif.ak = i12;
      i += i11 + (i12 + qal.d(i12));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i7 = i;
      for (int i8 = 0; i8 < this.c.length; i8++)
      {
        ojv localojv2 = this.c[i8];
        if (localojv2 != null)
        {
          int i9 = qal.d(16);
          int i10 = localojv2.a();
          localojv2.ak = i10;
          i7 += i9 + (i10 + qal.d(i10));
        }
      }
      i = i7;
    }
    if (this.d != null)
    {
      okj localokj = this.d;
      int i5 = qal.d(24);
      int i6 = localokj.a();
      localokj.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.e != null)
    {
      oie localoie = this.e;
      int i3 = qal.d(32);
      int i4 = localoie.a();
      localoie.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.f != null)
    {
      oil localoil = this.f;
      int i1 = qal.d(40);
      int i2 = localoil.a();
      localoil.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.h != null)
    {
      psl localpsl = this.h;
      int m = qal.d(48);
      int n = localpsl.a();
      localpsl.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.g != null)
    {
      ojv localojv1 = this.g;
      int j = qal.d(56);
      int k = localojv1.a();
      localojv1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      oif localoif = this.b;
      paramqal.c(10);
      if (localoif.ak < 0) {
        localoif.ak = localoif.a();
      }
      paramqal.c(localoif.ak);
      localoif.a(paramqal);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        ojv localojv2 = this.c[i];
        if (localojv2 != null)
        {
          paramqal.c(18);
          if (localojv2.ak < 0) {
            localojv2.ak = localojv2.a();
          }
          paramqal.c(localojv2.ak);
          localojv2.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      okj localokj = this.d;
      paramqal.c(26);
      if (localokj.ak < 0) {
        localokj.ak = localokj.a();
      }
      paramqal.c(localokj.ak);
      localokj.a(paramqal);
    }
    if (this.e != null)
    {
      oie localoie = this.e;
      paramqal.c(34);
      if (localoie.ak < 0) {
        localoie.ak = localoie.a();
      }
      paramqal.c(localoie.ak);
      localoie.a(paramqal);
    }
    if (this.f != null)
    {
      oil localoil = this.f;
      paramqal.c(42);
      if (localoil.ak < 0) {
        localoil.ak = localoil.a();
      }
      paramqal.c(localoil.ak);
      localoil.a(paramqal);
    }
    if (this.h != null)
    {
      psl localpsl = this.h;
      paramqal.c(50);
      if (localpsl.ak < 0) {
        localpsl.ak = localpsl.a();
      }
      paramqal.c(localpsl.ak);
      localpsl.a(paramqal);
    }
    if (this.g != null)
    {
      ojv localojv1 = this.g;
      paramqal.c(58);
      if (localojv1.ak < 0) {
        localojv1.ak = localojv1.a();
      }
      paramqal.c(localojv1.ak);
      localojv1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     okl
 * JD-Core Version:    0.7.0.1
 */