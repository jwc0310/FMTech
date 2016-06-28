public final class nqo
  extends qan<nqo>
{
  public String a = null;
  public okn[] b = okn.b();
  public okn[] c = okn.b();
  public ojv[] d = ojv.b();
  private String e = null;
  private String f = null;
  
  public nqo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i13 = qal.d(8);
      int i14 = qal.a(str3);
      i += i13 + (i14 + qal.d(i14));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i9 = i;
      for (int i10 = 0; i10 < this.b.length; i10++)
      {
        okn localokn2 = this.b[i10];
        if (localokn2 != null)
        {
          int i11 = qal.d(16);
          int i12 = localokn2.a();
          localokn2.ak = i12;
          i9 += i11 + (i12 + qal.d(i12));
        }
      }
      i = i9;
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.c.length; i6++)
      {
        okn localokn1 = this.c[i6];
        if (localokn1 != null)
        {
          int i7 = qal.d(24);
          int i8 = localokn1.a();
          localokn1.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if (this.d != null)
    {
      int i1 = this.d.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.d.length)
        {
          ojv localojv = this.d[i2];
          if (localojv != null)
          {
            int i3 = qal.d(32);
            int i4 = localojv.a();
            localojv.ak = i4;
            i += i3 + (i4 + qal.d(i4));
          }
          i2++;
        }
      }
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int m = qal.d(40);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.f != null)
    {
      String str1 = this.f;
      int j = qal.d(48);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        okn localokn2 = this.b[m];
        if (localokn2 != null)
        {
          paramqal.c(18);
          if (localokn2.ak < 0) {
            localokn2.ak = localokn2.a();
          }
          paramqal.c(localokn2.ak);
          localokn2.a(paramqal);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        okn localokn1 = this.c[k];
        if (localokn1 != null)
        {
          paramqal.c(26);
          if (localokn1.ak < 0) {
            localokn1.ak = localokn1.a();
          }
          paramqal.c(localokn1.ak);
          localokn1.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      int i = this.d.length;
      int j = 0;
      if (i > 0) {
        while (j < this.d.length)
        {
          ojv localojv = this.d[j];
          if (localojv != null)
          {
            paramqal.c(34);
            if (localojv.ak < 0) {
              localojv.ak = localojv.a();
            }
            paramqal.c(localojv.ak);
            localojv.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(50);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqo
 * JD-Core Version:    0.7.0.1
 */