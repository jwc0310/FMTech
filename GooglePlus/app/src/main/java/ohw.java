public final class ohw
  extends qan<ohw>
{
  public opo[] a = opo.c;
  public oqw[] b = oqw.b();
  
  public ohw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.a.length; i2++)
      {
        opo localopo = this.a[i2];
        if (localopo != null)
        {
          int i3 = qal.d(8);
          int i4 = localopo.a();
          localopo.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.b != null)
    {
      int j = this.b.length;
      int k = 0;
      if (j > 0) {
        while (k < this.b.length)
        {
          oqw localoqw = this.b[k];
          if (localoqw != null)
          {
            int m = qal.d(16);
            int n = localoqw.a();
            localoqw.ak = n;
            i += m + (n + qal.d(n));
          }
          k++;
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        opo localopo = this.a[k];
        if (localopo != null)
        {
          paramqal.c(10);
          if (localopo.ak < 0) {
            localopo.ak = localopo.a();
          }
          paramqal.c(localopo.ak);
          localopo.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      int i = this.b.length;
      int j = 0;
      if (i > 0) {
        while (j < this.b.length)
        {
          oqw localoqw = this.b[j];
          if (localoqw != null)
          {
            paramqal.c(18);
            if (localoqw.ak < 0) {
              localoqw.ak = localoqw.a();
            }
            paramqal.c(localoqw.ak);
            localoqw.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohw
 * JD-Core Version:    0.7.0.1
 */