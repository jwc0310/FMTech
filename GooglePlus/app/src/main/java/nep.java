public final class nep
  extends qan<nep>
{
  public ndt a = null;
  public ney b = null;
  
  static
  {
    new qao(11, nep.class, (int)702012258L, false);
  }
  
  public nep()
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
      int m = qal.d(8);
      int n = localndt.a();
      localndt.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      ney localney = this.b;
      int j = qal.d(16);
      int k = localney.a();
      localney.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ndt localndt = this.a;
      paramqal.c(10);
      if (localndt.ak < 0) {
        localndt.ak = localndt.a();
      }
      paramqal.c(localndt.ak);
      localndt.a(paramqal);
    }
    if (this.b != null)
    {
      ney localney = this.b;
      paramqal.c(18);
      if (localney.ak < 0) {
        localney.ak = localney.a();
      }
      paramqal.c(localney.ak);
      localney.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nep
 * JD-Core Version:    0.7.0.1
 */