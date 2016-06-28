public final class mlc
  extends qan<mlc>
{
  public int a = -2147483648;
  public String[] b = qay.f;
  
  public mlc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i3;
    int i4;
    if (this.a != -2147483648)
    {
      int i2 = this.a;
      i3 = qal.d(8);
      if (i2 >= 0) {
        i4 = qal.d(i2);
      }
    }
    for (int k = j + (i4 + i3);; k = j)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int m = 0;
        int n = 0;
        for (;;)
        {
          if (m < this.b.length)
          {
            String str = this.b[m];
            if (str != null)
            {
              n++;
              int i1 = qal.a(str);
              i += i1 + qal.d(i1);
            }
            m++;
            continue;
            i4 = 10;
            break;
          }
        }
        k = k + i + n * 1;
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
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        String str = this.b[i];
        if (str != null)
        {
          paramqal.c(18);
          paramqal.a(str);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlc
 * JD-Core Version:    0.7.0.1
 */