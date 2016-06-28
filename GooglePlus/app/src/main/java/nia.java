public final class nia
  extends qan<nia>
{
  private static volatile nia[] b;
  public onv a = null;
  
  public nia()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nia[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new nia[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      onv localonv = this.a;
      int j = qal.d(8);
      int k = localonv.a();
      localonv.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      onv localonv = this.a;
      paramqal.c(10);
      if (localonv.ak < 0) {
        localonv.ak = localonv.a();
      }
      paramqal.c(localonv.ak);
      localonv.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nia
 * JD-Core Version:    0.7.0.1
 */