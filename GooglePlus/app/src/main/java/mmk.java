public final class mmk
  extends qan<mmk>
{
  public mml a = null;
  
  public mmk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mml localmml = this.a;
      int j = qal.d(8);
      int k = localmml.a();
      localmml.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mml localmml = this.a;
      paramqal.c(10);
      if (localmml.ak < 0) {
        localmml.ak = localmml.a();
      }
      paramqal.c(localmml.ak);
      localmml.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmk
 * JD-Core Version:    0.7.0.1
 */