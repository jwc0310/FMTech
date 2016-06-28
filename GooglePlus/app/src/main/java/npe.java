public final class npe
  extends qan<npe>
{
  public String a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public int e = -2147483648;
  private String f = null;
  private String g = null;
  
  public npe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str6 = this.b;
      int i10 = qal.d(8);
      int i11 = qal.a(str6);
      i += i10 + (i11 + qal.d(i11));
    }
    if (this.d != null)
    {
      String str5 = this.d;
      int i8 = qal.d(16);
      int i9 = qal.a(str5);
      i += i8 + (i9 + qal.d(i9));
    }
    if (this.f != null)
    {
      String str4 = this.f;
      int i6 = qal.d(24);
      int i7 = qal.a(str4);
      i += i6 + (i7 + qal.d(i7));
    }
    if (this.a != null)
    {
      String str3 = this.a;
      int i4 = qal.d(32);
      int i5 = qal.a(str3);
      i += i4 + (i5 + qal.d(i5));
    }
    int i1;
    int i2;
    if (this.e != -2147483648)
    {
      i1 = this.e;
      i2 = qal.d(40);
      if (i1 < 0) {
        break label291;
      }
    }
    label291:
    for (int i3 = qal.d(i1);; i3 = 10)
    {
      i += i3 + i2;
      if (this.c != null)
      {
        String str2 = this.c;
        int m = qal.d(48);
        int n = qal.a(str2);
        i += m + (n + qal.d(n));
      }
      if (this.g != null)
      {
        String str1 = this.g;
        int j = qal.d(56);
        int k = qal.a(str1);
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str6 = this.b;
      paramqal.c(10);
      paramqal.a(str6);
    }
    if (this.d != null)
    {
      String str5 = this.d;
      paramqal.c(18);
      paramqal.a(str5);
    }
    if (this.f != null)
    {
      String str4 = this.f;
      paramqal.c(26);
      paramqal.a(str4);
    }
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(34);
      paramqal.a(str3);
    }
    if (this.e != -2147483648)
    {
      int i = this.e;
      paramqal.c(40);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(50);
      paramqal.a(str2);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(58);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npe
 * JD-Core Version:    0.7.0.1
 */