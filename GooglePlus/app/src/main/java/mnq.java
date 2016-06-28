public final class mnq
  extends qan<mnq>
{
  private mnr a = null;
  
  public mnq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mnr localmnr = this.a;
      int j = qal.d(8);
      int k = localmnr.a();
      localmnr.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mnr localmnr = this.a;
      paramqal.c(10);
      if (localmnr.ak < 0) {
        localmnr.ak = localmnr.a();
      }
      paramqal.c(localmnr.ak);
      localmnr.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mnq
 * JD-Core Version:    0.7.0.1
 */