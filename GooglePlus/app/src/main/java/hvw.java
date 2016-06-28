import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.List;

final class hvw
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  hvw(Context paramContext, Runnable paramRunnable) {}
  
  public final void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    if (!hvu.c(this.a.getApplicationContext())) {}
    synchronized (hvu.a)
    {
      boolean bool = hvu.a.contains(this);
      Runnable localRunnable = null;
      if (bool)
      {
        localRunnable = this.b;
        hvu.a.remove(this);
        paramSharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
      }
      if (localRunnable != null) {
        localRunnable.run();
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvw
 * JD-Core Version:    0.7.0.1
 */