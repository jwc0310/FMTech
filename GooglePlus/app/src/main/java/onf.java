public final class onf
  extends qan<onf>
{
  public String a = null;
  private String b = null;
  private String c = null;
  
  public onf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    String str1 = this.b;
    int j = qal.d(8);
    int k = qal.a(str1);
    int m = i + (j + (k + qal.d(k)));
    if (this.a != null)
    {
      String str3 = this.a;
      int i2 = qal.d(16);
      int i3 = qal.a(str3);
      m += i2 + (i3 + qal.d(i3));
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int n = qal.d(24);
      int i1 = qal.a(str2);
      m += n + (i1 + qal.d(i1));
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    String str1 = this.b;
    paramqal.c(10);
    paramqal.a(str1);
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(26);
      paramqal.a(str2);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     onf
 * JD-Core Version:    0.7.0.1
 */