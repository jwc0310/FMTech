public final class mpp
  extends qan<mpp>
{
  private mpq a = null;
  private mps b = null;
  private String c = null;
  private String d = null;
  
  public mpp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mpq localmpq = this.a;
      int i3 = qal.d(8);
      int i4 = localmpq.a();
      localmpq.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      mps localmps = this.b;
      int i1 = qal.d(16);
      int i2 = localmps.a();
      localmps.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int m = qal.d(24);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int j = qal.d(32);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mpq localmpq = this.a;
      paramqal.c(10);
      if (localmpq.ak < 0) {
        localmpq.ak = localmpq.a();
      }
      paramqal.c(localmpq.ak);
      localmpq.a(paramqal);
    }
    if (this.b != null)
    {
      mps localmps = this.b;
      paramqal.c(18);
      if (localmps.ak < 0) {
        localmps.ak = localmps.a();
      }
      paramqal.c(localmps.ak);
      localmps.a(paramqal);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(34);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpp
 * JD-Core Version:    0.7.0.1
 */