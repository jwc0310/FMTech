public final class mna
  extends qan<mna>
{
  private static volatile mna[] c;
  public mor a = null;
  public String b = null;
  private mpk d = null;
  private rcn e = null;
  private rcp f = null;
  private int g = -2147483648;
  
  public mna()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mna[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new mna[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mor localmor = this.a;
      int i8 = qal.d(8);
      int i9 = localmor.a();
      localmor.ak = i9;
      i += i8 + (i9 + qal.d(i9));
    }
    if (this.b != null)
    {
      String str = this.b;
      int i6 = qal.d(16);
      int i7 = qal.a(str);
      i += i6 + (i7 + qal.d(i7));
    }
    int i3;
    int i4;
    if (this.g != -2147483648)
    {
      i3 = this.g;
      i4 = qal.d(24);
      if (i3 < 0) {
        break label277;
      }
    }
    label277:
    for (int i5 = qal.d(i3);; i5 = 10)
    {
      i += i5 + i4;
      if (this.d != null)
      {
        mpk localmpk = this.d;
        int i1 = qal.d(32);
        int i2 = localmpk.a();
        localmpk.ak = i2;
        i += i1 + (i2 + qal.d(i2));
      }
      if (this.e != null)
      {
        rcn localrcn = this.e;
        int m = qal.d(40);
        int n = localrcn.a();
        localrcn.ak = n;
        i += m + (n + qal.d(n));
      }
      if (this.f != null)
      {
        rcp localrcp = this.f;
        int j = qal.d(48);
        int k = localrcp.a();
        localrcp.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mor localmor = this.a;
      paramqal.c(10);
      if (localmor.ak < 0) {
        localmor.ak = localmor.a();
      }
      paramqal.c(localmor.ak);
      localmor.a(paramqal);
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.g != -2147483648)
    {
      int i = this.g;
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.d != null)
    {
      mpk localmpk = this.d;
      paramqal.c(34);
      if (localmpk.ak < 0) {
        localmpk.ak = localmpk.a();
      }
      paramqal.c(localmpk.ak);
      localmpk.a(paramqal);
    }
    if (this.e != null)
    {
      rcn localrcn = this.e;
      paramqal.c(42);
      if (localrcn.ak < 0) {
        localrcn.ak = localrcn.a();
      }
      paramqal.c(localrcn.ak);
      localrcn.a(paramqal);
    }
    if (this.f != null)
    {
      rcp localrcp = this.f;
      paramqal.c(50);
      if (localrcp.ak < 0) {
        localrcp.ak = localrcp.a();
      }
      paramqal.c(localrcp.ak);
      localrcp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mna
 * JD-Core Version:    0.7.0.1
 */