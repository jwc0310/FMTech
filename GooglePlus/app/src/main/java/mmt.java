public final class mmt
  extends qan<mmt>
{
  private mms a = null;
  
  public mmt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mms localmms = this.a;
      int j = qal.d(8);
      int k = localmms.a();
      localmms.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mms localmms = this.a;
      paramqal.c(10);
      if (localmms.ak < 0) {
        localmms.ak = localmms.a();
      }
      paramqal.c(localmms.ak);
      localmms.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmt
 * JD-Core Version:    0.7.0.1
 */