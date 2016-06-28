final class eei
  implements Runnable
{
  eei(eeh parameeh) {}
  
  public final void run()
  {
    synchronized (eeh.a(this.a))
    {
      if ((eeh.b(this.a) <= eeh.c(this.a).b()) && (eeh.d(this.a) != null))
      {
        eeh.d(this.a).d();
        eeh.a(this.a, null);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eei
 * JD-Core Version:    0.7.0.1
 */