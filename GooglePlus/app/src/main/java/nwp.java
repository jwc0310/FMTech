public final class nwp
  extends qan<nwp>
{
  public String a = null;
  private nwm b = null;
  
  public nwp()
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
      int m = qal.d(8);
      int n = localnwm.a();
      localnwm.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      String str = this.a;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
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
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwp
 * JD-Core Version:    0.7.0.1
 */