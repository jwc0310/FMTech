public final class qop
  extends qan<qop>
{
  private static volatile qop[] g;
  public int a = -2147483648;
  public String b = null;
  public qom c = null;
  public qoo d = null;
  public qor e = null;
  public qon f = null;
  
  public qop()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qop[] b()
  {
    if (g == null) {}
    synchronized (qar.a)
    {
      if (g == null) {
        g = new qop[0];
      }
      return g;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != -2147483648) {
      i += qal.e(1, this.a);
    }
    if (this.b != null) {
      i += qal.b(2, this.b);
    }
    if (this.c != null) {
      i += qal.c(3, this.c);
    }
    if (this.d != null) {
      i += qal.c(4, this.d);
    }
    if (this.e != null) {
      i += qal.c(5, this.e);
    }
    if (this.f != null) {
      i += qal.c(6, this.f);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648) {
      paramqal.a(1, this.a);
    }
    if (this.b != null) {
      paramqal.a(2, this.b);
    }
    if (this.c != null) {
      paramqal.a(3, this.c);
    }
    if (this.d != null) {
      paramqal.a(4, this.d);
    }
    if (this.e != null) {
      paramqal.a(5, this.e);
    }
    if (this.f != null) {
      paramqal.a(6, this.f);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qop
 * JD-Core Version:    0.7.0.1
 */