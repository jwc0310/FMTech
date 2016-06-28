public final class nvy
  extends qan<nvy>
{
  public nwm a = null;
  public nvx[] b = nvx.b();
  
  public nvy()
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
        nvx localnvx = this.b[k];
        if (localnvx != null)
        {
          int m = qal.d(16);
          int n = localnvx.a();
          localnvx.ak = n;
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
        nvx localnvx = this.b[i];
        if (localnvx != null)
        {
          paramqal.c(18);
          if (localnvx.ak < 0) {
            localnvx.ak = localnvx.a();
          }
          paramqal.c(localnvx.ak);
          localnvx.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nvy
 * JD-Core Version:    0.7.0.1
 */