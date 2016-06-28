public final class oba
  extends qan<oba>
{
  private obg[] a = obg.b();
  
  public oba()
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
        obg localobg = this.a[j];
        if (localobg != null)
        {
          int k = qal.d(16);
          int m = localobg.a();
          localobg.ak = m;
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
        obg localobg = this.a[i];
        if (localobg != null)
        {
          paramqal.c(18);
          if (localobg.ak < 0) {
            localobg.ak = localobg.a();
          }
          paramqal.c(localobg.ak);
          localobg.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oba
 * JD-Core Version:    0.7.0.1
 */