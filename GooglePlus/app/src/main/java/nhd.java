public final class nhd
  extends qan<nhd>
{
  public int a = -2147483648;
  public String b = null;
  public ngj c = null;
  public opr d = null;
  private String e = null;
  private String f = null;
  private String g = null;
  private int h = -2147483648;
  private String i = null;
  private Integer j = null;
  private String k = null;
  
  public nhd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = 10;
    int n = super.a();
    if (this.e != null)
    {
      String str6 = this.e;
      int i23 = qal.d(8);
      int i24 = qal.a(str6);
      n += i23 + (i24 + qal.d(i24));
    }
    int i22;
    int i11;
    int i12;
    if (this.a != -2147483648)
    {
      int i20 = this.a;
      int i21 = qal.d(16);
      if (i20 >= 0)
      {
        i22 = qal.d(i20);
        n += i22 + i21;
      }
    }
    else
    {
      if (this.b != null)
      {
        String str5 = this.b;
        int i18 = qal.d(24);
        int i19 = qal.a(str5);
        n += i18 + (i19 + qal.d(i19));
      }
      if (this.f != null)
      {
        String str4 = this.f;
        int i16 = qal.d(32);
        int i17 = qal.a(str4);
        n += i16 + (i17 + qal.d(i17));
      }
      if (this.g != null)
      {
        String str3 = this.g;
        int i14 = qal.d(40);
        int i15 = qal.a(str3);
        n += i14 + (i15 + qal.d(i15));
      }
      if (this.h != -2147483648)
      {
        i11 = this.h;
        i12 = qal.d(48);
        if (i11 < 0) {
          break label480;
        }
      }
    }
    label480:
    for (int i13 = qal.d(i11);; i13 = m)
    {
      n += i13 + i12;
      if (this.i != null)
      {
        String str2 = this.i;
        int i9 = qal.d(56);
        int i10 = qal.a(str2);
        n += i9 + (i10 + qal.d(i10));
      }
      if (this.j != null)
      {
        int i7 = this.j.intValue();
        int i8 = qal.d(64);
        if (i7 >= 0) {
          m = qal.d(i7);
        }
        n += i8 + m;
      }
      if (this.c != null)
      {
        ngj localngj = this.c;
        int i5 = qal.d(72);
        int i6 = localngj.a();
        localngj.ak = i6;
        n += i5 + (i6 + qal.d(i6));
      }
      if (this.k != null)
      {
        String str1 = this.k;
        int i3 = qal.d(80);
        int i4 = qal.a(str1);
        n += i3 + (i4 + qal.d(i4));
      }
      if (this.d != null)
      {
        opr localopr = this.d;
        int i1 = qal.d(88);
        int i2 = localopr.a();
        localopr.ak = i2;
        n += i1 + (i2 + qal.d(i2));
      }
      return n;
      i22 = m;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.e != null)
    {
      String str6 = this.e;
      paramqal.c(10);
      paramqal.a(str6);
    }
    if (this.a != -2147483648)
    {
      int i1 = this.a;
      paramqal.c(16);
      paramqal.a(i1);
    }
    if (this.b != null)
    {
      String str5 = this.b;
      paramqal.c(26);
      paramqal.a(str5);
    }
    if (this.f != null)
    {
      String str4 = this.f;
      paramqal.c(34);
      paramqal.a(str4);
    }
    if (this.g != null)
    {
      String str3 = this.g;
      paramqal.c(42);
      paramqal.a(str3);
    }
    if (this.h != -2147483648)
    {
      int n = this.h;
      paramqal.c(48);
      paramqal.a(n);
    }
    if (this.i != null)
    {
      String str2 = this.i;
      paramqal.c(58);
      paramqal.a(str2);
    }
    if (this.j != null)
    {
      int m = this.j.intValue();
      paramqal.c(64);
      paramqal.a(m);
    }
    if (this.c != null)
    {
      ngj localngj = this.c;
      paramqal.c(74);
      if (localngj.ak < 0) {
        localngj.ak = localngj.a();
      }
      paramqal.c(localngj.ak);
      localngj.a(paramqal);
    }
    if (this.k != null)
    {
      String str1 = this.k;
      paramqal.c(82);
      paramqal.a(str1);
    }
    if (this.d != null)
    {
      opr localopr = this.d;
      paramqal.c(90);
      if (localopr.ak < 0) {
        localopr.ak = localopr.a();
      }
      paramqal.c(localopr.ak);
      localopr.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhd
 * JD-Core Version:    0.7.0.1
 */