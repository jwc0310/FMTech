public final class nmw
  extends qan<nmw>
{
  public Integer a = null;
  public int b = -2147483648;
  public int c = -2147483648;
  public int d = -2147483648;
  public int e = -2147483648;
  
  public nmw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i11;
    int i12;
    if (this.b != -2147483648)
    {
      int i10 = this.b;
      i11 = qal.d(8);
      if (i10 >= 0) {
        i12 = qal.d(i10);
      }
    }
    for (int k = j + (i12 + i11);; k = j)
    {
      int i9;
      label84:
      int i6;
      label127:
      int i1;
      int i2;
      if (this.d != -2147483648)
      {
        int i7 = this.d;
        int i8 = qal.d(16);
        if (i7 >= 0)
        {
          i9 = qal.d(i7);
          k += i9 + i8;
        }
      }
      else
      {
        if (this.a != null)
        {
          int i4 = this.a.intValue();
          int i5 = qal.d(24);
          if (i4 < 0) {
            break label231;
          }
          i6 = qal.d(i4);
          k += i6 + i5;
        }
        if (this.c != -2147483648)
        {
          i1 = this.c;
          i2 = qal.d(32);
          if (i1 < 0) {
            break label237;
          }
        }
      }
      label231:
      label237:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
        if (this.e != -2147483648)
        {
          int m = this.e;
          int n = qal.d(40);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        return k;
        i12 = i;
        break;
        i9 = i;
        break label84;
        i6 = i;
        break label127;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int n = this.b;
      paramqal.c(8);
      paramqal.a(n);
    }
    if (this.d != -2147483648)
    {
      int m = this.d;
      paramqal.c(16);
      paramqal.a(m);
    }
    if (this.a != null)
    {
      int k = this.a.intValue();
      paramqal.c(24);
      paramqal.a(k);
    }
    if (this.c != -2147483648)
    {
      int j = this.c;
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.e != -2147483648)
    {
      int i = this.e;
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmw
 * JD-Core Version:    0.7.0.1
 */