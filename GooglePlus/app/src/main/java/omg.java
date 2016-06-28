public final class omg
  extends qan<omg>
{
  private static volatile omg[] a;
  private Integer b = null;
  
  public omg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static omg[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new omg[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      int j = this.b.intValue();
      int k = qal.d(8);
      if (j >= 0) {}
      for (int m = qal.d(j);; m = 10) {
        return i + (m + k);
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      int i = this.b.intValue();
      paramqal.c(8);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omg
 * JD-Core Version:    0.7.0.1
 */