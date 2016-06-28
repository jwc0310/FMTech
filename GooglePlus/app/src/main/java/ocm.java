public final class ocm
  extends qan<ocm>
{
  private static volatile ocm[] a;
  
  public ocm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ocm[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new ocm[0];
      }
      return a;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ocm
 * JD-Core Version:    0.7.0.1
 */