public final class nps
  extends qan<nps>
{
  private static volatile nps[] d;
  public pou a = null;
  public int b = -2147483648;
  public Integer c = null;
  private String e = null;
  private Long f = null;
  
  public nps()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nps[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new nps[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.a != null)
    {
      pou localpou = this.a;
      int i5 = qal.d(8);
      int i6 = localpou.a();
      localpou.ak = i6;
      j += i5 + (i6 + qal.d(i6));
    }
    int i2;
    int i3;
    if (this.b != -2147483648)
    {
      i2 = this.b;
      i3 = qal.d(16);
      if (i2 < 0) {
        break label210;
      }
    }
    label210:
    for (int i4 = qal.d(i2);; i4 = i)
    {
      j += i4 + i3;
      if (this.c != null)
      {
        int n = this.c.intValue();
        int i1 = qal.d(24);
        if (n >= 0) {
          i = qal.d(n);
        }
        j += i1 + i;
      }
      if (this.e != null)
      {
        String str = this.e;
        int k = qal.d(32);
        int m = qal.a(str);
        j += k + (m + qal.d(m));
      }
      if (this.f != null)
      {
        long l = this.f.longValue();
        j += qal.d(40) + qal.b(l);
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      pou localpou = this.a;
      paramqal.c(10);
      if (localpou.ak < 0) {
        localpou.ak = localpou.a();
      }
      paramqal.c(localpou.ak);
      localpou.a(paramqal);
    }
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.e != null)
    {
      String str = this.e;
      paramqal.c(34);
      paramqal.a(str);
    }
    if (this.f != null)
    {
      long l = this.f.longValue();
      paramqal.c(40);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nps
 * JD-Core Version:    0.7.0.1
 */