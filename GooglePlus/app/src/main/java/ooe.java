public final class ooe
  extends qan<ooe>
{
  private static volatile ooe[] h;
  public oof a = null;
  public int b = -2147483648;
  public String c = null;
  public int d = -2147483648;
  public String e = null;
  public oih f = null;
  public opl g = null;
  private String i = null;
  
  public ooe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ooe[] b()
  {
    if (h == null) {}
    synchronized (qar.a)
    {
      if (h == null) {
        h = new ooe[0];
      }
      return h;
    }
  }
  
  protected final int a()
  {
    int j = 10;
    int k = super.a();
    if (this.a != null)
    {
      oof localoof = this.a;
      int i14 = qal.d(8);
      int i15 = localoof.a();
      localoof.ak = i15;
      k += i14 + (i15 + qal.d(i15));
    }
    int i11;
    int i12;
    if (this.b != -2147483648)
    {
      i11 = this.b;
      i12 = qal.d(16);
      if (i11 < 0) {
        break label357;
      }
    }
    label357:
    for (int i13 = qal.d(i11);; i13 = j)
    {
      k += i13 + i12;
      if (this.c != null)
      {
        String str3 = this.c;
        int i9 = qal.d(24);
        int i10 = qal.a(str3);
        k += i9 + (i10 + qal.d(i10));
      }
      if (this.d != -2147483648)
      {
        int i7 = this.d;
        int i8 = qal.d(32);
        if (i7 >= 0) {
          j = qal.d(i7);
        }
        k += i8 + j;
      }
      if (this.e != null)
      {
        String str2 = this.e;
        int i5 = qal.d(40);
        int i6 = qal.a(str2);
        k += i5 + (i6 + qal.d(i6));
      }
      if (this.f != null)
      {
        oih localoih = this.f;
        int i3 = qal.d(48);
        int i4 = localoih.a();
        localoih.ak = i4;
        k += i3 + (i4 + qal.d(i4));
      }
      if (this.g != null)
      {
        opl localopl = this.g;
        int i1 = qal.d(56);
        int i2 = localopl.a();
        localopl.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.i != null)
      {
        String str1 = this.i;
        int m = qal.d(64);
        int n = qal.a(str1);
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oof localoof = this.a;
      paramqal.c(10);
      if (localoof.ak < 0) {
        localoof.ak = localoof.a();
      }
      paramqal.c(localoof.ak);
      localoof.a(paramqal);
    }
    if (this.b != -2147483648)
    {
      int k = this.b;
      paramqal.c(16);
      paramqal.a(k);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.d != -2147483648)
    {
      int j = this.d;
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      oih localoih = this.f;
      paramqal.c(50);
      if (localoih.ak < 0) {
        localoih.ak = localoih.a();
      }
      paramqal.c(localoih.ak);
      localoih.a(paramqal);
    }
    if (this.g != null)
    {
      opl localopl = this.g;
      paramqal.c(58);
      if (localopl.ak < 0) {
        localopl.ak = localopl.a();
      }
      paramqal.c(localopl.ak);
      localopl.a(paramqal);
    }
    if (this.i != null)
    {
      String str1 = this.i;
      paramqal.c(66);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ooe
 * JD-Core Version:    0.7.0.1
 */