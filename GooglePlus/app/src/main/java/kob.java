public final class kob
  extends qan<kob>
{
  public koe[] a = koe.b();
  public koc[] b = koc.b();
  public kof[] c = kof.b();
  public kod[] d = kod.b();
  public String e = null;
  
  public kob()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i11 = i;
      for (int i12 = 0; i12 < this.a.length; i12++)
      {
        koe localkoe = this.a[i12];
        if (localkoe != null)
        {
          int i13 = qal.d(8);
          int i14 = localkoe.a();
          localkoe.ak = i14;
          i11 += i13 + (i14 + qal.d(i14));
        }
      }
      i = i11;
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i7 = i;
      for (int i8 = 0; i8 < this.b.length; i8++)
      {
        koc localkoc = this.b[i8];
        if (localkoc != null)
        {
          int i9 = qal.d(16);
          int i10 = localkoc.a();
          localkoc.ak = i10;
          i7 += i9 + (i10 + qal.d(i10));
        }
      }
      i = i7;
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i3 = i;
      for (int i4 = 0; i4 < this.c.length; i4++)
      {
        kof localkof = this.c[i4];
        if (localkof != null)
        {
          int i5 = qal.d(24);
          int i6 = localkof.a();
          localkof.ak = i6;
          i3 += i5 + (i6 + qal.d(i6));
        }
      }
      i = i3;
    }
    if (this.d != null)
    {
      int m = this.d.length;
      int n = 0;
      if (m > 0) {
        while (n < this.d.length)
        {
          kod localkod = this.d[n];
          if (localkod != null)
          {
            int i1 = qal.d(32);
            int i2 = localkod.a();
            localkod.ak = i2;
            i += i1 + (i2 + qal.d(i2));
          }
          n++;
        }
      }
    }
    if (this.e != null)
    {
      String str = this.e;
      int j = qal.d(40);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int n = 0; n < this.a.length; n++)
      {
        koe localkoe = this.a[n];
        if (localkoe != null)
        {
          paramqal.c(10);
          if (localkoe.ak < 0) {
            localkoe.ak = localkoe.a();
          }
          paramqal.c(localkoe.ak);
          localkoe.a(paramqal);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        koc localkoc = this.b[m];
        if (localkoc != null)
        {
          paramqal.c(18);
          if (localkoc.ak < 0) {
            localkoc.ak = localkoc.a();
          }
          paramqal.c(localkoc.ak);
          localkoc.a(paramqal);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        kof localkof = this.c[k];
        if (localkof != null)
        {
          paramqal.c(26);
          if (localkof.ak < 0) {
            localkof.ak = localkof.a();
          }
          paramqal.c(localkof.ak);
          localkof.a(paramqal);
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
          kod localkod = this.d[j];
          if (localkod != null)
          {
            paramqal.c(34);
            if (localkod.ak < 0) {
              localkod.ak = localkod.a();
            }
            paramqal.c(localkod.ak);
            localkod.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.e != null)
    {
      String str = this.e;
      paramqal.c(42);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kob
 * JD-Core Version:    0.7.0.1
 */