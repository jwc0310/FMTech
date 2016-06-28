public final class oca
  extends qan<oca>
{
  private static volatile oca[] a;
  private ocb b = null;
  private String c = null;
  
  public oca()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oca[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new oca[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      ocb localocb = this.b;
      int m = qal.d(8);
      int n = localocb.a();
      localocb.ak = n;
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
      ocb localocb = this.b;
      paramqal.c(10);
      if (localocb.ak < 0) {
        localocb.ak = localocb.a();
      }
      paramqal.c(localocb.ak);
      localocb.a(paramqal);
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
 * Qualified Name:     oca
 * JD-Core Version:    0.7.0.1
 */