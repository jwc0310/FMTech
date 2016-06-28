public final class okd
  extends qan<okd>
{
  private static volatile okd[] a;
  private int[] b = qay.a;
  private String c = null;
  
  public okd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static okd[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new okd[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i1;
    if ((this.b != null) && (this.b.length > 0))
    {
      i1 = 0;
      if (i < this.b.length)
      {
        int i2 = this.b[i];
        if (i2 >= 0) {}
        for (int i3 = qal.d(i2);; i3 = 10)
        {
          i1 += i3;
          i++;
          break;
        }
      }
    }
    for (int k = j + i1 + 1 * this.b.length;; k = j)
    {
      if (this.c != null)
      {
        String str = this.c;
        int m = qal.d(16);
        int n = qal.a(str);
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        int j = this.b[i];
        paramqal.c(8);
        paramqal.a(j);
      }
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     okd
 * JD-Core Version:    0.7.0.1
 */