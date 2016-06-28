public final class mkl
  extends qan<mkl>
{
  public mku a = null;
  public mkf[] b = mkf.b();
  private mkw[] c = mkw.b();
  private String[] d = qay.f;
  
  public mkl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null)
    {
      mku localmku = this.a;
      int i9 = qal.d(8);
      int i10 = localmku.a();
      localmku.ak = i10;
      j += i9 + (i10 + qal.d(i10));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i5 = j;
      for (int i6 = 0; i6 < this.b.length; i6++)
      {
        mkf localmkf = this.b[i6];
        if (localmkf != null)
        {
          int i7 = qal.d(16);
          int i8 = localmkf.a();
          localmkf.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      j = i5;
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i1 = j;
      for (int i2 = 0; i2 < this.c.length; i2++)
      {
        mkw localmkw = this.c[i2];
        if (localmkw != null)
        {
          int i3 = qal.d(24);
          int i4 = localmkw.a();
          localmkw.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      j = i1;
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.d.length)
      {
        String str = this.d[i];
        if (str != null)
        {
          m++;
          int n = qal.a(str);
          k += n + qal.d(n);
        }
        i++;
      }
      j = j + k + m * 1;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mku localmku = this.a;
      paramqal.c(10);
      if (localmku.ak < 0) {
        localmku.ak = localmku.a();
      }
      paramqal.c(localmku.ak);
      localmku.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        mkf localmkf = this.b[m];
        if (localmkf != null)
        {
          paramqal.c(18);
          if (localmkf.ak < 0) {
            localmkf.ak = localmkf.a();
          }
          paramqal.c(localmkf.ak);
          localmkf.a(paramqal);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        mkw localmkw = this.c[k];
        if (localmkw != null)
        {
          paramqal.c(26);
          if (localmkw.ak < 0) {
            localmkw.ak = localmkw.a();
          }
          paramqal.c(localmkw.ak);
          localmkw.a(paramqal);
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
          String str = this.d[j];
          if (str != null)
          {
            paramqal.c(34);
            paramqal.a(str);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkl
 * JD-Core Version:    0.7.0.1
 */