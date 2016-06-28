public final class mjy
  extends qan<mjy>
{
  private static volatile mjy[] a;
  
  public mjy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mjy[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mjy[0];
      }
      return a;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mjy
 * JD-Core Version:    0.7.0.1
 */