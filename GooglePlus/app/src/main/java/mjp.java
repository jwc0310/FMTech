public final class mjp
  extends qan<mjp>
{
  public mjv a = null;
  public mjm[] b = mjm.b();
  private mjw[] c = mjw.b();
  private String[] d = qay.f;
  
  public mjp()
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
      mjv localmjv = this.a;
      int i9 = qal.d(8);
      int i10 = localmjv.a();
      localmjv.ak = i10;
      j += i9 + (i10 + qal.d(i10));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i5 = j;
      for (int i6 = 0; i6 < this.b.length; i6++)
      {
        mjm localmjm = this.b[i6];
        if (localmjm != null)
        {
          int i7 = qal.d(16);
          int i8 = localmjm.a();
          localmjm.ak = i8;
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
        mjw localmjw = this.c[i2];
        if (localmjw != null)
        {
          int i3 = qal.d(24);
          int i4 = localmjw.a();
          localmjw.ak = i4;
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
      mjv localmjv = this.a;
      paramqal.c(10);
      if (localmjv.ak < 0) {
        localmjv.ak = localmjv.a();
      }
      paramqal.c(localmjv.ak);
      localmjv.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        mjm localmjm = this.b[m];
        if (localmjm != null)
        {
          paramqal.c(18);
          if (localmjm.ak < 0) {
            localmjm.ak = localmjm.a();
          }
          paramqal.c(localmjm.ak);
          localmjm.a(paramqal);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        mjw localmjw = this.c[k];
        if (localmjw != null)
        {
          paramqal.c(26);
          if (localmjw.ak < 0) {
            localmjw.ak = localmjw.a();
          }
          paramqal.c(localmjw.ak);
          localmjw.a(paramqal);
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
 * Qualified Name:     mjp
 * JD-Core Version:    0.7.0.1
 */