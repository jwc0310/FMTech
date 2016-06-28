public final class ohd
  extends qan<ohd>
{
  public ohc[] a = ohc.b();
  
  public ohd()
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
        ohc localohc = this.a[j];
        if (localohc != null)
        {
          int k = qal.d(8);
          int m = localohc.a();
          localohc.ak = m;
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
        ohc localohc = this.a[i];
        if (localohc != null)
        {
          paramqal.c(10);
          if (localohc.ak < 0) {
            localohc.ak = localohc.a();
          }
          paramqal.c(localohc.ak);
          localohc.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohd
 * JD-Core Version:    0.7.0.1
 */