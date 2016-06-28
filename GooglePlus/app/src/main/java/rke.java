public final class rke
  extends qan<rke>
{
  private static volatile rke[] b;
  public String a = null;
  private String c = null;
  private rkf d = null;
  
  public rke()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static rke[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new rke[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.b(1, this.a);
    }
    if (this.c != null) {
      i += qal.b(2, this.c);
    }
    if (this.d != null) {
      i += qal.c(3, this.d);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if (this.c != null) {
      paramqal.a(2, this.c);
    }
    if (this.d != null) {
      paramqal.a(3, this.d);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rke
 * JD-Core Version:    0.7.0.1
 */