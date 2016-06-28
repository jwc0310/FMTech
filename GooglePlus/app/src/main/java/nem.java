public final class nem
  extends qan<nem>
{
  public ndy a = null;
  public omk b = null;
  
  static
  {
    new qao(11, nem.class, (int)410682042L, false);
  }
  
  public nem()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ndy localndy = this.a;
      int m = qal.d(16);
      int n = localndy.a();
      localndy.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      omk localomk = this.b;
      int j = qal.d(24);
      int k = localomk.a();
      localomk.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ndy localndy = this.a;
      paramqal.c(18);
      if (localndy.ak < 0) {
        localndy.ak = localndy.a();
      }
      paramqal.c(localndy.ak);
      localndy.a(paramqal);
    }
    if (this.b != null)
    {
      omk localomk = this.b;
      paramqal.c(26);
      if (localomk.ak < 0) {
        localomk.ak = localomk.a();
      }
      paramqal.c(localomk.ak);
      localomk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nem
 * JD-Core Version:    0.7.0.1
 */