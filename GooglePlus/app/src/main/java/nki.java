public final class nki
  extends qan<nki>
{
  private static volatile nki[] a;
  private Integer b = null;
  private String c = null;
  private Long d = null;
  private Long e = null;
  
  public nki()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nki[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nki[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int i1;
    int i2;
    if (this.b != null)
    {
      int n = this.b.intValue();
      i1 = qal.d(8);
      if (n >= 0) {
        i2 = qal.d(n);
      }
    }
    for (int j = i + (i2 + i1);; j = i)
    {
      if (this.c != null)
      {
        String str = this.c;
        int k = qal.d(16);
        int m = qal.a(str);
        j += k + (m + qal.d(m));
      }
      if (this.d != null)
      {
        long l2 = this.d.longValue();
        j += qal.d(24) + qal.b(l2);
      }
      if (this.e != null)
      {
        long l1 = this.e.longValue();
        j += qal.d(32) + qal.b(l1);
      }
      return j;
      i2 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      int i = this.b.intValue();
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.d != null)
    {
      long l2 = this.d.longValue();
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
 * Qualified Name:     nki
 * JD-Core Version:    0.7.0.1
 */