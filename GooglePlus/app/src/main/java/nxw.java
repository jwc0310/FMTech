public final class nxw
  extends qan<nxw>
{
  private static volatile nxw[] a;
  private int b = -2147483648;
  private int c = -2147483648;
  
  public nxw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nxw[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nxw[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i2;
    int i3;
    if (this.b != -2147483648)
    {
      int i1 = this.b;
      i2 = qal.d(8);
      if (i1 >= 0) {
        i3 = qal.d(i1);
      }
    }
    for (int k = j + (i3 + i2);; k = j)
    {
      if (this.c != -2147483648)
      {
        int m = this.c;
        int n = qal.d(16);
        if (m >= 0) {
          i = qal.d(m);
        }
        k += i + n;
      }
      return k;
      i3 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.c != -2147483648)
    {
      int i = this.c;
      paramqal.c(16);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxw
 * JD-Core Version:    0.7.0.1
 */