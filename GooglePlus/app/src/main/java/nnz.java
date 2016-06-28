public final class nnz
  extends qan<nnz>
{
  private static volatile nnz[] c;
  public String a = null;
  public Long b = null;
  private Long d = null;
  private String e = null;
  private nnl f = null;
  
  public nnz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nnz[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new nnz[0];
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
      long l2 = this.d.longValue();
      i += qal.d(16) + qal.b(l2);
    }
    if (this.b != null)
    {
      long l1 = this.b.longValue();
      i += qal.d(24) + qal.b(l1);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      int m = qal.d(32);
      int n = qal.a(str1);
      i += m + (n + qal.d(n));
    }
    if (this.f != null)
    {
      nnl localnnl = this.f;
      int j = qal.d(40);
      int k = localnnl.a();
      localnnl.ak = k;
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
      long l2 = this.d.longValue();
      paramqal.c(16);
      paramqal.a(l2);
    }
    if (this.b != null)
    {
      long l1 = this.b.longValue();
      paramqal.c(24);
      paramqal.a(l1);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.f != null)
    {
      nnl localnnl = this.f;
      paramqal.c(42);
      if (localnnl.ak < 0) {
        localnnl.ak = localnnl.a();
      }
      paramqal.c(localnnl.ak);
      localnnl.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnz
 * JD-Core Version:    0.7.0.1
 */