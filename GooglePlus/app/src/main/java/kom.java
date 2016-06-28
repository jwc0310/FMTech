public final class kom
  extends qan<kom>
{
  public String a = null;
  public qbe b = null;
  
  public kom()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int m = qal.d(8);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      qbe localqbe = this.b;
      int j = qal.d(16);
      int k = localqbe.a();
      localqbe.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      qbe localqbe = this.b;
      paramqal.c(18);
      if (localqbe.ak < 0) {
        localqbe.ak = localqbe.a();
      }
      paramqal.c(localqbe.ak);
      localqbe.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kom
 * JD-Core Version:    0.7.0.1
 */