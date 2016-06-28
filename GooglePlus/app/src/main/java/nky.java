public final class nky
  extends qan<nky>
{
  private nla a = null;
  private Integer b = null;
  private Integer c = null;
  private nkz[] d = nkz.b();
  private nla[] e = nla.b();
  private nlp f = null;
  private int g = -2147483648;
  
  public nky()
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
      nla localnla2 = this.a;
      int i16 = qal.d(8);
      int i17 = localnla2.a();
      localnla2.ak = i17;
      j += i16 + (i17 + qal.d(i17));
    }
    int i15;
    int i10;
    int i11;
    if (this.b != null)
    {
      int i13 = this.b.intValue();
      int i14 = qal.d(16);
      if (i13 >= 0)
      {
        i15 = qal.d(i13);
        j += i15 + i14;
      }
    }
    else if (this.c != null)
    {
      i10 = this.c.intValue();
      i11 = qal.d(24);
      if (i10 < 0) {
        break label236;
      }
    }
    int i6;
    label236:
    for (int i12 = qal.d(i10);; i12 = i)
    {
      j += i12 + i11;
      if ((this.d == null) || (this.d.length <= 0)) {
        break label245;
      }
      i6 = j;
      for (int i7 = 0; i7 < this.d.length; i7++)
      {
        nkz localnkz = this.d[i7];
        if (localnkz != null)
        {
          int i8 = qal.d(32);
          int i9 = localnkz.a();
          localnkz.ak = i9;
          i6 += i8 + (i9 + qal.d(i9));
        }
      }
      i15 = i;
      break;
    }
    j = i6;
    label245:
    if (this.e != null)
    {
      int i2 = this.e.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.e.length)
        {
          nla localnla1 = this.e[i3];
          if (localnla1 != null)
          {
            int i4 = qal.d(40);
            int i5 = localnla1.a();
            localnla1.ak = i5;
            j += i4 + (i5 + qal.d(i5));
          }
          i3++;
        }
      }
    }
    if (this.f != null)
    {
      nlp localnlp = this.f;
      int n = qal.d(48);
      int i1 = localnlp.a();
      localnlp.ak = i1;
      j += n + (i1 + qal.d(i1));
    }
    if (this.g != -2147483648)
    {
      int k = this.g;
      int m = qal.d(56);
      if (k >= 0) {
        i = qal.d(k);
      }
      j += m + i;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nla localnla2 = this.a;
      paramqal.c(10);
      if (localnla2.ak < 0) {
        localnla2.ak = localnla2.a();
      }
      paramqal.c(localnla2.ak);
      localnla2.a(paramqal);
    }
    if (this.b != null)
    {
      int i1 = this.b.intValue();
      paramqal.c(16);
      paramqal.a(i1);
    }
    if (this.c != null)
    {
      int n = this.c.intValue();
      paramqal.c(24);
      paramqal.a(n);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int m = 0; m < this.d.length; m++)
      {
        nkz localnkz = this.d[m];
        if (localnkz != null)
        {
          paramqal.c(34);
          if (localnkz.ak < 0) {
            localnkz.ak = localnkz.a();
          }
          paramqal.c(localnkz.ak);
          localnkz.a(paramqal);
        }
      }
    }
    if (this.e != null)
    {
      int j = this.e.length;
      int k = 0;
      if (j > 0) {
        while (k < this.e.length)
        {
          nla localnla1 = this.e[k];
          if (localnla1 != null)
          {
            paramqal.c(42);
            if (localnla1.ak < 0) {
              localnla1.ak = localnla1.a();
            }
            paramqal.c(localnla1.ak);
            localnla1.a(paramqal);
          }
          k++;
        }
      }
    }
    if (this.f != null)
    {
      nlp localnlp = this.f;
      paramqal.c(50);
      if (localnlp.ak < 0) {
        localnlp.ak = localnlp.a();
      }
      paramqal.c(localnlp.ak);
      localnlp.a(paramqal);
    }
    if (this.g != -2147483648)
    {
      int i = this.g;
      paramqal.c(56);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nky
 * JD-Core Version:    0.7.0.1
 */