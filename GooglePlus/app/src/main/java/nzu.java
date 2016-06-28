public final class nzu
  extends qan<nzu>
{
  private static volatile nzu[] a;
  private String b = null;
  
  public nzu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nzu[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nzu[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    String str = this.b;
    int j = qal.d(8);
    int k = qal.a(str);
    return i + (j + (k + qal.d(k)));
  }
  
  public final void a(qal paramqal)
  {
    String str = this.b;
    paramqal.c(10);
    paramqal.a(str);
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzu
 * JD-Core Version:    0.7.0.1
 */