import android.util.Log;

public final class iki
  implements ikh
{
  private long a;
  private ikf b;
  
  public final ikf a()
  {
    if (System.currentTimeMillis() > 10000L)
    {
      this.a = 0L;
      this.b = null;
    }
    if (Log.isLoggable("LocationSettingsCache", 4)) {
      new StringBuilder(45).append("Using cached location sharing settings: false");
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iki
 * JD-Core Version:    0.7.0.1
 */