public final class nmm
  extends qan<nmm>
{
  private static volatile nmm[] a;
  private int b = -2147483648;
  private Float c = null;
  
  public nmm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nmm[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nmm[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int m;
    int n;
    if (this.b != -2147483648)
    {
      int k = this.b;
      m = qal.d(8);
      if (k >= 0) {
        n = qal.d(k);
      }
    }
    for (int j = i + (n + m);; j = i)
    {
      if (this.c != null)
      {
        this.c.floatValue();
        j += 4 + qal.d(16);
      }
      return j;
      n = 10;
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
      float f = this.c.floatValue();
      paramqal.c(21);
      paramqal.e(Float.floatToIntBits(f));
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmm
 * JD-Core Version:    0.7.0.1
 */