public final class ogp
  extends qan<ogp>
{
  public String a = null;
  public String b = null;
  public String c = null;
  public int d = -2147483648;
  private onh e = null;
  private int f = -2147483648;
  
  public ogp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i9 = qal.d(8);
      int i10 = qal.a(str3);
      j += i9 + (i10 + qal.d(i10));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i7 = qal.d(16);
      int i8 = qal.a(str2);
      j += i7 + (i8 + qal.d(i8));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int i5 = qal.d(24);
      int i6 = qal.a(str1);
      j += i5 + (i6 + qal.d(i6));
    }
    if (this.e != null)
    {
      onh localonh = this.e;
      int i3 = qal.d(32);
      int i4 = localonh.a();
      localonh.ak = i4;
      j += i3 + (i4 + qal.d(i4));
    }
    int n;
    int i1;
    if (this.d != -2147483648)
    {
      n = this.d;
      i1 = qal.d(40);
      if (n < 0) {
        break label260;
      }
    }
    label260:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.f != -2147483648)
      {
        int k = this.f;
        int m = qal.d(48);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
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
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(26);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      onh localonh = this.e;
      paramqal.c(34);
      if (localonh.ak < 0) {
        localonh.ak = localonh.a();
      }
      paramqal.c(localonh.ak);
      localonh.a(paramqal);
    }
    if (this.d != -2147483648)
    {
      int j = this.d;
      paramqal.c(40);
      paramqal.a(j);
    }
    if (this.f != -2147483648)
    {
      int i = this.f;
      paramqal.c(48);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogp
 * JD-Core Version:    0.7.0.1
 */