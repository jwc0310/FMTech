public final class nre
  extends qan<nre>
{
  public nrb[] a = nrb.b();
  public nrb[] b = nrb.b();
  public nrb[] c = nrb.b();
  public Long d = null;
  public nrf e = null;
  
  public nre()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i7 = i;
      for (int i8 = 0; i8 < this.a.length; i8++)
      {
        nrb localnrb3 = this.a[i8];
        if (localnrb3 != null)
        {
          int i9 = qal.d(8);
          int i10 = localnrb3.a();
          localnrb3.ak = i10;
          i7 += i9 + (i10 + qal.d(i10));
        }
      }
      i = i7;
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i3 = i;
      for (int i4 = 0; i4 < this.b.length; i4++)
      {
        nrb localnrb2 = this.b[i4];
        if (localnrb2 != null)
        {
          int i5 = qal.d(16);
          int i6 = localnrb2.a();
          localnrb2.ak = i6;
          i3 += i5 + (i6 + qal.d(i6));
        }
      }
      i = i3;
    }
    if (this.c != null)
    {
      int m = this.c.length;
      int n = 0;
      if (m > 0) {
        while (n < this.c.length)
        {
          nrb localnrb1 = this.c[n];
          if (localnrb1 != null)
          {
            int i1 = qal.d(24);
            int i2 = localnrb1.a();
            localnrb1.ak = i2;
            i += i1 + (i2 + qal.d(i2));
          }
          n++;
        }
      }
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      i += qal.d(32) + qal.b(l);
    }
    if (this.e != null)
    {
      nrf localnrf = this.e;
      int j = qal.d(40);
      int k = localnrf.a();
      localnrf.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int m = 0; m < this.a.length; m++)
      {
        nrb localnrb3 = this.a[m];
        if (localnrb3 != null)
        {
          paramqal.c(10);
          if (localnrb3.ak < 0) {
            localnrb3.ak = localnrb3.a();
          }
          paramqal.c(localnrb3.ak);
          localnrb3.a(paramqal);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        nrb localnrb2 = this.b[k];
        if (localnrb2 != null)
        {
          paramqal.c(18);
          if (localnrb2.ak < 0) {
            localnrb2.ak = localnrb2.a();
          }
          paramqal.c(localnrb2.ak);
          localnrb2.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      int i = this.c.length;
      int j = 0;
      if (i > 0) {
        while (j < this.c.length)
        {
          nrb localnrb1 = this.c[j];
          if (localnrb1 != null)
          {
            paramqal.c(26);
            if (localnrb1.ak < 0) {
              localnrb1.ak = localnrb1.a();
            }
            paramqal.c(localnrb1.ak);
            localnrb1.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      paramqal.c(32);
      paramqal.a(l);
    }
    if (this.e != null)
    {
      nrf localnrf = this.e;
      paramqal.c(42);
      if (localnrf.ak < 0) {
        localnrf.ak = localnrf.a();
      }
      paramqal.c(localnrf.ak);
      localnrf.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nre
 * JD-Core Version:    0.7.0.1
 */