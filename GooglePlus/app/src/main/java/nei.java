public final class nei
  extends qan<nei>
{
  static final nei[] a = new nei[0];
  public ndy b = null;
  public ndp c = null;
  public int d = -2147483648;
  public ndz e = null;
  public int f = -2147483648;
  public String[] g = qay.f;
  public String h = null;
  
  static
  {
    new qao(11, nei.class, (int)433630874L, false);
  }
  
  public nei()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = 0;
    int k = super.a();
    if (this.b != null)
    {
      ndy localndy = this.b;
      int i13 = qal.d(8);
      int i14 = localndy.a();
      localndy.ak = i14;
      k += i13 + (i14 + qal.d(i14));
    }
    if (this.c != null)
    {
      ndp localndp = this.c;
      int i11 = qal.d(16);
      int i12 = localndp.a();
      localndp.ak = i12;
      k += i11 + (i12 + qal.d(i12));
    }
    int i8;
    int i9;
    if (this.d != -2147483648)
    {
      i8 = this.d;
      i9 = qal.d(24);
      if (i8 < 0) {
        break label308;
      }
    }
    int i2;
    label308:
    for (int i10 = qal.d(i8);; i10 = i)
    {
      k += i10 + i9;
      if (this.e != null)
      {
        ndz localndz = this.e;
        int i6 = qal.d(32);
        int i7 = localndz.a();
        localndz.ak = i7;
        k += i6 + (i7 + qal.d(i7));
      }
      if (this.f != -2147483648)
      {
        int i4 = this.f;
        int i5 = qal.d(40);
        if (i4 >= 0) {
          i = qal.d(i4);
        }
        k += i5 + i;
      }
      if ((this.g == null) || (this.g.length <= 0)) {
        break label323;
      }
      int i1 = 0;
      i2 = 0;
      while (i1 < this.g.length)
      {
        String str2 = this.g[i1];
        if (str2 != null)
        {
          i2++;
          int i3 = qal.a(str2);
          j += i3 + qal.d(i3);
        }
        i1++;
      }
    }
    k = k + j + i2 * 1;
    label323:
    if (this.h != null)
    {
      String str1 = this.h;
      int m = qal.d(56);
      int n = qal.a(str1);
      k += m + (n + qal.d(n));
    }
    return k;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      ndy localndy = this.b;
      paramqal.c(10);
      if (localndy.ak < 0) {
        localndy.ak = localndy.a();
      }
      paramqal.c(localndy.ak);
      localndy.a(paramqal);
    }
    if (this.c != null)
    {
      ndp localndp = this.c;
      paramqal.c(18);
      if (localndp.ak < 0) {
        localndp.ak = localndp.a();
      }
      paramqal.c(localndp.ak);
      localndp.a(paramqal);
    }
    if (this.d != -2147483648)
    {
      int k = this.d;
      paramqal.c(24);
      paramqal.a(k);
    }
    if (this.e != null)
    {
      ndz localndz = this.e;
      paramqal.c(34);
      if (localndz.ak < 0) {
        localndz.ak = localndz.a();
      }
      paramqal.c(localndz.ak);
      localndz.a(paramqal);
    }
    if (this.f != -2147483648)
    {
      int j = this.f;
      paramqal.c(40);
      paramqal.a(j);
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int i = 0; i < this.g.length; i++)
      {
        String str2 = this.g[i];
        if (str2 != null)
        {
          paramqal.c(50);
          paramqal.a(str2);
        }
      }
    }
    if (this.h != null)
    {
      String str1 = this.h;
      paramqal.c(58);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nei
 * JD-Core Version:    0.7.0.1
 */