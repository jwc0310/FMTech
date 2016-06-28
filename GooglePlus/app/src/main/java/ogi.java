public final class ogi
  extends qan<ogi>
{
  private oqw[] a = oqw.b();
  private int b = -2147483648;
  private qqr c = null;
  
  public ogi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i2 = 0; i2 < this.a.length; i2++)
      {
        oqw localoqw = this.a[i2];
        if (localoqw != null)
        {
          int i3 = qal.d(8);
          int i4 = localoqw.a();
          localoqw.ak = i4;
          i += i3 + (i4 + qal.d(i4));
        }
      }
    }
    int m;
    int n;
    if (this.b != -2147483648)
    {
      m = this.b;
      n = qal.d(16);
      if (m < 0) {
        break label175;
      }
    }
    label175:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.c != null)
      {
        qqr localqqr = this.c;
        int j = qal.d(24);
        int k = localqqr.a();
        localqqr.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        oqw localoqw = this.a[j];
        if (localoqw != null)
        {
          paramqal.c(10);
          if (localoqw.ak < 0) {
            localoqw.ak = localoqw.a();
          }
          paramqal.c(localoqw.ak);
          localoqw.a(paramqal);
        }
      }
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      qqr localqqr = this.c;
      paramqal.c(26);
      if (localqqr.ak < 0) {
        localqqr.ak = localqqr.a();
      }
      paramqal.c(localqqr.ak);
      localqqr.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogi
 * JD-Core Version:    0.7.0.1
 */