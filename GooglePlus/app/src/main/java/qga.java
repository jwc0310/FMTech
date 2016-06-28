public final class qga
  extends qan<qga>
{
  private static volatile qga[] b;
  public qgb a = null;
  private String c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  private String g = null;
  private qgm h = null;
  private String i = null;
  private String j = null;
  private String k = null;
  
  public qga()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qga[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new qga[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.c != null) {
      m += qal.b(1, this.c);
    }
    if (this.d != null) {
      m += qal.b(2, this.d);
    }
    if (this.a != null) {
      m += qal.c(3, this.a);
    }
    if (this.e != null) {
      m += qal.b(4, this.e);
    }
    if (this.f != null) {
      m += qal.b(5, this.f);
    }
    if (this.h != null) {
      m += qal.c(6, this.h);
    }
    if (this.i != null) {
      m += qal.b(7, this.i);
    }
    if (this.j != null) {
      m += qal.b(8, this.j);
    }
    if (this.g != null) {
      m += qal.b(9, this.g);
    }
    if (this.k != null) {
      m += qal.b(10, this.k);
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null) {
      paramqal.a(1, this.c);
    }
    if (this.d != null) {
      paramqal.a(2, this.d);
    }
    if (this.a != null) {
      paramqal.a(3, this.a);
    }
    if (this.e != null) {
      paramqal.a(4, this.e);
    }
    if (this.f != null) {
      paramqal.a(5, this.f);
    }
    if (this.h != null) {
      paramqal.a(6, this.h);
    }
    if (this.i != null) {
      paramqal.a(7, this.i);
    }
    if (this.j != null) {
      paramqal.a(8, this.j);
    }
    if (this.g != null) {
      paramqal.a(9, this.g);
    }
    if (this.k != null) {
      paramqal.a(10, this.k);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qga
 * JD-Core Version:    0.7.0.1
 */