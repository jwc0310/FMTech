public final class nrv
  extends qan<nrv>
{
  public nqz[] a = nqz.b();
  public npy b = null;
  private npy[] c = npy.b();
  private plv d = null;
  
  public nrv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.a.length; i6++)
      {
        nqz localnqz = this.a[i6];
        if (localnqz != null)
        {
          int i7 = qal.d(8);
          int i8 = localnqz.a();
          localnqz.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if (this.b != null)
    {
      npy localnpy2 = this.b;
      int i3 = qal.d(16);
      int i4 = localnpy2.a();
      localnpy2.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      int m = this.c.length;
      int n = 0;
      if (m > 0) {
        while (n < this.c.length)
        {
          npy localnpy1 = this.c[n];
          if (localnpy1 != null)
          {
            int i1 = qal.d(24);
            int i2 = localnpy1.a();
            localnpy1.ak = i2;
            i += i1 + (i2 + qal.d(i2));
          }
          n++;
        }
      }
    }
    if (this.d != null)
    {
      plv localplv = this.d;
      int j = qal.d(32);
      int k = localplv.a();
      localplv.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        nqz localnqz = this.a[k];
        if (localnqz != null)
        {
          paramqal.c(10);
          if (localnqz.ak < 0) {
            localnqz.ak = localnqz.a();
          }
          paramqal.c(localnqz.ak);
          localnqz.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      npy localnpy2 = this.b;
      paramqal.c(18);
      if (localnpy2.ak < 0) {
        localnpy2.ak = localnpy2.a();
      }
      paramqal.c(localnpy2.ak);
      localnpy2.a(paramqal);
    }
    if (this.c != null)
    {
      int i = this.c.length;
      int j = 0;
      if (i > 0) {
        while (j < this.c.length)
        {
          npy localnpy1 = this.c[j];
          if (localnpy1 != null)
          {
            paramqal.c(26);
            if (localnpy1.ak < 0) {
              localnpy1.ak = localnpy1.a();
            }
            paramqal.c(localnpy1.ak);
            localnpy1.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.d != null)
    {
      plv localplv = this.d;
      paramqal.c(34);
      if (localplv.ak < 0) {
        localplv.ak = localplv.a();
      }
      paramqal.c(localplv.ak);
      localplv.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrv
 * JD-Core Version:    0.7.0.1
 */