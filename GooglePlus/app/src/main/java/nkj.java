public final class nkj
  extends qan<nkj>
{
  private static volatile nkj[] a;
  private Integer b = null;
  private Integer c = null;
  private Long d = null;
  
  public nkj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nkj[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nkj[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i2;
    int i3;
    if (this.b != null)
    {
      int i1 = this.b.intValue();
      i2 = qal.d(8);
      if (i1 >= 0) {
        i3 = qal.d(i1);
      }
    }
    for (int k = j + (i3 + i2);; k = j)
    {
      if (this.c != null)
      {
        int m = this.c.intValue();
        int n = qal.d(16);
        if (m >= 0) {
          i = qal.d(m);
        }
        k += i + n;
      }
      if (this.d != null)
      {
        long l = this.d.longValue();
        k += qal.d(24) + qal.b(l);
      }
      return k;
      i3 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      paramqal.c(24);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nkj
 * JD-Core Version:    0.7.0.1
 */