public final class odi
  extends qan<odi>
{
  private static volatile odi[] c;
  public oed a = null;
  public odu[] b = odu.b();
  
  public odi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static odi[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new odi[0];
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
      int i1 = qal.d(8);
      int i2 = localoed.a();
      localoed.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        odu localodu = this.b[k];
        if (localodu != null)
        {
          int m = qal.d(16);
          int n = localodu.a();
          localodu.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
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
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        odu localodu = this.b[i];
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odi
 * JD-Core Version:    0.7.0.1
 */