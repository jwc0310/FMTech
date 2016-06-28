public final class ngf
  extends qan<ngf>
{
  public String a = null;
  public ngj b = null;
  
  public ngf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    String str = this.a;
    int j = qal.d(8);
    int k = qal.a(str);
    int m = i + (j + (k + qal.d(k)));
    if (this.b != null)
    {
      ngj localngj = this.b;
      int n = qal.d(16);
      int i1 = localngj.a();
      localngj.ak = i1;
      m += n + (i1 + qal.d(i1));
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    String str = this.a;
    paramqal.c(10);
    paramqal.a(str);
    if (this.b != null)
    {
      ngj localngj = this.b;
      paramqal.c(18);
      if (localngj.ak < 0) {
        localngj.ak = localngj.a();
      }
      paramqal.c(localngj.ak);
      localngj.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ngf
 * JD-Core Version:    0.7.0.1
 */