public final class nfd
  extends qan<nfd>
{
  public ndq a = null;
  
  static
  {
    new qao(11, nfd.class, (int)696921762L, false);
  }
  
  public nfd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ndq localndq = this.a;
      int j = qal.d(8);
      int k = localndq.a();
      localndq.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ndq localndq = this.a;
      paramqal.c(10);
      if (localndq.ak < 0) {
        localndq.ak = localndq.a();
      }
      paramqal.c(localndq.ak);
      localndq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nfd
 * JD-Core Version:    0.7.0.1
 */