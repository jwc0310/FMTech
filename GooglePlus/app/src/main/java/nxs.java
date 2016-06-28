public final class nxs
  extends qan<nxs>
{
  private static volatile nxs[] e;
  public nwm a = null;
  public nvq b = null;
  public String c = null;
  public int d = -2147483648;
  
  public nxs()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nxs[] b()
  {
    if (e == null) {}
    synchronized (qar.a)
    {
      if (e == null) {
        e = new nxs[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nwm localnwm = this.a;
      int i4 = qal.d(8);
      int i5 = localnwm.a();
      localnwm.ak = i5;
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.b != null)
    {
      nvq localnvq = this.b;
      int i2 = qal.d(16);
      int i3 = localnvq.a();
      localnvq.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.c != null)
    {
      String str = this.c;
      int n = qal.d(24);
      int i1 = qal.a(str);
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.d != -2147483648)
    {
      j = this.d;
      k = qal.d(32);
      if (j < 0) {
        break label181;
      }
    }
    label181:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
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
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxs
 * JD-Core Version:    0.7.0.1
 */