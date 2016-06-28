public final class nxc
  extends qan<nxc>
{
  public nwm a = null;
  public nxb[] b = nxb.b();
  
  public nxc()
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
        nxb localnxb = this.b[k];
        if (localnxb != null)
        {
          int m = qal.d(16);
          int n = localnxb.a();
          localnxb.ak = n;
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
        nxb localnxb = this.b[i];
        if (localnxb != null)
        {
          paramqal.c(18);
          if (localnxb.ak < 0) {
            localnxb.ak = localnxb.a();
          }
          paramqal.c(localnxb.ak);
          localnxb.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxc
 * JD-Core Version:    0.7.0.1
 */