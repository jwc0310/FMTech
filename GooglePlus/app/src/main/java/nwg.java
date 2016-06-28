public final class nwg
  extends qan<nwg>
{
  public nwf[] a = nwf.b();
  private nwm b = null;
  private nwm c = null;
  
  public nwg()
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
        nwf localnwf = this.a[i1];
        if (localnwf != null)
        {
          int i2 = qal.d(8);
          int i3 = localnwf.a();
          localnwf.ak = i3;
          i += i2 + (i3 + qal.d(i3));
        }
      }
    }
    if (this.b != null)
    {
      nwm localnwm2 = this.b;
      int m = qal.d(16);
      int n = localnwm2.a();
      localnwm2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      nwm localnwm1 = this.c;
      int j = qal.d(24);
      int k = localnwm1.a();
      localnwm1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        nwf localnwf = this.a[i];
        if (localnwf != null)
        {
          paramqal.c(10);
          if (localnwf.ak < 0) {
            localnwf.ak = localnwf.a();
          }
          paramqal.c(localnwf.ak);
          localnwf.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      nwm localnwm2 = this.b;
      paramqal.c(18);
      if (localnwm2.ak < 0) {
        localnwm2.ak = localnwm2.a();
      }
      paramqal.c(localnwm2.ak);
      localnwm2.a(paramqal);
    }
    if (this.c != null)
    {
      nwm localnwm1 = this.c;
      paramqal.c(26);
      if (localnwm1.ak < 0) {
        localnwm1.ak = localnwm1.a();
      }
      paramqal.c(localnwm1.ak);
      localnwm1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwg
 * JD-Core Version:    0.7.0.1
 */