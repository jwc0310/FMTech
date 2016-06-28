public final class mol
  extends qan<mol>
{
  private static volatile mol[] a;
  private mok b = null;
  private mok c = null;
  
  public mol()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mol[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mol[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      mok localmok2 = this.b;
      int m = qal.d(8);
      int n = localmok2.a();
      localmok2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      mok localmok1 = this.c;
      int j = qal.d(16);
      int k = localmok1.a();
      localmok1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      mok localmok2 = this.b;
      paramqal.c(10);
      if (localmok2.ak < 0) {
        localmok2.ak = localmok2.a();
      }
      paramqal.c(localmok2.ak);
      localmok2.a(paramqal);
    }
    if (this.c != null)
    {
      mok localmok1 = this.c;
      paramqal.c(18);
      if (localmok1.ak < 0) {
        localmok1.ak = localmok1.a();
      }
      paramqal.c(localmok1.ak);
      localmok1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mol
 * JD-Core Version:    0.7.0.1
 */