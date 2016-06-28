public final class ohv
  extends qan<ohv>
{
  public opo a = null;
  private oqw b = null;
  
  public ohv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      opo localopo = this.a;
      int m = qal.d(8);
      int n = localopo.a();
      localopo.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      oqw localoqw = this.b;
      int j = qal.d(16);
      int k = localoqw.a();
      localoqw.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      opo localopo = this.a;
      paramqal.c(10);
      if (localopo.ak < 0) {
        localopo.ak = localopo.a();
      }
      paramqal.c(localopo.ak);
      localopo.a(paramqal);
    }
    if (this.b != null)
    {
      oqw localoqw = this.b;
      paramqal.c(18);
      if (localoqw.ak < 0) {
        localoqw.ak = localoqw.a();
      }
      paramqal.c(localoqw.ak);
      localoqw.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohv
 * JD-Core Version:    0.7.0.1
 */