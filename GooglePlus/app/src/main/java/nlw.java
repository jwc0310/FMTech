public final class nlw
  extends qan<nlw>
{
  private nlu[] a = nlu.b();
  private nlv[] b = nlv.b();
  private Integer c = null;
  
  public nlw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i4 = i;
      for (int i5 = 0; i5 < this.a.length; i5++)
      {
        nlu localnlu = this.a[i5];
        if (localnlu != null)
        {
          int i6 = qal.d(8);
          int i7 = localnlu.a();
          localnlu.ak = i7;
          i4 += i6 + (i7 + qal.d(i7));
        }
      }
      i = i4;
    }
    if (this.b != null)
    {
      int n = this.b.length;
      int i1 = 0;
      if (n > 0) {
        while (i1 < this.b.length)
        {
          nlv localnlv = this.b[i1];
          if (localnlv != null)
          {
            int i2 = qal.d(16);
            int i3 = localnlv.a();
            localnlv.ak = i3;
            i += i2 + (i3 + qal.d(i3));
          }
          i1++;
        }
      }
    }
    int j;
    int k;
    if (this.c != null)
    {
      j = this.c.intValue();
      k = qal.d(24);
      if (j < 0) {
        break label223;
      }
    }
    label223:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int m = 0; m < this.a.length; m++)
      {
        nlu localnlu = this.a[m];
        if (localnlu != null)
        {
          paramqal.c(10);
          if (localnlu.ak < 0) {
            localnlu.ak = localnlu.a();
          }
          paramqal.c(localnlu.ak);
          localnlu.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      int j = this.b.length;
      int k = 0;
      if (j > 0) {
        while (k < this.b.length)
        {
          nlv localnlv = this.b[k];
          if (localnlv != null)
          {
            paramqal.c(18);
            if (localnlv.ak < 0) {
              localnlv.ak = localnlv.a();
            }
            paramqal.c(localnlv.ak);
            localnlv.a(paramqal);
          }
          k++;
        }
      }
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(24);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nlw
 * JD-Core Version:    0.7.0.1
 */