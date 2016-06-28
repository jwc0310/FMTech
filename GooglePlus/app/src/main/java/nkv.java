public final class nkv
  extends qan<nkv>
{
  private String a = null;
  private String b = null;
  private nkw c = null;
  private nkx d = null;
  private nku e = null;
  
  public nkv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i5 = qal.d(8);
      int i6 = qal.a(str2);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int i3 = qal.d(16);
      int i4 = qal.a(str1);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      nkw localnkw = this.c;
      int i1 = qal.d(24);
      int i2 = localnkw.a();
      localnkw.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      nkx localnkx = this.d;
      int m = qal.d(32);
      int n = localnkx.a();
      localnkx.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      nku localnku = this.e;
      int j = qal.d(40);
      int k = localnku.a();
      localnku.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if (this.c != null)
    {
      nkw localnkw = this.c;
      paramqal.c(26);
      if (localnkw.ak < 0) {
        localnkw.ak = localnkw.a();
      }
      paramqal.c(localnkw.ak);
      localnkw.a(paramqal);
    }
    if (this.d != null)
    {
      nkx localnkx = this.d;
      paramqal.c(34);
      if (localnkx.ak < 0) {
        localnkx.ak = localnkx.a();
      }
      paramqal.c(localnkx.ak);
      localnkx.a(paramqal);
    }
    if (this.e != null)
    {
      nku localnku = this.e;
      paramqal.c(42);
      if (localnku.ak < 0) {
        localnku.ak = localnku.a();
      }
      paramqal.c(localnku.ak);
      localnku.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nkv
 * JD-Core Version:    0.7.0.1
 */