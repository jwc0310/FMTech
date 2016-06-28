public final class nmy
  extends qan<nmy>
{
  public nnj[] a = nnj.b();
  
  public nmy()
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
        nnj localnnj = this.a[j];
        if (localnnj != null)
        {
          int k = qal.d(8);
          int m = localnnj.a();
          localnnj.ak = m;
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
        nnj localnnj = this.a[i];
        if (localnnj != null)
        {
          paramqal.c(10);
          if (localnnj.ak < 0) {
            localnnj.ak = localnnj.a();
          }
          paramqal.c(localnnj.ak);
          localnnj.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmy
 * JD-Core Version:    0.7.0.1
 */