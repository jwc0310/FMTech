public final class ntn
  extends qan<ntn>
{
  private static volatile ntn[] a;
  private nto b = null;
  private String c = null;
  
  public ntn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ntn[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new ntn[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      nto localnto = this.b;
      int m = qal.d(8);
      int n = localnto.a();
      localnto.ak = n;
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
      nto localnto = this.b;
      paramqal.c(10);
      if (localnto.ak < 0) {
        localnto.ak = localnto.a();
      }
      paramqal.c(localnto.ak);
      localnto.a(paramqal);
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
 * Qualified Name:     ntn
 * JD-Core Version:    0.7.0.1
 */