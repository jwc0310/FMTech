public final class njp
  extends qan<njp>
{
  private static volatile njp[] a;
  private String b = null;
  private Integer c = null;
  private Integer d = null;
  
  public njp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static njp[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new njp[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.b != null)
    {
      String str = this.b;
      int i3 = qal.d(8);
      int i4 = qal.a(str);
      j += i3 + (i4 + qal.d(i4));
    }
    int n;
    int i1;
    if (this.c != null)
    {
      n = this.c.intValue();
      i1 = qal.d(16);
      if (n < 0) {
        break label132;
      }
    }
    label132:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.d != null)
      {
        int k = this.d.intValue();
        int m = qal.d(24);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.c != null)
    {
      int j = this.c.intValue();
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.d != null)
    {
      int i = this.d.intValue();
      paramqal.c(24);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     njp
 * JD-Core Version:    0.7.0.1
 */