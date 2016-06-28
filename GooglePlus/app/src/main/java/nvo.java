public final class nvo
  extends qan<nvo>
{
  private nvp a = null;
  private nvp b = null;
  private nvp c = null;
  private nvp d = null;
  private nvp e = null;
  
  public nvo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nvp localnvp5 = this.a;
      int i5 = qal.d(8);
      int i6 = localnvp5.a();
      localnvp5.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      nvp localnvp4 = this.b;
      int i3 = qal.d(16);
      int i4 = localnvp4.a();
      localnvp4.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      nvp localnvp3 = this.c;
      int i1 = qal.d(24);
      int i2 = localnvp3.a();
      localnvp3.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      nvp localnvp2 = this.d;
      int m = qal.d(32);
      int n = localnvp2.a();
      localnvp2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      nvp localnvp1 = this.e;
      int j = qal.d(40);
      int k = localnvp1.a();
      localnvp1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nvp localnvp5 = this.a;
      paramqal.c(10);
      if (localnvp5.ak < 0) {
        localnvp5.ak = localnvp5.a();
      }
      paramqal.c(localnvp5.ak);
      localnvp5.a(paramqal);
    }
    if (this.b != null)
    {
      nvp localnvp4 = this.b;
      paramqal.c(18);
      if (localnvp4.ak < 0) {
        localnvp4.ak = localnvp4.a();
      }
      paramqal.c(localnvp4.ak);
      localnvp4.a(paramqal);
    }
    if (this.c != null)
    {
      nvp localnvp3 = this.c;
      paramqal.c(26);
      if (localnvp3.ak < 0) {
        localnvp3.ak = localnvp3.a();
      }
      paramqal.c(localnvp3.ak);
      localnvp3.a(paramqal);
    }
    if (this.d != null)
    {
      nvp localnvp2 = this.d;
      paramqal.c(34);
      if (localnvp2.ak < 0) {
        localnvp2.ak = localnvp2.a();
      }
      paramqal.c(localnvp2.ak);
      localnvp2.a(paramqal);
    }
    if (this.e != null)
    {
      nvp localnvp1 = this.e;
      paramqal.c(42);
      if (localnvp1.ak < 0) {
        localnvp1.ak = localnvp1.a();
      }
      paramqal.c(localnvp1.ak);
      localnvp1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nvo
 * JD-Core Version:    0.7.0.1
 */