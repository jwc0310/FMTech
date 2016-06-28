public final class new
  extends qan<new>
{
  public String a = null;
  private ney b = null;
  private nez c = null;
  
  static
  {
    new qao(11, new.class, (int)428930274L, false);
  }
  
  public new()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i1 = qal.d(8);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      ney localney = this.b;
      int m = qal.d(16);
      int n = localney.a();
      localney.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      nez localnez = this.c;
      int j = qal.d(24);
      int k = localnez.a();
      localnez.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      ney localney = this.b;
      paramqal.c(18);
      if (localney.ak < 0) {
        localney.ak = localney.a();
      }
      paramqal.c(localney.ak);
      localney.a(paramqal);
    }
    if (this.c != null)
    {
      nez localnez = this.c;
      paramqal.c(26);
      if (localnez.ak < 0) {
        localnez.ak = localnez.a();
      }
      paramqal.c(localnez.ak);
      localnez.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     new
 * JD-Core Version:    0.7.0.1
 */