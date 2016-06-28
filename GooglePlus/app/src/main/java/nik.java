public final class nik
  extends qan<nik>
{
  private String a = null;
  private int b = -2147483648;
  private String c = null;
  private String d = null;
  private String e = null;
  private int f = -2147483648;
  private String g = null;
  private Integer h = null;
  private Integer i = null;
  private Integer j = null;
  
  public nik()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = 10;
    int m = super.a();
    if (this.a != null)
    {
      String str5 = this.a;
      int i22 = qal.d(8);
      int i23 = qal.a(str5);
      m += i22 + (i23 + qal.d(i23));
    }
    int i21;
    int i12;
    label248:
    int i7;
    label332:
    int i2;
    int i3;
    if (this.b != -2147483648)
    {
      int i19 = this.b;
      int i20 = qal.d(16);
      if (i19 >= 0)
      {
        i21 = qal.d(i19);
        m += i21 + i20;
      }
    }
    else
    {
      if (this.c != null)
      {
        String str4 = this.c;
        int i17 = qal.d(24);
        int i18 = qal.a(str4);
        m += i17 + (i18 + qal.d(i18));
      }
      if (this.d != null)
      {
        String str3 = this.d;
        int i15 = qal.d(32);
        int i16 = qal.a(str3);
        m += i15 + (i16 + qal.d(i16));
      }
      if (this.e != null)
      {
        String str2 = this.e;
        int i13 = qal.d(40);
        int i14 = qal.a(str2);
        m += i13 + (i14 + qal.d(i14));
      }
      if (this.f != -2147483648)
      {
        int i10 = this.f;
        int i11 = qal.d(48);
        if (i10 < 0) {
          break label429;
        }
        i12 = qal.d(i10);
        m += i12 + i11;
      }
      if (this.g != null)
      {
        String str1 = this.g;
        int i8 = qal.d(56);
        int i9 = qal.a(str1);
        m += i8 + (i9 + qal.d(i9));
      }
      if (this.h != null)
      {
        int i5 = this.h.intValue();
        int i6 = qal.d(64);
        if (i5 < 0) {
          break label435;
        }
        i7 = qal.d(i5);
        m += i7 + i6;
      }
      if (this.i != null)
      {
        i2 = this.i.intValue();
        i3 = qal.d(80);
        if (i2 < 0) {
          break label441;
        }
      }
    }
    label429:
    label435:
    label441:
    for (int i4 = qal.d(i2);; i4 = k)
    {
      m += i4 + i3;
      if (this.j != null)
      {
        int n = this.j.intValue();
        int i1 = qal.d(88);
        if (n >= 0) {
          k = qal.d(n);
        }
        m += i1 + k;
      }
      return m;
      i21 = k;
      break;
      i12 = k;
      break label248;
      i7 = k;
      break label332;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str5 = this.a;
      paramqal.c(10);
      paramqal.a(str5);
    }
    if (this.b != -2147483648)
    {
      int i2 = this.b;
      paramqal.c(16);
      paramqal.a(i2);
    }
    if (this.c != null)
    {
      String str4 = this.c;
      paramqal.c(26);
      paramqal.a(str4);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      paramqal.c(34);
      paramqal.a(str3);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.f != -2147483648)
    {
      int i1 = this.f;
      paramqal.c(48);
      paramqal.a(i1);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(58);
      paramqal.a(str1);
    }
    if (this.h != null)
    {
      int n = this.h.intValue();
      paramqal.c(64);
      paramqal.a(n);
    }
    if (this.i != null)
    {
      int m = this.i.intValue();
      paramqal.c(80);
      paramqal.a(m);
    }
    if (this.j != null)
    {
      int k = this.j.intValue();
      paramqal.c(88);
      paramqal.a(k);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nik
 * JD-Core Version:    0.7.0.1
 */