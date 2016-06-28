public final class mhv
  extends qan<mhv>
{
  public mgn a = null;
  
  public mhv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mgn localmgn = this.a;
      int j = qal.d(8);
      int k = localmgn.a();
      localmgn.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mgn localmgn = this.a;
      paramqal.c(10);
      if (localmgn.ak < 0) {
        localmgn.ak = localmgn.a();
      }
      paramqal.c(localmgn.ak);
      localmgn.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mhv
 * JD-Core Version:    0.7.0.1
 */