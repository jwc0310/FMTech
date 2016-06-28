public final class ngm
  extends qan<ngm>
{
  public String a = null;
  public String b = null;
  public ngj c = null;
  public omk d = null;
  private String e = null;
  private int f = -2147483648;
  
  public ngm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i8 = qal.d(8);
      int i9 = qal.a(str3);
      i += i8 + (i9 + qal.d(i9));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i6 = qal.d(16);
      int i7 = qal.a(str2);
      i += i6 + (i7 + qal.d(i7));
    }
    if (this.e != null)
    {
      String str1 = this.e;
      int i4 = qal.d(24);
      int i5 = qal.a(str1);
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.d != null)
    {
      omk localomk = this.d;
      int i2 = qal.d(32);
      int i3 = localomk.a();
      localomk.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.f != -2147483648)
    {
      m = this.f;
      n = qal.d(40);
      if (m < 0) {
        break label263;
      }
    }
    label263:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.c != null)
      {
        ngj localngj = this.c;
        int j = qal.d(48);
        int k = localngj.a();
        localngj.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(26);
      paramqal.a(str1);
    }
    if (this.d != null)
    {
      omk localomk = this.d;
      paramqal.c(34);
      if (localomk.ak < 0) {
        localomk.ak = localomk.a();
      }
      paramqal.c(localomk.ak);
      localomk.a(paramqal);
    }
    if (this.f != -2147483648)
    {
      int i = this.f;
      paramqal.c(40);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      ngj localngj = this.c;
      paramqal.c(50);
      if (localngj.ak < 0) {
        localngj.ak = localngj.a();
      }
      paramqal.c(localngj.ak);
      localngj.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ngm
 * JD-Core Version:    0.7.0.1
 */