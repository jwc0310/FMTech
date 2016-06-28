public final class opm
  extends qan<opm>
{
  private static volatile opm[] b;
  public String a = null;
  private String c = null;
  private int d = -2147483648;
  private String e = null;
  
  public opm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static opm[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new opm[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null)
    {
      String str3 = this.c;
      int i4 = qal.d(8);
      int i5 = qal.a(str3);
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.a != null)
    {
      String str2 = this.a;
      int i2 = qal.d(16);
      int i3 = qal.a(str2);
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.d != -2147483648)
    {
      m = this.d;
      n = qal.d(24);
      if (m < 0) {
        break label168;
      }
    }
    label168:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.e != null)
      {
        String str1 = this.e;
        int j = qal.d(32);
        int k = qal.a(str1);
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(24);
      paramqal.a(i);
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
 * Qualified Name:     opm
 * JD-Core Version:    0.7.0.1
 */