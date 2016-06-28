public final class nmi
  extends qan<nmi>
{
  private nmj[] a = nmj.b();
  
  public nmi()
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
        nmj localnmj = this.a[j];
        if (localnmj != null)
        {
          int k = qal.d(8);
          int m = localnmj.a();
          localnmj.ak = m;
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
        nmj localnmj = this.a[i];
        if (localnmj != null)
        {
          paramqal.c(10);
          if (localnmj.ak < 0) {
            localnmj.ak = localnmj.a();
          }
          paramqal.c(localnmj.ak);
          localnmj.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmi
 * JD-Core Version:    0.7.0.1
 */