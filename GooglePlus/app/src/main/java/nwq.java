public final class nwq
  extends qan<nwq>
{
  private int a = -2147483648;
  private int b = -2147483648;
  private int c = -2147483648;
  private String d = null;
  
  public nwq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i7;
    int i8;
    if (this.a != -2147483648)
    {
      int i6 = this.a;
      i7 = qal.d(8);
      if (i6 >= 0) {
        i8 = qal.d(i6);
      }
    }
    for (int k = j + (i8 + i7);; k = j)
    {
      int i3;
      int i4;
      if (this.b != -2147483648)
      {
        i3 = this.b;
        i4 = qal.d(16);
        if (i3 < 0) {
          break label181;
        }
      }
      label181:
      for (int i5 = qal.d(i3);; i5 = i)
      {
        k += i5 + i4;
        if (this.c != -2147483648)
        {
          int i1 = this.c;
          int i2 = qal.d(24);
          if (i1 >= 0) {
            i = qal.d(i1);
          }
          k += i + i2;
        }
        if (this.d != null)
        {
          String str = this.d;
          int m = qal.d(32);
          int n = qal.a(str);
          k += m + (n + qal.d(n));
        }
        return k;
        i8 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int k = this.a;
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.c != -2147483648)
    {
      int i = this.c;
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(34);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwq
 * JD-Core Version:    0.7.0.1
 */