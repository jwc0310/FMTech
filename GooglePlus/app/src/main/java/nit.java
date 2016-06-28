public final class nit
  extends qan<nit>
{
  private niu[] a = niu.b();
  
  public nit()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        niu localniu = this.a[j];
        if (localniu != null)
        {
          int k = qal.d(8);
          int m = localniu.a();
          localniu.ak = m;
          i += k + (m + qal.d(m));
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        niu localniu = this.a[i];
        if (localniu != null)
        {
          paramqal.c(10);
          if (localniu.ak < 0) {
            localniu.ak = localniu.a();
          }
          paramqal.c(localniu.ak);
          localniu.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nit
 * JD-Core Version:    0.7.0.1
 */