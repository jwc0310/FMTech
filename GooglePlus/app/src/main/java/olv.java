public final class olv
  extends qan<olv>
{
  private String a = null;
  private String b = null;
  private String c = null;
  private Integer d = null;
  private int e = -2147483648;
  private String[] f = qay.f;
  
  public olv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = 0;
    int k = super.a();
    if (this.a != null)
    {
      String str4 = this.a;
      int i11 = qal.d(8);
      int i12 = qal.a(str4);
      k += i11 + (i12 + qal.d(i12));
    }
    if (this.b != null)
    {
      String str3 = this.b;
      int i9 = qal.d(16);
      int i10 = qal.a(str3);
      k += i9 + (i10 + qal.d(i10));
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int i7 = qal.d(24);
      int i8 = qal.a(str2);
      k += i7 + (i8 + qal.d(i8));
    }
    int i4;
    int i5;
    if (this.d != null)
    {
      i4 = this.d.intValue();
      i5 = qal.d(32);
      if (i4 < 0) {
        break label288;
      }
    }
    int n;
    label288:
    for (int i6 = qal.d(i4);; i6 = i)
    {
      k += i6 + i5;
      if (this.e != -2147483648)
      {
        int i2 = this.e;
        int i3 = qal.d(40);
        if (i2 >= 0) {
          i = qal.d(i2);
        }
        k += i3 + i;
      }
      if ((this.f == null) || (this.f.length <= 0)) {
        return k;
      }
      int m = 0;
      n = 0;
      while (m < this.f.length)
      {
        String str1 = this.f[m];
        if (str1 != null)
        {
          n++;
          int i1 = qal.a(str1);
          j += i1 + qal.d(i1);
        }
        m++;
      }
    }
    k = k + j + n * 1;
    return k;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(10);
      paramqal.a(str4);
    }
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      int k = this.d.intValue();
      paramqal.c(32);
      paramqal.a(k);
    }
    if (this.e != -2147483648)
    {
      int j = this.e;
      paramqal.c(40);
      paramqal.a(j);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i = 0; i < this.f.length; i++)
      {
        String str1 = this.f[i];
        if (str1 != null)
        {
          paramqal.c(50);
          paramqal.a(str1);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olv
 * JD-Core Version:    0.7.0.1
 */