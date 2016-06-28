public final class mjw
  extends qan<mjw>
{
  private static volatile mjw[] a;
  private mjn b = null;
  private mjj c = null;
  private String d = null;
  
  public mjw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mjw[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mjw[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      mjn localmjn = this.b;
      int i1 = qal.d(8);
      int i2 = localmjn.a();
      localmjn.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      mjj localmjj = this.c;
      int m = qal.d(16);
      int n = localmjj.a();
      localmjj.ak = n;
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
      mjn localmjn = this.b;
      paramqal.c(10);
      if (localmjn.ak < 0) {
        localmjn.ak = localmjn.a();
      }
      paramqal.c(localmjn.ak);
      localmjn.a(paramqal);
    }
    if (this.c != null)
    {
      mjj localmjj = this.c;
      paramqal.c(18);
      if (localmjj.ak < 0) {
        localmjj.ak = localmjj.a();
      }
      paramqal.c(localmjj.ak);
      localmjj.a(paramqal);
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
 * Qualified Name:     mjw
 * JD-Core Version:    0.7.0.1
 */