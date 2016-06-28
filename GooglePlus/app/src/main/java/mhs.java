public final class mhs
  extends qan<mhs>
{
  public mhu a = null;
  public mid b = null;
  
  public mhs()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mhu localmhu = this.a;
      int m = qal.d(8);
      int n = localmhu.a();
      localmhu.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      mid localmid = this.b;
      int j = qal.d(16);
      int k = localmid.a();
      localmid.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mhu localmhu = this.a;
      paramqal.c(10);
      if (localmhu.ak < 0) {
        localmhu.ak = localmhu.a();
      }
      paramqal.c(localmhu.ak);
      localmhu.a(paramqal);
    }
    if (this.b != null)
    {
      mid localmid = this.b;
      paramqal.c(18);
      if (localmid.ak < 0) {
        localmid.ak = localmid.a();
      }
      paramqal.c(localmid.ak);
      localmid.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mhs
 * JD-Core Version:    0.7.0.1
 */