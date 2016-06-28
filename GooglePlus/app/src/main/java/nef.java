public final class nef
  extends qan<nef>
{
  public ndy[] a = ndy.b();
  
  static
  {
    new qao(11, nef.class, (int)428172042L, false);
  }
  
  public nef()
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
        ndy localndy = this.a[j];
        if (localndy != null)
        {
          int k = qal.d(8);
          int m = localndy.a();
          localndy.ak = m;
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
        ndy localndy = this.a[i];
        if (localndy != null)
        {
          paramqal.c(10);
          if (localndy.ak < 0) {
            localndy.ak = localndy.a();
          }
          paramqal.c(localndy.ak);
          localndy.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nef
 * JD-Core Version:    0.7.0.1
 */