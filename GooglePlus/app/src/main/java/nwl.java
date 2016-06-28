public final class nwl
  extends qan<nwl>
{
  public nwm a = null;
  public String b = null;
  public String[] c = qay.f;
  public String d = null;
  private nwc e = null;
  private nwc[] f = nwc.b();
  
  public nwl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nwm localnwm = this.a;
      int i11 = qal.d(8);
      int i12 = localnwm.a();
      localnwm.ak = i12;
      i += i11 + (i12 + qal.d(i12));
    }
    if (this.b != null)
    {
      String str3 = this.b;
      int i9 = qal.d(16);
      int i10 = qal.a(str3);
      i += i9 + (i10 + qal.d(i10));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i5 = 0;
      int i6 = 0;
      int i7 = 0;
      while (i5 < this.c.length)
      {
        String str2 = this.c[i5];
        if (str2 != null)
        {
          i7++;
          int i8 = qal.a(str2);
          i6 += i8 + qal.d(i8);
        }
        i5++;
      }
      i = i + i6 + i7 * 1;
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int i3 = qal.d(32);
      int i4 = qal.a(str1);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.e != null)
    {
      nwc localnwc2 = this.e;
      int i1 = qal.d(40);
      int i2 = localnwc2.a();
      localnwc2.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.f != null)
    {
      int j = this.f.length;
      int k = 0;
      if (j > 0) {
        while (k < this.f.length)
        {
          nwc localnwc1 = this.f[k];
          if (localnwc1 != null)
          {
            int m = qal.d(48);
            int n = localnwc1.a();
            localnwc1.ak = n;
            i += m + (n + qal.d(n));
          }
          k++;
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nwm localnwm = this.a;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        String str2 = this.c[k];
        if (str2 != null)
        {
          paramqal.c(26);
          paramqal.a(str2);
        }
      }
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      nwc localnwc2 = this.e;
      paramqal.c(42);
      if (localnwc2.ak < 0) {
        localnwc2.ak = localnwc2.a();
      }
      paramqal.c(localnwc2.ak);
      localnwc2.a(paramqal);
    }
    if (this.f != null)
    {
      int i = this.f.length;
      int j = 0;
      if (i > 0) {
        while (j < this.f.length)
        {
          nwc localnwc1 = this.f[j];
          if (localnwc1 != null)
          {
            paramqal.c(50);
            if (localnwc1.ak < 0) {
              localnwc1.ak = localnwc1.a();
            }
            paramqal.c(localnwc1.ak);
            localnwc1.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwl
 * JD-Core Version:    0.7.0.1
 */