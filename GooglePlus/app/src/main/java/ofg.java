public final class ofg
  extends qan<ofg>
{
  public odk[] a = odk.b();
  public oec[] b = oec.b();
  public odi[] c = odi.b();
  
  public ofg()
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
        odk localodk = this.a[i6];
        if (localodk != null)
        {
          int i7 = qal.d(16);
          int i8 = localodk.a();
          localodk.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.b.length; i2++)
      {
        oec localoec = this.b[i2];
        if (localoec != null)
        {
          int i3 = qal.d(24);
          int i4 = localoec.a();
          localoec.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.c != null)
    {
      int j = this.c.length;
      int k = 0;
      if (j > 0) {
        while (k < this.c.length)
        {
          odi localodi = this.c[k];
          if (localodi != null)
          {
            int m = qal.d(32);
            int n = localodi.a();
            localodi.ak = n;
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
        odk localodk = this.a[m];
        if (localodk != null)
        {
          paramqal.c(18);
          if (localodk.ak < 0) {
            localodk.ak = localodk.a();
          }
          paramqal.c(localodk.ak);
          localodk.a(paramqal);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        oec localoec = this.b[k];
        if (localoec != null)
        {
          paramqal.c(26);
          if (localoec.ak < 0) {
            localoec.ak = localoec.a();
          }
          paramqal.c(localoec.ak);
          localoec.a(paramqal);
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
          odi localodi = this.c[j];
          if (localodi != null)
          {
            paramqal.c(34);
            if (localodi.ak < 0) {
              localodi.ak = localodi.a();
            }
            paramqal.c(localodi.ak);
            localodi.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ofg
 * JD-Core Version:    0.7.0.1
 */