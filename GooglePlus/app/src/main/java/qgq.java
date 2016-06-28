public final class qgq
  extends qan<qgq>
{
  public qgr[] a = qgr.b();
  private byte[] b = null;
  private String c = null;
  private qgr d = null;
  private qgm e = null;
  private int f = -2147483648;
  
  public qgq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null) {
      i += qal.b(1, this.b);
    }
    if (this.c != null) {
      i += qal.b(2, this.c);
    }
    if ((this.a != null) && (this.a.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.a.length; k++)
      {
        qgr localqgr = this.a[k];
        if (localqgr != null) {
          j += qal.c(3, localqgr);
        }
      }
      i = j;
    }
    if (this.d != null) {
      i += qal.c(4, this.d);
    }
    if (this.e != null) {
      i += qal.c(5, this.e);
    }
    if (this.f != -2147483648) {
      i += qal.e(6, this.f);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null) {
      paramqal.a(1, this.b);
    }
    if (this.c != null) {
      paramqal.a(2, this.c);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        qgr localqgr = this.a[i];
        if (localqgr != null) {
          paramqal.a(3, localqgr);
        }
      }
    }
    if (this.d != null) {
      paramqal.a(4, this.d);
    }
    if (this.e != null) {
      paramqal.a(5, this.e);
    }
    if (this.f != -2147483648) {
      paramqal.a(6, this.f);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qgq
 * JD-Core Version:    0.7.0.1
 */