public final class olg
  extends qan<olg>
{
  private static volatile olg[] a;
  private olk[] b = olk.b();
  private Integer c = null;
  
  public olg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static olg[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new olg[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0)) {
      for (int n = 0; n < this.b.length; n++)
      {
        olk localolk = this.b[n];
        if (localolk != null)
        {
          int i1 = qal.d(8);
          int i2 = localolk.a();
          localolk.ak = i2;
          i += i1 + (i2 + qal.d(i2));
        }
      }
    }
    int j;
    int k;
    if (this.c != null)
    {
      j = this.c.intValue();
      k = qal.d(16);
      if (j < 0) {
        break label128;
      }
    }
    label128:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int j = 0; j < this.b.length; j++)
      {
        olk localolk = this.b[j];
        if (localolk != null)
        {
          paramqal.c(10);
          if (localolk.ak < 0) {
            localolk.ak = localolk.a();
          }
          paramqal.c(localolk.ak);
          localolk.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(16);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olg
 * JD-Core Version:    0.7.0.1
 */