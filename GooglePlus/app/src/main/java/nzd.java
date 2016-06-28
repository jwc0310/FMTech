public final class nzd
  extends qan<nzd>
{
  private static volatile nzd[] b;
  public odg[] a = odg.b();
  private int c = -2147483648;
  private String d = null;
  
  public nzd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nzd[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new nzd[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int i5;
    int i6;
    if (this.c != -2147483648)
    {
      int i4 = this.c;
      i5 = qal.d(8);
      if (i4 >= 0) {
        i6 = qal.d(i4);
      }
    }
    for (int j = i + (i6 + i5);; j = i)
    {
      if (this.d != null)
      {
        String str = this.d;
        int i2 = qal.d(16);
        int i3 = qal.a(str);
        j += i2 + (i3 + qal.d(i3));
      }
      if ((this.a != null) && (this.a.length > 0))
      {
        int k = j;
        int m = 0;
        for (;;)
        {
          if (m < this.a.length)
          {
            odg localodg = this.a[m];
            if (localodg != null)
            {
              int n = qal.d(24);
              int i1 = localodg.a();
              localodg.ak = i1;
              k += n + (i1 + qal.d(i1));
            }
            m++;
            continue;
            i6 = 10;
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
    if (this.c != -2147483648)
    {
      int j = this.c;
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(18);
      paramqal.a(str);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        odg localodg = this.a[i];
        if (localodg != null)
        {
          paramqal.c(26);
          if (localodg.ak < 0) {
            localodg.ak = localodg.a();
          }
          paramqal.c(localodg.ak);
          localodg.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzd
 * JD-Core Version:    0.7.0.1
 */