public final class oaa
  extends qan<oaa>
{
  public qoq a = null;
  private String b = null;
  
  public oaa()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      qoq localqoq = this.a;
      int m = qal.d(8);
      int n = localqoq.a();
      localqoq.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      String str = this.b;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      qoq localqoq = this.a;
      paramqal.c(10);
      if (localqoq.ak < 0) {
        localqoq.ak = localqoq.a();
      }
      paramqal.c(localqoq.ak);
      localqoq.a(paramqal);
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oaa
 * JD-Core Version:    0.7.0.1
 */