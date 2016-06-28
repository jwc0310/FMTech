public final class nxe
  extends qan<nxe>
{
  public String a = null;
  public nxf b = null;
  public String c = null;
  private nwm d = null;
  private nxf[] e = nxf.b();
  private String f = null;
  private String g = null;
  
  public nxe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.d != null)
    {
      nwm localnwm = this.d;
      int i11 = qal.d(8);
      int i12 = localnwm.a();
      localnwm.ak = i12;
      i += i11 + (i12 + qal.d(i12));
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i7 = i;
      for (int i8 = 0; i8 < this.e.length; i8++)
      {
        nxf localnxf2 = this.e[i8];
        if (localnxf2 != null)
        {
          int i9 = qal.d(16);
          int i10 = localnxf2.a();
          localnxf2.ak = i10;
          i7 += i9 + (i10 + qal.d(i10));
        }
      }
      i = i7;
    }
    if (this.a != null)
    {
      String str4 = this.a;
      int i5 = qal.d(24);
      int i6 = qal.a(str4);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.f != null)
    {
      String str3 = this.f;
      int i3 = qal.d(32);
      int i4 = qal.a(str3);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      nxf localnxf1 = this.b;
      int i1 = qal.d(40);
      int i2 = localnxf1.a();
      localnxf1.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
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
  
  public final void a(qal paramqal)
  {
    if (this.d != null)
    {
      nwm localnwm = this.d;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i = 0; i < this.e.length; i++)
      {
        nxf localnxf2 = this.e[i];
        if (localnxf2 != null)
        {
          paramqal.c(18);
          if (localnxf2.ak < 0) {
            localnxf2.ak = localnxf2.a();
          }
          paramqal.c(localnxf2.ak);
          localnxf2.a(paramqal);
        }
      }
    }
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(26);
      paramqal.a(str4);
    }
    if (this.f != null)
    {
      String str3 = this.f;
      paramqal.c(34);
      paramqal.a(str3);
    }
    if (this.b != null)
    {
      nxf localnxf1 = this.b;
      paramqal.c(42);
      if (localnxf1.ak < 0) {
        localnxf1.ak = localnxf1.a();
      }
      paramqal.c(localnxf1.ak);
      localnxf1.a(paramqal);
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
 * Qualified Name:     nxe
 * JD-Core Version:    0.7.0.1
 */