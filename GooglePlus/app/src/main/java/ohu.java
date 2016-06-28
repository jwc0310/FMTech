public final class ohu
  extends qan<ohu>
{
  private static volatile ohu[] c;
  public String a = null;
  public qoq b = null;
  private String d = null;
  
  public ohu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ohu[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new ohu[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i1 = qal.d(8);
      int i2 = qal.a(str2);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int m = qal.d(16);
      int n = qal.a(str1);
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      qoq localqoq = this.b;
      int j = qal.d(24);
      int k = localqoq.a();
      localqoq.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if (this.b != null)
    {
      qoq localqoq = this.b;
      paramqal.c(26);
      if (localqoq.ak < 0) {
        localqoq.ak = localqoq.a();
      }
      paramqal.c(localqoq.ak);
      localqoq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohu
 * JD-Core Version:    0.7.0.1
 */