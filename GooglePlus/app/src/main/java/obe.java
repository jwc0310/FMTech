public final class obe
  extends qan<obe>
{
  private static volatile obe[] a;
  private String b = null;
  private String c = null;
  
  public obe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static obe[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new obe[0];
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
      int m = qal.d(8);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int j = qal.d(16);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     obe
 * JD-Core Version:    0.7.0.1
 */