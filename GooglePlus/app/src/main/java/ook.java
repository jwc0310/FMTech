public final class ook
  extends qan<ook>
{
  private static volatile ook[] a;
  private String b = null;
  private String c = null;
  private Integer d = null;
  private Integer e = null;
  
  public ook()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ook[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new ook[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.b != null)
    {
      String str2 = this.b;
      int i5 = qal.d(8);
      int i6 = qal.a(str2);
      j += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int i3 = qal.d(16);
      int i4 = qal.a(str1);
      j += i3 + (i4 + qal.d(i4));
    }
    int n;
    int i1;
    if (this.d != null)
    {
      n = this.d.intValue();
      i1 = qal.d(24);
      if (n < 0) {
        break label173;
      }
    }
    label173:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.e != null)
      {
        int k = this.e.intValue();
        int m = qal.d(32);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if (this.d != null)
    {
      int j = this.d.intValue();
      paramqal.c(24);
      paramqal.a(j);
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
 * Qualified Name:     ook
 * JD-Core Version:    0.7.0.1
 */