public final class njx
  extends qan<njx>
{
  private static volatile njx[] a;
  private Long b = null;
  private Long c = null;
  private Integer d = null;
  private Integer e = null;
  private int f = -2147483648;
  
  public njx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static njx[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new njx[0];
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
      long l2 = this.b.longValue();
      j += qal.d(8) + qal.b(l2);
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      j += qal.d(16) + qal.b(l1);
    }
    int i5;
    int n;
    int i1;
    if (this.d != null)
    {
      int i3 = this.d.intValue();
      int i4 = qal.d(24);
      if (i3 >= 0)
      {
        i5 = qal.d(i3);
        j += i5 + i4;
      }
    }
    else if (this.e != null)
    {
      n = this.e.intValue();
      i1 = qal.d(32);
      if (n < 0) {
        break label199;
      }
    }
    label199:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.f != -2147483648)
      {
        int k = this.f;
        int m = qal.d(40);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
      i5 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      paramqal.c(8);
      paramqal.a(l2);
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      paramqal.c(16);
      paramqal.a(l1);
    }
    if (this.d != null)
    {
      int k = this.d.intValue();
      paramqal.c(24);
      paramqal.a(k);
    }
    if (this.e != null)
    {
      int j = this.e.intValue();
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.f != -2147483648)
    {
      int i = this.f;
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     njx
 * JD-Core Version:    0.7.0.1
 */