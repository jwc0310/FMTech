public final class njg
  extends qan<njg>
{
  public njj[] a = njj.b();
  public nin b = null;
  private nin[] c = nin.b();
  private nio[] d = nio.b();
  private nje[] e = nje.b();
  
  public njg()
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
        njj localnjj = this.a[i12];
        if (localnjj != null)
        {
          int i13 = qal.d(8);
          int i14 = localnjj.a();
          localnjj.ak = i14;
          i11 += i13 + (i14 + qal.d(i14));
        }
      }
      i = i11;
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i7 = i;
      for (int i8 = 0; i8 < this.c.length; i8++)
      {
        nin localnin2 = this.c[i8];
        if (localnin2 != null)
        {
          int i9 = qal.d(16);
          int i10 = localnin2.a();
          localnin2.ak = i10;
          i7 += i9 + (i10 + qal.d(i10));
        }
      }
      i = i7;
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i3 = i;
      for (int i4 = 0; i4 < this.d.length; i4++)
      {
        nio localnio = this.d[i4];
        if (localnio != null)
        {
          int i5 = qal.d(24);
          int i6 = localnio.a();
          localnio.ak = i6;
          i3 += i5 + (i6 + qal.d(i6));
        }
      }
      i = i3;
    }
    if (this.e != null)
    {
      int m = this.e.length;
      int n = 0;
      if (m > 0) {
        while (n < this.e.length)
        {
          nje localnje = this.e[n];
          if (localnje != null)
          {
            int i1 = qal.d(32);
            int i2 = localnje.a();
            localnje.ak = i2;
            i += i1 + (i2 + qal.d(i2));
          }
          n++;
        }
      }
    }
    if (this.b != null)
    {
      nin localnin1 = this.b;
      int j = qal.d(40);
      int k = localnin1.a();
      localnin1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int n = 0; n < this.a.length; n++)
      {
        njj localnjj = this.a[n];
        if (localnjj != null)
        {
          paramqal.c(10);
          if (localnjj.ak < 0) {
            localnjj.ak = localnjj.a();
          }
          paramqal.c(localnjj.ak);
          localnjj.a(paramqal);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int m = 0; m < this.c.length; m++)
      {
        nin localnin2 = this.c[m];
        if (localnin2 != null)
        {
          paramqal.c(18);
          if (localnin2.ak < 0) {
            localnin2.ak = localnin2.a();
          }
          paramqal.c(localnin2.ak);
          localnin2.a(paramqal);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int k = 0; k < this.d.length; k++)
      {
        nio localnio = this.d[k];
        if (localnio != null)
        {
          paramqal.c(26);
          if (localnio.ak < 0) {
            localnio.ak = localnio.a();
          }
          paramqal.c(localnio.ak);
          localnio.a(paramqal);
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
          nje localnje = this.e[j];
          if (localnje != null)
          {
            paramqal.c(34);
            if (localnje.ak < 0) {
              localnje.ak = localnje.a();
            }
            paramqal.c(localnje.ak);
            localnje.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.b != null)
    {
      nin localnin1 = this.b;
      paramqal.c(42);
      if (localnin1.ak < 0) {
        localnin1.ak = localnin1.a();
      }
      paramqal.c(localnin1.ak);
      localnin1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     njg
 * JD-Core Version:    0.7.0.1
 */