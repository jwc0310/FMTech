public final class nus
  extends qan<nus>
{
  private static volatile nus[] c;
  public String a = null;
  public ood[] b = ood.b();
  
  public nus()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nus[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new nus[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i1 = qal.d(8);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        ood localood = this.b[k];
        if (localood != null)
        {
          int m = qal.d(16);
          int n = localood.a();
          localood.ak = n;
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
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        ood localood = this.b[i];
        if (localood != null)
        {
          paramqal.c(18);
          if (localood.ak < 0) {
            localood.ak = localood.a();
          }
          paramqal.c(localood.ak);
          localood.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nus
 * JD-Core Version:    0.7.0.1
 */