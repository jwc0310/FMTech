public final class koi
  extends qan<koi>
{
  private static volatile koi[] f;
  public Integer a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public String e = null;
  
  public koi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static koi[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new koi[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int i7;
    int i8;
    if (this.a != null)
    {
      int i6 = this.a.intValue();
      i7 = qal.d(8);
      if (i6 >= 0) {
        i8 = qal.d(i6);
      }
    }
    for (int j = i + (i8 + i7);; j = i)
    {
      if (this.b != null)
      {
        String str4 = this.b;
        int i4 = qal.d(16);
        int i5 = qal.a(str4);
        j += i4 + (i5 + qal.d(i5));
      }
      if (this.c != null)
      {
        String str3 = this.c;
        int i2 = qal.d(24);
        int i3 = qal.a(str3);
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.d != null)
      {
        String str2 = this.d;
        int n = qal.d(32);
        int i1 = qal.a(str2);
        j += n + (i1 + qal.d(i1));
      }
      if (this.e != null)
      {
        String str1 = this.e;
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
    if (this.a != null)
    {
      int i = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     koi
 * JD-Core Version:    0.7.0.1
 */