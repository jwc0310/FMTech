public final class nxp
  extends qan<nxp>
{
  private static volatile nxp[] d;
  public nwm a = null;
  public nvq b = null;
  public String c = null;
  private nwd e = null;
  
  public nxp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nxp[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new nxp[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nwm localnwm = this.a;
      int i3 = qal.d(8);
      int i4 = localnwm.a();
      localnwm.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      nvq localnvq = this.b;
      int i1 = qal.d(16);
      int i2 = localnvq.a();
      localnvq.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      String str = this.c;
      int m = qal.d(24);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      nwd localnwd = this.e;
      int j = qal.d(32);
      int k = localnwd.a();
      localnwd.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nwm localnwm = this.a;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    if (this.b != null)
    {
      nvq localnvq = this.b;
      paramqal.c(18);
      if (localnvq.ak < 0) {
        localnvq.ak = localnvq.a();
      }
      paramqal.c(localnvq.ak);
      localnvq.a(paramqal);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(26);
      paramqal.a(str);
    }
    if (this.e != null)
    {
      nwd localnwd = this.e;
      paramqal.c(34);
      if (localnwd.ak < 0) {
        localnwd.ak = localnwd.a();
      }
      paramqal.c(localnwd.ak);
      localnwd.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxp
 * JD-Core Version:    0.7.0.1
 */