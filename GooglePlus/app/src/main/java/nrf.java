public final class nrf
  extends qan<nrf>
{
  public Long a = null;
  public Long b = null;
  public Integer c = null;
  public nrb[] d = nrb.b();
  public nrb[] e = nrb.b();
  
  public nrf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      long l2 = this.a.longValue();
      i += qal.d(8) + qal.b(l2);
    }
    if (this.b != null)
    {
      long l1 = this.b.longValue();
      i += qal.d(16) + qal.b(l1);
    }
    int i5;
    int i6;
    if (this.c != null)
    {
      i5 = this.c.intValue();
      i6 = qal.d(24);
      if (i5 < 0) {
        break label196;
      }
    }
    int i1;
    label196:
    for (int i7 = qal.d(i5);; i7 = 10)
    {
      i += i7 + i6;
      if ((this.d == null) || (this.d.length <= 0)) {
        break label206;
      }
      i1 = i;
      for (int i2 = 0; i2 < this.d.length; i2++)
      {
        nrb localnrb2 = this.d[i2];
        if (localnrb2 != null)
        {
          int i3 = qal.d(32);
          int i4 = localnrb2.a();
          localnrb2.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
    }
    i = i1;
    label206:
    if (this.e != null)
    {
      int j = this.e.length;
      int k = 0;
      if (j > 0) {
        while (k < this.e.length)
        {
          nrb localnrb1 = this.e[k];
          if (localnrb1 != null)
          {
            int m = qal.d(40);
            int n = localnrb1.a();
            localnrb1.ak = n;
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
      long l2 = this.a.longValue();
      paramqal.c(8);
      paramqal.a(l2);
    }
    if (this.b != null)
    {
      long l1 = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l1);
    }
    if (this.c != null)
    {
      int m = this.c.intValue();
      paramqal.c(24);
      paramqal.a(m);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int k = 0; k < this.d.length; k++)
      {
        nrb localnrb2 = this.d[k];
        if (localnrb2 != null)
        {
          paramqal.c(34);
          if (localnrb2.ak < 0) {
            localnrb2.ak = localnrb2.a();
          }
          paramqal.c(localnrb2.ak);
          localnrb2.a(paramqal);
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
          nrb localnrb1 = this.e[j];
          if (localnrb1 != null)
          {
            paramqal.c(42);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrf
 * JD-Core Version:    0.7.0.1
 */