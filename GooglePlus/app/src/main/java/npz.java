public final class npz
  extends qan<npz>
{
  public nrv a = null;
  public nqx b = null;
  private pst c = null;
  
  public npz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nrv localnrv = this.a;
      int i1 = qal.d(8);
      int i2 = localnrv.a();
      localnrv.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      nqx localnqx = this.b;
      int m = qal.d(16);
      int n = localnqx.a();
      localnqx.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      pst localpst = this.c;
      int j = qal.d(24);
      int k = localpst.a();
      localpst.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nrv localnrv = this.a;
      paramqal.c(10);
      if (localnrv.ak < 0) {
        localnrv.ak = localnrv.a();
      }
      paramqal.c(localnrv.ak);
      localnrv.a(paramqal);
    }
    if (this.b != null)
    {
      nqx localnqx = this.b;
      paramqal.c(18);
      if (localnqx.ak < 0) {
        localnqx.ak = localnqx.a();
      }
      paramqal.c(localnqx.ak);
      localnqx.a(paramqal);
    }
    if (this.c != null)
    {
      pst localpst = this.c;
      paramqal.c(26);
      if (localpst.ak < 0) {
        localpst.ak = localpst.a();
      }
      paramqal.c(localpst.ak);
      localpst.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npz
 * JD-Core Version:    0.7.0.1
 */