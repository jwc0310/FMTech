import android.os.SystemClock;

final class ecv
  implements Runnable
{
  ecv(ecu paramecu) {}
  
  public final void run()
  {
    this.a.a = false;
    long l = SystemClock.elapsedRealtime();
    boolean bool = this.a.a(l);
    this.a.a(bool);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ecv
 * JD-Core Version:    0.7.0.1
 */