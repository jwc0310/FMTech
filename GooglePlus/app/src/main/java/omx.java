public final class omx
  extends qan<omx>
{
  private int a = -2147483648;
  private orl b = null;
  
  public omx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i1;
    int i2;
    if (this.a != -2147483648)
    {
      int n = this.a;
      i1 = qal.d(8);
      if (n >= 0) {
        i2 = qal.d(n);
      }
    }
    for (int j = i + (i2 + i1);; j = i)
    {
      if (this.b != null)
      {
        orl localorl = this.b;
        int k = qal.d(16);
        int m = localorl.a();
        localorl.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i2 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int i = this.a;
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      orl localorl = this.b;
      paramqal.c(18);
      if (localorl.ak < 0) {
        localorl.ak = localorl.a();
      }
      paramqal.c(localorl.ak);
      localorl.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omx
 * JD-Core Version:    0.7.0.1
 */