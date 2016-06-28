public final class nou
  extends qan<nou>
{
  private static volatile nou[] a;
  private pvh[] b = pvh.b();
  private pmk c = null;
  private String d = null;
  private String e = null;
  
  public nou()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nou[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nou[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i3 = 0; i3 < this.b.length; i3++)
      {
        pvh localpvh = this.b[i3];
        if (localpvh != null)
        {
          int i4 = qal.d(8);
          int i5 = localpvh.a();
          localpvh.ak = i5;
          i += i4 + (i5 + qal.d(i5));
        }
      }
    }
    if (this.c != null)
    {
      pmk localpmk = this.c;
      int i1 = qal.d(16);
      int i2 = localpmk.a();
      localpmk.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int m = qal.d(24);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      String str1 = this.e;
      int j = qal.d(32);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        pvh localpvh = this.b[i];
        if (localpvh != null)
        {
          paramqal.c(10);
          if (localpvh.ak < 0) {
            localpvh.ak = localpvh.a();
          }
          paramqal.c(localpvh.ak);
          localpvh.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      pmk localpmk = this.c;
      paramqal.c(18);
      if (localpmk.ak < 0) {
        localpmk.ak = localpmk.a();
      }
      paramqal.c(localpmk.ak);
      localpmk.a(paramqal);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(34);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nou
 * JD-Core Version:    0.7.0.1
 */