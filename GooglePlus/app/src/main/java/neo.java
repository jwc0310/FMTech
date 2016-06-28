public final class neo
  extends qan<neo>
{
  public ndt a = null;
  public nel b = null;
  
  static
  {
    new qao(11, neo.class, (int)433630874L, false);
  }
  
  public neo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ndt localndt = this.a;
      int m = qal.d(16);
      int n = localndt.a();
      localndt.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      nel localnel = this.b;
      int j = qal.d(24);
      int k = localnel.a();
      localnel.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ndt localndt = this.a;
      paramqal.c(18);
      if (localndt.ak < 0) {
        localndt.ak = localndt.a();
      }
      paramqal.c(localndt.ak);
      localndt.a(paramqal);
    }
    if (this.b != null)
    {
      nel localnel = this.b;
      paramqal.c(26);
      if (localnel.ak < 0) {
        localnel.ak = localnel.a();
      }
      paramqal.c(localnel.ak);
      localnel.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     neo
 * JD-Core Version:    0.7.0.1
 */