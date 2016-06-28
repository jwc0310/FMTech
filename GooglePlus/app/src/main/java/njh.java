public final class njh
  extends qan<njh>
{
  private static volatile njh[] f;
  public nmd a = null;
  public nij b = null;
  public njg c = null;
  public njg d = null;
  public Long e = null;
  private njk g = null;
  
  public njh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static njh[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new njh[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nmd localnmd = this.a;
      int i5 = qal.d(8);
      int i6 = localnmd.a();
      localnmd.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      nij localnij = this.b;
      int i3 = qal.d(16);
      int i4 = localnij.a();
      localnij.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      njg localnjg2 = this.c;
      int i1 = qal.d(24);
      int i2 = localnjg2.a();
      localnjg2.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      njg localnjg1 = this.d;
      int m = qal.d(32);
      int n = localnjg1.a();
      localnjg1.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.g != null)
    {
      njk localnjk = this.g;
      int j = qal.d(40);
      int k = localnjk.a();
      localnjk.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.e != null)
    {
      long l = this.e.longValue();
      i += qal.d(48) + qal.b(l);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nmd localnmd = this.a;
      paramqal.c(10);
      if (localnmd.ak < 0) {
        localnmd.ak = localnmd.a();
      }
      paramqal.c(localnmd.ak);
      localnmd.a(paramqal);
    }
    if (this.b != null)
    {
      nij localnij = this.b;
      paramqal.c(18);
      if (localnij.ak < 0) {
        localnij.ak = localnij.a();
      }
      paramqal.c(localnij.ak);
      localnij.a(paramqal);
    }
    if (this.c != null)
    {
      njg localnjg2 = this.c;
      paramqal.c(26);
      if (localnjg2.ak < 0) {
        localnjg2.ak = localnjg2.a();
      }
      paramqal.c(localnjg2.ak);
      localnjg2.a(paramqal);
    }
    if (this.d != null)
    {
      njg localnjg1 = this.d;
      paramqal.c(34);
      if (localnjg1.ak < 0) {
        localnjg1.ak = localnjg1.a();
      }
      paramqal.c(localnjg1.ak);
      localnjg1.a(paramqal);
    }
    if (this.g != null)
    {
      njk localnjk = this.g;
      paramqal.c(42);
      if (localnjk.ak < 0) {
        localnjk.ak = localnjk.a();
      }
      paramqal.c(localnjk.ak);
      localnjk.a(paramqal);
    }
    if (this.e != null)
    {
      long l = this.e.longValue();
      paramqal.c(48);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     njh
 * JD-Core Version:    0.7.0.1
 */