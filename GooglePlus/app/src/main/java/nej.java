public final class nej
  extends qan<nej>
{
  public nei[] a = nei.a;
  
  static
  {
    new qao(11, nej.class, (int)428930274L, false);
  }
  
  public nej()
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
        nei localnei = this.a[j];
        if (localnei != null)
        {
          int k = qal.d(8);
          int m = localnei.a();
          localnei.ak = m;
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
        nei localnei = this.a[i];
        if (localnei != null)
        {
          paramqal.c(10);
          if (localnei.ak < 0) {
            localnei.ak = localnei.a();
          }
          paramqal.c(localnei.ak);
          localnei.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nej
 * JD-Core Version:    0.7.0.1
 */