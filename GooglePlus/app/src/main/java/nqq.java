public final class nqq
  extends qan<nqq>
{
  public String a = null;
  public String b = null;
  public okn[] c = okn.b();
  public ojv[] d = ojv.b();
  public pre[] e = pre.b();
  private okn[] f = okn.b();
  
  public nqq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i15 = qal.d(8);
      int i16 = qal.a(str2);
      i += i15 + (i16 + qal.d(i16));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int i13 = qal.d(16);
      int i14 = qal.a(str1);
      i += i13 + (i14 + qal.d(i14));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i9 = i;
      for (int i10 = 0; i10 < this.c.length; i10++)
      {
        okn localokn2 = this.c[i10];
        if (localokn2 != null)
        {
          int i11 = qal.d(24);
          int i12 = localokn2.a();
          localokn2.ak = i12;
          i9 += i11 + (i12 + qal.d(i12));
        }
      }
      i = i9;
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.f.length; i6++)
      {
        okn localokn1 = this.f[i6];
        if (localokn1 != null)
        {
          int i7 = qal.d(32);
          int i8 = localokn1.a();
          localokn1.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.d.length; i2++)
      {
        ojv localojv = this.d[i2];
        if (localojv != null)
        {
          int i3 = qal.d(40);
          int i4 = localojv.a();
          localojv.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.e != null)
    {
      int j = this.e.length;
      int k = 0;
      if (j > 0) {
        while (k < this.e.length)
        {
          pre localpre = this.e[k];
          if (localpre != null)
          {
            int m = qal.d(48);
            int n = localpre.a();
            localpre.ak = n;
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
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int n = 0; n < this.c.length; n++)
      {
        okn localokn2 = this.c[n];
        if (localokn2 != null)
        {
          paramqal.c(26);
          if (localokn2.ak < 0) {
            localokn2.ak = localokn2.a();
          }
          paramqal.c(localokn2.ak);
          localokn2.a(paramqal);
        }
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int m = 0; m < this.f.length; m++)
      {
        okn localokn1 = this.f[m];
        if (localokn1 != null)
        {
          paramqal.c(34);
          if (localokn1.ak < 0) {
            localokn1.ak = localokn1.a();
          }
          paramqal.c(localokn1.ak);
          localokn1.a(paramqal);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int k = 0; k < this.d.length; k++)
      {
        ojv localojv = this.d[k];
        if (localojv != null)
        {
          paramqal.c(42);
          if (localojv.ak < 0) {
            localojv.ak = localojv.a();
          }
          paramqal.c(localojv.ak);
          localojv.a(paramqal);
        }
      }
    }
    if (this.e != null)
    {
      int i = this.e.length;
      int j = 0;
      if (i > 0) {
        while (j < this.e.length)
        {
          pre localpre = this.e[j];
          if (localpre != null)
          {
            paramqal.c(50);
            if (localpre.ak < 0) {
              localpre.ak = localpre.a();
            }
            paramqal.c(localpre.ak);
            localpre.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqq
 * JD-Core Version:    0.7.0.1
 */