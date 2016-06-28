public final class nyf
  extends qan<nyf>
{
  public nyc a = null;
  
  public nyf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nyc localnyc = this.a;
      int j = qal.d(8);
      int k = localnyc.a();
      localnyc.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nyc localnyc = this.a;
      paramqal.c(10);
      if (localnyc.ak < 0) {
        localnyc.ak = localnyc.a();
      }
      paramqal.c(localnyc.ak);
      localnyc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nyf
 * JD-Core Version:    0.7.0.1
 */