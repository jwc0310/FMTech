public final class ntf
  extends qan<ntf>
{
  public oir a = null;
  
  public ntf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oir localoir = this.a;
      int j = qal.d(8);
      int k = localoir.a();
      localoir.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oir localoir = this.a;
      paramqal.c(10);
      if (localoir.ak < 0) {
        localoir.ak = localoir.a();
      }
      paramqal.c(localoir.ak);
      localoir.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ntf
 * JD-Core Version:    0.7.0.1
 */