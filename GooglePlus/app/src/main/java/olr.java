public final class olr
  extends qan<olr>
{
  public ope a = null;
  public oow b = null;
  public omi c = null;
  public Long d = null;
  private olg e = null;
  private qbe f = null;
  private omd g = null;
  
  public olr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ope localope = this.a;
      int i7 = qal.d(8);
      int i8 = localope.a();
      localope.ak = i8;
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      oow localoow = this.b;
      int i5 = qal.d(16);
      int i6 = localoow.a();
      localoow.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.e != null)
    {
      olg localolg = this.e;
      int i3 = qal.d(24);
      int i4 = localolg.a();
      localolg.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.f != null)
    {
      qbe localqbe = this.f;
      int i1 = qal.d(32);
      int i2 = localqbe.a();
      localqbe.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      omi localomi = this.c;
      int m = qal.d(40);
      int n = localomi.a();
      localomi.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.g != null)
    {
      omd localomd = this.g;
      int j = qal.d(48);
      int k = localomd.a();
      localomd.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      i += qal.d(56) + qal.b(l);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ope localope = this.a;
      paramqal.c(10);
      if (localope.ak < 0) {
        localope.ak = localope.a();
      }
      paramqal.c(localope.ak);
      localope.a(paramqal);
    }
    if (this.b != null)
    {
      oow localoow = this.b;
      paramqal.c(18);
      if (localoow.ak < 0) {
        localoow.ak = localoow.a();
      }
      paramqal.c(localoow.ak);
      localoow.a(paramqal);
    }
    if (this.e != null)
    {
      olg localolg = this.e;
      paramqal.c(26);
      if (localolg.ak < 0) {
        localolg.ak = localolg.a();
      }
      paramqal.c(localolg.ak);
      localolg.a(paramqal);
    }
    if (this.f != null)
    {
      qbe localqbe = this.f;
      paramqal.c(34);
      if (localqbe.ak < 0) {
        localqbe.ak = localqbe.a();
      }
      paramqal.c(localqbe.ak);
      localqbe.a(paramqal);
    }
    if (this.c != null)
    {
      omi localomi = this.c;
      paramqal.c(42);
      if (localomi.ak < 0) {
        localomi.ak = localomi.a();
      }
      paramqal.c(localomi.ak);
      localomi.a(paramqal);
    }
    if (this.g != null)
    {
      omd localomd = this.g;
      paramqal.c(50);
      if (localomd.ak < 0) {
        localomd.ak = localomd.a();
      }
      paramqal.c(localomd.ak);
      localomd.a(paramqal);
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      paramqal.c(56);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olr
 * JD-Core Version:    0.7.0.1
 */