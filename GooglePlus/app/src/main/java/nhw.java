public final class nhw
  extends qan<nhw>
{
  public String a = null;
  public nhv b = null;
  public String c = null;
  private int d = -2147483648;
  
  public nhw()
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
      int i4 = qal.d(8);
      int i5 = qal.a(str2);
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.b != null)
    {
      nhv localnhv = this.b;
      int i2 = qal.d(16);
      int i3 = localnhv.a();
      localnhv.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int n = qal.d(24);
      int i1 = qal.a(str1);
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.d != -2147483648)
    {
      j = this.d;
      k = qal.d(32);
      if (j < 0) {
        break label174;
      }
    }
    label174:
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
      nhv localnhv = this.b;
      paramqal.c(18);
      if (localnhv.ak < 0) {
        localnhv.ak = localnhv.a();
      }
      paramqal.c(localnhv.ak);
      localnhv.a(paramqal);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(26);
      paramqal.a(str1);
    }
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhw
 * JD-Core Version:    0.7.0.1
 */