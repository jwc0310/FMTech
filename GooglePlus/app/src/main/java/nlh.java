public final class nlh
  extends qan<nlh>
{
  public String a = null;
  public Integer b = null;
  public Double c = null;
  public int d = -2147483648;
  public int e = -2147483648;
  public Integer f = null;
  private int g = -2147483648;
  private Integer h = null;
  
  public nlh()
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
      String str = this.a;
      int i15 = qal.d(8);
      int i16 = qal.a(str);
      j += i15 + (i16 + qal.d(i16));
    }
    int i14;
    int i11;
    label152:
    int i8;
    label194:
    int i5;
    label236:
    int n;
    int i1;
    if (this.b != null)
    {
      int i12 = this.b.intValue();
      int i13 = qal.d(16);
      if (i12 >= 0)
      {
        i14 = qal.d(i12);
        j += i14 + i13;
      }
    }
    else
    {
      if (this.c != null)
      {
        this.c.doubleValue();
        j += 8 + qal.d(24);
      }
      if (this.d != -2147483648)
      {
        int i9 = this.d;
        int i10 = qal.d(32);
        if (i9 < 0) {
          break label333;
        }
        i11 = qal.d(i9);
        j += i11 + i10;
      }
      if (this.e != -2147483648)
      {
        int i6 = this.e;
        int i7 = qal.d(40);
        if (i6 < 0) {
          break label339;
        }
        i8 = qal.d(i6);
        j += i8 + i7;
      }
      if (this.g != -2147483648)
      {
        int i3 = this.g;
        int i4 = qal.d(48);
        if (i3 < 0) {
          break label345;
        }
        i5 = qal.d(i3);
        j += i5 + i4;
      }
      if (this.f != null)
      {
        n = this.f.intValue();
        i1 = qal.d(56);
        if (n < 0) {
          break label351;
        }
      }
    }
    label333:
    label339:
    label345:
    label351:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.h != null)
      {
        int k = this.h.intValue();
        int m = qal.d(64);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
      i14 = i;
      break;
      i11 = i;
      break label152;
      i8 = i;
      break label194;
      i5 = i;
      break label236;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      int i1 = this.b.intValue();
      paramqal.c(16);
      paramqal.a(i1);
    }
    if (this.c != null)
    {
      double d1 = this.c.doubleValue();
      paramqal.c(25);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.d != -2147483648)
    {
      int n = this.d;
      paramqal.c(32);
      paramqal.a(n);
    }
    if (this.e != -2147483648)
    {
      int m = this.e;
      paramqal.c(40);
      paramqal.a(m);
    }
    if (this.g != -2147483648)
    {
      int k = this.g;
      paramqal.c(48);
      paramqal.a(k);
    }
    if (this.f != null)
    {
      int j = this.f.intValue();
      paramqal.c(56);
      paramqal.a(j);
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
 * Qualified Name:     nlh
 * JD-Core Version:    0.7.0.1
 */