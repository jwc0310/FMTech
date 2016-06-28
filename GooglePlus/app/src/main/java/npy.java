public final class npy
  extends qan<npy>
{
  private static volatile npy[] b;
  public nrs a = null;
  private nqt[] c = nqt.b();
  private nqj d = null;
  
  public npy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static npy[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new npy[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i1 = 0; i1 < this.c.length; i1++)
      {
        nqt localnqt = this.c[i1];
        if (localnqt != null)
        {
          int i2 = qal.d(8);
          int i3 = localnqt.a();
          localnqt.ak = i3;
          i += i2 + (i3 + qal.d(i3));
        }
      }
    }
    if (this.a != null)
    {
      nrs localnrs = this.a;
      int m = qal.d(16);
      int n = localnrs.a();
      localnrs.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      nqj localnqj = this.d;
      int j = qal.d(24);
      int k = localnqj.a();
      localnqj.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        nqt localnqt = this.c[i];
        if (localnqt != null)
        {
          paramqal.c(10);
          if (localnqt.ak < 0) {
            localnqt.ak = localnqt.a();
          }
          paramqal.c(localnqt.ak);
          localnqt.a(paramqal);
        }
      }
    }
    if (this.a != null)
    {
      nrs localnrs = this.a;
      paramqal.c(18);
      if (localnrs.ak < 0) {
        localnrs.ak = localnrs.a();
      }
      paramqal.c(localnrs.ak);
      localnrs.a(paramqal);
    }
    if (this.d != null)
    {
      nqj localnqj = this.d;
      paramqal.c(26);
      if (localnqj.ak < 0) {
        localnqj.ak = localnqj.a();
      }
      paramqal.c(localnqj.ak);
      localnqj.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npy
 * JD-Core Version:    0.7.0.1
 */