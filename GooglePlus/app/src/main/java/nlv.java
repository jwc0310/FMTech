public final class nlv
  extends qan<nlv>
{
  private static volatile nlv[] a;
  private String b = null;
  private Integer c = null;
  
  public nlv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nlv[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nlv[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str = this.b;
      int n = qal.d(8);
      int i1 = qal.a(str);
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.c != null)
    {
      j = this.c.intValue();
      k = qal.d(16);
      if (j < 0) {
        break label86;
      }
    }
    label86:
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
      String str = this.b;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(16);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nlv
 * JD-Core Version:    0.7.0.1
 */