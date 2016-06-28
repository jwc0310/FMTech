public final class ocl
  extends qan<ocl>
{
  private static volatile ocl[] c;
  public ohy a = null;
  public int b = -2147483648;
  
  public ocl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ocl[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new ocl[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ohy localohy = this.a;
      int n = qal.d(8);
      int i1 = localohy.a();
      localohy.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.b != -2147483648)
    {
      j = this.b;
      k = qal.d(16);
      if (j < 0) {
        break label92;
      }
    }
    label92:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ohy localohy = this.a;
      paramqal.c(10);
      if (localohy.ak < 0) {
        localohy.ak = localohy.a();
      }
      paramqal.c(localohy.ak);
      localohy.a(paramqal);
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
 * Qualified Name:     ocl
 * JD-Core Version:    0.7.0.1
 */