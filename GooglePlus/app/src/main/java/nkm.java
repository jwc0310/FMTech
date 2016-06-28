public final class nkm
  extends qan<nkm>
{
  private static volatile nkm[] a;
  private Long b = null;
  private String c = null;
  
  public nkm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nkm[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nkm[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      this.b.longValue();
      i += 8 + qal.d(8);
    }
    if (this.c != null)
    {
      String str = this.c;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      long l = this.b.longValue();
      paramqal.c(9);
      paramqal.c(l);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nkm
 * JD-Core Version:    0.7.0.1
 */