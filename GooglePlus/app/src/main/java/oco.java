public final class oco
  extends qan<oco>
{
  public String a = null;
  private Long b = null;
  private String c = null;
  
  public oco()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      long l = this.b.longValue();
      i += qal.d(8) + qal.b(l);
    }
    if (this.a != null)
    {
      String str2 = this.a;
      int m = qal.d(16);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int j = qal.d(24);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      long l = this.b.longValue();
      paramqal.c(8);
      paramqal.a(l);
    }
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(26);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oco
 * JD-Core Version:    0.7.0.1
 */