public final class nvf
  extends qan<nvf>
{
  private static volatile nvf[] d;
  public int a = -2147483648;
  public String b = null;
  public String c = null;
  
  public nvf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nvf[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new nvf[0];
      }
      return d;
    }
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
      if (this.b != null)
      {
        String str2 = this.b;
        int n = qal.d(16);
        int i1 = qal.a(str2);
        j += n + (i1 + qal.d(i1));
      }
      if (this.c != null)
      {
        String str1 = this.c;
        int k = qal.d(24);
        int m = qal.a(str1);
        j += k + (m + qal.d(m));
      }
      return j;
      i4 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int i = this.a;
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(26);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nvf
 * JD-Core Version:    0.7.0.1
 */