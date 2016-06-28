public final class nwi
  extends qan<nwi>
{
  private static volatile nwi[] b;
  public String a = null;
  private String c = null;
  
  public nwi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nwi[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new nwi[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    String str1 = this.a;
    int j = qal.d(8);
    int k = qal.a(str1);
    int m = i + (j + (k + qal.d(k)));
    String str2 = this.c;
    int n = qal.d(16);
    int i1 = qal.a(str2);
    return m + (n + (i1 + qal.d(i1)));
  }
  
  public final void a(qal paramqal)
  {
    String str1 = this.a;
    paramqal.c(10);
    paramqal.a(str1);
    String str2 = this.c;
    paramqal.c(18);
    paramqal.a(str2);
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwi
 * JD-Core Version:    0.7.0.1
 */