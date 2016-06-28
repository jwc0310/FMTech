public final class oft
  extends qan<oft>
{
  private ogc a = null;
  
  public oft()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ogc localogc = this.a;
      int j = qal.d(8);
      int k = localogc.a();
      localogc.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ogc localogc = this.a;
      paramqal.c(10);
      if (localogc.ak < 0) {
        localogc.ak = localogc.a();
      }
      paramqal.c(localogc.ak);
      localogc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oft
 * JD-Core Version:    0.7.0.1
 */