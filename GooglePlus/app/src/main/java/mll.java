public final class mll
  extends qan<mll>
{
  private mlj[] a = mlj.b();
  
  public mll()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        mlj localmlj = this.a[j];
        if (localmlj != null)
        {
          int k = qal.d(8);
          int m = localmlj.a();
          localmlj.ak = m;
          i += k + (m + qal.d(m));
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        mlj localmlj = this.a[i];
        if (localmlj != null)
        {
          paramqal.c(10);
          if (localmlj.ak < 0) {
            localmlj.ak = localmlj.a();
          }
          paramqal.c(localmlj.ak);
          localmlj.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mll
 * JD-Core Version:    0.7.0.1
 */