public final class mhq
  extends qan<mhq>
{
  public mhu a = null;
  public mhw[] b = mhw.b();
  
  public mhq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mhu localmhu = this.a;
      int i1 = qal.d(8);
      int i2 = localmhu.a();
      localmhu.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        mhw localmhw = this.b[k];
        if (localmhw != null)
        {
          int m = qal.d(16);
          int n = localmhw.a();
          localmhw.ak = n;
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
      mhu localmhu = this.a;
      paramqal.c(10);
      if (localmhu.ak < 0) {
        localmhu.ak = localmhu.a();
      }
      paramqal.c(localmhu.ak);
      localmhu.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        mhw localmhw = this.b[i];
        if (localmhw != null)
        {
          paramqal.c(18);
          if (localmhw.ak < 0) {
            localmhw.ak = localmhw.a();
          }
          paramqal.c(localmhw.ak);
          localmhw.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mhq
 * JD-Core Version:    0.7.0.1
 */