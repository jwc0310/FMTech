public final class ndq
  extends qan<ndq>
{
  public int a = -2147483648;
  public String b = null;
  public int c = -2147483648;
  
  public ndq()
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
    if (this.a != -2147483648)
    {
      int i3 = this.a;
      i4 = qal.d(8);
      if (i3 >= 0) {
        i5 = qal.d(i3);
      }
    }
    for (int k = j + (i5 + i4);; k = j)
    {
      if (this.b != null)
      {
        String str = this.b;
        int i1 = qal.d(16);
        int i2 = qal.a(str);
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.c != -2147483648)
      {
        int m = this.c;
        int n = qal.d(24);
        if (m >= 0) {
          i = qal.d(m);
        }
        k += i + n;
      }
      return k;
      i5 = i;
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
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
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
 * Qualified Name:     ndq
 * JD-Core Version:    0.7.0.1
 */