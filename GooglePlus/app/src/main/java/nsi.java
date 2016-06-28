public final class nsi
  extends qan<nsi>
{
  public String a = null;
  public String b = null;
  public nsl c = null;
  private String d = null;
  
  public nsi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i3 = qal.d(8);
      int i4 = qal.a(str3);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i1 = qal.d(16);
      int i2 = qal.a(str2);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      nsl localnsl = this.c;
      int m = qal.d(24);
      int n = localnsl.a();
      localnsl.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int j = qal.d(32);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      nsl localnsl = this.c;
      paramqal.c(26);
      if (localnsl.ak < 0) {
        localnsl.ak = localnsl.a();
      }
      paramqal.c(localnsl.ak);
      localnsl.a(paramqal);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(34);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsi
 * JD-Core Version:    0.7.0.1
 */