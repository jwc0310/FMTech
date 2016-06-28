public final class nwh
  extends qan<nwh>
{
  public nwi[] a = nwi.b();
  private nwm b = null;
  
  public nwh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      nwm localnwm = this.b;
      int i1 = qal.d(8);
      int i2 = localnwm.a();
      localnwm.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.a != null) && (this.a.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.a.length; k++)
      {
        nwi localnwi = this.a[k];
        if (localnwi != null)
        {
          int m = qal.d(16);
          int n = localnwi.a();
          localnwi.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      nwm localnwm = this.b;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        nwi localnwi = this.a[i];
        if (localnwi != null)
        {
          paramqal.c(18);
          if (localnwi.ak < 0) {
            localnwi.ak = localnwi.a();
          }
          paramqal.c(localnwi.ak);
          localnwi.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwh
 * JD-Core Version:    0.7.0.1
 */