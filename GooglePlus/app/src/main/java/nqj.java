public final class nqj
  extends qan<nqj>
{
  private int a = -2147483648;
  private int b = -2147483648;
  private nqi[] c = nqi.b();
  private pkt d = null;
  
  public nqj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i8;
    int i9;
    if (this.a != -2147483648)
    {
      int i7 = this.a;
      i8 = qal.d(8);
      if (i7 >= 0) {
        i9 = qal.d(i7);
      }
    }
    for (int k = j + (i9 + i8);; k = j)
    {
      if (this.b != -2147483648)
      {
        int i5 = this.b;
        int i6 = qal.d(16);
        if (i5 >= 0) {
          i = qal.d(i5);
        }
        k += i + i6;
      }
      if ((this.c != null) && (this.c.length > 0))
      {
        int i1 = k;
        int i2 = 0;
        for (;;)
        {
          if (i2 < this.c.length)
          {
            nqi localnqi = this.c[i2];
            if (localnqi != null)
            {
              int i3 = qal.d(24);
              int i4 = localnqi.a();
              localnqi.ak = i4;
              i1 += i3 + (i4 + qal.d(i4));
            }
            i2++;
            continue;
            i9 = i;
            break;
          }
        }
        k = i1;
      }
      if (this.d != null)
      {
        pkt localpkt = this.d;
        int m = qal.d(32);
        int n = localpkt.a();
        localpkt.ak = n;
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int k = this.a;
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(16);
      paramqal.a(j);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        nqi localnqi = this.c[i];
        if (localnqi != null)
        {
          paramqal.c(26);
          if (localnqi.ak < 0) {
            localnqi.ak = localnqi.a();
          }
          paramqal.c(localnqi.ak);
          localnqi.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      pkt localpkt = this.d;
      paramqal.c(34);
      if (localpkt.ak < 0) {
        localpkt.ak = localpkt.a();
      }
      paramqal.c(localpkt.ak);
      localpkt.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqj
 * JD-Core Version:    0.7.0.1
 */