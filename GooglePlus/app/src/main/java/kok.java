public final class kok
  extends qan<kok>
{
  private static volatile kok[] c;
  public Integer a = null;
  public String b = null;
  
  public kok()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static kok[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new kok[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int i1;
    int i2;
    if (this.a != null)
    {
      int n = this.a.intValue();
      i1 = qal.d(8);
      if (n >= 0) {
        i2 = qal.d(n);
      }
    }
    for (int j = i + (i2 + i1);; j = i)
    {
      if (this.b != null)
      {
        String str = this.b;
        int k = qal.d(16);
        int m = qal.a(str);
        j += k + (m + qal.d(m));
      }
      return j;
      i2 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int i = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kok
 * JD-Core Version:    0.7.0.1
 */