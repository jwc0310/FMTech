public final class mhr
  extends qan<mhr>
{
  public mhz[] a = mhz.b();
  public mhv b = null;
  
  public mhr()
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
        mhz localmhz = this.a[m];
        if (localmhz != null)
        {
          int n = qal.d(8);
          int i1 = localmhz.a();
          localmhz.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.b != null)
    {
      mhv localmhv = this.b;
      int j = qal.d(16);
      int k = localmhv.a();
      localmhv.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        mhz localmhz = this.a[i];
        if (localmhz != null)
        {
          paramqal.c(10);
          if (localmhz.ak < 0) {
            localmhz.ak = localmhz.a();
          }
          paramqal.c(localmhz.ak);
          localmhz.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      mhv localmhv = this.b;
      paramqal.c(18);
      if (localmhv.ak < 0) {
        localmhv.ak = localmhv.a();
      }
      paramqal.c(localmhv.ak);
      localmhv.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mhr
 * JD-Core Version:    0.7.0.1
 */