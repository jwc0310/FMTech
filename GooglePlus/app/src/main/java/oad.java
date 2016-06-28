public final class oad
  extends qan<oad>
{
  private static volatile oad[] b;
  public oed a = null;
  private odu[] c = odu.b();
  private String d = null;
  
  public oad()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oad[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new oad[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oed localoed = this.a;
      int i3 = qal.d(8);
      int i4 = localoed.a();
      localoed.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int m = i;
      for (int n = 0; n < this.c.length; n++)
      {
        odu localodu = this.c[n];
        if (localodu != null)
        {
          int i1 = qal.d(16);
          int i2 = localodu.a();
          localodu.ak = i2;
          m += i1 + (i2 + qal.d(i2));
        }
      }
      i = m;
    }
    if (this.d != null)
    {
      String str = this.d;
      int j = qal.d(104);
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
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        odu localodu = this.c[i];
        if (localodu != null)
        {
          paramqal.c(18);
          if (localodu.ak < 0) {
            localodu.ak = localodu.a();
          }
          paramqal.c(localodu.ak);
          localodu.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(106);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oad
 * JD-Core Version:    0.7.0.1
 */