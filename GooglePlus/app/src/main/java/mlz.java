public final class mlz
  extends qan<mlz>
{
  private mmr a = null;
  
  public mlz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mmr localmmr = this.a;
      int j = qal.d(8);
      int k = localmmr.a();
      localmmr.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mmr localmmr = this.a;
      paramqal.c(10);
      if (localmmr.ak < 0) {
        localmmr.ak = localmmr.a();
      }
      paramqal.c(localmmr.ak);
      localmmr.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlz
 * JD-Core Version:    0.7.0.1
 */