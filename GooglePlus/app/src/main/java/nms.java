public final class nms
  extends qan<nms>
{
  private static volatile nms[] a;
  private Integer b = null;
  private int c = -2147483648;
  
  public nms()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nms[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nms[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i2;
    int i3;
    if (this.b != null)
    {
      int i1 = this.b.intValue();
      i2 = qal.d(8);
      if (i1 >= 0) {
        i3 = qal.d(i1);
      }
    }
    for (int k = j + (i3 + i2);; k = j)
    {
      if (this.c != -2147483648)
      {
        int m = this.c;
        int n = qal.d(16);
        if (m >= 0) {
          i = qal.d(m);
        }
        k += i + n;
      }
      return k;
      i3 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.c != -2147483648)
    {
      int i = this.c;
      paramqal.c(16);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nms
 * JD-Core Version:    0.7.0.1
 */