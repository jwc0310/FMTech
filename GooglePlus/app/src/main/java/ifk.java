import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;

public final class ifk
  implements ComponentCallbacks2
{
  private final Context a;
  
  ifk(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(int paramInt)
  {
    if (paramInt > 5) {
      ((ifj)mbb.a(this.a, ifj.class)).p();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ifk
 * JD-Core Version:    0.7.0.1
 */