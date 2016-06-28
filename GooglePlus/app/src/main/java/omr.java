public final class omr
  extends qan<omr>
{
  private static volatile omr[] d;
  public int a = -2147483648;
  public String b = null;
  public String c = null;
  private String e = null;
  
  public omr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static omr[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new omr[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int j = this.a;
    int k = qal.d(8);
    if (j >= 0) {}
    for (int m = qal.d(j);; m = 10)
    {
      int n = i + (m + k);
      if (this.b != null)
      {
        String str3 = this.b;
        int i5 = qal.d(16);
        int i6 = qal.a(str3);
        n += i5 + (i6 + qal.d(i6));
      }
      if (this.c != null)
      {
        String str2 = this.c;
        int i3 = qal.d(24);
        int i4 = qal.a(str2);
        n += i3 + (i4 + qal.d(i4));
      }
      if (this.e != null)
      {
        String str1 = this.e;
        int i1 = qal.d(32);
        int i2 = qal.a(str1);
        n += i1 + (i2 + qal.d(i2));
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = this.a;
    paramqal.c(8);
    paramqal.a(i);
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(26);
      paramqal.a(str2);
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
 * Qualified Name:     omr
 * JD-Core Version:    0.7.0.1
 */