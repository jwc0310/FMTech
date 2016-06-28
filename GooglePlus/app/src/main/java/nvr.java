public final class nvr
  extends qan<nvr>
{
  public nxs[] a = nxs.b();
  public nxq[] b = nxq.b();
  public nxp[] c = nxp.b();
  public nxr[] d = nxr.b();
  
  public nvr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i9 = i;
      for (int i10 = 0; i10 < this.a.length; i10++)
      {
        nxs localnxs = this.a[i10];
        if (localnxs != null)
        {
          int i11 = qal.d(8);
          int i12 = localnxs.a();
          localnxs.ak = i12;
          i9 += i11 + (i12 + qal.d(i12));
        }
      }
      i = i9;
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.b.length; i6++)
      {
        nxq localnxq = this.b[i6];
        if (localnxq != null)
        {
          int i7 = qal.d(16);
          int i8 = localnxq.a();
          localnxq.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.c.length; i2++)
      {
        nxp localnxp = this.c[i2];
        if (localnxp != null)
        {
          int i3 = qal.d(24);
          int i4 = localnxp.a();
          localnxp.ak = i4;
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
          nxr localnxr = this.d[k];
          if (localnxr != null)
          {
            int m = qal.d(32);
            int n = localnxr.a();
            localnxr.ak = n;
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
    if ((this.a != null) && (this.a.length > 0)) {
      for (int n = 0; n < this.a.length; n++)
      {
        nxs localnxs = this.a[n];
        if (localnxs != null)
        {
          paramqal.c(10);
          if (localnxs.ak < 0) {
            localnxs.ak = localnxs.a();
          }
          paramqal.c(localnxs.ak);
          localnxs.a(paramqal);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        nxq localnxq = this.b[m];
        if (localnxq != null)
        {
          paramqal.c(18);
          if (localnxq.ak < 0) {
            localnxq.ak = localnxq.a();
          }
          paramqal.c(localnxq.ak);
          localnxq.a(paramqal);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        nxp localnxp = this.c[k];
        if (localnxp != null)
        {
          paramqal.c(26);
          if (localnxp.ak < 0) {
            localnxp.ak = localnxp.a();
          }
          paramqal.c(localnxp.ak);
          localnxp.a(paramqal);
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
          nxr localnxr = this.d[j];
          if (localnxr != null)
          {
            paramqal.c(34);
            if (localnxr.ak < 0) {
              localnxr.ak = localnxr.a();
            }
            paramqal.c(localnxr.ak);
            localnxr.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nvr
 * JD-Core Version:    0.7.0.1
 */