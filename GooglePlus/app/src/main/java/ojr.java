public final class ojr
  extends qan<ojr>
{
  private String a = null;
  private ojs[] b = ojs.b();
  
  public ojr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i1 = qal.d(8);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        ojs localojs = this.b[k];
        if (localojs != null)
        {
          int m = qal.d(16);
          int n = localojs.a();
          localojs.ak = n;
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
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        ojs localojs = this.b[i];
        if (localojs != null)
        {
          paramqal.c(18);
          if (localojs.ak < 0) {
            localojs.ak = localojs.a();
          }
          paramqal.c(localojs.ak);
          localojs.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojr
 * JD-Core Version:    0.7.0.1
 */