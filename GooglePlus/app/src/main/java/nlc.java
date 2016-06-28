public final class nlc
  extends qan<nlc>
{
  private Integer a = null;
  private int b = -2147483648;
  private nld c = null;
  private nld d = null;
  
  public nlc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i6;
    int i7;
    if (this.a != null)
    {
      int i5 = this.a.intValue();
      i6 = qal.d(8);
      if (i5 >= 0) {
        i7 = qal.d(i5);
      }
    }
    for (int k = j + (i7 + i6);; k = j)
    {
      if (this.b != -2147483648)
      {
        int i3 = this.b;
        int i4 = qal.d(16);
        if (i3 >= 0) {
          i = qal.d(i3);
        }
        k += i + i4;
      }
      if (this.c != null)
      {
        nld localnld2 = this.c;
        int i1 = qal.d(24);
        int i2 = localnld2.a();
        localnld2.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.d != null)
      {
        nld localnld1 = this.d;
        int m = qal.d(32);
        int n = localnld1.a();
        localnld1.ak = n;
        k += m + (n + qal.d(n));
      }
      return k;
      i7 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int j = this.a.intValue();
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      nld localnld2 = this.c;
      paramqal.c(26);
      if (localnld2.ak < 0) {
        localnld2.ak = localnld2.a();
      }
      paramqal.c(localnld2.ak);
      localnld2.a(paramqal);
    }
    if (this.d != null)
    {
      nld localnld1 = this.d;
      paramqal.c(34);
      if (localnld1.ak < 0) {
        localnld1.ak = localnld1.a();
      }
      paramqal.c(localnld1.ak);
      localnld1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nlc
 * JD-Core Version:    0.7.0.1
 */