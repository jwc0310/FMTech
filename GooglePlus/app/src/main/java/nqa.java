public final class nqa
  extends qan<nqa>
{
  public nqb a = null;
  private nqb[] b = nqb.b();
  
  public nqa()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nqb localnqb2 = this.a;
      int i1 = qal.d(8);
      int i2 = localnqb2.a();
      localnqb2.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        nqb localnqb1 = this.b[k];
        if (localnqb1 != null)
        {
          int m = qal.d(16);
          int n = localnqb1.a();
          localnqb1.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nqb localnqb2 = this.a;
      paramqal.c(10);
      if (localnqb2.ak < 0) {
        localnqb2.ak = localnqb2.a();
      }
      paramqal.c(localnqb2.ak);
      localnqb2.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        nqb localnqb1 = this.b[i];
        if (localnqb1 != null)
        {
          paramqal.c(18);
          if (localnqb1.ak < 0) {
            localnqb1.ak = localnqb1.a();
          }
          paramqal.c(localnqb1.ak);
          localnqb1.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqa
 * JD-Core Version:    0.7.0.1
 */