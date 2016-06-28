public final class okf
  extends qan<okf>
{
  public Long a = null;
  public Integer b = null;
  private Long c = null;
  private String d = null;
  private okg e = null;
  
  public okf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null)
    {
      long l2 = this.c.longValue();
      i += qal.d(8) + qal.b(l2);
    }
    if (this.a != null)
    {
      long l1 = this.a.longValue();
      i += qal.d(16) + qal.b(l1);
    }
    if (this.d != null)
    {
      String str = this.d;
      int i2 = qal.d(24);
      int i3 = qal.a(str);
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.e != null)
    {
      okg localokg = this.e;
      int n = qal.d(32);
      int i1 = localokg.a();
      localokg.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.b != null)
    {
      j = this.b.intValue();
      k = qal.d(40);
      if (j < 0) {
        break label194;
      }
    }
    label194:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      long l2 = this.c.longValue();
      paramqal.c(8);
      paramqal.a(l2);
    }
    if (this.a != null)
    {
      long l1 = this.a.longValue();
      paramqal.c(16);
      paramqal.a(l1);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(26);
      paramqal.a(str);
    }
    if (this.e != null)
    {
      okg localokg = this.e;
      paramqal.c(34);
      if (localokg.ak < 0) {
        localokg.ak = localokg.a();
      }
      paramqal.c(localokg.ak);
      localokg.a(paramqal);
    }
    if (this.b != null)
    {
      int i = this.b.intValue();
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     okf
 * JD-Core Version:    0.7.0.1
 */