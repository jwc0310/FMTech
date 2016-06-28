import android.os.SystemClock;

public final class ejs
  implements ejr
{
  private static ejs a;
  
  public static ejr c()
  {
    try
    {
      if (a == null) {
        a = new ejs();
      }
      ejs localejs = a;
      return localejs;
    }
    finally {}
  }
  
  public final long a()
  {
    return System.currentTimeMillis();
  }
  
  public final long b()
  {
    return SystemClock.elapsedRealtime();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ejs
 * JD-Core Version:    0.7.0.1
 */