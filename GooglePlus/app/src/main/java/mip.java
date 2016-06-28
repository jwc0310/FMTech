public final class mip
  extends qan<mip>
{
  private static volatile mip[] d;
  public Integer a = null;
  public miq[] b = miq.b();
  public mik[] c = mik.b();
  private mir e = null;
  
  public mip()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mip[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new mip[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int i9;
    int i10;
    if (this.a != null)
    {
      int i8 = this.a.intValue();
      i9 = qal.d(8);
      if (i8 >= 0) {
        i10 = qal.d(i8);
      }
    }
    for (int j = i + (i10 + i9);; j = i)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int i4 = j;
        int i5 = 0;
        for (;;)
        {
          if (i5 < this.b.length)
          {
            miq localmiq = this.b[i5];
            if (localmiq != null)
            {
              int i6 = qal.d(16);
              int i7 = localmiq.a();
              localmiq.ak = i7;
              i4 += i6 + (i7 + qal.d(i7));
            }
            i5++;
            continue;
            i10 = 10;
            break;
          }
        }
        j = i4;
      }
      if (this.c != null)
      {
        int n = this.c.length;
        int i1 = 0;
        if (n > 0) {
          while (i1 < this.c.length)
          {
            mik localmik = this.c[i1];
            if (localmik != null)
            {
              int i2 = qal.d(24);
              int i3 = localmik.a();
              localmik.ak = i3;
              j += i2 + (i3 + qal.d(i3));
            }
            i1++;
          }
        }
      }
      if (this.e != null)
      {
        mir localmir = this.e;
        int k = qal.d(32);
        int m = localmir.a();
        localmir.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int m = this.a.intValue();
      paramqal.c(8);
      paramqal.a(m);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        miq localmiq = this.b[k];
        if (localmiq != null)
        {
          paramqal.c(18);
          if (localmiq.ak < 0) {
            localmiq.ak = localmiq.a();
          }
          paramqal.c(localmiq.ak);
          localmiq.a(paramqal);
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
          mik localmik = this.c[j];
          if (localmik != null)
          {
            paramqal.c(26);
            if (localmik.ak < 0) {
              localmik.ak = localmik.a();
            }
            paramqal.c(localmik.ak);
            localmik.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.e != null)
    {
      mir localmir = this.e;
      paramqal.c(34);
      if (localmir.ak < 0) {
        localmir.ak = localmir.a();
      }
      paramqal.c(localmir.ak);
      localmir.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mip
 * JD-Core Version:    0.7.0.1
 */