public final class oel
  extends qan<oel>
{
  public String a = null;
  public int b = -2147483648;
  public String[] c = qay.f;
  public odn[] d = odn.b();
  private int e = -2147483648;
  private String f = null;
  
  public oel()
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
      int i13 = qal.d(8);
      int i14 = qal.a(str3);
      j += i13 + (i14 + qal.d(i14));
    }
    int i10;
    int i11;
    if (this.b != -2147483648)
    {
      i10 = this.b;
      i11 = qal.d(16);
      if (i10 < 0) {
        break label168;
      }
    }
    int i7;
    int i8;
    label168:
    for (int i12 = qal.d(i10);; i12 = i)
    {
      j += i12 + i11;
      if ((this.c == null) || (this.c.length <= 0)) {
        break label184;
      }
      int i6 = 0;
      i7 = 0;
      i8 = 0;
      while (i6 < this.c.length)
      {
        String str2 = this.c[i6];
        if (str2 != null)
        {
          i8++;
          int i9 = qal.a(str2);
          i7 += i9 + qal.d(i9);
        }
        i6++;
      }
    }
    j = j + i7 + i8 * 1;
    label184:
    if (this.e != -2147483648)
    {
      int i4 = this.e;
      int i5 = qal.d(32);
      if (i4 >= 0) {
        i = qal.d(i4);
      }
      j += i5 + i;
    }
    if (this.d != null)
    {
      int n = this.d.length;
      int i1 = 0;
      if (n > 0) {
        while (i1 < this.d.length)
        {
          odn localodn = this.d[i1];
          if (localodn != null)
          {
            int i2 = qal.d(48);
            int i3 = localodn.a();
            localodn.ak = i3;
            j += i2 + (i3 + qal.d(i3));
          }
          i1++;
        }
      }
    }
    if (this.f != null)
    {
      String str1 = this.f;
      int k = qal.d(56);
      int m = qal.a(str1);
      j += k + (m + qal.d(m));
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.b != -2147483648)
    {
      int n = this.b;
      paramqal.c(16);
      paramqal.a(n);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int m = 0; m < this.c.length; m++)
      {
        String str2 = this.c[m];
        if (str2 != null)
        {
          paramqal.c(26);
          paramqal.a(str2);
        }
      }
    }
    if (this.e != -2147483648)
    {
      int k = this.e;
      paramqal.c(32);
      paramqal.a(k);
    }
    if (this.d != null)
    {
      int i = this.d.length;
      int j = 0;
      if (i > 0) {
        while (j < this.d.length)
        {
          odn localodn = this.d[j];
          if (localodn != null)
          {
            paramqal.c(50);
            if (localodn.ak < 0) {
              localodn.ak = localodn.a();
            }
            paramqal.c(localodn.ak);
            localodn.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(58);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oel
 * JD-Core Version:    0.7.0.1
 */