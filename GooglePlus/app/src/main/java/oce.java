public final class oce
  extends qan<oce>
{
  public String a = null;
  private int b = -2147483648;
  private ocg c = null;
  
  public oce()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i2 = qal.d(8);
      int i3 = qal.a(str);
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.b != -2147483648)
    {
      m = this.b;
      n = qal.d(32);
      if (m < 0) {
        break label133;
      }
    }
    label133:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.c != null)
      {
        ocg localocg = this.c;
        int j = qal.d(40);
        int k = localocg.a();
        localocg.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
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
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(32);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      ocg localocg = this.c;
      paramqal.c(42);
      if (localocg.ak < 0) {
        localocg.ak = localocg.a();
      }
      paramqal.c(localocg.ak);
      localocg.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oce
 * JD-Core Version:    0.7.0.1
 */