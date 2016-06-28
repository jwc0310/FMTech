public final class nzt
  extends qan<nzt>
{
  public nzs a = null;
  public nzk b = null;
  public nzz c = null;
  public nzp[] d = nzp.b();
  private String e = null;
  private nzv f = null;
  private int g = -2147483648;
  private int h = -2147483648;
  private nzn i = null;
  
  public nzt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = 10;
    int k = super.a();
    if (this.a != null)
    {
      nzs localnzs = this.a;
      int i18 = qal.d(8);
      int i19 = localnzs.a();
      localnzs.ak = i19;
      k += i18 + (i19 + qal.d(i19));
    }
    if (this.b != null)
    {
      nzk localnzk = this.b;
      int i16 = qal.d(16);
      int i17 = localnzk.a();
      localnzk.ak = i17;
      k += i16 + (i17 + qal.d(i17));
    }
    if (this.e != null)
    {
      String str = this.e;
      int i14 = qal.d(24);
      int i15 = qal.a(str);
      k += i14 + (i15 + qal.d(i15));
    }
    if (this.f != null)
    {
      nzv localnzv = this.f;
      int i12 = qal.d(40);
      int i13 = localnzv.a();
      localnzv.ak = i13;
      k += i12 + (i13 + qal.d(i13));
    }
    int i9;
    int i10;
    if (this.g != -2147483648)
    {
      i9 = this.g;
      i10 = qal.d(48);
      if (i9 < 0) {
        break label411;
      }
    }
    int i1;
    label411:
    for (int i11 = qal.d(i9);; i11 = j)
    {
      k += i11 + i10;
      if (this.c != null)
      {
        nzz localnzz = this.c;
        int i7 = qal.d(64);
        int i8 = localnzz.a();
        localnzz.ak = i8;
        k += i7 + (i8 + qal.d(i8));
      }
      if (this.h != -2147483648)
      {
        int i5 = this.h;
        int i6 = qal.d(72);
        if (i5 >= 0) {
          j = qal.d(i5);
        }
        k += i6 + j;
      }
      if ((this.d == null) || (this.d.length <= 0)) {
        break label420;
      }
      i1 = k;
      for (int i2 = 0; i2 < this.d.length; i2++)
      {
        nzp localnzp = this.d[i2];
        if (localnzp != null)
        {
          int i3 = qal.d(80);
          int i4 = localnzp.a();
          localnzp.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
    }
    k = i1;
    label420:
    if (this.i != null)
    {
      nzn localnzn = this.i;
      int m = qal.d(88);
      int n = localnzn.a();
      localnzn.ak = n;
      k += m + (n + qal.d(n));
    }
    return k;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nzs localnzs = this.a;
      paramqal.c(10);
      if (localnzs.ak < 0) {
        localnzs.ak = localnzs.a();
      }
      paramqal.c(localnzs.ak);
      localnzs.a(paramqal);
    }
    if (this.b != null)
    {
      nzk localnzk = this.b;
      paramqal.c(18);
      if (localnzk.ak < 0) {
        localnzk.ak = localnzk.a();
      }
      paramqal.c(localnzk.ak);
      localnzk.a(paramqal);
    }
    if (this.e != null)
    {
      String str = this.e;
      paramqal.c(26);
      paramqal.a(str);
    }
    if (this.f != null)
    {
      nzv localnzv = this.f;
      paramqal.c(42);
      if (localnzv.ak < 0) {
        localnzv.ak = localnzv.a();
      }
      paramqal.c(localnzv.ak);
      localnzv.a(paramqal);
    }
    if (this.g != -2147483648)
    {
      int m = this.g;
      paramqal.c(48);
      paramqal.a(m);
    }
    if (this.c != null)
    {
      nzz localnzz = this.c;
      paramqal.c(66);
      if (localnzz.ak < 0) {
        localnzz.ak = localnzz.a();
      }
      paramqal.c(localnzz.ak);
      localnzz.a(paramqal);
    }
    if (this.h != -2147483648)
    {
      int k = this.h;
      paramqal.c(72);
      paramqal.a(k);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int j = 0; j < this.d.length; j++)
      {
        nzp localnzp = this.d[j];
        if (localnzp != null)
        {
          paramqal.c(82);
          if (localnzp.ak < 0) {
            localnzp.ak = localnzp.a();
          }
          paramqal.c(localnzp.ak);
          localnzp.a(paramqal);
        }
      }
    }
    if (this.i != null)
    {
      nzn localnzn = this.i;
      paramqal.c(90);
      if (localnzn.ak < 0) {
        localnzn.ak = localnzn.a();
      }
      paramqal.c(localnzn.ak);
      localnzn.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzt
 * JD-Core Version:    0.7.0.1
 */