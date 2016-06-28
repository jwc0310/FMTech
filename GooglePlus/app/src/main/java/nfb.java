public final class nfb
  extends qan<nfb>
{
  public String[] a = qay.f;
  
  static
  {
    new qao(11, nfb.class, (int)689057210L, false);
  }
  
  public nfb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.a.length)
      {
        String str = this.a[i];
        if (str != null)
        {
          m++;
          int n = qal.a(str);
          k += n + qal.d(n);
        }
        i++;
      }
      return j + k + m * 1;
    }
    return j;
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nfb
 * JD-Core Version:    0.7.0.1
 */