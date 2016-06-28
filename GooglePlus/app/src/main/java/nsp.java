public final class nsp
  extends qan<nsp>
{
  private static volatile nsp[] a;
  private int b = -2147483648;
  private String c = null;
  private Integer d = null;
  private Integer e = null;
  
  public nsp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nsp[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nsp[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i7;
    int i8;
    if (this.b != -2147483648)
    {
      int i6 = this.b;
      i7 = qal.d(8);
      if (i6 >= 0) {
        i8 = qal.d(i6);
      }
    }
    for (int k = j + (i8 + i7);; k = j)
    {
      if (this.c != null)
      {
        String str = this.c;
        int i4 = qal.d(16);
        int i5 = qal.a(str);
        k += i4 + (i5 + qal.d(i5));
      }
      int i1;
      int i2;
      if (this.d != null)
      {
        i1 = this.d.intValue();
        i2 = qal.d(24);
        if (i1 < 0) {
          break label183;
        }
      }
      label183:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
        if (this.e != null)
        {
          int m = this.e.intValue();
          int n = qal.d(32);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        return k;
        i8 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int k = this.b;
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
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
 * Qualified Name:     nsp
 * JD-Core Version:    0.7.0.1
 */