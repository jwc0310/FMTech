public final class ndo
  extends qan<ndo>
{
  public int a = -2147483648;
  public int b = -2147483648;
  public int c = -2147483648;
  
  public ndo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i5;
    int i6;
    if (this.a != -2147483648)
    {
      int i4 = this.a;
      i5 = qal.d(8);
      if (i4 >= 0) {
        i6 = qal.d(i4);
      }
    }
    for (int k = j + (i6 + i5);; k = j)
    {
      int i1;
      int i2;
      if (this.b != -2147483648)
      {
        i1 = this.b;
        i2 = qal.d(16);
        if (i1 < 0) {
          break label140;
        }
      }
      label140:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
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
        i6 = i;
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndo
 * JD-Core Version:    0.7.0.1
 */