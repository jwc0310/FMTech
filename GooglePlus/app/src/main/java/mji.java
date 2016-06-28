public final class mji
  extends qan<mji>
{
  public int a = -2147483648;
  public String b = null;
  public String c = null;
  private int d = -2147483648;
  
  public mji()
  {
    this.aj = null;
    this.ak = -1;
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
      if (this.d != -2147483648)
      {
        int i1 = this.d;
        int i2 = qal.d(24);
        if (i1 >= 0) {
          i = qal.d(i1);
        }
        k += i + i2;
      }
      if (this.c != null)
      {
        String str1 = this.c;
        int m = qal.d(32);
        int n = qal.a(str1);
        k += m + (n + qal.d(n));
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
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(34);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mji
 * JD-Core Version:    0.7.0.1
 */