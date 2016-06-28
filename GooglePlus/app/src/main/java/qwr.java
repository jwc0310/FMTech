public final class qwr
  extends qan<qwr>
{
  private static volatile qwr[] c;
  public ome a = null;
  public Boolean b = null;
  private Boolean d = null;
  
  public qwr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qwr[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new qwr[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.c(1, this.a);
    }
    if (this.d != null) {
      i += qal.b(2, this.d.booleanValue());
    }
    if (this.b != null) {
      i += qal.b(3, this.b.booleanValue());
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if (this.d != null) {
      paramqal.a(2, this.d.booleanValue());
    }
    if (this.b != null) {
      paramqal.a(3, this.b.booleanValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qwr
 * JD-Core Version:    0.7.0.1
 */