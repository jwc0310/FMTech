public final class oiq
  extends qan<oiq>
{
  private static volatile oiq[] a;
  private int b = -2147483648;
  private Integer c = null;
  
  public oiq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oiq[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new oiq[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int k = this.b;
    int m = qal.d(8);
    if (k >= 0) {}
    for (int n = qal.d(k);; n = i)
    {
      int i1 = j + (n + m);
      if (this.c != null)
      {
        int i2 = this.c.intValue();
        int i3 = qal.d(16);
        if (i2 >= 0) {
          i = qal.d(i2);
        }
        i1 += i + i3;
      }
      return i1;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = this.b;
    paramqal.c(8);
    paramqal.a(i);
    if (this.c != null)
    {
      int j = this.c.intValue();
      paramqal.c(16);
      paramqal.a(j);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oiq
 * JD-Core Version:    0.7.0.1
 */