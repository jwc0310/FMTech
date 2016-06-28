public final class ooa
  extends qan<ooa>
{
  private static volatile ooa[] f;
  public int a = -2147483648;
  public String b = null;
  public String c = null;
  public String d = null;
  public onz[] e = onz.b();
  private String g = null;
  private String h = null;
  private String i = null;
  private Integer j = null;
  
  public ooa()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ooa[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new ooa[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int k = 10;
    int m = super.a();
    int i20;
    int i21;
    if (this.a != -2147483648)
    {
      int i19 = this.a;
      i20 = qal.d(8);
      if (i19 >= 0) {
        i21 = qal.d(i19);
      }
    }
    for (int n = m + (i21 + i20);; n = m)
    {
      if (this.g != null)
      {
        String str6 = this.g;
        int i17 = qal.d(16);
        int i18 = qal.a(str6);
        n += i17 + (i18 + qal.d(i18));
      }
      if (this.b != null)
      {
        String str5 = this.b;
        int i15 = qal.d(24);
        int i16 = qal.a(str5);
        n += i15 + (i16 + qal.d(i16));
      }
      if (this.c != null)
      {
        String str4 = this.c;
        int i13 = qal.d(32);
        int i14 = qal.a(str4);
        n += i13 + (i14 + qal.d(i14));
      }
      if (this.h != null)
      {
        String str3 = this.h;
        int i11 = qal.d(40);
        int i12 = qal.a(str3);
        n += i11 + (i12 + qal.d(i12));
      }
      if (this.i != null)
      {
        String str2 = this.i;
        int i9 = qal.d(48);
        int i10 = qal.a(str2);
        n += i9 + (i10 + qal.d(i10));
      }
      if ((this.e != null) && (this.e.length > 0))
      {
        int i5 = n;
        int i6 = 0;
        for (;;)
        {
          if (i6 < this.e.length)
          {
            onz localonz = this.e[i6];
            if (localonz != null)
            {
              int i7 = qal.d(56);
              int i8 = localonz.a();
              localonz.ak = i8;
              i5 += i7 + (i8 + qal.d(i8));
            }
            i6++;
            continue;
            i21 = k;
            break;
          }
        }
        n = i5;
      }
      if (this.d != null)
      {
        String str1 = this.d;
        int i3 = qal.d(64);
        int i4 = qal.a(str1);
        n += i3 + (i4 + qal.d(i4));
      }
      if (this.j != null)
      {
        int i1 = this.j.intValue();
        int i2 = qal.d(72);
        if (i1 >= 0) {
          k = qal.d(i1);
        }
        n += k + i2;
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int n = this.a;
      paramqal.c(8);
      paramqal.a(n);
    }
    if (this.g != null)
    {
      String str6 = this.g;
      paramqal.c(18);
      paramqal.a(str6);
    }
    if (this.b != null)
    {
      String str5 = this.b;
      paramqal.c(26);
      paramqal.a(str5);
    }
    if (this.c != null)
    {
      String str4 = this.c;
      paramqal.c(34);
      paramqal.a(str4);
    }
    if (this.h != null)
    {
      String str3 = this.h;
      paramqal.c(42);
      paramqal.a(str3);
    }
    if (this.i != null)
    {
      String str2 = this.i;
      paramqal.c(50);
      paramqal.a(str2);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int m = 0; m < this.e.length; m++)
      {
        onz localonz = this.e[m];
        if (localonz != null)
        {
          paramqal.c(58);
          if (localonz.ak < 0) {
            localonz.ak = localonz.a();
          }
          paramqal.c(localonz.ak);
          localonz.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(66);
      paramqal.a(str1);
    }
    if (this.j != null)
    {
      int k = this.j.intValue();
      paramqal.c(72);
      paramqal.a(k);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ooa
 * JD-Core Version:    0.7.0.1
 */