public final class omt
  extends qan<omt>
{
  private static volatile omt[] a;
  private omr b = null;
  private int c = -2147483648;
  
  public omt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static omt[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new omt[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      omr localomr = this.b;
      int n = qal.d(8);
      int i1 = localomr.a();
      localomr.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j = this.c;
    int k = qal.d(16);
    if (j >= 0) {}
    for (int m = qal.d(j);; m = 10) {
      return i + (m + k);
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      omr localomr = this.b;
      paramqal.c(10);
      if (localomr.ak < 0) {
        localomr.ak = localomr.a();
      }
      paramqal.c(localomr.ak);
      localomr.a(paramqal);
    }
    int i = this.c;
    paramqal.c(16);
    paramqal.a(i);
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omt
 * JD-Core Version:    0.7.0.1
 */