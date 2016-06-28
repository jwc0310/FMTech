public final class mhw
  extends qan<mhw>
{
  private static volatile mhw[] d;
  public Integer a = null;
  public mhx b = null;
  public Integer c = null;
  
  public mhw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mhw[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new mhw[0];
      }
      return d;
    }
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
      if (this.b != null)
      {
        mhx localmhx = this.b;
        int i1 = qal.d(16);
        int i2 = localmhx.a();
        localmhx.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.c != null)
      {
        int m = this.c.intValue();
        int n = qal.d(40);
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
    if (this.a != null)
    {
      int j = this.a.intValue();
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.b != null)
    {
      mhx localmhx = this.b;
      paramqal.c(18);
      if (localmhx.ak < 0) {
        localmhx.ak = localmhx.a();
      }
      paramqal.c(localmhx.ak);
      localmhx.a(paramqal);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mhw
 * JD-Core Version:    0.7.0.1
 */