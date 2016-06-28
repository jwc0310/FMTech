public final class noq
  extends qan<noq>
{
  private mle a = null;
  
  public noq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mle localmle = this.a;
      int j = qal.d(8);
      int k = localmle.a();
      localmle.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mle localmle = this.a;
      paramqal.c(10);
      if (localmle.ak < 0) {
        localmle.ak = localmle.a();
      }
      paramqal.c(localmle.ak);
      localmle.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     noq
 * JD-Core Version:    0.7.0.1
 */