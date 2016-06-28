public final class nlg
  extends qan<nlg>
{
  private static volatile nlg[] a;
  private Long b = null;
  
  public nlg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nlg[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nlg[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      long l = this.b.longValue();
      i += qal.d(8) + qal.b(l);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nlg
 * JD-Core Version:    0.7.0.1
 */