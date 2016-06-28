public final class nfc
  extends qan<nfc>
{
  public ndt a = null;
  public mmw b = null;
  
  public nfc()
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
      mmw localmmw = this.b;
      int j = qal.d(16);
      int k = localmmw.a();
      localmmw.ak = k;
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
      mmw localmmw = this.b;
      paramqal.c(18);
      if (localmmw.ak < 0) {
        localmmw.ak = localmmw.a();
      }
      paramqal.c(localmmw.ak);
      localmmw.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nfc
 * JD-Core Version:    0.7.0.1
 */