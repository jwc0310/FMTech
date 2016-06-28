public final class oou
  extends qan<oou>
{
  private static volatile oou[] a;
  private String b = null;
  private onn c = null;
  private int d = -2147483648;
  private onu e = null;
  private ops f = null;
  private onp g = null;
  
  public oou()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oou[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new oou[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str = this.b;
      int i8 = qal.d(8);
      int i9 = qal.a(str);
      i += i8 + (i9 + qal.d(i9));
    }
    if (this.c != null)
    {
      onn localonn = this.c;
      int i6 = qal.d(16);
      int i7 = localonn.a();
      localonn.ak = i7;
      i += i6 + (i7 + qal.d(i7));
    }
    int i3;
    int i4;
    if (this.d != -2147483648)
    {
      i3 = this.d;
      i4 = qal.d(24);
      if (i3 < 0) {
        break label277;
      }
    }
    label277:
    for (int i5 = qal.d(i3);; i5 = 10)
    {
      i += i5 + i4;
      if (this.e != null)
      {
        onu localonu = this.e;
        int i1 = qal.d(32);
        int i2 = localonu.a();
        localonu.ak = i2;
        i += i1 + (i2 + qal.d(i2));
      }
      if (this.f != null)
      {
        ops localops = this.f;
        int m = qal.d(40);
        int n = localops.a();
        localops.ak = n;
        i += m + (n + qal.d(n));
      }
      if (this.g != null)
      {
        onp localonp = this.g;
        int j = qal.d(48);
        int k = localonp.a();
        localonp.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.c != null)
    {
      onn localonn = this.c;
      paramqal.c(18);
      if (localonn.ak < 0) {
        localonn.ak = localonn.a();
      }
      paramqal.c(localonn.ak);
      localonn.a(paramqal);
    }
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.e != null)
    {
      onu localonu = this.e;
      paramqal.c(34);
      if (localonu.ak < 0) {
        localonu.ak = localonu.a();
      }
      paramqal.c(localonu.ak);
      localonu.a(paramqal);
    }
    if (this.f != null)
    {
      ops localops = this.f;
      paramqal.c(42);
      if (localops.ak < 0) {
        localops.ak = localops.a();
      }
      paramqal.c(localops.ak);
      localops.a(paramqal);
    }
    if (this.g != null)
    {
      onp localonp = this.g;
      paramqal.c(50);
      if (localonp.ak < 0) {
        localonp.ak = localonp.a();
      }
      paramqal.c(localonp.ak);
      localonp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oou
 * JD-Core Version:    0.7.0.1
 */