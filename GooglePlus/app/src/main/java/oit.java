public final class oit
  extends qan<oit>
{
  private oiu[] a = oiu.b();
  
  public oit()
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
        oiu localoiu = this.a[j];
        if (localoiu != null)
        {
          int k = qal.d(8);
          int m = localoiu.a();
          localoiu.ak = m;
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
        oiu localoiu = this.a[i];
        if (localoiu != null)
        {
          paramqal.c(10);
          if (localoiu.ak < 0) {
            localoiu.ak = localoiu.a();
          }
          paramqal.c(localoiu.ak);
          localoiu.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oit
 * JD-Core Version:    0.7.0.1
 */