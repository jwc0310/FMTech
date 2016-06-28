public final class nmb
  extends qan<nmb>
{
  public nji a = null;
  
  public nmb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nji localnji = this.a;
      int j = qal.d(8);
      int k = localnji.a();
      localnji.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nji localnji = this.a;
      paramqal.c(10);
      if (localnji.ak < 0) {
        localnji.ak = localnji.a();
      }
      paramqal.c(localnji.ak);
      localnji.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmb
 * JD-Core Version:    0.7.0.1
 */