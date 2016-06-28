public final class obz
  extends qan<obz>
{
  private static volatile obz[] c;
  public oce a = null;
  public obw b = null;
  private ocd d = null;
  private oby e = null;
  private occ f = null;
  
  public obz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static obz[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new obz[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oce localoce = this.a;
      int i5 = qal.d(8);
      int i6 = localoce.a();
      localoce.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.d != null)
    {
      ocd localocd = this.d;
      int i3 = qal.d(16);
      int i4 = localocd.a();
      localocd.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.e != null)
    {
      oby localoby = this.e;
      int i1 = qal.d(24);
      int i2 = localoby.a();
      localoby.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      obw localobw = this.b;
      int m = qal.d(32);
      int n = localobw.a();
      localobw.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.f != null)
    {
      occ localocc = this.f;
      int j = qal.d(40);
      int k = localocc.a();
      localocc.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oce localoce = this.a;
      paramqal.c(10);
      if (localoce.ak < 0) {
        localoce.ak = localoce.a();
      }
      paramqal.c(localoce.ak);
      localoce.a(paramqal);
    }
    if (this.d != null)
    {
      ocd localocd = this.d;
      paramqal.c(18);
      if (localocd.ak < 0) {
        localocd.ak = localocd.a();
      }
      paramqal.c(localocd.ak);
      localocd.a(paramqal);
    }
    if (this.e != null)
    {
      oby localoby = this.e;
      paramqal.c(26);
      if (localoby.ak < 0) {
        localoby.ak = localoby.a();
      }
      paramqal.c(localoby.ak);
      localoby.a(paramqal);
    }
    if (this.b != null)
    {
      obw localobw = this.b;
      paramqal.c(34);
      if (localobw.ak < 0) {
        localobw.ak = localobw.a();
      }
      paramqal.c(localobw.ak);
      localobw.a(paramqal);
    }
    if (this.f != null)
    {
      occ localocc = this.f;
      paramqal.c(42);
      if (localocc.ak < 0) {
        localocc.ak = localocc.a();
      }
      paramqal.c(localocc.ak);
      localocc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     obz
 * JD-Core Version:    0.7.0.1
 */