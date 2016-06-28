public final class mmw
  extends qan<mmw>
{
  public int a = -2147483648;
  public String b = null;
  public int c = -2147483648;
  private String d = null;
  private String e = null;
  private String[] f = qay.f;
  
  public mmw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = 0;
    int k = super.a();
    int m = this.a;
    int n = qal.d(8);
    if (m >= 0) {}
    int i4;
    for (int i1 = qal.d(m);; i1 = i)
    {
      i2 = k + (i1 + n);
      if (this.d != null)
      {
        String str4 = this.d;
        int i12 = qal.d(16);
        int i13 = qal.a(str4);
        i2 += i12 + (i13 + qal.d(i13));
      }
      if (this.e != null)
      {
        String str3 = this.e;
        int i10 = qal.d(24);
        int i11 = qal.a(str3);
        i2 += i10 + (i11 + qal.d(i11));
      }
      if (this.b != null)
      {
        String str2 = this.b;
        int i8 = qal.d(32);
        int i9 = qal.a(str2);
        i2 += i8 + (i9 + qal.d(i9));
      }
      if (this.c != -2147483648)
      {
        int i6 = this.c;
        int i7 = qal.d(40);
        if (i6 >= 0) {
          i = qal.d(i6);
        }
        i2 += i + i7;
      }
      if ((this.f == null) || (this.f.length <= 0)) {
        break label306;
      }
      int i3 = 0;
      i4 = 0;
      while (i3 < this.f.length)
      {
        String str1 = this.f[i3];
        if (str1 != null)
        {
          j++;
          int i5 = qal.a(str1);
          i4 += i5 + qal.d(i5);
        }
        i3++;
      }
    }
    int i2 = i2 + i4 + j * 1;
    label306:
    return i2;
  }
  
  public final void a(qal paramqal)
  {
    int i = this.a;
    paramqal.c(8);
    paramqal.a(i);
    if (this.d != null)
    {
      String str4 = this.d;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.e != null)
    {
      String str3 = this.e;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.c != -2147483648)
    {
      int k = this.c;
      paramqal.c(40);
      paramqal.a(k);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int j = 0; j < this.f.length; j++)
      {
        String str1 = this.f[j];
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
 * Qualified Name:     mmw
 * JD-Core Version:    0.7.0.1
 */