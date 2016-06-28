public final class nzo
  extends qan<nzo>
{
  public qoq a = null;
  
  public nzo()
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
      int j = qal.d(8);
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
      qoq localqoq = this.a;
      paramqal.c(10);
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
 * Qualified Name:     nzo
 * JD-Core Version:    0.7.0.1
 */