public final class nqs
  extends qan<nqs>
{
  public String a = null;
  public String b = null;
  public okn[] c = okn.b();
  public ojv[] d = ojv.b();
  private okn[] e = okn.b();
  
  public nqs()
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
      int i11 = qal.d(8);
      int i12 = qal.a(str2);
      i += i11 + (i12 + qal.d(i12));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int i9 = qal.d(16);
      int i10 = qal.a(str1);
      i += i9 + (i10 + qal.d(i10));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.c.length; i6++)
      {
        okn localokn2 = this.c[i6];
        if (localokn2 != null)
        {
          int i7 = qal.d(24);
          int i8 = localokn2.a();
          localokn2.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.e.length; i2++)
      {
        okn localokn1 = this.e[i2];
        if (localokn1 != null)
        {
          int i3 = qal.d(32);
          int i4 = localokn1.a();
          localokn1.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.d != null)
    {
      int j = this.d.length;
      int k = 0;
      if (j > 0) {
        while (k < this.d.length)
        {
          ojv localojv = this.d[k];
          if (localojv != null)
          {
            int m = qal.d(40);
            int n = localojv.a();
            localojv.ak = n;
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
      for (int m = 0; m < this.c.length; m++)
      {
        okn localokn2 = this.c[m];
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
    if ((this.e != null) && (this.e.length > 0)) {
      for (int k = 0; k < this.e.length; k++)
      {
        okn localokn1 = this.e[k];
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
            paramqal.c(42);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqs
 * JD-Core Version:    0.7.0.1
 */