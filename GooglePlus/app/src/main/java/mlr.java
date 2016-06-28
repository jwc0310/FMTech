public final class mlr
  extends qan<mlr>
{
  public static final qao<mke, mlr> a = new qao(11, mlr.class, (int)550467634L, false);
  public mlu[] b = mlu.b();
  public mlw[] c = mlw.b();
  public mlx d = null;
  private mly e = null;
  private mls f = null;
  private mlv[] g = mlv.b();
  private mlt h = null;
  
  public mlr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.e != null)
    {
      mly localmly = this.e;
      int i15 = qal.d(8);
      int i16 = localmly.a();
      localmly.ak = i16;
      i += i15 + (i16 + qal.d(i16));
    }
    if (this.f != null)
    {
      mls localmls = this.f;
      int i13 = qal.d(16);
      int i14 = localmls.a();
      localmls.ak = i14;
      i += i13 + (i14 + qal.d(i14));
    }
    if ((this.g != null) && (this.g.length > 0))
    {
      int i9 = i;
      for (int i10 = 0; i10 < this.g.length; i10++)
      {
        mlv localmlv = this.g[i10];
        if (localmlv != null)
        {
          int i11 = qal.d(24);
          int i12 = localmlv.a();
          localmlv.ak = i12;
          i9 += i11 + (i12 + qal.d(i12));
        }
      }
      i = i9;
    }
    if (this.h != null)
    {
      mlt localmlt = this.h;
      int i7 = qal.d(32);
      int i8 = localmlt.a();
      localmlt.ak = i8;
      i += i7 + (i8 + qal.d(i8));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i3 = i;
      for (int i4 = 0; i4 < this.b.length; i4++)
      {
        mlu localmlu = this.b[i4];
        if (localmlu != null)
        {
          int i5 = qal.d(40);
          int i6 = localmlu.a();
          localmlu.ak = i6;
          i3 += i5 + (i6 + qal.d(i6));
        }
      }
      i = i3;
    }
    if (this.c != null)
    {
      int m = this.c.length;
      int n = 0;
      if (m > 0) {
        while (n < this.c.length)
        {
          mlw localmlw = this.c[n];
          if (localmlw != null)
          {
            int i1 = qal.d(48);
            int i2 = localmlw.a();
            localmlw.ak = i2;
            i += i1 + (i2 + qal.d(i2));
          }
          n++;
        }
      }
    }
    if (this.d != null)
    {
      mlx localmlx = this.d;
      int j = qal.d(56);
      int k = localmlx.a();
      localmlx.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.e != null)
    {
      mly localmly = this.e;
      paramqal.c(10);
      if (localmly.ak < 0) {
        localmly.ak = localmly.a();
      }
      paramqal.c(localmly.ak);
      localmly.a(paramqal);
    }
    if (this.f != null)
    {
      mls localmls = this.f;
      paramqal.c(18);
      if (localmls.ak < 0) {
        localmls.ak = localmls.a();
      }
      paramqal.c(localmls.ak);
      localmls.a(paramqal);
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int m = 0; m < this.g.length; m++)
      {
        mlv localmlv = this.g[m];
        if (localmlv != null)
        {
          paramqal.c(26);
          if (localmlv.ak < 0) {
            localmlv.ak = localmlv.a();
          }
          paramqal.c(localmlv.ak);
          localmlv.a(paramqal);
        }
      }
    }
    if (this.h != null)
    {
      mlt localmlt = this.h;
      paramqal.c(34);
      if (localmlt.ak < 0) {
        localmlt.ak = localmlt.a();
      }
      paramqal.c(localmlt.ak);
      localmlt.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        mlu localmlu = this.b[k];
        if (localmlu != null)
        {
          paramqal.c(42);
          if (localmlu.ak < 0) {
            localmlu.ak = localmlu.a();
          }
          paramqal.c(localmlu.ak);
          localmlu.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      int i = this.c.length;
      int j = 0;
      if (i > 0) {
        while (j < this.c.length)
        {
          mlw localmlw = this.c[j];
          if (localmlw != null)
          {
            paramqal.c(50);
            if (localmlw.ak < 0) {
              localmlw.ak = localmlw.a();
            }
            paramqal.c(localmlw.ak);
            localmlw.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.d != null)
    {
      mlx localmlx = this.d;
      paramqal.c(58);
      if (localmlx.ak < 0) {
        localmlx.ak = localmlx.a();
      }
      paramqal.c(localmlx.ak);
      localmlx.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlr
 * JD-Core Version:    0.7.0.1
 */