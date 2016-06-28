public final class nyj
  extends qan<nyj>
{
  public nyd a = null;
  public nya b = null;
  public String c = null;
  
  public nyj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nyd localnyd = this.a;
      int i1 = qal.d(8);
      int i2 = localnyd.a();
      localnyd.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      nya localnya = this.b;
      int m = qal.d(16);
      int n = localnya.a();
      localnya.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      String str = this.c;
      int j = qal.d(24);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nyd localnyd = this.a;
      paramqal.c(10);
      if (localnyd.ak < 0) {
        localnyd.ak = localnyd.a();
      }
      paramqal.c(localnyd.ak);
      localnyd.a(paramqal);
    }
    if (this.b != null)
    {
      nya localnya = this.b;
      paramqal.c(18);
      if (localnya.ak < 0) {
        localnya.ak = localnya.a();
      }
      paramqal.c(localnya.ak);
      localnya.a(paramqal);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(26);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nyj
 * JD-Core Version:    0.7.0.1
 */