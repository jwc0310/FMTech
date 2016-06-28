public final class olm
  extends qan<olm>
{
  public Integer a = null;
  private int b = -2147483648;
  private int[] c = qay.a;
  
  public olm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i6;
    int i7;
    if (this.b != -2147483648)
    {
      int i5 = this.b;
      i6 = qal.d(8);
      if (i5 >= 0) {
        i7 = qal.d(i5);
      }
    }
    for (int k = j + (i7 + i6);; k = j)
    {
      int i4;
      label84:
      int m;
      label110:
      int n;
      if (this.a != null)
      {
        int i2 = this.a.intValue();
        int i3 = qal.d(16);
        if (i2 >= 0)
        {
          i4 = qal.d(i2);
          k += i4 + i3;
        }
      }
      else
      {
        if ((this.c == null) || (this.c.length <= 0)) {
          break label185;
        }
        m = 0;
        if (m >= this.c.length) {
          break label173;
        }
        n = this.c[m];
        if (n < 0) {
          break label166;
        }
      }
      label166:
      for (int i1 = qal.d(n);; i1 = 10)
      {
        i += i1;
        m++;
        break label110;
        i7 = 10;
        break;
        i4 = 10;
        break label84;
      }
      label173:
      k = k + i + 1 * this.c.length;
      label185:
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int m = this.b;
      paramqal.c(8);
      paramqal.a(m);
    }
    if (this.a != null)
    {
      int k = this.a.intValue();
      paramqal.c(16);
      paramqal.a(k);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        int j = this.c[i];
        paramqal.c(24);
        paramqal.a(j);
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olm
 * JD-Core Version:    0.7.0.1
 */