public final class mno
  extends qan<mno>
{
  private static volatile mno[] a;
  private int b = -2147483648;
  private mnp c = null;
  
  public mno()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mno[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mno[0];
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
        mnp localmnp = this.c;
        int k = qal.d(16);
        int m = localmnp.a();
        localmnp.ak = m;
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
      mnp localmnp = this.c;
      paramqal.c(18);
      if (localmnp.ak < 0) {
        localmnp.ak = localmnp.a();
      }
      paramqal.c(localmnp.ak);
      localmnp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mno
 * JD-Core Version:    0.7.0.1
 */