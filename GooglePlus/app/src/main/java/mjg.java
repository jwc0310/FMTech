public final class mjg
  extends qan<mjg>
{
  private static volatile mjg[] a;
  private String b = null;
  private String c = null;
  private mje d = null;
  private mlf e = null;
  private Long f = null;
  private mjh g = null;
  
  public mjg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mjg[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mjg[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str2 = this.b;
      int i5 = qal.d(8);
      int i6 = qal.a(str2);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int i3 = qal.d(16);
      int i4 = qal.a(str1);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      mje localmje = this.d;
      int i1 = qal.d(24);
      int i2 = localmje.a();
      localmje.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.e != null)
    {
      mlf localmlf = this.e;
      int m = qal.d(32);
      int n = localmlf.a();
      localmlf.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.f != null)
    {
      long l = this.f.longValue();
      i += qal.d(40) + qal.b(l);
    }
    if (this.g != null)
    {
      mjh localmjh = this.g;
      int j = qal.d(56);
      int k = localmjh.a();
      localmjh.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if (this.d != null)
    {
      mje localmje = this.d;
      paramqal.c(26);
      if (localmje.ak < 0) {
        localmje.ak = localmje.a();
      }
      paramqal.c(localmje.ak);
      localmje.a(paramqal);
    }
    if (this.e != null)
    {
      mlf localmlf = this.e;
      paramqal.c(34);
      if (localmlf.ak < 0) {
        localmlf.ak = localmlf.a();
      }
      paramqal.c(localmlf.ak);
      localmlf.a(paramqal);
    }
    if (this.f != null)
    {
      long l = this.f.longValue();
      paramqal.c(40);
      paramqal.a(l);
    }
    if (this.g != null)
    {
      mjh localmjh = this.g;
      paramqal.c(58);
      if (localmjh.ak < 0) {
        localmjh.ak = localmjh.a();
      }
      paramqal.c(localmjh.ak);
      localmjh.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mjg
 * JD-Core Version:    0.7.0.1
 */