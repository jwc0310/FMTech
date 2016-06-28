public final class nqt
  extends qan<nqt>
{
  private static volatile nqt[] a;
  private String b = null;
  private qml c = null;
  
  public nqt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nqt[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nqt[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str = this.b;
      int m = qal.d(8);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      qml localqml = this.c;
      int j = qal.d(16);
      int k = localqml.a();
      localqml.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.c != null)
    {
      qml localqml = this.c;
      paramqal.c(18);
      if (localqml.ak < 0) {
        localqml.ak = localqml.a();
      }
      paramqal.c(localqml.ak);
      localqml.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqt
 * JD-Core Version:    0.7.0.1
 */