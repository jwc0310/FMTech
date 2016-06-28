public final class njo
  extends qan<njo>
{
  private static volatile njo[] a;
  private int b = -2147483648;
  private String c = null;
  private String[] d = qay.f;
  private String e = null;
  
  public njo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static njo[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new njo[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i7;
    int i8;
    if (this.b != -2147483648)
    {
      int i6 = this.b;
      i7 = qal.d(8);
      if (i6 >= 0) {
        i8 = qal.d(i6);
      }
    }
    for (int k = j + (i8 + i7);; k = j)
    {
      if (this.c != null)
      {
        String str3 = this.c;
        int i4 = qal.d(16);
        int i5 = qal.a(str3);
        k += i4 + (i5 + qal.d(i5));
      }
      if ((this.d != null) && (this.d.length > 0))
      {
        int i1 = 0;
        int i2 = 0;
        for (;;)
        {
          if (i1 < this.d.length)
          {
            String str2 = this.d[i1];
            if (str2 != null)
            {
              i2++;
              int i3 = qal.a(str2);
              i += i3 + qal.d(i3);
            }
            i1++;
            continue;
            i8 = 10;
            break;
          }
        }
        k = k + i + i2 * 1;
      }
      if (this.e != null)
      {
        String str1 = this.e;
        int m = qal.d(32);
        int n = qal.a(str1);
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i = 0; i < this.d.length; i++)
      {
        String str2 = this.d[i];
        if (str2 != null)
        {
          paramqal.c(26);
          paramqal.a(str2);
        }
      }
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(34);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     njo
 * JD-Core Version:    0.7.0.1
 */