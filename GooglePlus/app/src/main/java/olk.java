public final class olk
  extends qan<olk>
{
  private static volatile olk[] a;
  private String b = null;
  private olj c = null;
  private olh d = null;
  private oll e = null;
  
  public olk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static olk[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new olk[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str = this.b;
      int i3 = qal.d(8);
      int i4 = qal.a(str);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      olh localolh = this.d;
      int i1 = qal.d(16);
      int i2 = localolh.a();
      localolh.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.e != null)
    {
      oll localoll = this.e;
      int m = qal.d(24);
      int n = localoll.a();
      localoll.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      olj localolj = this.c;
      int j = qal.d(32);
      int k = localolj.a();
      localolj.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.d != null)
    {
      olh localolh = this.d;
      paramqal.c(18);
      if (localolh.ak < 0) {
        localolh.ak = localolh.a();
      }
      paramqal.c(localolh.ak);
      localolh.a(paramqal);
    }
    if (this.e != null)
    {
      oll localoll = this.e;
      paramqal.c(26);
      if (localoll.ak < 0) {
        localoll.ak = localoll.a();
      }
      paramqal.c(localoll.ak);
      localoll.a(paramqal);
    }
    if (this.c != null)
    {
      olj localolj = this.c;
      paramqal.c(34);
      if (localolj.ak < 0) {
        localolj.ak = localolj.a();
      }
      paramqal.c(localolj.ak);
      localolj.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olk
 * JD-Core Version:    0.7.0.1
 */