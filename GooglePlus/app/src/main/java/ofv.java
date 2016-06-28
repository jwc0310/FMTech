public final class ofv
  extends qan<ofv>
{
  public ogg a = null;
  private oga b = null;
  
  public ofv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ogg localogg = this.a;
      int m = qal.d(8);
      int n = localogg.a();
      localogg.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      oga localoga = this.b;
      int j = qal.d(16);
      int k = localoga.a();
      localoga.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ogg localogg = this.a;
      paramqal.c(10);
      if (localogg.ak < 0) {
        localogg.ak = localogg.a();
      }
      paramqal.c(localogg.ak);
      localogg.a(paramqal);
    }
    if (this.b != null)
    {
      oga localoga = this.b;
      paramqal.c(18);
      if (localoga.ak < 0) {
        localoga.ak = localoga.a();
      }
      paramqal.c(localoga.ak);
      localoga.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ofv
 * JD-Core Version:    0.7.0.1
 */