public final class nmj
  extends qan<nmj>
{
  private static volatile nmj[] a;
  private int b = -2147483648;
  private Long c = null;
  private Long d = null;
  
  public nmj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nmj[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nmj[0];
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
        long l2 = this.c.longValue();
        j += qal.d(16) + qal.b(l2);
      }
      if (this.d != null)
      {
        long l1 = this.d.longValue();
        j += qal.d(24) + qal.b(l1);
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
      long l2 = this.c.longValue();
      paramqal.c(16);
      paramqal.a(l2);
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      paramqal.c(24);
      paramqal.a(l1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmj
 * JD-Core Version:    0.7.0.1
 */