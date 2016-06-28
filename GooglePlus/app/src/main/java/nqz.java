public final class nqz
  extends qan<nqz>
{
  private static volatile nqz[] b;
  public nqy a = null;
  
  public nqz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nqz[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new nqz[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nqy localnqy = this.a;
      int j = qal.d(8);
      int k = localnqy.a();
      localnqy.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nqy localnqy = this.a;
      paramqal.c(10);
      if (localnqy.ak < 0) {
        localnqy.ak = localnqy.a();
      }
      paramqal.c(localnqy.ak);
      localnqy.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqz
 * JD-Core Version:    0.7.0.1
 */