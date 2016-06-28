public final class mjz
  extends qan<mjz>
{
  private static volatile mjz[] b;
  public Long a = null;
  private String c = null;
  private String d = null;
  private Long e = null;
  
  public mjz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mjz[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new mjz[0];
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
    if (this.d != null)
    {
      String str1 = this.d;
      int j = qal.d(16);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    if (this.a != null)
    {
      long l2 = this.a.longValue();
      i += qal.d(24) + qal.b(l2);
    }
    if (this.e != null)
    {
      long l1 = this.e.longValue();
      i += qal.d(32) + qal.b(l1);
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
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if (this.a != null)
    {
      long l2 = this.a.longValue();
      paramqal.c(24);
      paramqal.a(l2);
    }
    if (this.e != null)
    {
      long l1 = this.e.longValue();
      paramqal.c(32);
      paramqal.a(l1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mjz
 * JD-Core Version:    0.7.0.1
 */