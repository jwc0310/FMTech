public final class nrn
  extends qan<nrn>
{
  public String a = null;
  public okn[] b = okn.b();
  public okn[] c = okn.b();
  public ojv[] d = ojv.b();
  public npt[] e = npt.b();
  
  public nrn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i13 = qal.d(8);
      int i14 = qal.a(str);
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
    if ((this.d != null) && (this.d.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.d.length; i2++)
      {
        ojv localojv = this.d[i2];
        if (localojv != null)
        {
          int i3 = qal.d(32);
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
          npt localnpt = this.e[k];
          if (localnpt != null)
          {
            int m = qal.d(40);
            int n = localnpt.a();
            localnpt.ak = n;
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
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int n = 0; n < this.b.length; n++)
      {
        okn localokn2 = this.b[n];
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
      for (int m = 0; m < this.c.length; m++)
      {
        okn localokn1 = this.c[m];
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
    if ((this.d != null) && (this.d.length > 0)) {
      for (int k = 0; k < this.d.length; k++)
      {
        ojv localojv = this.d[k];
        if (localojv != null)
        {
          paramqal.c(34);
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
          npt localnpt = this.e[j];
          if (localnpt != null)
          {
            paramqal.c(42);
            if (localnpt.ak < 0) {
              localnpt.ak = localnpt.a();
            }
            paramqal.c(localnpt.ak);
            localnpt.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrn
 * JD-Core Version:    0.7.0.1
 */