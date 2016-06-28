public final class opd
  extends qan<opd>
{
  private static volatile opd[] a;
  private String b = null;
  private String[] c = qay.f;
  
  public opd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static opd[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new opd[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.b != null)
    {
      String str2 = this.b;
      int i1 = qal.d(8);
      int i2 = qal.a(str2);
      j += i1 + (i2 + qal.d(i2));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.c.length)
      {
        String str1 = this.c[i];
        if (str1 != null)
        {
          m++;
          int n = qal.a(str1);
          k += n + qal.d(n);
        }
        i++;
      }
      j = j + k + m * 1;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        String str1 = this.c[i];
        if (str1 != null)
        {
          paramqal.c(18);
          paramqal.a(str1);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     opd
 * JD-Core Version:    0.7.0.1
 */