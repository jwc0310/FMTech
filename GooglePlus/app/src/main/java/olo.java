public final class olo
  extends qan<olo>
{
  public String a = null;
  public olp b = null;
  
  public olo()
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
      olp localolp = this.b;
      int j = qal.d(16);
      int k = localolp.a();
      localolp.ak = k;
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
      olp localolp = this.b;
      paramqal.c(18);
      if (localolp.ak < 0) {
        localolp.ak = localolp.a();
      }
      paramqal.c(localolp.ak);
      localolp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olo
 * JD-Core Version:    0.7.0.1
 */