public final class opb
  extends qan<opb>
{
  private int a = -2147483648;
  private opd[] b = opd.b();
  
  public opb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
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
    for (int j = i + (i4 + i3);; j = i)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int k = j;
        int m = 0;
        for (;;)
        {
          if (m < this.b.length)
          {
            opd localopd = this.b[m];
            if (localopd != null)
            {
              int n = qal.d(16);
              int i1 = localopd.a();
              localopd.ak = i1;
              k += n + (i1 + qal.d(i1));
            }
            m++;
            continue;
            i4 = 10;
            break;
          }
        }
        j = k;
      }
      return j;
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
        opd localopd = this.b[i];
        if (localopd != null)
        {
          paramqal.c(18);
          if (localopd.ak < 0) {
            localopd.ak = localopd.a();
          }
          paramqal.c(localopd.ak);
          localopd.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     opb
 * JD-Core Version:    0.7.0.1
 */