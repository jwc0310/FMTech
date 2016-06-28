public final class ock
  extends qan<ock>
{
  private ocm[] a = ocm.b();
  
  public ock()
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
        ocm localocm = this.a[j];
        if (localocm != null)
        {
          int k = qal.d(8);
          int m = localocm.a();
          localocm.ak = m;
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
        ocm localocm = this.a[i];
        if (localocm != null)
        {
          paramqal.c(10);
          if (localocm.ak < 0) {
            localocm.ak = localocm.a();
          }
          paramqal.c(localocm.ak);
          localocm.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ock
 * JD-Core Version:    0.7.0.1
 */