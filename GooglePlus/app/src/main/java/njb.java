public final class njb
  extends qan<njb>
{
  private int[] a = qay.a;
  private Integer b = null;
  
  public njb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = 0;
    int k = super.a();
    int i2;
    if ((this.a != null) && (this.a.length > 0))
    {
      i2 = 0;
      if (j < this.a.length)
      {
        int i3 = this.a[j];
        if (i3 >= 0) {}
        for (int i4 = qal.d(i3);; i4 = i)
        {
          i2 += i4;
          j++;
          break;
        }
      }
    }
    for (int m = k + i2 + 1 * this.a.length;; m = k)
    {
      if (this.b != null)
      {
        int n = this.b.intValue();
        int i1 = qal.d(16);
        if (n >= 0) {
          i = qal.d(n);
        }
        m += i1 + i;
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        int k = this.a[j];
        paramqal.c(8);
        paramqal.a(k);
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
 * Qualified Name:     njb
 * JD-Core Version:    0.7.0.1
 */