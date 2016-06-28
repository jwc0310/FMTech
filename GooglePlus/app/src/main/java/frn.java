import java.util.concurrent.TimeUnit;

final class frn
  implements Runnable
{
  frn(frk paramfrk) {}
  
  public final void run()
  {
    frk localfrk = this.a;
    synchronized (localfrk.b)
    {
      if (localfrk.a)
      {
        edu localedu = localfrk.c;
        TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
        localedu.c.a(5000L, localTimeUnit);
        localfrk.b.d();
        localfrk.a = false;
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     frn
 * JD-Core Version:    0.7.0.1
 */