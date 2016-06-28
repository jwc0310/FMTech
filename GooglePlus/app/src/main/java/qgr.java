public final class qgr
  extends qan<qgr>
{
  private static volatile qgr[] d;
  public String a = null;
  public qgs[] b = qgs.b();
  public Boolean c = null;
  
  public qgr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qgr[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new qgr[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.b(1, this.a);
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        qgs localqgs = this.b[k];
        if (localqgs != null) {
          j += qal.c(2, localqgs);
        }
      }
      i = j;
    }
    if (this.c != null) {
      i += qal.b(3, this.c.booleanValue());
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        qgs localqgs = this.b[i];
        if (localqgs != null) {
          paramqal.a(2, localqgs);
        }
      }
    }
    if (this.c != null) {
      paramqal.a(3, this.c.booleanValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qgr
 * JD-Core Version:    0.7.0.1
 */