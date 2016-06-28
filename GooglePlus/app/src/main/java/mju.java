public final class mju
  extends qan<mju>
{
  public mjq a = null;
  public mjs[] b = mjs.b();
  public String c = null;
  public String d = null;
  public String e = null;
  private mjr[] f = mjr.b();
  private mjq g = null;
  private mjq h = null;
  
  public mju()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mjq localmjq3 = this.a;
      int i15 = qal.d(8);
      int i16 = localmjq3.a();
      localmjq3.ak = i16;
      i += i15 + (i16 + qal.d(i16));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i11 = i;
      for (int i12 = 0; i12 < this.b.length; i12++)
      {
        mjs localmjs = this.b[i12];
        if (localmjs != null)
        {
          int i13 = qal.d(16);
          int i14 = localmjs.a();
          localmjs.ak = i14;
          i11 += i13 + (i14 + qal.d(i14));
        }
      }
      i = i11;
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i9 = qal.d(24);
      int i10 = qal.a(str3);
      i += i9 + (i10 + qal.d(i10));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i7 = qal.d(32);
      int i8 = qal.a(str2);
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.f != null)
    {
      int i3 = this.f.length;
      int i4 = 0;
      if (i3 > 0) {
        while (i4 < this.f.length)
        {
          mjr localmjr = this.f[i4];
          if (localmjr != null)
          {
            int i5 = qal.d(40);
            int i6 = localmjr.a();
            localmjr.ak = i6;
            i += i5 + (i6 + qal.d(i6));
          }
          i4++;
        }
      }
    }
    if (this.e != null)
    {
      String str1 = this.e;
      int i1 = qal.d(48);
      int i2 = qal.a(str1);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.g != null)
    {
      mjq localmjq2 = this.g;
      int m = qal.d(56);
      int n = localmjq2.a();
      localmjq2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.h != null)
    {
      mjq localmjq1 = this.h;
      int j = qal.d(64);
      int k = localmjq1.a();
      localmjq1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mjq localmjq3 = this.a;
      paramqal.c(10);
      if (localmjq3.ak < 0) {
        localmjq3.ak = localmjq3.a();
      }
      paramqal.c(localmjq3.ak);
      localmjq3.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        mjs localmjs = this.b[k];
        if (localmjs != null)
        {
          paramqal.c(18);
          if (localmjs.ak < 0) {
            localmjs.ak = localmjs.a();
          }
          paramqal.c(localmjs.ak);
          localmjs.a(paramqal);
        }
      }
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
      int i = this.f.length;
      int j = 0;
      if (i > 0) {
        while (j < this.f.length)
        {
          mjr localmjr = this.f[j];
          if (localmjr != null)
          {
            paramqal.c(42);
            if (localmjr.ak < 0) {
              localmjr.ak = localmjr.a();
            }
            paramqal.c(localmjr.ak);
            localmjr.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(50);
      paramqal.a(str1);
    }
    if (this.g != null)
    {
      mjq localmjq2 = this.g;
      paramqal.c(58);
      if (localmjq2.ak < 0) {
        localmjq2.ak = localmjq2.a();
      }
      paramqal.c(localmjq2.ak);
      localmjq2.a(paramqal);
    }
    if (this.h != null)
    {
      mjq localmjq1 = this.h;
      paramqal.c(66);
      if (localmjq1.ak < 0) {
        localmjq1.ak = localmjq1.a();
      }
      paramqal.c(localmjq1.ak);
      localmjq1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mju
 * JD-Core Version:    0.7.0.1
 */