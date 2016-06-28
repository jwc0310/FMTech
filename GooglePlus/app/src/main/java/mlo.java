public final class mlo
  extends qan<mlo>
{
  private mlm a = null;
  private mml[] b = mml.b();
  
  public mlo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mlm localmlm = this.a;
      int i1 = qal.d(8);
      int i2 = localmlm.a();
      localmlm.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        mml localmml = this.b[k];
        if (localmml != null)
        {
          int m = qal.d(16);
          int n = localmml.a();
          localmml.ak = n;
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
      mlm localmlm = this.a;
      paramqal.c(10);
      if (localmlm.ak < 0) {
        localmlm.ak = localmlm.a();
      }
      paramqal.c(localmlm.ak);
      localmlm.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        mml localmml = this.b[i];
        if (localmml != null)
        {
          paramqal.c(18);
          if (localmml.ak < 0) {
            localmml.ak = localmml.a();
          }
          paramqal.c(localmml.ak);
          localmml.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlo
 * JD-Core Version:    0.7.0.1
 */