public final class nqk
  extends qan<nqk>
{
  private ply a = null;
  
  public nqk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ply localply = this.a;
      int j = qal.d(8);
      int k = localply.a();
      localply.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ply localply = this.a;
      paramqal.c(10);
      if (localply.ak < 0) {
        localply.ak = localply.a();
      }
      paramqal.c(localply.ak);
      localply.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqk
 * JD-Core Version:    0.7.0.1
 */