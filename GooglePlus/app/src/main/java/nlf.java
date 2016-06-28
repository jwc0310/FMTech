public final class nlf
  extends qan<nlf>
{
  private nko a = null;
  
  public nlf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nko localnko = this.a;
      int j = qal.d(8);
      int k = localnko.a();
      localnko.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nko localnko = this.a;
      paramqal.c(10);
      if (localnko.ak < 0) {
        localnko.ak = localnko.a();
      }
      paramqal.c(localnko.ak);
      localnko.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nlf
 * JD-Core Version:    0.7.0.1
 */