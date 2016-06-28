public final class ofl
  extends qan<ofl>
{
  public odl[] a = odl.b();
  public oed b = null;
  private odt c = null;
  
  public ofl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i1 = 0; i1 < this.a.length; i1++)
      {
        odl localodl = this.a[i1];
        if (localodl != null)
        {
          int i2 = qal.d(8);
          int i3 = localodl.a();
          localodl.ak = i3;
          i += i2 + (i3 + qal.d(i3));
        }
      }
    }
    if (this.b != null)
    {
      oed localoed = this.b;
      int m = qal.d(16);
      int n = localoed.a();
      localoed.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      odt localodt = this.c;
      int j = qal.d(24);
      int k = localodt.a();
      localodt.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        odl localodl = this.a[i];
        if (localodl != null)
        {
          paramqal.c(10);
          if (localodl.ak < 0) {
            localodl.ak = localodl.a();
          }
          paramqal.c(localodl.ak);
          localodl.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      oed localoed = this.b;
      paramqal.c(18);
      if (localoed.ak < 0) {
        localoed.ak = localoed.a();
      }
      paramqal.c(localoed.ak);
      localoed.a(paramqal);
    }
    if (this.c != null)
    {
      odt localodt = this.c;
      paramqal.c(26);
      if (localodt.ak < 0) {
        localodt.ak = localodt.a();
      }
      paramqal.c(localodt.ak);
      localodt.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ofl
 * JD-Core Version:    0.7.0.1
 */