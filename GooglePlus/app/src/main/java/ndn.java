public final class ndn
  extends qan<ndn>
{
  private static volatile ndn[] a;
  private String b = null;
  private String c = null;
  private int d = -2147483648;
  
  public ndn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ndn[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new ndn[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str2 = this.b;
      int i2 = qal.d(8);
      int i3 = qal.a(str2);
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int n = qal.d(16);
      int i1 = qal.a(str1);
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.d != -2147483648)
    {
      j = this.d;
      k = qal.d(24);
      if (j < 0) {
        break label126;
      }
    }
    label126:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(24);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndn
 * JD-Core Version:    0.7.0.1
 */