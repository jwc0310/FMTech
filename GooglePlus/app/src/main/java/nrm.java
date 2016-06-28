public final class nrm
  extends qan<nrm>
{
  public nps[] a = nps.b();
  public nrj b = null;
  
  public nrm()
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
        nps localnps = this.a[m];
        if (localnps != null)
        {
          int n = qal.d(8);
          int i1 = localnps.a();
          localnps.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.b != null)
    {
      nrj localnrj = this.b;
      int j = qal.d(16);
      int k = localnrj.a();
      localnrj.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        nps localnps = this.a[i];
        if (localnps != null)
        {
          paramqal.c(10);
          if (localnps.ak < 0) {
            localnps.ak = localnps.a();
          }
          paramqal.c(localnps.ak);
          localnps.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      nrj localnrj = this.b;
      paramqal.c(18);
      if (localnrj.ak < 0) {
        localnrj.ak = localnrj.a();
      }
      paramqal.c(localnrj.ak);
      localnrj.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrm
 * JD-Core Version:    0.7.0.1
 */