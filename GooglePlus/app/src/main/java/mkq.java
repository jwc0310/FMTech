public final class mkq
  extends qan<mkq>
{
  private static volatile mkq[] b;
  public mkn a = null;
  
  public mkq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mkq[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new mkq[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mkn localmkn = this.a;
      int j = qal.d(8);
      int k = localmkn.a();
      localmkn.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mkn localmkn = this.a;
      paramqal.c(10);
      if (localmkn.ak < 0) {
        localmkn.ak = localmkn.a();
      }
      paramqal.c(localmkn.ak);
      localmkn.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkq
 * JD-Core Version:    0.7.0.1
 */