public final class mmz
  extends qan<mmz>
{
  private static volatile mmz[] a;
  private int b = -2147483648;
  private Double c = null;
  private String d = null;
  
  public mmz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mmz[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mmz[0];
      }
      return a;
    }
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
        this.c.doubleValue();
        j += 8 + qal.d(16);
      }
      if (this.d != null)
      {
        String str = this.d;
        int k = qal.d(24);
        int m = qal.a(str);
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
      double d1 = this.c.doubleValue();
      paramqal.c(17);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(26);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmz
 * JD-Core Version:    0.7.0.1
 */