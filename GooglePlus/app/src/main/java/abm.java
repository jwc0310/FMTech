final class abm
  implements Runnable
{
  abm(abk paramabk) {}
  
  public final void run()
  {
    abj localabj = this.a.h;
    abk localabk = this.a;
    if (localabj.n == localabk)
    {
      if (abj.i) {
        new StringBuilder().append(localabj).append(": Service connection died");
      }
      localabj.f();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abm
 * JD-Core Version:    0.7.0.1
 */