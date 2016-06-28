public final class mig
  extends qan<mig>
{
  private static volatile mig[] b;
  public int a = -2147483648;
  private Long c = null;
  
  public mig()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mig[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new mig[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int m;
    int n;
    if (this.a != -2147483648)
    {
      int k = this.a;
      m = qal.d(8);
      if (k >= 0) {
        n = qal.d(k);
      }
    }
    for (int j = i + (n + m);; j = i)
    {
      if (this.c != null)
      {
        long l = this.c.longValue();
        j += qal.d(16) + qal.b(l);
      }
      return j;
      n = 10;
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
    if (this.c != null)
    {
      long l = this.c.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mig
 * JD-Core Version:    0.7.0.1
 */