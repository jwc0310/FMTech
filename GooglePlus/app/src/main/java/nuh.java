public final class nuh
  extends qan<nuh>
{
  private static volatile nuh[] a;
  private int b = -2147483648;
  private Long c = null;
  
  public nuh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nuh[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nuh[0];
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
    if (this.b != -2147483648)
    {
      int i = this.b;
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
 * Qualified Name:     nuh
 * JD-Core Version:    0.7.0.1
 */