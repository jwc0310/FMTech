public final class mlk
  extends qan<mlk>
{
  public mlj a = null;
  
  public mlk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mlj localmlj = this.a;
      int j = qal.d(8);
      int k = localmlj.a();
      localmlj.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mlj localmlj = this.a;
      paramqal.c(10);
      if (localmlj.ak < 0) {
        localmlj.ak = localmlj.a();
      }
      paramqal.c(localmlj.ak);
      localmlj.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlk
 * JD-Core Version:    0.7.0.1
 */