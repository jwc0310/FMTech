public final class nyz
  extends qan<nyz>
{
  public oon a = null;
  public nxx b = null;
  private int c = -2147483648;
  
  public nyz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oon localoon = this.a;
      int i2 = qal.d(8);
      int i3 = localoon.a();
      localoon.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.c != -2147483648)
    {
      m = this.c;
      n = qal.d(16);
      if (m < 0) {
        break label140;
      }
    }
    label140:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.b != null)
      {
        nxx localnxx = this.b;
        int j = qal.d(24);
        int k = localnxx.a();
        localnxx.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oon localoon = this.a;
      paramqal.c(10);
      if (localoon.ak < 0) {
        localoon.ak = localoon.a();
      }
      paramqal.c(localoon.ak);
      localoon.a(paramqal);
    }
    if (this.c != -2147483648)
    {
      int i = this.c;
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      nxx localnxx = this.b;
      paramqal.c(26);
      if (localnxx.ak < 0) {
        localnxx.ak = localnxx.a();
      }
      paramqal.c(localnxx.ak);
      localnxx.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nyz
 * JD-Core Version:    0.7.0.1
 */