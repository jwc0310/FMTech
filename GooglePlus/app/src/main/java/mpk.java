public final class mpk
  extends qan<mpk>
{
  private String a = null;
  private String b = null;
  private String c = null;
  private String d = null;
  private Long e = null;
  private mpl f = null;
  private int g = -2147483648;
  private String h = null;
  private int i = -2147483648;
  
  public mpk()
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
      String str5 = this.a;
      int i14 = qal.d(8);
      int i15 = qal.a(str5);
      k += i14 + (i15 + qal.d(i15));
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i12 = qal.d(16);
      int i13 = qal.a(str4);
      k += i12 + (i13 + qal.d(i13));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i10 = qal.d(24);
      int i11 = qal.a(str3);
      k += i10 + (i11 + qal.d(i11));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i8 = qal.d(32);
      int i9 = qal.a(str2);
      k += i8 + (i9 + qal.d(i9));
    }
    if (this.f != null)
    {
      mpl localmpl = this.f;
      int i6 = qal.d(40);
      int i7 = localmpl.a();
      localmpl.ak = i7;
      k += i6 + (i7 + qal.d(i7));
    }
    if (this.e != null)
    {
      long l = this.e.longValue();
      k += qal.d(48) + qal.b(l);
    }
    int i3;
    int i4;
    if (this.g != -2147483648)
    {
      i3 = this.g;
      i4 = qal.d(56);
      if (i3 < 0) {
        break label372;
      }
    }
    label372:
    for (int i5 = qal.d(i3);; i5 = j)
    {
      k += i5 + i4;
      if (this.h != null)
      {
        String str1 = this.h;
        int i1 = qal.d(64);
        int i2 = qal.a(str1);
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.i != -2147483648)
      {
        int m = this.i;
        int n = qal.d(72);
        if (m >= 0) {
          j = qal.d(m);
        }
        k += n + j;
      }
      return k;
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
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      mpl localmpl = this.f;
      paramqal.c(42);
      if (localmpl.ak < 0) {
        localmpl.ak = localmpl.a();
      }
      paramqal.c(localmpl.ak);
      localmpl.a(paramqal);
    }
    if (this.e != null)
    {
      long l = this.e.longValue();
      paramqal.c(48);
      paramqal.a(l);
    }
    if (this.g != -2147483648)
    {
      int k = this.g;
      paramqal.c(56);
      paramqal.a(k);
    }
    if (this.h != null)
    {
      String str1 = this.h;
      paramqal.c(66);
      paramqal.a(str1);
    }
    if (this.i != -2147483648)
    {
      int j = this.i;
      paramqal.c(72);
      paramqal.a(j);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpk
 * JD-Core Version:    0.7.0.1
 */