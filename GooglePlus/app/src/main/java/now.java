public final class now
  extends qan<now>
{
  public Integer a = null;
  public int b = -2147483648;
  private String c = null;
  
  public now()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i4;
    int i5;
    if (this.a != null)
    {
      int i3 = this.a.intValue();
      i4 = qal.d(8);
      if (i3 >= 0) {
        i5 = qal.d(i3);
      }
    }
    for (int k = j + (i5 + i4);; k = j)
    {
      if (this.b != -2147483648)
      {
        int i1 = this.b;
        int i2 = qal.d(16);
        if (i1 >= 0) {
          i = qal.d(i1);
        }
        k += i + i2;
      }
      if (this.c != null)
      {
        String str = this.c;
        int m = qal.d(24);
        int n = qal.a(str);
        k += m + (n + qal.d(n));
      }
      return k;
      i5 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int j = this.a.intValue();
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(26);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     now
 * JD-Core Version:    0.7.0.1
 */