public final class nws
  extends qan<nws>
{
  public nwm a = null;
  public nwr[] b = nwr.b();
  
  public nws()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nwm localnwm = this.a;
      int i1 = qal.d(8);
      int i2 = localnwm.a();
      localnwm.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        nwr localnwr = this.b[k];
        if (localnwr != null)
        {
          int m = qal.d(16);
          int n = localnwr.a();
          localnwr.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nwm localnwm = this.a;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        nwr localnwr = this.b[i];
        if (localnwr != null)
        {
          paramqal.c(18);
          if (localnwr.ak < 0) {
            localnwr.ak = localnwr.a();
          }
          paramqal.c(localnwr.ak);
          localnwr.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nws
 * JD-Core Version:    0.7.0.1
 */