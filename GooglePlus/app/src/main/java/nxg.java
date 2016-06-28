public final class nxg
  extends qan<nxg>
{
  public int a = -2147483648;
  public nxi b = null;
  private String[] c = qay.f;
  
  public nxg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i5;
    int i6;
    if (this.a != -2147483648)
    {
      int i4 = this.a;
      i5 = qal.d(8);
      if (i4 >= 0) {
        i6 = qal.d(i4);
      }
    }
    for (int k = j + (i6 + i5);; k = j)
    {
      if ((this.c != null) && (this.c.length > 0))
      {
        int i1 = 0;
        int i2 = 0;
        for (;;)
        {
          if (i1 < this.c.length)
          {
            String str = this.c[i1];
            if (str != null)
            {
              i2++;
              int i3 = qal.a(str);
              i += i3 + qal.d(i3);
            }
            i1++;
            continue;
            i6 = 10;
            break;
          }
        }
        k = k + i + i2 * 1;
      }
      if (this.b != null)
      {
        nxi localnxi = this.b;
        int m = qal.d(24);
        int n = localnxi.a();
        localnxi.ak = n;
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int j = this.a;
      paramqal.c(8);
      paramqal.a(j);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        String str = this.c[i];
        if (str != null)
        {
          paramqal.c(18);
          paramqal.a(str);
        }
      }
    }
    if (this.b != null)
    {
      nxi localnxi = this.b;
      paramqal.c(26);
      if (localnxi.ak < 0) {
        localnxi.ak = localnxi.a();
      }
      paramqal.c(localnxi.ak);
      localnxi.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxg
 * JD-Core Version:    0.7.0.1
 */