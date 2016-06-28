public final class nzy
  extends qan<nzy>
{
  private static volatile nzy[] a;
  private String b = null;
  private String c = null;
  private String d = null;
  
  public nzy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nzy[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nzy[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str3 = this.b;
      int i1 = qal.d(8);
      int i2 = qal.a(str3);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int m = qal.d(16);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int j = qal.d(24);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(26);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzy
 * JD-Core Version:    0.7.0.1
 */