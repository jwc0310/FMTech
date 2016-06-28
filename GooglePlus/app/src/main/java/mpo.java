public final class mpo
  extends qan<mpo>
{
  private mpp a = null;
  
  public mpo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mpp localmpp = this.a;
      int j = qal.d(8);
      int k = localmpp.a();
      localmpp.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mpp localmpp = this.a;
      paramqal.c(10);
      if (localmpp.ak < 0) {
        localmpp.ak = localmpp.a();
      }
      paramqal.c(localmpp.ak);
      localmpp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpo
 * JD-Core Version:    0.7.0.1
 */