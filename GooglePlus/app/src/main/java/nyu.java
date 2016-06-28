public final class nyu
  extends qan<nyu>
{
  public nwz a = null;
  
  public nyu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nwz localnwz = this.a;
      int j = qal.d(8);
      int k = localnwz.a();
      localnwz.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nwz localnwz = this.a;
      paramqal.c(10);
      if (localnwz.ak < 0) {
        localnwz.ak = localnwz.a();
      }
      paramqal.c(localnwz.ak);
      localnwz.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nyu
 * JD-Core Version:    0.7.0.1
 */