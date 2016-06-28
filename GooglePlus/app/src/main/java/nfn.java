public final class nfn
  extends qan<nfn>
{
  public ndr[] a = ndr.b();
  public neh[] b = neh.b();
  private String[] c = qay.f;
  
  static
  {
    new qao(11, nfn.class, (int)676693890L, false);
  }
  
  public nfn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.a.length; i6++)
      {
        ndr localndr = this.a[i6];
        if (localndr != null)
        {
          int i7 = qal.d(8);
          int i8 = localndr.a();
          localndr.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      while (i1 < this.c.length)
      {
        String str = this.c[i1];
        if (str != null)
        {
          i3++;
          int i4 = qal.a(str);
          i2 += i4 + qal.d(i4);
        }
        i1++;
      }
      i = i + i2 + i3 * 1;
    }
    if (this.b != null)
    {
      int j = this.b.length;
      int k = 0;
      if (j > 0) {
        while (k < this.b.length)
        {
          neh localneh = this.b[k];
          if (localneh != null)
          {
            int m = qal.d(24);
            int n = localneh.a();
            localneh.ak = n;
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
      for (int m = 0; m < this.a.length; m++)
      {
        ndr localndr = this.a[m];
        if (localndr != null)
        {
          paramqal.c(10);
          if (localndr.ak < 0) {
            localndr.ak = localndr.a();
          }
          paramqal.c(localndr.ak);
          localndr.a(paramqal);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        String str = this.c[k];
        if (str != null)
        {
          paramqal.c(18);
          paramqal.a(str);
        }
      }
    }
    if (this.b != null)
    {
      int i = this.b.length;
      int j = 0;
      if (i > 0) {
        while (j < this.b.length)
        {
          neh localneh = this.b[j];
          if (localneh != null)
          {
            paramqal.c(26);
            if (localneh.ak < 0) {
              localneh.ak = localneh.a();
            }
            paramqal.c(localneh.ak);
            localneh.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nfn
 * JD-Core Version:    0.7.0.1
 */