public final class oml
  extends qan<oml>
{
  public omk a = null;
  public omk b = null;
  
  public oml()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      omk localomk2 = this.a;
      int m = qal.d(8);
      int n = localomk2.a();
      localomk2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      omk localomk1 = this.b;
      int j = qal.d(16);
      int k = localomk1.a();
      localomk1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      omk localomk2 = this.a;
      paramqal.c(10);
      if (localomk2.ak < 0) {
        localomk2.ak = localomk2.a();
      }
      paramqal.c(localomk2.ak);
      localomk2.a(paramqal);
    }
    if (this.b != null)
    {
      omk localomk1 = this.b;
      paramqal.c(18);
      if (localomk1.ak < 0) {
        localomk1.ak = localomk1.a();
      }
      paramqal.c(localomk1.ak);
      localomk1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oml
 * JD-Core Version:    0.7.0.1
 */