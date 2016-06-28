public final class rcj
  extends qan<rcj>
{
  private static volatile rcj[] b;
  public qpk a = null;
  
  public rcj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static rcj[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new rcj[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.c(1, this.a);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rcj
 * JD-Core Version:    0.7.0.1
 */