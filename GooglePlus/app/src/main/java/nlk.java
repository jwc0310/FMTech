public final class nlk
  extends qan<nlk>
{
  private static volatile nlk[] a;
  private String b = null;
  private Integer c = null;
  private int d = -2147483648;
  private Integer e = null;
  private Integer f = null;
  private Integer g = null;
  private Integer h = null;
  private Integer i = null;
  
  public nlk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nlk[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nlk[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int j = 10;
    int k = super.a();
    if (this.b != null)
    {
      String str = this.b;
      int i19 = qal.d(8);
      int i20 = qal.a(str);
      k += i19 + (i20 + qal.d(i20));
    }
    int i18;
    int i15;
    label126:
    int i12;
    label169:
    int i9;
    label212:
    int i6;
    label255:
    int i1;
    int i2;
    if (this.c != null)
    {
      int i16 = this.c.intValue();
      int i17 = qal.d(16);
      if (i16 >= 0)
      {
        i18 = qal.d(i16);
        k += i18 + i17;
      }
    }
    else
    {
      if (this.d != -2147483648)
      {
        int i13 = this.d;
        int i14 = qal.d(24);
        if (i13 < 0) {
          break label352;
        }
        i15 = qal.d(i13);
        k += i15 + i14;
      }
      if (this.e != null)
      {
        int i10 = this.e.intValue();
        int i11 = qal.d(32);
        if (i10 < 0) {
          break label358;
        }
        i12 = qal.d(i10);
        k += i12 + i11;
      }
      if (this.f != null)
      {
        int i7 = this.f.intValue();
        int i8 = qal.d(40);
        if (i7 < 0) {
          break label364;
        }
        i9 = qal.d(i7);
        k += i9 + i8;
      }
      if (this.g != null)
      {
        int i4 = this.g.intValue();
        int i5 = qal.d(48);
        if (i4 < 0) {
          break label370;
        }
        i6 = qal.d(i4);
        k += i6 + i5;
      }
      if (this.h != null)
      {
        i1 = this.h.intValue();
        i2 = qal.d(56);
        if (i1 < 0) {
          break label376;
        }
      }
    }
    label352:
    label358:
    label364:
    label370:
    label376:
    for (int i3 = qal.d(i1);; i3 = j)
    {
      k += i3 + i2;
      if (this.i != null)
      {
        int m = this.i.intValue();
        int n = qal.d(64);
        if (m >= 0) {
          j = qal.d(m);
        }
        k += n + j;
      }
      return k;
      i18 = j;
      break;
      i15 = j;
      break label126;
      i12 = j;
      break label169;
      i9 = j;
      break label212;
      i6 = j;
      break label255;
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
      int i3 = this.c.intValue();
      paramqal.c(16);
      paramqal.a(i3);
    }
    if (this.d != -2147483648)
    {
      int i2 = this.d;
      paramqal.c(24);
      paramqal.a(i2);
    }
    if (this.e != null)
    {
      int i1 = this.e.intValue();
      paramqal.c(32);
      paramqal.a(i1);
    }
    if (this.f != null)
    {
      int n = this.f.intValue();
      paramqal.c(40);
      paramqal.a(n);
    }
    if (this.g != null)
    {
      int m = this.g.intValue();
      paramqal.c(48);
      paramqal.a(m);
    }
    if (this.h != null)
    {
      int k = this.h.intValue();
      paramqal.c(56);
      paramqal.a(k);
    }
    if (this.i != null)
    {
      int j = this.i.intValue();
      paramqal.c(64);
      paramqal.a(j);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nlk
 * JD-Core Version:    0.7.0.1
 */