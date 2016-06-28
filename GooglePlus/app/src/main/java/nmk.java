public final class nmk
  extends qan<nmk>
{
  private String a = null;
  private String b = null;
  private nml c = null;
  
  public nmk()
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
      int i1 = qal.d(8);
      int i2 = qal.a(str2);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int m = qal.d(16);
      int n = qal.a(str1);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      nml localnml = this.c;
      int j = qal.d(24);
      int k = localnml.a();
      localnml.ak = k;
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
      nml localnml = this.c;
      paramqal.c(26);
      if (localnml.ak < 0) {
        localnml.ak = localnml.a();
      }
      paramqal.c(localnml.ak);
      localnml.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmk
 * JD-Core Version:    0.7.0.1
 */