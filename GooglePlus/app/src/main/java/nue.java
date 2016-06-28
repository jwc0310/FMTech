public final class nue
  extends qan<nue>
{
  private static volatile nue[] d;
  public String a = null;
  public nuf b = null;
  public nug c = null;
  
  public nue()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nue[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new nue[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      nuf localnuf = this.b;
      int i1 = qal.d(16);
      int i2 = localnuf.a();
      localnuf.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      nug localnug = this.c;
      int m = qal.d(24);
      int n = localnug.a();
      localnug.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      String str = this.a;
      int j = qal.d(32);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      nuf localnuf = this.b;
      paramqal.c(18);
      if (localnuf.ak < 0) {
        localnuf.ak = localnuf.a();
      }
      paramqal.c(localnuf.ak);
      localnuf.a(paramqal);
    }
    if (this.c != null)
    {
      nug localnug = this.c;
      paramqal.c(26);
      if (localnug.ak < 0) {
        localnug.ak = localnug.a();
      }
      paramqal.c(localnug.ak);
      localnug.a(paramqal);
    }
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(34);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nue
 * JD-Core Version:    0.7.0.1
 */