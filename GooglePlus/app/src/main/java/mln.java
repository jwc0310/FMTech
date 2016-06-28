public final class mln
  extends qan<mln>
{
  public mlm a = null;
  
  public mln()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mlm localmlm = this.a;
      int j = qal.d(8);
      int k = localmlm.a();
      localmlm.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mlm localmlm = this.a;
      paramqal.c(10);
      if (localmlm.ak < 0) {
        localmlm.ak = localmlm.a();
      }
      paramqal.c(localmlm.ak);
      localmlm.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mln
 * JD-Core Version:    0.7.0.1
 */