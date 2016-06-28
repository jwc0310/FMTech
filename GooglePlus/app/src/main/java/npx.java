public final class npx
  extends qan<npx>
{
  public oix[] a = oix.b();
  private opo b = null;
  
  public npx()
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
        oix localoix = this.a[m];
        if (localoix != null)
        {
          int n = qal.d(8);
          int i1 = localoix.a();
          localoix.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.b != null)
    {
      opo localopo = this.b;
      int j = qal.d(16);
      int k = localopo.a();
      localopo.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        oix localoix = this.a[i];
        if (localoix != null)
        {
          paramqal.c(10);
          if (localoix.ak < 0) {
            localoix.ak = localoix.a();
          }
          paramqal.c(localoix.ak);
          localoix.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      opo localopo = this.b;
      paramqal.c(18);
      if (localopo.ak < 0) {
        localopo.ak = localopo.a();
      }
      paramqal.c(localopo.ak);
      localopo.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npx
 * JD-Core Version:    0.7.0.1
 */