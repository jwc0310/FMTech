public final class ndi
  extends qan<ndi>
{
  private static volatile ndi[] a;
  private ndj b = null;
  private String c = null;
  private String d = null;
  
  public ndi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ndi[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new ndi[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      ndj localndj = this.b;
      int i1 = qal.d(8);
      int i2 = localndj.a();
      localndj.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int m = qal.d(16);
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
      ndj localndj = this.b;
      paramqal.c(10);
      if (localndj.ak < 0) {
        localndj.ak = localndj.a();
      }
      paramqal.c(localndj.ak);
      localndj.a(paramqal);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(18);
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
 * Qualified Name:     ndi
 * JD-Core Version:    0.7.0.1
 */