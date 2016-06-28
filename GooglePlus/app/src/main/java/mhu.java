public final class mhu
  extends qan<mhu>
{
  public String a = null;
  public String b = null;
  private int c = -2147483648;
  
  public mhu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i2 = qal.d(8);
      int i3 = qal.a(str2);
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int n = qal.d(16);
      int i1 = qal.a(str1);
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.c != -2147483648)
    {
      j = this.c;
      k = qal.d(24);
      if (j < 0) {
        break label126;
      }
    }
    label126:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if (this.c != -2147483648)
    {
      int i = this.c;
      paramqal.c(24);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mhu
 * JD-Core Version:    0.7.0.1
 */