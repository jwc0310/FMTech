public final class npn
  extends qan<npn>
{
  public npf a = null;
  public oif b = null;
  
  public npn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      npf localnpf = this.a;
      int m = qal.d(8);
      int n = localnpf.a();
      localnpf.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      oif localoif = this.b;
      int j = qal.d(16);
      int k = localoif.a();
      localoif.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      npf localnpf = this.a;
      paramqal.c(10);
      if (localnpf.ak < 0) {
        localnpf.ak = localnpf.a();
      }
      paramqal.c(localnpf.ak);
      localnpf.a(paramqal);
    }
    if (this.b != null)
    {
      oif localoif = this.b;
      paramqal.c(18);
      if (localoif.ak < 0) {
        localoif.ak = localoif.a();
      }
      paramqal.c(localoif.ak);
      localoif.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npn
 * JD-Core Version:    0.7.0.1
 */