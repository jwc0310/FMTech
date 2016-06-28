public final class niw
  extends qan<niw>
{
  public niy a = null;
  public int b = -2147483648;
  private Integer c = null;
  private Integer d = null;
  private nix[] e = nix.b();
  private niy[] f = niy.b();
  private njf g = null;
  
  public niw()
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
      niy localniy2 = this.a;
      int i16 = qal.d(8);
      int i17 = localniy2.a();
      localniy2.ak = i17;
      j += i16 + (i17 + qal.d(i17));
    }
    int i15;
    int i10;
    int i11;
    if (this.c != null)
    {
      int i13 = this.c.intValue();
      int i14 = qal.d(16);
      if (i13 >= 0)
      {
        i15 = qal.d(i13);
        j += i15 + i14;
      }
    }
    else if (this.d != null)
    {
      i10 = this.d.intValue();
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
      if ((this.e == null) || (this.e.length <= 0)) {
        break label245;
      }
      i6 = j;
      for (int i7 = 0; i7 < this.e.length; i7++)
      {
        nix localnix = this.e[i7];
        if (localnix != null)
        {
          int i8 = qal.d(32);
          int i9 = localnix.a();
          localnix.ak = i9;
          i6 += i8 + (i9 + qal.d(i9));
        }
      }
      i15 = i;
      break;
    }
    j = i6;
    label245:
    if (this.f != null)
    {
      int i2 = this.f.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.f.length)
        {
          niy localniy1 = this.f[i3];
          if (localniy1 != null)
          {
            int i4 = qal.d(40);
            int i5 = localniy1.a();
            localniy1.ak = i5;
            j += i4 + (i5 + qal.d(i5));
          }
          i3++;
        }
      }
    }
    if (this.g != null)
    {
      njf localnjf = this.g;
      int n = qal.d(48);
      int i1 = localnjf.a();
      localnjf.ak = i1;
      j += n + (i1 + qal.d(i1));
    }
    if (this.b != -2147483648)
    {
      int k = this.b;
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
      niy localniy2 = this.a;
      paramqal.c(10);
      if (localniy2.ak < 0) {
        localniy2.ak = localniy2.a();
      }
      paramqal.c(localniy2.ak);
      localniy2.a(paramqal);
    }
    if (this.c != null)
    {
      int i1 = this.c.intValue();
      paramqal.c(16);
      paramqal.a(i1);
    }
    if (this.d != null)
    {
      int n = this.d.intValue();
      paramqal.c(24);
      paramqal.a(n);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int m = 0; m < this.e.length; m++)
      {
        nix localnix = this.e[m];
        if (localnix != null)
        {
          paramqal.c(34);
          if (localnix.ak < 0) {
            localnix.ak = localnix.a();
          }
          paramqal.c(localnix.ak);
          localnix.a(paramqal);
        }
      }
    }
    if (this.f != null)
    {
      int j = this.f.length;
      int k = 0;
      if (j > 0) {
        while (k < this.f.length)
        {
          niy localniy1 = this.f[k];
          if (localniy1 != null)
          {
            paramqal.c(42);
            if (localniy1.ak < 0) {
              localniy1.ak = localniy1.a();
            }
            paramqal.c(localniy1.ak);
            localniy1.a(paramqal);
          }
          k++;
        }
      }
    }
    if (this.g != null)
    {
      njf localnjf = this.g;
      paramqal.c(50);
      if (localnjf.ak < 0) {
        localnjf.ak = localnjf.a();
      }
      paramqal.c(localnjf.ak);
      localnjf.a(paramqal);
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(56);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     niw
 * JD-Core Version:    0.7.0.1
 */