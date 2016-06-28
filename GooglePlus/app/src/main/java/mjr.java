public final class mjr
  extends qan<mjr>
{
  private static volatile mjr[] b;
  public mjq a = null;
  
  public mjr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mjr[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new mjr[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mjq localmjq = this.a;
      int j = qal.d(8);
      int k = localmjq.a();
      localmjq.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mjq localmjq = this.a;
      paramqal.c(10);
      if (localmjq.ak < 0) {
        localmjq.ak = localmjq.a();
      }
      paramqal.c(localmjq.ak);
      localmjq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mjr
 * JD-Core Version:    0.7.0.1
 */