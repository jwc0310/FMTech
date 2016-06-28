public final class qml
  extends qan<qml>
{
  private static volatile qml[] b;
  public qmk a = null;
  private Boolean c = null;
  private int d = -2147483648;
  private String e = null;
  private qnd f = null;
  
  public qml()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qml[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new qml[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null) {
      i += qal.b(1, this.c.booleanValue());
    }
    if (this.f != null) {
      i += qal.c(2, this.f);
    }
    if (this.a != null) {
      i += qal.c(3, this.a);
    }
    if (this.d != -2147483648) {
      i += qal.e(4, this.d);
    }
    if (this.e != null) {
      i += qal.b(5, this.e);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null) {
      paramqal.a(1, this.c.booleanValue());
    }
    if (this.f != null) {
      paramqal.a(2, this.f);
    }
    if (this.a != null) {
      paramqal.a(3, this.a);
    }
    if (this.d != -2147483648) {
      paramqal.a(4, this.d);
    }
    if (this.e != null) {
      paramqal.a(5, this.e);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qml
 * JD-Core Version:    0.7.0.1
 */