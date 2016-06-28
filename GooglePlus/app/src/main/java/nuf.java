public final class nuf
  extends qan<nuf>
{
  public String a = null;
  private nui b = null;
  
  public nuf()
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
      nui localnui = this.b;
      int j = qal.d(16);
      int k = localnui.a();
      localnui.ak = k;
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
      nui localnui = this.b;
      paramqal.c(18);
      if (localnui.ak < 0) {
        localnui.ak = localnui.a();
      }
      paramqal.c(localnui.ak);
      localnui.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nuf
 * JD-Core Version:    0.7.0.1
 */