public final class mnx
  extends qan<mnx>
{
  private static volatile mnx[] a;
  private mos b = null;
  private int c = -2147483648;
  private int d = -2147483648;
  private mny e = null;
  
  public mnx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mnx[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mnx[0];
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
      mos localmos = this.b;
      int i5 = qal.d(8);
      int i6 = localmos.a();
      localmos.ak = i6;
      j += i5 + (i6 + qal.d(i6));
    }
    int i2;
    int i3;
    if (this.c != -2147483648)
    {
      i2 = this.c;
      i3 = qal.d(16);
      if (i2 < 0) {
        break label185;
      }
    }
    label185:
    for (int i4 = qal.d(i2);; i4 = i)
    {
      j += i4 + i3;
      if (this.d != -2147483648)
      {
        int n = this.d;
        int i1 = qal.d(24);
        if (n >= 0) {
          i = qal.d(n);
        }
        j += i1 + i;
      }
      if (this.e != null)
      {
        mny localmny = this.e;
        int k = qal.d(32);
        int m = localmny.a();
        localmny.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      mos localmos = this.b;
      paramqal.c(10);
      if (localmos.ak < 0) {
        localmos.ak = localmos.a();
      }
      paramqal.c(localmos.ak);
      localmos.a(paramqal);
    }
    if (this.c != -2147483648)
    {
      int j = this.c;
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.e != null)
    {
      mny localmny = this.e;
      paramqal.c(34);
      if (localmny.ak < 0) {
        localmny.ak = localmny.a();
      }
      paramqal.c(localmny.ak);
      localmny.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mnx
 * JD-Core Version:    0.7.0.1
 */