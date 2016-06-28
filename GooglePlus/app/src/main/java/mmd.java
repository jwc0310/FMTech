public final class mmd
  extends qan<mmd>
{
  private static volatile mmd[] a;
  private pou b = null;
  private String c = null;
  
  public mmd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mmd[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mmd[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      pou localpou = this.b;
      int m = qal.d(8);
      int n = localpou.a();
      localpou.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      String str = this.c;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      pou localpou = this.b;
      paramqal.c(10);
      if (localpou.ak < 0) {
        localpou.ak = localpou.a();
      }
      paramqal.c(localpou.ak);
      localpou.a(paramqal);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmd
 * JD-Core Version:    0.7.0.1
 */