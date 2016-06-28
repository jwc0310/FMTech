public final class nhr
  extends qan<nhr>
{
  private String a = null;
  private nhu b = null;
  
  public nhr()
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
      nhu localnhu = this.b;
      int j = qal.d(16);
      int k = localnhu.a();
      localnhu.ak = k;
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
      nhu localnhu = this.b;
      paramqal.c(18);
      if (localnhu.ak < 0) {
        localnhu.ak = localnhu.a();
      }
      paramqal.c(localnhu.ak);
      localnhu.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhr
 * JD-Core Version:    0.7.0.1
 */