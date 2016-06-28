public final class nmo
  extends qan<nmo>
{
  private Long a = null;
  private Long b = null;
  private Long c = null;
  private int d = -2147483648;
  private int e = -2147483648;
  
  public nmo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.a != null)
    {
      long l3 = this.a.longValue();
      j += qal.d(8) + qal.b(l3);
    }
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      j += qal.d(16) + qal.b(l2);
    }
    int n;
    int i1;
    if (this.d != -2147483648)
    {
      n = this.d;
      i1 = qal.d(24);
      if (n < 0) {
        break label180;
      }
    }
    label180:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.e != -2147483648)
      {
        int k = this.e;
        int m = qal.d(32);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      if (this.c != null)
      {
        long l1 = this.c.longValue();
        j += qal.d(40) + qal.b(l1);
      }
      return j;
    }
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
    if (this.d != -2147483648)
    {
      int j = this.d;
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.e != -2147483648)
    {
      int i = this.e;
      paramqal.c(32);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      paramqal.c(40);
      paramqal.a(l1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmo
 * JD-Core Version:    0.7.0.1
 */