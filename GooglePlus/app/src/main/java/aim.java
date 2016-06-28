public final class aim
  extends qan<aim>
{
  private pfb[] a = pfb.b();
  private Integer b = null;
  
  public aim()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int n = 0; n < this.a.length; n++)
      {
        pfb localpfb = this.a[n];
        if (localpfb != null)
        {
          int i1 = qal.d(8);
          int i2 = localpfb.a();
          localpfb.ak = i2;
          i += i1 + (i2 + qal.d(i2));
        }
      }
    }
    int j;
    int k;
    if (this.b != null)
    {
      j = this.b.intValue();
      k = qal.d(16);
      if (j < 0) {
        break label128;
      }
    }
    label128:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        pfb localpfb = this.a[j];
        if (localpfb != null)
        {
          paramqal.c(10);
          if (localpfb.ak < 0) {
            localpfb.ak = localpfb.a();
          }
          paramqal.c(localpfb.ak);
          localpfb.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      int i = this.b.intValue();
      paramqal.c(16);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aim
 * JD-Core Version:    0.7.0.1
 */