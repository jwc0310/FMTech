public final class nll
  extends qan<nll>
{
  private nko[] a = nko.b();
  
  public nll()
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
        nko localnko = this.a[j];
        if (localnko != null)
        {
          int k = qal.d(8);
          int m = localnko.a();
          localnko.ak = m;
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
        nko localnko = this.a[i];
        if (localnko != null)
        {
          paramqal.c(10);
          if (localnko.ak < 0) {
            localnko.ak = localnko.a();
          }
          paramqal.c(localnko.ak);
          localnko.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nll
 * JD-Core Version:    0.7.0.1
 */