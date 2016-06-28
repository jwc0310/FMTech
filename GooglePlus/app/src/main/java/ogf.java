public final class ogf
  extends qan<ogf>
{
  public ope a = null;
  
  public ogf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ope localope = this.a;
      int j = qal.d(8);
      int k = localope.a();
      localope.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ope localope = this.a;
      paramqal.c(10);
      if (localope.ak < 0) {
        localope.ak = localope.a();
      }
      paramqal.c(localope.ak);
      localope.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogf
 * JD-Core Version:    0.7.0.1
 */