public final class ndw
  extends qan<ndw>
{
  private static volatile ndw[] a;
  private String b = null;
  
  public ndw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ndw[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new ndw[0];
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
      int j = qal.d(8);
      int k = qal.a(str);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndw
 * JD-Core Version:    0.7.0.1
 */