public final class nol
  extends qan<nol>
{
  public nom a = null;
  private non b = null;
  private noo c = null;
  
  public nol()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nom localnom = this.a;
      int i1 = qal.d(8);
      int i2 = localnom.a();
      localnom.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      non localnon = this.b;
      int m = qal.d(16);
      int n = localnon.a();
      localnon.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      noo localnoo = this.c;
      int j = qal.d(24);
      int k = localnoo.a();
      localnoo.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nom localnom = this.a;
      paramqal.c(10);
      if (localnom.ak < 0) {
        localnom.ak = localnom.a();
      }
      paramqal.c(localnom.ak);
      localnom.a(paramqal);
    }
    if (this.b != null)
    {
      non localnon = this.b;
      paramqal.c(18);
      if (localnon.ak < 0) {
        localnon.ak = localnon.a();
      }
      paramqal.c(localnon.ak);
      localnon.a(paramqal);
    }
    if (this.c != null)
    {
      noo localnoo = this.c;
      paramqal.c(26);
      if (localnoo.ak < 0) {
        localnoo.ak = localnoo.a();
      }
      paramqal.c(localnoo.ak);
      localnoo.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nol
 * JD-Core Version:    0.7.0.1
 */