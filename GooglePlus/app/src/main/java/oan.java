public final class oan
  extends qan<oan>
{
  public int a = -2147483648;
  public oap b = null;
  public oow c = null;
  public int d = -2147483648;
  public osb e = null;
  private oaj f = null;
  private oao g = null;
  private Integer h = null;
  
  public oan()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i15;
    int i16;
    if (this.a != -2147483648)
    {
      int i14 = this.a;
      i15 = qal.d(8);
      if (i14 >= 0) {
        i16 = qal.d(i14);
      }
    }
    for (int k = j + (i16 + i15);; k = j)
    {
      if (this.b != null)
      {
        oap localoap = this.b;
        int i12 = qal.d(16);
        int i13 = localoap.a();
        localoap.ak = i13;
        k += i12 + (i13 + qal.d(i13));
      }
      if (this.f != null)
      {
        oaj localoaj = this.f;
        int i10 = qal.d(24);
        int i11 = localoaj.a();
        localoaj.ak = i11;
        k += i10 + (i11 + qal.d(i11));
      }
      if (this.g != null)
      {
        oao localoao = this.g;
        int i8 = qal.d(32);
        int i9 = localoao.a();
        localoao.ak = i9;
        k += i8 + (i9 + qal.d(i9));
      }
      if (this.c != null)
      {
        oow localoow = this.c;
        int i6 = qal.d(40);
        int i7 = localoow.a();
        localoow.ak = i7;
        k += i6 + (i7 + qal.d(i7));
      }
      int i3;
      int i4;
      if (this.d != -2147483648)
      {
        i3 = this.d;
        i4 = qal.d(48);
        if (i3 < 0) {
          break label381;
        }
      }
      label381:
      for (int i5 = qal.d(i3);; i5 = i)
      {
        k += i5 + i4;
        if (this.e != null)
        {
          osb localosb = this.e;
          int i1 = qal.d(56);
          int i2 = localosb.a();
          localosb.ak = i2;
          k += i1 + (i2 + qal.d(i2));
        }
        if (this.h != null)
        {
          int m = this.h.intValue();
          int n = qal.d(64);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        return k;
        i16 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int k = this.a;
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.b != null)
    {
      oap localoap = this.b;
      paramqal.c(18);
      if (localoap.ak < 0) {
        localoap.ak = localoap.a();
      }
      paramqal.c(localoap.ak);
      localoap.a(paramqal);
    }
    if (this.f != null)
    {
      oaj localoaj = this.f;
      paramqal.c(26);
      if (localoaj.ak < 0) {
        localoaj.ak = localoaj.a();
      }
      paramqal.c(localoaj.ak);
      localoaj.a(paramqal);
    }
    if (this.g != null)
    {
      oao localoao = this.g;
      paramqal.c(34);
      if (localoao.ak < 0) {
        localoao.ak = localoao.a();
      }
      paramqal.c(localoao.ak);
      localoao.a(paramqal);
    }
    if (this.c != null)
    {
      oow localoow = this.c;
      paramqal.c(42);
      if (localoow.ak < 0) {
        localoow.ak = localoow.a();
      }
      paramqal.c(localoow.ak);
      localoow.a(paramqal);
    }
    if (this.d != -2147483648)
    {
      int j = this.d;
      paramqal.c(48);
      paramqal.a(j);
    }
    if (this.e != null)
    {
      osb localosb = this.e;
      paramqal.c(58);
      if (localosb.ak < 0) {
        localosb.ak = localosb.a();
      }
      paramqal.c(localosb.ak);
      localosb.a(paramqal);
    }
    if (this.h != null)
    {
      int i = this.h.intValue();
      paramqal.c(64);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oan
 * JD-Core Version:    0.7.0.1
 */