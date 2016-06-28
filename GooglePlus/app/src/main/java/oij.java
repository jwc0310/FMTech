public final class oij
  extends qan<oij>
{
  private static volatile oij[] b;
  public String a = null;
  private Double c = null;
  private Double d = null;
  private String e = null;
  private String f = null;
  
  public oij()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oij[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new oij[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null)
    {
      this.c.doubleValue();
      i += 8 + qal.d(8);
    }
    if (this.d != null)
    {
      this.d.doubleValue();
      i += 8 + qal.d(16);
    }
    if (this.a != null)
    {
      String str3 = this.a;
      int i1 = qal.d(24);
      int i2 = qal.a(str3);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int m = qal.d(32);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.f != null)
    {
      String str1 = this.f;
      int j = qal.d(40);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      double d2 = this.c.doubleValue();
      paramqal.c(9);
      paramqal.c(Double.doubleToLongBits(d2));
    }
    if (this.d != null)
    {
      double d1 = this.d.doubleValue();
      paramqal.c(17);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oij
 * JD-Core Version:    0.7.0.1
 */