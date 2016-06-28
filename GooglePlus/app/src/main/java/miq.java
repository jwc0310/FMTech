public final class miq
  extends qan<miq>
{
  private static volatile miq[] d;
  public int a = -2147483648;
  public int b = -2147483648;
  public String c = null;
  
  public miq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static miq[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new miq[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i4;
    int i5;
    if (this.a != -2147483648)
    {
      int i3 = this.a;
      i4 = qal.d(8);
      if (i3 >= 0) {
        i5 = qal.d(i3);
      }
    }
    for (int k = j + (i5 + i4);; k = j)
    {
      if (this.b != -2147483648)
      {
        int i1 = this.b;
        int i2 = qal.d(16);
        if (i1 >= 0) {
          i = qal.d(i1);
        }
        k += i + i2;
      }
      if (this.c != null)
      {
        String str = this.c;
        int m = qal.d(24);
        int n = qal.a(str);
        k += m + (n + qal.d(n));
      }
      return k;
      i5 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int j = this.a;
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(26);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     miq
 * JD-Core Version:    0.7.0.1
 */