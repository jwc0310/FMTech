import android.os.SystemClock;

final class hgo
  implements hgs
{
  public final long a()
  {
    return System.currentTimeMillis();
  }
  
  public final void a(long paramLong)
  {
    SystemClock.sleep(100L);
  }
  
  public final long b()
  {
    return SystemClock.elapsedRealtime();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hgo
 * JD-Core Version:    0.7.0.1
 */