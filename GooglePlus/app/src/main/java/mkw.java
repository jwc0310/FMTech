public final class mkw
  extends qan<mkw>
{
  private static volatile mkw[] a;
  private mkh b = null;
  private mkb c = null;
  private String d = null;
  
  public mkw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mkw[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mkw[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      mkh localmkh = this.b;
      int i1 = qal.d(8);
      int i2 = localmkh.a();
      localmkh.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      mkb localmkb = this.c;
      int m = qal.d(16);
      int n = localmkb.a();
      localmkb.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      String str = this.d;
      int j = qal.d(24);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      mkh localmkh = this.b;
      paramqal.c(10);
      if (localmkh.ak < 0) {
        localmkh.ak = localmkh.a();
      }
      paramqal.c(localmkh.ak);
      localmkh.a(paramqal);
    }
    if (this.c != null)
    {
      mkb localmkb = this.c;
      paramqal.c(18);
      if (localmkb.ak < 0) {
        localmkb.ak = localmkb.a();
      }
      paramqal.c(localmkb.ak);
      localmkb.a(paramqal);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(26);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkw
 * JD-Core Version:    0.7.0.1
 */