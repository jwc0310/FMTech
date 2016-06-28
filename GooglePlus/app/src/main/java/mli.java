public final class mli
  extends qan<mli>
{
  private mlg[] a = mlg.b();
  
  public mli()
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
        mlg localmlg = this.a[j];
        if (localmlg != null)
        {
          int k = qal.d(8);
          int m = localmlg.a();
          localmlg.ak = m;
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
        mlg localmlg = this.a[i];
        if (localmlg != null)
        {
          paramqal.c(10);
          if (localmlg.ak < 0) {
            localmlg.ak = localmlg.a();
          }
          paramqal.c(localmlg.ak);
          localmlg.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mli
 * JD-Core Version:    0.7.0.1
 */