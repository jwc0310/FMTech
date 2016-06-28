public final class qjj
  extends qan<qjj>
{
  private static volatile qjj[] b;
  public String a = null;
  private String c = null;
  private String d = null;
  private pjd e = null;
  
  public qjj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qjj[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new qjj[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null) {
      i += qal.b(1, this.c);
    }
    if (this.d != null) {
      i += qal.b(2, this.d);
    }
    if (this.a != null) {
      i += qal.b(3, this.a);
    }
    if (this.e != null) {
      i += qal.c(4, this.e);
    }
    return i;
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qjj
 * JD-Core Version:    0.7.0.1
 */