public final class mkh
  extends qan<mkh>
{
  public String a = null;
  private String b = null;
  private mkn c = null;
  private String d = null;
  
  public mkh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str3 = this.b;
      int i3 = qal.d(8);
      int i4 = qal.a(str3);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      mkn localmkn = this.c;
      int i1 = qal.d(16);
      int i2 = localmkn.a();
      localmkn.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.a != null)
    {
      String str2 = this.a;
      int m = qal.d(24);
      int n = qal.a(str2);
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
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.c != null)
    {
      mkn localmkn = this.c;
      paramqal.c(18);
      if (localmkn.ak < 0) {
        localmkn.ak = localmkn.a();
      }
      paramqal.c(localmkn.ak);
      localmkn.a(paramqal);
    }
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(26);
      paramqal.a(str2);
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
 * Qualified Name:     mkh
 * JD-Core Version:    0.7.0.1
 */