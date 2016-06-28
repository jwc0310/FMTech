public final class oec
  extends qan<oec>
{
  private static volatile oec[] c;
  public oed a = null;
  public String b = null;
  private Double d = null;
  private Integer e = null;
  private odu[] f = odu.b();
  
  public oec()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oec[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new oec[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oed localoed = this.a;
      int i6 = qal.d(8);
      int i7 = localoed.a();
      localoed.ak = i7;
      i += i6 + (i7 + qal.d(i7));
    }
    if (this.d != null)
    {
      this.d.doubleValue();
      i += 8 + qal.d(16);
    }
    int i3;
    int i4;
    if (this.e != null)
    {
      i3 = this.e.intValue();
      i4 = qal.d(24);
      if (i3 < 0) {
        break label210;
      }
    }
    int m;
    label210:
    for (int i5 = qal.d(i3);; i5 = 10)
    {
      i += i5 + i4;
      if ((this.f == null) || (this.f.length <= 0)) {
        break label220;
      }
      m = i;
      for (int n = 0; n < this.f.length; n++)
      {
        odu localodu = this.f[n];
        if (localodu != null)
        {
          int i1 = qal.d(32);
          int i2 = localodu.a();
          localodu.ak = i2;
          m += i1 + (i2 + qal.d(i2));
        }
      }
    }
    i = m;
    label220:
    if (this.b != null)
    {
      String str = this.b;
      int j = qal.d(40);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oed localoed = this.a;
      paramqal.c(10);
      if (localoed.ak < 0) {
        localoed.ak = localoed.a();
      }
      paramqal.c(localoed.ak);
      localoed.a(paramqal);
    }
    if (this.d != null)
    {
      double d1 = this.d.doubleValue();
      paramqal.c(17);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.e != null)
    {
      int j = this.e.intValue();
      paramqal.c(24);
      paramqal.a(j);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i = 0; i < this.f.length; i++)
      {
        odu localodu = this.f[i];
        if (localodu != null)
        {
          paramqal.c(34);
          if (localodu.ak < 0) {
            localodu.ak = localodu.a();
          }
          paramqal.c(localodu.ak);
          localodu.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(42);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oec
 * JD-Core Version:    0.7.0.1
 */