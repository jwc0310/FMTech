public final class nzn
  extends qan<nzn>
{
  private nzm[] a = nzm.b();
  private String b = null;
  
  public nzn()
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
        nzm localnzm = this.a[m];
        if (localnzm != null)
        {
          int n = qal.d(8);
          int i1 = localnzm.a();
          localnzm.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        nzm localnzm = this.a[i];
        if (localnzm != null)
        {
          paramqal.c(10);
          if (localnzm.ak < 0) {
            localnzm.ak = localnzm.a();
          }
          paramqal.c(localnzm.ak);
          localnzm.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzn
 * JD-Core Version:    0.7.0.1
 */