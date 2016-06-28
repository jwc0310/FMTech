public final class ngl
  extends qan<ngl>
{
  public mip[] a = mip.b();
  
  public ngl()
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
        mip localmip = this.a[j];
        if (localmip != null)
        {
          int k = qal.d(8);
          int m = localmip.a();
          localmip.ak = m;
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
        mip localmip = this.a[i];
        if (localmip != null)
        {
          paramqal.c(10);
          if (localmip.ak < 0) {
            localmip.ak = localmip.a();
          }
          paramqal.c(localmip.ak);
          localmip.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ngl
 * JD-Core Version:    0.7.0.1
 */