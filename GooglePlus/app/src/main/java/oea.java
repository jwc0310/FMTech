public final class oea
  extends qan<oea>
{
  public int a = -2147483648;
  public int b = -2147483648;
  public String[] c = qay.f;
  
  public oea()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = 0;
    int k = super.a();
    int i6;
    int i7;
    if (this.a != -2147483648)
    {
      int i5 = this.a;
      i6 = qal.d(8);
      if (i5 >= 0) {
        i7 = qal.d(i5);
      }
    }
    for (int m = k + (i7 + i6);; m = k)
    {
      if (this.b != -2147483648)
      {
        int i3 = this.b;
        int i4 = qal.d(16);
        if (i3 >= 0) {
          i = qal.d(i3);
        }
        m += i + i4;
      }
      if ((this.c != null) && (this.c.length > 0))
      {
        int n = 0;
        int i1 = 0;
        for (;;)
        {
          if (n < this.c.length)
          {
            String str = this.c[n];
            if (str != null)
            {
              i1++;
              int i2 = qal.a(str);
              j += i2 + qal.d(i2);
            }
            n++;
            continue;
            i7 = i;
            break;
          }
        }
        m = m + j + i1 * 1;
      }
      return m;
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
        String str = this.c[i];
        if (str != null)
        {
          paramqal.c(26);
          paramqal.a(str);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oea
 * JD-Core Version:    0.7.0.1
 */