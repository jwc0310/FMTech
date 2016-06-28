public final class qoq
  extends qan<qoq>
{
  private static volatile qoq[] b;
  public qop[] a = qop.b();
  
  public qoq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qoq[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new qoq[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        qop localqop = this.a[j];
        if (localqop != null) {
          i += qal.c(1, localqop);
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        qop localqop = this.a[i];
        if (localqop != null) {
          paramqal.a(1, localqop);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qoq
 * JD-Core Version:    0.7.0.1
 */