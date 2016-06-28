public final class ond
  extends qan<ond>
{
  private static volatile ond[] c;
  public one a = null;
  public String b = null;
  
  public ond()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ond[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new ond[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      one localone = this.a;
      int m = qal.d(8);
      int n = localone.a();
      localone.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      String str = this.b;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      one localone = this.a;
      paramqal.c(10);
      if (localone.ak < 0) {
        localone.ak = localone.a();
      }
      paramqal.c(localone.ak);
      localone.a(paramqal);
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ond
 * JD-Core Version:    0.7.0.1
 */