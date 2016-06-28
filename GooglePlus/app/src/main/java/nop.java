public final class nop
  extends qan<nop>
{
  public nol a = null;
  private noq b = null;
  private String c = null;
  
  public nop()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nol localnol = this.a;
      int i1 = qal.d(8);
      int i2 = localnol.a();
      localnol.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      noq localnoq = this.b;
      int m = qal.d(16);
      int n = localnoq.a();
      localnoq.ak = n;
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
      nol localnol = this.a;
      paramqal.c(10);
      if (localnol.ak < 0) {
        localnol.ak = localnol.a();
      }
      paramqal.c(localnol.ak);
      localnol.a(paramqal);
    }
    if (this.b != null)
    {
      noq localnoq = this.b;
      paramqal.c(18);
      if (localnoq.ak < 0) {
        localnoq.ak = localnoq.a();
      }
      paramqal.c(localnoq.ak);
      localnoq.a(paramqal);
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
 * Qualified Name:     nop
 * JD-Core Version:    0.7.0.1
 */