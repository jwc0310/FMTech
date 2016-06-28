public final class npk
  extends qan<npk>
{
  private static volatile npk[] a;
  private int b = -2147483648;
  private String c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  
  public npk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static npk[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new npk[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
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
    for (int j = i + (i8 + i7);; j = i)
    {
      if (this.c != null)
      {
        String str4 = this.c;
        int i4 = qal.d(16);
        int i5 = qal.a(str4);
        j += i4 + (i5 + qal.d(i5));
      }
      if (this.d != null)
      {
        String str3 = this.d;
        int i2 = qal.d(24);
        int i3 = qal.a(str3);
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.e != null)
      {
        String str2 = this.e;
        int n = qal.d(32);
        int i1 = qal.a(str2);
        j += n + (i1 + qal.d(i1));
      }
      if (this.f != null)
      {
        String str1 = this.f;
        int k = qal.d(40);
        int m = qal.a(str1);
        j += k + (m + qal.d(m));
      }
      return j;
      i8 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      String str4 = this.c;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npk
 * JD-Core Version:    0.7.0.1
 */