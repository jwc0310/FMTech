public final class nux
  extends qan<nux>
{
  public nve[] a = nve.b();
  public nvc b = null;
  
  public nux()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int m = 0; m < this.a.length; m++)
      {
        nve localnve = this.a[m];
        if (localnve != null)
        {
          int n = qal.d(8);
          int i1 = localnve.a();
          localnve.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.b != null)
    {
      nvc localnvc = this.b;
      int j = qal.d(16);
      int k = localnvc.a();
      localnvc.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        nve localnve = this.a[i];
        if (localnve != null)
        {
          paramqal.c(10);
          if (localnve.ak < 0) {
            localnve.ak = localnve.a();
          }
          paramqal.c(localnve.ak);
          localnve.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      nvc localnvc = this.b;
      paramqal.c(18);
      if (localnvc.ak < 0) {
        localnvc.ak = localnvc.a();
      }
      paramqal.c(localnvc.ak);
      localnvc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nux
 * JD-Core Version:    0.7.0.1
 */