public final class mlf
  extends qan<mlf>
{
  public mlh[] a = mlh.b();
  
  public mlf()
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
        mlh localmlh = this.a[j];
        if (localmlh != null)
        {
          int k = qal.d(8);
          int m = localmlh.a();
          localmlh.ak = m;
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
        mlh localmlh = this.a[i];
        if (localmlh != null)
        {
          paramqal.c(10);
          if (localmlh.ak < 0) {
            localmlh.ak = localmlh.a();
          }
          paramqal.c(localmlh.ak);
          localmlh.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlf
 * JD-Core Version:    0.7.0.1
 */