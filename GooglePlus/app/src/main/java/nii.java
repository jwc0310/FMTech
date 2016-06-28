public final class nii
  extends qan<nii>
{
  private int[] a = qay.a;
  private nin[] b = nin.b();
  private nio[] c = nio.b();
  private njd[] d = njd.b();
  
  public nii()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i11;
    if ((this.a != null) && (this.a.length > 0))
    {
      int i10 = 0;
      i11 = 0;
      if (i10 < this.a.length)
      {
        int i12 = this.a[i10];
        if (i12 >= 0) {}
        for (int i13 = qal.d(i12);; i13 = 10)
        {
          i11 += i13;
          i10++;
          break;
        }
      }
    }
    for (int j = i + i11 + 1 * this.a.length;; j = i)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int i6 = j;
        for (int i7 = 0; i7 < this.b.length; i7++)
        {
          nin localnin = this.b[i7];
          if (localnin != null)
          {
            int i8 = qal.d(16);
            int i9 = localnin.a();
            localnin.ak = i9;
            i6 += i8 + (i9 + qal.d(i9));
          }
        }
        j = i6;
      }
      if ((this.c != null) && (this.c.length > 0))
      {
        int i2 = j;
        for (int i3 = 0; i3 < this.c.length; i3++)
        {
          nio localnio = this.c[i3];
          if (localnio != null)
          {
            int i4 = qal.d(24);
            int i5 = localnio.a();
            localnio.ak = i5;
            i2 += i4 + (i5 + qal.d(i5));
          }
        }
        j = i2;
      }
      if (this.d != null)
      {
        int k = this.d.length;
        int m = 0;
        if (k > 0) {
          while (m < this.d.length)
          {
            njd localnjd = this.d[m];
            if (localnjd != null)
            {
              int n = qal.d(32);
              int i1 = localnjd.a();
              localnjd.ak = i1;
              j += n + (i1 + qal.d(i1));
            }
            m++;
          }
        }
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int n = 0; n < this.a.length; n++)
      {
        int i1 = this.a[n];
        paramqal.c(8);
        paramqal.a(i1);
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        nin localnin = this.b[m];
        if (localnin != null)
        {
          paramqal.c(18);
          if (localnin.ak < 0) {
            localnin.ak = localnin.a();
          }
          paramqal.c(localnin.ak);
          localnin.a(paramqal);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        nio localnio = this.c[k];
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
    if (this.d != null)
    {
      int i = this.d.length;
      int j = 0;
      if (i > 0) {
        while (j < this.d.length)
        {
          njd localnjd = this.d[j];
          if (localnjd != null)
          {
            paramqal.c(34);
            if (localnjd.ak < 0) {
              localnjd.ak = localnjd.a();
            }
            paramqal.c(localnjd.ak);
            localnjd.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nii
 * JD-Core Version:    0.7.0.1
 */