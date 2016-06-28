public final class mme
  extends qan<mme>
{
  private static volatile mme[] a;
  private pre b = null;
  private ppj c = null;
  private Long d = null;
  private Long e = null;
  private mmf f = null;
  
  public mme()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mme[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mme[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      pre localpre = this.b;
      int i1 = qal.d(8);
      int i2 = localpre.a();
      localpre.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      long l2 = this.d.longValue();
      i += qal.d(16) + qal.b(l2);
    }
    if (this.e != null)
    {
      long l1 = this.e.longValue();
      i += qal.d(24) + qal.b(l1);
    }
    if (this.c != null)
    {
      ppj localppj = this.c;
      int m = qal.d(32);
      int n = localppj.a();
      localppj.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.f != null)
    {
      mmf localmmf = this.f;
      int j = qal.d(40);
      int k = localmmf.a();
      localmmf.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      pre localpre = this.b;
      paramqal.c(10);
      if (localpre.ak < 0) {
        localpre.ak = localpre.a();
      }
      paramqal.c(localpre.ak);
      localpre.a(paramqal);
    }
    if (this.d != null)
    {
      long l2 = this.d.longValue();
      paramqal.c(16);
      paramqal.a(l2);
    }
    if (this.e != null)
    {
      long l1 = this.e.longValue();
      paramqal.c(24);
      paramqal.a(l1);
    }
    if (this.c != null)
    {
      ppj localppj = this.c;
      paramqal.c(34);
      if (localppj.ak < 0) {
        localppj.ak = localppj.a();
      }
      paramqal.c(localppj.ak);
      localppj.a(paramqal);
    }
    if (this.f != null)
    {
      mmf localmmf = this.f;
      paramqal.c(42);
      if (localmmf.ak < 0) {
        localmmf.ak = localmmf.a();
      }
      paramqal.c(localmmf.ak);
      localmmf.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mme
 * JD-Core Version:    0.7.0.1
 */