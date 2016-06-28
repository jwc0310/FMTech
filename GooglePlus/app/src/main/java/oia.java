public final class oia
  extends qan<oia>
{
  private Long a = null;
  private Long b = null;
  private Long c = null;
  private String d = null;
  private String e = null;
  
  public oia()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      long l3 = this.a.longValue();
      i += qal.d(8) + qal.b(l3);
    }
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      i += qal.d(16) + qal.b(l2);
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      i += qal.d(24) + qal.b(l1);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int m = qal.d(32);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      String str1 = this.e;
      int j = qal.d(40);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      long l3 = this.a.longValue();
      paramqal.c(8);
      paramqal.a(l3);
    }
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l2);
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      paramqal.c(24);
      paramqal.a(l1);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oia
 * JD-Core Version:    0.7.0.1
 */