public final class mpn
  extends qan<mpn>
{
  private String[] a = qay.f;
  private mpm b = null;
  
  public mpn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i1;
    int i2;
    if ((this.a != null) && (this.a.length > 0))
    {
      i1 = 0;
      i2 = 0;
      while (i < this.a.length)
      {
        String str = this.a[i];
        if (str != null)
        {
          i2++;
          int i3 = qal.a(str);
          i1 += i3 + qal.d(i3);
        }
        i++;
      }
    }
    for (int k = j + i1 + i2 * 1;; k = j)
    {
      if (this.b != null)
      {
        mpm localmpm = this.b;
        int m = qal.d(16);
        int n = localmpm.a();
        localmpm.ak = n;
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        String str = this.a[i];
        if (str != null)
        {
          paramqal.c(10);
          paramqal.a(str);
        }
      }
    }
    if (this.b != null)
    {
      mpm localmpm = this.b;
      paramqal.c(18);
      if (localmpm.ak < 0) {
        localmpm.ak = localmpm.a();
      }
      paramqal.c(localmpm.ak);
      localmpm.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpn
 * JD-Core Version:    0.7.0.1
 */