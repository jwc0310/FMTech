public final class ody
  extends qan<ody>
{
  static final ody[] a = new ody[0];
  private int b = -2147483648;
  private oeb c = null;
  
  static
  {
    new qao(11, ody.class, (int)395798162L, false);
  }
  
  public ody()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i1;
    int i2;
    if (this.b != -2147483648)
    {
      int n = this.b;
      i1 = qal.d(8);
      if (n >= 0) {
        i2 = qal.d(n);
      }
    }
    for (int j = i + (i2 + i1);; j = i)
    {
      if (this.c != null)
      {
        oeb localoeb = this.c;
        int k = qal.d(16);
        int m = localoeb.a();
        localoeb.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i2 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      oeb localoeb = this.c;
      paramqal.c(18);
      if (localoeb.ak < 0) {
        localoeb.ak = localoeb.a();
      }
      paramqal.c(localoeb.ak);
      localoeb.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ody
 * JD-Core Version:    0.7.0.1
 */