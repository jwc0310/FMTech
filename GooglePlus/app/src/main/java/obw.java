public final class obw
  extends qan<obw>
{
  private static volatile obw[] c;
  public int a = -2147483648;
  public String b = null;
  private String d = null;
  private Integer e = null;
  
  public obw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static obw[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new obw[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
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
    for (int k = j + (i7 + i6);; k = j)
    {
      if (this.b != null)
      {
        String str2 = this.b;
        int i3 = qal.d(16);
        int i4 = qal.a(str2);
        k += i3 + (i4 + qal.d(i4));
      }
      if (this.d != null)
      {
        String str1 = this.d;
        int i1 = qal.d(24);
        int i2 = qal.a(str1);
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.e != null)
      {
        int m = this.e.intValue();
        int n = qal.d(32);
        if (m >= 0) {
          i = qal.d(m);
        }
        k += i + n;
      }
      return k;
      i7 = i;
      break;
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
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(26);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      int i = this.e.intValue();
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     obw
 * JD-Core Version:    0.7.0.1
 */