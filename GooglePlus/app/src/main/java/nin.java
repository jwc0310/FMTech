public final class nin
  extends qan<nin>
{
  private static volatile nin[] b;
  public String a = null;
  private Integer c = null;
  private Integer d = null;
  private int e = -2147483648;
  
  public nin()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nin[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new nin[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i6 = qal.d(8);
      int i7 = qal.a(str);
      j += i6 + (i7 + qal.d(i7));
    }
    int i5;
    int n;
    int i1;
    if (this.c != null)
    {
      int i3 = this.c.intValue();
      int i4 = qal.d(16);
      if (i3 >= 0)
      {
        i5 = qal.d(i3);
        j += i5 + i4;
      }
    }
    else if (this.d != null)
    {
      n = this.d.intValue();
      i1 = qal.d(24);
      if (n < 0) {
        break label180;
      }
    }
    label180:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.e != -2147483648)
      {
        int k = this.e;
        int m = qal.d(32);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
      i5 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.c != null)
    {
      int k = this.c.intValue();
      paramqal.c(16);
      paramqal.a(k);
    }
    if (this.d != null)
    {
      int j = this.d.intValue();
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.e != -2147483648)
    {
      int i = this.e;
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nin
 * JD-Core Version:    0.7.0.1
 */