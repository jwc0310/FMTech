public final class ogb
  extends qan<ogb>
{
  public ofu a = null;
  public ofv b = null;
  public ogh c = null;
  private ofp d = null;
  
  public ogb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ofu localofu = this.a;
      int i3 = qal.d(8);
      int i4 = localofu.a();
      localofu.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      ofv localofv = this.b;
      int i1 = qal.d(16);
      int i2 = localofv.a();
      localofv.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      ogh localogh = this.c;
      int m = qal.d(24);
      int n = localogh.a();
      localogh.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      ofp localofp = this.d;
      int j = qal.d(32);
      int k = localofp.a();
      localofp.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ofu localofu = this.a;
      paramqal.c(10);
      if (localofu.ak < 0) {
        localofu.ak = localofu.a();
      }
      paramqal.c(localofu.ak);
      localofu.a(paramqal);
    }
    if (this.b != null)
    {
      ofv localofv = this.b;
      paramqal.c(18);
      if (localofv.ak < 0) {
        localofv.ak = localofv.a();
      }
      paramqal.c(localofv.ak);
      localofv.a(paramqal);
    }
    if (this.c != null)
    {
      ogh localogh = this.c;
      paramqal.c(26);
      if (localogh.ak < 0) {
        localogh.ak = localogh.a();
      }
      paramqal.c(localogh.ak);
      localogh.a(paramqal);
    }
    if (this.d != null)
    {
      ofp localofp = this.d;
      paramqal.c(34);
      if (localofp.ak < 0) {
        localofp.ak = localofp.a();
      }
      paramqal.c(localofp.ak);
      localofp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogb
 * JD-Core Version:    0.7.0.1
 */