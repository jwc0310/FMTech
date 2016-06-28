public final class mim
  extends qan<mim>
{
  public String a = null;
  private String b = null;
  private String c = null;
  private String d = null;
  
  public mim()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str4 = this.b;
      int i3 = qal.d(8);
      int i4 = qal.a(str4);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i1 = qal.d(16);
      int i2 = qal.a(str3);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int m = qal.d(24);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      String str1 = this.a;
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
      String str4 = this.b;
      paramqal.c(10);
      paramqal.a(str4);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.a != null)
    {
      String str1 = this.a;
      paramqal.c(34);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mim
 * JD-Core Version:    0.7.0.1
 */