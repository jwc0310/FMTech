public final class nra
  extends qan<nra>
{
  public nrd a = null;
  public nre b = null;
  public nrc[] c = nrc.b();
  public int d = -2147483648;
  public Integer e = null;
  
  public nra()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.a != null)
    {
      nrd localnrd = this.a;
      int i9 = qal.d(8);
      int i10 = localnrd.a();
      localnrd.ak = i10;
      j += i9 + (i10 + qal.d(i10));
    }
    if (this.b != null)
    {
      nre localnre = this.b;
      int i7 = qal.d(16);
      int i8 = localnre.a();
      localnre.ak = i8;
      j += i7 + (i8 + qal.d(i8));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i3 = j;
      for (int i4 = 0; i4 < this.c.length; i4++)
      {
        nrc localnrc = this.c[i4];
        if (localnrc != null)
        {
          int i5 = qal.d(24);
          int i6 = localnrc.a();
          localnrc.ak = i6;
          i3 += i5 + (i6 + qal.d(i6));
        }
      }
      j = i3;
    }
    int n;
    int i1;
    if (this.d != -2147483648)
    {
      n = this.d;
      i1 = qal.d(32);
      if (n < 0) {
        break label277;
      }
    }
    label277:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.e != null)
      {
        int k = this.e.intValue();
        int m = qal.d(40);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nrd localnrd = this.a;
      paramqal.c(10);
      if (localnrd.ak < 0) {
        localnrd.ak = localnrd.a();
      }
      paramqal.c(localnrd.ak);
      localnrd.a(paramqal);
    }
    if (this.b != null)
    {
      nre localnre = this.b;
      paramqal.c(18);
      if (localnre.ak < 0) {
        localnre.ak = localnre.a();
      }
      paramqal.c(localnre.ak);
      localnre.a(paramqal);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        nrc localnrc = this.c[k];
        if (localnrc != null)
        {
          paramqal.c(26);
          if (localnrc.ak < 0) {
            localnrc.ak = localnrc.a();
          }
          paramqal.c(localnrc.ak);
          localnrc.a(paramqal);
        }
      }
    }
    if (this.d != -2147483648)
    {
      int j = this.d;
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.e != null)
    {
      int i = this.e.intValue();
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nra
 * JD-Core Version:    0.7.0.1
 */