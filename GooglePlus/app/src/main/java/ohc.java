public final class ohc
  extends qan<ohc>
{
  private static volatile ohc[] b;
  public oqx a = null;
  
  public ohc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ohc[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new ohc[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oqx localoqx = this.a;
      int j = qal.d(8);
      int k = localoqx.a();
      localoqx.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oqx localoqx = this.a;
      paramqal.c(10);
      if (localoqx.ak < 0) {
        localoqx.ak = localoqx.a();
      }
      paramqal.c(localoqx.ak);
      localoqx.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohc
 * JD-Core Version:    0.7.0.1
 */