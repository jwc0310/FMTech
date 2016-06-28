public final class odk
  extends qan<odk>
{
  private static volatile odk[] b;
  public oed a = null;
  
  public odk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static odk[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new odk[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oed localoed = this.a;
      int j = qal.d(8);
      int k = localoed.a();
      localoed.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oed localoed = this.a;
      paramqal.c(10);
      if (localoed.ak < 0) {
        localoed.ak = localoed.a();
      }
      paramqal.c(localoed.ak);
      localoed.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odk
 * JD-Core Version:    0.7.0.1
 */