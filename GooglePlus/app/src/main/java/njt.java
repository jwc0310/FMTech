public final class njt
  extends qan<njt>
{
  public String a = null;
  public int b = -2147483648;
  public String c = null;
  public int d = -2147483648;
  public Integer e = null;
  private Long f = null;
  private String g = null;
  private String h = null;
  private int i = -2147483648;
  private Integer j = null;
  private Integer k = null;
  
  public njt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = 10;
    int n = super.a();
    if (this.a != null)
    {
      String str4 = this.a;
      int i24 = qal.d(8);
      int i25 = qal.a(str4);
      n += i24 + (i25 + qal.d(i25));
    }
    int i23;
    int i16;
    label237:
    int i11;
    label321:
    int i8;
    label363:
    int i3;
    int i4;
    if (this.b != -2147483648)
    {
      int i21 = this.b;
      int i22 = qal.d(16);
      if (i21 >= 0)
      {
        i23 = qal.d(i21);
        n += i23 + i22;
      }
    }
    else
    {
      if (this.f != null)
      {
        long l = this.f.longValue();
        n += qal.d(24) + qal.b(l);
      }
      if (this.g != null)
      {
        String str3 = this.g;
        int i19 = qal.d(32);
        int i20 = qal.a(str3);
        n += i19 + (i20 + qal.d(i20));
      }
      if (this.c != null)
      {
        String str2 = this.c;
        int i17 = qal.d(40);
        int i18 = qal.a(str2);
        n += i17 + (i18 + qal.d(i18));
      }
      if (this.d != -2147483648)
      {
        int i14 = this.d;
        int i15 = qal.d(48);
        if (i14 < 0) {
          break label460;
        }
        i16 = qal.d(i14);
        n += i16 + i15;
      }
      if (this.h != null)
      {
        String str1 = this.h;
        int i12 = qal.d(56);
        int i13 = qal.a(str1);
        n += i12 + (i13 + qal.d(i13));
      }
      if (this.e != null)
      {
        int i9 = this.e.intValue();
        int i10 = qal.d(64);
        if (i9 < 0) {
          break label466;
        }
        i11 = qal.d(i9);
        n += i11 + i10;
      }
      if (this.i != -2147483648)
      {
        int i6 = this.i;
        int i7 = qal.d(72);
        if (i6 < 0) {
          break label472;
        }
        i8 = qal.d(i6);
        n += i8 + i7;
      }
      if (this.j != null)
      {
        i3 = this.j.intValue();
        i4 = qal.d(80);
        if (i3 < 0) {
          break label478;
        }
      }
    }
    label460:
    label466:
    label472:
    label478:
    for (int i5 = qal.d(i3);; i5 = m)
    {
      n += i5 + i4;
      if (this.k != null)
      {
        int i1 = this.k.intValue();
        int i2 = qal.d(88);
        if (i1 >= 0) {
          m = qal.d(i1);
        }
        n += i2 + m;
      }
      return n;
      i23 = m;
      break;
      i16 = m;
      break label237;
      i11 = m;
      break label321;
      i8 = m;
      break label363;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(10);
      paramqal.a(str4);
    }
    if (this.b != -2147483648)
    {
      int i4 = this.b;
      paramqal.c(16);
      paramqal.a(i4);
    }
    if (this.f != null)
    {
      long l = this.f.longValue();
      paramqal.c(24);
      paramqal.a(l);
    }
    if (this.g != null)
    {
      String str3 = this.g;
      paramqal.c(34);
      paramqal.a(str3);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.d != -2147483648)
    {
      int i3 = this.d;
      paramqal.c(48);
      paramqal.a(i3);
    }
    if (this.h != null)
    {
      String str1 = this.h;
      paramqal.c(58);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      int i2 = this.e.intValue();
      paramqal.c(64);
      paramqal.a(i2);
    }
    if (this.i != -2147483648)
    {
      int i1 = this.i;
      paramqal.c(72);
      paramqal.a(i1);
    }
    if (this.j != null)
    {
      int n = this.j.intValue();
      paramqal.c(80);
      paramqal.a(n);
    }
    if (this.k != null)
    {
      int m = this.k.intValue();
      paramqal.c(88);
      paramqal.a(m);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     njt
 * JD-Core Version:    0.7.0.1
 */