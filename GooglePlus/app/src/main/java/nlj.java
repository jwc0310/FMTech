public final class nlj
  extends qan<nlj>
{
  private nlk[] a = nlk.b();
  private Integer b = null;
  private Integer c = null;
  
  public nlj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i3 = 0; i3 < this.a.length; i3++)
      {
        nlk localnlk = this.a[i3];
        if (localnlk != null)
        {
          int i4 = qal.d(8);
          int i5 = localnlk.a();
          localnlk.ak = i5;
          j += i4 + (i5 + qal.d(i5));
        }
      }
    }
    int n;
    int i1;
    if (this.b != null)
    {
      n = this.b.intValue();
      i1 = qal.d(16);
      if (n < 0) {
        break label174;
      }
    }
    label174:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.c != null)
      {
        int k = this.c.intValue();
        int m = qal.d(24);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        nlk localnlk = this.a[k];
        if (localnlk != null)
        {
          paramqal.c(10);
          if (localnlk.ak < 0) {
            localnlk.ak = localnlk.a();
          }
          paramqal.c(localnlk.ak);
          localnlk.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(24);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nlj
 * JD-Core Version:    0.7.0.1
 */