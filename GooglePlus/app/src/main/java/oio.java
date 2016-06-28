public final class oio
  extends qan<oio>
{
  private static volatile oio[] a;
  private int b = -2147483648;
  
  public oio()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oio[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new oio[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != -2147483648)
    {
      int j = this.b;
      int k = qal.d(8);
      if (j >= 0) {}
      for (int m = qal.d(j);; m = 10) {
        return i + (m + k);
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(8);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oio
 * JD-Core Version:    0.7.0.1
 */