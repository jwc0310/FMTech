public final class mkz
  extends qan<mkz>
{
  public mji a = null;
  public String b = null;
  public mky c = null;
  private String d = null;
  
  public mkz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mji localmji = this.a;
      int i3 = qal.d(8);
      int i4 = localmji.a();
      localmji.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i1 = qal.d(16);
      int i2 = qal.a(str2);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int m = qal.d(24);
      int n = qal.a(str1);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      mky localmky = this.c;
      int j = qal.d(32);
      int k = localmky.a();
      localmky.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mji localmji = this.a;
      paramqal.c(10);
      if (localmji.ak < 0) {
        localmji.ak = localmji.a();
      }
      paramqal.c(localmji.ak);
      localmji.a(paramqal);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(26);
      paramqal.a(str1);
    }
    if (this.c != null)
    {
      mky localmky = this.c;
      paramqal.c(34);
      if (localmky.ak < 0) {
        localmky.ak = localmky.a();
      }
      paramqal.c(localmky.ak);
      localmky.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkz
 * JD-Core Version:    0.7.0.1
 */