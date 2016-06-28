public final class okm
  extends qan<okm>
{
  public static final qao<okn, okm> a = new qao(11, okm.class, (int)337919202L, false);
  public ojf b = null;
  private pss c = null;
  
  public okm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      ojf localojf = this.b;
      int m = qal.d(8);
      int n = localojf.a();
      localojf.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      pss localpss = this.c;
      int j = qal.d(16);
      int k = localpss.a();
      localpss.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      ojf localojf = this.b;
      paramqal.c(10);
      if (localojf.ak < 0) {
        localojf.ak = localojf.a();
      }
      paramqal.c(localojf.ak);
      localojf.a(paramqal);
    }
    if (this.c != null)
    {
      pss localpss = this.c;
      paramqal.c(18);
      if (localpss.ak < 0) {
        localpss.ak = localpss.a();
      }
      paramqal.c(localpss.ak);
      localpss.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     okm
 * JD-Core Version:    0.7.0.1
 */