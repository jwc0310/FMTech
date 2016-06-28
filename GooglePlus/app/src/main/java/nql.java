public final class nql
  extends qan<nql>
{
  public pmk a = null;
  public int b = -2147483648;
  private nqm c = null;
  private String d = null;
  
  public nql()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      pmk localpmk = this.a;
      int i4 = qal.d(8);
      int i5 = localpmk.a();
      localpmk.ak = i5;
      i += i4 + (i5 + qal.d(i5));
    }
    int i1;
    int i2;
    if (this.b != -2147483648)
    {
      i1 = this.b;
      i2 = qal.d(16);
      if (i1 < 0) {
        break label182;
      }
    }
    label182:
    for (int i3 = qal.d(i1);; i3 = 10)
    {
      i += i3 + i2;
      if (this.c != null)
      {
        nqm localnqm = this.c;
        int m = qal.d(24);
        int n = localnqm.a();
        localnqm.ak = n;
        i += m + (n + qal.d(n));
      }
      if (this.d != null)
      {
        String str = this.d;
        int j = qal.d(32);
        int k = qal.a(str);
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      pmk localpmk = this.a;
      paramqal.c(10);
      if (localpmk.ak < 0) {
        localpmk.ak = localpmk.a();
      }
      paramqal.c(localpmk.ak);
      localpmk.a(paramqal);
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      nqm localnqm = this.c;
      paramqal.c(26);
      if (localnqm.ak < 0) {
        localnqm.ak = localnqm.a();
      }
      paramqal.c(localnqm.ak);
      localnqm.a(paramqal);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(34);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nql
 * JD-Core Version:    0.7.0.1
 */