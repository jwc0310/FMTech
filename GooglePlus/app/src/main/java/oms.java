public final class oms
  extends qan<oms>
{
  public omu[] a = omu.b();
  private omt[] b = omt.b();
  
  public oms()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.b.length; i2++)
      {
        omt localomt = this.b[i2];
        if (localomt != null)
        {
          int i3 = qal.d(8);
          int i4 = localomt.a();
          localomt.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.a != null)
    {
      int j = this.a.length;
      int k = 0;
      if (j > 0) {
        while (k < this.a.length)
        {
          omu localomu = this.a[k];
          if (localomu != null)
          {
            int m = qal.d(16);
            int n = localomu.a();
            localomu.ak = n;
            i += m + (n + qal.d(n));
          }
          k++;
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        omt localomt = this.b[k];
        if (localomt != null)
        {
          paramqal.c(10);
          if (localomt.ak < 0) {
            localomt.ak = localomt.a();
          }
          paramqal.c(localomt.ak);
          localomt.a(paramqal);
        }
      }
    }
    if (this.a != null)
    {
      int i = this.a.length;
      int j = 0;
      if (i > 0) {
        while (j < this.a.length)
        {
          omu localomu = this.a[j];
          if (localomu != null)
          {
            paramqal.c(18);
            if (localomu.ak < 0) {
              localomu.ak = localomu.a();
            }
            paramqal.c(localomu.ak);
            localomu.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oms
 * JD-Core Version:    0.7.0.1
 */