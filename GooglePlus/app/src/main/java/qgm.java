public final class qgm
  extends qan<qgm>
{
  private static volatile qgm[] c;
  public String a = null;
  public String b = null;
  private String d = null;
  private String e = null;
  private int f = -2147483648;
  private qhr g = null;
  private String h = null;
  private String i = null;
  
  public qgm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qgm[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new qgm[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int j = super.a();
    if (this.a != null) {
      j += qal.b(1, this.a);
    }
    if (this.b != null) {
      j += qal.b(2, this.b);
    }
    if (this.f != -2147483648) {
      j += qal.e(3, this.f);
    }
    if (this.g != null) {
      j += qal.c(4, this.g);
    }
    if (this.h != null) {
      j += qal.b(5, this.h);
    }
    if (this.i != null) {
      j += qal.b(6, this.i);
    }
    if (this.d != null) {
      j += qal.b(7, this.d);
    }
    if (this.e != null) {
      j += qal.b(8, this.e);
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if (this.b != null) {
      paramqal.a(2, this.b);
    }
    if (this.f != -2147483648) {
      paramqal.a(3, this.f);
    }
    if (this.g != null) {
      paramqal.a(4, this.g);
    }
    if (this.h != null) {
      paramqal.a(5, this.h);
    }
    if (this.i != null) {
      paramqal.a(6, this.i);
    }
    if (this.d != null) {
      paramqal.a(7, this.d);
    }
    if (this.e != null) {
      paramqal.a(8, this.e);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qgm
 * JD-Core Version:    0.7.0.1
 */