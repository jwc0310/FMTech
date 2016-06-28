public final class olw
  extends qan<olw>
{
  private String a = null;
  private oky b = null;
  private olx c = null;
  
  public olw()
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
      int i1 = qal.d(16);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      oky localoky = this.b;
      int m = qal.d(24);
      int n = localoky.a();
      localoky.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      olx localolx = this.c;
      int j = qal.d(32);
      int k = localolx.a();
      localolx.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      oky localoky = this.b;
      paramqal.c(26);
      if (localoky.ak < 0) {
        localoky.ak = localoky.a();
      }
      paramqal.c(localoky.ak);
      localoky.a(paramqal);
    }
    if (this.c != null)
    {
      olx localolx = this.c;
      paramqal.c(34);
      if (localolx.ak < 0) {
        localolx.ak = localolx.a();
      }
      paramqal.c(localolx.ak);
      localolx.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olw
 * JD-Core Version:    0.7.0.1
 */