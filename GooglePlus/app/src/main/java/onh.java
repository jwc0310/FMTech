public final class onh
  extends qan<onh>
{
  private oou[] a = oou.b();
  
  public onh()
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
        oou localoou = this.a[j];
        if (localoou != null)
        {
          int k = qal.d(8);
          int m = localoou.a();
          localoou.ak = m;
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
        oou localoou = this.a[i];
        if (localoou != null)
        {
          paramqal.c(10);
          if (localoou.ak < 0) {
            localoou.ak = localoou.a();
          }
          paramqal.c(localoou.ak);
          localoou.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     onh
 * JD-Core Version:    0.7.0.1
 */