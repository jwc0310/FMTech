public final class nui
  extends qan<nui>
{
  private String a = null;
  private nuj b = null;
  private String c = null;
  private String d = null;
  private String e = null;
  private Long f = null;
  private Long g = null;
  private int h = -2147483648;
  private nui i = null;
  
  public nui()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    if (this.a != null)
    {
      String str4 = this.a;
      int i11 = qal.d(8);
      int i12 = qal.a(str4);
      j += i11 + (i12 + qal.d(i12));
    }
    if (this.b != null)
    {
      nuj localnuj = this.b;
      int i9 = qal.d(16);
      int i10 = localnuj.a();
      localnuj.ak = i10;
      j += i9 + (i10 + qal.d(i10));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i7 = qal.d(24);
      int i8 = qal.a(str3);
      j += i7 + (i8 + qal.d(i8));
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int i5 = qal.d(32);
      int i6 = qal.a(str2);
      j += i5 + (i6 + qal.d(i6));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int i3 = qal.d(40);
      int i4 = qal.a(str1);
      j += i3 + (i4 + qal.d(i4));
    }
    if (this.f != null)
    {
      long l2 = this.f.longValue();
      j += qal.d(48) + qal.b(l2);
    }
    if (this.g != null)
    {
      long l1 = this.g.longValue();
      j += qal.d(56) + qal.b(l1);
    }
    int n;
    int i1;
    if (this.h != -2147483648)
    {
      n = this.h;
      i1 = qal.d(64);
      if (n < 0) {
        break label364;
      }
    }
    label364:
    for (int i2 = qal.d(n);; i2 = 10)
    {
      j += i2 + i1;
      if (this.i != null)
      {
        nui localnui = this.i;
        int k = qal.d(72);
        int m = localnui.a();
        localnui.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
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
    if (this.b != null)
    {
      nuj localnuj = this.b;
      paramqal.c(18);
      if (localnuj.ak < 0) {
        localnuj.ak = localnuj.a();
      }
      paramqal.c(localnuj.ak);
      localnuj.a(paramqal);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(42);
      paramqal.a(str1);
    }
    if (this.f != null)
    {
      long l2 = this.f.longValue();
      paramqal.c(48);
      paramqal.a(l2);
    }
    if (this.g != null)
    {
      long l1 = this.g.longValue();
      paramqal.c(56);
      paramqal.a(l1);
    }
    if (this.h != -2147483648)
    {
      int j = this.h;
      paramqal.c(64);
      paramqal.a(j);
    }
    if (this.i != null)
    {
      nui localnui = this.i;
      paramqal.c(74);
      if (localnui.ak < 0) {
        localnui.ak = localnui.a();
      }
      paramqal.c(localnui.ak);
      localnui.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nui
 * JD-Core Version:    0.7.0.1
 */