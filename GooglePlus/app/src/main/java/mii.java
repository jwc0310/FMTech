public final class mii
  extends qan<mii>
{
  private static volatile mii[] c;
  public int a = -2147483648;
  public int b = -2147483648;
  
  public mii()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mii[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new mii[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i2;
    int i3;
    if (this.a != -2147483648)
    {
      int i1 = this.a;
      i2 = qal.d(8);
      if (i1 >= 0) {
        i3 = qal.d(i1);
      }
    }
    for (int k = j + (i3 + i2);; k = j)
    {
      if (this.b != -2147483648)
      {
        int m = this.b;
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mii
 * JD-Core Version:    0.7.0.1
 */