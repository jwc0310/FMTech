public final class npf
  extends qan<npf>
{
  public npg a = null;
  
  public npf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      npg localnpg = this.a;
      int j = qal.d(8);
      int k = localnpg.a();
      localnpg.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      npg localnpg = this.a;
      paramqal.c(10);
      if (localnpg.ak < 0) {
        localnpg.ak = localnpg.a();
      }
      paramqal.c(localnpg.ak);
      localnpg.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npf
 * JD-Core Version:    0.7.0.1
 */