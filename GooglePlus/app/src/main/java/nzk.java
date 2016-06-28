public final class nzk
  extends qan<nzk>
{
  public ope a = null;
  public String b = null;
  private nzi c = null;
  private Integer d = null;
  private opu e = null;
  private String f = null;
  private int g = -2147483648;
  
  public nzk()
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
      ope localope = this.a;
      int i11 = qal.d(8);
      int i12 = localope.a();
      localope.ak = i12;
      j += i11 + (i12 + qal.d(i12));
    }
    if (this.c != null)
    {
      nzi localnzi = this.c;
      int i9 = qal.d(16);
      int i10 = localnzi.a();
      localnzi.ak = i10;
      j += i9 + (i10 + qal.d(i10));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i7 = qal.d(24);
      int i8 = qal.a(str2);
      j += i7 + (i8 + qal.d(i8));
    }
    int i4;
    int i5;
    if (this.d != null)
    {
      i4 = this.d.intValue();
      i5 = qal.d(32);
      if (i4 < 0) {
        break label316;
      }
    }
    label316:
    for (int i6 = qal.d(i4);; i6 = i)
    {
      j += i6 + i5;
      if (this.e != null)
      {
        opu localopu = this.e;
        int i2 = qal.d(40);
        int i3 = localopu.a();
        localopu.ak = i3;
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.f != null)
      {
        String str1 = this.f;
        int n = qal.d(48);
        int i1 = qal.a(str1);
        j += n + (i1 + qal.d(i1));
      }
      if (this.g != -2147483648)
      {
        int k = this.g;
        int m = qal.d(56);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ope localope = this.a;
      paramqal.c(10);
      if (localope.ak < 0) {
        localope.ak = localope.a();
      }
      paramqal.c(localope.ak);
      localope.a(paramqal);
    }
    if (this.c != null)
    {
      nzi localnzi = this.c;
      paramqal.c(18);
      if (localnzi.ak < 0) {
        localnzi.ak = localnzi.a();
      }
      paramqal.c(localnzi.ak);
      localnzi.a(paramqal);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      int j = this.d.intValue();
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.e != null)
    {
      opu localopu = this.e;
      paramqal.c(42);
      if (localopu.ak < 0) {
        localopu.ak = localopu.a();
      }
      paramqal.c(localopu.ak);
      localopu.a(paramqal);
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(50);
      paramqal.a(str1);
    }
    if (this.g != -2147483648)
    {
      int i = this.g;
      paramqal.c(56);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzk
 * JD-Core Version:    0.7.0.1
 */