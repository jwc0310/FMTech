public final class oni
  extends qan<oni>
{
  private static volatile oni[] b;
  public String a = null;
  private String c = null;
  
  public oni()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oni[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new oni[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null)
    {
      String str2 = this.c;
      int m = qal.d(8);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      String str1 = this.a;
      int j = qal.d(16);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.a != null)
    {
      String str1 = this.a;
      paramqal.c(18);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oni
 * JD-Core Version:    0.7.0.1
 */