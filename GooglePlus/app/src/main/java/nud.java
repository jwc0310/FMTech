public final class nud
  extends qan<nud>
{
  private nui a = null;
  private qoq b = null;
  
  public nud()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nui localnui = this.a;
      int m = qal.d(16);
      int n = localnui.a();
      localnui.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      qoq localqoq = this.b;
      int j = qal.d(24);
      int k = localqoq.a();
      localqoq.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nui localnui = this.a;
      paramqal.c(18);
      if (localnui.ak < 0) {
        localnui.ak = localnui.a();
      }
      paramqal.c(localnui.ak);
      localnui.a(paramqal);
    }
    if (this.b != null)
    {
      qoq localqoq = this.b;
      paramqal.c(26);
      if (localqoq.ak < 0) {
        localqoq.ak = localqoq.a();
      }
      paramqal.c(localqoq.ak);
      localqoq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nud
 * JD-Core Version:    0.7.0.1
 */